package defpackage;
/* compiled from: PG */
/* renamed from: crgg  reason: default package */
/* loaded from: classes5.dex */
public final class crgg implements crgy {
    private final btpa a;
    private final dxio<ahjq> b;
    private final ckcw c;

    public crgg(btpa btpaVar, dxio<ahjq> dxioVar, ckcw ckcwVar) {
        this.b = dxioVar;
        this.a = btpaVar;
        this.c = ckcwVar;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        this.a.g();
        this.a.e(dukj.NAVIGATION_STARTED, this.b.a().h().d());
        this.c.b(ckgx.NAVIGATION_STATE, crgb.a);
        arym arymVar = arym.FREE_NAV;
        int ordinal = crgzVar.a.ordinal();
        if (ordinal == 0) {
            this.c.b(ckgx.NAVIGATION_MODE, crgc.a);
        } else if (ordinal != 1) {
        } else {
            this.c.b(ckgx.NAVIGATION_MODE, crgd.a);
        }
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.a.e(dukj.NAVIGATION_ENDED, this.b.a().h().d());
        this.c.b(ckgx.NAVIGATION_STATE, crge.a);
        this.c.b(ckgx.NAVIGATION_MODE, crgf.a);
        this.a.h();
    }
}
