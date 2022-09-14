package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: barz  reason: default package */
/* loaded from: classes3.dex */
class barz extends base {
    private final drjj a;

    public barz(gga ggaVar, cqhn cqhnVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drjj drjjVar;
        if (drjsVar.a == 3) {
            drjjVar = (drjj) drjsVar.b;
        } else {
            drjjVar = drjj.c;
        }
        this.a = drjjVar;
    }

    @Override // defpackage.base
    public basq h() {
        drjh drjhVar = this.a.a;
        if (drjhVar == null) {
            drjhVar = drjh.j;
        }
        dqfu dqfuVar = drjhVar.d;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        return new basq(dqfuVar);
    }

    @Override // defpackage.base
    @dzsi
    public String j() {
        drjh drjhVar = this.a.a;
        if (drjhVar == null) {
            drjhVar = drjh.j;
        }
        drjf drjfVar = drjhVar.f;
        if (drjfVar == null) {
            drjfVar = drjf.d;
        }
        String str = drjfVar.c;
        return str.contains("%s") ? String.format(str, "70px") : str;
    }

    @Override // defpackage.base
    public final cqtd k() {
        return iup.e(R.raw.ic_no_airline_logo);
    }

    @Override // defpackage.base
    public final cqtd i(boolean z, boolean z2) {
        if (!z2 || z) {
            return iup.e(R.raw.ic_airport_outbound);
        }
        return iup.e(R.raw.ic_airport_return);
    }
}
