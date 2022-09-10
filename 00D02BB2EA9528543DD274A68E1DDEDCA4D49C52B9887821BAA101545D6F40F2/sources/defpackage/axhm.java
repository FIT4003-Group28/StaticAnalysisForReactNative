package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axhm  reason: default package */
/* loaded from: classes3.dex */
public final class axhm extends geb {
    public cqkj c;
    public axpu d;
    @dzsi
    public cqkf<axop> e = null;

    @Override // defpackage.ges
    public final void Nv() {
        ((axhn) btsx.b(axhn.class, this)).ct(this);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<axop> cqkfVar = this.e;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.e = null;
        }
        super.Qe();
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxy.y;
    }

    @Override // defpackage.geb
    protected final View q(Bundle bundle) {
        axpu axpuVar = this.d;
        String string = this.o.getString("obfuscatedGaiaId");
        dbsk.s(string);
        dfqc b = dfqc.b(this.o.getInt("followeeSource"));
        dqar dqarVar = (dqar) bvrs.h(this.o, "onboardingData", (dssr) dqar.d.cu(7), dqar.d, dsqa.c());
        Runnable runnable = new Runnable(this) { // from class: axhk
            private final axhm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                axhm axhmVar = this.a;
                gga ggaVar = axhmVar.aE;
                if (!axhmVar.aD || ggaVar == null) {
                    return;
                }
                ggaVar.g().f();
            }
        };
        dzsj<gga> dzsjVar = axpuVar.a;
        axhs a = axpuVar.b.a();
        axpu.a(a, 2);
        Executor a2 = axpuVar.c.a();
        axpu.a(a2, 3);
        cklf a3 = axpuVar.d.a();
        axpu.a(a3, 4);
        axpu.a(string, 5);
        axpu.a(b, 6);
        axpu.a(dqarVar, 7);
        axpu.a(runnable, 8);
        axpt axptVar = new axpt(dzsjVar, a, a2, a3, string, b, dqarVar, runnable);
        LinearLayout linearLayout = new LinearLayout(J());
        cqkf<axop> c = this.c.c(new axlk(), linearLayout);
        this.e = c;
        c.e(axptVar);
        return linearLayout;
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ExpandingScrollView expandingScrollView = ((geb) this).b;
        expandingScrollView.setViewHeaderHeightCallableForSizingCollapsedState(new Callable(this) { // from class: axhl
            private final axhm a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqkf<axop> cqkfVar = this.a.e;
                return Integer.valueOf(cqkfVar != null ? cqkfVar.c().getHeight() : 0);
            }
        });
        expandingScrollView.setExpandingStateTransition(jkc.o, jkc.o);
        expandingScrollView.setExpandingState(jjn.COLLAPSED, true);
    }
}
