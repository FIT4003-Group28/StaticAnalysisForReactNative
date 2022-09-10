package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pos  reason: default package */
/* loaded from: classes7.dex */
public final class pos extends cqiw<pov> {
    private static final cqtv b = cqrp.d(18.0d);
    public static final cqtv a = cqrp.d(158.0d);
    private static final cqtv c = cqrp.d(14.0d);
    private static final cqjb<pov, Integer> d = poi.a;

    @SafeVarargs
    private static final cqmj<pov> e(cqmp<pov>... cqmpVarArr) {
        cqmj<pov> c2 = hyb.c(cqgr.cW(cqgr.q(pom.a)), iue.c(pon.a), ibq.z(), cqgr.eM(poo.a));
        c2.f(cqmpVarArr);
        return c2;
    }

    @SafeVarargs
    private static final cqmj<pov> f(cqmp<pov>... cqmpVarArr) {
        cqmp[] cqmpVarArr2 = {cqgr.bk(pop.a)};
        cqmj gg = cqgr.gg(cqgr.ch(b), cqgr.bw(17), cqgr.T(cqrt.l(R.string.CUSTOM_VEHICLE_LOADING_CONTENT_DESCRIPTION)));
        gg.f(cqmpVarArr2);
        cqmj<pov> fY = cqgr.fY(cqgr.bp(-2), gg, hyb.a(cqgr.cd(-1), cqgr.bk(poq.a), cqgr.au(por.a), cqgr.cW(cqgr.q(pof.a)), iue.c(pog.a), ibq.z(), cqgr.eM(poh.a), cqgr.eU(ibm.b())));
        fY.f(cqmpVarArr);
        return fY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<pov> a() {
        cqlc cqlcVar = poj.a;
        cqmp[] cqmpVarArr = {cqgr.az(true), ibq.v()};
        cqlc cqlcVar2 = pok.a;
        cqmp[] cqmpVarArr2 = {cqgr.bD(cqrp.d(20.0d))};
        cqjb<pov, Integer> cqjbVar = d;
        cqmj a2 = WebImageView.a(cqgr.br(cqjbVar), cqgr.cf(cqjbVar), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.dV(0), cqgr.dC(0), cqgr.k(true), WebImageView.l(pol.a));
        a2.f(new cqmp[0]);
        cqtv cqtvVar = c;
        Float valueOf = Float.valueOf(1.0f);
        return cqgr.fY(ijc.c(iue.c(poe.a), cqgr.gk(cqgr.bp(-2), cqgr.cd(-1), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.aJ(1), ijc.f(cqlcVar, cqmpVarArr), ijc.g(cqlcVar2, cqmpVarArr2), a2, jdg.a(cqgr.gd(cqgr.dr(0), cqgr.dQ(ibn.j()), cqgr.dF(ibn.j()), cqgr.dU(cqrp.d(16.0d)), cqgr.dB(cqtvVar), e(cqgr.cd(0), cqgr.ca(valueOf)), cqgr.fY(cqgr.ce(cqrp.d(8.0d))), f(cqgr.cd(0), cqgr.ca(valueOf))), cqgr.gd(cqgr.dr(1), cqgr.dQ(ibn.j()), cqgr.dF(ibn.j()), cqgr.dU(cqrp.d(16.0d)), cqgr.dB(cqtvVar), cqgr.aJ(17), f(cqgr.cd(-1)), e(cqgr.cd(-1))))))));
    }
}
