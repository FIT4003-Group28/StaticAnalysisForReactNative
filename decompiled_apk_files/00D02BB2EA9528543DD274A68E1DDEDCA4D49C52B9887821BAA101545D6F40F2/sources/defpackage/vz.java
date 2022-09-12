package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vz  reason: default package */
/* loaded from: classes7.dex */
public final class vz implements View.OnAttachStateChangeListener {
    final /* synthetic */ wa a;

    public vz(wa waVar) {
        this.a = waVar;
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
            wa waVar = this.a;
            waVar.d.removeGlobalOnLayoutListener(waVar.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
