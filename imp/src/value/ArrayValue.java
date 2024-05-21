package value;
import java.util.List;

public class ArrayValue extends ExpValue<List<ExpValue<?>>> {

    public ArrayValue(List<ExpValue<?>> value) {
        super(value);
    }

    public ExpValue<?> get(int index) {
        return toJavaValue().get(index);
    }

    public void setValue(int index, ExpValue<?> value) {
        if ( index >= toJavaValue().size() )
            for ( int i = toJavaValue().size(); i <= index; ++i)
                toJavaValue().add(null);
        toJavaValue().set(index, value);
    }
}
