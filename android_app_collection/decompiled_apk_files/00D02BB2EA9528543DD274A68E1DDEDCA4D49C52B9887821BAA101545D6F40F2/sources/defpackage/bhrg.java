package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhrg  reason: default package */
/* loaded from: classes3.dex */
public final class bhrg extends cqiw<bhsc> {
    public static final /* synthetic */ int a = 0;
    private static final cqmn<bhsc> b = cqmn.a(cqgr.ch(cqrp.d(16.0d)), cqgr.bw(16), cqgr.ei(ImageView.ScaleType.FIT_CENTER));
    private static final cqmn<bhsc> c = cqmn.a(cqgr.bp(-2), cqgr.cH(irh.a()), cqgr.dU(cqrp.d(20.0d)), cqgr.eN(5), ibq.e());
    private static final cqjb<bhsc, CharSequence> d = bhqp.a;
    private final Integer e = Integer.valueOf(cqir.a());

    public static final <T extends cqkp> cqmn<T> e() {
        cqrp d2 = cqrp.d(8.0d);
        return cqmn.a(cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(17), cqgr.eL(Integer.valueOf((int) R.string.OFFERING_DETAILS_ADD_A_PHOTO)), cqgr.ak(ccra.m(iup.e(R.raw.ic_mod_add_photo), ibl.b(), ibl.b())), cqgr.al(cqrp.d(8.0d)), cqgr.dz(d2, d2, d2, d2), ibq.l(), cqgr.fh(cqrp.f(12.0d)), cqgr.eU(ibl.b()));
    }

    public static <T extends cqkp> cqjb<T, Integer> f() {
        return bhpj.a;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bhsc bhscVar, Context context, cqiv cqivVar) {
        bhsc bhscVar2 = bhscVar;
        if (i == 0) {
            for (blla bllaVar : bhscVar2.r()) {
                cqivVar.a(new blbf(), bllaVar);
            }
        } else if (i == 1) {
            int a2 = dcft.a(bhscVar2.n());
            boolean z = bhscVar2.h().booleanValue() && a2 <= 2;
            boolean z2 = a2 == 1 && !bhscVar2.h().booleanValue();
            int i2 = 0;
            while (i2 < a2) {
                cqivVar.a(new bhrf(bhscVar2.h().booleanValue() && !z && i2 == a2 + (-1), z2), (bhsb) dcft.p(bhscVar2.n(), i2));
                i2++;
            }
            if (!z || !bhscVar2.h().booleanValue()) {
                return;
            }
            cqivVar.a(new bhqz(), bhscVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bhsc> a() {
        cqmj D = cqqx.D(cqqx.G(), cqgr.ck(D(1)), cqqx.p(null), cqqx.K(ccra.p(cqrp.d(4.0d))), cqgr.z(ibm.g()), cqgr.aR(this.e), cqgr.dk(bhqc.a));
        D.f(cqgr.aI(bhpu.a));
        bhqz bhqzVar = new bhqz();
        cqlc cqlcVar = bhqf.a;
        cqmp[] cqmpVarArr = {cqgr.aF(bhqq.a)};
        cqtv n = irh.n();
        cqmj fY = cqgr.fY(cqgr.S(Integer.valueOf((int) R.string.NAVIGATE_UP)), cqgr.bq(irh.a()), cqgr.ce(irh.a()), cqgr.dz(n, n, n, n), cqgr.bV(cqsg.d(irh.n(), ird.b())), cqgr.bR(irh.k()), cqgr.cW(cqgr.q(bhqj.a)), itj.i(dtxx.L), cqgr.gc(cqgr.bp(-1), cqgr.cd(-1), cqgr.bw(17), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.x(cqtt.g(ibl.e())), cqgr.eG(bhqk.a)));
        fY.f(cqgr.bY(cqjd.e()));
        cqtv[] cqtvVarArr = {irh.n(), ird.b()};
        cqtv n2 = irh.n();
        cqmj fY2 = cqgr.fY(cqgr.aF(bhqh.a), cqgr.S(Integer.valueOf((int) R.string.OFFERING_DETAILS_MORE_OPTIONS)), cqgr.bq(irh.a()), cqgr.ce(irh.a()), cqgr.bV(cqsg.d(cqtvVarArr)), cqgr.bG(irh.k()), cqgr.dz(n2, n2, n2, n2), cqgr.cW(bhqi.a), cqgr.gc(cqgr.bp(-1), cqgr.cd(-1), cqgr.bw(17), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.x(cqtt.g(ibl.e())), cqgr.eE(cqrt.g(2131231593, ibl.b()))));
        fY2.f(cqgr.bY(cqjd.f()));
        cqmp[] cqmpVarArr2 = {cqgr.cd(-1), cqgr.br(bhpj.a), D, cqgr.fP(bhqzVar, cqlcVar, cqmpVarArr), cqgr.gj(cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-1), fY, fY2)};
        final cqlc x = cqjv.x(bhpo.a);
        cqlc cqlcVar2 = new cqlc(x) { // from class: bhpp
            private final cqlc a;

            {
                this.a = x;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                bhsc bhscVar = (bhsc) cqkpVar;
                int i = bhrg.a;
                boolean z = false;
                if (!bhscVar.g().booleanValue() && ((cqju) cqlcVar3).a(bhscVar).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqlc a2 = cqkz.a(ibm.j());
        cqlc a3 = cqkz.a(cqrt.l(R.string.OFFERING_DETAILS_ADD_A_DISH_NAME));
        cqlc a4 = cqkz.a("");
        cqlc a5 = cqkz.a(true);
        cqmn a6 = cqmn.a(cqgr.aI(cqlcVar2), cqgr.bV(cqrp.d(20.0d)), cqgr.bD(cqrp.d(12.0d)));
        cqmp[] cqmpVarArr3 = {cqgr.cW(cqgr.q(bhpq.a)), iue.b(cjtd.a(dtxx.G)), cqgr.eU(ibm.m()), cqgr.fe(irn.e)};
        cqmp[] cqmpVarArr4 = {cqgr.aF(cqlcVar2), c, cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqjv.n(x, cqmn.a(cqgr.eL(Integer.valueOf((int) R.string.OFFERING_CAROUSEL_UNNAMED_DISH_CONTENT_DESCRIPTION)), cqgr.eU(ibm.n())), cqmn.a(cqgr.eM(bhpr.a), cqgr.eU(ibm.t())))};
        cqmp[] cqmpVarArr5 = {cqgr.eK(cqiq.b(Integer.valueOf((int) R.string.OFFERING_DETAILS_PLACE_NAME), cqiq.h(bhps.a))), cqgr.eU(ibm.n()), cqgr.fh(cqrp.f(14.0d)), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END)};
        final cqlc cqlcVar3 = bhpt.a;
        final cqlc cqlcVar4 = bhpv.a;
        cqmn<bhsc> cqmnVar = b;
        cqmp[] cqmpVarArr6 = {cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), ccra.g(), cqgr.dB(cqrp.d(14.0d)), cqgr.P(false), cqgr.z(ibm.b()), ccra.n(a2, a3, a4, null, a5, a6, cqmn.a(cqmpVarArr3)), cqgr.gq(cqmpVarArr4), cqpi.a(cqgr.cd(-1), cqgr.bp(-2), cqpi.g(), cqjv.j(cqph.SHOW_DIVIDER, 2), cqpi.b(cqtt.i(cqrt.f(R.drawable.bullet_divider), cqrp.d(10.0d), cqrp.d(10.0d))), cqgr.gq(cqmpVarArr5), cqgr.gd(cqgr.aF(new cqlc(cqlcVar4, cqlcVar3) { // from class: bhpw
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar4;
                this.b = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar5 = this.a;
                cqlc cqlcVar6 = this.b;
                bhsc bhscVar = (bhsc) cqkpVar;
                int i = bhrg.a;
                boolean z = false;
                if (((Boolean) cqlcVar5.a(bhscVar)).booleanValue() && ((Boolean) cqlcVar6.a(bhscVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.dr(0), cqgr.bp(-2), cqgr.cH(cqrp.d(20.0d)), cqgr.cd(-2), cqgr.gc(cqgr.aF(cqlcVar3), cqmnVar, cqgr.eE(cqrt.g(2131232397, ibm.n()))), cqgr.gq(cqgr.aF(cqlcVar3), cqgr.aJ(16), cqgr.dQ(irh.n()), ibq.p(), cqgr.eU(ibm.n()), cqgr.eK(cqiq.f(R.plurals.OFFERING_DETAILS_REVIEW_STATS, bhpx.a, cqiq.h(bhpy.a)))), cqgr.gc(cqgr.aF(new cqlc(cqlcVar3, cqlcVar4) { // from class: bhpz
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar3;
                this.b = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar5 = this.a;
                cqlc cqlcVar6 = this.b;
                bhsc bhscVar = (bhsc) cqkpVar;
                int i = bhrg.a;
                boolean z = true;
                if (!((Boolean) cqlcVar5.a(bhscVar)).booleanValue() && !((Boolean) cqlcVar6.a(bhscVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.ch(cqrp.d(10.0d)), cqgr.bw(16), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eE(cqrt.f(R.drawable.bullet_divider))), cqgr.gc(cqgr.aF(cqlcVar4), cqmnVar, cqgr.eE(cqrt.i(iup.e(R.raw.ic_mod_photo_camera), ibm.n()))), cqgr.gq(cqgr.aF(cqlcVar4), cqgr.aJ(16), cqgr.dQ(irh.n()), ibq.p(), cqgr.eU(ibm.n()), cqgr.eK(cqiq.f(R.plurals.OFFERING_DETAILS_PHOTO_STATS, bhqa.a, cqiq.h(bhqb.a)))))), cqgr.ga(cqgr.aF(bhqd.a), cqgr.ep(false), cqgr.dU(cqrp.d(10.0d)), hyw.B(hyw.w(cqkz.a(cqrt.g(2131232642, ibm.x())), cqgr.q(bhqe.a), cqkz.a(null), cqkz.a(null), cqkz.a(null), cqkz.a(true), cqkz.a(false), hyw.J(), cqgr.eL(Integer.valueOf((int) R.string.OFFERING_DETAILS_SUGGEST_AN_EDIT_LABEL)))))};
        cqmj a7 = ijd.a(cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.aJ(16), ibn.s(), cqgr.gq(cqgr.cd(-2), cqgr.ca(Float.valueOf(1.0f)), ibq.m(), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.dL(cqrp.d(20.0d)), cqgr.dF(irh.m()), cqgr.eL(Integer.valueOf((int) R.string.OFFERING_DETAILS_WOULD_YOU_RECOMMEND_IT))), hyw.q(cqkz.a(cqrt.g(R.drawable.ic_selector_recommendation_yes, ibm.x())), cqgr.q(bhql.a), bhqm.a, cqkz.a(cjtd.a(dtxx.P)), cqkz.a(cqrt.l(R.string.OFFERING_DETAILS_RECOMMENDATION_YES_BUTTON)), new cqmp[0]), hyw.q(cqkz.a(cqrt.g(R.drawable.ic_selector_recommendation_no, ibm.x())), cqgr.q(bhqn.a), bhqo.a, cqkz.a(cjtd.a(dtxx.O)), cqkz.a(cqrt.l(R.string.OFFERING_DETAILS_RECOMMENDATION_NO_BUTTON)), cqjv.j(cqfe.LAYOUT_MARGIN_END, -6))));
        a7.f(cqgr.aI(bhqr.a));
        ije ijeVar = new ije();
        cqlc a8 = cqkz.a(cqkp.T);
        cqmp[] cqmpVarArr7 = {cqgr.aI(bhqs.a)};
        cqmj gq = cqgr.gq(cqgr.z(ibm.b()), cqgr.dU(irh.k()), cqgr.dB(irh.k()), ccra.g(), cqgr.eN(5), ibq.t(), cqgr.eL(Integer.valueOf((int) R.string.OFFERING_DETAILS_RECENT_REVIEWS)));
        gq.f(cqgr.aI(bhqt.a));
        cqmp[] cqmpVarArr8 = {cqgr.dQ(cqrp.d(4.0d)), cqgr.dF(cqrp.d(4.0d)), cqgr.ck(D(0)), cqgr.af(cqtt.k(ibm.i(), cqrp.d(1.0d))), cqgr.ez(2), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.z(ibm.b())};
        ije ijeVar2 = new ije();
        cqlc a9 = cqkz.a(cqkp.T);
        cqmp[] cqmpVarArr9 = {cqgr.aI(bhqu.a)};
        cqmp[] cqmpVarArr10 = {cqgr.aF(bhqv.a), cqgr.fR(new bhpg(true), bhqw.a, new cqmp[0]), cqgr.fR(new bhnr(true), bhpk.a, new cqmp[0])};
        cqmj fY3 = cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.dL(cqrp.d(48.0d)), cqgr.z(ibm.b()), cqgr.gg(cqgr.ch(cqrp.d(36.0d)), cqgr.bw(17)));
        fY3.f(cqgr.aI(bhpl.a));
        cqmj t = itj.t(cqgr.z(ibm.h()), cqgr.bq(cqrp.d(1.0d)));
        t.f(cqgr.aF(bhpm.a));
        cqmj a10 = acmk.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.z(ibm.g()), cqgr.dL(cqrp.d(24.0d)), cqgr.aJ(17), cqgr.cW(cqgr.q(bhqg.a)), cqgr.eK(d));
        a10.f(cqgr.aF(bhpn.a));
        return cqgr.gk(cqgr.z(ibm.b()), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.fY(cqmpVarArr2), cqgr.gd(cqmpVarArr6), cqgr.fP(new ije(), cqkz.a(cqkp.T), new cqmp[0]), a7, cqgr.fP(ijeVar, a8, cqmpVarArr7), gq, cqgr.gd(cqmpVarArr8), cqgr.fP(ijeVar2, a9, cqmpVarArr9), cqgr.fY(cqmpVarArr10), fY3, t, a10));
    }
}
