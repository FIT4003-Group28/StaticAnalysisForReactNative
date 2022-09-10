package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaaz  reason: default package */
/* loaded from: classes2.dex */
public final class aaaz implements aaav, aacv, aabh, aadx, brzc, aadv, aadq, aacy {
    @dzsi
    aabc a;

    @Override // defpackage.aaav
    public final void a(aaco aacoVar) {
        if (this.a == null) {
            return;
        }
        i().ak = aacoVar;
        i().al.clear();
        aacw aacwVar = i().as;
        dbsk.s(aacwVar);
        if (aacoVar.a()) {
            aacwVar.QF(izr.VIEW);
        } else {
            aacwVar.QF(izr.LOADING);
        }
        cqkx.p(aacwVar);
        aabi aabiVar = i().at;
        dbsk.s(aabiVar);
        aabiVar.c(aacoVar);
        aadd aaddVar = i().au;
        dbsk.s(aaddVar);
        aaddVar.f(aacoVar);
        aacc aaccVar = i().av;
        dbsk.s(aaccVar);
        aaccVar.a(aacoVar);
        aadt aadtVar = i().ap;
        dbsk.s(aadtVar);
        aadtVar.b(aacoVar);
        aada aadaVar = i().aq;
        dbsk.s(aadaVar);
        aabc i = i();
        aadaVar.c();
        if (aacoVar.a()) {
            if (aadaVar.e) {
                aadaVar.e = false;
                aadaVar.b(i);
            }
            if (aadaVar.f == 2 && aacoVar.b().a() && aacoVar.b().b().b.isEmpty()) {
                if (aadaVar.d == null) {
                    aadaVar.d = ckos.a(aadaVar.a.findViewById(16908290), aadaVar.a.getString(R.string.EXPERIENCE_CATEGORICAL_NO_RESULT_PAN_OR_ZOOM), 0);
                }
                aadaVar.d.c();
            }
        }
        aaar aaarVar = i().ar;
        dbsk.s(aaarVar);
        aaarVar.a(aacoVar);
        aaeb aaebVar = i().aj;
        if (!aacoVar.a()) {
            return;
        }
        ((ckhe) aaebVar.a.a(ckfb.f)).c();
    }

    @Override // defpackage.aadx, defpackage.aadv
    public final void b(aacn aacnVar) {
        if (this.a == null) {
            return;
        }
        aacw aacwVar = i().as;
        dbsk.s(aacwVar);
        aacwVar.ag(aacnVar);
        aadd aaddVar = i().au;
        dbsk.s(aaddVar);
        aacj aacjVar = aaddVar.a.e;
        dprx dprxVar = aacnVar.a().b;
        if (dprxVar == null) {
            dprxVar = dprx.h;
        }
        dpsh dpshVar = dprxVar.f;
        if (dpshVar == null) {
            dpshVar = dpsh.e;
        }
        aacjVar.a = Boolean.valueOf(dpshVar.b);
        aaddVar.b.p(false);
        aadz aadzVar = i().ao;
        dbsk.s(aadzVar);
        aadzVar.g = aacnVar;
        aadw aadwVar = i().am;
        dbsk.s(aadwVar);
        aadwVar.a = aacnVar;
        aadt aadtVar = i().ap;
        dbsk.s(aadtVar);
        aadtVar.a(aacnVar);
        aacc aaccVar = i().av;
        dbsk.s(aaccVar);
        for (alax alaxVar : aaccVar.f) {
            alaxVar.b();
            alaxVar.c();
        }
        aaccVar.f.clear();
        aaccVar.g.clear();
        aaccVar.h.clear();
        aaar aaarVar = i().ar;
        dbsk.s(aaarVar);
        dils a = aacnVar.a();
        aaarVar.b = new aaaq(aaarVar, a);
        dprx dprxVar2 = a.b;
        if (dprxVar2 == null) {
            dprxVar2 = dprx.h;
        }
        dpsh dpshVar2 = dprxVar2.f;
        if (dpshVar2 == null) {
            dpshVar2 = dpsh.e;
        }
        aaarVar.e = !dpshVar2.d;
        aaarVar.c = dbpy.a;
        aaarVar.d = dbpy.a;
        aaaw aaawVar = i().an;
        dbsk.s(aaawVar);
        aacq b = aaawVar.a.b(aacnVar);
        if (b.a()) {
            deha.q(b.b(), new aaau(aaawVar, aacnVar), dege.a);
        } else {
            aaawVar.b.a(aacnVar);
        }
    }

    @Override // defpackage.aadh, defpackage.aabh
    public final void c() {
        if (this.a == null) {
            return;
        }
        aada aadaVar = i().aq;
        dbsk.s(aadaVar);
        aadaVar.a(i());
    }

    @Override // defpackage.aadh, defpackage.aabh
    public final void d() {
        if (this.a == null) {
            return;
        }
        aada aadaVar = i().aq;
        dbsk.s(aadaVar);
        aadaVar.b(i());
    }

    @Override // defpackage.brzc
    public final void e(bsjm bsjmVar, ddda dddaVar, cjqm cjqmVar) {
        if (this.a == null) {
            return;
        }
        aadd aaddVar = i().au;
        dbsk.s(aaddVar);
        aaddVar.g(bsjmVar);
        aadw aadwVar = i().am;
        dbsk.s(aadwVar);
        aadwVar.b(bsjmVar, cjqmVar);
    }

    @Override // defpackage.brzc
    public final void f(int i) {
        dbsk.s(i().am);
        aabc i2 = i();
        aaco aacoVar = i().ak;
        gn gnVar = i().A;
        dbsk.s(gnVar);
        bsaa.aJ(aadw.a(aacoVar), i).aP(gnVar, i2);
    }

    @Override // defpackage.brzc
    public final void g() {
        dbsk.s(i().am);
        i().aZ(brzg.g(aadw.a(i().ak)));
    }

    @Override // defpackage.aafs, defpackage.aabh
    public final void h() {
        if (this.a == null) {
            return;
        }
        i().e();
    }

    public final aabc i() {
        aabc aabcVar = this.a;
        dbsk.s(aabcVar);
        return aabcVar;
    }
}
