package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: gvx  reason: default package */
/* loaded from: classes3.dex */
final class gvx implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ gwa b;

    public gvx(gwa gwaVar, View view) {
        this.b = gwaVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() > 0) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ObjectAnimator duration = ObjectAnimator.ofInt(this.b.b, "scrollX", (this.a.getLeft() - (this.b.d / 2)) + (this.a.getWidth() / 2)).setDuration(225L);
            duration.setInterpolator(new app());
            duration.start();
        }
    }
}
