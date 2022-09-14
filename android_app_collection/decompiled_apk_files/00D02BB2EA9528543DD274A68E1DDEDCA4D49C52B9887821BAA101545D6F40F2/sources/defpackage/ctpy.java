package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctpy  reason: default package */
/* loaded from: classes5.dex */
public final class ctpy extends ctrc {
    private final ConversationId a;
    private final ctqu b;

    public ctpy(ConversationId conversationId, ctqu ctquVar) {
        this.a = conversationId;
        this.b = ctquVar;
    }

    @Override // defpackage.ctrc
    public final ConversationId a() {
        return this.a;
    }

    @Override // defpackage.ctrc
    public final ctqu b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctrc) {
            ctrc ctrcVar = (ctrc) obj;
            if (this.a.equals(ctrcVar.a()) && this.b.equals(ctrcVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length());
        sb.append("SessionProfileUpdate{conversationId=");
        sb.append(valueOf);
        sb.append(", profileInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
