package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uv  reason: default package */
/* loaded from: classes7.dex */
public final class uv implements View.OnAttachStateChangeListener {
    final /* synthetic */ uz a;

    public uv(uz uzVar) {
        this.a = uzVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.e = view.getViewTreeObserver();
            }
            uz uzVar = this.a;
            uzVar.e.removeGlobalOnLayoutListener(uzVar.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
