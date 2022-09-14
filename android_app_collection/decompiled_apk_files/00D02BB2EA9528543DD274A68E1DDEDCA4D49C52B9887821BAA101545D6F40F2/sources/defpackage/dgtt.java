package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgtt  reason: default package */
/* loaded from: classes6.dex */
public final class dgtt implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final Type b;
    private final Type[] c;

    public dgtt(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            dgtr.a(z);
        }
        this.a = type == null ? null : dgtv.b(type);
        this.b = dgtv.b(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            dgtr.b(this.c[i]);
            dgtv.i(this.c[i]);
            Type[] typeArr3 = this.c;
            typeArr3[i] = dgtv.b(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && dgtv.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
        Type type = this.a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        int length = this.c.length;
        if (length == 0) {
            return dgtv.e(this.b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(dgtv.e(this.b));
        sb.append("<");
        sb.append(dgtv.e(this.c[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(dgtv.e(this.c[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
