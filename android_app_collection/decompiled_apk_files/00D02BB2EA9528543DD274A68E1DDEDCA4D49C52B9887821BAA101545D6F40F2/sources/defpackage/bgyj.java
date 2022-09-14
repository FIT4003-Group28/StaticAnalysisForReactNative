package defpackage;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: bgyj  reason: default package */
/* loaded from: classes3.dex */
public class bgyj {
    private static final Interpolator a = new LinearInterpolator();
    private final bgym b;

    public bgyj(bgym bgymVar) {
        this.b = bgymVar;
    }

    public final void a(View view) {
        final bgym bgymVar = this.b;
        cqss s = ibl.s();
        if (!(view instanceof LottieAnimationView) || !bgymVar.b.a().h()) {
            return;
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
        bgymVar.a(lottieAnimationView, s);
        bgymVar.c = -0.75f;
        bgymVar.d = 145.0f;
        lottieAnimationView.d(new bly("**"), bjv.c, new bpx(bgymVar) { // from class: bgyk
            private final bgym a;

            {
                this.a = bgymVar;
            }

            @Override // defpackage.bpx
            public final Object a(bpu bpuVar) {
                bgym bgymVar2 = this.a;
                return Integer.valueOf((int) ((bgymVar2.c * ((Integer) bpuVar.a).intValue()) + bgymVar2.d));
            }
        });
    }

    public final void b(View view, cqjg cqjgVar, bgyi bgyiVar) {
        View a2 = cqhu.a(view, cqjgVar);
        if (a2 == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(a);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new bgyh(bgyiVar));
        a2.startAnimation(alphaAnimation);
    }
}
