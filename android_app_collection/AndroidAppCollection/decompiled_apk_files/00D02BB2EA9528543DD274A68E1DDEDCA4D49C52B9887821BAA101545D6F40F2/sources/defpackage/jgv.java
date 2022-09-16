package defpackage;

import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: jgv  reason: default package */
/* loaded from: classes7.dex */
public final class jgv {
    public static final cqjg a = cqjg.a();

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqjb<T, cqiv> cqjbVar, cqmp<T>... cqmpVarArr) {
        return b(cqjbVar, 64, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqjb<T, cqiv> cqjbVar, int i, cqmp<T>... cqmpVarArr) {
        double d = -i;
        double d2 = i;
        cqmj<T> aw = GmmRecyclerView.aw(cqjbVar, cqgr.aT(a), cqgr.bp(-2), cqgr.cd(-1), cqgr.bR(cqrp.d(d)), cqgr.bG(cqrp.d(d)), cqgr.dQ(cqrp.d(d2)), cqgr.dF(cqrp.d(d2)), cqgr.L(false), cqgr.P(false), cqqx.G(), cqgr.ep(false));
        aw.f(cqmpVarArr);
        return aw;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(jgu.class, cqgr.cd(-1), cqgr.bp(-2), cqgr.L(false), cqgr.P(false));
        cqmhVar.f(cqmpVarArr);
        return cqmhVar;
    }
}
