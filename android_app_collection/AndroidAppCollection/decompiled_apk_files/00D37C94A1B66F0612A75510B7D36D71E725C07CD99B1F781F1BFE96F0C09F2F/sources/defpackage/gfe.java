package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: gfe  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gfe implements Runnable {
    public final /* synthetic */ gfm a;
    public final /* synthetic */ View b;
    private final /* synthetic */ int c;

    public /* synthetic */ gfe(gfm gfmVar, View view) {
        this.a = gfmVar;
        this.b = view;
    }

    public /* synthetic */ gfe(gfm gfmVar, View view, int i) {
        this.c = i;
        this.a = gfmVar;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            gfm gfmVar = this.a;
            gfmVar.c.removeView(this.b);
            return;
        }
        gfm gfmVar2 = this.a;
        View view = this.b;
        if (gfmVar2.q == null || view != gfmVar2.l) {
            gfmVar2.b();
            int height = view.getHeight();
            gfmVar2.q = new gfk(gfmVar2, view, height);
            gfmVar2.a.aC(gfmVar2.q);
            gfmVar2.a.v(gfmVar2.f);
            gfmVar2.n = (int) (height * gfm.e(view, gfmVar2.g));
            gfmVar2.l = view;
            return;
        }
        gfmVar2.a.N();
    }
}
