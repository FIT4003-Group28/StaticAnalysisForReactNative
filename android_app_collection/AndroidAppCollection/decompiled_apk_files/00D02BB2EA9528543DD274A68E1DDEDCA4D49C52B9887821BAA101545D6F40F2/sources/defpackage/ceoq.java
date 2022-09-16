package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: ceoq  reason: default package */
/* loaded from: classes4.dex */
public final class ceoq extends cqiw<cete> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cete ceteVar, Context context, cqiv cqivVar) {
        cete ceteVar2 = ceteVar;
        boolean z = true;
        for (cetj cetjVar : ceteVar2.b()) {
            cqivVar.c(z ? new ceop() : new ceov());
            cqivVar.a(new cert(), cetjVar);
            z = false;
        }
        jad s = ceteVar2.s();
        if (s != null) {
            cqivVar.a(new ceou(), s);
        }
        cqivVar.c(new ceop());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cete> a() {
        return GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1), cqgr.bD(ceow.b), cqgr.z(ibm.b()), cqqx.G(), cqgr.ep(false));
    }
}
