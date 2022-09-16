package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awrr  reason: default package */
/* loaded from: classes3.dex */
public final class awrr extends cqiw<awts> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<awts> a() {
        final cqmj<awts> e = e(true);
        final cqmj<awts> e2 = e(false);
        return cqgr.gv(iue.b(cjtd.a(dtyb.J)), cqgr.cd(-1), cqgr.bp(-2), cqgr.cF(true), cqgr.o(false), cqgr.aY(bfzu.b()), cqgr.du(bfzu.c()), cqgr.ad(new cqlc(e, e2) { // from class: awrk
            private final cqmj a;
            private final cqmj b;

            {
                this.a = e;
                this.b = e2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqmj cqmjVar = this.a;
                cqmj cqmjVar2 = this.b;
                cqjg cqjgVar = awrr.a;
                return ((awts) cqkpVar).b().booleanValue() ? cqmjVar.c() : cqmjVar2.c();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cW(cqgr.q(awrl.a)), e, e2);
    }

    private static cqmj<awts> e(boolean z) {
        cqmp[] cqmpVarArr = new cqmp[9];
        cqmpVarArr[0] = cqgr.aT(z ? a : b);
        cqmpVarArr[1] = cqgr.dQ(irh.b());
        cqmpVarArr[2] = cqgr.dU(cqrp.d(20.0d));
        cqmpVarArr[3] = cqgr.dB(cqrp.d(16.0d));
        cqmpVarArr[4] = cqgr.bp(-2);
        cqmpVarArr[5] = cqgr.cd(-1);
        cqmpVarArr[6] = cqgr.z(z ? ibm.x() : null);
        cqmp[] cqmpVarArr2 = new cqmp[6];
        cqmpVarArr2[0] = cqgr.dr(1);
        cqmpVarArr2[1] = cqgr.bp(-2);
        cqmpVarArr2[2] = cqgr.cd(0);
        cqmpVarArr2[3] = cqgr.ca(Float.valueOf(1.0f));
        cqmp[] cqmpVarArr3 = new cqmp[6];
        cqmpVarArr3[0] = cqgr.eN(5);
        cqmpVarArr3[1] = irn.r();
        cqmpVarArr3[2] = cqgr.eU(z ? irg.a() : irg.J());
        cqmpVarArr3[3] = z ? cqmp.e : irn.E();
        cqmpVarArr3[4] = cqgr.co(cqrp.f(3.0d), false);
        cqmpVarArr3[5] = cqgr.eL(Integer.valueOf((int) R.string.PARKING_LOCATION_SHEET_HEADER_TITLE));
        cqmpVarArr2[4] = cqgr.gq(cqmpVarArr3);
        cqmp[] cqmpVarArr4 = new cqmp[3];
        cqmpVarArr4[0] = cqgr.aJ(16);
        cqmp[] cqmpVarArr5 = new cqmp[5];
        cqmpVarArr5[0] = cqgr.eN(5);
        cqmpVarArr5[1] = irn.m();
        cqmpVarArr5[2] = cqgr.eU(z ? irg.a() : irg.J());
        cqmpVarArr5[3] = z ? cqmp.e : irn.E();
        cqmpVarArr5[4] = cqgr.eM(awrm.a);
        cqmpVarArr4[1] = cqgr.gq(cqmpVarArr5);
        cqmpVarArr4[2] = bfgf.b(cqkz.a(z ? irg.a() : irg.k()), irn.m(), awro.a, awrp.a, cqkz.a(Boolean.TRUE), cqgr.aF(cqjv.x(awrq.a)));
        cqmpVarArr2[5] = cqgr.gd(cqmpVarArr4);
        cqmpVarArr[7] = cqgr.gd(cqmpVarArr2);
        cqmpVarArr[8] = z ? cqmp.e : cqgr.gd(cqgr.bw(8388629), cqgr.aH(cqhf.a), cqgr.fP(new gzl(), awrn.a, new cqmp[0]));
        return cqgr.gd(cqmpVarArr);
    }
}
