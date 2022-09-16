package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uwz  reason: default package */
/* loaded from: classes4.dex */
public final class uwz implements uua, utz, uuh {
    private final Window.OnFrameMetricsAvailableListener a;
    private Activity b;
    private boolean c;
    private Handler d;

    public uwz(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        this.a = onFrameMetricsAvailableListener;
    }

    private final void e() {
        Activity activity = this.b;
        if (activity != null) {
            Window window = activity.getWindow();
            Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.a;
            if (this.d == null) {
                HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
                handlerThread.start();
                this.d = new Handler(handlerThread.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, this.d);
        }
    }

    private final void f() {
        amzy amzyVar;
        Activity activity = this.b;
        if (activity != null) {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
            } catch (RuntimeException e) {
                amzyVar = uxa.a;
                ((amzw) ((amzw) ((amzw) amzyVar.c()).h(e)).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl$OnResumedBasedActivityTracker", "detachFromCurrentActivity", (char) 134, "FrameMetricServiceImpl.java")).q("remove frame metrics listener failed");
            }
        }
    }

    @Override // defpackage.uua
    public void a(Activity activity) {
        synchronized (this) {
            this.b = activity;
            if (this.c) {
                e();
            }
        }
    }

    @Override // defpackage.utz
    public void b(Activity activity) {
        synchronized (this) {
            if (this.c) {
                f();
            }
            this.b = null;
        }
    }

    public void d() {
        synchronized (this) {
            this.c = false;
            f();
        }
    }

    public void c() {
        amzy amzyVar;
        synchronized (this) {
            this.c = true;
            if (this.b != null) {
                e();
            } else {
                amzyVar = uxa.a;
                ((amzw) ((amzw) amzyVar.c()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl$OnResumedBasedActivityTracker", "startCollecting", 166, "FrameMetricServiceImpl.java")).q("No activity");
            }
        }
    }
}
