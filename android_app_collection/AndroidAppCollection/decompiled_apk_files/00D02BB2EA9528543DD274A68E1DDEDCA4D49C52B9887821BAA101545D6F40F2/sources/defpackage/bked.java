package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
/* compiled from: PG */
/* renamed from: bked  reason: default package */
/* loaded from: classes3.dex */
final class bked implements View.OnAttachStateChangeListener {
    private final SparseArray<Parcelable> a = new SparseArray<>();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.restoreHierarchyState(this.a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.saveHierarchyState(this.a);
    }
}
