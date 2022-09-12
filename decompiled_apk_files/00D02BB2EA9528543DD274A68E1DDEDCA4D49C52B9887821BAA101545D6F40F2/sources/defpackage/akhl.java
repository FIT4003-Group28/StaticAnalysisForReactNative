package defpackage;

import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: akhl  reason: default package */
/* loaded from: classes2.dex */
final class akhl implements ViewTreeObserver.OnGlobalLayoutListener {
    private final akky a;
    private final TextView b;

    public akhl(akky akkyVar, TextView textView) {
        this.a = akkyVar;
        this.b = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        Layout layout = this.b.getLayout();
        if (layout != null && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
            this.a.h();
        }
    }
}
