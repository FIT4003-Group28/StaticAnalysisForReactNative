package defpackage;
/* compiled from: PG */
/* renamed from: bqgs  reason: default package */
/* loaded from: classes4.dex */
final class bqgs extends bqhf {
    private final int a;
    private final bqgw b;
    private final int c;

    public bqgs(int i, int i2, bqgw bqgwVar) {
        this.a = i;
        this.c = i2;
        this.b = bqgwVar;
    }

    @Override // defpackage.bqhf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bqhf
    public final bqgw b() {
        return this.b;
    }

    @Override // defpackage.bqhf
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqhf) {
            bqhf bqhfVar = (bqhf) obj;
            if (this.a == bqhfVar.a()) {
                int i = this.c;
                int c = bqhfVar.c();
                if (i == 0) {
                    throw null;
                }
                if (i == c && this.b.equals(bqhfVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        int i2 = this.c;
        if (i2 != 0) {
            return ((i ^ i2) * 1000003) ^ this.b.hashCode();
        }
        throw null;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.c;
        String valueOf = String.valueOf(i2 != 0 ? Integer.toString(i2 - 1) : "null");
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 85 + String.valueOf(valueOf2).length());
        sb.append("RoadUnderConstructionState{selectedPointIndex=");
        sb.append(i);
        sb.append(", constructionMode=");
        sb.append(valueOf);
        sb.append(", model=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
