package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: asvu  reason: default package */
/* loaded from: classes2.dex */
public final class asvu implements aqzz {
    final /* synthetic */ asvw a;

    public asvu(asvw asvwVar) {
        this.a = asvwVar;
    }

    @Override // defpackage.aqzz
    public final void a(amzi amziVar) {
        asvw asvwVar = this.a;
        asvwVar.e = amziVar;
        asvwVar.h();
        this.a.j();
        if (!this.a.c.d()) {
            amziVar.setIsNorthUpModeForAccessibility(this.a.c.a());
        } else {
            amziVar.setIsNorthUpModeForAccessibility(true);
        }
    }

    @Override // defpackage.aqzz
    public final void b() {
        this.a.e = null;
    }

    @Override // defpackage.aqzz
    public final void c() {
        amzi amziVar = this.a.e;
        dbsk.s(amziVar);
        if (this.a.c.d()) {
            if (amziVar.a()) {
                return;
            }
            asvx asvxVar = this.a.c;
            bvrj.UI_THREAD.c();
            asvxVar.b = 2;
            asvxVar.e();
            asvw asvwVar = this.a;
            asvwVar.a.b(new aswb(asvwVar.c.a()));
            return;
        }
        asvx asvxVar2 = this.a.c;
        bvrj.UI_THREAD.c();
        if (!asvxVar2.d()) {
            asvxVar2.c(!asvxVar2.a);
        }
        amziVar.setIsNorthUpModeForAccessibility(this.a.c.a());
        this.a.b.S(bvjk.cb, this.a.c.a());
        this.a.h();
        asvw asvwVar2 = this.a;
        asvwVar2.a.b(new aswb(asvwVar2.c.a()));
    }
}
