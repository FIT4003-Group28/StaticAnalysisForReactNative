package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nfn  reason: default package */
/* loaded from: classes7.dex */
public final class nfn extends cqiw<nfw> {
    private final Boolean e(cren crenVar) {
        return B().a(crenVar);
    }

    private static cqmj<nfw> f(Integer num, cqnf<nfw> cqnfVar, Boolean bool, cqkl cqklVar, ddho ddhoVar, boolean z) {
        cqmj gc = cqgr.gc(cqgr.ce(nqo.aa), cqgr.bp(-1), cqgr.ei(ImageView.ScaleType.CENTER), cqnfVar);
        cqmj gq = cqgr.gq(cqgr.bq(nqo.ao), cqgr.bR(nqo.aa), cqgr.aJ(16), cqgr.eL(num), cqjv.m(bool, nre.p(nql.a()), nre.p(nql.bp)));
        cqmp[] cqmpVarArr = new cqmp[11];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bq(nqo.ao);
        cqmpVarArr[2] = cqgr.bw(17);
        cqmpVarArr[3] = cqgr.bv(3);
        cqmpVarArr[4] = nqu.f(npv.a(), null, true);
        cqmpVarArr[5] = cqgr.az(npv.a());
        cqmpVarArr[6] = itj.g(cqklVar);
        cqmpVarArr[7] = iue.b(cjtd.a(ddhoVar));
        cqmpVarArr[8] = gc;
        cqmpVarArr[9] = gq;
        cqmpVarArr[10] = z ? iuh.b(cqgr.bw(80)) : cqmp.e;
        return cqgr.fY(cqmpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<nfw> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), f(Integer.valueOf((int) R.string.MENU_MUTE), cqjv.k(e(cren.MUTED), cqgr.eE(nqu.aK(R.raw.car_only_ic_sound_off_36dp)), cqgr.eE(nqu.aB(R.raw.car_only_ic_sound_off_36dp, nql.k))), e(cren.MUTED), B().b(cren.MUTED), dtxm.dY, true), f(Integer.valueOf((int) R.string.MENU_TRAFFIC_ALERTS_ONLY), cqjv.k(e(cren.MINIMAL), cqgr.eE(nqu.aK(R.raw.car_only_ic_sound_alert_36dp)), cqgr.eE(nqu.aB(R.raw.car_only_ic_sound_alert_36dp, nql.k))), e(cren.MINIMAL), B().b(cren.MINIMAL), dtxm.dZ, true), f(Integer.valueOf((int) R.string.MENU_UNMUTE), cqjv.k(e(cren.UNMUTED), cqgr.eE(nqu.aK(R.raw.car_only_ic_sound_on_36dp)), cqgr.eE(nqu.aB(R.raw.car_only_ic_sound_on_36dp, nql.k))), e(cren.UNMUTED), B().b(cren.UNMUTED), dtxm.ea, false));
    }
}
