package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: eew  reason: default package */
/* loaded from: classes.dex */
final class eew implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ efa a;

    public eew(efa efaVar) {
        this.a = efaVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup b = this.a.b();
        if (b == null || !this.a.a || b.getChildCount() <= 0) {
            return;
        }
        View childAt = b.getChildAt(0);
        efa.a(childAt, b);
        if (b.getLayoutParams().height == childAt.getMeasuredHeight()) {
            return;
        }
        b.getLayoutParams().height = childAt.getMeasuredHeight();
        b.requestLayout();
    }
}
