package defpackage;
/* compiled from: PG */
/* renamed from: bvyd  reason: default package */
/* loaded from: classes4.dex */
final class bvyd extends bvyr {
    public final deig<dmcj> a;
    private final bvwp b;
    private final ddyq c;

    public bvyd(deig<dmcj> deigVar, bvwp bvwpVar, ddyq ddyqVar) {
        this.a = deigVar;
        this.b = bvwpVar;
        if (ddyqVar != null) {
            this.c = ddyqVar;
            return;
        }
        throw new NullPointerException("Null gmmClearcutCountersDimensions");
    }

    @Override // defpackage.bvyr
    public final deig<dmcj> a() {
        return this.a;
    }

    @Override // defpackage.bvyr
    public final bvwp b() {
        return this.b;
    }

    @Override // defpackage.bvyr
    public final ddyq c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvyr) {
            bvyr bvyrVar = (bvyr) obj;
            if (this.a.equals(bvyrVar.a()) && this.b.equals(bvyrVar.b()) && this.c.equals(bvyrVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        ddyq ddyqVar = this.c;
        int i = ddyqVar.bC;
        if (i == 0) {
            i = dsst.a.b(ddyqVar).c(ddyqVar);
            ddyqVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 97 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PendingClientRequest{clientResponseFuture=");
        sb.append(valueOf);
        sb.append(", pendingRequestTimer=");
        sb.append(valueOf2);
        sb.append(", gmmClearcutCountersDimensions=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
