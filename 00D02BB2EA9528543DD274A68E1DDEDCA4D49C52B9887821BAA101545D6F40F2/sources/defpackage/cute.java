package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cute  reason: default package */
/* loaded from: classes5.dex */
public final class cute extends cusz {
    public static final cutf b(ConversationId conversationId) {
        if (conversationId.c() == ConversationId.IdType.GROUP) {
            return cutd.a(conversationId.d());
        }
        return cutd.b(conversationId.e());
    }

    @Override // defpackage.cusz, defpackage.dbrn
    public final /* bridge */ /* synthetic */ cutf a(ConversationId conversationId) {
        return b(conversationId);
    }
}
