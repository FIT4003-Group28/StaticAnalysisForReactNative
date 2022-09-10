package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        bbz.f("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bbz.e().a(new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                bdn g = bdn.g(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                synchronized (bdn.j) {
                    g.h = goAsync;
                    if (g.g) {
                        g.h.finish();
                        g.h = null;
                    }
                }
                return;
            } catch (IllegalStateException e) {
                bbz.e().b(e);
                return;
            }
        }
        context.startService(bdw.f(context));
    }
}
