package defpackage;
/* compiled from: PG */
/* renamed from: wdh  reason: default package */
/* loaded from: classes7.dex */
public final class wdh {
    public static final dcdc<dqvj> a = dcdc.g(dqvj.TRANSIT, dqvj.DRIVE);
    public final dehp b;
    public final axwe c;
    public final axvy d;

    public wdh(dehp dehpVar, axwe axweVar, axvy axvyVar) {
        this.b = dehpVar;
        this.c = axweVar;
        this.d = axvyVar;
    }

    public static dnkn a(String str, @dzsi amvh amvhVar) {
        dnkj bZ = dnkn.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnkn dnknVar = (dnkn) bZ.b;
        str.getClass();
        dnknVar.a |= 1;
        dnknVar.d = str;
        if (amvhVar != null) {
            dnkf bZ2 = dnki.f.bZ();
            akqq akqqVar = amvhVar.e;
            dbsk.s(akqqVar);
            dnoh g = akqqVar.g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnki dnkiVar = (dnki) bZ2.b;
            g.getClass();
            dnkiVar.c = g;
            dnkiVar.a |= 2;
            akqi akqiVar = amvhVar.d;
            if (akqiVar != null && !akqiVar.equals(akqi.a)) {
                String o = amvhVar.d.o();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnki dnkiVar2 = (dnki) bZ2.b;
                o.getClass();
                dnkiVar2.a |= 4;
                dnkiVar2.d = o;
            }
            if (!dbsj.d(amvhVar.p())) {
                String p = amvhVar.p();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnki dnkiVar3 = (dnki) bZ2.b;
                p.getClass();
                dnkiVar3.a |= 8;
                dnkiVar3.e = p;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnkn dnknVar2 = (dnkn) bZ.b;
            dnki bK = bZ2.bK();
            bK.getClass();
            dnknVar2.c = bK;
            dnknVar2.b = 2;
        } else {
            dnkl dnklVar = dnkl.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnkn dnknVar3 = (dnkn) bZ.b;
            dnklVar.getClass();
            dnknVar3.c = dnklVar;
            dnknVar3.b = 5;
        }
        return bZ.bK();
    }

    public static amvh b(dnki dnkiVar) {
        amvg P = amvh.P();
        dnoh dnohVar = dnkiVar.c;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        P.d = akqq.e(dnohVar);
        if (!dnkiVar.d.isEmpty()) {
            P.c = akqi.b(dnkiVar.d);
        }
        if (!dnkiVar.e.isEmpty()) {
            P.j = dnkiVar.e;
        }
        return P.a();
    }

    public static dbsg<dnlg> c(azwc azwcVar) {
        dnls dnlsVar = azwcVar.j().b;
        if (dnlsVar == null) {
            dnlsVar = dnls.g;
        }
        if (!dnlsVar.f.isEmpty() && !dnlsVar.f.get(0).d.isEmpty()) {
            return dbsg.i(dnlsVar.f.get(0).d.get(0));
        }
        return dbpy.a;
    }
}
