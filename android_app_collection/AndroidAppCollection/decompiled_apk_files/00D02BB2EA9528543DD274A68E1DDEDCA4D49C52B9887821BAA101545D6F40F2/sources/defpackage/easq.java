package defpackage;
/* compiled from: PG */
/* renamed from: easq  reason: default package */
/* loaded from: classes6.dex */
public abstract class easq {
    public abstract eaon a();

    public abstract eapt b();

    public abstract int c();

    public final eaop d() {
        return a().a();
    }

    public final String e() {
        return a().J(b(), c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof easq)) {
            return false;
        }
        easq easqVar = (easq) obj;
        return c() == easqVar.c() && d() == easqVar.d() && easy.g(b().j(), easqVar.b().j());
    }

    public final int f() {
        return a().C(b());
    }

    public final int hashCode() {
        return ((((c() + 247) * 13) + d().hashCode()) * 13) + b().j().hashCode();
    }

    public final String toString() {
        String b = a().b();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 10);
        sb.append("Property[");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
