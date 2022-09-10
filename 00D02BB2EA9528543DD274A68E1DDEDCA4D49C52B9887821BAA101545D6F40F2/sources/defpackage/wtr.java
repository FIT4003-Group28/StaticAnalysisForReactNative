package defpackage;
/* compiled from: PG */
/* renamed from: wtr  reason: default package */
/* loaded from: classes7.dex */
public final class wtr {
    private final vwv a;
    private final vxa b;
    private final btth c;
    private final dxio<ascb> d;
    private final dxio<vzi> e;
    private final amub f;

    public wtr(vwv vwvVar, vxa vxaVar, ahjq ahjqVar, dxio<ascb> dxioVar, dxio<vzi> dxioVar2, amub amubVar) {
        this.a = vwvVar;
        this.b = vxaVar;
        this.c = ahjqVar;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = amubVar;
    }

    public final boolean a() {
        return this.f.j().k() && zba.g(this.f, null, this.c, this.a);
    }

    public final void b() {
        if (a()) {
            qcw x = qcx.x();
            x.k(qbs.NAVIGATION);
            x.s(dqvj.DRIVE);
            x.d(true);
            x.j(true);
            x.r(this.f.j());
            x.u(this.f.k());
            this.d.a().d(x.a(), asca.RICKSHAWS);
            return;
        }
        vum vumVar = new vum();
        vumVar.c(dcdc.g(this.f.j(), this.f.k()));
        vumVar.a = this.b.b(dqvj.DRIVE, 3, vul.NAVIGATION_ONLY);
        this.e.a().b(vumVar.a());
    }
}
