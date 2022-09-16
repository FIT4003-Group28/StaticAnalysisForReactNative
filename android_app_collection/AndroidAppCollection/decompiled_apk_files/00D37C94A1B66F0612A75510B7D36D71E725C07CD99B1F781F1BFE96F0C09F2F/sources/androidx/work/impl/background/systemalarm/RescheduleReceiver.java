package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* compiled from: PG */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = bqf.b("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bqf a2 = bqf.a();
        String.format("Received intent %s", intent);
        a2.d(new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                brq h = brq.h(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                synchronized (brq.a) {
                    h.i = goAsync;
                    if (h.h) {
                        h.i.finish();
                        h.i = null;
                    }
                }
                return;
            } catch (IllegalStateException e) {
                bqf.a();
                bqf.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                return;
            }
        }
        context.startService(brz.e(context));
    }
}
