package defpackage;
/* compiled from: PG */
/* renamed from: anmh  reason: default package */
/* loaded from: classes2.dex */
final class anmh {
    private final angv a;
    private final anmf b;
    private final anmg c;
    private int d;
    private anme e;

    public anmh(btrm btrmVar, angv angvVar, btvo btvoVar, anmf anmfVar) {
        this.a = angvVar;
        this.b = anmfVar;
        duyl duylVar = btvoVar.getMapsActivitiesParameters().a;
        this.e = c(duylVar == null ? duyl.f : duylVar);
        anmg anmgVar = new anmg();
        this.c = anmgVar;
        dceq a = dcet.a();
        a.b(btvr.class, new anmk(btvr.class, anmgVar));
        btrmVar.g(anmgVar, a.a());
        this.d = 0;
    }

    private final anme c(duyl duylVar) {
        anmf anmfVar = this.b;
        angv angvVar = this.a;
        anmp a = anmfVar.a.a();
        anmf.a(a, 1);
        anmz a2 = anmfVar.b.a();
        anmf.a(a2, 2);
        anmf.a(anmfVar.c.a(), 3);
        anmf.a(angvVar, 4);
        anmf.a(duylVar, 5);
        return new anme(a, a2, angvVar, duylVar);
    }

    public final synchronized anme a() {
        int i = this.d;
        this.d = i + 1;
        if (i == 0 && this.e.c.d()) {
            dbsg<btvo> b = this.c.b();
            if (b.a()) {
                duyl duylVar = b.b().getMapsActivitiesParameters().a;
                if (duylVar == null) {
                    duylVar = duyl.f;
                }
                this.e = c(duylVar);
            }
        }
        return this.e;
    }

    public final synchronized void b() {
        this.d--;
    }
}
