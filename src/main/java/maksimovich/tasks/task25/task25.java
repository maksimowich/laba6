package maksimovich.tasks.task25;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.StringJoiner;

public class task25 {

    public static String genericDeclaration(Method m) {
        var sb = new StringBuilder();
        var modifiers = m.getModifiers();
        sb.append(Modifier.toString(modifiers));
        var types = m.getTypeParameters();
        var sj = new StringJoiner(",");
        sb.append(" <");
        for (var t : types) {
            sj.add(t.getName());
        }
        sb.append(sj.toString());
        sb.append("> ");
        var returnType = m.getGenericReturnType();
        sb.append(returnType.getTypeName()).append(" ");
        sb.append(m.getName());
        sb.append("(");
        sj = new StringJoiner(", ");
        var paramTypes = m.getGenericParameterTypes();
        for (var t : paramTypes) {
            sj.add(t.getTypeName());
        }
        sb.append(sj.toString());
        sb.append(")");
        return sb.toString();
    }
}
