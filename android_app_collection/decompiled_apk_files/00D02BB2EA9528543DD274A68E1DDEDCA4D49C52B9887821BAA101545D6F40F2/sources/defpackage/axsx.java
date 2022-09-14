package defpackage;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: axsx  reason: default package */
/* loaded from: classes3.dex */
public final class axsx implements axub {
    public sic a;
    public btvo b;
    public befw c;
    public bwqv d;
    public final Activity e;
    @dzsi
    private final axuc f;

    public axsx(Activity activity, @dzsi axuc axucVar) {
        ((axry) btsq.c(axry.class, activity)).xg(this);
        this.e = activity;
        this.f = axucVar;
    }

    @Override // defpackage.axub
    public final void a(@dzsi azvc azvcVar) {
        String j;
        axuc axucVar = this.f;
        if (axucVar != null) {
            axucVar.a(this.e).a(azvcVar);
        }
        if (azvcVar != null) {
            azvd azvdVar = (azvd) azvcVar;
            this.a.e(azvdVar.a);
            dvko dvkoVar = this.b.getPersonalPlacesParameters().b;
            if (dvkoVar == null) {
                dvkoVar = dvko.n;
            }
            if (!dvkoVar.l) {
                return;
            }
            final azxa azxaVar = azvdVar.b;
            ily ilyVar = new ily();
            ilyVar.j(azxaVar.b());
            if (dbsj.d(azxaVar.j())) {
                j = azxaVar.c();
            } else {
                j = azxaVar.j();
            }
            ilyVar.u = j;
            bwrs<ilo> a = bwrs.a(ilyVar.d());
            this.d.f(a, new bwrr(this, azxaVar) { // from class: axsw
                private final axsx a;
                private final azxa b;

                {
                    this.a = this;
                    this.b = azxaVar;
                }

                @Override // defpackage.bwrr
                public final void PV(Object obj) {
                    axsx axsxVar = this.a;
                    azxa azxaVar2 = this.b;
                    ilo iloVar = (ilo) obj;
                    fd K = ((gga) axsxVar.e).K();
                    if (K != null && K.U()) {
                        ((gga) axsxVar.e).g().e();
                    }
                    dbsk.s(iloVar);
                    if (iloVar.cy() != null) {
                        dobr cy = iloVar.cy();
                        dbsk.s(cy);
                        if (!dcft.m(cy.f, axsv.a).a()) {
                            return;
                        }
                        azsv azsvVar = new azsv();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("alias", azxaVar2);
                        bundle.putSerializable("pmk", iloVar);
                        azsvVar.B(bundle);
                        ((gga) axsxVar.e).D(azsvVar);
                    }
                }
            }, false);
            befw befwVar = this.c;
            befu p = befv.p();
            p.j(a);
            befwVar.d(p.m());
        }
    }

    @Override // defpackage.axub
    public final void b() {
        axuc axucVar = this.f;
        if (axucVar != null) {
            axucVar.a(this.e).b();
        }
    }
}
