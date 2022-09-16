package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sz  reason: default package */
/* loaded from: classes4.dex */
public final class sz implements View.OnAttachStateChangeListener {
    final /* synthetic */ ta a;

    public sz(ta taVar) {
        this.a = taVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.d = view.getViewTreeObserver();
            }
            ta taVar = this.a;
            taVar.d.removeGlobalOnLayoutListener(taVar.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
