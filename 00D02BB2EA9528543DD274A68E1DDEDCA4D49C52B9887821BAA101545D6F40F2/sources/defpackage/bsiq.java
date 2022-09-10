package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bsiq  reason: default package */
/* loaded from: classes4.dex */
public class bsiq implements bsgz, bsgt, bsha {
    private static final ddho[] a;
    private static final int b;
    private static final int c;
    private static final int[] h;
    private final Resources d;
    private int e;
    private int f;
    private int g;

    static {
        int[] a2 = djmn.a();
        h = a2;
        a = new ddho[]{dtxp.H, dtxp.I, dtxp.J, dtxp.K, dtxp.L};
        int length = a2.length;
        b = 15;
        c = 15 + 1;
    }

    public bsiq(Resources resources) {
        this.d = resources;
    }

    private final int a() {
        for (int i = 0; i < c().intValue(); i++) {
            if (p(i)) {
                return i;
            }
        }
        return 0;
    }

    private final int l() {
        int intValue = c().intValue();
        do {
            intValue--;
            if (intValue < 0) {
                return 0;
            }
        } while (!p(intValue));
        return intValue;
    }

    private final boolean p(int i) {
        if (i >= c().intValue()) {
            return false;
        }
        if (i == 0) {
            return this.g == 0;
        }
        int i2 = h[i - 1];
        if (i2 == 0) {
            throw null;
        }
        return (this.g & i2) == i2;
    }

    @Override // defpackage.bsgz
    public Boolean Rg(int i) {
        boolean z = false;
        if (i != 0 && i < c().intValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jab
    public Integer c() {
        int length = h.length;
        return 5;
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        boolean z = false;
        if (i >= c().intValue()) {
            return false;
        }
        if (i == 0) {
            if (this.f == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        int i2 = h[i - 1];
        if (i2 == 0) {
            throw null;
        }
        if ((this.f & i2) == i2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        return i >= c().intValue() ? "" : this.d.getStringArray(R.array.RESTRICTION_ALLOWED_PRICE_LEVEL)[i];
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        if (i >= 5) {
            return null;
        }
        return cjtd.a(a[i]);
    }

    @Override // defpackage.bsgz
    public CharSequence h() {
        return this.d.getString(R.string.RESTRICTION_PRICE);
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
            string = this.d.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.d.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        Resources resources = this.d;
        return resources.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, resources.getStringArray(R.array.RESTRICTION_ALLOWED_PRICE_LEVEL_DESCRIPTIONS)[i], string);
    }

    @Override // defpackage.bsgz
    public Boolean k(int i) {
        return false;
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        int intValue;
        this.f = c;
        Set<dspd> c2 = bsjmVar.c(1);
        if (c2.isEmpty()) {
            this.f = 0;
        } else if (c2.size() == 1) {
            djmv djmvVar = (djmv) bvrs.c(c2.iterator().next(), (dssr) djmv.c.cu(7));
            djmr djmrVar = null;
            if (djmvVar != null && djmvVar.a == 1) {
                djmrVar = (djmr) djmvVar.b;
            }
            if (djmrVar != null && djmrVar.a == 2 && (intValue = ((Integer) djmrVar.b).intValue()) >= 0 && intValue <= b) {
                this.f = intValue;
            }
        }
        int i = this.f;
        this.g = i;
        this.e = i;
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        int i = this.f;
        if (i == this.e) {
            this.g = i;
        } else if (i == 0) {
            this.g = 0;
            bsjmVar.e(1);
        } else {
            this.g = i;
            djmu bZ = djmv.c.bZ();
            djmm bZ2 = djmr.c.bZ();
            int i2 = this.g;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djmr djmrVar = (djmr) bZ2.b;
            djmrVar.a = 2;
            djmrVar.b = Integer.valueOf(i2);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djmv djmvVar = (djmv) bZ.b;
            djmr bK = bZ2.bK();
            bK.getClass();
            djmvVar.b = bK;
            djmvVar.a = 1;
            bsjmVar.u(1, bZ.bK().bR(), 2);
        }
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        cqivVar.a(new bsgq(), this);
    }

    @Override // defpackage.bsha
    public String q() {
        if (this.g == 0) {
            return h().toString();
        }
        int a2 = a();
        int l = l();
        if (a2 != l) {
            int l2 = l();
            for (int a3 = a(); a3 < l2; a3++) {
                if (!p(a3)) {
                    ArrayList arrayList = new ArrayList();
                    while (a2 <= l) {
                        if (p(a2)) {
                            arrayList.add(e(a2).toString());
                        }
                        a2++;
                    }
                    return dbrz.e(this.d.getString(R.string.RESTRICTION_ALLOWED_PRICE_LEVEL_SEPARATOR)).g(arrayList);
                }
            }
            return this.d.getString(R.string.RESTRICTION_ALLOWED_PRICE_LEVEL_RANGE_SELECTED, e(a2), e(l));
        }
        return e(a2).toString();
    }

    @Override // defpackage.bsha
    public String r() {
        return this.d.getString(R.string.RESTRICTION_PRICE);
    }

    @Override // defpackage.bsha
    @dzsi
    public cqtd s() {
        return null;
    }

    @Override // defpackage.bsha
    public boolean t() {
        return this.g != 0;
    }

    @Override // defpackage.bsha
    public void u(cqiv cqivVar) {
        cqivVar.a(new bsgc(), this);
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        int i2 = this.f & (c ^ (-1));
        this.f = i2;
        if (i == 0) {
            this.f = 0;
        } else {
            int i3 = h[i - 1];
            if (i3 == 0) {
                throw null;
            }
            this.f = i2 ^ i3;
        }
        cqkx.p(this);
        return cqkl.a;
    }
}
