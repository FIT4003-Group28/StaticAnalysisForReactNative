package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: bhxy  reason: default package */
/* loaded from: classes3.dex */
public class bhxy implements bhwx, axvp {
    private String A;
    private final boolean B;
    private axwt C;
    private final bzgf D;
    private final bzgj E;
    private final bhxo F;
    private final bhxo G;
    private final bhxo H;
    private final List<bhxo> I;
    private final bhxo J;
    private final Pattern K;
    private final Pattern L;
    private final List<dnvu> M;
    private final List<bhwv> N;
    private bhxs O;
    private bhxs P;
    private bhxv Q;
    private bhxv R;
    public final ff a;
    public final cjqy b;
    public final bvrb c;
    public final dzsj<axwy> d;
    public final dxio<axwq> e;
    public final bwrs<ilo> f;
    public final axwu g;
    public String h;
    public dndr i;
    public final bhxp j;
    @dzsi
    public cjkr k;
    public boolean l;
    public boolean m;
    public boolean n;
    @dzsi
    public EditText o;
    public bhxj p;
    private final cztz q;
    private final dxio<akfa> r;
    private final ges s;
    private final bhww t;
    private final buju u;
    private final btvo v;
    private final axws w;
    @dzsi
    private final axvp x;
    private final jib y;
    private final boolean z;

    public bhxy(ff ffVar, bvrb bvrbVar, cztz cztzVar, dxio<akfa> dxioVar, dzsj<axwy> dzsjVar, dxio<axwq> dxioVar2, buju bujuVar, cqhn cqhnVar, btvo btvoVar, axws axwsVar, Executor executor, cjqy cjqyVar, ges gesVar, bwrs<ilo> bwrsVar, bhww bhwwVar, bhxp bhxpVar, boolean z, @dzsi axvp axvpVar) {
        bzgf bzgfVar = new bzgf(this) { // from class: bhxa
            private final bhxy a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                this.a.y();
            }
        };
        this.D = bzgfVar;
        bzgj bzgjVar = new bzgj();
        this.E = bzgjVar;
        this.N = new ArrayList();
        this.a = ffVar;
        this.f = bwrsVar;
        this.s = gesVar;
        this.t = bhwwVar;
        this.j = bhxpVar;
        this.z = z;
        this.c = bvrbVar;
        this.q = cztzVar;
        this.r = dxioVar;
        this.d = dzsjVar;
        this.e = dxioVar2;
        this.u = bujuVar;
        this.v = btvoVar;
        this.w = axwsVar;
        this.x = axvpVar;
        this.C = axwt.a;
        this.b = cjqyVar;
        this.g = new bhxi(gesVar);
        bzgg.b(bzgfVar, axwsVar, bzgjVar, executor);
        y();
        jhz a = jhz.a();
        if (z) {
            a.a = ffVar.getString(R.string.ADD_CONTACT_MENU_TITLE);
        } else if (F()) {
            a.a = ffVar.getString(R.string.ALIAS_HEADER_EDIT_TITLE);
        } else {
            a.a = ffVar.getString(R.string.ALIAS_HEADER_ADD_TITLE);
        }
        if (F() && !z) {
            jhm a2 = jhm.a();
            a2.a = ffVar.getString(R.string.REMOVE);
            a2.h = 1;
            a2.f = cjtd.a(dtxj.aR);
            a2.d(new View.OnClickListener(this) { // from class: bhxd
                private final bhxy a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bhxy bhxyVar = this.a;
                    dbsk.l(bhxyVar.f.c().bi());
                    if (bhxyVar.l) {
                        return;
                    }
                    bhxyVar.l = true;
                    bhxyVar.G(bhxyVar.f.c().bh());
                    if (bhxyVar.i == dndr.HOME || bhxyVar.i == dndr.WORK) {
                        bhxyVar.k = bhxyVar.D(null);
                        bhxyVar.k.q().show();
                        return;
                    }
                    bhxyVar.p.b(bhxyVar.g);
                }
            });
            a.c(a2.c());
        }
        a.f(new View.OnClickListener(this) { // from class: bhxe
            private final bhxy a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.onBackPressed();
            }
        });
        this.y = a.b();
        this.h = (!F() || z) ? "" : bwrsVar.c().bh();
        this.i = dndr.UNKNOWN_ALIAS_TYPE;
        this.p = new bhxj(this);
        this.B = !K() && akqi.d(bwrsVar.c().ai());
        this.F = new bhxo(this, ffVar.getString(R.string.HOME_LOCATION));
        this.G = new bhxo(this, ffVar.getString(R.string.WORK_LOCATION));
        this.H = new bhxo(this, this.h);
        this.I = new ArrayList();
        for (int i = 0; i < 10; i++) {
            this.I.add(new bhxo(this, null, true, null));
        }
        this.J = new bhxo(this, null, true, null);
        this.l = false;
        this.m = false;
        this.n = false;
        String string = ffVar.getString(R.string.HOME_LOCATION);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 4);
        sb.append("\\b");
        sb.append(string);
        sb.append("\\b");
        this.K = Pattern.compile(sb.toString(), 2);
        String string2 = ffVar.getString(R.string.WORK_LOCATION);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 4);
        sb2.append("\\b");
        sb2.append(string2);
        sb2.append("\\b");
        this.L = Pattern.compile(sb2.toString(), 2);
        this.M = new ArrayList();
        if (this.B) {
            dvjk bZ = dvjl.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvjl dvjlVar = (dvjl) bZ.b;
            dvjlVar.a |= 1;
            dvjlVar.b = "";
            this.u.a(bZ.bK(), new bhxn(), bvrj.BACKGROUND_THREADPOOL);
        }
    }

    private final boolean K() {
        btlu j = this.r.a().j();
        return j != null && j.h;
    }

    private final boolean L() {
        return !dbsj.d(this.h) && F() && this.h.equals(this.f.c().bh());
    }

    public void A(@dzsi EditText editText) {
        this.o = editText;
    }

    public final String B(dndr dndrVar) {
        dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = dndrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return this.a.getString(R.string.WORK_LOCATION);
            }
            return this.a.getString(R.string.GENERIC_LABEL);
        }
        return this.a.getString(R.string.HOME_LOCATION);
    }

    public boolean C() {
        cjkr cjkrVar = this.k;
        return cjkrVar == null || !cjkrVar.q().isShowing();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cjkr D(@dzsi final ddho ddhoVar) {
        String string;
        String string2;
        ilo c = this.f.c();
        dbsk.l(this.i == dndr.HOME || this.i == dndr.WORK || c.bg());
        boolean z = this.l || !(!c.bg() || this.i == dndr.HOME || this.i == dndr.WORK);
        cjkp B = cjkr.B();
        if (z) {
            ff ffVar = this.a;
            Object[] objArr = new Object[1];
            objArr[0] = c.p == dndr.HOME ? this.a.getString(R.string.HOME_LOCATION) : this.a.getString(R.string.WORK_LOCATION);
            string = ffVar.getString(R.string.ALIAS_HOME_WORK_DELETE_DIALOG_HEADER, objArr);
        } else {
            ff ffVar2 = this.a;
            Object[] objArr2 = new Object[1];
            objArr2[0] = this.i == dndr.HOME ? this.a.getString(R.string.HOME_LOCATION) : this.a.getString(R.string.WORK_LOCATION);
            string = ffVar2.getString(R.string.ALIAS_HOME_WORK_REPLACE_DIALOG_HEADER, objArr2);
        }
        B.t(string);
        if (z) {
            ff ffVar3 = this.a;
            Object[] objArr3 = new Object[1];
            objArr3[0] = c.p == dndr.HOME ? this.a.getString(R.string.HOME_LOCATION) : this.a.getString(R.string.WORK_LOCATION);
            string2 = ffVar3.getString(R.string.ALIAS_HOME_WORK_DELETE_DIALOG_BODY_TEXT, objArr3);
        } else {
            ff ffVar4 = this.a;
            Object[] objArr4 = new Object[1];
            objArr4[0] = this.i == dndr.HOME ? this.a.getString(R.string.HOME_LOCATION) : this.a.getString(R.string.WORK_LOCATION);
            string2 = ffVar4.getString(R.string.ALIAS_HOME_WORK_REPLACE_DIALOG_BODY_TEXT, objArr4);
        }
        ((cjke) B).e = string2;
        B.z(z ? this.a.getString(R.string.REMOVE) : this.a.getString(R.string.DIALOG_UPDATE), new View.OnClickListener(this, ddhoVar) { // from class: bhxg
            private final bhxy a;
            private final ddho b;

            {
                this.a = this;
                this.b = ddhoVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bhxy bhxyVar = this.a;
                ddho ddhoVar2 = this.b;
                if (bhxyVar.l) {
                    bhxyVar.p.b(bhxyVar.g);
                } else {
                    bhxyVar.p.a(true, bhxyVar.g, bhxyVar.h, null, ddhoVar2);
                }
            }
        }, cjtd.a((this.i == dndr.HOME || c.p == dndr.HOME) ? dtxj.ay : dtxj.aF));
        B.y(this.a.getString(R.string.CANCEL_BUTTON), new View.OnClickListener(this) { // from class: bhxh
            private final bhxy a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l = false;
            }
        }, cjtd.a((this.i == dndr.HOME || c.p == dndr.HOME) ? dtxj.ax : dtxj.aE));
        return B.u(this.a);
    }

    public final boolean F() {
        bwrs<ilo> bwrsVar = this.f;
        return (bwrsVar == null || bwrsVar.c() == null || !this.f.c().bi()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(String str) {
        if (H(str)) {
            this.i = dndr.HOME;
        } else if (I(str)) {
            this.i = dndr.WORK;
        } else {
            this.i = dndr.NICKNAME;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H(@dzsi String str) {
        return str != null && str.equalsIgnoreCase(this.a.getString(R.string.HOME_LOCATION));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean I(@dzsi String str) {
        return str != null && str.equalsIgnoreCase(this.a.getString(R.string.WORK_LOCATION));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(@dzsi List<dnvu> list, String str) {
        bvrj.BACKGROUND_THREADPOOL.c();
        if (!this.s.aD || !str.equals(this.h)) {
            return;
        }
        this.H.b(this.h);
        synchronized (this.M) {
            this.M.clear();
            for (dnvu dnvuVar : list) {
                List<dnvu> list2 = this.M;
                dnvt bZ = dnvu.f.bZ();
                bZ.bC(dnvuVar);
                list2.add(bZ.bK());
            }
            this.N.clear();
            if (akqi.d(this.f.c().ai())) {
                synchronized (this.M) {
                    int i = 0;
                    for (dnvu dnvuVar2 : this.M) {
                        int i2 = i + 1;
                        bhxo bhxoVar = this.I.get(i);
                        bhxoVar.c(dnvuVar2);
                        this.N.add(bhxoVar);
                        i = i2;
                    }
                }
                if (!K()) {
                    this.J.b(this.h);
                    this.N.add(this.J);
                }
            }
        }
        this.c.b(new bhxk(this), bvrj.UI_THREAD);
    }

    @Override // defpackage.jaj
    public cqtd Rc() {
        return cqrt.g(2131231299, irg.c());
    }

    @Override // defpackage.jaj
    public Integer Rw() {
        return 532481;
    }

    @Override // defpackage.jaj
    public String a() {
        return this.h;
    }

    @Override // defpackage.jaj
    public void b(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.length() > 40) {
            trim = trim.substring(0, 40);
            cztq a = cztt.a(this.q);
            a.c = this.a.getString(R.string.ALIASING_NEW_PLACE_TEXT_LIMIT);
            a.c();
        }
        int length = dbsj.e(this.h).length();
        if (!trim.equals(this.h)) {
            this.h = trim;
            if (this.B) {
                synchronized (this.M) {
                    this.M.clear();
                }
                dvjk bZ = dvjl.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvjl dvjlVar = (dvjl) bZ.b;
                trim.getClass();
                int i = dvjlVar.a | 1;
                dvjlVar.a = i;
                dvjlVar.b = trim;
                dvjlVar.a = i | 2;
                dvjlVar.c = 10;
                dvjl bK = bZ.bK();
                if (length == 0) {
                    this.m = true;
                    cqkx.p(this);
                }
                this.u.a(bK, new bhxm(this, trim), bvrj.BACKGROUND_THREADPOOL);
                return;
            }
            this.H.b(trim);
            cqkx.p(this);
        }
    }

    @Override // defpackage.jaj
    public void c(Editable editable) {
    }

    @Override // defpackage.jaj
    public View.OnFocusChangeListener d() {
        throw null;
    }

    @Override // defpackage.jaj
    public void e(boolean z) {
    }

    @Override // defpackage.jaj
    public TextWatcher f() {
        return jag.b(this);
    }

    @Override // defpackage.jaj
    public String i() {
        if (this.z) {
            return this.a.getString(R.string.CONTACT_HINT_TEXT);
        }
        return this.a.getString(R.string.ALIAS_HINT_TEXT);
    }

    @Override // defpackage.bhwx
    public cqkl j() {
        this.h = "";
        EditText editText = this.o;
        if (editText != null) {
            editText.setText("");
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bhwx
    public List<bhwu> k() {
        if (this.v.getEnableFeatureParameters().ai) {
            if (this.O == null) {
                this.O = new bhxs(this, dndr.HOME);
            }
            if (this.P == null) {
                this.P = new bhxs(this, dndr.WORK);
            }
            if (this.Q == null) {
                this.Q = new bhxv(this, R.string.SCHOOL_LOCATION, "/m/06zdj");
            }
            if (this.R == null) {
                this.R = new bhxv(this, R.string.GYM_LOCATION, "/m/016yx7");
            }
            return dcdc.i(this.O, this.P, this.Q, this.R);
        }
        return dcdc.e();
    }

    @Override // defpackage.bhwx
    public Boolean l() {
        boolean z = false;
        int i = 0;
        for (bhwu bhwuVar : k()) {
            if (bhwuVar.a().booleanValue()) {
                i++;
            }
        }
        if (i <= 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhwx
    public List<bhwv> m() {
        ArrayList arrayList = new ArrayList();
        if (dbsj.d(this.h)) {
            return arrayList;
        }
        Matcher matcher = this.K.matcher(this.h);
        Matcher matcher2 = this.L.matcher(this.h);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        boolean z = true;
        boolean z2 = find && !find2;
        if (!find2 || find) {
            z = false;
        }
        String string = this.a.getString(R.string.HOME_LOCATION);
        String string2 = this.a.getString(R.string.WORK_LOCATION);
        if (!this.z || !F()) {
            if (string.equalsIgnoreCase(this.h)) {
                arrayList.add(this.F);
            } else if (string2.equalsIgnoreCase(this.h)) {
                arrayList.add(this.G);
            } else if (dbtw.c(string, this.h) || z2) {
                arrayList.add(this.H);
                arrayList.add(this.F);
                arrayList.addAll(this.N);
            } else if (dbtw.c(string2, this.h) || z) {
                arrayList.add(this.H);
                arrayList.add(this.G);
                arrayList.addAll(this.N);
            } else {
                arrayList.add(this.H);
                arrayList.addAll(this.N);
            }
            return arrayList;
        }
        arrayList.addAll(this.N);
        return arrayList;
    }

    @Override // defpackage.bhwx
    public jib n() {
        return this.y;
    }

    @Override // defpackage.bhwx
    public Boolean o() {
        boolean z = false;
        if (!dbsj.d(this.h) && !L() && !this.l) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhwx
    public Boolean p() {
        return Boolean.valueOf(dbsj.d(this.h));
    }

    @Override // defpackage.bhwx
    public TextView.OnEditorActionListener q() {
        return new TextView.OnEditorActionListener(this) { // from class: bhxf
            private final bhxy a;

            {
                this.a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
            @Override // android.widget.TextView.OnEditorActionListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onEditorAction(android.widget.TextView r5, int r6, android.view.KeyEvent r7) {
                /*
                    r4 = this;
                    bhxy r0 = r4.a
                    r1 = 1
                    r2 = 0
                    if (r6 != 0) goto L15
                    int r6 = r7.getAction()
                    if (r6 != 0) goto L14
                    int r6 = r7.getKeyCode()
                    r3 = 66
                    if (r6 == r3) goto L1a
                L14:
                    r6 = 0
                L15:
                    if (r7 != 0) goto L4d
                    r7 = 6
                    if (r6 != r7) goto L4d
                L1a:
                    cjqy r6 = r0.b
                    cjql r5 = defpackage.cjqg.e(r5)
                    cjte r7 = new cjte
                    deaf r3 = defpackage.deaf.KEYBOARD_ENTER
                    r7.<init>(r3)
                    cjtd r3 = r0.x()
                    cjqm r5 = r6.n(r5, r7, r3)
                    java.util.List r6 = r0.m()
                    boolean r7 = r6.isEmpty()
                    if (r7 != 0) goto L43
                    java.lang.Object r6 = r6.get(r2)
                    bhwv r6 = (defpackage.bhwv) r6
                    r6.f(r5)
                    goto L4e
                L43:
                    ff r5 = r0.a
                    gn r5 = r5.g()
                    r5.f()
                    goto L4e
                L4d:
                    r1 = 0
                L4e:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bhxf.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
            }
        };
    }

    @Override // defpackage.bhwx
    public Boolean r() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.bhwx
    public String s() {
        if (this.z) {
            return this.a.getString(R.string.CONTACT_EDU_TEXT);
        }
        return this.a.getString(R.string.ALIAS_EDU_TEXT);
    }

    @Override // defpackage.bhwx
    public String t() {
        return this.a.getString(R.string.ALIAS_SUGGESTION_TEXT);
    }

    @Override // defpackage.bhwx
    @dzsi
    public String u() {
        return this.C.a();
    }

    @Override // defpackage.bhwx
    public Boolean v() {
        return Boolean.valueOf(this.C.b());
    }

    @Override // defpackage.bhwx
    public Boolean w() {
        return v();
    }

    @Override // defpackage.bhwx
    public cjtd x() {
        return cjtd.a(dtxj.aJ);
    }

    public final void y() {
        this.C = this.w.b();
        cqkx.p(this);
    }

    public cqkl z(@dzsi String str, @dzsi ddho ddhoVar) {
        G(this.h);
        if (this.i == dndr.HOME || this.i == dndr.WORK || this.f.c().bg()) {
            cjkr D = D(ddhoVar);
            this.k = D;
            D.q().show();
        } else if (L()) {
            this.a.g().f();
        } else {
            this.p.a(true, this.g, this.h, str, ddhoVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.axvp
    public void E(boolean z, @dzsi azvc azvcVar, Context context) {
        int i;
        ilo d;
        String string;
        this.m = false;
        if (!z || azvcVar == null) {
            this.s.Nw(new bhwt(2, this.f.c()));
            if (this.l) {
                i = R.string.ALIAS_DELETE_ERROR_MESSAGE;
            } else if (this.n) {
                this.n = false;
                i = R.string.ALIAS_UNDO_DELETION_ERROR_MESSAGE;
            } else {
                i = F() ? R.string.UPDATE_ALIAS_ERROR_MESSAGE : R.string.ADD_NEW_ALIAS_ERROR_MESSAGE;
            }
            this.l = false;
            cztq a = cztt.a(this.q);
            a.c = this.a.getString(i, new Object[]{B(this.i).toLowerCase(Locale.getDefault())});
            a.c();
            axvp axvpVar = this.x;
            if (axvpVar == null) {
                return;
            }
            axvpVar.E(z, azvcVar, context);
            return;
        }
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        String str = null;
        if (this.l) {
            this.A = this.f.c().bh();
            ilo c = this.f.c();
            ily g = c.g();
            dvya bZ = dvyw.bv.bZ();
            bZ.bC(c.h());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar = (dvyw) bZ.b;
            dvywVar.ah = null;
            dvywVar.b &= -4194305;
            g.E(bZ.bK());
            d = g.d();
        } else {
            String charSequence = (!this.n || dbsj.d(this.A)) ? this.H.m().toString() : this.A;
            ilo c2 = this.f.c();
            Long l = ((azvd) azvcVar).a.b;
            dndi bZ2 = dndj.e.bZ();
            dndk bZ3 = dndl.d.bZ();
            dndr dndrVar2 = this.i;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dndl dndlVar = (dndl) bZ3.b;
            dndlVar.b = dndrVar2.h;
            dndlVar.a |= 1;
            String f = decu.f(l.longValue());
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dndl dndlVar2 = (dndl) bZ3.b;
            f.getClass();
            dndlVar2.a |= 2;
            dndlVar2.c = f;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dndj dndjVar = (dndj) bZ2.b;
            dndl bK = bZ3.bK();
            bK.getClass();
            dndjVar.b = bK;
            dndjVar.a |= 1;
            if (this.i == dndr.NICKNAME) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dndj dndjVar2 = (dndj) bZ2.b;
                charSequence.getClass();
                dndjVar2.a |= 2;
                dndjVar2.c = charSequence;
            } else if (this.i == dndr.HOME) {
                str = this.a.getString(R.string.HOME_LOCATION);
            } else if (this.i == dndr.WORK) {
                str = this.a.getString(R.string.WORK_LOCATION);
            }
            if (c2.bm() != null) {
                int i2 = c2.bm().b;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dndj dndjVar3 = (dndj) bZ2.b;
                dndjVar3.a |= 16;
                dndjVar3.d = i2;
            }
            ily g2 = c2.g();
            dvya bZ4 = dvyw.bv.bZ();
            bZ4.bC(c2.h());
            dndm bZ5 = dndn.c.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dndn dndnVar = (dndn) bZ5.b;
            dndj bK2 = bZ2.bK();
            bK2.getClass();
            dndnVar.b = bK2;
            dndnVar.a |= 1;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dvyw dvywVar2 = (dvyw) bZ4.b;
            dndn bK3 = bZ5.bK();
            bK3.getClass();
            dvywVar2.ah = bK3;
            dvywVar2.b |= 4194304;
            g2.E(bZ4.bK());
            g2.t = str;
            d = g2.d();
        }
        this.f.d(d);
        this.s.Nw(new bhwt(1, d));
        this.t.a();
        if (this.l) {
            dbsk.s(this.A);
            cztq a2 = cztt.a(this.q);
            int ordinal = this.i.ordinal();
            if (ordinal == 1) {
                string = this.a.getString(R.string.HOME_LOCATION_DELETED);
            } else if (ordinal == 2) {
                string = this.a.getString(R.string.WORK_LOCATION_DELETED);
            } else {
                string = this.a.getString(R.string.NICKNAME_DELETED);
            }
            a2.c = string;
            a2.f(this.a.getString(R.string.UNDO), new bhxx(this, this.A));
            a2.c();
        }
        axvp axvpVar2 = this.x;
        if (axvpVar2 == null) {
            return;
        }
        axvpVar2.E(true, azvcVar, context);
    }
}
