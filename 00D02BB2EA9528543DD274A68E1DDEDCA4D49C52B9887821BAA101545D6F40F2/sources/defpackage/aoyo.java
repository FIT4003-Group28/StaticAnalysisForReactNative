package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aoyo  reason: default package */
/* loaded from: classes2.dex */
public final class aoyo extends cqiw<apho> {
    private final ckln<apho> a = new ckln<>();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, apho aphoVar, Context context, cqiv cqivVar) {
        cklj b = this.a.b(cqivVar, 2, aozr.b.e(context));
        for (aphp aphpVar : aphoVar.a()) {
            b.a(new aoyx(), aphpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<apho> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(ibn.d()), cqgr.bR(ibn.d()), cqgr.bG(ibn.d()), GmmRecyclerView.aw(C(), cqgr.bp(-2), cqgr.cd(-1), cqgr.ep(false), cqgr.aR(Integer.valueOf((int) R.id.list_view)), ckln.a(this.a)));
    }
}
