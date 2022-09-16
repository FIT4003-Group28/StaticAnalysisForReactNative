package defpackage;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cecz  reason: default package */
/* loaded from: classes4.dex */
public class cecz implements cebx {
    public final Activity a;
    private cdjd b;
    private final btvo f;
    @dzsi
    private cecm k;
    @dzsi
    private cjcu l;
    @dzsi
    private cecd m;
    private final cbze n;
    private final ccaf o;
    private final cecn p;
    private final cjcw q;
    private final cjcs r;
    private final cebu s;
    private final boolean t;
    @dzsi
    private final cjtd u;
    private String c = "";
    private String d = "";
    private String e = "";
    private boolean g = false;
    private boolean h = true;
    private boolean i = false;
    private CharSequence j = "";

    public cecz(Activity activity, btvo btvoVar, final dxio<cbzd> dxioVar, cbze cbzeVar, final cjqy cjqyVar, blkr blkrVar, cecn cecnVar, cece ceceVar, cjcw cjcwVar, cebr cebrVar, cebu cebuVar, @dzsi cjtd cjtdVar, cjcs cjcsVar, boolean z) {
        this.a = activity;
        this.f = btvoVar;
        this.n = cbzeVar;
        this.p = cecnVar;
        this.q = cjcwVar;
        this.s = cebuVar;
        this.u = cjtdVar;
        this.r = cjcsVar;
        this.t = z;
        this.o = new ccaf(cjqyVar, dxioVar) { // from class: ceco
            private final cjqy a;
            private final dxio b;

            {
                this.a = cjqyVar;
                this.b = dxioVar;
            }

            @Override // defpackage.ccaf
            public final void a(String str) {
                cjqy cjqyVar2 = this.a;
                dxio dxioVar2 = this.b;
                cbzb c = cbzc.c();
                ((cbyz) c).a = cjqyVar2.i(cjtd.a(dtxr.c)).a().f();
                ((cbzd) dxioVar2.a()).a(str, c.a());
            }
        };
    }

    private final dbsg<CharSequence> w() {
        SpannableString spannableString;
        if (r().booleanValue()) {
            spannableString = new SpannableString(this.a.getString(R.string.REVIEW_SEE_MORE_LINK));
            x(new StyleSpan(1), spannableString);
            x(new UnderlineSpan(), spannableString);
            x(new ForegroundColorSpan(ibm.n().b(this.a)), spannableString);
        } else {
            spannableString = null;
        }
        return dbsg.j(spannableString);
    }

    private static void x(Object obj, SpannableString spannableString) {
        spannableString.setSpan(obj, 0, spannableString.length(), 17);
    }

    private final boolean y() {
        cdjd cdjdVar;
        return this.t && (cdjdVar = this.b) != null && this.s.b(cdjdVar, eaov.a(this.f.getUgcParameters().aX()));
    }

    @Override // defpackage.oxe
    @dzsi
    public cjtd a() {
        throw null;
    }

    @Override // defpackage.oxt
    @dzsi
    public Float b() {
        cdjd cdjdVar = this.b;
        if (cdjdVar == null) {
            return null;
        }
        return (Float) cdjdVar.c().e().h(cecy.a).f();
    }

    @Override // defpackage.oxt
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.oxt
    public Boolean d() {
        boolean z = false;
        if (y() && !this.f.getUgcParameters().aY()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oxt
    public Boolean e() {
        boolean z = false;
        if (y() && this.f.getUgcParameters().aY()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof cecz)) {
            return false;
        }
        return dbsd.a(this.b, ((cecz) obj).b);
    }

    @Override // defpackage.oxt
    public CharSequence f() {
        if (this.c.length() == 0 || dbsj.d(this.e)) {
            return c();
        }
        return this.a.getString(R.string.REVIEW_PUBLISH_DATE_ANNOTATION_AT_PLACE, new Object[]{this.c, this.e});
    }

    @Override // defpackage.oxt
    public CharSequence g() {
        return this.d;
    }

    @Override // defpackage.oxt
    public CharSequence h() {
        return this.j;
    }

    public int hashCode() {
        Object[] objArr = new Object[1];
        cdjd cdjdVar = this.b;
        objArr[0] = cdjdVar != null ? cdjdVar.a().g() : null;
        return Arrays.hashCode(objArr);
    }

    @Override // defpackage.oxt
    public String i() {
        cdjd cdjdVar = this.b;
        return cdjdVar == null ? "" : (String) cdjdVar.c().f().h(new dbrn(this) { // from class: cecp
            private final cecz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return bqsq.b(this.a.a.getResources(), (eapy) obj);
            }
        }).c("");
    }

    @Override // defpackage.oxt
    public String j() {
        return "";
    }

    @Override // defpackage.oxt
    public ccaf k() {
        return this.o;
    }

    @Override // defpackage.oxt
    public ccag l() {
        return this.n.a ? ccag.b : ccag.a;
    }

    @Override // defpackage.oxt
    public Boolean m() {
        if (this.i) {
            return true;
        }
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.oxt
    @dzsi
    public oxk n() {
        return this.k;
    }

    @Override // defpackage.oxt
    @dzsi
    public cebw o() {
        return this.m;
    }

    @Override // defpackage.oxt
    @dzsi
    public cjcu p() {
        return this.l;
    }

    @Override // defpackage.oxt
    public Boolean q() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.oxt
    public Boolean r() {
        return Boolean.valueOf(this.f.getUgcParameters().aQ());
    }

    @Override // defpackage.oxt
    public cjtd s(ddho ddhoVar) {
        cjta c = cjtd.c(this.u);
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.cebx
    public Boolean t() {
        cdjd cdjdVar = this.b;
        boolean z = false;
        if (cdjdVar != null && !cdjdVar.c().a().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cebx
    public CharSequence u() {
        return "";
    }

    public void v(cdjd cdjdVar, String str, String str2, dbsg<djck> dbsgVar, boolean z, boolean z2) {
        this.b = cdjdVar;
        this.e = str2;
        this.h = z2;
        this.g = z;
        boolean z3 = false;
        boolean booleanValue = ((Boolean) cdjdVar.c().b().h(cecq.a).c(false)).booleanValue();
        if (!booleanValue && !z && dbsgVar.a()) {
            z3 = true;
        }
        this.i = z3;
        cecd cecdVar = null;
        this.k = (!cdjdVar.c().g().a() || !this.f.getUgcParameters().aJ()) ? null : this.p.a(cdjdVar.c().g().b());
        this.l = (cdjdVar == null || !((dbsg) cdjdVar.c().b().h(cecr.a).c(dbpy.a)).a()) ? null : this.q.a(cdjdVar.c().b().b().f(), cdjdVar.c().b().b().d(), (String) cdjdVar.a().b().h(cecx.a).c(""), cjct.REVIEW, this.u, this.r);
        if (cecd.c(this.f).booleanValue() && !cdjdVar.c().h().isEmpty()) {
            List<dreq> h = cdjdVar.c().h();
            if (h != null) {
                cecdVar = new cecd(h);
            } else {
                StringBuilder sb = new StringBuilder(93);
                sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
                sb.append(1);
                throw new NullPointerException(sb.toString());
            }
        }
        this.m = cecdVar;
        if (cdja.DRAFT.equals(cdjdVar.a().c())) {
            this.c = "";
            this.d = this.a.getString(R.string.REVIEW_IS_DRAFT_STATUS);
        } else {
            this.c = cdjdVar.a().d();
            this.d = "";
        }
        if (cdjdVar == null) {
            this.j = "";
        } else if (booleanValue) {
            final blkq a = blkr.a(str, dbsgVar, cdjdVar.c().d(), this.i, w());
            dbsg h2 = cdjdVar.c().b().h(cecs.a).h(cect.a);
            a.getClass();
            this.j = (CharSequence) h2.h(new dbrn(a) { // from class: cecu
                private final blkq a;

                {
                    this.a = a;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.a((String) obj);
                }
            }).c("");
        } else {
            final blkq a2 = blkr.a(str, dbsgVar, cdjdVar.c().c(), this.i, w());
            dbsg<V> h3 = cdjdVar.c().b().h(cecv.a);
            a2.getClass();
            this.j = (CharSequence) h3.h(new dbrn(a2) { // from class: cecw
                private final blkq a;

                {
                    this.a = a2;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.a((CharSequence) obj);
                }
            }).c("");
        }
    }
}
