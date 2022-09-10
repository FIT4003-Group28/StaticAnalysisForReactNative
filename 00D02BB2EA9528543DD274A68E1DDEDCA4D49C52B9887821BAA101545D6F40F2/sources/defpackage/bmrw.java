package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmrw  reason: default package */
/* loaded from: classes3.dex */
public final class bmrw extends cqiw<bmtv> {
    public static final /* synthetic */ int b = 0;
    public final bmof<bmpj> a;

    public bmrw(bmof<bmpj> bmofVar) {
        this.a = bmofVar;
    }

    private final cqmt<bmtv> e(cqlc<bmtv, bmpj> cqlcVar) {
        return new bmro(this, cqlcVar);
    }

    @SafeVarargs
    private static final cqmj<bmtv> f(cqmp<bmtv>... cqmpVarArr) {
        cqmj<bmtv> gq = cqgr.gq(irn.m(), irn.x(), cqgr.eN(5), cqgr.aJ(16), cqgr.ca(Float.valueOf(0.0f)), cqjv.n(bmrb.a, irn.E(), cqmn.a(cqgr.cB(Integer.MAX_VALUE), cqgr.eB(false), cqgr.ar(TextUtils.TruncateAt.END))), cqgr.cd(-2));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    private final cqmj<bmtv> h(cqlc<bmtv, bmpj> cqlcVar, cqmp<bmtv>... cqmpVarArr) {
        cqmj<bmtv> f = f(cqmpVarArr);
        f.f(e(cqlcVar));
        return f;
    }

    @SafeVarargs
    private final cqmj<bmtv> i(cqlc<bmtv, bmpj> cqlcVar, cqmp<bmtv>... cqmpVarArr) {
        cqmj<bmtv> h = h(cqlcVar, cqmpVarArr);
        h.f(cqgr.fe(irn.c), irn.x());
        return h;
    }

    @SafeVarargs
    private static cqmj<bmtv> j(cqlc<bmtv, cqvf> cqlcVar, cqmp<bmtv>... cqmpVarArr) {
        cqmj<bmtv> fV = cqgr.fV(cqgr.cd(-1), cqgr.fl(R.style.ColoredButtonTheme), cqqx.b(irg.a()), cqgr.eU(irg.t()), cqgr.eM(cqlcVar));
        fV.f(cqmpVarArr);
        return fV;
    }

    @SafeVarargs
    private static cqmj<bmtv> k(cqlc<bmtv, cqvf> cqlcVar, cqmp<bmtv>... cqmpVarArr) {
        cqmj<bmtv> fV = cqgr.fV(cqmn.a(ibq.u(), cqgr.l(false)), cqgr.fl(R.style.ColoredBorderlessButtonTheme), cqgr.aJ(8388627), cqgr.eM(cqlcVar));
        fV.f(cqmpVarArr);
        return fV;
    }

    private static <T extends bmtv> cqnf<T> l(ddho ddhoVar) {
        return m(cqkz.a(ddhoVar), cqkz.a(ddhj.VISIBILITY_VISIBLE));
    }

    private static <T extends bmtv> cqnf<T> m(final cqlc<T, ddho> cqlcVar, final cqlc<T, ddhj> cqlcVar2) {
        return iue.c(new cqlc(cqlcVar, cqlcVar2) { // from class: bmrc
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                cqlc cqlcVar4 = this.b;
                bmtv bmtvVar = (bmtv) cqkpVar;
                int i = bmrw.b;
                ddho ddhoVar = (ddho) cqlcVar3.a(bmtvVar);
                if (!bmtvVar.N().booleanValue() || !bmtvVar.O().booleanValue() || ddhoVar == null) {
                    return null;
                }
                cjta b2 = cjtd.b();
                b2.d = ddhoVar;
                b2.w((ddhj) cqlcVar4.a(bmtvVar));
                return b2.a();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    private static cqmn<bmtv> n(ddho ddhoVar) {
        return cqjv.n(bmre.a, cqjv.n(bmrf.a, cqmn.a(l(ddhoVar), cqgr.fI(0)), cqjv.n(bmrg.a, cqmn.a(m(cqkz.a(ddhoVar), cqkz.a(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL)), cqgr.fI(4)), cqmn.a(m(cqkz.a(ddhoVar), cqkz.a(ddhj.VISIBILITY_HIDDEN)), cqgr.fI(4)))), cqjv.n(bmrh.a, cqmn.a(m(cqkz.a(ddhoVar), cqkz.a(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL)), cqgr.fI(4)), cqmn.a(m(cqkz.a(ddhoVar), cqkz.a(ddhj.VISIBILITY_REPRESSED_PRIVACY)), cqgr.fI(4))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bmtv> a() {
        cqlc cqlcVar = bmpl.a;
        cqmn a = cqmn.a(cqgr.cH(irh.a()), cqgr.bp(-2));
        cqmp[] cqmpVarArr = {cqgr.cH(cqrp.c(dcyn.a)), cqgr.bq(cqrp.c(1.0d))};
        cqmp[] cqmpVarArr2 = {cqgr.ce(irh.e()), cqgr.bp(-1), cqgr.dQ(irh.b()), cqgr.gc(cqgr.eE(cqrt.g(2131232950, irg.t()))), cqgr.aJ(16)};
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr3 = {h(cqkz.a(bmpj.LAST_VISITED_TITLE), cqgr.eM(bmrd.a), l(dtxy.jj), cqgr.aI(bmri.a)), i(cqkz.a(bmpj.ARE_YOU_HERE_NOW_QUESTION), cqgr.eL(Integer.valueOf((int) R.string.VISITS_ARE_YOU_HERE_NOW)), e(cqkz.a(bmpj.ARE_YOU_HERE_NOW_QUESTION_SPLIT)), l(dtxy.hp), cqgr.aI(bmrj.a)), i(cqkz.a(bmpj.YOU_ARE_HERE_NOW), cqgr.eM(bmrk.a), l(dtxy.ni), cqgr.aR(Integer.valueOf((int) R.id.timeline_you_are_here_now)), cqgr.aI(bmrl.a)), cqmn.a(h(cqkz.a(bmpj.YOU_HAVE_VISITED_THIS_PLACE), cqgr.eL(Integer.valueOf((int) R.string.VISITS_YOU_HAVE_VISITED_THIS_PLACE)), l(dtxy.nk), cqgr.aI(bmrm.a)), h(cqkz.a(bmpj.YOU_HAVE_NOT_VISITED_THIS_PLACE), cqgr.eL(Integer.valueOf((int) R.string.VISITS_YOU_HAVE_NOT_VISITED_THIS_PLACE)), l(dtxy.nj), cqgr.aI(bmpm.a))), f(cqgr.eI(""), m(bmpn.a, bmpo.a), cqgr.fI(8))};
        Float valueOf2 = Float.valueOf(0.0f);
        return cqgr.gd(cqgr.dr(1), cqjv.n(cqlcVar, a, cqmn.a(cqmpVarArr)), new bmrq(), cqgr.cd(-1), cqgr.x(irn.G()), cqgr.gd(cqgr.fK(bmpz.a), cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-1), cqgr.aJ(16), cqgr.dF(cqrp.d(4.0d)), cqgr.x(irn.G()), cqgr.cW(cqgr.q(bmpw.a)), cqgr.J(true), m(bmqh.a, bmqs.a), cqgr.T(cqrt.l(R.string.YOUR_VISITS_TO_THIS_PLACE)), cqgr.gd(cqmpVarArr2), cqgr.go(cqgr.eA(0), cqgr.ca(valueOf), cqgr.cd(-2), cqgr.gp(cqgr.cd(-1), cqgr.gd(cqmpVarArr3), cqgr.gd(cqgr.aJ(8388611), cqgr.cd(-2), cqgr.bp(-1), cqgr.ca(valueOf), cqgr.aI(bmpp.a), cqgr.dQ(cqrp.d(6.0d)), cqgr.gg(cqgr.ce(cqrp.d(18.0d)), cqgr.bp(-1), cqgr.aJ(17), cqgr.ca(valueOf2))), cqgr.gd(cqgr.bp(-1), cqgr.cd(-2), cqgr.dQ(cqrp.d(6.0d)), cqgr.ca(valueOf), cqgr.aF(bmqu.a), cqgr.T(cqrt.l(R.string.CHECKIN_CHECKMARK_DESCRIPTION)), cqgr.aC(true), cqgr.gd(cqgr.bp(-1), cqgr.cd(-2), cqgr.aJ(17), cqgr.aJ(17), cqgr.gc(cqgr.ce(cqrp.d(18.0d)), cqgr.eE(cqrt.f(2131232564)), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE)))))), cqgr.gc(cqgr.bq(irh.a()), cqgr.ce(irh.a()), cqgr.ca(valueOf2), cqgr.aJ(8388613), cqgr.V(bmqv.a), cqgr.eG(bmqw.a), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), cqgr.cW(cqgr.q(bmqx.a)), cqgr.x(irn.J()), e(cqkz.a(bmpj.COLLAPSE_TOGGLE_CHEVRON)), cqgr.fK(bmqy.a), m(bmqz.a, bmra.a))), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.j(bmpq.a), cqgr.J(false), cqgr.bZ(new bmrr(new Object[0])), cqgr.gq(cqgr.eL(Integer.valueOf((int) R.string.PERSONAL_VISIBLE_ONLY_TO_YOU)), cqgr.eS(Integer.valueOf((int) R.style.QuBody1)), cqgr.fe(irn.a), cqgr.eU(irg.H()), cqgr.eN(5), cqgr.ca(valueOf2), cqgr.dQ(irh.e()), cqgr.dB(irh.k()), cqgr.aF(bmpr.a)), cqgr.gd(cqgr.dr(0), cqgr.dQ(cqsg.g(irh.e(), apkz.d())), cqgr.dF(cqsg.g(irh.b(), apkz.d())), cqgr.dB(irh.k()), cqgr.P(false), cqjv.n(bmps.a, cqmn.a(cqgr.bp(-2), cqgr.fI(0)), cqmn.a(cqgr.bq(cqrp.c(1.0d)), cqgr.fI(4))), j(cqkz.a(cqrt.l(R.string.YES_BUTTON)), cqgr.ca(valueOf), cqgr.cW(cqgr.q(bmpt.a)), e(cqkz.a(bmpj.CHECKIN_YES)), n(dtxy.hF)), j(cqkz.a(cqrt.l(R.string.NO_BUTTON)), cqgr.ca(valueOf), cqgr.cW(cqgr.q(bmpu.a)), e(cqkz.a(bmpj.CHECKIN_NO)), n(dtxy.hE))), cqgr.fY(cqgr.aI(bmpv.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(irh.e()), new cqmh(bmxd.class, cqgr.aR(Integer.valueOf((int) R.id.timeline_mini_timeline)), new bmrt(), cqgr.dO(cqrp.d(18.0d)), cqgr.K(bmpx.a), new bmrv(bmpy.a), cqgr.T(cqrt.l(R.string.TIMELINE_OF_YOUR_VISITS_TO_THIS_PLACE)))), acnm.a(cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(5), cqgr.dQ(cqsg.g(irh.e(), apkz.e())), cqgr.dF(irh.b()), cqgr.aF(bmqa.a), cqgr.fV(cqgr.fl(R.style.ColoredBorderlessButtonTheme), cqgr.aJ(19), cqgr.K(bmqb.a), cqgr.eJ(cqrt.l(R.string.VISITS_VIEW_IN_TIMELINE)), cqgr.aI(bmqc.a), cqgr.cW(cqgr.q(bmqd.a)), e(cqkz.a(bmpj.SHOW_PLACE_TIMELINE)), cqmn.a(ibq.u(), cqgr.l(false))), k(cqkz.a(cqrt.l(R.string.VISITS_VIEW_IN_TIMELINE)), cqgr.K(bmqe.a), cqgr.cW(cqgr.q(bmqf.a)), e(cqkz.a(bmpj.VIEW_IN_VISITED_PLACES)), cqgr.aI(bmqg.a)), k(cqkz.a(cqrt.l(R.string.VISITS_VIEW_IN_VISITED_PLACES)), cqgr.K(bmqi.a), cqgr.cW(cqgr.q(bmqj.a)), e(cqkz.a(bmpj.VIEW_IN_VISITED_PLACES)), cqgr.aI(bmqk.a)), k(cqkz.a(cqrt.l(R.string.VISITS_EDIT)), cqgr.K(bmql.a), cqgr.cW(cqgr.q(bmqm.a)), e(cqkz.a(bmpj.EDIT_MARK_AS_VISITED)), cqgr.aI(bmqn.a)), k(cqkz.a(cqrt.l(R.string.REMOVE_BUTTON)), cqgr.K(bmqo.a), cqgr.cW(cqgr.q(bmqp.a)), e(cqkz.a(bmpj.EDIT_MARK_AS_NOT_BEEN_HERE)), cqgr.aI(bmqq.a)), k(cqkz.a(cqrt.l(R.string.REMOVE_BUTTON)), cqgr.cW(cqgr.q(bmqr.a)), e(cqkz.a(bmpj.EDIT_REMOVE_ALL_VISITS)), cqgr.aI(bmqt.a))), cqgr.dF(cqsg.g(irh.b(), irh.c())), cqgr.aJ(16)));
    }
}
