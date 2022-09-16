package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahie  reason: default package */
/* loaded from: classes2.dex */
public final class ahie implements View.OnAttachStateChangeListener {
    final /* synthetic */ ahin a;

    public ahie(ahin ahinVar) {
        this.a = ahinVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        RecyclerView recyclerView = (RecyclerView) cqkx.e(view, agun.a, RecyclerView.class);
        if (recyclerView != null) {
            this.a.p = new WeakReference<>(recyclerView);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
