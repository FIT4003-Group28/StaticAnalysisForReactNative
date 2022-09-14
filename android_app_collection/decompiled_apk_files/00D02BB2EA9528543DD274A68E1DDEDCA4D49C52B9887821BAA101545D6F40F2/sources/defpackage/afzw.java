package defpackage;
/* compiled from: PG */
/* renamed from: afzw  reason: default package */
/* loaded from: classes2.dex */
final class afzw extends afzy {
    private final dird a;
    private final btzr<dirb> b;
    private final long c;

    public afzw(dird dirdVar, btzr<dirb> btzrVar, long j) {
        if (dirdVar != null) {
            this.a = dirdVar;
            this.b = btzrVar;
            this.c = j;
            return;
        }
        throw new NullPointerException("Null response");
    }

    @Override // defpackage.afzy
    public final dird a() {
        return this.a;
    }

    @Override // defpackage.afzy
    public final btzr<dirb> b() {
        return this.b;
    }

    @Override // defpackage.afzy
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afzy) {
            afzy afzyVar = (afzy) obj;
            if (this.a.equals(afzyVar.a()) && this.b.equals(afzyVar.b()) && this.c == afzyVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dird dirdVar = this.a;
        int i = dirdVar.bC;
        if (i == 0) {
            i = dsst.a.b(dirdVar).c(dirdVar);
            dirdVar.bC = i;
        }
        int hashCode = this.b.hashCode();
        long j = this.c;
        return ((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        long j = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(valueOf2).length());
        sb.append("LocalStreamResult{response=");
        sb.append(valueOf);
        sb.append(", rpcContext=");
        sb.append(valueOf2);
        sb.append(", expirationTimeSec=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
