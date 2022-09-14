package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bsim  reason: default package */
/* loaded from: classes4.dex */
public class bsim implements bsgt, bsgv, bsha {
    @dzsi
    public Integer a;
    @dzsi
    public Integer b;
    @dzsi
    public cjqv c;
    @dzsi
    public cjql d;
    @dzsi
    public cjql e;
    public final cjqq f;
    public final cjqy g;
    @dzsi
    private Integer h;
    @dzsi
    private Integer i;
    @dzsi
    private Integer j;
    @dzsi
    private String k;
    private boolean l;
    @dzsi
    private View.OnAttachStateChangeListener m;
    private final Resources n;
    private final ikd o = new bsij(this);

    public bsim(Resources resources, cqhn cqhnVar, cjqq cjqqVar, cjqy cjqyVar) {
        this.n = resources;
        this.f = cjqqVar;
        this.g = cjqyVar;
    }

    private final String A() {
        Integer num = this.a;
        return num != null ? C(num.intValue()) : "";
    }

    private final String B() {
        Integer num = this.b;
        return num != null ? C(num.intValue()) : "";
    }

    private final String C(int i) {
        if (this.k != null) {
            duhf bZ = duhg.d.bZ();
            String str = this.k;
            dbsk.s(str);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duhg duhgVar = (duhg) bZ.b;
            str.getClass();
            duhgVar.a = str;
            duhgVar.b = i;
            cpe d = cpf.d(Locale.getDefault());
            d.c(true);
            return cpg.b(bZ.bK(), d.a());
        }
        return "";
    }

    private static dbsg<djlu> D(dspd dspdVar) {
        djmv djmvVar = (djmv) bvrs.c(dspdVar, (dssr) djmv.c.cu(7));
        if (djmvVar != null && djmvVar.a == 6) {
            djlu djluVar = (djlu) djmvVar.b;
            if (djluVar.b == 1) {
                return dbsg.i(djluVar);
            }
        }
        return dbpy.a;
    }

    public static cjtd v() {
        return cjtd.a(dtxp.x);
    }

    public static cjtd w() {
        return cjtd.a(dtxp.w);
    }

    private final void x(int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        this.i = valueOf;
        Integer valueOf2 = Integer.valueOf(i2);
        this.j = valueOf2;
        this.a = valueOf;
        this.b = valueOf2;
        cqkx.p(this);
    }

    private final boolean y() {
        Integer num = this.a;
        return num != null && num.intValue() > 0;
    }

    private final boolean z() {
        Integer num = this.b;
        return (num == null || this.h == null || num.intValue() >= this.h.intValue()) ? false : true;
    }

    @Override // defpackage.bsha
    /* renamed from: a */
    public String h() {
        return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_TITLE);
    }

    @Override // defpackage.bsgv
    public Integer b() {
        return 0;
    }

    @Override // defpackage.bsgv
    public Integer c() {
        Integer num = this.h;
        return Integer.valueOf(num != null ? num.intValue() : 0);
    }

    @Override // defpackage.bsgv
    public Integer d() {
        Integer num = this.a;
        return Integer.valueOf(num != null ? num.intValue() : 0);
    }

    @Override // defpackage.bsgv
    public Integer e() {
        Integer num = this.b;
        return Integer.valueOf(num != null ? num.intValue() : 0);
    }

    @Override // defpackage.bsgv
    public String f() {
        if (z()) {
            return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_RANGE_LABEL_MAX_RESTRICTED, A(), B());
        }
        return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_RANGE_LABEL_UNRESTRICTED, A(), B());
    }

    @Override // defpackage.bsgv
    public ikd g() {
        return this.o;
    }

    @Override // defpackage.bsgv
    public String i() {
        return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_CONTENT_DESCRIPTION_RANGE, A(), B());
    }

    @Override // defpackage.bsgv
    public String j() {
        return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_CONTENT_DESCRIPTION_MIN_ENDPOINT, A());
    }

    @Override // defpackage.bsgv
    public String k() {
        return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_CONTENT_DESCRIPTION_MAX_ENDPOINT, B());
    }

    @Override // defpackage.bsgv
    public cjtd l() {
        return cjtd.a(dtxp.v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    @Override // defpackage.bsgt, defpackage.bsha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(defpackage.bsjm r10) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsim.m(bsjm):void");
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        Integer num;
        Integer num2 = this.a;
        if (num2 == null || this.b == null || this.h == null || (num = this.i) == null || this.j == null) {
            return;
        }
        if (num.equals(num2) && this.j.equals(this.b)) {
            return;
        }
        if (!t()) {
            bsjmVar.e(7);
        } else if (this.k == null) {
        } else {
            djlr bZ = djls.d.bZ();
            if (y()) {
                Integer num3 = this.a;
                dbsk.s(num3);
                int intValue = num3.intValue();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djls djlsVar = (djls) bZ.b;
                djlsVar.a |= 2;
                djlsVar.c = intValue;
            }
            if (z()) {
                Integer num4 = this.b;
                dbsk.s(num4);
                int intValue2 = num4.intValue();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djls djlsVar2 = (djls) bZ.b;
                djlsVar2.a |= 1;
                djlsVar2.b = intValue2;
            }
            djlq bZ2 = djlu.e.bZ();
            String str = this.k;
            dbsk.s(str);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djlu djluVar = (djlu) bZ2.b;
            str.getClass();
            djluVar.a |= 8;
            djluVar.d = str;
            djls bK = bZ.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djlu djluVar2 = (djlu) bZ2.b;
            bK.getClass();
            djluVar2.c = bK;
            djluVar2.b = 1;
            djlu bK2 = bZ2.bK();
            djmu bZ3 = djmv.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            djmv djmvVar = (djmv) bZ3.b;
            bK2.getClass();
            djmvVar.b = bK2;
            djmvVar.a = 6;
            bsjmVar.u(7, bZ3.bK().bR(), 2);
        }
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        if (this.l) {
            return;
        }
        cqivVar.a(new bseh(), this);
    }

    @Override // defpackage.bsgv
    public View.OnAttachStateChangeListener p() {
        if (this.m == null) {
            this.m = new bsil(this);
        }
        return this.m;
    }

    @Override // defpackage.bsha
    public String r() {
        return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_TITLE);
    }

    @Override // defpackage.bsha
    @dzsi
    public cqtd s() {
        return null;
    }

    @Override // defpackage.bsha
    public boolean t() {
        return !this.l && (y() || z());
    }

    @Override // defpackage.bsha
    public void u(cqiv cqivVar) {
        if (this.l) {
            return;
        }
        cqivVar.a(new bsdu(), this);
    }

    @Override // defpackage.bsha
    public String q() {
        if (!y() || !z()) {
            if (y() && !z()) {
                return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_PIVOT_TITLE_MIN_RESTRICTED, A());
            }
            if (y() || !z()) {
                return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_PIVOT_TITLE_UNRESTRICTED);
            }
            return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_PIVOT_TITLE_MAX_RESTRICTED, B());
        }
        return this.n.getString(R.string.RESTRICTION_HOTEL_PRICE_RANGE_SLIDER_PIVOT_TITLE_MIN_AND_MAX_RESTRICTED, A(), B());
    }
}
