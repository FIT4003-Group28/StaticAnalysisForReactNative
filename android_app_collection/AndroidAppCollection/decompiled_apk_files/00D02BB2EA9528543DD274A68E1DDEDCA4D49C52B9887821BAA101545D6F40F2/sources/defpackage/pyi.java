package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pyi  reason: default package */
/* loaded from: classes7.dex */
public final class pyi extends prh<bznq> {
    private final cqkj h;
    private final bvjj i;
    private final Activity j;
    private final btvo k;
    private final cpv l;

    public pyi(jdj jdjVar, cjqy cjqyVar, cjqq cjqqVar, cqkj cqkjVar, bzmm bzmmVar, bvjj bvjjVar, Activity activity, btvo btvoVar, cpv cpvVar) {
        super(jdjVar, cjqyVar, cjqqVar, bzmmVar);
        this.h = cqkjVar;
        this.i = bvjjVar;
        this.j = activity;
        this.k = btvoVar;
        this.l = cpvVar;
    }

    @Override // defpackage.prh, defpackage.bzml
    public final dqkc a() {
        return dqkc.TRANSIT_TAB_POPUP;
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
        int a = duou.a(this.k.getDirectionsPageParameters().q);
        return a != 0 && a != 1 && n() && !this.i.m(bvjk.hZ, false) && !this.i.m(bvjk.ia, false) && psq.a(this.c, dqvj.TRANSIT) && !this.l.e(this.j);
    }

    @Override // defpackage.prh, defpackage.bzml
    public final bzmk e() {
        bzmk e = super.e();
        return (e != bzmk.VISIBLE || !this.k.getDirectionsPageParameters().r) ? e : bzmk.REPRESSED;
    }

    @Override // defpackage.prh
    protected final cqkf<bznq> g() {
        return this.h.c(new bzna(), null);
    }

    @Override // defpackage.prh
    protected final /* bridge */ /* synthetic */ bznq h(jdi jdiVar) {
        int i;
        int i2;
        cqtd cqtdVar;
        int a = duou.a(this.k.getDirectionsPageParameters().q);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 2) {
            cqtdVar = iup.e(R.raw.transit_start_footer_promo_icon);
            i = R.string.TRANSIT_PROMO_POPUP_TITLE;
            i2 = R.string.TRANSIT_PROMO_POPUP_BODY;
        } else {
            i = R.string.TRANSIT_PROMO_POPUP_JAKARTA_MRT_TITLE;
            i2 = R.string.TRANSIT_PROMO_POPUP_JAKARTA_MRT_BODY;
            cqtdVar = null;
        }
        return new bznn(jdiVar, cqrt.l(i), cqrt.l(i2), cqrt.l(R.string.TRANSIT_PROMO_POPUP_DISMISS), cqtdVar, null, dtxn.cJ, dtxn.cI);
    }

    @Override // defpackage.prh
    protected final ddho i() {
        return dtxn.cH;
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
        return psq.b(this.c, view, dqvj.TRANSIT);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.prh
    public final void p(cqkf<bznq> cqkfVar) {
        this.i.S(bvjk.ia, true);
        super.p(cqkfVar);
    }

    @Override // defpackage.prh
    protected final boolean r(vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar) {
        return psq.c(this.c, i, jjnVar);
    }
}
