package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: cjyn  reason: default package */
/* loaded from: classes4.dex */
public final class cjyn extends cqiw<cjyo> {
    public static void e(cjzo cjzoVar, @dzsi cjyo cjyoVar, cqiv cqivVar) {
        if (cjyoVar == null) {
            return;
        }
        cjyw cjywVar = null;
        for (cjyw cjywVar2 : cjyoVar.a()) {
            cqiw<cqkp> a = cjzoVar.b.a(cjywVar, cjywVar2);
            if (a != null) {
                cqivVar.a(a, cjyl.a);
            }
            cqivVar.a(cjzoVar.f(cjywVar2.c()), cjywVar2);
            cjywVar = cjywVar2;
        }
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqjb<T, cqiv> cqjbVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> aw = GmmRecyclerView.aw(cqjbVar, cqgr.cd(-1), cqgr.bp(-1));
        aw.f(cqmpVarArr);
        return aw;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cjyo cjyoVar, Context context, cqiv cqivVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cjyo> a() {
        throw null;
    }
}
