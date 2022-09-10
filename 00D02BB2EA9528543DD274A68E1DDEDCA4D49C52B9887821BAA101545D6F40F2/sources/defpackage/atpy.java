package defpackage;

import defpackage.atxw;
/* compiled from: PG */
/* renamed from: atpy  reason: default package */
/* loaded from: classes2.dex */
public abstract class atpy<T extends atxw> extends cqiw<T> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    public static final cqrp c = cqrp.d(28.0d);
    public static final cqrp d = cqrp.d(32.0d);
    public static final cqrp e = cqrp.d(56.0d);

    public static void f(atxw atxwVar, cqiv cqivVar) {
        if (atxwVar instanceof atxy) {
            atxy atxyVar = (atxy) atxwVar;
            if (atxyVar.n().booleanValue()) {
                cqivVar.a(new atpx(), atxyVar);
            } else {
                cqivVar.a(new atpu(), atxyVar);
            }
        } else if (atxwVar.q().booleanValue()) {
            cqivVar.a(new atps(), atxwVar);
        } else {
            cqivVar.a(new atpv(), atxwVar);
        }
    }

    public static void g(cqiv cqivVar, atxz atxzVar) {
        cqivVar.a(new atpw(), atxzVar);
    }

    public static <T extends atxw> cqjb<T, cqtd> k() {
        return new atpr();
    }

    public static <T extends atxw> cqss l(T t) {
        if (t.j() == null) {
            return cqta.f();
        }
        if (t.j() == atxv.EXIT || t.j() == atxv.EDIT) {
            return iva.b(ibl.P(), ibl.O());
        }
        if (t.j() == atxv.ADD_PARKING || t.j() == atxv.NAV_CORE_ARRIVAL) {
            return iva.b(ibl.H(), ibl.b());
        }
        return iva.b(ibl.d(), ibl.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<T> h(cqmp<T>... cqmpVarArr) {
        Boolean m = m();
        cqmn a2 = cqmn.a(cqgr.cd(-2), cqgr.ca(Float.valueOf(0.0f)));
        cqmp[] cqmpVarArr2 = {cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f))};
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.cU(((atxw) B()).c()), iue.b(((atxw) B()).l()));
        fY.f(cqmpVarArr);
        return cqgr.fY(cqgr.bq(e), cqjv.m(m, a2, cqmn.a(cqmpVarArr2)), cqjv.k(m(), cqgr.dQ(cqrp.d(dcyn.a)), cqgr.dQ(irh.c())), cqgr.dF(irh.c()), fY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<T> i(cqss cqssVar, cqss cqssVar2, dbsg<cqiw<izo>> dbsgVar) {
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[6];
        cqmpVarArr[0] = cqjv.k(m(), cqgr.cd(-2), cqgr.cd(-1));
        cqmpVarArr[1] = cqgr.bp(-1);
        cqmpVarArr[2] = cqqx.g(c);
        cqmpVarArr[3] = cqjv.k(((atxw) B()).r(), cqqx.i(cqrp.d(dcyn.a)), cqqx.i(cqrp.d(2.0d)));
        cqmpVarArr[4] = cqqx.d(cqssVar);
        cqmp[] cqmpVarArr2 = new cqmp[4];
        cqmpVarArr2[0] = cqjv.k(m(), cqgr.cd(-2), cqgr.cd(-1));
        cqmpVarArr2[1] = cqgr.bp(-1);
        if (dbsgVar.a()) {
            cqmpVar = cqgr.fO(dbsgVar.b(), ((atxy) B()).b(), new cqmp[0]);
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr2[2] = cqmpVar;
        cqmpVarArr2[3] = j(cqssVar2, ((atxw) B()).g(), new cqmp[0]);
        cqmpVarArr[5] = cqgr.gj(cqmpVarArr2);
        return cqqx.E(cqmpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<T> j(@dzsi cqss cqssVar, cqsn cqsnVar, cqmp<T>... cqmpVarArr) {
        cqnf fm;
        cqnf eU;
        cqmp[] cqmpVarArr2 = new cqmp[7];
        cqmpVarArr2[0] = cqjv.k(m(), cqgr.cd(-2), cqgr.cd(-1));
        cqmpVarArr2[1] = cqgr.bp(-1);
        cqmpVarArr2[2] = cqjv.m(m(), cqmn.a(cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d))), cqmn.a(cqgr.dQ(cqrp.d(6.0d)), cqgr.dF(cqrp.d(6.0d))));
        cqmpVarArr2[3] = cqgr.aJ(17);
        cqmpVarArr2[4] = cqgr.aT(a);
        cqmp[] cqmpVarArr3 = new cqmp[7];
        cqmpVarArr3[0] = cqic.b(cqjv.w(k()), new cqmp[0]);
        cqrp cqrpVar = d;
        cqmpVarArr3[1] = cqgr.ce(cqrpVar);
        cqmpVarArr3[2] = cqgr.bq(cqrpVar);
        cqmpVarArr3[3] = cqgr.dQ(cqrp.d(4.0d));
        cqmpVarArr3[4] = cqgr.dF(cqrp.d(8.0d));
        if (cqssVar == null) {
            fm = cqgr.fn(atpp.a);
        } else {
            fm = cqgr.fm(cqssVar);
        }
        cqmpVarArr3[5] = fm;
        cqmpVarArr3[6] = cqgr.eF(k());
        cqmpVarArr2[5] = cqgr.gc(cqmpVarArr3);
        cqmp[] cqmpVarArr4 = new cqmp[9];
        cqmpVarArr4[0] = cqgr.cd(-2);
        cqmpVarArr4[1] = cqgr.bp(-2);
        cqmpVarArr4[2] = cqgr.dF(cqrp.d(4.0d));
        cqmpVarArr4[3] = ibq.z();
        cqmpVarArr4[4] = ibq.r();
        cqmpVarArr4[5] = cqgr.fh(cqrp.d(18.0d));
        cqmpVarArr4[6] = cqgr.aZ(false);
        if (cqssVar == null) {
            eU = cqgr.eW(atpq.a);
        } else {
            eU = cqgr.eU(cqssVar);
        }
        cqmpVarArr4[7] = eU;
        cqmpVarArr4[8] = cqgr.eJ(cqsnVar);
        cqmpVarArr2[6] = cqgr.gq(cqmpVarArr4);
        cqmj<T> gd = cqgr.gd(cqmpVarArr2);
        gd.f(cqmpVarArr);
        return gd;
    }

    public final Boolean m() {
        return cqjv.r(E(), cqjv.u(((atxw) B()).v()));
    }
}
