package defpackage;
/* compiled from: PG */
/* renamed from: qrt  reason: default package */
/* loaded from: classes7.dex */
public final class qrt {
    public static final eaow a = eaow.b(2);
    public final cqat b;
    public final qjk c;

    public qrt(cqat cqatVar, qjk qjkVar) {
        this.b = cqatVar;
        this.c = qjkVar;
    }

    public static dndr a(eaol eaolVar, eape eapeVar) {
        dbsk.a(eapeVar.h(eaolVar));
        long f = eaor.f(eapeVar.m().l(2L));
        if (f != eapeVar.l()) {
            eaok eaokVar = eapeVar.a;
            long j = eapeVar.b;
            eapeVar = new eape(j, eaokVar.k(j, f, 1), eaokVar);
        }
        return eapeVar.h(eaolVar) ? dndr.WORK : dndr.HOME;
    }
}
