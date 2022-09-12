package defpackage;
/* compiled from: PG */
/* renamed from: cqgw  reason: default package */
/* loaded from: classes.dex */
final class cqgw extends cqjd {
    private final int a;
    private final cqjg b;

    public cqgw(int i, @dzsi cqjg cqjgVar) {
        this.a = i;
        this.b = cqjgVar;
    }

    @Override // defpackage.cqjd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cqjd
    @dzsi
    public final cqjg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        cqjg cqjgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqjd) {
            cqjd cqjdVar = (cqjd) obj;
            if (this.a == cqjdVar.a() && ((cqjgVar = this.b) != null ? cqjgVar.equals(cqjdVar.b()) : cqjdVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        cqjg cqjgVar = this.b;
        return i ^ (cqjgVar == null ? 0 : cqjgVar.hashCode());
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Rule{verb=");
        sb.append(i);
        sb.append(", token=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
