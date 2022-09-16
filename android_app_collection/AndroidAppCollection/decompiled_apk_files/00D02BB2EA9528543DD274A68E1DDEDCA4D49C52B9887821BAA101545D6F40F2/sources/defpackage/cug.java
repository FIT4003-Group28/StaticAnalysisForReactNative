package defpackage;
/* compiled from: PG */
/* renamed from: cug  reason: default package */
/* loaded from: classes5.dex */
final class cug extends akvn<aktd> {
    final /* synthetic */ cvj a;
    final /* synthetic */ cui b;

    public cug(cui cuiVar, cvj cvjVar) {
        this.b = cuiVar;
        this.a = cvjVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        aktd aktdVar = (aktd) obj;
        djie djieVar = this.b.f.get(aktdVar);
        if (djieVar == null) {
            return;
        }
        djja djjaVar = djieVar.d;
        if (djjaVar == null) {
            djjaVar = djja.e;
        }
        dpum dpumVar = djjaVar.a;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        alap b = alap.b(djieVar.c, akra.e(dpumVar.b, dpumVar.c), akqi.b(djieVar.b), aktdVar.g());
        cus bZ = cut.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cut cutVar = (cut) bZ.b;
        djieVar.getClass();
        cutVar.b = djieVar;
        cutVar.a |= 1;
        cvc cvcVar = this.a.m;
        if (cvcVar == null) {
            cvcVar = cvc.e;
        }
        String str = cvcVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cut cutVar2 = (cut) bZ.b;
        str.getClass();
        cutVar2.a |= 2;
        cutVar2.c = str;
        cvc cvcVar2 = this.a.m;
        if (cvcVar2 == null) {
            cvcVar2 = cvc.e;
        }
        boolean z = cvcVar2.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cut cutVar3 = (cut) bZ.b;
        cutVar3.a |= 4;
        cutVar3.d = z;
        ily ilyVar = new ily();
        ilyVar.i(b);
        ilyVar.f = false;
        ilyVar.u = null;
        ilyVar.D();
        ilyVar.C(false);
        ilyVar.j = true;
        ilyVar.F = bZ.bK();
        begj begjVar = new begj();
        begjVar.m = cjqm.a;
        begjVar.b(ilyVar.d());
        begjVar.d = null;
        begjVar.a = begi.BASE_MAP_POI;
        cup cupVar = this.b.i;
        if (cupVar != null) {
            cupVar.b.b(djieVar);
        }
        cvg cvgVar = this.a.l;
        if (cvgVar == null) {
            cvgVar = cvg.f;
        }
        if (cvgVar.b) {
            cvv cvvVar = this.b.e;
            dhph dhphVar = djieVar.f;
            if (dhphVar == null) {
                dhphVar = dhph.e;
            }
            String str2 = dhphVar.c;
            cvg cvgVar2 = this.a.l;
            if (cvgVar2 == null) {
                cvgVar2 = cvg.f;
            }
            cvvVar.c(str2, cvgVar2.c, 41);
        }
        cvc cvcVar3 = this.a.m;
        if (cvcVar3 == null) {
            cvcVar3 = cvc.e;
        }
        if (cvcVar3.b) {
            this.b.k.a().R(ilyVar.d(), begjVar);
        } else {
            this.b.c.a().o(begjVar, false, null);
        }
    }
}
