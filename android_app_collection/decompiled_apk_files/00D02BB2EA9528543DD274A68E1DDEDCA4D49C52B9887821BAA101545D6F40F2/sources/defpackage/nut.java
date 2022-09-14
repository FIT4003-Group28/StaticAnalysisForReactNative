package defpackage;
/* compiled from: PG */
/* renamed from: nut  reason: default package */
/* loaded from: classes7.dex */
public final class nut extends itb {
    public final dxio<nxb> a;
    private final gga b;

    public nut(gga ggaVar, dxio<nxb> dxioVar) {
        this.b = ggaVar;
        this.a = dxioVar;
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.a.a().a();
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.a.a().b();
        super.Nu();
    }

    public final synchronized void e() {
        fd K = this.b.K();
        if (K instanceof nxm) {
            ((nxm) K).a();
        }
    }

    public final nxb f() {
        return this.a.a();
    }
}
