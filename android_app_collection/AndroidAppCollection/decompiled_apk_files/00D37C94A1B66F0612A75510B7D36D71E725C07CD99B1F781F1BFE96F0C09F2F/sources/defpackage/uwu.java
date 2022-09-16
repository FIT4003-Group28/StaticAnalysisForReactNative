package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uwu  reason: default package */
/* loaded from: classes4.dex */
public final class uwu implements uua, utz {
    private static final amzy a = amzy.l("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor");
    private final axnm b;
    private boolean c = false;
    private Activity d;

    public uwu(axnm axnmVar, final azqb azqbVar, final ampq ampqVar, Executor executor) {
        this.b = axnmVar;
        executor.execute(new Runnable() { // from class: uwt
            @Override // java.lang.Runnable
            public final void run() {
                uwu.this.c(azqbVar, ampqVar);
            }
        });
    }

    @Override // defpackage.uua
    public synchronized void a(Activity activity) {
        this.d = activity;
        if (this.c) {
            ((uxa) this.b.get()).f(activity);
        }
    }

    @Override // defpackage.utz
    public synchronized void b(Activity activity) {
        if (!activity.equals(this.d)) {
            ((amzw) ((amzw) a.g()).i("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 90, "ActivityLevelJankMonitor.java")).u("Activity mismatch (currentActivity=%s, activity=%s)", this.d, activity);
        }
        if (this.c) {
            ((uxa) this.b.get()).c(activity);
        }
        this.d = null;
    }

    public /* synthetic */ void c(azqb azqbVar, ampq ampqVar) {
        if (((Boolean) azqbVar.get()).booleanValue()) {
            synchronized (this) {
                this.c = true;
                Activity activity = this.d;
                if (activity != null) {
                    a(activity);
                }
            }
        }
    }
}
