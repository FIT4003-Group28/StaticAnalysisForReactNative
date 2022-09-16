package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: acib  reason: default package */
/* loaded from: classes.dex */
final class acib implements Animation.AnimationListener {
    final /* synthetic */ acid a;

    public acib(acid acidVar) {
        this.a = acidVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.ap.setBackgroundColor(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.ap.setBackgroundColor(-1);
    }
}
