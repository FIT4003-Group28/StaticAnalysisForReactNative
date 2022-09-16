package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abpo  reason: default package */
/* loaded from: classes.dex */
public final class abpo implements Animation.AnimationListener {
    public final View a;
    public final View b;
    public final int d;
    public final int e;
    public boolean g;
    public abpm h;
    public final Handler c = new Handler();
    public final Runnable f = new Runnable() { // from class: abpn
        @Override // java.lang.Runnable
        public final void run() {
            abpo abpoVar = abpo.this;
            if (abpoVar.g) {
                abpoVar.g = false;
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(abpoVar);
                abpoVar.a.startAnimation(alphaAnimation);
            }
        }
    };

    public abpo(ViewGroup viewGroup, View view, int i, int i2) {
        this.a = view;
        this.b = viewGroup;
        this.e = i;
        this.d = i2;
        viewGroup.removeAllViews();
        viewGroup.setTranslationY(0.0f);
        viewGroup.addView(view);
        viewGroup.setVisibility(8);
        this.g = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        abpp abppVar;
        abpo abpoVar;
        this.a.setVisibility(8);
        abpm abpmVar = this.h;
        if (abpmVar == null || (abpoVar = (abppVar = abpmVar.a).a) == null || this != abpoVar) {
            return;
        }
        abppVar.g();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
