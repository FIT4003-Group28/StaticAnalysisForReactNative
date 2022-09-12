package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: thi  reason: default package */
/* loaded from: classes7.dex */
public final class thi implements tgm {
    static final long a = eaow.d(2).b;
    public final btrm b;
    @dzsi
    public thh c = null;
    private final Activity d;
    private final dzsj<srv> e;
    private final tgf f;
    private final vxa g;

    public thi(Activity activity, dzsj<srv> dzsjVar, btrm btrmVar, tgf tgfVar, vxa vxaVar) {
        this.d = activity;
        this.e = dzsjVar;
        this.b = btrmVar;
        this.f = tgfVar;
        this.g = vxaVar;
    }

    @Override // defpackage.tgm
    public final dehn<tgl> a(dcdc<amvh> dcdcVar) {
        thh thhVar = this.c;
        if (thhVar != null) {
            thj.b(this.b, thhVar);
            this.c.c.cancel(true);
            this.c = null;
        }
        srv a2 = this.e.a();
        deig d = deig.d();
        thh thhVar2 = new thh(this, this.d, a2, d, dcdcVar);
        this.c = thhVar2;
        btrm btrmVar = this.b;
        dceq a3 = dcet.a();
        a3.b(srf.class, new thj(srf.class, thhVar2, bvrj.UI_THREAD));
        btrmVar.g(thhVar2, a3.a());
        dwao b = this.g.b(dqvj.DRIVE, 3, vul.DIRECTIONS_UI);
        tgf tgfVar = this.f;
        vum vumVar = new vum();
        tgfVar.b(vumVar);
        vumVar.c(dcdcVar);
        vumVar.a = b;
        a2.o(vumVar.a(), false, Long.valueOf(a), dcdc.e(), null);
        return d;
    }
}
