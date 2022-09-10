package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pys  reason: default package */
/* loaded from: classes7.dex */
public final class pys extends prh<bznq> {
    private static final dqvj h = dqvj.TWO_WHEELER;
    private final cqkj i;
    private final qeg j;
    private final bvjj k;
    private final Activity l;
    private final cpv m;

    public pys(jdj jdjVar, cjqy cjqyVar, cjqq cjqqVar, cqkj cqkjVar, bzmm bzmmVar, qeg qegVar, bvjj bvjjVar, Activity activity, cpv cpvVar) {
        super(jdjVar, cjqyVar, cjqqVar, bzmmVar);
        this.i = cqkjVar;
        this.j = qegVar;
        this.k = bvjjVar;
        this.l = activity;
        this.m = cpvVar;
    }

    @Override // defpackage.prh, defpackage.bzml
    public final dqkc a() {
        return dqkc.TWO_WHEELER_TAB_POPUP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.j.c() && n() && !this.k.m(bvjk.hX, false) && !this.k.m(bvjk.hY, false) && psq.a(this.c, h) && !this.m.e(this.l);
    }

    @Override // defpackage.prh
    protected final cqkf<bznq> g() {
        return this.i.c(new bzna(), null);
    }

    @Override // defpackage.prh
    protected final /* bridge */ /* synthetic */ bznq h(jdi jdiVar) {
        return new bznn(jdiVar, cqrt.l(R.string.TWO_WHEELER_PROMO_POPUP_TITLE), cqrt.l(this.j.d() == 3 ? R.string.TWO_WHEELER_PROMO_POPUP_BODY_WITH_ARRIVAL_TIMES : R.string.TWO_WHEELER_PROMO_POPUP_BODY), cqrt.l(R.string.TWO_WHEELER_PROMO_POPUP_DISMISS), iup.e(R.raw.two_wheeler_tab_popup_promo), Integer.valueOf((int) R.raw.two_wheeler_popup_promo_lottie), dtxn.cM, dtxn.cL);
    }

    @Override // defpackage.prh
    protected final ddho i() {
        return dtxn.cK;
    }

    @Override // defpackage.prh
    protected final int j() {
        return -15;
    }

    @Override // defpackage.prh
    protected final jdo k() {
        return jdo.TOP;
    }

    @Override // defpackage.prh
    @dzsi
    protected final View l(View view) {
        return psq.b(this.c, view, h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.prh
    public final void p(cqkf<bznq> cqkfVar) {
        this.k.S(bvjk.hY, true);
        super.p(cqkfVar);
    }

    @Override // defpackage.prh
    protected final boolean r(vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar) {
        return psq.c(this.c, i, jjnVar);
    }
}
