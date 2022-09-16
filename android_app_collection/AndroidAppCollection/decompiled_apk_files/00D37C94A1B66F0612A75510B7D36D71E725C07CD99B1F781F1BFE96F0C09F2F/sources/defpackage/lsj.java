package defpackage;

import android.view.animation.Animation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lsj  reason: default package */
/* loaded from: classes3.dex */
public final class lsj implements Animation.AnimationListener {
    final /* synthetic */ lsl a;
    private final /* synthetic */ int b;

    public lsj(lsl lslVar) {
        this.a = lslVar;
    }

    public lsj(lsl lslVar, int i) {
        this.b = i;
        this.a = lslVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.b == 0) {
            this.a.d.clearAnimation();
            this.a.d.setVisibility(8);
            return;
        }
        this.a.d.clearAnimation();
        this.a.d.setVisibility(0);
    }
}
