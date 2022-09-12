package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
/* compiled from: PG */
/* renamed from: bvpd  reason: default package */
/* loaded from: classes.dex */
final class bvpd implements View.OnAttachStateChangeListener {
    final /* synthetic */ bvpe a;
    private SparseArray<Parcelable> b = new SparseArray<>();
    private long c = -1;

    public bvpd(bvpe bvpeVar) {
        this.a = bvpeVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        long e = this.a.a.e();
        long j = this.c;
        if (j <= 0 || e - j <= 120000) {
            view.restoreHierarchyState(this.b);
            return;
        }
        this.b = new SparseArray<>();
        this.c = -1L;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.saveHierarchyState(this.b);
        this.c = this.a.a.e();
    }
}
