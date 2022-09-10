package defpackage;

import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: bip  reason: default package */
/* loaded from: classes3.dex */
public final class bip implements bjt<Throwable> {
    final /* synthetic */ LottieAnimationView a;

    public bip(LottieAnimationView lottieAnimationView) {
        this.a = lottieAnimationView;
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void a(Throwable th) {
        Throwable th2 = th;
        LottieAnimationView lottieAnimationView = this.a;
        int i = lottieAnimationView.c;
        if (i != 0) {
            lottieAnimationView.setImageResource(i);
        }
        bjt<Throwable> bjtVar = this.a.b;
        if (bjtVar == null) {
            bjtVar = LottieAnimationView.a;
        }
        bjtVar.a(th2);
    }
}
