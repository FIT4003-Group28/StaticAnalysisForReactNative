package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bwu  reason: default package */
/* loaded from: classes2.dex */
public final class bwu implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ LottieAnimationView b;

    public bwu(LottieAnimationView lottieAnimationView, int i) {
        this.b = lottieAnimationView;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView.e) {
            Context context = lottieAnimationView.getContext();
            int i = this.a;
            return bxe.f(context, i, bxe.n(context, i));
        }
        return bxe.f(lottieAnimationView.getContext(), this.a, null);
    }
}
