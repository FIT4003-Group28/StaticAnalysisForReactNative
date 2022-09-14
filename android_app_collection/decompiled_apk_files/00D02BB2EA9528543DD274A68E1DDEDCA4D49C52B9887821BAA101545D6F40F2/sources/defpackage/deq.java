package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: deq  reason: default package */
/* loaded from: classes6.dex */
public final class deq {
    public final czh a;
    public final czz b;
    public final cjqq c;
    public final AnimatorSet d;
    public final ObjectAnimator e;
    public final View f;
    public final LottieAnimationView g;
    public final dal h;
    public int i;

    public deq(cjqq cjqqVar, czz czzVar, Activity activity, czh czhVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.d = animatorSet;
        ObjectAnimator objectAnimator = new ObjectAnimator();
        this.e = objectAnimator;
        this.h = new dal(this) { // from class: deo
            private final deq a;

            {
                this.a = this;
            }

            @Override // defpackage.dal
            public final void a(int i) {
                ddho ddhoVar;
                ddho ddhoVar2;
                deq deqVar = this.a;
                if (i == 1) {
                    deqVar.d.cancel();
                    deqVar.e.cancel();
                    deqVar.a();
                    deqVar.b.q();
                    deqVar.i = 1;
                    return;
                }
                View view = deqVar.f;
                if (view == null || deqVar.i == i) {
                    return;
                }
                if (i == 2) {
                    deqVar.b.o(view);
                    if (!deqVar.d.isStarted()) {
                        deqVar.d.start();
                    }
                    deqVar.e.start();
                    deqVar.a();
                    cjqp f = deqVar.c.f(deqVar.f);
                    czh czhVar2 = deqVar.a;
                    czh czhVar3 = czh.WALKING_NAVIGATION;
                    int ordinal = czhVar2.ordinal();
                    if (ordinal == 0) {
                        ddhoVar2 = dtxw.h;
                    } else if (ordinal != 1) {
                        ddhoVar2 = ordinal != 3 ? dtxw.h : dtxj.bn;
                    } else {
                        ddhoVar2 = dtxj.bO;
                    }
                    f.d(cjtd.a(ddhoVar2));
                } else {
                    deqVar.b.p(view);
                    if (!deqVar.d.isStarted()) {
                        deqVar.d.start();
                    }
                    if (deqVar.e.isRunning()) {
                        deqVar.e.end();
                    }
                    deqVar.g.setVisibility(0);
                    if (!deqVar.g.c()) {
                        deqVar.g.a();
                    }
                    cjqp f2 = deqVar.c.f(deqVar.f);
                    czh czhVar4 = deqVar.a;
                    czh czhVar5 = czh.WALKING_NAVIGATION;
                    int ordinal2 = czhVar4.ordinal();
                    if (ordinal2 == 0) {
                        ddhoVar = dtxw.i;
                    } else if (ordinal2 != 1) {
                        ddhoVar = ordinal2 != 3 ? dtxw.i : dtxj.bo;
                    } else {
                        ddhoVar = dtxj.bP;
                    }
                    f2.d(cjtd.a(ddhoVar));
                    i = 3;
                }
                deqVar.i = i;
            }
        };
        this.i = 1;
        this.a = czhVar;
        this.b = czzVar;
        this.c = cjqqVar;
        View inflate = activity.getLayoutInflater().inflate(R.layout.awareness_overlay, (ViewGroup) null);
        this.f = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ar_awareness_warning_icon);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.ar_awareness_animation);
        this.g = lottieAnimationView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.SCALE_X, 1.3f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_Y, 1.3f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        animatorSet.setDuration(400L);
        animatorSet.setTarget(imageView);
        animatorSet.setInterpolator(new BounceInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        objectAnimator.setProperty(View.ALPHA);
        objectAnimator.setFloatValues(0.0f, 1.0f);
        objectAnimator.setTarget(inflate);
        objectAnimator.setDuration(400L);
        objectAnimator.setInterpolator(new LinearInterpolator());
        lottieAnimationView.setFailureListener(dep.a);
        lottieAnimationView.setAnimation(R.raw.awareness_animation);
    }

    public final void a() {
        this.g.setVisibility(8);
        if (this.g.c()) {
            this.g.f();
        }
    }
}
