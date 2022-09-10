package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhyg  reason: default package */
/* loaded from: classes3.dex */
public final class bhyg implements axxd {
    final /* synthetic */ bhyo a;

    public bhyg(bhyo bhyoVar) {
        this.a = bhyoVar;
    }

    @Override // defpackage.axxd
    public final void a(boolean z) {
        List<azvo> c = this.a.e.x().c(this.a.d.c().ai());
        ily g = this.a.d.c().g();
        g.C = c;
        this.a.d.d(g.d());
        bhuo bhuoVar = this.a.l.a;
        if (bhuoVar.aD) {
            gga ggaVar = bhuoVar.aE;
            dbsk.s(ggaVar);
            ggaVar.g().g(gfu.b(bhul.class, gfu.ACTIVITY_FRAGMENT, new gfs[0]), 1);
        }
        this.a.g.b(new bhyf(this), bvrj.UI_THREAD);
    }
}
