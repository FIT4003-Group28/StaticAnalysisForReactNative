package defpackage;
/* compiled from: PG */
/* renamed from: ajsp  reason: default package */
/* loaded from: classes2.dex */
final class ajsp extends ajtf {
    private final btlu a;
    private final long b;
    private final dqzv c;
    private final dqzv d;

    public ajsp(btlu btluVar, long j, dqzv dqzvVar, @dzsi dqzv dqzvVar2) {
        if (btluVar != null) {
            this.a = btluVar;
            this.b = j;
            this.c = dqzvVar;
            this.d = dqzvVar2;
            return;
        }
        throw new NullPointerException("Null account");
    }

    @Override // defpackage.ajtf
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.ajtf
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ajtf
    public final dqzv c() {
        return this.c;
    }

    @Override // defpackage.ajtf
    @dzsi
    public final dqzv d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        dqzv dqzvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajtf) {
            ajtf ajtfVar = (ajtf) obj;
            if (this.a.equals(ajtfVar.a()) && this.b == ajtfVar.b() && this.c.equals(ajtfVar.c()) && ((dqzvVar = this.d) != null ? dqzvVar.equals(ajtfVar.d()) : ajtfVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode();
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        dqzv dqzvVar = this.c;
        int i3 = dqzvVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dqzvVar).c(dqzvVar);
            dqzvVar.bC = i3;
        }
        int i4 = (i2 ^ i3) * 1000003;
        dqzv dqzvVar2 = this.d;
        if (dqzvVar2 == null) {
            i = 0;
        } else {
            int i5 = dqzvVar2.bC;
            if (i5 == 0) {
                i5 = dsst.a.b(dqzvVar2).c(dqzvVar2);
                dqzvVar2.bC = i5;
            }
            i = i5;
        }
        return i4 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 92 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("HistoricalRecord{account=");
        sb.append(valueOf);
        sb.append(", completionTime=");
        sb.append(j);
        sb.append(", requestedAcl=");
        sb.append(valueOf2);
        sb.append(", receivedAcl=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
