package defpackage;
/* compiled from: PG */
/* renamed from: btdb  reason: default package */
/* loaded from: classes4.dex */
final class btdb extends btdr {
    private final dcdc<btdc> b;

    public btdb(dcdc<btdc> dcdcVar) {
        this.b = dcdcVar;
    }

    @Override // defpackage.btdr, defpackage.btdn
    /* renamed from: a */
    public dcdc<btdc> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btdr)) {
            return false;
        }
        return dchl.m(this.b, ((btdr) obj).a());
    }

    public int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("MiscRipplesViewModelImpl{rippleViewModels=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
