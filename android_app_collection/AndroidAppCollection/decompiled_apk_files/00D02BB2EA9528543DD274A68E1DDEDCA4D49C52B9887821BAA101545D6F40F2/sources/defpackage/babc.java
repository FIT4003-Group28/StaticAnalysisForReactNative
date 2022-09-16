package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: babc  reason: default package */
/* loaded from: classes3.dex */
public final class babc extends cqiw<baem> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, baem baemVar, Context context, cqiv cqivVar) {
        baem baemVar2 = baemVar;
        if (baemVar2.a().booleanValue()) {
            cqivVar.a(new babj(), cqkp.T);
            return;
        }
        baye b = baemVar2.b();
        if (b.a().booleanValue()) {
            cqivVar.a(new bavs(), b);
        } else {
            cqivVar.f(new bavb(), baemVar2.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<baem> a() {
        return cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.z(ibm.b()), GmmRecyclerView.aw(C(), new cqmp[0]));
    }
}
