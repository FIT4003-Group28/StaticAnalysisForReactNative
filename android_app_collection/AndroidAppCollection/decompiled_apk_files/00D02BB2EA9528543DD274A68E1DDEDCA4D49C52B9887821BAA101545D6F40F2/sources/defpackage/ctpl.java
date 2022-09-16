package defpackage;
/* compiled from: PG */
/* renamed from: ctpl  reason: default package */
/* loaded from: classes5.dex */
public final class ctpl extends ctqn {
    private final cufp a;
    private final dbsg<ctqq> b;

    public ctpl(cufp cufpVar, dbsg<ctqq> dbsgVar) {
        this.a = cufpVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.ctqn
    public final cufp a() {
        return this.a;
    }

    @Override // defpackage.ctqn
    public final dbsg<ctqq> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctqn) {
            ctqn ctqnVar = (ctqn) obj;
            if (this.a.equals(ctqnVar.a()) && this.b.equals(ctqnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
        sb.append("CreateGroup{conversation=");
        sb.append(valueOf);
        sb.append(", groupInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
