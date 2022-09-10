package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daej  reason: default package */
/* loaded from: classes5.dex */
public final class daej implements Runnable {
    final /* synthetic */ daff a;

    public daej(daff daffVar) {
        this.a = daffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dafe dafeVar = this.a.e;
        if (dafeVar == null) {
            return;
        }
        dafeVar.setVisibility(0);
        daff daffVar = this.a;
        if (daffVar.e.a != 1) {
            int i = daffVar.i();
            daffVar.e.setTranslationY(i);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(i, 0);
            valueAnimator.setInterpolator(czum.b);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new daeo(daffVar));
            valueAnimator.addUpdateListener(new daep(daffVar, i));
            valueAnimator.start();
            return;
        }
        ValueAnimator h = daffVar.h(0.0f, 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(czum.d);
        ofFloat.addUpdateListener(new daen(daffVar));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(h, ofFloat);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new daek(daffVar));
        animatorSet.start();
    }
}
