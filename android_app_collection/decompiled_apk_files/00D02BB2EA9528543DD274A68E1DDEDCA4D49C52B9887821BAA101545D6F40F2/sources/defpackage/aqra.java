package defpackage;

import com.google.android.apps.gmm.messaging.intent.MessagingNotificationService;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: aqra  reason: default package */
/* loaded from: classes2.dex */
final class aqra implements degu<Void> {
    final /* synthetic */ ctyy a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ MessagingNotificationService c;

    public aqra(MessagingNotificationService messagingNotificationService, ctyy ctyyVar, ConversationId conversationId) {
        this.c = messagingNotificationService;
        this.a = ctyyVar;
        this.b = conversationId;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.a(this.a, this.b);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r3) {
        this.c.a(this.a, this.b);
    }
}
