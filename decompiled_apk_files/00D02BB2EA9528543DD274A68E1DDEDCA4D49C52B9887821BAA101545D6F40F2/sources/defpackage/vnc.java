package defpackage;
/* compiled from: PG */
/* renamed from: vnc  reason: default package */
/* loaded from: classes7.dex */
public final class vnc implements jkh {
    public final dxio<akzh> a;
    @dzsi
    public dbty<Integer> b;
    public int c = -1;
    private final bvnx d;
    private final btrm e;
    private final dxio<akpm> f;
    private final jjn g;

    public vnc(bvnx bvnxVar, btrm btrmVar, dxio<akzh> dxioVar, dxio<akpm> dxioVar2, jjn jjnVar, dbty<Integer> dbtyVar) {
        this.d = bvnxVar;
        this.e = btrmVar;
        this.a = dxioVar;
        this.f = dxioVar2;
        this.g = jjnVar;
        this.b = dbtyVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        if (this.b == null) {
            return;
        }
        int U = jkjVar.U();
        dbty<Integer> dbtyVar = this.b;
        dbsk.s(dbtyVar);
        int intValue = U - dbtyVar.a().intValue();
        if (intValue == this.c || !this.f.a().i()) {
            return;
        }
        akzh a = this.a.a();
        if (jjnVar.equals(jjn.HIDDEN)) {
            b(intValue, a, alae.a);
        } else if ((jjnVar.equals(this.g) && f > 0.0f) || jjnVar.c(this.g)) {
        } else {
            a(intValue);
        }
    }

    public final void a(int i) {
        akzh a = this.a.a();
        int z = a.z();
        if (z == 0) {
            return;
        }
        b(i, a, new alae(0.0f, -(i / z)));
    }

    public final void b(int i, akzh akzhVar, alae alaeVar) {
        this.c = i;
        alad p = akzhVar.p();
        alaa b = alad.b(p);
        b.f = alaeVar;
        alad a = b.a();
        akzn akznVar = new akzn(this.d);
        akznVar.a(p, a);
        akznVar.p(0L);
        this.f.a().r(akznVar);
        this.e.b(new ardq(alaeVar));
    }
}
