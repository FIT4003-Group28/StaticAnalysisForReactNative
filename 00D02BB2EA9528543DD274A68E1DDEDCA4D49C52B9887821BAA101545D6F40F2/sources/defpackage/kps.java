package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: kps  reason: default package */
/* loaded from: classes7.dex */
public final class kps extends ckrc {
    private final Runnable c;
    private final Runnable d;
    private final Runnable e;
    private final Runnable f;
    private final afwo g;
    private final bvjj h;
    private final kcw i;
    private final Future<lzf> j;
    private final Callable<Boolean> k;

    public kps(ckra ckraVar, dxio<cref> dxioVar, crem cremVar, ckrh ckrhVar, bvjj bvjjVar, Runnable runnable, Runnable runnable2, afwo afwoVar, kcw kcwVar, Future<lzf> future, Callable<Boolean> callable, Runnable runnable3, Runnable runnable4) {
        super(ckraVar, dxioVar, cremVar, ckrhVar);
        this.c = runnable;
        this.d = runnable2;
        this.e = runnable3;
        this.f = runnable4;
        dbsk.s(afwoVar);
        this.g = afwoVar;
        dbsk.s(bvjjVar);
        this.h = bvjjVar;
        dbsk.s(kcwVar);
        this.i = kcwVar;
        dbsk.s(future);
        this.j = future;
        this.k = callable;
    }

    @Override // defpackage.ckrc
    public final void a(boolean z) {
        if (this.g.c(afwm.SATELLITE, z) == z) {
            this.h.S(bvjk.gk, z);
        }
    }

    @Override // defpackage.ckrc
    public final int b(boolean z) {
        if (this.g.c(afwm.TRAFFIC, z) != z) {
            if (z) {
                return -1;
            }
            r(2);
            return -1;
        }
        this.h.S(bvjk.gj, z);
        if (z) {
            return R.string.DA_SPEECH_SHOW_TRAFFIC_CONFIRMATION;
        }
        r(1);
        return R.string.DA_SPEECH_HIDE_TRAFFIC_CONFIRMATION;
    }

    @Override // defpackage.ckrc
    public final int c() {
        lkf lkfVar = this.i.c;
        if (lkfVar != null) {
            lkfVar.a();
            this.b.j(1);
            return R.string.DA_SPEECH_ROUTE_OVERVIEW_CONFIRMATION;
        }
        this.b.j(2);
        return -1;
    }

    @Override // defpackage.ckrc
    public final void d() {
        this.c.run();
    }

    @Override // defpackage.ckrc
    public final int e() {
        if (!this.j.isDone()) {
            this.b.l(2);
            return -1;
        } else if (!((lzf) deha.s(this.j)).e()) {
            this.b.l(3);
            return -1;
        } else {
            ((lzf) deha.s(this.j)).b();
            if (this.a.b()) {
                this.b.l(4);
                return R.string.DA_SPEECH_EXIT_NAVIGATION_CONFIRMATION;
            }
            this.b.l(1);
            return R.string.DA_SPEECH_EXIT_NAVIGATION_CONFIRMATION;
        }
    }

    @Override // defpackage.ckrc
    public final void f() {
    }

    @Override // defpackage.ckrc
    public final int g() {
        return -1;
    }

    @Override // defpackage.ckrc
    public final int h() {
        try {
            if (this.k.call().booleanValue()) {
                this.b.t(1);
                return R.string.DA_SPEECH_CLEAR_SEARCH_RESULTS_RESPONSE;
            }
            this.b.t(2);
            return R.string.DA_SPEECH_SEARCH_RESULTS_ALREADY_CLEARED_RESPONSE;
        } catch (Exception unused) {
            this.b.t(2);
            return -1;
        }
    }

    @Override // defpackage.ckrc
    public final int i() {
        k();
        return R.string.DA_SPEECH_MY_LOCATION_CONFIRMATION;
    }

    @Override // defpackage.ckrc
    public final int j() {
        return -1;
    }

    @Override // defpackage.ckrc
    public final void k() {
        this.i.a();
    }

    @Override // defpackage.ckrc
    public final void l() {
        this.d.run();
    }

    @Override // defpackage.ckrc
    public final void m() {
        this.e.run();
    }

    @Override // defpackage.ckrc
    public final void n() {
        this.f.run();
    }

    @Override // defpackage.ckrc
    protected final int o(afia afiaVar) {
        return -1;
    }
}
