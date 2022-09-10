package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: ciza  reason: default package */
/* loaded from: classes4.dex */
final class ciza implements crzp<ccih> {
    final /* synthetic */ btlu a;
    final /* synthetic */ amfi b;
    final /* synthetic */ cizb c;

    public ciza(cizb cizbVar, btlu btluVar, amfi amfiVar) {
        this.c = cizbVar;
        this.a = btluVar;
        this.b = amfiVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<ccih> crzmVar) {
        ccih l = crzmVar.l();
        if (l == null || !l.a().equals(this.a)) {
            return;
        }
        LottieAnimationView lottieAnimationView = null;
        amfu a = this.b.a(l.b(), cizb.class.getSimpleName(), null);
        if (a.equals(this.c.a)) {
            return;
        }
        cizb cizbVar = this.c;
        cizbVar.a = a;
        View o = cqkx.o(cizbVar);
        if (o != null) {
            View a2 = cqhu.a(o, ciyw.a);
            if (a2 instanceof LottieAnimationView) {
                lottieAnimationView = (LottieAnimationView) a2;
            }
        }
        if (lottieAnimationView == null) {
            return;
        }
        try {
            lottieAnimationView.g();
            lottieAnimationView.invalidate();
        } catch (NullPointerException unused) {
        }
    }
}
