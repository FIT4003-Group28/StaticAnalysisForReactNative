package defpackage;
/* compiled from: PG */
/* renamed from: afmb  reason: default package */
/* loaded from: classes2.dex */
final class afmb implements begr {
    final /* synthetic */ afmc a;

    public afmb(afmc afmcVar) {
        this.a = afmcVar;
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        bomu bomuVar;
        int a = duro.a(this.a.b.a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        Integer num = null;
        if (i == 1) {
            bomuVar = bomu.BUSINESS_HOURS;
        } else if (i == 2) {
            bomuVar = bomu.PHONE;
        } else if (i != 3) {
            bomuVar = i != 4 ? null : bomu.WEBSITE;
        } else {
            bomuVar = bomu.CATEGORY;
        }
        if (this.a.c != dpyv.UNKNOWN_NOTIFICATION_ID.dm) {
            num = Integer.valueOf(this.a.c);
        }
        this.a.e.e.a().D(bwrs.a(iloVar), bomuVar, num, this.a.d);
        if (this.a.c == dpyv.EMPLOYEE_HOURS.dm) {
            gga ggaVar = this.a.e.a;
            Integer valueOf = Integer.valueOf(dpyv.EMPLOYEE_HOURS.dm);
            afme afmeVar = this.a.e;
            avac.bp(ggaVar, valueOf, afmeVar.d, afmeVar.f, afmeVar.b);
        } else if (this.a.c != dpyv.BUSINESS_OWNER_HOURS.dm) {
        } else {
            gga ggaVar2 = this.a.e.a;
            Integer valueOf2 = Integer.valueOf(dpyv.BUSINESS_OWNER_HOURS.dm);
            afme afmeVar2 = this.a.e;
            avac.bp(ggaVar2, valueOf2, afmeVar2.d, afmeVar2.f, afmeVar2.b);
        }
    }
}
