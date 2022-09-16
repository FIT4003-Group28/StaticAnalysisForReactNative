package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aady  reason: default package */
/* loaded from: classes2.dex */
public final class aady implements brbe {
    final /* synthetic */ aadz a;

    public aady(aadz aadzVar) {
        this.a = aadzVar;
    }

    @Override // defpackage.brbe
    public final void a() {
        aadz aadzVar = this.a;
        cjqm i = aadzVar.d.i(cjtd.a(dtxo.bC));
        dils a = aadzVar.g.a();
        dsqp dsqpVar = (dsqp) a.cu(5);
        dsqpVar.bC(a);
        dilr dilrVar = (dilr) dsqpVar;
        dnqg bZ = dnqh.p.bZ();
        int i2 = ddda.cy.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i2;
        if (i.a().a()) {
            String b = i.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b;
            doeh bZ2 = doei.d.bZ();
            String b2 = i.a().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doei doeiVar = (doei) bZ2.b;
            b2.getClass();
            doeiVar.a |= 4;
            doeiVar.c = b2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar3 = (dnqh) bZ.b;
            doei bK = bZ2.bK();
            bK.getClass();
            dnqhVar3.m = bK;
            dnqhVar3.a |= 262144;
        }
        if (dilrVar.c) {
            dilrVar.bF();
            dilrVar.c = false;
        }
        dils dilsVar = (dils) dilrVar.b;
        dnqh bK2 = bZ.bK();
        dils dilsVar2 = dils.i;
        bK2.getClass();
        dilsVar.g = bK2;
        dilsVar.a |= 64;
        akzh l = aadzVar.c.l();
        dhjx Y = aadzVar.c.Y(l.p());
        dsqp dsqpVar2 = (dsqp) Y.cu(5);
        dsqpVar2.bC(Y);
        dhjw dhjwVar = (dhjw) dsqpVar2;
        Rect e = aadzVar.e.e();
        float B = l.B();
        int height = (int) (e.height() / B);
        int width = (int) (e.width() / B);
        dhkd dhkdVar = Y.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        dsqp dsqpVar3 = (dsqp) dhkdVar.cu(5);
        dsqpVar3.bC(dhkdVar);
        dhkc dhkcVar = (dhkc) dsqpVar3;
        if (dhkcVar.c) {
            dhkcVar.bF();
            dhkcVar.c = false;
        }
        dhkd dhkdVar2 = (dhkd) dhkcVar.b;
        int i3 = dhkdVar2.a | 2;
        dhkdVar2.a = i3;
        dhkdVar2.c = height;
        dhkdVar2.a = i3 | 1;
        dhkdVar2.b = width;
        if (dhjwVar.c) {
            dhjwVar.bF();
            dhjwVar.c = false;
        }
        dhjx dhjxVar = (dhjx) dhjwVar.b;
        dhkd bK3 = dhkcVar.bK();
        bK3.getClass();
        dhjxVar.d = bK3;
        dhjxVar.a |= 4;
        alrh ak = aadzVar.c.ak();
        if (ak == null) {
            bvoo.h("Unable to get non-null projection for finding the center of the visible viewport.", new Object[0]);
        } else {
            akqq a2 = ak.a(new Point(e.centerX(), e.centerY()));
            if (a2 == null) {
                bvoo.h("The center of the visible viewport does not intersect the ground plane.", new Object[0]);
            } else {
                dhjz dhjzVar = Y.b;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                dsqp dsqpVar4 = (dsqp) dhjzVar.cu(5);
                dsqpVar4.bC(dhjzVar);
                dhjy dhjyVar = (dhjy) dsqpVar4;
                double d = a2.a;
                if (dhjyVar.c) {
                    dhjyVar.bF();
                    dhjyVar.c = false;
                }
                dhjz dhjzVar2 = (dhjz) dhjyVar.b;
                int i4 = dhjzVar2.a | 2;
                dhjzVar2.a = i4;
                dhjzVar2.c = d;
                double d2 = a2.b;
                dhjzVar2.a = i4 | 1;
                dhjzVar2.b = d2;
                if (dhjwVar.c) {
                    dhjwVar.bF();
                    dhjwVar.c = false;
                }
                dhjx dhjxVar2 = (dhjx) dhjwVar.b;
                dhjz bK4 = dhjyVar.bK();
                bK4.getClass();
                dhjxVar2.b = bK4;
                dhjxVar2.a |= 1;
                float f = Y.e;
                float f2 = height;
                dhkd dhkdVar3 = Y.d;
                if (dhkdVar3 == null) {
                    dhkdVar3 = dhkd.d;
                }
                float f3 = f * (f2 / dhkdVar3.c);
                if (dhjwVar.c) {
                    dhjwVar.bF();
                    dhjwVar.c = false;
                }
                dhjx dhjxVar3 = (dhjx) dhjwVar.b;
                dhjxVar3.a |= 8;
                dhjxVar3.e = f3;
                Y = dhjwVar.bK();
            }
        }
        if (dilrVar.c) {
            dilrVar.bF();
            dilrVar.c = false;
        }
        dils dilsVar3 = (dils) dilrVar.b;
        Y.getClass();
        dilsVar3.c = Y;
        dilsVar3.a |= 2;
        dprx dprxVar = dilsVar3.b;
        if (dprxVar == null) {
            dprxVar = dprx.h;
        }
        dsqp dsqpVar5 = (dsqp) dprxVar.cu(5);
        dsqpVar5.bC(dprxVar);
        dprs dprsVar = (dprs) dsqpVar5;
        dpsh dpshVar = ((dprx) dprsVar.b).f;
        if (dpshVar == null) {
            dpshVar = dpsh.e;
        }
        dsqp dsqpVar6 = (dsqp) dpshVar.cu(5);
        dsqpVar6.bC(dpshVar);
        dpsg dpsgVar = (dpsg) dsqpVar6;
        if (dpsgVar.c) {
            dpsgVar.bF();
            dpsgVar.c = false;
        }
        dpsh dpshVar2 = (dpsh) dpsgVar.b;
        dpshVar2.a |= 8;
        dpshVar2.d = true;
        if (dprsVar.c) {
            dprsVar.bF();
            dprsVar.c = false;
        }
        dprx dprxVar2 = (dprx) dprsVar.b;
        dpsh bK5 = dpsgVar.bK();
        bK5.getClass();
        dprxVar2.f = bK5;
        dprxVar2.a |= 16;
        if (dilrVar.c) {
            dilrVar.bF();
            dilrVar.c = false;
        }
        dils dilsVar4 = (dils) dilrVar.b;
        dprx bK6 = dprsVar.bK();
        bK6.getClass();
        dilsVar4.b = bK6;
        dilsVar4.a |= 1;
        aadzVar.f.b(new aacn(dilrVar.bK()));
    }
}
