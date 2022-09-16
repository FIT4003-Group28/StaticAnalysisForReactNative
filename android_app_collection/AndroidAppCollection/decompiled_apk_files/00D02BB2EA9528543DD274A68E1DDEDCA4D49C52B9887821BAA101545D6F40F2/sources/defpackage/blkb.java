package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: blkb  reason: default package */
/* loaded from: classes3.dex */
final class blkb implements View.OnAttachStateChangeListener {
    final /* synthetic */ blkh a;

    public blkb(blkh blkhVar) {
        this.a = blkhVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        blkh blkhVar = this.a;
        if (!blkhVar.c) {
            onViewDetachedFromWindow(view);
        } else if (!(view instanceof RecyclerView)) {
            onViewDetachedFromWindow(view);
        } else {
            RecyclerView recyclerView = (RecyclerView) view;
            blkhVar.e = recyclerView;
            recyclerView.setOnHierarchyChangeListener(blkhVar.g);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.e = null;
    }
}
