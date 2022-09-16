package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: hts  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hts implements Runnable {
    public final /* synthetic */ htu a;
    private final /* synthetic */ int b;

    public /* synthetic */ hts(htu htuVar, int i) {
        this.b = i;
        this.a = htuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            final htu htuVar = this.a;
            if (!hqs.i(htuVar.e) || htuVar.f.getVisibility() != 0) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(htuVar);
            ObjectAnimator duration = ObjectAnimator.ofFloat(htuVar.f, View.ALPHA, 0.0f).setDuration(250L);
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(htuVar.d), 0);
            ofObject.setDuration(50L);
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: htr
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    htu.this.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            ArrayList arrayList = new ArrayList();
            arrayList.add(duration);
            arrayList.add(ofObject);
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            return;
        }
        this.a.a();
    }
}
