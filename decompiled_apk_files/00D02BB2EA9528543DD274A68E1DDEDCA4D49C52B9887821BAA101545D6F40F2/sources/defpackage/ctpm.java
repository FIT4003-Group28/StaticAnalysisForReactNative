package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctpm  reason: default package */
/* loaded from: classes5.dex */
public final class ctpm extends ctqo {
    private final ConversationId a;
    private final long b;

    public ctpm(ConversationId conversationId, long j) {
        if (conversationId != null) {
            this.a = conversationId;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    @Override // defpackage.ctqo
    public final ConversationId a() {
        return this.a;
    }

    @Override // defpackage.ctqo
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctqo) {
            ctqo ctqoVar = (ctqo) obj;
            if (this.a.equals(ctqoVar.a()) && this.b == ctqoVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
        sb.append("DeleteConversation{conversationId=");
        sb.append(valueOf);
        sb.append(", deleteTimestampMicroSec=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
