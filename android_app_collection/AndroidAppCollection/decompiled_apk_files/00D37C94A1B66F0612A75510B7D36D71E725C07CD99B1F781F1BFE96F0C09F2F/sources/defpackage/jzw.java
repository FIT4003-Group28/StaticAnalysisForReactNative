package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: jzw  reason: default package */
/* loaded from: classes3.dex */
final class jzw implements Animation.AnimationListener {
    final /* synthetic */ jzx a;

    public jzw(jzx jzxVar) {
        this.a = jzxVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.b.setVisibility(8);
        aaak aaakVar = this.a.d;
        if (aaakVar != null) {
            aaakVar.c();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
