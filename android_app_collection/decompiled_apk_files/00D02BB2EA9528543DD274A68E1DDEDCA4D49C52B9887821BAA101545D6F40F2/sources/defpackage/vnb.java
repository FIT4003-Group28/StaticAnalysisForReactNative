package defpackage;
/* compiled from: PG */
/* renamed from: vnb  reason: default package */
/* loaded from: classes7.dex */
public final class vnb {
    public final dxio<akzh> a;
    private final btrm c;
    private final bvnx d;
    private final dxio<akpm> e;
    @dzsi
    private acyu f;
    public int b = -1;
    private final acyt g = new vna(this);

    public vnb(btrm btrmVar, bvnx bvnxVar, dxio<akpm> dxioVar, dxio<akzh> dxioVar2) {
        this.c = btrmVar;
        this.d = bvnxVar;
        this.e = dxioVar;
        this.a = dxioVar2;
    }

    public final void a(@dzsi acyu acyuVar) {
        if (dbsd.a(acyuVar, this.f)) {
            return;
        }
        acyu acyuVar2 = this.f;
        if (acyuVar2 != null) {
            acyuVar2.m(this.g);
        }
        this.f = acyuVar;
        if (acyuVar == null) {
            return;
        }
        acyuVar.l(this.g);
        b();
    }

    public final void b() {
        acyu acyuVar = this.f;
        if (acyuVar == null) {
            return;
        }
        int i = ((zut) acyuVar).e;
        if (!this.e.a().i()) {
            return;
        }
        c(i);
    }

    public final void c(int i) {
        akzh a = this.a.a();
        int z = a.z();
        if (z == 0) {
            return;
        }
        d(i, a, new alae(0.0f, -(i / z)));
    }

    public final void d(int i, akzh akzhVar, alae alaeVar) {
        this.b = i;
        alad p = akzhVar.p();
        alaa b = alad.b(p);
        b.f = alaeVar;
        alad a = b.a();
        akzn akznVar = new akzn(this.d);
        akznVar.a(p, a);
        akznVar.p(0L);
        this.e.a().r(akznVar);
        this.c.b(new ardq(alaeVar));
    }
}
