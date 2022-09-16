package defpackage;

import android.content.res.Resources;
import android.widget.NumberPicker;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsip  reason: default package */
/* loaded from: classes4.dex */
public class bsip implements bsgx, izz {
    private final gga a;
    private final Resources b;
    @dzsi
    private bsin c;
    @dzsi
    private bsgy d;
    @dzsi
    private bsgy e;
    private djmb f = djmb.e;
    private bsio g = bsio.ANY;
    private bsio h = bsio.ANY;
    private int i;
    private int j;

    public bsip(cqhn cqhnVar, gga ggaVar) {
        this.b = ggaVar.getResources();
        this.a = ggaVar;
    }

    public static String r(Resources resources, int i) {
        return resources.getString(byea.values()[i].j);
    }

    public static String s(int i) {
        return new eapi(i, 0).E(eato.a());
    }

    private final boolean u() {
        bsgy bsgyVar = this.d;
        dbsk.s(bsgyVar);
        return bsgyVar.d().intValue() != this.i;
    }

    private final boolean v() {
        bsgy bsgyVar = this.e;
        dbsk.s(bsgyVar);
        return bsgyVar.d().intValue() != this.j;
    }

    @Override // defpackage.bsgz
    public Boolean Rg(int i) {
        return Boolean.valueOf(i < c().intValue());
    }

    @Override // defpackage.izz
    public cqkl a() {
        if (u() || v()) {
            bsgy bsgyVar = this.d;
            dbsk.s(bsgyVar);
            this.i = bsgyVar.d().intValue();
            bsgy bsgyVar2 = this.e;
            dbsk.s(bsgyVar2);
            this.j = bsgyVar2.d().intValue();
            cqkx.p(this);
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.izz
    public cqkl b() {
        if (u()) {
            bsgy bsgyVar = this.d;
            dbsk.s(bsgyVar);
            NumberPicker.OnValueChangeListener c = bsgyVar.c();
            bsgy bsgyVar2 = this.d;
            dbsk.s(bsgyVar2);
            c.onValueChange(null, bsgyVar2.d().intValue(), this.i);
        }
        if (v()) {
            bsgy bsgyVar3 = this.e;
            dbsk.s(bsgyVar3);
            NumberPicker.OnValueChangeListener c2 = bsgyVar3.c();
            bsgy bsgyVar4 = this.e;
            dbsk.s(bsgyVar4);
            c2.onValueChange(null, bsgyVar4.d().intValue(), this.j);
        }
        return cqkl.a;
    }

    @Override // defpackage.jab
    public Integer c() {
        return Integer.valueOf(bsio.values().length);
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        boolean z = false;
        if (i >= c().intValue()) {
            return false;
        }
        if (this.h.e == i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        return i >= c().intValue() ? "" : this.b.getStringArray(R.array.RESTRICTION_OPENING_HOURS_OPTIONS)[i];
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        if (i >= c().intValue()) {
            return cqkl.a;
        }
        if (this.h != bsio.values()[i]) {
            this.h = bsio.values()[i];
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        if (i >= c().intValue()) {
            return null;
        }
        return cjtd.a(bsio.values()[i].d);
    }

    @Override // defpackage.bsgz
    public CharSequence h() {
        return this.b.getString(R.string.RESTRICTION_OPENING_HOURS_TITLE);
    }

    @Override // defpackage.bsgz
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.bsgz
    public CharSequence j(int i) {
        String string;
        if (i >= c().intValue()) {
            return "";
        }
        if (d(i).booleanValue()) {
            string = this.b.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.b.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        return this.b.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, e(i), string);
    }

    @Override // defpackage.bsgz
    public Boolean k(int i) {
        return false;
    }

    @Override // defpackage.bsgx
    public CharSequence l() {
        Resources resources = this.b;
        bsgy bsgyVar = this.d;
        dbsk.s(bsgyVar);
        String r = r(resources, bsgyVar.d().intValue());
        bsgy bsgyVar2 = this.e;
        dbsk.s(bsgyVar2);
        if (bsgyVar2.d().intValue() == 0) {
            Resources resources2 = this.b;
            return resources2.getString(R.string.RESTRICTION_OPENING_HOURS_CUSTOM_DISPLAY_TIME, r, resources2.getString(R.string.RESTRICTION_OPENING_HOURS_CUSTOM_ANY_TIME));
        }
        Resources resources3 = this.b;
        bsgy bsgyVar3 = this.e;
        dbsk.s(bsgyVar3);
        return resources3.getString(R.string.RESTRICTION_OPENING_HOURS_CUSTOM_DISPLAY_TIME, r, s(bsgyVar3.d().intValue() - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    @Override // defpackage.bsgt, defpackage.bsha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(defpackage.bsjm r10) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsip.m(bsjm):void");
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        if (this.g.equals(this.h)) {
            bsgy bsgyVar = this.d;
            dbsk.s(bsgyVar);
            if (bsgyVar.d().intValue() == t()) {
                bsgy bsgyVar2 = this.e;
                dbsk.s(bsgyVar2);
                int intValue = bsgyVar2.d().intValue();
                djmb djmbVar = this.f;
                if (intValue == (djmbVar.c == 4 ? ((Integer) djmbVar.d).intValue() + 1 : 0)) {
                    return;
                }
            }
        }
        if (this.h.equals(bsio.OPEN_NOW)) {
            djmu bZ = djmv.c.bZ();
            djlv bZ2 = djmf.c.bZ();
            djme djmeVar = djme.OPEN_NOW;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djmf djmfVar = (djmf) bZ2.b;
            djmfVar.b = Integer.valueOf(djmeVar.d);
            djmfVar.a = 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djmv djmvVar = (djmv) bZ.b;
            djmf bK = bZ2.bK();
            bK.getClass();
            djmvVar.b = bK;
            djmvVar.a = 3;
            bsjmVar.u(3, bZ.bK().bR(), 2);
        } else if (this.h.equals(bsio.CUSTOM)) {
            bsgy bsgyVar3 = this.d;
            dbsk.s(bsgyVar3);
            int intValue2 = bsgyVar3.d().intValue();
            bsgy bsgyVar4 = this.e;
            dbsk.s(bsgyVar4);
            int intValue3 = bsgyVar4.d().intValue();
            eapg p = eaol.a().p();
            eapg o = p.o(p.b.C().p(p.a, intValue2 + 1));
            if (o.compareTo(eaol.a().p()) < 0) {
                o = o.p(7);
            }
            djlw bZ3 = djmb.e.bZ();
            djju bZ4 = djjv.e.bZ();
            int r = o.r();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djjv djjvVar = (djjv) bZ4.b;
            djjvVar.a |= 1;
            djjvVar.b = r;
            int s = o.s();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djjv djjvVar2 = (djjv) bZ4.b;
            djjvVar2.a |= 2;
            djjvVar2.c = s;
            int t = o.t();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djjv djjvVar3 = (djjv) bZ4.b;
            djjvVar3.a |= 4;
            djjvVar3.d = t;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            djmb djmbVar2 = (djmb) bZ3.b;
            djjv bK2 = bZ4.bK();
            bK2.getClass();
            djmbVar2.b = bK2;
            djmbVar2.a = 1;
            if (intValue3 == 0) {
                djlz djlzVar = djlz.ANY_TIME;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djmb djmbVar3 = (djmb) bZ3.b;
                djmbVar3.d = Integer.valueOf(djlzVar.c);
                djmbVar3.c = 3;
                this.f = bZ3.bK();
            } else {
                int i = intValue3 - 1;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djmb djmbVar4 = (djmb) bZ3.b;
                djmbVar4.c = 4;
                djmbVar4.d = Integer.valueOf(i);
                this.f = bZ3.bK();
            }
            cqkx.p(this);
            djmu bZ5 = djmv.c.bZ();
            djlv bZ6 = djmf.c.bZ();
            djmb djmbVar5 = this.f;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            djmf djmfVar2 = (djmf) bZ6.b;
            djmbVar5.getClass();
            djmfVar2.b = djmbVar5;
            djmfVar2.a = 4;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            djmv djmvVar2 = (djmv) bZ5.b;
            djmf bK3 = bZ6.bK();
            bK3.getClass();
            djmvVar2.b = bK3;
            djmvVar2.a = 3;
            bsjmVar.u(3, bZ5.bK().bR(), 2);
        } else {
            bsjmVar.e(3);
        }
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        cqivVar.a(new bsez(), this);
    }

    @Override // defpackage.bsgx
    public Boolean p() {
        return Boolean.valueOf(this.h.equals(bsio.CUSTOM));
    }

    @Override // defpackage.bsgx
    public cqkl q() {
        if (this.c == null) {
            gga ggaVar = this.a;
            bsgy bsgyVar = this.d;
            dbsk.s(bsgyVar);
            bsgy bsgyVar2 = this.e;
            dbsk.s(bsgyVar2);
            this.c = new bsin(ggaVar, dcdc.g(bsgyVar, bsgyVar2), this);
        }
        bsau bsauVar = new bsau();
        gn g = this.a.g();
        bsin bsinVar = this.c;
        dbsk.s(bsinVar);
        bsauVar.ad = bsinVar;
        bsauVar.e(g, "opening_hours_bottom_sheet");
        return cqkl.a;
    }

    private final int t() {
        int B;
        djmb djmbVar = this.f;
        if (djmbVar.a != 1) {
            B = eaol.a().B();
        } else {
            djjv djjvVar = (djjv) djmbVar.b;
            B = new eaol(djjvVar.b, djjvVar.c, djjvVar.d, 12, 0).B();
        }
        return B - 1;
    }
}
