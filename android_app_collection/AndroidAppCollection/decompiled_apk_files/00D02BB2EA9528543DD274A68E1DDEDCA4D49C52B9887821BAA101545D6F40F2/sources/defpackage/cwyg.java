package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwyg  reason: default package */
/* loaded from: classes5.dex */
public class cwyg implements cwqt, cwqs {
    private final cwyh a;
    private final Window.OnFrameMetricsAvailableListener b;
    private final boolean c;
    @dzsi
    private Activity d;
    private boolean e;
    @dzsi
    private HandlerThread f;
    @dzsi
    private Handler g;

    public cwyg(cwyh cwyhVar, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, boolean z) {
        this.a = cwyhVar;
        this.b = onFrameMetricsAvailableListener;
        this.c = z;
        this.e = z;
    }

    private Handler f() {
        if (this.g == null) {
            HandlerThread handlerThread = new HandlerThread("Primes-Jank");
            this.f = handlerThread;
            handlerThread.start();
            this.g = new Handler(this.f.getLooper());
        }
        return this.g;
    }

    private void g() {
        Activity activity = this.d;
        if (activity != null) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.b, f());
        }
    }

    private void h() {
        Activity activity = this.d;
        if (activity != null) {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.b);
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // defpackage.cwqs
    public void a(Activity activity) {
        dehn m;
        synchronized (this) {
            if (this.e) {
                h();
            }
            this.d = null;
        }
        if (this.c) {
            m = ((cwye) this.a).a.m(cwyi.d(activity), true, null);
            cwtl.a(m);
        }
    }

    @Override // defpackage.cwqt
    public void b(Activity activity) {
        if (this.c) {
            ((cwye) this.a).a.l(cwyi.d(activity));
        }
        synchronized (this) {
            this.d = activity;
            if (this.e) {
                g();
            }
        }
    }

    public void c() {
        synchronized (this) {
            this.e = true;
            if (this.d != null) {
                g();
            }
        }
    }

    public void d() {
        synchronized (this) {
            this.e = false;
            h();
        }
    }

    public void e() {
        synchronized (this) {
            d();
            HandlerThread handlerThread = this.f;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.f = null;
                this.g = null;
            }
        }
    }
}
