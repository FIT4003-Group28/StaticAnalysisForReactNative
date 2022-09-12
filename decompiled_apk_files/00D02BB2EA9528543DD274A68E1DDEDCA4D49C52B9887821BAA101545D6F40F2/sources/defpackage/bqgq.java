package defpackage;
/* compiled from: PG */
/* renamed from: bqgq  reason: default package */
/* loaded from: classes4.dex */
final class bqgq extends bqhg {
    private final dcdc<bqgw> a;
    private final bqhf b;
    private final bqhr c;
    private final int d;

    public bqgq(int i, dcdc<bqgw> dcdcVar, bqhf bqhfVar, bqhr bqhrVar) {
        this.d = i;
        this.a = dcdcVar;
        this.b = bqhfVar;
        this.c = bqhrVar;
    }

    @Override // defpackage.bqhg
    public final dcdc<bqgw> a() {
        return this.a;
    }

    @Override // defpackage.bqhg
    public final bqhf b() {
        return this.b;
    }

    @Override // defpackage.bqhg
    public final bqhr c() {
        return this.c;
    }

    @Override // defpackage.bqhg
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqhg)) {
            return false;
        }
        bqhg bqhgVar = (bqhg) obj;
        int i = this.d;
        int d = bqhgVar.d();
        if (i == 0) {
            throw null;
        }
        return i == d && dchl.m(this.a, bqhgVar.a()) && this.b.equals(bqhgVar.b()) && this.c.equals(bqhgVar.c());
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            int hashCode = (((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
            bqhr bqhrVar = this.c;
            int i2 = bqhrVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(bqhrVar).c(bqhrVar);
                bqhrVar.bC = i2;
            }
            return hashCode ^ i2;
        }
        throw null;
    }

    public final String toString() {
        int i = this.d;
        String valueOf = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 89 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("RmrMultiPolylineState{mode=");
        sb.append(valueOf);
        sb.append(", constructedModel=");
        sb.append(valueOf2);
        sb.append(", roadUnderConstructionState=");
        sb.append(valueOf3);
        sb.append(", nextRoadId=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
