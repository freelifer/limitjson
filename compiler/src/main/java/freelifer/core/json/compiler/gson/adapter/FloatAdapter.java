package freelifer.core.json.compiler.gson.adapter;

/**
 * @author zhukun on 2020-06-14.
 */
public class FloatAdapter implements Adapter {
    @Override
    public boolean isType(String type) {
        return "float".equals(type);
    }


    @Override
    public GsonCodeParameter transform(String input) {
        return GsonCodeParameter.createBasicType("(float) " + input + ".nextDouble()");
    }
}
