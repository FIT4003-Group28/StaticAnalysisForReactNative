package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alob  reason: default package */
/* loaded from: classes.dex */
public final class alob implements Runnable {
    final /* synthetic */ aloe a;
    private final /* synthetic */ int b;

    public alob(aloe aloeVar) {
        this.a = aloeVar;
    }

    public alob(aloe aloeVar, int i) {
        this.b = i;
        this.a = aloeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        if (this.b != 0) {
            aloe aloeVar = this.a;
            if (aloeVar.e == null || (context = aloeVar.d) == null) {
                return;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            aloe aloeVar2 = this.a;
            int[] iArr = new int[2];
            aloeVar2.e.getLocationOnScreen(iArr);
            int height = (i - (iArr[1] + aloeVar2.e.getHeight())) + ((int) this.a.e.getTranslationY());
            aloe aloeVar3 = this.a;
            if (height >= aloeVar3.j) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = aloeVar3.e.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(aloe.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += this.a.j - height;
            this.a.e.requestLayout();
            return;
        }
        alod alodVar = this.a.e;
        if (alodVar == null) {
            return;
        }
        if (alodVar.getParent() != null) {
            this.a.e.setVisibility(0);
        }
        aloe aloeVar4 = this.a;
        if (aloeVar4.e.a != 1) {
            int b = aloeVar4.b();
            aloeVar4.e.setTranslationY(b);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(b, 0);
            valueAnimator.setInterpolator(alhv.b);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new alnr(aloeVar4));
            valueAnimator.addUpdateListener(new alnq(aloeVar4, 2));
            valueAnimator.start();
            return;
        }
        ValueAnimator c = aloeVar4.c(0.0f, 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(alhv.d);
        ofFloat.addUpdateListener(new alnq(aloeVar4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(c, ofFloat);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new alno(aloeVar4));
        animatorSet.start();
    }
}
