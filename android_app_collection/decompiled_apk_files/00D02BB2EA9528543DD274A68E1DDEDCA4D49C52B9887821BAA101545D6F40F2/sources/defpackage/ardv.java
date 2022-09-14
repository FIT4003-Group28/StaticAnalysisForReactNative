package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ardv  reason: default package */
/* loaded from: classes2.dex */
public final class ardv extends cqiw<areb> {
    private static final cqnf<areb> a;
    private static final cqss b;

    static {
        cqkx.c();
        a = ibq.x();
        b = ibm.b();
    }

    public static Integer e(areb arebVar) {
        int intValue = arebVar.b().intValue();
        return Integer.valueOf(intValue != 2 ? (intValue == 3 || intValue == 4) ? R.string.COMPASS_CALIBRATION_FIGURE_EIGHT_DIALOG_HIGH_COMPASS_ACCURACY : R.string.COMPASS_CALIBRATION_FIGURE_EIGHT_DIALOG_LOW_COMPASS_ACCURACY : R.string.COMPASS_CALIBRATION_FIGURE_EIGHT_DIALOG_MEDIUM_COMPASS_ACCURACY);
    }

    public static cqss f(areb arebVar) {
        int intValue = arebVar.b().intValue();
        if (intValue != 2) {
            if (intValue == 3 || intValue == 4) {
                return ibm.M();
            }
            return ibm.D();
        }
        return ibm.I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<areb> a() {
        cqnf<areb> cqnfVar = a;
        return cqgr.gd(cqgr.aJ(17), cqgr.dr(1), iue.b(cjtd.a(dtxl.dV)), cqgr.z(b), cqgr.dz(cqrp.d(40.0d), cqrp.d(20.0d), cqrp.d(40.0d), cqrp.d(10.0d)), cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), ibq.e(), cqgr.eL(Integer.valueOf((int) R.string.COMPASS_CALIBRATION_FIGURE_EIGHT_DIALOG_TITLE)), cqnfVar, cqgr.eN(4)), cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(cqrp.d(5.0d)), cqgr.bD(cqrp.d(5.0d)), ibq.p(), cqgr.eL(Integer.valueOf((int) R.string.COMPASS_CALIBRATION_FIGURE_EIGHT_DIALOG_SUBTITLE)), cqnfVar, cqgr.eN(4)), eit.a(cqgr.ce(cqrp.d(270.0d)), cqgr.bq(cqrp.d(270.0d)), eit.d(new eil(Integer.valueOf((int) R.raw.compass_calibration_figure_eight_lottie))), eit.b(true)), cqgr.gd(cqgr.dr(0), cqgr.aJ(17), cqgr.gq(ibq.o(), cqgr.eL(Integer.valueOf((int) R.string.COMPASS_CALIBRATION_FIGURE_EIGHT_DIALOG_COMPASS_ACCURACY)), cqnfVar), cqgr.gm(cqgr.ce(cqrp.d(5.0d))), cqgr.gq(ibq.k(), cqgr.c(1), cqgr.eM(ards.a), cqgr.eW(ardt.a))), hyb.d(cqgr.eL(Integer.valueOf((int) R.string.DONE)), cqgr.cW(cqgr.q(ardu.a)), iue.b(cjtd.a(dtxl.dW))));
    }
}
