package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xiu  reason: default package */
/* loaded from: classes7.dex */
public final class xiu extends cqiw<zcv> {
    private final boolean v;
    private static final cqtv l = cqrp.d(20.0d);
    private static final cqtv m = cqrp.d(8.0d);
    private static final cqtv n = cqrp.d(12.0d);
    private static final cqtv o = cqrp.d(8.0d);
    private static final cqtv p = cqrp.d(18.0d);
    private static final cqtv q = cqrp.d(8.0d);
    public static final cqtv a = cqrp.d(1.0d);
    public static final cqtv b = cqrp.d(8.0d);
    private static final cqtv r = cqrp.d(1.0d);
    private static final cqtv s = cqrp.d(4.0d);
    public static final cqss c = ibm.v();
    public static final cqss d = ibm.u();
    public static final cqss e = ibm.y();
    public static final cqss f = iva.b(ibl.S(), cqrt.c(R.color.mod_night_yellow100));
    public static final cqss g = ibm.F();
    public static final cqss h = iva.b(cqta.e(11361280), ibl.T());
    public static final cqss i = ibm.B();
    public static final cqss j = ibm.A();
    public static final cqss k = ibm.E();
    private static final cqjg t = cqjg.a();
    private static final cqjg u = cqjg.a();

    public xiu() {
        this(true);
    }

    public static <T> T e(doza dozaVar, T t2, T t3, T t4, T t5) {
        return dozaVar == doza.ALERT ? t2 : dozaVar == doza.WARNING ? t3 : dozaVar == doza.INFORMATION ? t4 : t5;
    }

    @dzsi
    public static String f(zcv zcvVar, Context context) {
        String k2 = zcvVar.k();
        String e2 = zcvVar.e();
        return (TextUtils.isEmpty(k2) || TextUtils.isEmpty(e2)) ? e2 : context.getResources().getString(R.string.TRANSIT_RADAR_ALERT_HEADLINE_AND_LINE_NAME, e2, k2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zcv> a() {
        cqmp[] cqmpVarArr = new cqmp[16];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.bR(this.v ? l : cqrp.d(dcyn.a));
        cqmpVarArr[3] = cqgr.bG(this.v ? l : cqrp.d(dcyn.a));
        cqmpVarArr[4] = cqgr.bD(m);
        cqtv cqtvVar = n;
        cqmpVarArr[5] = cqgr.dQ(cqtvVar);
        cqmpVarArr[6] = cqgr.dF(cqtvVar);
        cqtv cqtvVar2 = o;
        cqmpVarArr[7] = cqgr.dU(cqtvVar2);
        cqmpVarArr[8] = cqgr.dB(cqtvVar2);
        cqmpVarArr[9] = cqgr.w(new xit());
        cqmpVarArr[10] = cqgr.cW(xil.a);
        cqmpVarArr[11] = iue.c(xim.a);
        cqmpVarArr[12] = cqgr.J(true);
        cqjg cqjgVar = t;
        cqmpVarArr[13] = cqgr.gc(cqgr.aT(cqjgVar), cqgr.bY(cqjd.e(), cqjd.i()), cqgr.eG(xin.a), cqgr.ch(p), cqgr.bV(r));
        cqjg cqjgVar2 = u;
        cqmpVarArr[14] = cqgr.gq(cqgr.aT(cqjgVar2), cqgr.bY(cqjd.A(cqjgVar), cqjd.i()), cqgr.bR(q), cqgr.aJ(16), ibq.n(), ibq.z(), cqgr.eK(xiq.a), cqgr.U(xir.a), cqgr.eN(5));
        cqmpVarArr[15] = cqgr.gq(cqgr.bY(cqjd.e(), cqjd.u(cqjgVar2)), cqgr.bV(s), cqgr.aJ(16), ibq.q(), cqgr.cj(Float.valueOf(0.003f)), cqgr.eU(ibm.o()), cqgr.cC(xip.a), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eR(xio.a), cqgr.eN(5));
        return cqgr.gj(cqmpVarArr);
    }

    public xiu(boolean z) {
        super(Boolean.valueOf(z));
        this.v = z;
    }
}
