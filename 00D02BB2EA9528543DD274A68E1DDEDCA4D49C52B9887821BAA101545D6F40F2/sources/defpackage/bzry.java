package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.ugc.clientnotification.phototaken.NotificationIntentProxyReceiver;
/* compiled from: PG */
/* renamed from: bzry  reason: default package */
/* loaded from: classes4.dex */
public final class bzry implements Runnable {
    final /* synthetic */ BroadcastReceiver.PendingResult a;
    final /* synthetic */ Context b;
    final /* synthetic */ Intent c;
    final /* synthetic */ NotificationIntentProxyReceiver d;

    public bzry(NotificationIntentProxyReceiver notificationIntentProxyReceiver, BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
        this.d = notificationIntentProxyReceiver;
        this.a = pendingResult;
        this.b = context;
        this.c = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NotificationIntentProxyReceiver notificationIntentProxyReceiver = this.d;
        BroadcastReceiver.PendingResult pendingResult = this.a;
        Context context = this.b;
        Intent intent = this.c;
        notificationIntentProxyReceiver.d.f(ckhc.PHOTO_TAKEN_NOTIFICATION_PROXY_RECEIVER);
        notificationIntentProxyReceiver.b.a();
        Intent intent2 = !intent.hasExtra("INTENT") ? null : (Intent) intent.getParcelableExtra("INTENT");
        if (intent2 != null) {
            intent2.addFlags(268435456);
            cjqg.j(intent, intent2);
            if (intent.getBooleanExtra("FOR_BROADCAST", false)) {
                context.sendBroadcast(intent2);
            } else {
                context.startActivity(intent2);
            }
        }
        notificationIntentProxyReceiver.b.b();
        notificationIntentProxyReceiver.d.g(ckhc.PHOTO_TAKEN_NOTIFICATION_PROXY_RECEIVER);
        pendingResult.finish();
    }
}
