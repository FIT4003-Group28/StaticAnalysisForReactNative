package defpackage;
/* compiled from: PG */
/* renamed from: cuxk  reason: default package */
/* loaded from: classes5.dex */
public final class cuxk extends cuzq {
    private final dbsg<cufj> a;
    private final dbsg<CharSequence> b;

    public cuxk(dbsg<cufj> dbsgVar, dbsg<CharSequence> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.cuzq
    public final dbsg<cufj> a() {
        return this.a;
    }

    @Override // defpackage.cuzq
    public final dbsg<CharSequence> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuzq) {
            cuzq cuzqVar = (cuzq) obj;
            if (this.a.equals(cuzqVar.a()) && this.b.equals(cuzqVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84 + String.valueOf(valueOf2).length());
        sb.append("ConversationPresenterOptions{otherParticipant=");
        sb.append(valueOf);
        sb.append(", deleteLocalConversationDescription=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
