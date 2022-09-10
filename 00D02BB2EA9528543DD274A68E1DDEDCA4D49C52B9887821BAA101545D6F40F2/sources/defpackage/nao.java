package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nao  reason: default package */
/* loaded from: classes7.dex */
public final class nao extends cqiw<nap> {
    public static final int a = cqir.a();
    public static final int b = cqir.a();
    public static final int c = cqir.a();
    private static final cqtv e = cqrp.d(4.0d);
    public static final cqtv d = cqrp.d(64.0d);

    static {
        new nps(npr.HEIGHT, cqrp.d(96.0d)).c(cqrp.d(88.0d), 445);
    }

    public static boolean d(nap napVar, Context context) {
        if (napVar.r().booleanValue() || !napVar.h().booleanValue()) {
            return false;
        }
        if (napVar.i().booleanValue() || npv.c(640, 2, context)) {
            return true;
        }
        return !npv.b(400, 2, context) && napVar.p().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<nap> a() {
        cqmp[] cqmpVarArr = {cqgr.ce(nqo.ac), cqgr.bq(nqo.ac), cqgr.bw(17), cqqx.i(cqrp.d(dcyn.a)), cqqx.g(cqsg.f(nqo.ac, Float.valueOf(0.5f))), cqqx.f(mzy.a)};
        cqrp cqrpVar = nqo.l;
        Typeface typeface = nre.a;
        nrb f = nrd.f();
        f.n(cqrpVar, nqo.k);
        cqmp[] cqmpVarArr2 = {cqgr.cg(cqkz.a(nqo.aa)), cqgr.bp(-1), cqgr.bw(8388627), cqqx.E(cqmpVarArr), cqgr.gq(cqgr.aJ(17), cqgr.eM(naa.a), cqgr.eB(true), cqgr.aZ(false), f.m(), cqgr.eW(nab.a))};
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr3 = {cqgr.am(true), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), vlb.a(), nre.n(), cqgr.eW(nan.a), cqgr.eM(mzq.a), cqgr.eB(true)};
        cqmp[] cqmpVarArr4 = {cqgr.am(true), cqic.c(mzr.a, new cqmp[0]), vlb.a(), nsc.i(), nre.p(nql.bq)};
        cqmp[] cqmpVarArr5 = {cqgr.am(true), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), vlb.a(), nre.p(nql.bq), cqgr.eM(mzs.a), cqgr.eB(true)};
        cqmp[] cqmpVarArr6 = {cqgr.am(true), nre.p(nql.bq), cqgr.dQ(cqrp.d(2.0d)), vlb.a(), cqgr.aI(mzt.a), cqgr.eM(mzu.a), cqgr.eB(true), cqgr.E(true)};
        cqtv cqtvVar = e;
        cqmp[] cqmpVarArr7 = {cqgr.am(true), cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(nqo.aa), cqgr.D(true), new cqmh(ntl.class, cqmpVarArr3), new cqmh(ntk.class, cqmpVarArr4), new cqmh(ntj.class, cqmpVarArr5), cqgr.gq(cqmpVarArr6), cqgr.gc(cqgr.am(true), cqgr.dQ(cqtvVar), cqgr.dF(cqtvVar), cqgr.aI(mzv.a), cqgr.bw(16), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqtt.i(nqu.aJ(R.drawable.assisted_driving_feature_icon_65x65dp, nql.bq), nqo.D, nqo.E)), cqgr.E(true)), cqgr.gc(cqgr.am(true), cqgr.dQ(cqtvVar), cqgr.dF(cqtvVar), cqgr.aI(mzw.a), cqgr.bw(16), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(nqu.aL(R.raw.car_only_ic_directions_boat_24dp, nql.bq, nql.D, nqo.D, nqo.E)), cqgr.E(true))};
        cqlc a2 = cqkz.a(nqo.aa);
        cqmp[] cqmpVarArr8 = {cqgr.ca(valueOf)};
        cqmp[] cqmpVarArr9 = {cqgr.am(true), cqgr.bT(a2), vlb.a(), cqgr.aH(nac.a), cqgr.eB(true), nre.r(), cqgr.eM(nad.a)};
        cqlc cqlcVar = nae.a;
        cqmp[] cqmpVarArr10 = {cqgr.bT(a2), cqgr.aI(naf.a)};
        cqmj gd = cqgr.gd(cqgr.am(true), cqgr.dr(0), cqgr.gc(irn.A(), cqgr.bw(16), cqgr.bG(cqrp.d(10.0d)), cqgr.eE(itd.e())), cqgr.gq(cqgr.am(true), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eB(true), nre.r(), cqgr.eM(cqlcVar)));
        gd.f(cqmpVarArr10);
        cqmj fY = cqgr.fY(cqgr.am(true), cqgr.gq(cqmpVarArr9), gd);
        fY.f(cqmpVarArr8);
        return nsc.u(cqgr.aS(mzp.a), cqgr.br(mzz.a), cqgr.cd(-1), cqgr.aI(nag.a), cqgr.aA(nah.a), nqu.b(nai.a), nsc.p(naj.a), cqgr.dg(nak.a), itj.h(cqgr.q(nal.a)), iue.c(nam.a), cqgr.fY(cqmpVarArr2), cqgr.fY(cqgr.am(true), cqgr.dF(nqo.R), cqgr.bv(3), cqgr.gd(cqgr.am(true), cqgr.dr(1), cqgr.bp(-2), cqgr.bw(16), new cqmh(ntm.class, cqmpVarArr7), cqgr.gd(cqgr.am(true), cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), fY, cqmp.e))), nsc.c(cqgr.bw(80), cqgr.aF(mzx.a)));
    }
}
