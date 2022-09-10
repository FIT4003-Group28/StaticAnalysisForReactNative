package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: ya  reason: default package */
/* loaded from: classes7.dex */
final class ya implements PopupWindow.OnDismissListener {
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    final /* synthetic */ yb b;

    public ya(yb ybVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = ybVar;
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
