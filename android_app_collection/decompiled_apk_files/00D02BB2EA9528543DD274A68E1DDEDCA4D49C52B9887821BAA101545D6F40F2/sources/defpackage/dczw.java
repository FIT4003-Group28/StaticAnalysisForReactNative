package defpackage;
/* compiled from: PG */
/* renamed from: dczw  reason: default package */
/* loaded from: classes5.dex */
public final class dczw<T> implements dzsj<T> {
    @dzsi
    public final T a;

    public dczw(@dzsi T t) {
        this.a = t;
    }

    @Override // defpackage.dzsj
    @dzsi
    public final T a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dczw) {
            dczw dczwVar = (dczw) obj;
            T t = this.a;
            if (t != null) {
                return t.equals(dczwVar.a);
            }
            return dczwVar.a == null;
        }
        return false;
    }

    public final int hashCode() {
        T t = this.a;
        if (t == null) {
            return 37;
        }
        return t.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Providers.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
