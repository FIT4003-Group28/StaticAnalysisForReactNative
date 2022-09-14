package defpackage;

import android.text.TextUtils;
import android.view.animation.AlphaAnimation;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abkl  reason: default package */
/* loaded from: classes.dex */
public final class abkl extends cqiw<abkm> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();

    public abkl() {
        super(false);
    }

    @SafeVarargs
    private static cqmj<abkm> e(final cqlc<abkm, Boolean> cqlcVar, cqmj<abkm> cqmjVar, cqmj<abkm> cqmjVar2, cqmp<abkm>... cqmpVarArr) {
        final cqjg a2 = cqjg.a();
        final cqjg a3 = cqjg.a();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(225L);
        alphaAnimation.setInterpolator(irf.b);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(225L);
        alphaAnimation2.setInterpolator(irf.c);
        cqmjVar.g(cqgr.aT(a2));
        cqmjVar2.g(cqgr.aT(a3));
        cqmj<abkm> gv = cqgr.gv(cqgr.cd(-1), cqgr.bp(-2), cqgr.o(false), cqgr.aY(alphaAnimation), cqgr.du(alphaAnimation2), cqgr.ad(new cqlc(cqlcVar, a2, a3) { // from class: abjy
            private final cqlc a;
            private final cqjg b;
            private final cqjg c;

            {
                this.a = cqlcVar;
                this.b = a2;
                this.c = a3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                cqjg cqjgVar = this.b;
                cqjg cqjgVar2 = this.c;
                cqjg cqjgVar3 = abkl.a;
                return ((Boolean) cqlcVar2.a((abkm) cqkpVar)).booleanValue() ? cqjgVar : cqjgVar2;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqmjVar, cqmjVar2);
        gv.f(cqmpVarArr);
        return gv;
    }

    @SafeVarargs
    private static cqmj<abkm> f(cqmp<abkm>... cqmpVarArr) {
        cqmj<abkm> gq = cqgr.gq(cqgr.eO(abjz.a), cqgr.ar(TextUtils.TruncateAt.END), ibq.e(), ibq.v());
        gq.f(cqmpVarArr);
        return gq;
    }

    private static cqmj<abkm> h() {
        return f(cqgr.eM(abjx.a), cqgr.eU(ibm.l()), cqgr.dj(new abkk()), itj.f(Integer.valueOf((int) R.id.home_loading_tag)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<abkm> a() {
        cqmp[] cqmpVarArr = {cqgr.aF(abkb.a)};
        cqlc cqlcVar = abkd.a;
        cqmj<abkm> h = h();
        cqmp[] cqmpVarArr2 = {cqgr.eM(abke.a)};
        cqmp<abkm>[] cqmpVarArr3 = {cqgr.aI(abkc.a)};
        cqlc cqlcVar2 = abkf.a;
        cqmj<abkm> h2 = h();
        cqjg cqjgVar = a;
        cqmp[] cqmpVarArr4 = {cqgr.aT(cqjgVar), cqjv.l(abkg.a, cqgr.bY(cqjd.i(), cqjd.e()), cqgr.bY(cqjd.i(), cqjd.s())), cqgr.bT(abkh.a), cqgr.bG(cqrp.d(48.0d)), cqgr.eM(abki.a)};
        cqmp[] cqmpVarArr5 = {cqgr.aT(b), cqgr.bR(cqrp.d(-48.0d)), cqgr.bY(cqjd.A(cqjgVar), cqjd.t())};
        cqmm fP = cqgr.fP(new abgo(), abka.a, cqgr.bq(cqrp.d(24.0d)));
        fP.a(cqmpVarArr5);
        cqmj<abkm> e = e(cqlcVar2, h2, cqgr.gj(cqgr.cd(-1), f(cqmpVarArr4), fP), cqgr.bT(abkj.a), cqgr.bI(abjv.a), cqgr.bX(abjw.a));
        e.f(cqmpVarArr3);
        return cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), ibn.s(), iue.c(abju.a), e(cqlcVar, h, f(cqmpVarArr2), cqmpVarArr), e);
    }
}
