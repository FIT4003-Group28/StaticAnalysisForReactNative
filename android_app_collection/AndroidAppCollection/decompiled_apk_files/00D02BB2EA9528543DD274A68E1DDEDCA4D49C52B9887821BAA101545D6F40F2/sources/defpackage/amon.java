package defpackage;
/* compiled from: PG */
/* renamed from: amon  reason: default package */
/* loaded from: classes.dex */
public final class amon implements amom {
    private final bnsn a;
    private final amok b;
    private final cqat c;
    private final alwi d;

    public amon(bnsn bnsnVar, amok amokVar, cqat cqatVar, alwi alwiVar) {
        this.a = bnsnVar;
        this.b = amokVar;
        this.c = cqatVar;
        this.d = alwiVar;
    }

    @Override // defpackage.amom
    public final void a(alwf alwfVar, amzz amzzVar, @dzsi aktk aktkVar, amol amolVar) {
        this.c.b();
        amok amokVar = this.b;
        amps ampsVar = new amps(alwfVar.a, this.a, amokVar.a, amokVar.b, alwfVar, null, 0, null, -1L, -1L, amokVar.c, null, null);
        ampsVar.f(alwfVar, amzzVar, null);
        dcdc.e();
        this.c.b();
        amor amorVar = (amor) amolVar;
        if (amorVar.a != null && amorVar.b == amorVar.e.s.get()) {
            amorVar.e.c.e(amorVar.a, amorVar.c, ampsVar);
            amos amosVar = amorVar.e.o;
            if (amosVar != null) {
                amosVar.b(ampsVar);
            }
        }
        Runnable runnable = amorVar.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0252 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0253  */
    @Override // defpackage.amom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.alyt r20, @defpackage.dzsi defpackage.alyg r21, defpackage.amzz r22, defpackage.amol r23) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amon.b(alyt, alyg, amzz, amol):void");
    }
}
