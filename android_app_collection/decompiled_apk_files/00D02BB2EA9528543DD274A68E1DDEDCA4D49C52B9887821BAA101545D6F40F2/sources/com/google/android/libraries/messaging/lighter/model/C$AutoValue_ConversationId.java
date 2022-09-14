package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.messaging.lighter.model.$AutoValue_ConversationId  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ConversationId extends ConversationId {
    public final ContactId a;
    public final ConversationId.OneOfId b;

    public C$AutoValue_ConversationId(ContactId contactId, ConversationId.OneOfId oneOfId) {
        if (contactId != null) {
            this.a = contactId;
            if (oneOfId != null) {
                this.b = oneOfId;
                return;
            }
            throw new NullPointerException("Null oneOfId");
        }
        throw new NullPointerException("Null owner");
    }

    @Override // com.google.android.libraries.messaging.lighter.model.ConversationId
    public final ContactId a() {
        return this.a;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.ConversationId
    public final ConversationId.OneOfId b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationId) {
            ConversationId conversationId = (ConversationId) obj;
            if (this.a.equals(conversationId.a()) && this.b.equals(conversationId.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("ConversationId{owner=");
        sb.append(valueOf);
        sb.append(", oneOfId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
