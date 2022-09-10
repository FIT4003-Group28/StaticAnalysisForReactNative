package defpackage;

import android.text.TextWatcher;
import android.view.View;
/* compiled from: PG */
/* renamed from: cblv  reason: default package */
/* loaded from: classes4.dex */
public final class cblv {
    private static final cqfc a = new cblu();

    public static <T extends cqkp> cqmj<T> a(cqlc<T, cqtd> cqlcVar) {
        return ict.b(cqlcVar, cqgr.cd(-2), cqgr.bp(-2), cqgr.bV(cqrp.d(18.0d)), cqgr.dF(cqrp.d(20.0d)));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, String> cqlcVar, cqlc<T, String> cqlcVar2, cqlc<T, String> cqlcVar3, cqlc<T, TextWatcher> cqlcVar4, cqlc<T, View.OnFocusChangeListener> cqlcVar5, cqlc<T, Integer> cqlcVar6, cqlc<T, Integer> cqlcVar7, cqmn<T> cqmnVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = ibh.a(ibh.e(cqlcVar2), ibh.i(true), ibh.h(cqlcVar3), ibh.p(), c(cqlcVar, cqlcVar4, cqlcVar5, cqlcVar6, cqlcVar7, cqmnVar));
        a2.f(cqmpVarArr);
        return a2;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqlc<T, String> cqlcVar, cqlc<T, TextWatcher> cqlcVar2, cqlc<T, View.OnFocusChangeListener> cqlcVar3, cqlc<T, Integer> cqlcVar4, cqlc<T, Integer> cqlcVar5, cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = ibg.a(cqgr.cH(cqrp.d(48.0d)), cqgr.aJ(8388659), ibq.o(), cqgr.fh(cqrp.f(16.0d)), cqgr.bf(cqlcVar4), cqgr.aV(cqlcVar5), cqgr.eM(cqlcVar), cqgr.dp(cqlcVar2), cqgr.dg(cqlcVar3), cqgr.fD(a));
        a2.f(cqmpVarArr);
        return a2;
    }
}
