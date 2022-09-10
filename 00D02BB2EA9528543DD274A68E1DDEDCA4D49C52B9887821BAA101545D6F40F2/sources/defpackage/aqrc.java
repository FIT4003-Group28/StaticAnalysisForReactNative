package defpackage;

import android.content.Intent;
import com.google.android.apps.gmm.messaging.intent.MessagingNotificationService;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: aqrc  reason: default package */
/* loaded from: classes2.dex */
final class aqrc implements degu<Void> {
    final /* synthetic */ Intent a;
    final /* synthetic */ ctyy b;
    final /* synthetic */ String c;
    final /* synthetic */ ConversationId d;
    final /* synthetic */ MessagingNotificationService e;

    public aqrc(MessagingNotificationService messagingNotificationService, Intent intent, ctyy ctyyVar, String str, ConversationId conversationId) {
        this.e = messagingNotificationService;
        this.a = intent;
        this.b = ctyyVar;
        this.c = str;
        this.d = conversationId;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.e.b(this.a, this.b, this.c);
        this.e.c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r4) {
        this.e.b(this.a, this.b, this.c);
        if (this.d.c().equals(ConversationId.IdType.ONE_TO_ONE)) {
            bvrb bvrbVar = this.e.j;
            final ctyy ctyyVar = this.b;
            bvrbVar.b(new Runnable(this, ctyyVar) { // from class: aqrb
                private final aqrc a;
                private final ctyy b;

                {
                    this.a = this;
                    this.b = ctyyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aqrc aqrcVar = this.a;
                    ctyy ctyyVar2 = this.b;
                    MessagingNotificationService messagingNotificationService = aqrcVar.e;
                    dbsg<String> a = ctyyVar2.b().a();
                    if (a.a()) {
                        for (btlu btluVar : messagingNotificationService.h.a().t()) {
                            if (btluVar.s().name.equals(a.b())) {
                                messagingNotificationService.i.T(bvjk.iy, btluVar, true);
                                return;
                            }
                        }
                    }
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
        ((ckcm) this.e.b.a().a(ckgs.v)).a(true);
    }
}
