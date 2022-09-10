package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: psw  reason: default package */
/* loaded from: classes7.dex */
public final class psw extends prh<bznq> {
    private static final dqvj l = dqvj.TWO_WHEELER;
    public final qeg h;
    public final Activity i;
    public final cpv j;
    public final bzmm k;
    private final cqkj m;
    private final bvjj n;
    private final qbj o;

    public psw(jdj jdjVar, cjqy cjqyVar, cjqq cjqqVar, cqkj cqkjVar, bzmm bzmmVar, qeg qegVar, bvjj bvjjVar, Activity activity, cpv cpvVar, qbj qbjVar) {
        super(jdjVar, cjqyVar, cjqqVar, bzmmVar);
        this.m = cqkjVar;
        this.k = bzmmVar;
        this.h = qegVar;
        this.n = bvjjVar;
        this.i = activity;
        this.j = cpvVar;
        this.o = qbjVar;
    }

    protected static final bznq t(jdi jdiVar) {
        return new bznn(jdiVar, cqrt.l(pxo.HIDDEN_2W_PROMO_POPUP_TITLE), cqrt.l(pxo.HIDDEN_2W_PROMO_POPUP_BODY), cqrt.l(pxo.HIDDEN_2W_PROMO_POPUP_DISMISS), iup.e(R.raw.two_wheeler_tab_popup_promo), Integer.valueOf((int) R.raw.two_wheeler_popup_promo_lottie), dtxr.q, dtxr.p);
    }

    @Override // defpackage.prh, defpackage.bzml
    public final dqkc a() {
        return dqkc.TWO_WHEELER_TAB_POPUP_AND_SWITCH;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        vnk vnkVar;
        return n() && psq.a(this.c, l) && (vnkVar = this.c) != null && vnkVar.P();
    }

    @Override // defpackage.prh, defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.prh, defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (super.f(bzmkVar)) {
            this.o.b(dqvj.TWO_WHEELER);
            return true;
        }
        return false;
    }

    @Override // defpackage.prh
    protected final cqkf<bznq> g() {
        return this.m.c(new bzna(), null);
    }

    @Override // defpackage.prh
    protected final /* bridge */ /* synthetic */ bznq h(jdi jdiVar) {
        return t(jdiVar);
    }

    @Override // defpackage.prh
    protected final ddho i() {
        return dtxr.o;
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
        return psq.b(this.c, view, l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.prh
    public final void p(cqkf<bznq> cqkfVar) {
        this.n.S(bvjk.hY, true);
        super.p(cqkfVar);
    }

    @Override // defpackage.prh
    protected final boolean r(vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar) {
        vnk vnkVar2 = this.c;
        return vnkVar2 != null && dqvj.TWO_WHEELER.equals(vnkVar2.g()) && i == 3 && jjn.COLLAPSED.equals(jjnVar);
    }
}
