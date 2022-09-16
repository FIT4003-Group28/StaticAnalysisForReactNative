package defpackage;
/* compiled from: PG */
/* renamed from: chzd  reason: default package */
/* loaded from: classes4.dex */
final class chzd extends chzg {
    private final acl a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public chzd(acl aclVar, int i, int i2, int i3, int i4) {
        if (aclVar != null) {
            this.a = aclVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            return;
        }
        throw new NullPointerException("Null viewHolder");
    }

    @Override // defpackage.chzg
    public final acl a() {
        return this.a;
    }

    @Override // defpackage.chzg
    public final int b() {
        return this.b;
    }

    @Override // defpackage.chzg
    public final int c() {
        return this.c;
    }

    @Override // defpackage.chzg
    public final int d() {
        return this.d;
    }

    @Override // defpackage.chzg
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chzg) {
            chzg chzgVar = (chzg) obj;
            if (this.a.equals(chzgVar.a()) && this.b == chzgVar.b() && this.c == chzgVar.c() && this.d == chzgVar.d() && this.e == chzgVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93);
        sb.append("MoveInfo{viewHolder=");
        sb.append(valueOf);
        sb.append(", fromX=");
        sb.append(i);
        sb.append(", fromY=");
        sb.append(i2);
        sb.append(", toX=");
        sb.append(i3);
        sb.append(", toY=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
