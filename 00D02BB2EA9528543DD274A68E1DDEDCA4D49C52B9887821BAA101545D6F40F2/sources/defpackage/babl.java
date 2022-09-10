package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: babl  reason: default package */
/* loaded from: classes3.dex */
public final class babl extends cqiw<baeq> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, baeq baeqVar, Context context, cqiv cqivVar) {
        baeq baeqVar2 = baeqVar;
        if (baeqVar2.a().booleanValue()) {
            cqivVar.a(new babj(), cqkp.T);
            return;
        }
        baye b = baeqVar2.b();
        if (b.a().booleanValue()) {
            cqivVar.a(new bavs(), b);
            return;
        }
        cqivVar.a(new bawh(), baeqVar2.c());
        baqh d = baeqVar2.d();
        if (d != null) {
            cqivVar.a(new bane(), d);
        }
        cqivVar.f(new baxb(cqrp.d(dcyn.a)), baeqVar2.e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<baeq> a() {
        return cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.z(ibm.b()), GmmRecyclerView.aw(C(), new cqmp[0]));
    }
}
