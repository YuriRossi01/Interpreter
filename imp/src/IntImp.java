import value.*;

import java.util.ArrayList;

public class IntImp extends ImpBaseVisitor<Value> {

    private final Conf conf;

    public IntImp(Conf conf) {
        this.conf = conf;
    }

    private ComValue visitCom(ImpParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    private ExpValue<?> visitExp(ImpParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private int visitNatExp(ImpParser.ExpContext ctx) {
        try {
            return ((NatValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Natural expression expected.");
            System.exit(1);
        }

        return 0; // unreachable code
    }

    private boolean visitBoolExp(ImpParser.ExpContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Boolean expression expected.");
            System.exit(1);
        }

        return false; // unreachable code
    }

    private String visitStringExp(ImpParser.ExpContext ctx) {
        try {
            return ((StringValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Natural expression expected.");
            System.exit(1);
        }
        return null;
    }

    @Override
    public Value visitTostr(ImpParser.TostrContext ctx) {
        return new StringValue(visitExp(ctx.exp()).toString());
    }

    @Override
    public Value visitString(ImpParser.StringContext ctx) {
        return new StringValue( formatString(( ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1) ) ) );
    }
    private static String formatString(String inputString) {
        StringBuilder outputStringBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar == '\\') {
                if (i + 1 < inputString.length()) {
                    char nextChar = inputString.charAt(i + 1);
                    switch (nextChar) {
                        case 'n':
                            outputStringBuilder.append('\n');
                            break;
                        case 't':
                            outputStringBuilder.append('\t');
                            break;
                        case '"':
                            outputStringBuilder.append('"');
                            break;
                        case '\'':
                            outputStringBuilder.append('\'');
                            break;
                        case '\\':
                            outputStringBuilder.append('\\');
                            break;
                        default:
                            // Stampa il carattere di escape e il carattere successivo letteralmente
                            outputStringBuilder.append('\\').append(nextChar);
                    }
                    i++;
                }else {outputStringBuilder.append('\\');}
            }else{ outputStringBuilder.append(currentChar);}
        }
        return outputStringBuilder.toString();
    }

    @Override
    public Value visitArrayAssign(ImpParser.ArrayAssignContext ctx) {
        String id = ctx.ID().getText();

        if(conf.get(id) == null || !(conf.get(id) instanceof ArrayValue))
            conf.update(id, new ArrayValue(new ArrayList<>()));

        ((ArrayValue) conf.get(id)).setValue(visitNatExp(ctx.exp(0)), visitExp(ctx.exp(1)));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitAccess(ImpParser.AccessContext ctx) {
        String id = ctx.ID().getText();
        int index = visitNatExp(ctx.exp());
        if (conf.get(id)== null){
            System.err.println("Array: " + id + " usato ma non assegnato!");
        }
        if (!(conf.get(id) instanceof ArrayValue)){
            System.err.println("Variabile: '" + id +  "' non è un arrray");
        }
        if(((ArrayValue)conf.get(id)).get(index) == null){
            System.err.println("Elemento:  '" + id + "[" +index+ "]" + "' usato ma non assegnato!");
        }
        return ((ArrayValue) conf.get(id)).get(index);
    }

    @Override
    public ComValue visitProg(ImpParser.ProgContext ctx) {
        return visitCom(ctx.com());
    }

    @Override
    public ComValue visitIf(ImpParser.IfContext ctx) {
        return visitBoolExp(ctx.exp())
                ? visitCom(ctx.com(0))
                : visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitAssign(ImpParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        conf.update(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(ImpParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSeq(ImpParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        return visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitWhile(ImpParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        visitCom(ctx.com());

        return visitWhile(ctx);
    }

    @Override
    public ComValue visitOut(ImpParser.OutContext ctx) {
        System.out.println(visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }


    @Override
    public NatValue visitNat(ImpParser.NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BoolValue visitBool(ImpParser.BoolContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public ExpValue<?> visitParExp(ImpParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public NatValue visitPow(ImpParser.PowContext ctx) {
        int base = visitNatExp(ctx.exp(0));
        int exp = visitNatExp(ctx.exp(1));

        return new NatValue((int) Math.pow(base, exp));
    }

    @Override
    public BoolValue visitNot(ImpParser.NotContext ctx) {
        return new BoolValue(!visitBoolExp(ctx.exp()));
    }

    @Override
    public NatValue visitDivMulMod(ImpParser.DivMulModContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.DIV -> new NatValue(left / right);
            case ImpParser.MUL -> new NatValue(left * right);
            case ImpParser.MOD -> new NatValue(left % right);
            default -> null;
        };
    }

    @Override
    public NatValue visitPlusMinus(ImpParser.PlusMinusContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.PLUS -> new NatValue(left + right);
            case ImpParser.MINUS -> new NatValue(Math.max(left - right, 0));
            default -> null;
        };
    }

    @Override
    public BoolValue visitEqExp(ImpParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.EQQ -> new BoolValue(left.equals(right));
            case ImpParser.NEQ -> new BoolValue(!left.equals(right));
            default -> null; // unreachable code
        };
    }

    @Override
    public ExpValue<?> visitId(ImpParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if (!conf.contains(id)) {
            System.err.println("Variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        return conf.get(id);
    }

    @Override
    public BoolValue visitCmpExp(ImpParser.CmpExpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.GEQ -> new BoolValue(left >= right);
            case ImpParser.LEQ -> new BoolValue(left <= right);
            case ImpParser.LT  -> new BoolValue(left < right);
            case ImpParser.GT  -> new BoolValue(left > right);
            default -> null;
        };
    }

    @Override
    public ExpValue<?> visitLogicExp(ImpParser.LogicExpContext ctx) {
        if(ctx.op.getType() == ImpParser.CONCAT)
            return new StringValue(visitStringExp(ctx.exp(0)) + visitStringExp(ctx.exp(1))); ;
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.AND -> new BoolValue(left && right);
            case ImpParser.OR -> new BoolValue(left || right);
            default -> null;
        };
    }
}
