package defpackage;
/* compiled from: PG */
/* renamed from: avkj  reason: default package */
/* loaded from: classes3.dex */
class avkj extends avkr {
    public final avky a;

    public avkj(avky avkyVar) {
        if (avkyVar != null) {
            this.a = avkyVar;
            return;
        }
        throw new NullPointerException("Null regionsStateProto");
    }

    @Override // defpackage.avkr
    public final avky a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof avkr)) {
            return false;
        }
        return this.a.equals(((avkr) obj).a());
    }

    public final int hashCode() {
        avky avkyVar = this.a;
        int i = avkyVar.bC;
        if (i == 0) {
            i = dsst.a.b(avkyVar).c(avkyVar);
            avkyVar.bC = i;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("OfflineRegionsState{regionsStateProto=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
