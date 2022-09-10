package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: basr  reason: default package */
/* loaded from: classes3.dex */
public class basr implements baqk {
    private final gga a;
    private final base b;
    private final boolean c;
    private final boolean d;
    @dzsi
    private final String e;

    public basr(gga ggaVar, cqhn cqhnVar, gdc gdcVar, brvh brvhVar, bnjv bnjvVar, bakx bakxVar, drjs drjsVar, @dzsi drjs drjsVar2, @dzsi drjs drjsVar3) {
        base barzVar;
        this.a = ggaVar;
        ily ilyVar = new ily();
        ilyVar.w(batk.e(drjsVar));
        bnju a = bnjvVar.a(ilyVar.d()).a();
        dccx F = dcdc.F();
        brrs j = brrx.j();
        j.b(dghs.DIRECTIONS);
        j.d(true);
        j.f(brrw.TRIP_RESERVATION_ITEM);
        ((brry) j).a = dtyd.de;
        F.g(j.a());
        brrs j2 = brrx.j();
        j2.b(dghs.MORE_INFO);
        j2.f(brrw.TRIP_RESERVATION_ITEM);
        ((brry) j2).a = dtyd.di;
        F.g(j2.a());
        brrs j3 = brrx.j();
        j3.b(dghs.CALL);
        j3.f(brrw.TRIP_RESERVATION_ITEM);
        ((brry) j3).a = dtyd.dc;
        F.g(j3.a());
        brvg a2 = brvhVar.a(a, F.f());
        drjr drjrVar = drjr.FLIGHT_RESERVATION;
        switch (drjr.a(drjsVar.a).ordinal()) {
            case 0:
                barzVar = new barz(ggaVar, cqhnVar, bakxVar, gdcVar, drjsVar, a2);
                break;
            case 1:
                barzVar = new basa(ggaVar, cqhnVar, bakxVar, gdcVar, drjsVar, a2);
                break;
            case 2:
                barzVar = new basd(ggaVar, cqhnVar, bakxVar, gdcVar, drjsVar, a2);
                break;
            case 3:
                barzVar = new bary(ggaVar, cqhnVar, bakxVar, gdcVar, drjsVar, a2);
                break;
            case 4:
                barzVar = new basb(ggaVar, cqhnVar, bakxVar, gdcVar, drjsVar, a2);
                break;
            case 5:
                barzVar = new barx(ggaVar, cqhnVar, bakxVar, gdcVar, drjsVar, a2);
                break;
            case 6:
                barzVar = new basc(ggaVar, cqhnVar, bakxVar, gdcVar, drjsVar, a2);
                break;
            default:
                throw new IllegalArgumentException("reservation type not set");
        }
        this.b = barzVar;
        boolean z = false;
        this.c = drjsVar2 == null;
        this.d = drjsVar3 == null ? true : z;
        String str = null;
        if (drjsVar2 != null && drjsVar2.a == 3 && drjsVar.a == 3 && ((drjj) drjsVar.b).b.equals(drjsVar2.c)) {
            drjh drjhVar = (drjsVar2.a == 3 ? (drjj) drjsVar2.b : drjj.c).a;
            dqfu dqfuVar = (drjhVar == null ? drjh.j : drjhVar).e;
            dqfuVar = dqfuVar == null ? dqfu.d : dqfuVar;
            drjh drjhVar2 = (drjsVar.a == 3 ? (drjj) drjsVar.b : drjj.c).a;
            dqfu dqfuVar2 = (drjhVar2 == null ? drjh.j : drjhVar2).d;
            dqfuVar2 = dqfuVar2 == null ? dqfu.d : dqfuVar2;
            str = dbsj.f(((dqfuVar.a & 1) == 0 || (dqfuVar2.a & 1) == 0) ? "" : batk.h(ggaVar, (int) TimeUnit.SECONDS.toMinutes(dqfuVar2.b - dqfuVar.b)));
        }
        this.e = str;
    }

    @Override // defpackage.baqk
    public cqtd a() {
        return this.b.i(this.c, this.d);
    }

    @Override // defpackage.baqk
    public String b() {
        basq h = this.b.h();
        dqfu dqfuVar = h.b;
        if (dqfuVar == null) {
            return batk.i(this.a, h.a);
        }
        return batk.l(this.a, h.a, dqfuVar);
    }

    @Override // defpackage.baqk
    public String c() {
        basq h = this.b.h();
        dqfu dqfuVar = h.b;
        if (dqfuVar == null) {
            gga ggaVar = this.a;
            dqfu dqfuVar2 = h.a;
            return batk.n(ggaVar, dqfuVar2, dqfuVar2, 18);
        }
        return batk.n(this.a, h.a, dqfuVar, 18);
    }

    @Override // defpackage.baqk
    public baqj d() {
        return this.b;
    }

    @Override // defpackage.baqk
    @dzsi
    public String e() {
        return this.e;
    }

    @Override // defpackage.baqk
    public Boolean f() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.baqk
    public Boolean g() {
        return Boolean.valueOf(this.d);
    }
}
