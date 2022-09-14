package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: dvx  reason: default package */
/* loaded from: classes6.dex */
final class dvx {
    final AnimatorSet a;
    private float b = 1.0f;
    private float c = 1.0f;
    private float d = 1.0f;
    private float e = 0.0f;

    public dvx() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.a = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "pointScale", 1.0f, 1.0f);
        ofFloat.setDuration(183L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "pointScale", 1.0f, 0.9f);
        ofFloat2.setDuration(50L);
        ofFloat2.setInterpolator(eho.a(0.17f, -1.11f, 0.94f, 1.73f));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "pointScale", 0.9f, 1.2f);
        ofFloat3.setDuration(200L);
        ofFloat3.setInterpolator(eho.a(0.32f, 0.67f, 0.86f, 0.09f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "pointScale", 1.2f, 1.0f);
        ofFloat4.setDuration(250L);
        ofFloat4.setInterpolator(eho.a(0.48f, 0.067f, 0.74f, 0.42f));
        animatorSet2.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "pointOpacity", 1.0f, 1.0f);
        ofFloat5.setDuration(583L);
        ofFloat5.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "pointOpacity", 1.0f, 0.0f);
        ofFloat6.setDuration(100L);
        ofFloat6.setInterpolator(new LinearInterpolator());
        animatorSet3.playSequentially(ofFloat5, ofFloat6);
        AnimatorSet animatorSet4 = new AnimatorSet();
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "ringScale", 1.0f, 1.0f);
        ofFloat7.setDuration(33L);
        ofFloat7.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "ringScale", 1.0f, 0.8f);
        ofFloat8.setDuration(233L);
        ofFloat8.setInterpolator(eho.a(0.4f, 0.05f, 1.0f, 1.0f));
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "ringScale", 0.8f, 0.85f);
        ofFloat9.setDuration(167L);
        ofFloat9.setInterpolator(eho.a(0.4f, 0.64f, 0.2f, 0.66f));
        animatorSet4.playSequentially(ofFloat7, ofFloat8, ofFloat9);
        AnimatorSet animatorSet5 = new AnimatorSet();
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this, "ringOpacity", 0.0f, 1.0f);
        ofFloat10.setDuration(67L);
        ofFloat10.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this, "ringOpacity", 1.0f, 1.0f);
        ofFloat11.setDuration(333L);
        ofFloat11.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this, "ringOpacity", 1.0f, 0.0f);
        ofFloat12.setDuration(217L);
        ofFloat12.setInterpolator(new LinearInterpolator());
        animatorSet5.playSequentially(ofFloat10, ofFloat11, ofFloat12);
        animatorSet.playTogether(animatorSet2, animatorSet3, animatorSet4, animatorSet5);
    }

    public float getPointOpacity() {
        return this.c;
    }

    public float getPointScale() {
        return this.b;
    }

    public float getRingOpacity() {
        return this.e;
    }

    public float getRingScale() {
        return this.d;
    }

    public void setPointOpacity(float f) {
        this.c = f;
    }

    public void setPointScale(float f) {
        this.b = f;
    }

    public void setRingOpacity(float f) {
        this.e = f;
    }

    public void setRingScale(float f) {
        this.d = f;
    }
}
