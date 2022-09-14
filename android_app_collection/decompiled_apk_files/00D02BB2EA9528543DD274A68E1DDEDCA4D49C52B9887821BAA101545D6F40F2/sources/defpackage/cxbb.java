package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cxbb  reason: default package */
/* loaded from: classes5.dex */
final class cxbb implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ cxbc a;
    private View b;

    public cxbb(cxbc cxbcVar, View view) {
        this.a = cxbcVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        try {
            if (this.b != null) {
                cxbc cxbcVar = this.a;
                cxbcVar.a.unregisterActivityLifecycleCallbacks(cxbcVar);
                this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                czhz.e(new Runnable(this) { // from class: cxba
                    private final cxbb a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cxbb cxbbVar = this.a;
                        if (cxbbVar.a.b.f == 0) {
                            cxbbVar.a.b.f = SystemClock.elapsedRealtime();
                            cxbbVar.a.b.i.d = true;
                        }
                    }
                });
            }
            return true;
        } catch (RuntimeException unused) {
            return true;
        } finally {
            this.b = null;
        }
    }
}
