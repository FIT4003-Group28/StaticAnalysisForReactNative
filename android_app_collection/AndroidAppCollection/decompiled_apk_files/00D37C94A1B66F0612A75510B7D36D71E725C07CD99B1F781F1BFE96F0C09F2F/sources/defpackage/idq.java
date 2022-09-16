package defpackage;

import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: idq  reason: default package */
/* loaded from: classes3.dex */
public final class idq {
    final LottieAnimationView a;
    final LottieAnimationView b;
    final LottieAnimationView c;

    public idq(ViewGroup viewGroup) {
        hqs.c(viewGroup, true);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewGroup.findViewById(R.id.reel_feedback_play);
        lottieAnimationView.getClass();
        this.a = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) viewGroup.findViewById(R.id.reel_feedback_pause);
        lottieAnimationView2.getClass();
        this.b = lottieAnimationView2;
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) viewGroup.findViewById(R.id.reel_feedback_like);
        lottieAnimationView3.getClass();
        this.c = lottieAnimationView3;
        lottieAnimationView.a(new idp(lottieAnimationView));
        lottieAnimationView2.a(new idp(lottieAnimationView2));
        lottieAnimationView3.a(new idp(lottieAnimationView3));
    }

    public static void a(LottieAnimationView lottieAnimationView) {
        lottieAnimationView.k(0.0f);
        hqs.c(lottieAnimationView, true);
        lottieAnimationView.e();
    }

    public static void b(LottieAnimationView lottieAnimationView) {
        lottieAnimationView.d();
        lottieAnimationView.k(0.0f);
        hqs.c(lottieAnimationView, false);
    }
}
