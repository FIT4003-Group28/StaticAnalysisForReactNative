package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: yyl  reason: default package */
/* loaded from: classes4.dex */
final class yyl implements Animation.AnimationListener {
    final /* synthetic */ yym a;

    public yyl(yym yymVar) {
        this.a = yymVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.c();
        if (this.a.b.hasOverlappingRendering()) {
            this.a.b.setLayerType(0, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
