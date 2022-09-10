package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oah  reason: default package */
/* loaded from: classes7.dex */
public final class oah extends cqiw<oxg> {
    private static final dcqe b = dcqe.c("oah");
    public static final cqjg a = cqjg.a();

    public static void d(cjzo cjzoVar, oxg oxgVar, cqiv cqivVar) {
        cjyo a2 = oxgVar.a();
        if (a2 == null) {
            bvoo.h("cardListViewModel is not initialized yet.", new Object[0]);
        } else if (oxgVar.c().booleanValue()) {
            cjyl.a(cjzoVar, a2.a().get(0), cqivVar);
        } else {
            cjyn.e(cjzoVar, a2, cqivVar);
        }
    }

    public static void e(oxg oxgVar, cqiv cqivVar) {
        oag oagVar = new oag();
        if (oxgVar.d().booleanValue()) {
            cqivVar.a(oagVar, oxgVar.e());
        }
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqmp<T>... cqmpVarArr) {
        cqmj<T> s = itj.s(cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(17), cqgr.fI(0));
        s.f(cqmpVarArr);
        return s;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, oxg oxgVar, Context context, cqiv cqivVar) {
        oxg oxgVar2 = oxgVar;
        d(cjzp.a(context), oxgVar2, cqivVar);
        if (!oxgVar2.b().booleanValue()) {
            e(oxgVar2, cqivVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<oxg> a() {
        return cqgr.fY(cjyn.f(C(), cqgr.aR(Integer.valueOf(oah.class.hashCode())), cqgr.y(oad.a), cqqx.x(oae.a), cqgr.aT(a)), f(cqgr.aI(oaf.a)));
    }
}
