package defpackage;

import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: bwt  reason: default package */
/* loaded from: classes2.dex */
public final class bwt implements bxp {
    final /* synthetic */ LottieAnimationView a;
    private final /* synthetic */ int b;

    public bwt(LottieAnimationView lottieAnimationView) {
        this.a = lottieAnimationView;
    }

    public bwt(LottieAnimationView lottieAnimationView, int i) {
        this.b = i;
        this.a = lottieAnimationView;
    }

    @Override // defpackage.bxp
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.b == 0) {
            Throwable th = (Throwable) obj;
            LottieAnimationView lottieAnimationView = this.a;
            int i = lottieAnimationView.c;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            bxp bxpVar = this.a.b;
            if (bxpVar == null) {
                bxpVar = LottieAnimationView.a;
            }
            bxpVar.a(th);
            return;
        }
        this.a.i((bwx) obj);
    }
}
