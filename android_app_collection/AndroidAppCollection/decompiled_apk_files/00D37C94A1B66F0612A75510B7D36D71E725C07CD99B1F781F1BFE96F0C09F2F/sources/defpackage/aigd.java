package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import j$.time.Duration;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aigd  reason: default package */
/* loaded from: classes.dex */
public final class aigd {
    public AnimatorSet a;
    private final Duration b;
    private final amuk c;
    private final amuk d;
    private final Animator.AnimatorListener e;

    public aigd() {
    }

    public aigd(Duration duration, amuk amukVar, amuk amukVar2, Animator.AnimatorListener animatorListener) {
        this.b = duration;
        this.c = amukVar;
        this.d = amukVar2;
        this.e = animatorListener;
    }

    public static aigc a() {
        aigc aigcVar = new aigc();
        aigcVar.c(Duration.ofMillis(200L));
        return aigcVar;
    }

    public final void b() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet == null) {
            return;
        }
        animatorSet.end();
    }

    public final void c() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet == null) {
            this.a = new AnimatorSet();
            ArrayList arrayList = new ArrayList(this.c.size());
            Duration duration = Duration.ZERO;
            amuk amukVar = this.c;
            int size = amukVar.size();
            for (int i = 0; i < size; i++) {
                View view = (View) amukVar.get(i);
                ArrayList arrayList2 = new ArrayList(this.d.size());
                amuk amukVar2 = this.d;
                int size2 = amukVar2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    aigb aigbVar = (aigb) amukVar2.get(i2);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", aigbVar.a, aigbVar.b);
                    ofFloat.setDuration(aigbVar.c.toMillis());
                    arrayList2.add(ofFloat);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(arrayList2);
                animatorSet2.setStartDelay(duration.toMillis());
                arrayList.add(animatorSet2);
                duration = duration.plus(this.b);
            }
            if (this.e != null) {
                ((Animator) arrayList.get(0)).addListener(this.e);
            }
            this.a.playTogether(arrayList);
        } else if (animatorSet.isStarted()) {
            return;
        }
        amuk amukVar3 = this.c;
        int size3 = amukVar3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            View view2 = (View) amukVar3.get(i3);
            view2.setVisibility(0);
            view2.setAlpha(this.d.isEmpty() ? 0.0f : ((aigb) this.d.get(0)).a);
        }
        this.a.start();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aigd) {
            aigd aigdVar = (aigd) obj;
            if (this.b.equals(aigdVar.b) && amxp.v(this.c, aigdVar.c) && amxp.v(this.d, aigdVar.d)) {
                Animator.AnimatorListener animatorListener = this.e;
                Animator.AnimatorListener animatorListener2 = aigdVar.e;
                if (animatorListener != null ? animatorListener.equals(animatorListener2) : animatorListener2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Animator.AnimatorListener animatorListener = this.e;
        return hashCode ^ (animatorListener == null ? 0 : animatorListener.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 109 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SequentialAlphaAnimationHelper{delayBetweenAnimationsInSequence=");
        sb.append(valueOf);
        sb.append(", views=");
        sb.append(valueOf2);
        sb.append(", animationSteps=");
        sb.append(valueOf3);
        sb.append(", animatorListener=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
