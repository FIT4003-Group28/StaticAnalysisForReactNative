package defpackage;
/* compiled from: PG */
/* renamed from: ashb  reason: default package */
/* loaded from: classes2.dex */
public final class ashb implements ashh {
    boolean a;
    private final ashr b;
    @dzsi
    private ashq c;

    public ashb(brlz brlzVar, asik asikVar, akfa akfaVar, ashr ashrVar, btrm btrmVar, ashf ashfVar) {
        this.a = false;
        this.b = ashrVar;
        daqq daqqVar = brlzVar.g;
        boolean a = a(daqqVar, asikVar, akfaVar);
        if (a && daqqVar != null && !ashfVar.b()) {
            daqi daqiVar = daqqVar.f;
            this.a = (daqiVar == null ? daqi.b : daqiVar).a;
        }
        btrmVar.b(new crhd(true != a ? 3 : 2));
    }

    public static boolean a(@dzsi daqq daqqVar, asik asikVar, akfa akfaVar) {
        return !akfaVar.d() && !asikVar.a() && daqqVar != null && daqqVar.d;
    }

    @Override // defpackage.ashh
    @dzsi
    public final asho b() {
        if (!this.a) {
            return null;
        }
        if (this.c == null) {
            ashr ashrVar = this.b;
            gga a = ashrVar.a.a();
            ashr.a(a, 1);
            cpwx a2 = ashrVar.b.a();
            ashr.a(a2, 2);
            aufc a3 = ashrVar.c.a();
            ashr.a(a3, 3);
            dehq a4 = ashrVar.d.a();
            ashr.a(a4, 4);
            this.c = new ashq(a, a2, a3, a4);
        }
        return this.c;
    }
}
