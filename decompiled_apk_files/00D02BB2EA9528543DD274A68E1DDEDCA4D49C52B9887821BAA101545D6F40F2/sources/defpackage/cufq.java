package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cufq  reason: default package */
/* loaded from: classes5.dex */
public abstract class cufq {
    public abstract ConversationId a();

    public abstract void b(ConversationId.OneOfId oneOfId);

    public abstract void c(ContactId contactId);

    public final void d(ConversationId.GroupId groupId) {
        b(cual.a(groupId));
    }

    public final void e(ContactId contactId) {
        b(cual.b(contactId));
    }
}
