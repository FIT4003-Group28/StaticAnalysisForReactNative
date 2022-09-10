package com.google.android.apps.gmm.notification.log;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.notification.log.NotificationLoggingReceiver;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NotificationLoggingReceiver extends BroadcastReceiver {
    public bvrb a;
    public ckcw b;
    public gdo c;
    public bvrv d;
    public ausp e;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        this.c.b();
        this.b.f(ckhc.NOTIFICATION_LOGGING_SERVICE);
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.e.a(intent, new Runnable(this, goAsync) { // from class: ausj
            private final NotificationLoggingReceiver a;
            private final BroadcastReceiver.PendingResult b;

            {
                this.a = this;
                this.b = goAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final NotificationLoggingReceiver notificationLoggingReceiver = this.a;
                final BroadcastReceiver.PendingResult pendingResult = this.b;
                notificationLoggingReceiver.a.b(new Runnable(notificationLoggingReceiver, pendingResult) { // from class: ausk
                    private final NotificationLoggingReceiver a;
                    private final BroadcastReceiver.PendingResult b;

                    {
                        this.a = notificationLoggingReceiver;
                        this.b = pendingResult;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationLoggingReceiver notificationLoggingReceiver2 = this.a;
                        BroadcastReceiver.PendingResult pendingResult2 = this.b;
                        notificationLoggingReceiver2.b.g(ckhc.NOTIFICATION_LOGGING_SERVICE);
                        notificationLoggingReceiver2.c.e();
                        notificationLoggingReceiver2.d.a();
                        pendingResult2.finish();
                    }
                }, bvrj.UI_THREAD);
            }
        });
    }
}
