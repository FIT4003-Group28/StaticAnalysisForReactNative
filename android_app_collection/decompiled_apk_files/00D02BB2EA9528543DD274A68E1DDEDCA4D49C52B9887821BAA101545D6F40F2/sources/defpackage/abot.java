package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: abot  reason: default package */
/* loaded from: classes2.dex */
public final class abot extends cqiw<izf<abom>> {
    private static final cqtv a = cqsv.f(8.0d, 8.0d, 20.0d, 8.0d);
    private final ckln<izf<abom>> b = new ckln<>();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, izf<abom> izfVar, Context context, cqiv cqivVar) {
        this.b.b(cqivVar, 2, cqrp.d(8.0d).e(context)).b(new abok(), izfVar.Pd());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izf<abom>> a() {
        cqtv cqtvVar = a;
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.bV(cqrp.d(16.0d)), cqgr.bD(cqrp.d(16.0d)), cqgr.bR(cqtvVar), cqgr.bG(cqtvVar), GmmRecyclerView.aw(C(), cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(1), ckln.a(this.b)));
    }
}
