package defpackage;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: beop  reason: default package */
/* loaded from: classes3.dex */
public final class beop implements Animation.AnimationListener {
    final /* synthetic */ String a;
    final /* synthetic */ View b;
    final /* synthetic */ beoq c;

    public beop(beoq beoqVar, String str, View view) {
        this.c = beoqVar;
        this.a = str;
        this.b = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.c.g = this.a;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(beoq.a);
        alphaAnimation.setDuration(133L);
        this.b.startAnimation(alphaAnimation);
        if (this.a.equals(this.c.b)) {
            this.c.d.postDelayed(new Runnable(this) { // from class: beoo
                private final beop a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    beoq beoqVar = this.a.c;
                    beoqVar.s(beoqVar.c);
                }
            }, 1067L);
        } else {
            this.c.h = true;
        }
        cqkx.p(this.c);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
