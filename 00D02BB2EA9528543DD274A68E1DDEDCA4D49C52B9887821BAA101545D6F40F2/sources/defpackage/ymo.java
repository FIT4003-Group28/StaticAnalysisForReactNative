package defpackage;
/* compiled from: PG */
/* renamed from: ymo  reason: default package */
/* loaded from: classes7.dex */
public final class ymo implements ymn {
    private final dxio<bvjj> a;
    private final dxio<akfa> b;
    private final dbsg<ymm> c;

    public ymo(dxio<bvjj> dxioVar, dxio<akfa> dxioVar2, dbsg<ymm> dbsgVar) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dbsgVar;
    }

    @Override // defpackage.ymn
    public final yiv a() {
        return b(this.b.a().j());
    }

    @Override // defpackage.ymn
    public final yiv b(@dzsi btlu btluVar) {
        return (yiv) this.a.a().N(bvjk.ht, btluVar, (dssr) yiv.e.cu(7), yiv.e);
    }

    @Override // defpackage.ymn
    public final void c(yiv yivVar) {
        btlu j = this.b.a().j();
        if (j == null) {
            j = btlu.b;
        }
        d(j, yivVar);
        if (this.c.a()) {
            this.c.b().a(j, yivVar);
        }
    }

    @Override // defpackage.ymn
    public final void d(btlu btluVar, yiv yivVar) {
        this.a.a().am(bvjk.ht, btluVar, yivVar);
    }

    @Override // defpackage.ymn
    public final void e(yis yisVar) {
        yim ca = yiv.e.ca(a());
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        yiv yivVar = (yiv) ca.b;
        yisVar.getClass();
        yivVar.b = yisVar;
        yivVar.a |= 1;
        c(ca.bK());
    }
}
