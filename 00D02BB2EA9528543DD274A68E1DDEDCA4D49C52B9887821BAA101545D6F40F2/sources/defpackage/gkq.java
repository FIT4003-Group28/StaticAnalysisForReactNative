package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.gmm.base.layout.MainLayout;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: gkq  reason: default package */
/* loaded from: classes.dex */
public final class gkq implements View.OnAttachStateChangeListener, gli {
    public final btrm a;
    public final MainLayout b;
    public final cjqy c;
    public final cjtd d;
    public final cjtd e;
    final egc f;
    public WeakReference<egu> h;
    public boolean i;
    private final alhv k;
    final Handler j = new gkn(this, Looper.getMainLooper());
    private final gkp l = new gkp(this);
    private final alht m = new gko(this);
    public boolean g = false;

    public gkq(MainLayout mainLayout, btrm btrmVar, cjqy cjqyVar, alhv alhvVar, egc egcVar) {
        this.b = mainLayout;
        this.a = btrmVar;
        this.c = cjqyVar;
        this.f = egcVar;
        this.k = alhvVar;
        cjta b = cjtd.b();
        b.d = dtyi.O;
        ddnb bZ = ddnd.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddnd ddndVar = (ddnd) bZ.b;
        ddndVar.b = 1;
        ddndVar.a |= 1;
        b.q(bZ.bK());
        this.d = b.a();
        cjta b2 = cjtd.b();
        b2.d = dtyi.O;
        ddnb bZ2 = ddnd.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddnd ddndVar2 = (ddnd) bZ2.b;
        ddndVar2.b = 2;
        ddndVar2.a |= 1;
        b2.q(bZ2.bK());
        this.e = b2.a();
        mainLayout.addOnAttachStateChangeListener(this);
    }

    private final void i(boolean z, @dzsi Runnable runnable) {
        if (this.i) {
            return;
        }
        if (!j() && !this.g) {
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        final boolean z2 = this.g;
        if (z == (!z2)) {
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        this.g = !z;
        Runnable runnable2 = new Runnable(this, z2) { // from class: gkl
            private final gkq a;
            private final boolean b;

            {
                this.a = this;
                this.b = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gkq gkqVar = this.a;
                boolean z3 = this.b;
                gkqVar.g = z3;
                gkqVar.a.b(gdv.b(!z3));
            }
        };
        egc g = g();
        WeakReference<egu> weakReference = this.h;
        g.a(weakReference == null ? null : weakReference.get(), z, runnable, runnable2);
        this.a.b(gdv.b(z));
    }

    private final boolean j() {
        WeakReference<egu> weakReference = this.h;
        return weakReference == null || weakReference.get() == null || (!this.h.get().b() && this.h.get().d().x);
    }

    @Override // defpackage.gli
    public final boolean a() {
        WeakReference<egu> weakReference = this.h;
        return (weakReference == null || weakReference.get() == null || !this.h.get().d().A) ? false : true;
    }

    @Override // defpackage.gli
    public final boolean b() {
        return this.g;
    }

    @Override // defpackage.gli
    public final void c() {
        d(null);
    }

    @Override // defpackage.gli
    public final void d(@dzsi Runnable runnable) {
        f();
        if (this.g) {
            i(true, runnable);
        } else if (runnable == null) {
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.g || cpv.a.e(this.b.getContext())) {
            return;
        }
        i(false, null);
    }

    public final void f() {
        WeakReference<egu> weakReference;
        this.j.removeMessages(0);
        if (!j() || (weakReference = this.h) == null || weakReference.get() == null) {
            return;
        }
        long j = this.h.get().d().G;
        if (j == 0) {
            return;
        }
        Handler handler = this.j;
        handler.sendMessageDelayed(handler.obtainMessage(0), j);
    }

    public final egc g() {
        egc egcVar = h() ? this.h.get().d().z : null;
        return egcVar == null ? this.f : egcVar;
    }

    @Override // defpackage.gli
    public final boolean h() {
        WeakReference<egu> weakReference = this.h;
        return (weakReference == null || weakReference.get() == null || this.h.get().d().z == null) ? false : true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        btrm btrmVar = this.a;
        gkp gkpVar = this.l;
        dceq a = dcet.a();
        a.b(ege.class, new gkr(ege.class, gkpVar, bvrj.UI_THREAD));
        btrmVar.g(gkpVar, a.a());
        alhv alhvVar = this.k;
        if (alhvVar.b != null) {
            return;
        }
        alhvVar.d(this.m);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a(this.l);
        this.k.e();
    }
}
