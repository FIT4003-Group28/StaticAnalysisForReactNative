package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: lut  reason: default package */
/* loaded from: classes7.dex */
public final class lut {
    public static final int a = cqir.a();
    static final int b = cqir.a();
    public static final int c = cqir.a();
    static final cqtv d = nqo.aB;

    public static cqmj<lvw> a(final boolean z, cqmp<lvw>... cqmpVarArr) {
        cqjb cqjbVar = new cqjb(z) { // from class: ltq
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                boolean z2 = this.a;
                lvw lvwVar = (lvw) cqkpVar;
                if (lvwVar.l().booleanValue()) {
                    return Integer.valueOf(lut.b);
                }
                return Integer.valueOf((lut.b(z2, context) || lvwVar.a().booleanValue()) ? lwi.a : lut.a);
            }
        };
        cqmp[] cqmpVarArr2 = {cqgr.aF(lub.a)};
        cqmp[] cqmpVarArr3 = {cqic.c(lun.a, new cqmp[0]), cqgr.ce(nqo.Y), cqgr.bp(-1)};
        cqmp[] cqmpVarArr4 = {cqic.b(new cqjb(z) { // from class: luo
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                lvw lvwVar = (lvw) cqkpVar;
                boolean z2 = true;
                if (lut.b(this.a, context) && !lvwVar.a().booleanValue()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }, new cqmp[0])};
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(8388627), cqgr.az(false), cqgr.J(true), cqgr.bT(ltw.a), cqgr.bG(nqo.R), jgj.a(cqgr.aF(cqjv.x(ltx.a)), cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(cqrp.d(8.0d)), lwi.b(cqgr.bq(cqrp.d(36.0d)), cqgr.eM(lty.a), nre.u(nql.bp)), lwi.b(cqgr.bq(cqrp.d(36.0d)), nsc.i()), lwi.b(cqgr.bq(cqrp.d(36.0d)), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(ltz.a)), lwi.c(cqgr.eE(nqu.S()), cqgr.aI(lua.a), cqgr.bq(cqrp.d(36.0d)), cqgr.dB(cqrp.d(8.0d))), lwi.c(cqgr.eE(itd.e()), cqgr.aI(luc.a), cqgr.bq(cqrp.d(36.0d)), cqgr.dB(cqrp.d(8.0d)))), lwi.a(cqgr.cd(-1)));
        gd.f(cqmpVarArr4);
        cqmp[] cqmpVarArr5 = {cqic.b(new cqjb(z) { // from class: lup
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                lvw lvwVar = (lvw) cqkpVar;
                boolean z2 = true;
                if (!lut.b(this.a, context) && !lvwVar.a().booleanValue()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }, new cqmp[0])};
        cqmj gd2 = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(8388627), cqjv.l(ltk.a, cqgr.bR(nqo.V), cqgr.bR(nqo.S)), cqjv.l(ltl.a, cqgr.bG(nqo.Y), cqgr.bG(nqo.S)), cqgr.az(false), cqgr.J(true), jgj.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.aF(cqjv.x(ltm.a)), cqgr.dU(cqrp.d(8.0d)), cqgr.gq(cqgr.bq(cqrp.d(36.0d)), cqgr.eB(true), vlb.a(), cqgr.eM(ltn.a), nre.j()), lwi.c(cqgr.eE(nqu.S()), cqgr.aI(lto.a), cqgr.bq(cqrp.d(36.0d)), cqgr.dB(cqrp.d(8.0d))), lwi.c(cqgr.eE(itd.e()), cqgr.aI(ltp.a), cqgr.bq(cqrp.d(36.0d)), cqgr.dB(cqrp.d(8.0d)))), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(16), lwi.b(cqgr.bq(cqrp.d(36.0d)), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(ltr.a), cqjv.n(lts.a, nre.u(nql.bi), nre.r())), nsc.A(nsc.t(cqrp.d(80.0d)), lwi.b(cqgr.bq(cqrp.d(36.0d)), nsc.i(), cqgr.aF(ltt.a)), lwi.b(cqgr.bq(cqrp.d(36.0d)), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(ltu.a), cqjv.n(ltv.a, nre.u(nql.bi), nre.r())))));
        gd2.f(cqmpVarArr5);
        cqmj fY = cqgr.fY(cqgr.ce(d), cqgr.bq(nqo.aG), lwi.d(cqmpVarArr3), gd, gd2, lwi.f(cqic.c(luq.a, new cqmp[0]), cqgr.bw(8388627), cqgr.bT(lur.a), cqgr.cB(2), cqgr.cA(lus.a)), cqgr.gc(cqgr.aR(Integer.valueOf(a)), cqgr.ce(nqo.Y), cqgr.bp(-1), cqgr.bw(8388629), cqgr.aE(new cqjb(z) { // from class: ltg
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                lvw lvwVar = (lvw) cqkpVar;
                boolean z2 = true;
                if (!lut.b(this.a, context) && !lvwVar.a().booleanValue() && lvwVar.m().booleanValue()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }), nqu.i(lth.a, null, false, nqo.ad), cqgr.eE(nqu.A()), cqgr.ei(ImageView.ScaleType.CENTER), itj.h(cqgr.q(lti.a)), cqgr.aA(ltj.a), iue.b(cjtd.a(dtxm.cc))));
        fY.f(cqmpVarArr2);
        cqmp[] cqmpVarArr6 = {cqic.f(lum.a, new cqmp[0])};
        cqmj u = nsc.u(cqgr.ce(nqo.aB), cqgr.bq(nqo.aG), nsc.p(lud.a), cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(0), cqgr.fY(cqgr.aR(Integer.valueOf(b)), cqgr.bp(-1), cqgr.ca(Float.valueOf(1.0f)), iue.b(cjtd.a(dtxm.ci)), itj.h(cqgr.q(lue.a)), nqu.i(luf.a, null, false, nqo.ad), cqgr.aA(lug.a), cqgr.gc(cqgr.am(true), cqgr.aR(Integer.valueOf(c)), cqgr.ce(nqo.Y), cqgr.bq(nqo.Y), cqgr.bw(8388627), cqgr.eE(nqu.I()), cqgr.ei(ImageView.ScaleType.CENTER)), cqgr.gq(cqgr.am(true), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388627), cqgr.bR(nqo.V), cqgr.bG(nqo.S), vlb.a(), cqgr.eJ(cqrt.l(R.string.RECENTER_FOLLOW_MODE)), nre.x(nql.a()))), cqgr.gc(cqgr.ce(nqo.Y), cqgr.bp(-1), cqgr.bw(8388629), cqgr.aF(luh.a), iue.c(lui.a), nqu.i(luj.a, null, false, nqo.ad), cqgr.aA(luk.a), cqgr.eE(nqu.aK(R.raw.car_only_ic_search_36dp)), cqgr.ei(ImageView.ScaleType.CENTER), itj.h(cqgr.q(lul.a)))));
        u.f(cqmpVarArr6);
        cqmj<lvw> y = nsc.y(cqgr.cd(-2), cqgr.bp(-2), cqgr.y(ltf.a), cqjv.d(nrl.DEFAULT_FOCUS, cqjbVar), fY, u);
        y.f(cqmpVarArr);
        return y;
    }

    public static boolean b(boolean z, Context context) {
        return z && ltc.d(context);
    }
}
