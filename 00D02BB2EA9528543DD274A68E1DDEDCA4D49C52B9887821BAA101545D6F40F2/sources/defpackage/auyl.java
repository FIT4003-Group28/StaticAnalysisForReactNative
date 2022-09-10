package defpackage;
/* compiled from: PG */
/* renamed from: auyl  reason: default package */
/* loaded from: classes.dex */
public final class auyl extends aujb {
    private final dxio<bypa> c;
    private final dxio<axvy> d;
    private final dxio<axwq> e;

    public auyl(dxio<bypa> dxioVar, dxio<axvy> dxioVar2, dxio<axwq> dxioVar3) {
        super(aujd.d(dpyv.TIME_TO_LEAVE.dm).a());
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
    }

    @Override // defpackage.aujb
    public final boolean f() {
        return true;
    }

    @Override // defpackage.aujb
    public final boolean g(btvo btvoVar) {
        return true;
    }

    @Override // defpackage.aujb
    public final void i(btvo btvoVar, boolean z) {
        this.e.a().t(this.d.a().h(z));
    }

    @Override // defpackage.aujb
    public final boolean r(dlfv dlfvVar, @dzsi btlu btluVar) {
        return this.c.a().b(qjj.TIME_TO_LEAVE, dlfvVar);
    }

    @Override // defpackage.aujb
    public final void s(@dzsi btlu btluVar, dlfv dlfvVar, boolean z) {
        this.c.a().a(btluVar, qjj.TIME_TO_LEAVE, dlfvVar);
    }
}
