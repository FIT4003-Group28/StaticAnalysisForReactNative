package defpackage;
/* compiled from: PG */
/* renamed from: ctyq  reason: default package */
/* loaded from: classes5.dex */
class ctyq extends cuhv {
    public final dcdc<cuhg> a;

    public ctyq(dcdc<cuhg> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null lines");
    }

    @Override // defpackage.cuhv
    public final dcdc<cuhg> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cuhv)) {
            return false;
        }
        return dchl.m(this.a, ((cuhv) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("RichText{lines=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
