package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_AD_INFO_OVERLAY, b = apcd.SLOT_TYPE_IN_PLAYER, d = {xby.class})
/* renamed from: wpz  reason: default package */
/* loaded from: classes4.dex */
public final class wpz implements wqg, xgo {
    public final ankt a;
    private final wqf b;
    private final xgp c;
    private final Executor d;
    private final xdu e;
    private final xci f;
    private final MediaAd g;
    private final xgt h;
    private aozt i;
    private boolean j;
    private final wmt k;

    public wpz(wqf wqfVar, xgp xgpVar, wmt wmtVar, Executor executor, xdu xduVar, xci xciVar) {
        MediaAd mediaAd;
        this.b = wqfVar;
        this.c = xgpVar;
        this.k = wmtVar;
        this.d = executor;
        this.e = xduVar;
        this.f = xciVar;
        if (xduVar.e(xbo.class)) {
            mediaAd = (MediaAd) xduVar.d(xbo.class);
        } else {
            mediaAd = (MediaAd) xduVar.d(xbh.class);
        }
        this.g = mediaAd;
        this.a = (ankt) xduVar.d(xby.class);
        this.h = xgu.a();
    }

    private final void h() {
        xgt xgtVar = this.h;
        xgv a = xgtVar.b().a();
        a.c(true);
        a.d(-2);
        xgtVar.c = a.a();
        vyp.d(this.h, true);
        wpu.a(this.h);
        this.c.p(this.h.a());
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.xgo
    public final void c(Bundle bundle) {
        aozt aoztVar;
        xfk a = this.c.a();
        if (a == null) {
            return;
        }
        apzg E = this.g.E();
        if (E == null && (aoztVar = this.i) != null && (E = aoztVar.i) == null) {
            E = apzg.a;
        }
        if (E == null) {
            return;
        }
        afw afwVar = new afw(2);
        if (bundle != null) {
            afwVar.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
        }
        afwVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a);
        this.k.c(E, afwVar);
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void e() {
    }

    public final void f(ankt anktVar) {
        if (this.j) {
            return;
        }
        try {
            WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) anktVar.get();
            if (watchNextResponseModel == null) {
                this.b.c(this.e, this.f, new wuo("WatchNext response is null"));
                return;
            }
            asgf asgfVar = watchNextResponseModel.a.f;
            if (asgfVar == null) {
                asgfVar = asgf.a;
            }
            if (asgfVar.b != 62960614) {
                return;
            }
            aozt aoztVar = (aozt) asgfVar.c;
            this.i = aoztVar;
            if ((aoztVar.b & 16384) == 0) {
                return;
            }
            h();
        } catch (InterruptedException | ExecutionException e) {
            wwf.b(this.e, this.f, e.toString());
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void i(xgb xgbVar) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void q(int i, int i2) {
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        try {
            this.c.c(this);
            if (this.g.E() != null) {
                h();
            } else if (this.a.isDone()) {
                f(this.a);
            } else {
                this.a.qY(new Runnable() { // from class: wpy
                    @Override // java.lang.Runnable
                    public final void run() {
                        wpz wpzVar = wpz.this;
                        wpzVar.f(wpzVar.a);
                    }
                }, this.d);
            }
            this.b.a(this.e, this.f);
        } catch (wlb e) {
            this.b.c(this.e, this.f, new wuo(e.getMessage()));
        }
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        this.j = true;
        this.h.k();
        this.c.p(this.h.a());
        this.c.l(this);
        this.b.d(this.e, this.f, i);
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void u(boolean z) {
    }
}
