package defpackage;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cczu  reason: default package */
/* loaded from: classes4.dex */
public class cczu implements ccxl, ccxi {
    public final ff a;
    public final cjqy b;
    public final ccza c;
    public final cpv d;
    private final bvrb k;
    private final bvdz l;
    private final btvo m;
    private final dxio<bbut> n;
    private final ccvx o;
    private final cczk p;
    private final ccxh q;
    private final boolean r;
    public CharSequence e = "";
    private dgfb s = dgfb.UNKNOWN_OFFERING_TYPE;
    private cjtd t = cjtd.b;
    @dzsi
    private String u = null;
    private ccxa v = ccxa.f;
    private ccme w = ccme.f;
    public dcdc<cczj> f = dcdc.e();
    public dcdc<ccwu> g = dcdc.e();
    private dcdc<cczj> x = dcdc.e();
    private dcdc<cczj> y = dcdc.e();
    public dcdc<dwfl> h = dcdc.e();
    public dbsg<ccxk> i = dbpy.a;
    private cczt z = cczl.a;
    private Boolean A = false;
    private Boolean B = false;
    @dzsi
    private ccvw C = null;
    public boolean j = true;
    private final cqqw D = new cczs(this);

    public cczu(cqhn cqhnVar, cqhu cqhuVar, ff ffVar, cjqy cjqyVar, bvrb bvrbVar, bvdz bvdzVar, ccrh ccrhVar, btvo btvoVar, dxio<bbut> dxioVar, ccvx ccvxVar, cczk cczkVar, cpv cpvVar, bvjj bvjjVar, ccza cczaVar, ccxh ccxhVar) {
        this.a = ffVar;
        this.b = cjqyVar;
        this.k = bvrbVar;
        this.l = bvdzVar;
        this.m = btvoVar;
        this.c = cczaVar;
        this.n = dxioVar;
        this.o = ccvxVar;
        this.p = cczkVar;
        this.d = cpvVar;
        this.q = ccxhVar;
        this.r = bvjjVar.m(bvjk.kg, false);
    }

    public static String M(CharSequence charSequence) {
        return charSequence.toString().toLowerCase(Locale.getDefault());
    }

    private final boolean O() {
        return this.m.getUgcOfferingsParameters().h();
    }

    private final boolean P() {
        return this.m.getUgcOfferingsParameters().g();
    }

    private final List<? extends ccxk> Q(List<? extends ccxk> list) {
        if (P()) {
            return list.subList(0, Math.min(list.size(), 3));
        }
        return dcdc.e();
    }

    @Override // defpackage.ccxl
    public cqqw A() {
        return this.D;
    }

    @Override // defpackage.ccxl
    public Boolean B() {
        boolean z = true;
        if (!this.r && !this.m.getPlaceOfferingsParametersWithoutLogging().i) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void C(cczt ccztVar) {
        this.z = ccztVar;
    }

    public List<ccwu> D() {
        return this.g;
    }

    public boolean E() {
        jmw.d(this.a, null);
        ccza cczaVar = this.c;
        if (cczaVar.c == null) {
            this.a.g().f();
            return true;
        }
        gz b = cczaVar.b.b();
        fd fdVar = cczaVar.c;
        dbsk.s(fdVar);
        b.u(fdVar);
        b.g();
        cczaVar.c = null;
        N(false);
        View o = cqkx.o(this);
        if (o != null) {
            this.d.f(o, this.a.getResources().getString(R.string.OFFERING_SUGGESTION_CLOSE_PHOTO_VIEWER_ACCESSIBILITY_ANNOUNCEMENT));
        }
        return true;
    }

    public void F(List<dwfl> list) {
        if (!O() || this.C == null) {
            return;
        }
        this.h = dcdc.r(list);
        this.A = false;
        ccvw ccvwVar = this.C;
        dbsk.s(ccvwVar);
        ccvwVar.d(this.h);
        cqkx.p(this);
    }

    public void G(Boolean bool) {
        if (!O()) {
            return;
        }
        this.A = bool;
        cqkx.p(this);
    }

    public void H(dgfb dgfbVar, String str, @dzsi String str2, ccxa ccxaVar, ccme ccmeVar, dcdc<ccwu> dcdcVar) {
        cjtd cjtdVar;
        String string;
        int a;
        this.s = dgfbVar;
        dgfb m = m();
        if (ccrh.e.containsKey(m)) {
            cjtdVar = ccrh.e.get(m);
        } else {
            cjtdVar = cjtd.b;
        }
        this.t = cjtdVar;
        this.e = str;
        this.u = str2;
        this.v = ccxaVar;
        this.g = dcdcVar;
        J(str.isEmpty(), dcdcVar);
        if ((ccmeVar.a & 2) != 0) {
            this.w = ccmeVar;
        } else {
            ccmb ca = ccme.f.ca(ccmeVar);
            if (!O() || ((a = ccmd.a(ccmeVar.b)) != 0 && a == 3)) {
                string = this.a.getResources().getString(R.string.OFFERING_SUGGESTION_DONE_BUTTON);
            } else {
                string = this.a.getResources().getString(R.string.OFFERING_SUGGESTION_NEXT_BUTTON);
            }
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            ccme ccmeVar2 = (ccme) ca.b;
            string.getClass();
            ccmeVar2.a |= 2;
            ccmeVar2.c = string;
            this.w = ca.bK();
        }
        if (O()) {
            ccvx ccvxVar = this.o;
            cczo cczoVar = new cczo(this);
            btvo a2 = ccvxVar.a.a();
            ccvx.a(a2, 1);
            ccrh a3 = ccvxVar.b.a();
            ccvx.a(a3, 2);
            ccvu a4 = ccvxVar.c.a();
            ccvx.a(a4, 3);
            ccvx.a(dgfbVar, 4);
            ccvx.a(cczoVar, 5);
            this.C = new ccvw(a2, a3, a4, dgfbVar, cczoVar);
        }
    }

    public void I() {
        final String M = M(this.e);
        djtl bZ = djtr.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djtr djtrVar = (djtr) bZ.b;
        M.getClass();
        djtrVar.a |= 1;
        djtrVar.b = M;
        djtm bZ2 = djtq.f.bZ();
        dgfb dgfbVar = this.s;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djtq djtqVar = (djtq) bZ2.b;
        djtqVar.d = dgfbVar.f;
        djtqVar.a |= 2;
        djtq djtqVar2 = (djtq) bZ2.b;
        djtqVar2.e = 1;
        int i = djtqVar2.a | 4;
        djtqVar2.a = i;
        ccxa ccxaVar = this.v;
        String str = ccxaVar.b;
        str.getClass();
        djtqVar2.a = i | 1;
        djtqVar2.b = str;
        dccx F = dcdc.F();
        for (String str2 : ccxaVar.c) {
            djtn bZ3 = djto.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            djto djtoVar = (djto) bZ3.b;
            str2.getClass();
            djtoVar.a |= 1;
            djtoVar.b = str2;
            F.g(bZ3.bK());
        }
        dcdc f = F.f();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djtq djtqVar3 = (djtq) bZ2.b;
        dsrj<djto> dsrjVar = djtqVar3.c;
        if (!dsrjVar.a()) {
            djtqVar3.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(f, djtqVar3.c);
        djtq bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djtr djtrVar2 = (djtr) bZ.b;
        bK.getClass();
        djtrVar2.c = bK;
        djtrVar2.a |= 2;
        this.l.b(bZ.bK(), new ccts(new bvqg(this, M) { // from class: cczp
            private final cczu a;
            private final String b;

            {
                this.a = this;
                this.b = M;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                cczu cczuVar = this.a;
                String str3 = this.b;
                djub djubVar = (djub) obj;
                if (!str3.equals(cczu.M(cczuVar.e))) {
                    return;
                }
                cczuVar.g = dcbg.b(djubVar.a).s(cczr.a).z();
                cczuVar.J(str3.isEmpty(), cczuVar.g);
                cqkx.p(cczuVar);
            }
        }, new bvqg() { // from class: cczq
            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                btzy btzyVar = (btzy) obj;
            }
        }), this.k.h());
    }

    public final void J(boolean z, List<ccwu> list) {
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        for (ccwu ccwuVar : list) {
            cczk cczkVar = this.p;
            String charSequence = this.e.toString();
            dgfb dgfbVar = this.s;
            ccxh ccxhVar = this.q;
            btvo a = cczkVar.a.a();
            cczk.a(a, 1);
            Application a2 = cczkVar.b.a();
            cczk.a(a2, 2);
            cczk.a(charSequence, 3);
            cczk.a(dgfbVar, 4);
            cczk.a(ccwuVar, 5);
            cczk.a(this, 6);
            cczk.a(ccxhVar, 7);
            cczj cczjVar = new cczj(a, a2, charSequence, dgfbVar, ccwuVar, this, ccxhVar);
            djtz djtzVar = ccwuVar.c;
            if (djtzVar == null) {
                djtzVar = djtz.c;
            }
            if (djtzVar.a != 1) {
                F.g(cczjVar);
            } else if (P()) {
                F2.g(cczjVar);
            }
        }
        if (!z || (!P() && this.h.isEmpty())) {
            dccx F3 = dcdc.F();
            F3.i(F2.f());
            F3.i(F.f());
            this.f = F3.f();
            return;
        }
        this.x = F.f();
        this.y = F2.f();
    }

    public final void K(String str) {
        EditText editText = (EditText) L(ccql.c, EditText.class);
        if (editText == null) {
            return;
        }
        editText.setText(str);
        editText.setSelection(str.length());
    }

    @dzsi
    public final <T extends View> T L(cqjg cqjgVar, Class<T> cls) {
        View o = cqkx.o(this);
        if (o != null) {
            return (T) cqkx.e(o, cqjgVar, cls);
        }
        return null;
    }

    public final void N(Boolean bool) {
        this.B = bool;
        cqkx.p(this);
    }

    @Override // defpackage.ccxi
    public void a(ccxk ccxkVar) {
        this.i = dbsg.i(ccxkVar);
        K(ccxkVar.a().toString());
    }

    @Override // defpackage.ccxl
    public CharSequence b() {
        return this.e;
    }

    @Override // defpackage.ccxl
    public String c() {
        dgfb dgfbVar = dgfb.UNKNOWN_OFFERING_TYPE;
        int ordinal = this.s.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? "" : this.a.getString(R.string.OFFERING_SUGGESTION_PRODUCT_QUERY_HINT);
        } else if (O()) {
            return this.a.getString(R.string.OFFERING_DISH_NAME_ENTRY_HINT);
        } else {
            return this.a.getString(R.string.OFFERING_SUGGESTION_DISH_QUERY_HINT);
        }
    }

    @Override // defpackage.ccxl
    public List<? extends ccxk> d() {
        return this.f;
    }

    @Override // defpackage.ccxl
    public List<? extends ccxk> e() {
        return Q(this.y);
    }

    @Override // defpackage.ccxl
    public List<? extends ccxk> f() {
        return Q(this.x);
    }

    @Override // defpackage.ccxl
    public cqgl g() {
        return new cqgl(this) { // from class: cczm
            private final cczu a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                cczu cczuVar = this.a;
                cczuVar.e = charSequence;
                if (cczuVar.i.a() && !cczuVar.i.b().a().toString().contentEquals(cczuVar.e)) {
                    cczuVar.i = dbpy.a;
                }
                if (cczuVar.e.length() == 0) {
                    cczuVar.f = dcdc.e();
                }
                cqkx.p(cczuVar);
                cczuVar.I();
            }
        };
    }

    @Override // defpackage.ccxl
    public cqkl h() {
        K("");
        return cqkl.a;
    }

    @Override // defpackage.ccxl
    public cqkl i() {
        E();
        return cqkl.a;
    }

    @Override // defpackage.ccxl
    public Boolean j() {
        return Boolean.valueOf(!TextUtils.isEmpty(this.e));
    }

    @Override // defpackage.ccxl
    public cqkl k(@dzsi cjqm cjqmVar) {
        ccwu bK;
        int i;
        if (j().booleanValue()) {
            if (this.i.a()) {
                bK = ((cczj) this.i.b()).g();
                djtz djtzVar = bK.c;
                if (djtzVar == null) {
                    djtzVar = djtz.c;
                }
                i = djtzVar.a == 1 ? 5 : 3;
            } else {
                ccwt bZ = ccwu.d.bZ();
                String charSequence = this.e.toString();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ccwu ccwuVar = (ccwu) bZ.b;
                charSequence.getClass();
                ccwuVar.a = 1 | ccwuVar.a;
                ccwuVar.b = charSequence;
                bK = bZ.bK();
                i = p().booleanValue() ? 4 : 2;
            }
            this.z.aJ(bK, i, cjqmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxl
    public TextView.OnEditorActionListener l() {
        return new TextView.OnEditorActionListener(this) { // from class: cczn
            private final cczu a;

            {
                this.a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
            @Override // android.widget.TextView.OnEditorActionListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onEditorAction(android.widget.TextView r4, int r5, android.view.KeyEvent r6) {
                /*
                    r3 = this;
                    cczu r4 = r3.a
                    r0 = 1
                    r1 = 0
                    if (r5 != 0) goto L18
                    int r5 = r6.getAction()
                    if (r5 != 0) goto L17
                    int r5 = r6.getKeyCode()
                    r6 = 66
                    if (r5 != r6) goto L17
                    r5 = 0
                    r6 = 1
                    goto L19
                L17:
                    r5 = 0
                L18:
                    r6 = 0
                L19:
                    r2 = 6
                    if (r5 == r2) goto L1e
                    if (r6 == 0) goto L28
                L1e:
                    java.lang.Boolean r5 = r4.j()
                    boolean r5 = r5.booleanValue()
                    if (r5 != 0) goto L2a
                L28:
                    r0 = 0
                    goto L4c
                L2a:
                    cqjg r5 = defpackage.ccql.c
                    java.lang.Class<android.widget.EditText> r6 = android.widget.EditText.class
                    android.view.View r5 = r4.L(r5, r6)
                    android.widget.EditText r5 = (android.widget.EditText) r5
                    r6 = 0
                    if (r5 != 0) goto L39
                    r5 = r6
                    goto L3d
                L39:
                    cjql r5 = defpackage.cjqg.e(r5)
                L3d:
                    if (r5 == 0) goto L49
                    cjqy r6 = r4.b
                    cjtd r1 = r4.u()
                    cjqm r6 = r6.j(r5, r1)
                L49:
                    r4.k(r6)
                L4c:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cczn.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
            }
        };
    }

    @Override // defpackage.ccxl
    public dgfb m() {
        return this.s;
    }

    @Override // defpackage.ccxl
    public Boolean n() {
        ccvw ccvwVar;
        boolean z = false;
        if (O() && (ccvwVar = this.C) != null && !ccvwVar.a().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ccxl
    public Boolean o() {
        boolean z = false;
        if (O() && this.A.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ccxl
    public Boolean p() {
        return this.B;
    }

    @Override // defpackage.ccxl
    @dzsi
    public ccvs q() {
        return this.C;
    }

    @Override // defpackage.ccxl
    @dzsi
    public String r() {
        return this.u;
    }

    @Override // defpackage.ccxl
    public cqkl s() {
        if (!dbsj.d(this.u)) {
            View o = cqkx.o(this);
            if (o != null) {
                o.setImportantForAccessibility(4);
            }
            bbut a = this.n.a();
            dwfi bZ = dwfl.w.bZ();
            String str = this.u;
            dbsk.s(str);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwfl dwflVar = (dwfl) bZ.b;
            str.getClass();
            dwflVar.a |= 128;
            dwflVar.h = str;
            ckne ckneVar = new ckne(dcdc.f(bZ.bK()));
            bbtv v = bbty.v();
            v.t(true);
            a.o(ckneVar, 0, v.a(), null);
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxl
    public cjtd t() {
        dgfb dgfbVar = this.s;
        if (ccrh.h.containsKey(dgfbVar)) {
            return ccrh.h.get(dgfbVar);
        }
        return cjtd.b;
    }

    @Override // defpackage.ccxl
    public cjtd u() {
        return this.t;
    }

    @Override // defpackage.ccxl
    public String v() {
        return this.s != dgfb.DISH ? "" : this.a.getResources().getString(R.string.OFFERING_SUGGESTION_DISH_PHOTO_THUMBNAIL_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.ccxl
    public String w() {
        return this.w.c;
    }

    @Override // defpackage.ccxl
    public Boolean x() {
        return Boolean.valueOf(this.m.getUgcOfferingsParameters().k());
    }

    @Override // defpackage.ccxl
    public Boolean y() {
        return Boolean.valueOf(this.m.getUgcOfferingsParameters().l());
    }

    @Override // defpackage.ccxl
    public Boolean z() {
        return Boolean.valueOf(this.j);
    }
}
