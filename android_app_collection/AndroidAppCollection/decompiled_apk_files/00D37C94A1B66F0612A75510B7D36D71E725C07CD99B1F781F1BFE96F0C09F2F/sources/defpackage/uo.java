package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: uo  reason: default package */
/* loaded from: classes4.dex */
public final class uo implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ AppCompatSpinner a;

    public uo(AppCompatSpinner appCompatSpinner) {
        this.a = appCompatSpinner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.b.u()) {
            this.a.b();
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
