package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ccpl  reason: default package */
/* loaded from: classes4.dex */
public final class ccpl extends cqiw<ccxk> {
    public static final cqjg a;
    public static final cqtv b;
    public static final cqtv c;
    private static final cqtv d = cqrp.d(28.0d);
    private static final cqtv e;
    private static final cqtv f;
    @dzsi
    private final cqtd g;
    private final boolean h;

    static {
        cqrp d2 = cqrp.d(32.0d);
        e = d2;
        cqrp d3 = cqrp.d(20.0d);
        f = d3;
        a = cqjg.a();
        b = cqsg.d(d3, d2, d3);
        c = d3;
    }

    public ccpl(boolean z, ccxj ccxjVar) {
        super(ccxjVar, Boolean.valueOf(z));
        this.h = z;
        ccxj ccxjVar2 = ccxj.NONE;
        int ordinal = ccxjVar.ordinal();
        if (ordinal == 1) {
            this.g = e(z, 2131232882);
        } else if (ordinal == 2) {
            this.g = e(z, 2131232425);
        } else if (ordinal == 3) {
            this.g = e(z, 2131232706);
        } else if (ordinal == 4) {
            this.g = f(ibm.u(), z ? e : d, 2131232882, ibm.w());
        } else if (ordinal != 5) {
            this.g = null;
        } else {
            this.g = e(z, 2131232335);
        }
    }

    private static cqtd e(boolean z, int i) {
        return f(z ? ibm.i() : irg.p(), z ? e : d, i, z ? ibm.p() : ibm.b());
    }

    private static cqtd f(cqss cqssVar, cqtv cqtvVar, int i, cqss cqssVar2) {
        return cqtt.d(cqtt.i(cqtt.g(cqssVar), cqtvVar, cqtvVar), cqtt.h(cqrt.g(i, cqssVar2), 0.5f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ccxk> a() {
        cqmp cqmpVar;
        cqmj gq;
        cqmp[] cqmpVarArr = new cqmp[13];
        cqmpVarArr[0] = cqgr.dr(0);
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.bp(-2);
        if (this.h) {
            cqmpVar = cqgr.cH(bxra.a());
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr[3] = cqmpVar;
        cqtv cqtvVar = f;
        cqmpVarArr[4] = cqgr.dJ(cqtvVar);
        cqmpVarArr[5] = cqgr.x(irn.G());
        cqmpVarArr[6] = cqgr.cW(cqgr.q(ccpf.a));
        cqmpVarArr[7] = cqgr.J(true);
        cqmpVarArr[8] = cqgr.cs(ccpg.a);
        cqmpVarArr[9] = cqgr.dn(cqgr.s(ccph.a));
        cqmpVarArr[10] = iue.c(ccpi.a);
        cqmpVarArr[11] = cqgr.gc(cqgr.aD(cqjv.v(this.g)), cqgr.cd(-2), cqgr.bp(-1), cqgr.dF(cqtvVar), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.aJ(16), cqgr.eE(this.g));
        if (!this.h) {
            gq = cqgr.gq(cqmp.e, cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bq(ibn.a()), cqgr.eN(5), irn.j(), cqgr.aJ(16), cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.START), cqgr.eM(ccpk.a));
        } else {
            gq = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.bw(8388627), bxra.j(ccpj.a, cqkz.a(false), cqgr.bp(-1), cqgr.aJ(16), cqgr.fj(1), irn.j(), cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.START), cqmp.e));
        }
        cqmpVarArr[12] = gq;
        return cqgr.gd(cqmpVarArr);
    }
}
