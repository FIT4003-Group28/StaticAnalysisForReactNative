package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
/* compiled from: PG */
/* renamed from: lij  reason: default package */
/* loaded from: classes7.dex */
public class lij implements lie {
    private final Context a;
    private final asxu b;
    private final Resources c;
    private final bvsl d;
    private final boolean e;
    private amvh f;
    private cqtd g;
    @dzsi
    private cqtd h;
    private CharSequence i;
    private cqsn j;
    private cqsn k;
    @dzsi
    private String l;
    private int m;
    private boolean n;
    private boolean o;

    private lij(Context context, asxu asxuVar, Resources resources, bvsl bvslVar, nlw nlwVar, int i, boolean z) {
        this.a = context;
        this.b = asxuVar;
        this.c = resources;
        this.d = bvslVar;
        this.e = z;
        dbsk.s(nlwVar);
        n(nlwVar, i);
    }

    public static lij k(Context context, asxu asxuVar, Resources resources, bvsl bvslVar, boolean z, crqg crqgVar, int i) {
        return new lij(context, asxuVar, resources, bvslVar, crqgVar, i, z);
    }

    public static lij l(Context context, asxu asxuVar, Resources resources, bvsl bvslVar, boolean z, nlw nlwVar, int i) {
        return new lij(context, asxuVar, resources, bvslVar, nlwVar, i, z);
    }

    private static cqtd p(dpjs dpjsVar) {
        dpjs dpjsVar2 = dpjs.ENTITY_TYPE_MY_LOCATION;
        int ordinal = dpjsVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return nqu.F();
            }
            if (ordinal == 5) {
                return nqu.X();
            }
            return nqu.G();
        }
        return nqu.E();
    }

    @dzsi
    private static cqtd q(dpjs dpjsVar) {
        dpjs dpjsVar2 = dpjs.ENTITY_TYPE_MY_LOCATION;
        int ordinal = dpjsVar.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return nqu.am();
        }
        if (ordinal == 5) {
            return nqu.W();
        }
        return nqu.al();
    }

    @Override // defpackage.lie
    public cqtd a() {
        return this.g;
    }

    @Override // defpackage.lie
    @dzsi
    public cqtd b() {
        return this.h;
    }

    @Override // defpackage.lie
    public CharSequence c() {
        return this.i;
    }

    @Override // defpackage.lie
    public cqsn d() {
        return this.j;
    }

    @Override // defpackage.lie
    public cqsn e() {
        return this.k;
    }

    @Override // defpackage.lie
    public Boolean f() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.lie
    public Boolean g() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.lie
    public cqkl h() {
        asxu asxuVar = this.b;
        amvh amvhVar = this.f;
        les lesVar = (les) asxuVar;
        if (!lesVar.o.o()) {
            lesVar.z(ldm.f(amvhVar, lesVar.d.d.getResources(), null), kdk.NAVIGATE, null, false, mnz.SHORTCUT_SUGGESTED_DESTINATIONS);
        } else {
            lesVar.t.a(afhd.b(amvhVar, dqvj.DRIVE, null, null, null));
        }
        return cqkl.a;
    }

    @Override // defpackage.lie
    public cjtd i() {
        cjta b = cjtd.b();
        b.d = dtxm.eu;
        b.g(this.l);
        b.i(this.m);
        return b.a();
    }

    @Override // defpackage.lie
    public Boolean j() {
        return Boolean.valueOf(this.o);
    }

    public void m(crqg crqgVar, int i) {
        amvh amvhVar = crqgVar.a;
        this.f = amvhVar;
        dpjs dpjsVar = amvhVar.b;
        this.g = p(dpjsVar);
        this.h = q(dpjsVar);
        this.i = crqgVar.a.s(this.c);
        cray crayVar = crqgVar.b;
        this.m = i;
        String obj = bvtb.e(this.c, crayVar.a(), bvsz.ABBREVIATED).toString();
        iuv b = nql.b(crayVar.f());
        Spanned h = this.d.h(crayVar.g, crayVar.a.I, null, null);
        Context context = this.a;
        iuu h2 = iva.h(npq.a(obj, b.a.c(context)), npq.a(obj, b.b.c(context)));
        iuu h3 = iva.h(npq.a(h, nql.bq.a.c(context)), npq.a(h, nql.bq.b.c(context)));
        this.k = h2;
        this.j = h3;
        this.o = true;
        final amve amveVar = crayVar.a.d;
        btsp.b(new dbty(amveVar) { // from class: lih
            private final amve a;

            {
                this.a = amveVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                final amve amveVar2 = this.a;
                return new kor(new dbty(amveVar2) { // from class: lii
                    private final amve a;

                    {
                        this.a = amveVar2;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return dbsg.i(this.a);
                    }
                });
            }
        });
        this.l = amveVar.m();
    }

    public void n(nlw nlwVar, int i) {
        CharSequence charSequence;
        afij afijVar = new afij(nlwVar.e());
        dbsk.a(afijVar.a());
        amvh[] amvhVarArr = afijVar.c;
        int length = amvhVarArr.length;
        this.f = length > 0 ? amvhVarArr[length - 1] : null;
        dpjs q = nlwVar.q();
        this.g = p(q);
        this.h = q(q);
        this.i = nlwVar.a();
        this.m = i;
        this.o = false;
        CharSequence charSequence2 = "";
        this.k = cqsk.a(charSequence2);
        this.j = cqsk.a(charSequence2);
        if (!dbsj.d(nlwVar.i())) {
            charSequence = nlwVar.i();
            this.o = true;
        } else {
            charSequence = charSequence2;
        }
        if (nlwVar.j() != -1) {
            charSequence2 = this.d.h(nlwVar.j(), nlwVar.k(), null, null);
            this.o = true;
        }
        if (this.o) {
            iuv b = nql.b(nlwVar.l());
            Context context = this.a;
            iuu h = iva.h(npq.a(charSequence, b.a.c(context)), npq.a(charSequence, b.b.c(context)));
            iuu h2 = iva.h(npq.a(charSequence2, nql.bq.a.c(context)), npq.a(charSequence2, nql.bq.b.c(context)));
            this.k = h;
            this.j = h2;
        }
        this.l = nlwVar.f().getStringExtra("ved");
    }

    public void o(boolean z) {
        this.n = z;
    }

    private lij(Context context, asxu asxuVar, Resources resources, bvsl bvslVar, crqg crqgVar, int i, boolean z) {
        this.a = context;
        this.b = asxuVar;
        this.c = resources;
        this.d = bvslVar;
        this.e = z;
        dbsk.s(crqgVar);
        m(crqgVar, i);
    }
}
