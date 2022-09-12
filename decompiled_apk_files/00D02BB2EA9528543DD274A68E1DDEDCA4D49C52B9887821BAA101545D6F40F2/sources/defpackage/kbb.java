package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: kbb  reason: default package */
/* loaded from: classes7.dex */
public final class kbb extends cqiw<kcf> {
    public static final cqtv a;
    private static final int b = cqir.a();
    private static final int c = cqir.a();

    static {
        dcep.C(nqo.a, nqo.b);
        dcep.C(nqo.b, nqo.c);
        a = cqrp.d(336.0d);
        cqrp.d(96.0d);
    }

    private static cqmj<kcf> e(cqtd cqtdVar, cqsn cqsnVar, cqlc<kcf, CharSequence> cqlcVar, cjtd cjtdVar) {
        return cqgr.gd(cqgr.cd(0), cqgr.bp(-2), cqgr.ca(Float.valueOf(1.0f)), cqgr.dr(1), iue.b(cjtdVar), cqgr.gc(cqgr.bw(1), cqgr.eE(cqtdVar)), cqgr.gq(cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(4), cqgr.cB(1), nre.r(), cqgr.eJ(cqsnVar)), cqgr.gq(cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(4), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), nre.p(nql.bp), cqgr.eM(cqlcVar)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<kcf> a() {
        cqmj go = cqgr.go(cqgr.bV(nqo.Q), cqgr.bD(nqo.Q), cqgr.aI(kal.a), cqgr.az(false), cqgr.gp(e(nqu.aF(R.raw.car_only_ic_time_36dp, nql.bq), cqrt.l(R.string.NAVIGATION_SESSION_DURATION), kas.a, cjtd.a(dtxm.f)), e(nqu.aF(R.raw.car_only_ic_road_36dp, nql.bq), cqrt.l(R.string.NAVIGATION_SESSION_DISTANCE), kat.a, cjtd.a(dtxm.d)), e(nqu.aF(R.raw.car_only_ic_speedometer_36dp, nql.bq), cqrt.l(R.string.NAVIGATION_SESSION_AVERAGE_SPEED), kau.a, cjtd.a(dtxm.c))));
        cqmj gq = cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(nqo.Q), cqgr.bV(nqo.Q), cqgr.bG(nqo.R), cqgr.bw(16), vlb.a(), cqgr.bF(kav.a), nre.e(), cqgr.cB(2), cqgr.eM(kaw.a));
        cqmj gq2 = cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(nqo.Q), cqgr.bG(nqo.R), cqgr.bD(nqo.Q), cqgr.bw(16), vlb.a(), cqgr.aI(kax.a), cqgr.cB(2), cqgr.eM(kay.a), nre.r());
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.aI(kaz.a), nsc.c(new cqmp[0]), WebImageView.a(cqgr.bq(cqrp.d(108.0d)), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(kba.a)));
        cqmj fY2 = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(nqo.Q), cqgr.bD(nqo.Q), cqgr.aI(kam.a), iue.b(cjtd.a(dtxm.g)), cqgr.gc(cqgr.ce(nqo.ac), cqgr.bq(nqo.ac), cqgr.bw(8388627), cqgr.bR(nqo.Q), cqgr.eE(asab.a), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE)), cqgr.gq(cqgr.bp(-2), cqgr.bR(nqo.V), cqgr.bG(nqo.Q), vlb.a(), nre.r(), cqgr.eM(kan.a)));
        Boolean a2 = npv.a();
        int i = c;
        return cqgr.gd(cqgr.ce(a), cqgr.bp(-1), cqgr.dr(1), gq, gq2, cqgr.fR(new kcd(true), kap.a, new cqmp[0]), nsc.c(new cqmp[0]), fY2, nsc.c(cqgr.aI(kaq.a)), go, fY, nsc.c(cqgr.aI(kar.a)), nsc.u(cqgr.aR(Integer.valueOf(b)), cqgr.cd(-1), cqgr.bq(nqo.ao), nqu.a(npv.a()), nqv.a(a2, Integer.valueOf(i)), cqgr.az(npv.a()), itj.h(cqgr.q(kao.a)), iue.b(cjtd.a(dtxm.h)), cqgr.gc(cqgr.am(true), cqgr.aR(Integer.valueOf(i)), cqgr.ce(nqo.Y), cqgr.bq(nqo.Y), cqgr.bw(8388627), cqgr.eE(nqu.H()), cqgr.ei(ImageView.ScaleType.CENTER)), cqgr.gq(cqgr.am(true), cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(nqo.V), cqgr.bw(8388627), cqgr.bG(nqo.R), cqgr.eJ(cqrt.l(R.string.RESTART_NAVIGATION)), cqgr.eB(true), nre.w())));
    }
}
