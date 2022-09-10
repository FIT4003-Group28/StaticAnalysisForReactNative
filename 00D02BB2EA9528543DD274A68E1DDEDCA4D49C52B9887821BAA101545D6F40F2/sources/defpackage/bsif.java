package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bsif  reason: default package */
/* loaded from: classes4.dex */
public class bsif implements bsgz, bsgt {
    public static final int a;
    private final Resources b;
    @dzsi
    private bsie c;
    @dzsi
    private bsie d;
    private boolean e;

    static {
        djld.a();
        a = 31;
    }

    public bsif(Resources resources) {
        this.b = resources;
    }

    @Override // defpackage.bsgz
    public Boolean Rg(int i) {
        return Boolean.valueOf(i < c().intValue());
    }

    @Override // defpackage.jab
    public Integer c() {
        return Integer.valueOf(bsie.values().length);
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        bsie bsieVar;
        boolean z = false;
        if (i >= c().intValue() || (bsieVar = this.d) == null) {
            return false;
        }
        if (bsieVar.ordinal() == i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        return i >= c().intValue() ? "" : this.b.getStringArray(R.array.RESTRICTION_HOTEL_CLASSES)[i];
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        if (this.e) {
            this.c = null;
            this.e = false;
        }
        this.d = bsie.values()[i];
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        if (i >= c().intValue()) {
            return null;
        }
        return cjtd.a(bsie.values()[i].f);
    }

    @Override // defpackage.bsgz
    public CharSequence h() {
        return this.b.getString(R.string.RESTRICTION_HOTEL_CLASS);
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
        Resources resources = this.b;
        return resources.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, resources.getStringArray(R.array.RESTRICTION_HOTEL_CLASSES_DESCRIPTIONS)[i], string);
    }

    @Override // defpackage.bsgz
    public Boolean k(int i) {
        return false;
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        djle djleVar = null;
        this.d = null;
        int i = 0;
        this.e = false;
        Set<dspd> c = bsjmVar.c(4);
        if (c.isEmpty()) {
            this.d = bsie.ANY;
        } else if (c.size() == 1) {
            djmv djmvVar = (djmv) bvrs.c(c.iterator().next(), (dssr) djmv.c.cu(7));
            if (djmvVar != null && djmvVar.a == 4) {
                djleVar = (djle) djmvVar.b;
            }
            if (djleVar != null && djleVar.a == 1) {
                bsie a2 = bsie.a(((Integer) djleVar.b).intValue());
                this.d = a2;
                if (a2 != null) {
                    int i2 = a2.e;
                    if (djleVar.a == 1) {
                        i = ((Integer) djleVar.b).intValue();
                    }
                    if (i2 != i) {
                        this.e = true;
                    }
                }
            }
        }
        this.c = this.d;
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        bsie bsieVar = this.d;
        if (bsieVar == this.c || bsieVar == null) {
            return;
        }
        if (bsieVar.e == 0) {
            bsjmVar.e(4);
            return;
        }
        djmu bZ = djmv.c.bZ();
        djlb bZ2 = djle.c.bZ();
        int i = bsieVar.e;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djle djleVar = (djle) bZ2.b;
        djleVar.a = 1;
        djleVar.b = Integer.valueOf(i);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmv djmvVar = (djmv) bZ.b;
        djle bK = bZ2.bK();
        bK.getClass();
        djmvVar.b = bK;
        djmvVar.a = 4;
        bsjmVar.u(4, bZ.bK().bR(), 2);
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        cqivVar.a(new bsfy(), this);
    }
}
