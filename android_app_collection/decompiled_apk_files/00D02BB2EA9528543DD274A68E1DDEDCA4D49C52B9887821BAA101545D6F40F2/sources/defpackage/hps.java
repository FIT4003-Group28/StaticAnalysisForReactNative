package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: hps  reason: default package */
/* loaded from: classes.dex */
public class hps extends cqiw<izs> {
    private static final cqss f = ibm.w();
    private static final cqss g = cqta.f();
    private static final cqss h = ibm.n();
    public static final cqtv a = cqsv.d(cqrp.d(8.0d), cqrp.d(16.0d));
    private static final cqjb<izs, cqtv> i = new hpm();
    static final cqjb<izs, Integer> b = new hpn();
    static final cqjb<izs, Integer> c = new hpo();
    private static final cqjb<izs, cqtv> j = new hpp();
    public static final cqjb<izs, cqfc> d = hpb.a;
    public static final cqjb<izs, cqfc> e = hpc.a;

    public static cqfc d(boolean z, @dzsi Integer num, @dzsi ird irdVar) {
        return new hpr(num, z, irdVar);
    }

    public static int e(Context context) {
        return jmj.a(context, 48) + ibn.w().e(context) + ibn.x().e(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final cqmj<izs> f(@dzsi final ird irdVar) {
        boolean z = ((btvq) btsr.a(btvq.class)).rp().getHomeScreenParameters().m;
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = z ? cqic.c(cqjv.x(hov.a), new cqmp[0]) : cqgr.aF(cqjv.x(hpd.a));
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.bp(-2);
        cqmpVarArr[3] = cqgr.bw(80);
        cqss cqssVar = f;
        cqss cqssVar2 = g;
        cqmpVarArr[4] = cqgr.fP(new hms(cqssVar, cqssVar2, h, cqssVar2, cqrp.d(dcyn.a)), hpe.a, new cqmp[0]);
        cqmj fY = cqgr.fY(cqmpVarArr);
        cqmp[] cqmpVarArr2 = new cqmp[7];
        cqmpVarArr2[0] = cqgr.aT(izs.d);
        cqmpVarArr2[1] = cqgr.cd(-1);
        cqmpVarArr2[2] = cqgr.bp(-1);
        cqmpVarArr2[3] = cqgr.P(false);
        cqmpVarArr2[4] = cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.y(hpf.a), cqgr.j(hpg.a));
        cqmp[] cqmpVarArr3 = new cqmp[8];
        cqmpVarArr3[0] = cqgr.cd(-1);
        cqmpVarArr3[1] = cqgr.bp(-1);
        cqmpVarArr3[2] = cqgr.dr(1);
        cqmpVarArr3[3] = cqgr.dX(new cqlc(irdVar) { // from class: hph
            private final ird a;

            {
                this.a = irdVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                ird irdVar2 = this.a;
                cqtv cqtvVar = hps.a;
                return (!((izs) cqkpVar).x().booleanValue() || irdVar2 == null) ? cqrp.d(dcyn.a) : irdVar2;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr3[4] = cqgr.P(false);
        cqjb<izs, cqtv> cqjbVar = i;
        cqmpVarArr3[5] = cqqx.E(cqgr.aT(hqv.d), cqgr.cd(-1), cqqx.d(ibl.a()), cqqx.g(cqrp.d(24.0d)), cqqx.B(true), cqqx.y(false), cqqx.s(cqrp.d(6.0d)), cqqx.j(hpi.a), cqgr.bW(b), cqgr.bE(c), cqgr.bS(cqjbVar), cqjv.o(hpj.a, cqgr.bH(j), cqgr.bH(cqjbVar)), cqgr.gd(cqjv.l(hpk.a, h(ibl.a(), ibm.Y(), cqrp.d(1.0d), cqrp.d(24.0d)), h(ibm.ab(), ibm.ac(), iva.i(cqrp.d(dcyn.a), cqrp.d(1.0d)), cqrp.d(24.0d))), cqgr.dr(1), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.fP(new hou(), hpl.a, new cqmp[0]), fY)));
        cqmp[] cqmpVarArr4 = new cqmp[2];
        cqmpVarArr4[0] = z ? cqic.f(how.a, new cqmp[0]) : cqmp.e;
        cqmpVarArr4[1] = cqgr.fR(new hqs(), hox.a, new cqmp[0]);
        cqmpVarArr3[6] = cqgr.fY(cqmpVarArr4);
        cqmp[] cqmpVarArr5 = new cqmp[2];
        cqmpVarArr5[0] = z ? cqic.c(cqjv.x(hoy.a), new cqmp[0]) : cqmp.e;
        cqmpVarArr5[1] = cqgr.fR(new brxo(), hoz.a, new cqmp[0]);
        cqmpVarArr3[7] = cqgr.fY(cqmpVarArr5);
        cqmpVarArr2[5] = cqgr.gd(cqmpVarArr3);
        cqmpVarArr2[6] = cqgr.fE(hpa.a);
        return cqgr.fY(cqmpVarArr2);
    }

    private static cqnf<izs> h(cqss cqssVar, cqss cqssVar2, cqtv cqtvVar, cqtv cqtvVar2) {
        return cqgr.x(aclp.a(cqssVar, cqssVar2, cqtvVar, cqtvVar2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<izs> a() {
        return f(ird.b());
    }
}
