package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bsjf  reason: default package */
/* loaded from: classes4.dex */
public class bsjf implements bsgz, bsgt {
    private final Resources a;
    @dzsi
    private bsje b;
    @dzsi
    private bsje c;
    private boolean d;

    public bsjf(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.bsgz
    public Boolean Rg(int i) {
        return Boolean.valueOf(i < c().intValue());
    }

    @Override // defpackage.jab
    public Integer c() {
        return Integer.valueOf(bsje.values().length);
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        bsje bsjeVar;
        boolean z = false;
        if (i >= c().intValue() || (bsjeVar = this.c) == null) {
            return false;
        }
        if (bsjeVar.g == i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        if (i >= c().intValue()) {
            return "";
        }
        bsje bsjeVar = bsje.values()[i];
        Resources resources = this.a;
        int ordinal = bsjeVar.ordinal();
        if (ordinal == 0) {
            return resources.getString(R.string.RESTRICTION_STAR_RATING_ANY);
        }
        if (ordinal == 1) {
            return resources.getString(R.string.RESTRICTION_STAR_RATING, Double.valueOf(3.5d));
        }
        if (ordinal == 2) {
            return resources.getString(R.string.RESTRICTION_STAR_RATING, Double.valueOf(4.0d));
        }
        if (ordinal == 3) {
            return resources.getString(R.string.RESTRICTION_STAR_RATING, Double.valueOf(4.5d));
        }
        throw null;
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        if (this.d) {
            this.b = null;
            this.d = false;
        }
        this.c = bsje.values()[i];
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        if (i >= c().intValue()) {
            return null;
        }
        return cjtd.a(bsje.values()[i].f);
    }

    @Override // defpackage.bsgz
    public CharSequence h() {
        return this.a.getString(R.string.RESTRICTION_USER_RATING);
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
        bsje bsjeVar = bsje.values()[i];
        Resources resources = this.a;
        if (d(i).booleanValue()) {
            string = resources.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = resources.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        return resources.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, resources.getStringArray(R.array.RESTRICTION_ALLOWED_STAR_RATING_DESCRIPTIONS)[bsjeVar.g], string);
    }

    @Override // defpackage.bsgz
    public Boolean k(int i) {
        boolean z = false;
        if (i > 0 && i < c().intValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        djnu djnuVar;
        bsje bsjeVar = null;
        this.c = null;
        this.d = false;
        Set<dspd> c = bsjmVar.c(2);
        if (c.isEmpty()) {
            this.c = bsje.ANY;
        } else if (c.size() == 1) {
            djmv djmvVar = (djmv) bvrs.c(c.iterator().next(), (dssr) djmv.c.cu(7));
            djny djnyVar = (djmvVar == null || djmvVar.a != 2) ? null : (djny) djmvVar.b;
            if (djnyVar != null && djnyVar.a == 2) {
                djnu b = djnu.b(((Integer) djnyVar.b).intValue());
                if (b == null) {
                    b = djnu.UNKNOWN_NUMERIC_RATING;
                }
                switch (b.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        bsjeVar = bsje.ANY;
                        break;
                    case 7:
                        bsjeVar = bsje.THREE_HALF_PLUS;
                        break;
                    case 8:
                        bsjeVar = bsje.FOUR_PLUS;
                        break;
                    case 9:
                    case 10:
                        bsjeVar = bsje.FOUR_HALF_PLUS;
                        break;
                }
                this.c = bsjeVar;
                if (bsjeVar != null) {
                    djnu djnuVar2 = bsjeVar.e;
                    if (djnyVar.a != 2 || (djnuVar = djnu.b(((Integer) djnyVar.b).intValue())) == null) {
                        djnuVar = djnu.UNKNOWN_NUMERIC_RATING;
                    }
                    if (djnuVar2 != djnuVar) {
                        this.d = true;
                    }
                }
            }
        }
        this.b = this.c;
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        bsje bsjeVar = this.c;
        if (bsjeVar == this.b || bsjeVar == null) {
            return;
        }
        if (bsjeVar.e == null) {
            bsjmVar.e(2);
            return;
        }
        djmu bZ = djmv.c.bZ();
        djns bZ2 = djny.c.bZ();
        djnu djnuVar = bsjeVar.e;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djny djnyVar = (djny) bZ2.b;
        djnyVar.b = Integer.valueOf(djnuVar.l);
        djnyVar.a = 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmv djmvVar = (djmv) bZ.b;
        djny bK = bZ2.bK();
        bK.getClass();
        djmvVar.b = bK;
        djmvVar.a = 2;
        bsjmVar.u(2, bZ.bK().bR(), 2);
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        cqivVar.a(new bsfy(), this);
    }
}
