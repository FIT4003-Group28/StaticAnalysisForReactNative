package defpackage;
/* compiled from: PG */
/* renamed from: chzc  reason: default package */
/* loaded from: classes4.dex */
final class chzc extends chzf {
    private final acl a;
    private final acl b;
    private final chza c;

    public chzc(acl aclVar, acl aclVar2, chza chzaVar) {
        if (aclVar != null) {
            this.a = aclVar;
            if (aclVar2 != null) {
                this.b = aclVar2;
                this.c = chzaVar;
                return;
            }
            throw new NullPointerException("Null newViewHolder");
        }
        throw new NullPointerException("Null oldViewHolder");
    }

    @Override // defpackage.chzf
    public final acl a() {
        return this.a;
    }

    @Override // defpackage.chzf
    public final acl b() {
        return this.b;
    }

    @Override // defpackage.chzf
    public final chza c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chzf) {
            chzf chzfVar = (chzf) obj;
            if (this.a.equals(chzfVar.a()) && this.b.equals(chzfVar.b()) && this.c.equals(chzfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 59 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChangeInfo{oldViewHolder=");
        sb.append(valueOf);
        sb.append(", newViewHolder=");
        sb.append(valueOf2);
        sb.append(", animatorHolder=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
