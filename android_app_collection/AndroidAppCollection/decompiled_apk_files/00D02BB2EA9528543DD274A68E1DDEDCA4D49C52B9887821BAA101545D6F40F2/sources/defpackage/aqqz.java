package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gmm.messaging.intent.MessagingNotificationService;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: aqqz  reason: default package */
/* loaded from: classes2.dex */
public final class aqqz implements degu<dbsg<ctyy>> {
    final /* synthetic */ Intent a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ MessagingNotificationService c;

    public aqqz(MessagingNotificationService messagingNotificationService, Intent intent, ConversationId conversationId) {
        this.c = messagingNotificationService;
        this.a = intent;
        this.b = conversationId;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dbsg<ctyy> dbsgVar) {
        dbsg<ctyy> dbsgVar2 = dbsgVar;
        if (dbsgVar2 == null || !dbsgVar2.a()) {
            this.c.c();
            return;
        }
        MessagingNotificationService messagingNotificationService = this.c;
        Intent intent = this.a;
        ConversationId conversationId = this.b;
        ctyy b = dbsgVar2.b();
        csuk c = messagingNotificationService.a.a().c();
        ctct ctctVar = (ctct) c;
        deha.q(ctctVar.K(b).d(), new aqra(messagingNotificationService, b, conversationId), dege.a);
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent == null) {
            messagingNotificationService.c();
            return;
        }
        String string = resultsFromIntent.getString("messagingInlineResponseInputKey");
        if (dbsj.d(string)) {
            messagingNotificationService.c();
        } else {
            deha.q(c.f(b, ctctVar.j(conversationId, cuas.a(string), string, dbsg.i(string), dbpy.a, dcmn.a), 3), new aqrc(messagingNotificationService, intent, b, string, conversationId), dege.a);
        }
    }
}
