package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cqrf  reason: default package */
/* loaded from: classes.dex */
public final class cqrf implements cqrh {
    public final RecyclerView a;
    @dzsi
    public cqrh b;
    @dzsi
    public abw c;

    private cqrf(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public static final cqrf a(RecyclerView recyclerView) {
        cqrf cqrfVar = (cqrf) recyclerView.getTag(R.id.recycler_view_listener_manager);
        if (cqrfVar == null) {
            cqrf cqrfVar2 = new cqrf(recyclerView);
            cqrfVar2.b(recyclerView.k);
            recyclerView.setTag(R.id.recycler_view_listener_manager, cqrfVar2);
            return cqrfVar2;
        }
        return cqrfVar;
    }

    @Override // defpackage.cqrh
    public final void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        cqrh cqrhVar = this.b;
        if (cqrhVar != null) {
            cqrhVar.Rz(cqiwVar, cqkpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(abg<?> abgVar) {
        if (abgVar instanceof cqrj) {
            cqrj cqrjVar = (cqrj) abgVar;
            cqrjVar.e = this;
            cqrjVar.f = this;
        }
    }
}
