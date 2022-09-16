package defpackage;

import com.google.android.apps.youtube.app.common.notification.FcmMessageListenerService;
import com.google.firebase.messaging.FirebaseMessagingService;
/* compiled from: PG */
/* renamed from: faf  reason: default package */
/* loaded from: classes3.dex */
public class faf extends FirebaseMessagingService implements axoo {
    private volatile axog a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.axoo
    /* renamed from: c */
    public final axog lH() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axog(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            FcmMessageListenerService fcmMessageListenerService = (FcmMessageListenerService) this;
            eap eapVar = (eap) lI();
            fcmMessageListenerService.a = (aadd) eapVar.a.K.get();
            fcmMessageListenerService.b = axot.a(eapVar.c);
            dyo dyoVar = eapVar.a;
            fcmMessageListenerService.c = dyoVar.hl;
            fcmMessageListenerService.d = dyoVar.lW;
        }
        super.onCreate();
    }
}
