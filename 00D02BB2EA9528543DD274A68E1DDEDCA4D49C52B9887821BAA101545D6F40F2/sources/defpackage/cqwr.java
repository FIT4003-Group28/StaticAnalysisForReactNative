package defpackage;
/* compiled from: PG */
/* renamed from: cqwr  reason: default package */
/* loaded from: classes5.dex */
final class cqwr extends cqww {
    public final dsyf a;
    public final dsyj b;

    public cqwr(dsyf dsyfVar, dsyj dsyjVar) {
        if (dsyfVar != null) {
            this.a = dsyfVar;
            if (dsyjVar != null) {
                this.b = dsyjVar;
                return;
            }
            throw new NullPointerException("Null batchSyncResponse");
        }
        throw new NullPointerException("Null batchSyncRequest");
    }

    @Override // defpackage.cqww
    public final dsyf a() {
        return this.a;
    }

    @Override // defpackage.cqww
    public final dsyj b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqww) {
            cqww cqwwVar = (cqww) obj;
            if (this.a.equals(cqwwVar.a()) && this.b.equals(cqwwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dsyf dsyfVar = this.a;
        int i = dsyfVar.bC;
        if (i == 0) {
            i = dsst.a.b(dsyfVar).c(dsyfVar);
            dsyfVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        dsyj dsyjVar = this.b;
        int i3 = dsyjVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dsyjVar).c(dsyjVar);
            dsyjVar.bC = i3;
        }
        return i2 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
        sb.append("BatchSyncResult{batchSyncRequest=");
        sb.append(valueOf);
        sb.append(", batchSyncResponse=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
