package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.TextureView;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbyf  reason: default package */
/* loaded from: classes3.dex */
public final class bbyf extends cqiw<bbyg> {
    public static final cqjg a = cqjg.a();
    static final cqjg b = cqjg.a();
    static final cqjg c = cqjg.a();
    private static final cqss d = cqta.d(Color.argb(165, 0, 0, 0));
    private static final cqtd e = new bbxt(new Object[0]);
    private static final cqjb<bbyg, cqtd> f = bbxj.a;
    private static final cqjb<bbyg, cqtd> g = bbxk.a;

    public static cqtd e(cqtd cqtdVar) {
        return cqtt.b(cqtdVar, cqrp.d(1.0d), cqrp.d(1.0d), cqrp.d(1.0d), d, true);
    }

    public static <T extends cqkp> cqmp<T> f(final cqlc<T, Integer> cqlcVar) {
        cqlc cqlcVar2 = new cqlc(cqlcVar) { // from class: bbxf
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                cqjg cqjgVar = bbyf.a;
                return Boolean.valueOf(((Integer) cqlcVar3.a(cqkpVar)).intValue() == 0);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqgq a2 = itj.a();
        a2.b = Float.valueOf(0.0f);
        cqnf<T> b2 = a2.b();
        cqlc cqlcVar3 = new cqlc(cqlcVar) { // from class: bbxg
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqjg cqjgVar = bbyf.a;
                return Boolean.valueOf(((Integer) cqlcVar4.a(cqkpVar)).intValue() == 90);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqgq a3 = itj.a();
        a3.b = Float.valueOf(-90.0f);
        cqnf<T> b3 = a3.b();
        cqlc cqlcVar4 = new cqlc(cqlcVar) { // from class: bbxh
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar5 = this.a;
                cqjg cqjgVar = bbyf.a;
                return Boolean.valueOf(((Integer) cqlcVar5.a(cqkpVar)).intValue() == 180);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqgq a4 = itj.a();
        a4.b = Float.valueOf(-180.0f);
        cqnf<T> b4 = a4.b();
        cqgq a5 = itj.a();
        a5.b = Float.valueOf(90.0f);
        return cqmn.a(cqjv.l(cqlcVar2, b2, cqjv.l(cqlcVar3, b3, cqjv.l(cqlcVar4, b4, a5.b()))));
    }

    @SafeVarargs
    private static final cqmj<bbyg> h(cqmp<bbyg>... cqmpVarArr) {
        cqmj<bbyg> gc = cqgr.gc(cqgr.ce(ibn.a()), cqgr.bq(ibn.a()), cqgr.ei(ImageView.ScaleType.CENTER), f(bbxd.a));
        gc.f(cqmpVarArr);
        return gc;
    }

    private static final cqmp<bbyg> i() {
        Float valueOf = Float.valueOf(1.0f);
        cqlc cqlcVar = bbxe.a;
        cqgq a2 = itj.a();
        a2.a = Float.valueOf(0.0f);
        cqnf b2 = a2.b();
        cqgq a3 = itj.a();
        a3.a = valueOf;
        return cqmn.a(cqgr.i(valueOf), cqjv.l(cqlcVar, b2, a3.b()));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bbyg bbygVar, Context context, cqiv cqivVar) {
        cqivVar.f(new bbyd(), bbygVar.a());
    }

    @Override // defpackage.cqiw
    public final cqmj<bbyg> a() {
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-1), cqgr.aT(b), cqgr.dc(bbxa.a), iue.b(cjtd.a(dtxu.I))};
        cqtd g2 = cqrt.g(2131232205, ibl.b());
        cqrp d2 = cqrp.d(1.0d);
        cqrp d3 = cqrp.d(dcyn.a);
        cqrp d4 = cqrp.d(dcyn.a);
        cqss cqssVar = d;
        cqmp[] cqmpVarArr2 = {cqgr.S(Integer.valueOf((int) R.string.CANCEL_BUTTON)), iue.b(cjtd.a(dtxu.H)), cqgr.eE(cqtt.b(g2, d2, d3, d4, cqssVar, false)), cqgr.cW(cqgr.q(bbxp.a))};
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr3 = {cqgr.bw(48), cqgr.bp(-2), cqgr.cd(-1), cqgr.dU(cqrp.d(8.0d)), cqgr.dQ(cqrp.d(8.0d)), cqgr.dr(0), i(), cqgr.aJ(16), h(cqmpVarArr2), cqgr.gm(cqgr.ca(valueOf)), cqgr.gd(cqgr.bq(ibn.a()), cqgr.aF(bbxq.a), cqgr.dr(0), cqgr.aJ(16), cqgr.dz(cqrp.d(16.0d), cqrp.d(dcyn.a), cqrp.d(16.0d), cqrp.d(dcyn.a)), iue.b(cjtd.a(dtxu.J)), cqgr.cW(cqgr.q(bbxr.a)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.eJ(cqrt.l(R.string.NEXT)), cqgr.l(true), cqgr.eu(cqssVar), cqgr.ev(cqrp.d(dcyn.a)), cqjv.j(cqfe.SHADOW_DY, cqrp.d(dcyn.a)), cqgr.ey(cqrp.d(5.0d)), ibq.i(), cqgr.eU(ibl.b())), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(cqrp.d(8.0d)), cqgr.cL(irh.r()), cqgr.cH(irh.r()), cqgr.aJ(17), ibq.i(), cqgr.eU(ibl.b()), cqgr.eM(bbxs.a), cqgr.x(e)))};
        cqlc cqlcVar = bbwz.a;
        cqgq a2 = itj.a();
        a2.g = valueOf;
        cqnf b2 = a2.b();
        cqgq a3 = itj.a();
        Float valueOf2 = Float.valueOf(0.0f);
        a3.g = valueOf2;
        cqmp[] cqmpVarArr4 = {cqgr.bw(80), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), i(), cqgr.z(cqsu.a(ibl.w(), 0.28f)), cqgr.L(false), cqqx.D(cqgr.aT(c), cqgr.cd(-1), cqgr.bp(-2), cqgr.aF(bbwy.a), cqjv.l(cqlcVar, b2, a3.b()), cqqx.G(), cqjv.j(cqqi.ORIENTATION, 0), cqgr.P(false), cqgr.L(false), cqgr.dz(cqrp.d(8.0d), cqrp.d(8.0d), cqrp.d(8.0d), cqrp.d(dcyn.a)), cqgr.el(valueOf2), cqgr.ck(C())), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.dz(cqrp.d(8.0d), cqrp.d(12.0d), cqrp.d(8.0d), cqrp.d(20.0d)), cqgr.aJ(16), h(cqgr.eF(g), cqgr.V(bbwr.a), cqic.c(cqjv.x(bbxc.a), new cqmp[0]), cqgr.cW(cqgr.q(bbxl.a))), h(cqgr.eF(f), cqgr.S(Integer.valueOf((int) R.string.GALLERY_CONTENT_DESCRIPTION)), cqic.f(bbxm.a, new cqmp[0]), cqgr.cW(cqgr.q(bbxn.a))), cqgr.gm(cqgr.ca(valueOf)), h(cqgr.eE(e(cqrt.g(2131231593, ibl.b()))), cqgr.S(Integer.valueOf((int) R.string.OVERFLOW_MENU_CONTENT_DESCRIPTION)), iue.b(cjtd.a(dtxu.L)), cqgr.cW(bbxo.a))), cqgr.gm(cqgr.bq(cqrp.d(48.0d)))};
        cqrp d5 = cqrp.d(56.0d);
        cqmh cqmhVar = new cqmh(bcab.class, cqgr.aT(a), cqgr.aR(Integer.valueOf((int) R.id.live_camera_record_button)), cqgr.bq(d5), cqgr.ce(d5), cqgr.bw(81), cqgr.bD(cqrp.d(60.0d)), cqgr.az(true), cqgr.V(bbws.a), iue.b(cjtd.a(dtxu.N)), cqgr.dc(bbwt.a), cqgr.cW(cqgr.q(bbwu.a)), cqjv.g(bbzz.ON_FINISH_RECORDING, bbwv.a, bcab.i), cqgr.au(bbww.a), cqjv.g(bbzz.IS_RECORDING, bbwx.a, bcab.i));
        cqmhVar.f(new cqmp[0]);
        cqlc cqlcVar2 = bbxb.a;
        cqgq a4 = itj.a();
        a4.a = Float.valueOf(0.5f);
        a4.d = 80;
        cqnf b3 = a4.b();
        cqgq a5 = itj.a();
        a5.a = valueOf2;
        a5.d = 80;
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibl.d()), new cqmh(TextureView.class, cqmpVarArr), cqgr.gd(cqmpVarArr3), cqgr.gd(cqmpVarArr4), cqmhVar, cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.A(-1), cqgr.i(valueOf2), cqjv.l(cqlcVar2, b3, a5.b())));
    }
}
