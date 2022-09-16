package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: ampr  reason: default package */
/* loaded from: classes.dex */
public final class ampr implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;

    protected ampr(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static ampr a(Object obj, Object obj2) {
        return new ampr(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ampr) {
            ampr amprVar = (ampr) obj;
            if (akzj.f(this.a, amprVar.a) && akzj.f(this.b, amprVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append("(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
