package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bwv  reason: default package */
/* loaded from: classes2.dex */
public final class bwv implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ LottieAnimationView b;

    public bwv(LottieAnimationView lottieAnimationView, String str) {
        this.b = lottieAnimationView;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        LottieAnimationView lottieAnimationView = this.b;
        return lottieAnimationView.e ? bxe.a(lottieAnimationView.getContext(), this.a) : bxe.b(lottieAnimationView.getContext(), this.a, null);
    }
}
