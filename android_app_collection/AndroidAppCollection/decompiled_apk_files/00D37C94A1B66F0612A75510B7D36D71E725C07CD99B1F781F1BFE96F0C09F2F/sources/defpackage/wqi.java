package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY_LIGHTWEIGHT, b = apcd.SLOT_TYPE_IN_PLAYER, d = {xby.class})
/* renamed from: wqi  reason: default package */
/* loaded from: classes4.dex */
public final class wqi implements wqg {
    public final ankt a;
    private final wqf b;
    private final Executor c;
    private final xgp d;
    private final xdu e;
    private final xci f;
    private final xgt g;
    private boolean h;
    private aozt i;

    public wqi(wqf wqfVar, Executor executor, xgp xgpVar, xdu xduVar, xci xciVar) {
        wqfVar.getClass();
        this.b = wqfVar;
        executor.getClass();
        this.c = executor;
        this.d = xgpVar;
        this.e = xduVar;
        xciVar.getClass();
        this.f = xciVar;
        this.a = (ankt) xduVar.d(xby.class);
        this.g = xgu.a();
    }

    private final void g() {
        this.g.k();
        this.d.p(this.g.a());
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
        g();
    }

    public final void f(ankt anktVar) {
        aozt aoztVar;
        if (this.h) {
            return;
        }
        try {
            WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) anktVar.get();
            if (watchNextResponseModel == null) {
                return;
            }
            asgf asgfVar = watchNextResponseModel.a.f;
            if (asgfVar == null) {
                asgfVar = asgf.a;
            }
            if (asgfVar.b == 62960614) {
                asgf asgfVar2 = watchNextResponseModel.a.f;
                if (asgfVar2 == null) {
                    asgfVar2 = asgf.a;
                }
                if (asgfVar2.b == 62960614) {
                    aoztVar = (aozt) asgfVar2.c;
                } else {
                    aoztVar = aozt.a;
                }
            } else {
                aoztVar = null;
            }
            this.i = aoztVar;
            if (aoztVar == null) {
                return;
            }
            xgt xgtVar = this.g;
            boolean z = (aoztVar.b & 16384) != 0;
            xgv a = xgtVar.b().a();
            a.c(z);
            xgtVar.c = a.a();
            this.d.p(this.g.a());
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        xgt xgtVar = this.g;
        xhf a = xhg.a();
        a.b(true);
        xgtVar.b = a.a();
        wpu.a(this.g);
        this.d.p(this.g.a());
        if (this.a.isDone()) {
            f(this.a);
        } else {
            this.a.qY(new Runnable() { // from class: wqh
                @Override // java.lang.Runnable
                public final void run() {
                    wqi wqiVar = wqi.this;
                    wqiVar.f(wqiVar.a);
                }
            }, this.c);
        }
        this.b.a(this.e, this.f);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        this.h = true;
        g();
        this.b.d(this.e, this.f, i);
    }
}
