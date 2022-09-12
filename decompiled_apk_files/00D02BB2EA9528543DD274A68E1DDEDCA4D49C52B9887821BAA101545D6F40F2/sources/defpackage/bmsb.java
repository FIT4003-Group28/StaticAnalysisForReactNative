package defpackage;
/* compiled from: PG */
/* renamed from: bmsb  reason: default package */
/* loaded from: classes3.dex */
final class bmsb extends bmsm {
    private final btlu a;
    private final dehn<bmsl> b;

    public bmsb(btlu btluVar, dehn<bmsl> dehnVar) {
        if (btluVar != null) {
            this.a = btluVar;
            if (dehnVar != null) {
                this.b = dehnVar;
                return;
            }
            throw new NullPointerException("Null correctionStatusFuture");
        }
        throw new NullPointerException("Null gmmAccount");
    }

    @Override // defpackage.bmsm
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.bmsm
    public final dehn<bmsl> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmsm) {
            bmsm bmsmVar = (bmsm) obj;
            if (this.a.equals(bmsmVar.a()) && this.b.equals(bmsmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("EditStatus{gmmAccount=");
        sb.append(valueOf);
        sb.append(", correctionStatusFuture=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
