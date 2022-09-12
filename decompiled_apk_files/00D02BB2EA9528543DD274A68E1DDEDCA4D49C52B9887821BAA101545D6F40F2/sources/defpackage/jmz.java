package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
/* compiled from: PG */
/* renamed from: jmz  reason: default package */
/* loaded from: classes7.dex */
public final class jmz {
    private static final dcqe a = dcqe.c("jmz");
    @dzsi
    private SparseArray<Parcelable> b;
    private int c;

    public final void a(View view) {
        if (view.getId() == -1) {
            bvoo.h("ID should be assigned to the root view", new Object[0]);
        }
        this.c = view.getId();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.b = sparseArray;
        view.saveHierarchyState(sparseArray);
    }

    public final void b(View view) {
        if (this.b == null) {
            return;
        }
        if (this.c != view.getId()) {
            bvoo.h("The same ID should be assigned to the view to restore the state", new Object[0]);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int i = this.c;
        sparseArray.put(i, this.b.get(i));
        this.b.remove(this.c);
        view.restoreHierarchyState(sparseArray);
        view.getViewTreeObserver().addOnPreDrawListener(new jmy(view, this.b));
        this.b = null;
        this.c = -1;
    }
}
