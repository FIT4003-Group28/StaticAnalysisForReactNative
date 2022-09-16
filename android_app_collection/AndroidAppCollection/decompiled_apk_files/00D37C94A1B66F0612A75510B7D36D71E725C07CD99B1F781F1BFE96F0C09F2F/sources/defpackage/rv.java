package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rv  reason: default package */
/* loaded from: classes4.dex */
public final class rv implements View.OnAttachStateChangeListener {
    final /* synthetic */ rz a;

    public rv(rz rzVar) {
        this.a = rzVar;
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
            rz rzVar = this.a;
            rzVar.e.removeGlobalOnLayoutListener(rzVar.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
