package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: blnh  reason: default package */
/* loaded from: classes3.dex */
public class blnh extends bllj {
    public static final /* synthetic */ int c = 0;
    private static final cqtv d = cqrp.f(12.0d);
    public boolean a;
    @dzsi
    public String b;
    private final dxio<cafi> f;
    private final dxio<afha> g;
    private final Context i;
    @dzsi
    private jay j;
    @dzsi
    private Runnable k;
    private final ceet m;
    private final cebr n;
    @dzsi
    private ilo o;
    private final blng e = new blng(this);
    private cdjd h = cdrr.q(docg.M, dqgr.PUBLISHED);
    private boolean l = false;

    public blnh(Context context, dxio<cafi> dxioVar, dxio<afha> dxioVar2, cqhn cqhnVar, ceet ceetVar, cebr cebrVar) {
        this.i = context;
        this.f = dxioVar;
        this.g = dxioVar2;
        this.m = ceetVar;
        this.n = cebrVar;
    }

    private final String C() {
        String str = (String) this.h.a().b().h(blna.a).c("");
        return (!this.a || !str.isEmpty()) ? str : this.i.getString(R.string.YOU);
    }

    @dzsi
    private static String D(@dzsi CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void A(btrm btrmVar) {
        if (this.l) {
            this.l = false;
            btrmVar.a(this.e);
        }
    }

    public Boolean B() {
        return (Boolean) this.h.a().b().h(blne.a).c(false);
    }

    @Override // defpackage.bllj, defpackage.blkw
    public Boolean a() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1.c(r2) != false) goto L7;
     */
    @Override // defpackage.bllj, defpackage.jax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence b() {
        /*
            r7 = this;
            java.lang.String r0 = r7.C()
            cebr r1 = r7.n
            boolean r1 = r1.a()
            if (r1 != 0) goto L19
            cebr r1 = r7.n
            ilo r2 = r7.o
            defpackage.dbsk.s(r2)
            boolean r1 = r1.c(r2)
            if (r1 == 0) goto L83
        L19:
            cdjd r1 = r7.h
            boolean r1 = defpackage.cebu.a(r1)
            if (r1 == 0) goto L83
            android.content.Context r1 = r7.i
            cdjd r2 = r7.h
            cdiz r2 = r2.c()
            dcdc r2 = r2.a()
            int r2 = r2.size()
            if (r2 != 0) goto L34
            return r0
        L34:
            java.lang.String r0 = android.text.TextUtils.htmlEncode(r0)
            android.content.res.Resources r3 = r1.getResources()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4[r0] = r6
            r0 = 2131820720(0x7f1100b0, float:1.9274163E38)
            java.lang.String r0 = r3.getQuantityString(r0, r2, r4)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            int r2 = r0.length()
            java.lang.Class<android.text.style.StyleSpan> r3 = android.text.style.StyleSpan.class
            java.lang.Object[] r2 = r0.getSpans(r5, r2, r3)
            android.text.style.StyleSpan[] r2 = (android.text.style.StyleSpan[]) r2
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            android.text.style.TextAppearanceSpan r4 = new android.text.style.TextAppearanceSpan
            r6 = 2132018142(0x7f1403de, float:1.9674582E38)
            r4.<init>(r1, r6)
            r1 = r2[r5]
            int r1 = r0.getSpanStart(r1)
            r2 = r2[r5]
            int r0 = r0.getSpanEnd(r2)
            r2 = 17
            r3.setSpan(r4, r1, r0, r2)
            return r3
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blnh.b():java.lang.CharSequence");
    }

    @Override // defpackage.bllj, defpackage.jax
    @dzsi
    public CharSequence c() {
        if (!B().booleanValue() || !this.h.c().e().a()) {
            return null;
        }
        return this.i.getString(R.string.LOCAL_GUIDE);
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqss d() {
        return irg.K();
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqtv e() {
        return d;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof blnh)) {
            return false;
        }
        blnh blnhVar = (blnh) obj;
        return dbsd.a(b().toString(), blnhVar.b().toString()) && dbsd.a(D(c()), D(blnhVar.c())) && dbsd.a(d(), blnhVar.d()) && dbsd.a(D(f()), D(blnhVar.f())) && dbsd.a(k(), blnhVar.k());
    }

    @Override // defpackage.bllj, defpackage.jax
    public CharSequence f() {
        int intValue = ((Integer) this.h.a().b().h(blnb.a).c(0)).intValue();
        int intValue2 = ((Integer) this.h.a().b().h(blnc.a).c(0)).intValue();
        Context context = this.i;
        boolean booleanValue = B().booleanValue();
        dbrz j = dbrz.e(" · ").j();
        String str = null;
        String string = booleanValue ? context.getString(R.string.LOCAL_GUIDE) : null;
        String b = intValue > 0 ? blks.b(context.getResources(), intValue) : null;
        Object[] objArr = new Object[1];
        if (intValue == 0 && intValue2 > 0) {
            str = blks.a(context.getResources(), intValue2);
        }
        objArr[0] = str;
        return j.i(string, b, objArr);
    }

    @Override // defpackage.bllj, defpackage.jax
    @dzsi
    public jht h() {
        jay jayVar = this.j;
        if (jayVar != null) {
            if (jayVar.a().isEmpty() && this.j.b() == null) {
                return null;
            }
            return this.j.b();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b().toString(), c(), d(), f(), k()});
    }

    @Override // defpackage.bllj, defpackage.jax
    @dzsi
    public jic k() {
        String str;
        if (cdrr.r(docg.M, this.h.a().c()).equals(this.h)) {
            return null;
        }
        if (!this.a || (str = this.b) == null) {
            str = (String) this.h.a().b().h(blnd.a).f();
        }
        return new jic(str, ckqc.FIFE_MERGE, 2131232998);
    }

    @Override // defpackage.bllj, defpackage.jax
    public Boolean l() {
        return Boolean.valueOf(this.k != null);
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqkl m(cjqm cjqmVar) {
        Runnable runnable = this.k;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.bllj, defpackage.jax
    public cjtd s() {
        cjta b = cjtd.b();
        b.d = dtxy.lP;
        b.g(this.h.a().h().c(""));
        return b.a();
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqss u() {
        return irg.y();
    }

    public void x(ilo iloVar, cdjd cdjdVar, Boolean bool, @dzsi jay jayVar) {
        this.o = iloVar;
        this.h = cdjdVar;
        this.a = bool.booleanValue();
        dbsg<cdis> b = cdjdVar.a().b();
        if (!cdjdVar.a().a().a()) {
            if (((Boolean) b.h(blmz.a).c(false)).booleanValue()) {
                this.k = bmek.b(this.i, this.f.a(), this.g, cdjdVar.a().b().b().b().b());
            }
        } else if (this.m.e()) {
            bool.booleanValue();
            this.k = bmek.c(this.m, cdjdVar.a().a().c(""));
        } else {
            this.k = bmek.a(this.f.a(), cdjdVar.a().a().c(""));
        }
        this.j = jayVar;
    }

    @Override // defpackage.bllj, defpackage.jax
    @dzsi
    /* renamed from: y */
    public String i() {
        jht h = h();
        if (h == null || dbsj.d(h.g())) {
            String C = C();
            if (!C.isEmpty()) {
                return this.i.getString(R.string.OPTIONS_FOR_REVIEWER_DESCRIPTION, C);
            }
            return null;
        }
        return h.g();
    }

    public void z(btrm btrmVar) {
        if (!this.l) {
            this.l = true;
            blng blngVar = this.e;
            dceq a = dcet.a();
            a.b(ccih.class, new blnj(ccih.class, blngVar, bvrj.UI_THREAD));
            btrmVar.g(blngVar, a.a());
        }
    }
}
