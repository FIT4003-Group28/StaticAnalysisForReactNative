package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bevi  reason: default package */
/* loaded from: classes3.dex */
public abstract class bevi extends cqiw<bevj> {
    public static final cqtv a = cqrp.d(4.0d);
    private static final cqtv b = cqrp.f(13.0d);

    protected abstract int e();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bevj> a() {
        cqnf fm;
        cqmj gc;
        cqtv d;
        double d2;
        cqnf dU;
        int e = e();
        Integer valueOf = Integer.valueOf((int) R.string.ACCESSIBILITY_ELECTRIC_VEHICLE_CONNECTOR_TYPE);
        if (e == 0) {
            gc = cqgr.fY(cqgr.bY(cqjd.e(), cqjd.t()), cqgr.ce(irh.e()), cqgr.dQ(irh.b()), cqgr.gc(cqgr.cd(-2), cqgr.eD(2131232654), cqgr.fm(iva.c(R.color.qu_blue_grey_800, R.color.quantum_bluegrey200)), cqgr.S(valueOf)));
        } else {
            cqmp[] cqmpVarArr = new cqmp[5];
            cqmpVarArr[0] = cqgr.bY(cqjd.e(), cqjd.t());
            cqmpVarArr[1] = cqgr.dF(cqrp.d(4.0d));
            cqmpVarArr[2] = cqgr.eD(2131232652);
            if (e() == 2) {
                fm = cqgr.fm(ibm.x());
            } else {
                fm = cqgr.fm(irg.K());
            }
            cqmpVarArr[3] = fm;
            cqmpVarArr[4] = cqgr.S(valueOf);
            gc = cqgr.gc(cqmpVarArr);
        }
        cqjd[] cqjdVarArr = {cqjd.B(gc), cqjd.t()};
        cqtv cqtvVar = b;
        cqmj gq = cqgr.gq(cqgr.bY(cqjdVarArr), cqgr.cd(-2), cqgr.bp(-2), iuy.c(), cqgr.fh(cqtvVar), cqgr.eB(true), cqgr.eM(beva.a));
        cqmp[] cqmpVarArr2 = new cqmp[11];
        cqmpVarArr2[0] = cqgr.bY(cqjd.f(), cqjd.t());
        cqmpVarArr2[1] = cqgr.cd(-2);
        cqmpVarArr2[2] = cqgr.bp(-2);
        if (e() == 1 || e() == 3) {
            d = cqrp.d(dcyn.a);
        } else {
            d = irh.b();
        }
        cqmpVarArr2[3] = cqgr.bG(d);
        cqmpVarArr2[4] = cqgr.dQ(cqrp.d(4.0d));
        cqmpVarArr2[5] = cqgr.dF(cqrp.d(4.0d));
        cqmpVarArr2[6] = cqgr.dU(cqrp.d(1.0d));
        cqmpVarArr2[7] = cqgr.dB(cqrp.d(1.0d));
        cqmpVarArr2[8] = cqgr.cL(cqrp.f(28.0d));
        cqmpVarArr2[9] = cqgr.y(beuv.a);
        cqmpVarArr2[10] = cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(1), cqgr.eW(beur.a), cqgr.fi(bevb.a), cqgr.fj(1), cqjv.l(beuw.a, cqgr.eK(cqiq.b(Integer.valueOf((int) R.string.EV_INFO_NUM_AVAILABLE_PORTS), cqiq.h(beux.a), cqiq.h(beuy.a))), cqgr.eK(cqiq.c("%d", cqiq.h(beuz.a)))), cqgr.V(bevc.a));
        cqmj fY = cqgr.fY(cqmpVarArr2);
        cqmj gq2 = cqgr.gq(cqgr.bY(cqjd.z(fY), cqjd.t()), cqgr.cd(-2), cqgr.bp(-2), cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d)), cqgr.eU(irg.j()), cqgr.fh(cqtvVar), cqgr.eB(true), cqgr.eM(bevd.a));
        cqmj gq3 = cqgr.gq(cqgr.bY(cqjd.B(gq), cqjd.t()), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388611), cqgr.aI(beus.a), cqgr.eU(irg.j()), cqgr.fh(cqtvVar), cqgr.eI(" · "));
        cqmj fY2 = cqgr.fY(cqgr.bY(cqjd.B(gq3), cqjd.z(gq2), cqjd.t()), cqgr.bp(-2), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388611), cqgr.eU(irg.j()), cqgr.fh(cqtvVar), cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(beut.a)));
        cqmp[] cqmpVarArr3 = new cqmp[11];
        cqmpVarArr3[0] = cqgr.cd(-1);
        cqmpVarArr3[1] = cqgr.bp(-2);
        cqmpVarArr3[2] = iue.c(beuu.a);
        if (e() == 3) {
            dU = cqgr.dU(cqrp.d(2.0d));
            d2 = 4.0d;
        } else {
            d2 = 4.0d;
            dU = cqgr.dU(cqrp.d(4.0d));
        }
        cqmpVarArr3[3] = dU;
        cqmpVarArr3[4] = cqgr.dB(e() == 3 ? cqrp.d(2.0d) : cqrp.d(d2));
        cqmpVarArr3[5] = gc;
        cqmpVarArr3[6] = gq;
        cqmpVarArr3[7] = gq3;
        cqmpVarArr3[8] = fY2;
        cqmpVarArr3[9] = gq2;
        cqmpVarArr3[10] = fY;
        return cqgr.gj(cqmpVarArr3);
    }
}
