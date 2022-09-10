package com.google.android.apps.gmm.messaging.intent;

import android.app.IntentService;
import android.content.Intent;
import com.google.android.apps.gmm.messaging.intent.MessagingNotificationService;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.Notification;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MessagingNotificationService extends IntentService {
    public dxio<aqav> a;
    public dxio<ckcw> b;
    public dxio<auhi> c;
    public dxio<aqrr> d;
    public dxio<aqdj> e;
    public dxio<apyy> f;
    public dxio<btvo> g;
    public dxio<akfa> h;
    public bvjj i;
    public bvrb j;

    public MessagingNotificationService() {
        super(MessagingNotificationService.class.getSimpleName());
    }

    public final void a(ctyy ctyyVar, final ConversationId conversationId) {
        this.a.a().c().h(ctyyVar, conversationId);
        if (aqda.a(ctyyVar, this.h.a().j())) {
            this.e.a().a(ctyyVar);
        }
        this.a.a().e().b(ctyyVar, new dbsl(conversationId) { // from class: aqqx
            private final ConversationId a;

            {
                this.a = conversationId;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Notification notification = (Notification) obj;
                return (notification == null || notification.f() == null || !notification.f().a().equals(this.a)) ? false : true;
            }
        });
    }

    public final void b(Intent intent, ctyy ctyyVar, String str) {
        if (!this.g.a().getBusinessMessagingParameters().e) {
            String stringExtra = intent.getStringExtra("NotificationTagExtraKey");
            if (dbsj.d(stringExtra)) {
                return;
            }
            aqrr a = this.d.a();
            a.a.n(stringExtra, dpyv.BUSINESS_MESSAGE_FROM_MERCHANT.dm);
            a.a.n(stringExtra, dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER.dm);
            return;
        }
        bvqj.e(this.f.a().a(ctyyVar, (Notification) intent.getParcelableExtra("NotificationExtraKey"), str), new bvqg(this) { // from class: aqqy
            private final MessagingNotificationService a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                MessagingNotificationService messagingNotificationService = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar == null || !dbsgVar.a()) {
                    return;
                }
                messagingNotificationService.c.a().j((augj) dbsgVar.b());
            }
        }, dege.a);
    }

    public final void c() {
        ((ckcm) this.b.a().a(ckgs.v)).a(false);
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.b.a().f(ckhc.MESSAGING_NOTIFICATION_SERVICE);
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.a().g(ckhc.MESSAGING_NOTIFICATION_SERVICE);
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        if (intent != null && intent.getBooleanExtra("isInlineResponseIntent", false)) {
            ConversationId conversationId = (ConversationId) intent.getParcelableExtra("ConversationIdExtraKey");
            if (conversationId == null) {
                c();
            } else {
                deha.q(this.a.a().b().b(conversationId.a()), new aqqz(this, intent, conversationId), dege.a);
            }
        }
    }
}
