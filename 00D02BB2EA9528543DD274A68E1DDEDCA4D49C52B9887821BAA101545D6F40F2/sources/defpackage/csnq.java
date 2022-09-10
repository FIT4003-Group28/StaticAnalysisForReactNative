package defpackage;
/* compiled from: PG */
/* renamed from: csnq  reason: default package */
/* loaded from: classes5.dex */
final class csnq<V> extends csnx<V> {
    private final dcdc<csoa<V>> a;

    public csnq(dcdc<csoa<V>> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.csnx
    public final dcdc<csoa<V>> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof csnx)) {
            return false;
        }
        return dchl.m(this.a, ((csnx) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("LookupResult{values=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
