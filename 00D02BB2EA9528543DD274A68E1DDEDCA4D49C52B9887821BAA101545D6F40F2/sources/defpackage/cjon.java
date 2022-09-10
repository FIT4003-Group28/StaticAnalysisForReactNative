package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cjon  reason: default package */
/* loaded from: classes4.dex */
final class cjon implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ cjoo a;

    public cjon(cjoo cjooVar) {
        this.a = cjooVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        View view = this.a.aZ;
        if (view != null && view.isShown()) {
            cjoo cjooVar = this.a;
            if (cjooVar.ay.e(cjooVar.e)) {
                View view2 = this.a.aZ;
                dbsk.s(view2);
                view2.requestFocus();
                this.a.ay.c(view2, 8);
            }
            this.a.aZ = null;
        }
        cjoo cjooVar2 = this.a;
        if (cjooVar2.aP == null || (recyclerView = (RecyclerView) cqkx.e(cjooVar2.aQ.c(), agun.a, RecyclerView.class)) == null) {
            return true;
        }
        SparseArray<Parcelable> sparseArray = this.a.aP;
        dbsk.s(sparseArray);
        recyclerView.restoreHierarchyState(sparseArray);
        this.a.aP = null;
        return false;
    }
}
