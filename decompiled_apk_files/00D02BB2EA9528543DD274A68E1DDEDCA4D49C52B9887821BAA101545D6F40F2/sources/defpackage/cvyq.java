package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
/* compiled from: PG */
/* renamed from: cvyq  reason: default package */
/* loaded from: classes.dex */
final class cvyq extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ cvyt a;

    public cvyq(cvyt cvytVar) {
        this.a = cvytVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.c = false;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SelectedAccountDisc<T> selectedAccountDisc;
        AnimatorSet animatorSet;
        int i = Math.abs(f2) <= Math.abs(f) ? 1 : f2 < 0.0f ? 3 : 2;
        Object e = this.a.a.a().e();
        if (i != 1) {
            cvyt cvytVar = this.a;
            if (!cvytVar.c && e != null) {
                cvytVar.b.setEnabled(false);
                this.a.c = true;
                cvyp cvypVar = new cvyp(this);
                cvyt cvytVar2 = this.a;
                if (cvytVar2.a(cvyt.b(cvytVar2.a.a().l(), e, i), e) || cvytVar2.a.c().j().a()) {
                    SelectedAccountDisc<T> selectedAccountDisc2 = cvytVar2.b;
                    float[] fArr = new float[1];
                    float measuredHeight = selectedAccountDisc2.getMeasuredHeight();
                    float f3 = i == 3 ? 0.4f : -0.4f;
                    fArr[0] = measuredHeight * f3;
                    dcdc g = dcdc.g(ObjectAnimator.ofFloat(selectedAccountDisc2, "translationY", fArr), ObjectAnimator.ofFloat(cvytVar2.b, "translationY", selectedAccountDisc.getMeasuredHeight() * f3, 0.0f));
                    animatorSet = new AnimatorSet();
                    animatorSet.setDuration(100L);
                    animatorSet.playSequentially(g);
                    animatorSet.addListener(cvypVar);
                } else {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(cvytVar2.b, "alpha", 1.0f, 0.0f).setDuration(50L);
                    duration.setStartDelay(50L);
                    SelectedAccountDisc<T> selectedAccountDisc3 = cvytVar2.b;
                    float[] fArr2 = new float[1];
                    fArr2[0] = selectedAccountDisc3.getMeasuredHeight() * (i == 3 ? 0.4f : -0.4f);
                    dcdc g2 = dcdc.g(ObjectAnimator.ofFloat(selectedAccountDisc3, "translationY", fArr2).setDuration(100L), duration);
                    animatorSet = new AnimatorSet();
                    animatorSet.playTogether(g2);
                    animatorSet.addListener(new cvyr(cvytVar2, e, i, cvypVar));
                }
                animatorSet.start();
                return true;
            }
        }
        return false;
    }
}
