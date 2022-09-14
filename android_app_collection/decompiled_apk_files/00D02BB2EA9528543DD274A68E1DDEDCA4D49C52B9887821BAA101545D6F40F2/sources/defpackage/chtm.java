package defpackage;
/* compiled from: PG */
/* renamed from: chtm  reason: default package */
/* loaded from: classes4.dex */
public final class chtm extends chtq {
    private final drrx a;
    private final dcep<chxj> b;
    private final boolean c;

    public chtm(drrx drrxVar, dcep<chxj> dcepVar, boolean z) {
        if (drrxVar != null) {
            this.a = drrxVar;
            if (dcepVar != null) {
                this.b = dcepVar;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null getAcceptedTaskTypes");
        }
        throw new NullPointerException("Null todolistMode");
    }

    @Override // defpackage.chtq
    public final drrx a() {
        return this.a;
    }

    @Override // defpackage.chtq
    public final dcep<chxj> b() {
        return this.b;
    }

    @Override // defpackage.chtq
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chtq) {
            chtq chtqVar = (chtq) obj;
            if (this.a.equals(chtqVar.a()) && this.b.equals(chtqVar.b()) && this.c == chtqVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68 + String.valueOf(valueOf2).length());
        sb.append("Mode{todolistMode=");
        sb.append(valueOf);
        sb.append(", getAcceptedTaskTypes=");
        sb.append(valueOf2);
        sb.append(", supportUgcTaskSets=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
