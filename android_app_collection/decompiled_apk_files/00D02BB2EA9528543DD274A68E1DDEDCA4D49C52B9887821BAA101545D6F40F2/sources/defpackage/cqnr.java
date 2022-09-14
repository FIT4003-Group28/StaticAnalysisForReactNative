package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqnr  reason: default package */
/* loaded from: classes.dex */
public final class cqnr<T, V> implements cqnx<T, V> {
    static final cqnr<?, ?> a = new cqnr<>();
    public cqnr<Object, T> b;
    private Method c;
    @dzsi
    private Object[] d;
    @dzsi
    private int[] e;

    private cqnr() {
    }

    public cqnr(Method method, Object[] objArr, Map<Object, cqnq<?>> map) {
        this.c = method;
        this.d = objArr;
        int[] iArr = null;
        if (objArr != null && !map.isEmpty()) {
            Class<?>[] parameterTypes = this.c.getParameterTypes();
            int[] iArr2 = new int[this.d.length];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.d;
                if (i >= objArr2.length) {
                    break;
                }
                iArr2[i] = -1;
                cqnq<?> cqnqVar = map.get(objArr2[i]);
                if (cqnqVar != null) {
                    dbsk.k(parameterTypes[i].isAssignableFrom(cqnqVar.a), "Can't use argument place holder of type <%s> for the (%s)-th argument of method <%s>.", cqnqVar.a, Integer.valueOf(i), this.c);
                    dbsk.l(!cqnqVar.c);
                    cqnqVar.c = true;
                    iArr2[i] = 0;
                }
                i++;
            }
            iArr = iArr2;
        }
        this.e = iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cqnx
    public final V a(T t, Object... objArr) {
        if (this == a) {
            return t;
        }
        T a2 = this.b.a(t, objArr);
        try {
            Object[] objArr2 = this.d;
            int[] iArr = this.e;
            dbsk.b(true, "This method expected argument substitutions, but was not provided with any.");
            if (objArr2 != null && iArr != null) {
                int length = objArr2.length;
                Object[] objArr3 = new Object[length];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    objArr3[i] = i2 == -1 ? objArr2[i] : objArr[i2];
                }
                objArr2 = objArr3;
            }
            return (V) this.c.invoke(a2, objArr2);
        } catch (InvocationTargetException e) {
            throw new cqlz(e, (cqnx<?, ?>) this);
        } catch (Exception e2) {
            throw new cqlz(e2, this);
        }
    }

    public final String toString() {
        if (this == a) {
            return "";
        }
        StringBuilder sb = new StringBuilder(this.b.toString());
        if (sb.length() != 0) {
            sb.append(".");
        }
        sb.append(this.c.getDeclaringClass().getName());
        sb.append(".");
        sb.append(this.c.getName());
        sb.append("(");
        int i = 0;
        while (true) {
            Object[] objArr = this.d;
            if (objArr == null || i >= objArr.length) {
                break;
            }
            if (i > 0) {
                sb.append(", ");
            }
            int[] iArr = this.e;
            if (iArr == null || iArr[i] == -1) {
                sb.append(this.d[i]);
            } else {
                sb.append("arg<");
                sb.append(this.e[i]);
                sb.append(">");
            }
            i++;
        }
        sb.append(")");
        return sb.toString();
    }
}
