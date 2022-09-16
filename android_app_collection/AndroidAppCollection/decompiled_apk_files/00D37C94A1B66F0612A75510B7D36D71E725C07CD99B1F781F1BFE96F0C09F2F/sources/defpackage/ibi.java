package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: ibi  reason: default package */
/* loaded from: classes3.dex */
public final class ibi extends ibk {
    public final aadd t;
    public final hyu u;
    public final iet v;
    public iaj w;

    /* JADX WARN: Multi-variable type inference failed */
    public ibi(aadd aaddVar, hyu hyuVar, ies iesVar, ViewGroup viewGroup) {
        super(viewGroup);
        this.t = aaddVar;
        this.u = hyuVar;
        ieu ieuVar = ((ico) iesVar).al;
        Context context = (Context) ieuVar.a.get();
        context.getClass();
        ajmy ajmyVar = (ajmy) ieuVar.b.get();
        ajmyVar.getClass();
        airr airrVar = (airr) ieuVar.c.get();
        airrVar.getClass();
        acth acthVar = (acth) ieuVar.d.get();
        acthVar.getClass();
        ifj ifjVar = (ifj) ieuVar.e.get();
        icy icyVar = (icy) ieuVar.f.get();
        icyVar.getClass();
        iet ietVar = new iet(context, ajmyVar, airrVar, acthVar, ifjVar, icyVar, (ido) ieuVar.g.get(), (idw) ieuVar.h.get(), (idk) ieuVar.i.get(), iesVar);
        this.v = ietVar;
        viewGroup.addView(ietVar, ietVar.c());
    }

    @Override // defpackage.ibk
    public final iaj E() {
        return this.w;
    }

    @Override // defpackage.ibk
    public final void F() {
        iaj iajVar = this.w;
        if (iajVar != null) {
            this.u.e(iajVar.a());
            this.w.f = null;
            this.w = null;
        }
        iet ietVar = this.v;
        if (ietVar != null) {
            ietVar.f.c();
            this.v.f.b();
            idj idjVar = this.v.a;
            if (idjVar == null) {
                return;
            }
            idjVar.e();
            fmg fmgVar = idjVar.v;
            if (fmgVar != null) {
                fmgVar.d();
            }
            LottieAnimationView lottieAnimationView = idjVar.m;
            if (lottieAnimationView != null) {
                hqs.c(lottieAnimationView, false);
                idjVar.m = null;
            }
            ViewGroup viewGroup = idjVar.n;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                hqs.c(idjVar.n, false);
                idjVar.n = null;
            }
            idjVar.A.cancel();
            idjVar.B.c();
        }
    }
}
