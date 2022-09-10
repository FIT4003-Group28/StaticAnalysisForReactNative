package defpackage;
/* compiled from: PG */
/* renamed from: citi  reason: default package */
/* loaded from: classes4.dex */
final class citi extends cqiw<citj> {
    private static final cquv a = cquy.c(cqrp.d(20.0d));
    private static final cqss b;
    private static final cqss c;
    private static final cqss d;
    private final cqrp e;
    private final cqrp f;

    static {
        cquy.c(cqrp.d(16.0d));
        b = ibm.j();
        c = ibm.b();
        d = ibm.x();
        ibm.p();
    }

    public citi(cqrp cqrpVar, cqrp cqrpVar2) {
        this.e = cqrpVar;
        this.f = cqrpVar2;
    }

    public static <T extends cqkp> cqmn<T> e(cqss cqssVar, cqrp cqrpVar, cqrp cqrpVar2) {
        cquv cquvVar = a;
        cqtd d2 = cqtt.d(cqtt.o(cquvVar, cqssVar, cqrp.d(1.0d)), cqtt.n(cquvVar, b, cqrp.d(1.0d)));
        cqrp d3 = cqrp.d(1.0d);
        return cqmn.a(cqgr.bq(cqrp.d(40.0d)), cqgr.dL(cqrp.d(8.0d)), cqgr.dQ(cqrp.d(12.0d)), cqgr.dF(cqrp.d(16.0d)), cqgr.x(cqtt.e(d2, d3, d3, d3, d3)), cqgr.aJ(8388627), cqgr.bR(cqrpVar), cqgr.bG(cqrpVar2));
    }

    public static <T extends cqkp> cqmn<T> f(cqss cqssVar) {
        return cqmn.a(cqgr.cd(-2), cqgr.cL(cqrp.d(76.0d)), ibq.i(), cqgr.eU(cqssVar));
    }

    @Override // defpackage.cqiw
    public final cqmj<citj> a() {
        return cqgr.fY(cqgr.bq(ibn.a()), cqgr.cW(cqgr.q(cite.a)), iue.c(citf.a), cqgr.gd(e(c, this.e, this.f), cqgr.bw(16), cqgr.gc(cqgr.bq(cqrp.d(18.0d)), cqgr.ce(cqrp.d(18.0d)), cqgr.bG(cqrp.d(8.0d)), cqgr.eG(citg.a)), cqgr.gq(f(d), cqgr.eM(cith.a))));
    }
}
