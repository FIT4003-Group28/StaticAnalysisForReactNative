package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: jmy  reason: default package */
/* loaded from: classes7.dex */
final class jmy implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ SparseArray b;

    public jmy(View view, SparseArray sparseArray) {
        this.a = view;
        this.b = sparseArray;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.a.getHeight() > 0) {
            this.a.restoreHierarchyState(this.b);
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
        return false;
    }
}
