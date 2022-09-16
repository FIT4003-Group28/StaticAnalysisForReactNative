package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: ut  reason: default package */
/* loaded from: classes4.dex */
final class ut implements PopupWindow.OnDismissListener {
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    final /* synthetic */ uu b;

    public ut(uu uuVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = uuVar;
        this.a = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
