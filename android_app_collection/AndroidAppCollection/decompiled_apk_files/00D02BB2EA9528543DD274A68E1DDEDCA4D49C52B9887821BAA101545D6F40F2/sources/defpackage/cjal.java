package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cjal  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjal extends geb {
    @dzsi
    public cpv ad;
    @dzsi
    public Context ae;
    @dzsi
    public cqkf<cjar> af;
    @dzsi
    private cjar aj;
    @dzsi
    public cqkj c;
    @dzsi
    public Handler d;
    @dzsi
    public cezv e;
    @dzsi
    public cjay g;
    public dbsg<dlno> ag = dbpy.a;
    protected dbsg<ckcn> ah = dbpy.a;
    protected dbsg<ckcn> ai = dbpy.a;
    private final Runnable ak = new cjaj(this);

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<cjar> cqkfVar = this.af;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacks(this.ak);
        }
    }

    protected abstract void bn();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dddi bo(dspd dspdVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract List<cfgf> bp(dlno dlnoVar, dspd dspdVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void bq(dspd dspdVar);

    public final void br() {
        cjar cjarVar = this.aj;
        dbsk.s(cjarVar);
        cjarVar.d();
        cpv cpvVar = this.ad;
        dbsk.s(cpvVar);
        Context context = this.ae;
        dbsk.s(context);
        if (!cpvVar.d(context)) {
            Handler handler = this.d;
            dbsk.s(handler);
            handler.postDelayed(this.ak, 3000L);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        dlno dlnoVar;
        super.l(bundle);
        cjay cjayVar = this.g;
        dbsk.s(cjayVar);
        cjaf cjafVar = new cjaf(this);
        cjag cjagVar = new cjag(this);
        cjah cjahVar = new cjah(this);
        CharSequence w = w();
        cqhn a = cjayVar.a.a();
        cjay.a(a, 1);
        Resources a2 = cjayVar.b.a();
        cjay.a(a2, 2);
        cfig a3 = cjayVar.c.a();
        cjay.a(a3, 3);
        cjay.a(cjafVar, 4);
        cjay.a(cjagVar, 5);
        cjay.a(cjahVar, 6);
        cjay.a(w, 7);
        this.aj = new cjax(a, a2, a3, cjafVar, cjagVar, cjahVar, w);
        if (bundle != null) {
            dlnoVar = (dlno) dsuv.c(bundle, "QUESTIONS_KEY", dlno.f, dsqa.c());
        } else {
            dlnoVar = dlno.f;
        }
        if (!dbsd.a(dlnoVar, dlno.f)) {
            this.ag = dbsg.i(dlnoVar);
        } else {
            bn();
        }
    }

    @Override // defpackage.geb
    protected final View q(Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(J());
        cqkj cqkjVar = this.c;
        dbsk.s(cqkjVar);
        cqkf<cjar> c = cqkjVar.c(new cjaq(), linearLayout);
        this.af = c;
        c.e(this.aj);
        return linearLayout;
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ExpandingScrollView expandingScrollView = ((geb) this).b;
        expandingScrollView.setViewHeaderHeightCallableForSizingCollapsedState(new Callable(this) { // from class: cjai
            private final cjal a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqkf<cjar> cqkfVar = this.a.af;
                dbsk.s(cqkfVar);
                return Integer.valueOf(cqkfVar.c().getHeight());
            }
        });
        expandingScrollView.setExpandingStateTransition(jkc.o, jkc.o);
        expandingScrollView.setExpandingState(jjn.COLLAPSED, true);
        expandingScrollView.setAccessibilityDelegate(new cjak());
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (this.ag.a()) {
            dsuv.d(bundle, "QUESTIONS_KEY", this.ag.b());
        }
    }

    protected abstract CharSequence w();
}
