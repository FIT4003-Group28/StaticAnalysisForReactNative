package defpackage;

import com.google.android.libraries.messaging.lighter.model.AutoValue_ConversationId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctyl  reason: default package */
/* loaded from: classes5.dex */
public final class ctyl extends cufq {
    private ContactId a;
    private ConversationId.OneOfId b;

    @Override // defpackage.cufq
    public final void b(ConversationId.OneOfId oneOfId) {
        this.b = oneOfId;
    }

    @Override // defpackage.cufq
    public final void c(ContactId contactId) {
        if (contactId != null) {
            this.a = contactId;
            return;
        }
        throw new NullPointerException("Null owner");
    }

    @Override // defpackage.cufq
    public final ConversationId a() {
        String str = this.a == null ? " owner" : "";
        if (this.b == null) {
            str = str.concat(" oneOfId");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_ConversationId(this.a, this.b);
    }
}
