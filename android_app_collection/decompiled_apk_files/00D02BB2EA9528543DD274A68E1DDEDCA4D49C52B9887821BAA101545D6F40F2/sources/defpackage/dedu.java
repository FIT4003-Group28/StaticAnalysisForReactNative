package defpackage;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dedu  reason: default package */
/* loaded from: classes6.dex */
public final class dedu implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final dcdc<Type> b;
    private final Class<?> c;

    public dedu(Type type, Class<?> cls, Type[] typeArr) {
        dbsk.s(cls);
        dbsk.a(typeArr.length == cls.getTypeParameters().length);
        dedy.f(typeArr, "type parameter");
        this.a = type;
        this.c = cls;
        this.b = deds.e.c(typeArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.c.equals(parameterizedType.getRawType()) && dbsd.a(this.a, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return dedy.e(this.b);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.c;
    }

    public final int hashCode() {
        Type type = this.a;
        return ((type == null ? 0 : type.hashCode()) ^ this.b.hashCode()) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a != null && deds.e.ordinal() != 3) {
            sb.append(deds.e.d(this.a));
            sb.append('.');
        }
        sb.append(this.c.getName());
        sb.append('<');
        sb.append(dedy.b.g(dcft.o(this.b, dedy.a)));
        sb.append('>');
        return sb.toString();
    }
}
