package defpackage;
/* compiled from: PG */
/* renamed from: arbl  reason: default package */
/* loaded from: classes.dex */
public final class arbl implements Runnable {
    public final akpq a;
    @dzsi
    public akzh b;
    @dzsi
    private arci c;
    private final area d;
    private final arbe e;

    public arbl(arci arciVar, arbe arbeVar, akpq akpqVar) {
        area areaVar = new area();
        this.c = arciVar;
        dbsk.s(arbeVar);
        this.e = arbeVar;
        dbsk.s(akpqVar);
        this.a = akpqVar;
        this.d = areaVar;
    }

    public final synchronized void a(@dzsi arci arciVar) {
        this.c = arciVar;
        this.a.b(this);
        this.a.d();
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        boolean b;
        akzh akzhVar = this.b;
        dbsk.s(akzhVar);
        arbe arbeVar = this.e;
        area areaVar = this.d;
        arbi arbiVar = arbeVar.b;
        if (arbiVar.y == null) {
            areaVar.d();
        } else {
            arbeVar.a = arbiVar.p.b(arbiVar.d.a());
            synchronized (arbeVar.b.o) {
                arbi arbiVar2 = arbeVar.b;
                arbiVar2.p.a(arbiVar2.o);
                arbi arbiVar3 = arbeVar.b;
                if (arbiVar3.b.l) {
                    b = ahnb.b(arbiVar3.o.p, arbiVar3.c.e());
                } else {
                    b = ahnb.b(arbiVar3.o.o, arbiVar3.c.b());
                }
                float f = true != b ? 0.0f : 1.0f;
                area areaVar2 = arbeVar.b.o;
                if (areaVar2.n != f) {
                    areaVar2.n = f;
                }
                areaVar.b(areaVar2);
            }
            for (arbw arbwVar : arbeVar.b.g) {
                arbwVar.a();
            }
        }
        if (!this.d.e() || !this.d.f(akzhVar.r())) {
            this.d.t = false;
        } else {
            area areaVar3 = this.d;
            areaVar3.t = true;
            arci arciVar = this.c;
            if (arciVar != null) {
                arciVar.a(areaVar3, akzhVar);
            }
        }
        arbe arbeVar2 = this.e;
        synchronized (arbeVar2.b.o) {
            if (!arbeVar2.b.o.e()) {
                return;
            }
            if (!arbeVar2.a) {
                return;
            }
            this.a.b(this);
            this.a.d();
        }
    }
}
