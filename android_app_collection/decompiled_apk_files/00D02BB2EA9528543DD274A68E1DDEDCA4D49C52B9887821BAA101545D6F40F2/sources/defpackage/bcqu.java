package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: bcqu  reason: default package */
/* loaded from: classes3.dex */
final class bcqu implements View.OnAttachStateChangeListener {
    final /* synthetic */ bcqw a;

    public bcqu(bcqw bcqwVar) {
        this.a = bcqwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ObjectAnimator.ofFloat(this.a.P, "alpha", 0.0f, 1.0f).setDuration(250L).start();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
