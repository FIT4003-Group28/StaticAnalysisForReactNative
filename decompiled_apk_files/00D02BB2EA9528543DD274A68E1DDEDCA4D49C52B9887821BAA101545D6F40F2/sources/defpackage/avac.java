package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: avac  reason: default package */
/* loaded from: classes.dex */
public final class avac extends geb {
    public bvjj ad;
    public cjqy ae;
    public ckcw af;
    public cztz ag;
    public auom ah;
    public ausy ai;
    auzv aj;
    private final Callable<Integer> ak = new auzy(this);
    public aujb c;
    public boolean d;
    public cqkj e;
    public auhi g;

    public static void bn(bvjj bvjjVar, aujb aujbVar, int i) {
        bvjjVar.W(aujbVar.h().a, bvjjVar.s(aujbVar.h().a, 0) + i);
    }

    @Deprecated
    public static void bp(gga ggaVar, @dzsi Integer num, bvjj bvjjVar, bvrb bvrbVar, auhi auhiVar) {
        if (num == null || !auhiVar.k(num, false)) {
            return;
        }
        avac avacVar = new avac();
        Bundle bundle = new Bundle();
        bundle.putInt("NOTIFICATION_TYPE_EXTRA", num.intValue());
        avacVar.B(bundle);
        bvrbVar.b(new auzx(ggaVar, avacVar, bvjjVar, auhiVar, num), bvrj.UI_THREAD);
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((avad) btsx.b(avad.class, this)).cp(this);
    }

    @Override // defpackage.gen
    protected final boolean aV() {
        return false;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        w();
        return false;
    }

    @Override // defpackage.geb
    protected final View.OnClickListener g() {
        return new avaa(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        int i = this.o.getInt("NOTIFICATION_TYPE_EXTRA");
        this.c = this.g.h(i);
        boolean z = false;
        if (this.ah.b && this.ai.a(i)) {
            z = true;
        }
        this.d = z;
        this.aj = new avaf(J().getApplication(), this.c.h(), this.c.b(), new auzz(this), this.d);
    }

    @Override // defpackage.geb
    protected final View q(Bundle bundle) {
        cqkf c = this.e.c(new auzt(), null);
        c.e(this.aj);
        return c.c();
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ExpandingScrollView expandingScrollView = ((geb) this).b;
        expandingScrollView.setViewHeaderHeightCallableForSizingCollapsedState(this.ak);
        expandingScrollView.setExpandingStateTransition(jkc.o, jkc.o);
        expandingScrollView.setExpandingState(jjn.COLLAPSED, true);
    }

    public final void w() {
        this.ae.i(cjtd.a(this.c.h().f));
    }
}
