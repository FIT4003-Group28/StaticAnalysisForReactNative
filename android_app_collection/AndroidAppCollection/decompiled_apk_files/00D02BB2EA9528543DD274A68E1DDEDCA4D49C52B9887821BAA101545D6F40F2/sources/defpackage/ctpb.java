package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctpb  reason: default package */
/* loaded from: classes5.dex */
public final class ctpb extends ctoj {
    private final ConversationId a;
    private final ctqq b;

    public ctpb(ConversationId conversationId, ctqq ctqqVar) {
        this.a = conversationId;
        this.b = ctqqVar;
    }

    @Override // defpackage.ctoj
    public final ConversationId a() {
        return this.a;
    }

    @Override // defpackage.ctoj
    public final ctqq b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctoj) {
            ctoj ctojVar = (ctoj) obj;
            if (this.a.equals(ctojVar.a()) && this.b.equals(ctojVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("AddKickGroupUsers{conversationId=");
        sb.append(valueOf);
        sb.append(", groupInfoChanges=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
