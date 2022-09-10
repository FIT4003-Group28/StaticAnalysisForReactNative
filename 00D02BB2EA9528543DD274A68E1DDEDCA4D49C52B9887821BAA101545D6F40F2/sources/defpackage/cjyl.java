package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cjyl  reason: default package */
/* loaded from: classes4.dex */
public final class cjyl {
    static final cqkp a = new cjyk();

    public static void a(cjzo cjzoVar, cjyw cjywVar, cqiv cqivVar) {
        b(cjzoVar, cjywVar.b(), cqivVar);
    }

    public static void b(cjzo cjzoVar, List<cjyv<?>> list, cqiv cqivVar) {
        cjyv<?> cjyvVar = null;
        for (cjyv<?> cjyvVar2 : list) {
            cqiw<cqkp> b = cjzoVar.b.b(cjyvVar, cjyvVar2);
            if (b != null) {
                cqivVar.a(b, a);
            }
            c(cjyvVar2, cqivVar);
            cjyvVar = cjyvVar2;
        }
    }

    public static <T extends cqkp> void c(cjyv<T> cjyvVar, cqiv cqivVar) {
        cqivVar.a(cjyvVar.a, cjyvVar.c);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqmp<T>... cqmpVarArr) {
        cqmj<T> E = cqqx.E(cqgr.cd(-1), cqgr.bp(-2), cqqx.d(ibm.Z()), cqqx.B(true), cqqx.s(cqrp.d(4.0d)), cqqx.i(cqrp.d(2.0d)), cqgr.bR(e()), cqgr.bG(e()));
        E.f(cqmpVarArr);
        return E;
    }

    public static cqtv e() {
        return cqsv.f(4.0d, 4.0d, 12.0d, 12.0d);
    }
}
