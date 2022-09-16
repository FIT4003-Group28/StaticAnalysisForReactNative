package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: anuj  reason: default package */
/* loaded from: classes2.dex */
public final class anuj extends cqiw<anzq> {
    private static final dcqe b = dcqe.c("anuj");
    public static final cqtc a = cqrp.f(72.0d);
    private static final cqjb<anzq, abx> c = new anud();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, anzq anzqVar, Context context, cqiv cqivVar) {
        cqiw anwhVar;
        Object obj;
        anzq anzqVar2 = anzqVar;
        cqivVar.a(new anui(), anzqVar2);
        aoct m = anzqVar2.m();
        if (m != null) {
            cqivVar.a(new aocs(), m);
        }
        if (anzqVar2.l().a()) {
            cqivVar.a(new aokr(), anzqVar2.l().b());
        }
        for (anuk anukVar : anzqVar2.h()) {
            anukVar.b(cqivVar.i());
            if (anukVar instanceof anxw) {
                anwhVar = new anwh();
                obj = (anxw) anukVar;
            } else if (anukVar instanceof anzn) {
                anwhVar = new anyy();
                obj = (anzn) anukVar;
            } else if (anukVar instanceof anua) {
                anwhVar = new antz();
                obj = (anua) anukVar;
            } else {
                bvoo.h("Unsupported view model type %s", anukVar.getClass().getSimpleName());
            }
            cqivVar.a(anwhVar, obj);
        }
        jam j = anzqVar2.j();
        if (j == null || !j.a().booleanValue()) {
            return;
        }
        cqivVar.a(new gmf(), j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<anzq> a() {
        return GmmRecyclerView.aw(C(), cqgr.aT(apkj.a), iue.c(anuc.a), cqqx.u(c));
    }
}
