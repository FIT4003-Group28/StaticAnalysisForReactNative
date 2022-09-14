package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ahtn  reason: default package */
/* loaded from: classes.dex */
public final class ahtn implements ahtf {
    private static final dcqe f = dcqe.c("ahtn");
    public final cqat a;
    public final ahtg b;
    public final ahjq c;
    private final Context g;
    private final btrm h;
    private final axru j;
    private final bvrb k;
    private final Handler i = new Handler(Looper.getMainLooper());
    public final AtomicReference<ahtm> d = new AtomicReference<>(ahtm.INITIAL);
    public final AtomicBoolean e = new AtomicBoolean(false);
    private long l = 30000;
    private final Runnable m = new ahtj(this);
    private final Runnable n = new ahtk(this);
    private final Runnable o = new ahtl(this);

    public ahtn(ahtg ahtgVar, Application application, cqat cqatVar, btrm btrmVar, ahjq ahjqVar, axru axruVar, bvrb bvrbVar) {
        dbsk.s(cqatVar);
        this.a = cqatVar;
        dbsk.s(application);
        this.g = application;
        dbsk.s(btrmVar);
        this.h = btrmVar;
        dbsk.s(ahtgVar);
        this.b = ahtgVar;
        dbsk.s(ahjqVar);
        this.c = ahjqVar;
        dbsk.s(axruVar);
        this.j = axruVar;
        dbsk.s(bvrbVar);
        this.k = bvrbVar;
    }

    private final boolean f() {
        try {
            return Settings.Secure.getInt(this.g.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.ahtf
    public final void a() {
        dbsk.l(this.d.compareAndSet(ahtm.INITIAL, ahtm.SUBSCRIBED));
        if (bvrj.UI_THREAD.b()) {
            d();
        } else {
            this.k.c(this.o, bvrj.UI_THREAD);
        }
    }

    @Override // defpackage.ahtf
    public final void b(long j) {
        if (this.d.get() != ahtm.INITIAL) {
            bvoo.h("Timeout can only be set before calling locate.", new Object[0]);
        } else {
            this.l = j;
        }
    }

    @Override // defpackage.ahtf
    public final void c() {
        if (!this.d.compareAndSet(ahtm.SUBSCRIBED, ahtm.FINISHED)) {
            return;
        }
        e();
    }

    public final void d() {
        bvrj.UI_THREAD.c();
        if (!this.j.a("android.permission.ACCESS_COARSE_LOCATION") || !f()) {
            this.b.a();
            this.d.set(ahtm.FINISHED);
            return;
        }
        this.c.k();
        btrm btrmVar = this.h;
        dceq a = dcet.a();
        a.b(amqo.class, new ahtp(amqo.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        if (this.d.get() == ahtm.FINISHED) {
            return;
        }
        this.i.postDelayed(this.m, this.l);
        this.b.b();
    }

    public final void e() {
        this.i.removeCallbacks(this.m);
        this.h.a(this);
        if (bvrj.UI_THREAD.b()) {
            this.c.l();
        } else {
            this.k.b(this.n, bvrj.UI_THREAD);
        }
    }
}
