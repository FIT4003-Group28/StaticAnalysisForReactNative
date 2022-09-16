package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: babk  reason: default package */
/* loaded from: classes3.dex */
public final class babk extends cqiw<baep> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, baep baepVar, Context context, cqiv cqivVar) {
        baep baepVar2 = baepVar;
        if (baepVar2.a().booleanValue()) {
            cqivVar.a(new babj(), cqkp.T);
            return;
        }
        baye b = baepVar2.b();
        if (b.a().booleanValue()) {
            cqivVar.a(new bavs(), b);
        } else {
            cqivVar.f(new baxb(cqrp.d(dcyn.a)), baepVar2.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<baep> a() {
        return cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.z(ibm.b()), GmmRecyclerView.aw(C(), new cqmp[0]));
    }
}
