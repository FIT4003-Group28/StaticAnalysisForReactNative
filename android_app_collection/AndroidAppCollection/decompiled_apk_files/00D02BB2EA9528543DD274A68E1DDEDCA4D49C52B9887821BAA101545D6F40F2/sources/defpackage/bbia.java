package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bbia  reason: default package */
/* loaded from: classes3.dex */
public class bbia implements bbht {
    private static final dnqh a;
    private final dxio<begg> b;
    private final dxio<bbdv> c;
    private final dxio<angp> d;
    private final bbif e;
    private final bbil f;
    private final bwrs<ilo> g;
    private final bbhm h;
    private dkzc i;
    @dzsi
    private final bbhs j;
    @dzsi
    private final bbhs k;
    @dzsi
    private bbhl l;

    static {
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.cx.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        a = bZ.bK();
    }

    public bbia(dxio<begg> dxioVar, dxio<bbdv> dxioVar2, dxio<angp> dxioVar3, bbif bbifVar, bbil bbilVar, dkzl dkzlVar, bbhm bbhmVar) {
        bbhz bbhzVar;
        dvyw dvywVar = dkzlVar.a;
        dvywVar = dvywVar == null ? dvyw.bv : dvywVar;
        dkzd dkzdVar = dkzlVar.b;
        dkzc b = dkzc.b((dkzdVar == null ? dkzd.b : dkzdVar).a);
        this.i = b == null ? dkzc.UNKNOWN_FEEDBACK_TYPE : b;
        ily ilyVar = new ily();
        ilyVar.E(dvywVar);
        this.g = bwrs.a(ilyVar.d());
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.h = bbhmVar;
        this.e = bbifVar;
        this.f = bbilVar;
        dwgn dwgnVar = dvywVar.H;
        bbhz bbhzVar2 = null;
        if ((dwgnVar == null ? dwgn.c : dwgnVar).a.size() == 0) {
            bbhzVar = null;
        } else {
            dwgn dwgnVar2 = dvywVar.H;
            bbhzVar = new bbhz((dwgnVar2 == null ? dwgn.c : dwgnVar2).a.get(0).h);
        }
        this.j = bbhzVar;
        this.k = dvywVar.I.size() >= 2 ? new bbhz(dvywVar.I.get(1).h) : bbhzVar2;
    }

    private final ilo s() {
        ilo c = this.g.c();
        dbsk.s(c);
        return c;
    }

    @Override // defpackage.bbhp
    public bbho a() {
        return bbho.PLACE;
    }

    @Override // defpackage.bbhp
    public Boolean b(bbho bbhoVar) {
        return Boolean.valueOf(a() == bbhoVar);
    }

    @Override // defpackage.bbhp
    public cqkl c() {
        dkzc dkzcVar = dkzc.UNKNOWN_FEEDBACK_TYPE;
        int ordinal = this.i.ordinal();
        if (ordinal == 1) {
            this.c.a().q(s());
            this.h.c(bbhn.NOT_INTERESTED, this);
        } else if (ordinal == 2) {
            this.d.a().i(s().h(), a, dbpy.a);
            this.l = null;
            this.i = dkzc.STAR_RATING;
            this.h.c(bbhn.BEEN_HERE, this);
        }
        return cqkl.a;
    }

    @Override // defpackage.bbhp
    @dzsi
    public cjtd d() {
        dkzc dkzcVar = dkzc.UNKNOWN_FEEDBACK_TYPE;
        int ordinal = this.i.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return cjtd.a(dtxo.aV);
            }
            return null;
        }
        return cjtd.a(dtxo.bb);
    }

    @Override // defpackage.bbhp
    @dzsi
    public cjtd e() {
        dkzc dkzcVar = dkzc.UNKNOWN_FEEDBACK_TYPE;
        int ordinal = this.i.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return cjtd.a(dtxo.aW);
            }
            return null;
        }
        return cjtd.a(dtxo.bc);
    }

    @Override // defpackage.bbht
    public cqkl f() {
        begj begjVar = new begj();
        begjVar.n = true;
        begjVar.c = jjn.EXPANDED;
        begjVar.i = this.g;
        this.b.a().o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.bbht
    public CharSequence g() {
        return s().n();
    }

    @Override // defpackage.bbht
    @dzsi
    public Float h() {
        if (Float.isNaN(s().af())) {
            return null;
        }
        return Float.valueOf(s().af());
    }

    @Override // defpackage.bbht
    public CharSequence i() {
        return h() == null ? "" : String.format(Locale.getDefault(), "%.1f", h());
    }

    @Override // defpackage.bbht
    public CharSequence j() {
        return s().X() == 0 ? "" : String.format(Locale.getDefault(), "(%d)", Integer.valueOf(s().X()));
    }

    @Override // defpackage.bbht
    public CharSequence k() {
        return s().Y();
    }

    @Override // defpackage.bbht
    public String l() {
        return s().aq();
    }

    @Override // defpackage.bbht
    public String m() {
        String av = s().av();
        return av.isEmpty() ? s().B() : av;
    }

    @Override // defpackage.bbht
    public CharSequence n() {
        return s().bD();
    }

    @Override // defpackage.bbht
    @dzsi
    public bbhs o() {
        return this.j;
    }

    @Override // defpackage.bbht
    @dzsi
    public bbhs p() {
        return this.k;
    }

    @Override // defpackage.bbht
    public dkzc q() {
        return this.i;
    }

    @Override // defpackage.bbht
    public bbhl r() {
        if (this.l == null) {
            if (this.i == dkzc.YOUR_TYPE_OF_PLACE) {
                bbil bbilVar = this.f;
                bwrs<ilo> bwrsVar = this.g;
                bbhm bbhmVar = this.h;
                gga a2 = bbilVar.a.a();
                bbil.a(a2, 1);
                dxio a3 = ((dxjh) bbilVar.b).a();
                bbil.a(a3, 2);
                bbma a4 = bbilVar.c.a();
                bbil.a(a4, 3);
                bbil.a(bwrsVar, 4);
                bbil.a(bbhmVar, 5);
                this.l = new bbik(a2, a3, a4, bwrsVar, bbhmVar);
            } else {
                bbif bbifVar = this.e;
                bwrs<ilo> bwrsVar2 = this.g;
                bbhm bbhmVar2 = this.h;
                dxio a5 = ((dxjh) bbifVar.a).a();
                bbif.a(a5, 1);
                gga a6 = bbifVar.b.a();
                bbif.a(a6, 2);
                bbif.a(bwrsVar2, 3);
                bbif.a(bbhmVar2, 4);
                this.l = new bbie(a5, a6, bwrsVar2, bbhmVar2);
            }
        }
        return this.l;
    }
}
