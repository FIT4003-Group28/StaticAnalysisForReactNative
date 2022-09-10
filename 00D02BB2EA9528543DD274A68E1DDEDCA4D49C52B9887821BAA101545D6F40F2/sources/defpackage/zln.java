package defpackage;
/* compiled from: PG */
/* renamed from: zln  reason: default package */
/* loaded from: classes7.dex */
public final class zln implements bzml {
    public final dxio<bzmm> a;
    public dbsg<vnk> b = dbpy.a;
    public dbsg<zlo> c = dbpy.a;
    public Runnable d = deic.a;
    public dbsg<qbq> e = dbpy.a;
    private final vpd f;
    private final zlp g;

    public zln(vpd vpdVar, zlp zlpVar, dxio<bzmm> dxioVar) {
        this.f = vpdVar;
        this.g = zlpVar;
        this.a = dxioVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.VEHICLE_ROTATION_RESTRICTION_ONE_DIRECTION_BANNER;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        if (this.b.a()) {
            return g(this.b.b());
        }
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar == bzmk.REPRESSED || bzmkVar == bzmk.NONE || !this.b.a() || !this.e.a()) {
            return false;
        }
        zlp zlpVar = this.g;
        Runnable runnable = this.d;
        qbq b = this.e.b();
        vpd a = zlpVar.a.a();
        zlp.a(a, 1);
        ziq a2 = zlpVar.b.a();
        zlp.a(a2, 2);
        zlp.a(runnable, 3);
        zlp.a(b, 4);
        dbsg<zlo> i = dbsg.i(new zlo(a, a2, runnable, b));
        this.c = i;
        i.b().f(this.b.b(), true);
        return true;
    }

    public final boolean g(vnk vnkVar) {
        amte p;
        if ((this.f.c(vpc.JAKARTA) || this.f.c(vpc.SAO_PAULO) || this.f.c(vpc.MANILA) || this.f.c(vpc.SANTIAGO)) && !this.f.j() && ((this.a.a().d(dqkc.VEHICLE_ROTATION_RESTRICTION_ONE_DIRECTION_BANNER) < 3 || this.c.a()) && vnkVar.g() == dqvj.DRIVE && (p = vnkVar.l().d().p()) != null)) {
            for (int i = 0; i < p.a.n(); i++) {
                if (vnkVar.g() == p.c(i)) {
                    dphv b = dphv.b(p.a.m(i).a.z);
                    if (b == null) {
                        b = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
                    }
                    vpc g = vph.g(b);
                    if (g != null && this.f.c(g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
