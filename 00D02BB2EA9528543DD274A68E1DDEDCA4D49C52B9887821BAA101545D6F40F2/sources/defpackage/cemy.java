package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: cemy  reason: default package */
/* loaded from: classes4.dex */
public final class cemy extends cqiw<cete> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cete ceteVar, Context context, cqiv cqivVar) {
        boolean z = true;
        for (cetb cetbVar : ceteVar.a()) {
            cqivVar.c(z ? new cemx() : new cena());
            cqivVar.a(new celg(), cetbVar);
            z = false;
        }
        cqivVar.c(new cemx());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cete> a() {
        return GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1), cqgr.bD(cenb.b), cqgr.z(ibm.b()), cqqx.G(), cqgr.ep(false));
    }
}
