package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bhmx  reason: default package */
/* loaded from: classes3.dex */
final class bhmx implements View.OnAttachStateChangeListener {
    final /* synthetic */ bhmz a;

    public bhmx(bhmz bhmzVar) {
        this.a = bhmzVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        aag aagVar = (aag) ((RecyclerView) view).l;
        if (aagVar != null) {
            aagVar.O(this.a.e);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
