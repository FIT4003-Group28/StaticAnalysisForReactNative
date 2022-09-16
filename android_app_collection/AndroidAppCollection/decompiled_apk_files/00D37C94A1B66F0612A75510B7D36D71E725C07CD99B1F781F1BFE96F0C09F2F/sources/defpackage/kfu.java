package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kfu  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kfu implements View.OnClickListener {
    public final /* synthetic */ kfw a;
    private final /* synthetic */ int b;

    public /* synthetic */ kfu(kfw kfwVar, int i) {
        this.b = i;
        this.a = kfwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            kfw kfwVar = this.a;
            kfwVar.g.getClass();
            if (kfwVar.h.a == ahzb.PLAYING) {
                kfwVar.g.e();
                return;
            } else if (kfwVar.h.a == ahzb.PAUSED) {
                kfwVar.g.f();
                return;
            } else if (kfwVar.h.a != ahzb.ENDED) {
                return;
            } else {
                kfwVar.g.n();
                if (!kfwVar.j) {
                    return;
                }
                fgu fguVar = (fgu) ((fgo) kfwVar.b.get()).a.c();
                int i = (fguVar.b & 16) != 0 ? fguVar.h : 1;
                if (i <= 0) {
                    return;
                }
                fvg d = fvl.d();
                d.e(true);
                d.k(kfwVar.e);
                d.m(kfwVar.f, new kfu(kfwVar, 1));
                ((akfg) kfwVar.c.get()).n(d.b());
                ylx.m(((fgo) kfwVar.b.get()).a.b(new fgn(i - 1, 1)), dzl.m);
                return;
            }
        }
        ((njb) this.a.d.get()).h(amvn.r(0));
    }
}
