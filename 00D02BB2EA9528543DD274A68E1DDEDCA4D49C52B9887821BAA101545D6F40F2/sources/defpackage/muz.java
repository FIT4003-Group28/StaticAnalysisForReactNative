package defpackage;

import android.view.View;
/* renamed from: muz  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class muz implements mw {
    static final mw a = new muz();

    private muz() {
    }

    @Override // defpackage.mw
    public final void a(Object obj) {
        kep kepVar = (kep) obj;
        View decorView = kepVar.a.Nr().getDecorView();
        if (decorView.isAttachedToWindow()) {
            kepVar.a.a().updateViewLayout(decorView, kepVar.a.Nr().getAttributes());
        }
        ker kerVar = kepVar.j;
        crzm<dbsg<dhjv>> M = kerVar.a.M(bvjk.aV, (dssr) dhjv.c.cu(7));
        kerVar.a(M);
        M.a(kerVar.c, kerVar.b);
        kepVar.e.f(kepVar.g.getResources().getConfiguration());
        kepVar.d.d(kepVar.e);
        kepVar.d.i().d(kepVar.s, kepVar.f);
        kepVar.t.a().d(kepVar.r, kepVar.f);
        kepVar.b.d(false);
        kea keaVar = kepVar.c;
        bvrj.UI_THREAD.c();
        keaVar.b.f(keaVar);
        btrm btrmVar = keaVar.d;
        kdy kdyVar = keaVar.a;
        dceq a2 = dcet.a();
        a2.b(crhp.class, new keb(0, crhp.class, kdyVar, bvrj.UI_THREAD));
        a2.b(amqo.class, new keb(1, amqo.class, kdyVar, bvrj.UI_THREAD));
        btrmVar.g(kdyVar, a2.a());
        keaVar.c.j().o(keaVar.e);
        keaVar.f.a().k();
        keaVar.e();
        keaVar.f();
    }
}
