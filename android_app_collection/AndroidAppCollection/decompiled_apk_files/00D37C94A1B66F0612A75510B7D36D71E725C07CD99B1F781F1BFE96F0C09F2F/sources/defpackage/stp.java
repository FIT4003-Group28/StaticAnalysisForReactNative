package defpackage;

import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: stp  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class stp implements Runnable {
    public final /* synthetic */ tcu a;
    public final /* synthetic */ tfw b;
    public final /* synthetic */ LottieAnimationView c;
    public final /* synthetic */ tda d;
    private final /* synthetic */ int e;

    public /* synthetic */ stp(tcu tcuVar, tfw tfwVar, LottieAnimationView lottieAnimationView, tda tdaVar) {
        this.a = tcuVar;
        this.b = tfwVar;
        this.c = lottieAnimationView;
        this.d = tdaVar;
    }

    public /* synthetic */ stp(tcu tcuVar, tfw tfwVar, LottieAnimationView lottieAnimationView, tda tdaVar, int i) {
        this.e = i;
        this.a = tcuVar;
        this.b = tfwVar;
        this.c = lottieAnimationView;
        this.d = tdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            tcu tcuVar = this.a;
            tfw tfwVar = this.b;
            LottieAnimationView lottieAnimationView = this.c;
            tda tdaVar = this.d;
            awmt a = tfwVar.a();
            tcq a2 = tcs.a();
            a2.e = swm.c(lottieAnimationView);
            a2.h = tdaVar.u;
            tcuVar.b(a, a2.a()).Q();
            return;
        }
        tcu tcuVar2 = this.a;
        tfw tfwVar2 = this.b;
        LottieAnimationView lottieAnimationView2 = this.c;
        tda tdaVar2 = this.d;
        awmt a3 = tfwVar2.a();
        tcq a4 = tcs.a();
        a4.e = swm.c(lottieAnimationView2);
        a4.h = tdaVar2.u;
        tcuVar2.b(a3, a4.a()).Q();
    }
}
