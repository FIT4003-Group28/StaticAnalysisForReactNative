package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: xv  reason: default package */
/* loaded from: classes7.dex */
final class xv implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ye a;

    public xv(ye yeVar) {
        this.a = yeVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.b.m()) {
            this.a.b();
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
