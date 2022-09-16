package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ciym  reason: default package */
/* loaded from: classes4.dex */
public class ciym implements ciyl, crzp {
    private final ciyg a;
    private chty b;

    public ciym(gga ggaVar, cqhn cqhnVar, cqhu cqhuVar, bvrb bvrbVar, Executor executor, crzm<chty> crzmVar) {
        chtv bZ = chty.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chty chtyVar = (chty) bZ.b;
        chtyVar.b = 0;
        chtyVar.a |= 1;
        this.b = bZ.bK();
        crzmVar.b(this, executor);
        this.a = new ciyg(this, ggaVar.getApplicationContext(), bvrbVar);
    }

    @Override // defpackage.crzp
    public void On(crzm<chty> crzmVar) {
        chty l = crzmVar.l();
        dbsk.s(l);
        if (this.b.equals(l)) {
            return;
        }
        this.b = l;
        int a = chtx.a(l.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            cqkx.p(this);
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            cqkx.p(this);
            ciyg ciygVar = this.a;
            View b = ciygVar.b();
            View c = ciygVar.c();
            View d = ciygVar.d();
            if (b == null || c == null || d == null) {
                return;
            }
            ciyg.a(c, d);
            int measuredWidth = c.getMeasuredWidth();
            int a2 = jmj.a(ciygVar.b, 80);
            int measuredHeight = c.getMeasuredHeight();
            int a3 = jmj.a(ciygVar.b, 36);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(100L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ciyf(a2, measuredWidth, a3, measuredHeight, c));
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(eho.a(0.65f, 0.0f, 1.0f, 1.0f));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c, "alpha", 1.0f, 0.0f);
            ofFloat3.setDuration(75L);
            ofFloat3.setStartDelay(175L);
            ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
            layoutParams.width = d.getMeasuredWidth();
            layoutParams.height = d.getMeasuredHeight();
            d.setLayoutParams(layoutParams);
            d.setAlpha(0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat2).after(ofFloat);
            animatorSet.play(ofFloat3).after(ofFloat);
            animatorSet.start();
            ciygVar.c.a(new Runnable() { // from class: ciyd
                @Override // java.lang.Runnable
                public final void run() {
                }
            }, bvrj.UI_THREAD, 350L);
        } else {
            cqkx.p(this);
            ciyg ciygVar2 = this.a;
            View b2 = ciygVar2.b();
            final View c2 = ciygVar2.c();
            final View d2 = ciygVar2.d();
            if (b2 == null || c2 == null || d2 == null) {
                return;
            }
            ciyg.a(c2, d2);
            c2.measure(View.MeasureSpec.makeMeasureSpec(b2.getMeasuredWidth(), Integer.MIN_VALUE), ciyg.a);
            int a4 = jmj.a(ciygVar2.b, 80);
            int measuredWidth2 = c2.getMeasuredWidth();
            int a5 = jmj.a(ciygVar2.b, 36);
            int measuredHeight2 = c2.getMeasuredHeight();
            int a6 = jmj.a(ciygVar2.b, 10);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat4.addUpdateListener(new ciye(measuredWidth2, a4, measuredHeight2, a5, c2));
            ofFloat4.setDuration(350L);
            ofFloat4.setInterpolator(eho.a(0.2f, 0.0f, 0.0f, 1.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c2, "alpha", 0.0f, 1.0f);
            ofFloat5.setDuration(75L);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(d2, "alpha", 0.0f, 1.0f);
            ofFloat6.setDuration(100L);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(d2, "translationY", a6, 0.0f);
            ofFloat7.setDuration(100L);
            ofFloat7.setInterpolator(irf.b);
            ViewGroup.LayoutParams layoutParams2 = d2.getLayoutParams();
            layoutParams2.width = d2.getMeasuredWidth();
            layoutParams2.height = d2.getMeasuredHeight();
            d2.setLayoutParams(layoutParams2);
            d2.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ofFloat4, ofFloat5);
            animatorSet2.play(ofFloat6).after(ofFloat4);
            animatorSet2.play(ofFloat7).after(ofFloat4);
            animatorSet2.start();
            ciygVar2.c.a(new Runnable(c2, d2) { // from class: ciyc
                private final View a;
                private final View b;

                {
                    this.a = c2;
                    this.b = d2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ciyg.a(this.a, this.b);
                }
            }, bvrj.UI_THREAD, 450L);
        }
    }

    @Override // defpackage.ciyl
    public String b() {
        return this.b.c;
    }

    @Override // defpackage.ciyl
    public Boolean c() {
        int a = chtx.a(this.b.b);
        boolean z = false;
        if (a != 0 && a != 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ciyl
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxl.gm;
        return b.a();
    }
}
