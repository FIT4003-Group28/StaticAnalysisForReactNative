package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aywb  reason: default package */
/* loaded from: classes3.dex */
public class aywb implements ayvf, ayfi, fzh {
    private final cpv A;
    private final aymh B;
    private jmk C;
    @dzsi
    private ayyi D;
    private boolean F;
    private boolean G;
    @dzsi
    private aydt I;
    @dzsi
    private ayvi J;
    private final ayyq K;
    public final gga a;
    public final axwi b;
    public final ayvl c;
    public final ayfk d;
    public final dxio<axwo> e;
    public final cjqy f;
    public final gfq g;
    public final ges h;
    public final baad i;
    @dzsi
    baal j;
    public final boolean m;
    public String n;
    public String o;
    public boolean p;
    public final ayrp q;
    private final fd r;
    private final bvrb s;
    private final axyr t;
    private final aybl u;
    private final aydu v;
    private final ayvj w;
    private final ayay x;
    private final Executor y;
    private final axwg z;
    public final List<baal> k = new ArrayList();
    private final Map<azxb, bwrs<ilo>> E = new HashMap();
    public final Map<azxb, ayve> l = new HashMap();
    private boolean H = false;

    public aywb(gga ggaVar, fd fdVar, dxio dxioVar, axwi axwiVar, bvrb bvrbVar, ayvl ayvlVar, axyr axyrVar, aybl ayblVar, ayfl ayflVar, aydu ayduVar, ayay ayayVar, Executor executor, axwg axwgVar, cjqy cjqyVar, ayvj ayvjVar, ayyq ayyqVar, cpv cpvVar, gfq gfqVar, aymh aymhVar, ges gesVar, baad baadVar, baal baalVar, ayrp ayrpVar) {
        this.a = ggaVar;
        this.r = fdVar;
        this.b = axwiVar;
        this.s = bvrbVar;
        this.c = ayvlVar;
        this.t = axyrVar;
        this.u = ayblVar;
        this.K = ayyqVar;
        this.j = baalVar;
        this.e = dxioVar;
        this.v = ayduVar;
        this.x = ayayVar;
        this.y = executor;
        this.z = axwgVar;
        this.f = cjqyVar;
        this.w = ayvjVar;
        this.A = cpvVar;
        this.g = gfqVar;
        this.B = aymhVar;
        this.h = gesVar;
        this.i = baadVar;
        this.n = baadVar.E(ggaVar.getApplicationContext());
        this.o = baadVar.G();
        this.m = baadVar.r() && baadVar.ab();
        ayfk a = ayflVar.a(baadVar, this);
        this.d = a;
        this.G = false;
        this.q = ayrpVar;
        this.C = new jmk(a);
        O();
        V();
    }

    private final void V() {
        Z();
        this.d.i(this.k);
    }

    private final String W(baal baalVar) {
        return baalVar.y(this.a.getApplicationContext());
    }

    private final void X() {
        final GmmRecyclerView Y;
        if (q().booleanValue() || this.k.isEmpty() || !this.r.U() || this.j == null) {
            return;
        }
        final int n = dcft.n(this.k, new dbsl(this) { // from class: ayvp
            private final aywb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                baal baalVar = this.a.j;
                dbsk.s(baalVar);
                return ((baal) obj).p(baalVar);
            }
        }) + 1;
        if (m().booleanValue()) {
            n++;
        }
        if (x().booleanValue()) {
            n++;
        }
        if (n >= 0 && (Y = Y()) != null) {
            Y.l(n);
            Y.post(new Runnable(this, Y, n) { // from class: ayvq
                private final aywb a;
                private final GmmRecyclerView b;
                private final int c;

                {
                    this.a = this;
                    this.b = Y;
                    this.c = n;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    View findViewById;
                    aywb aywbVar = this.a;
                    acl ab = this.b.ab(this.c);
                    if (ab == null || (findViewById = ab.a.findViewById(aytw.a)) == null) {
                        return;
                    }
                    findViewById.requestFocus();
                    aywbVar.j = null;
                }
            });
        }
        View view = this.r.P;
        if (view == null) {
            return;
        }
        this.A.a(view);
    }

    @dzsi
    private final GmmRecyclerView Y() {
        View view = this.r.P;
        dbsk.s(view);
        return (GmmRecyclerView) cqhu.a(view, o().booleanValue() ? aysy.c : aysy.b);
    }

    private final void Z() {
        ayyi L;
        this.k.clear();
        this.k.addAll(this.u.a(this.i));
        this.E.clear();
        for (baal baalVar : this.k) {
            if (baalVar.z() != null) {
                Map<azxb, bwrs<ilo>> map = this.E;
                azxb a = baalVar.a();
                ily ilyVar = new ily();
                ilyVar.j(baalVar.a().a());
                map.put(a, bwrs.a(ilyVar.d()));
            }
        }
        if (!K().booleanValue() || (L = L()) == null) {
            return;
        }
        L.d(this.E.values());
    }

    private final baac aa() {
        if (this.m) {
            return w().k();
        }
        return this.i.t();
    }

    @Override // defpackage.ayvf
    public void A(bdhk bdhkVar) {
        if (this.a.z(bdgy.class) != null) {
            this.a.g().f();
        }
        bdhg b = bdhkVar.b();
        dbsk.s(b);
        baal d = this.i.d(azxb.f(akqi.b(b.a()), null));
        if (d != null) {
            d.i((dwfl) dcft.r(bdhkVar.d(), null));
            this.p |= d.k();
        }
        cqkx.p(this);
    }

    @Override // defpackage.ayvf
    public cqqw B() {
        return this.C;
    }

    @Override // defpackage.ayvf
    public fzh C() {
        return this;
    }

    @Override // defpackage.ayvf
    public Boolean D() {
        boolean z = false;
        if (this.i.W() && H().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayvf
    @dzsi
    public CompoundButton.OnCheckedChangeListener E() {
        return new CompoundButton.OnCheckedChangeListener(this) { // from class: ayvo
            private final aywb a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                aywb aywbVar = this.a;
                aywbVar.f.i(cjqg.a(z, cjtd.a(dtxo.K)));
                aywbVar.i.K(z);
                if (z) {
                    for (int i = 0; i < aywbVar.k.size(); i++) {
                        aywbVar.k.get(i).n(i);
                    }
                }
                cqkx.p(aywbVar);
                aywbVar.p = true;
            }
        };
    }

    @Override // defpackage.ayvf
    public Boolean F() {
        return Boolean.valueOf(!this.i.s());
    }

    @Override // defpackage.ayvf
    public Boolean G() {
        return Boolean.valueOf(!this.i.s());
    }

    @Override // defpackage.ayvf
    public Boolean H() {
        return true;
    }

    @Override // defpackage.ayvf
    public ayvg I() {
        if (this.J == null) {
            ayvj ayvjVar = this.w;
            baad baadVar = this.i;
            Activity activity = (Activity) ((dxjd) ayvjVar.a).a;
            ayvj.a(activity, 1);
            cqhn a = ayvjVar.b.a();
            ayvj.a(a, 2);
            cklf a2 = ayvjVar.c.a();
            ayvj.a(a2, 3);
            ayvj.a(baadVar, 4);
            ayvj.a(this, 5);
            this.J = new ayvi(activity, a, a2, baadVar, this);
            this.C = new jmk(this.d, this.J);
        }
        ayvi ayviVar = this.J;
        dbsk.s(ayviVar);
        return ayviVar;
    }

    @Override // defpackage.ayvf
    public Boolean J() {
        boolean z = false;
        if (this.i.r() && aa() == baac.PUBLISHED) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayvf
    public Boolean K() {
        return Boolean.valueOf(this.z.b());
    }

    @Override // defpackage.ayvf
    @dzsi
    public ayyi L() {
        return this.D;
    }

    @Override // defpackage.ayvf
    public Boolean M() {
        boolean z = false;
        if (J().booleanValue() && ((ayvi) I()).m().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayvf
    public cqkl N() {
        ayvi ayviVar;
        if (M().booleanValue() && (ayviVar = this.J) != null) {
            ayviVar.l();
            GmmRecyclerView Y = Y();
            if (Y != null) {
                Y.l(0);
            }
            cqkx.p(this);
        }
        return cqkl.a;
    }

    public final void O() {
        boolean z = false;
        if (!dbra.b.s(this.n).isEmpty() && !this.G) {
            z = true;
        }
        if (this.F != z) {
            this.F = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.ayvf
    /* renamed from: P */
    public aydt w() {
        if (this.I == null) {
            aydu ayduVar = this.v;
            aydg aydgVar = new aydg(this) { // from class: ayvu
                private final aywb a;

                {
                    this.a = this;
                }

                @Override // defpackage.aydg
                public final void a() {
                    cqkx.p(this.a);
                }
            };
            axwg a = ayduVar.a.a();
            aydu.a(a, 1);
            aydr a2 = ayduVar.b.a();
            aydu.a(a2, 2);
            this.I = new aydt(a, a2, aydgVar, 0);
        }
        aydt aydtVar = this.I;
        dbsk.s(aydtVar);
        return aydtVar;
    }

    public final synchronized void Q() {
        if (p().booleanValue()) {
            final baac aa = aa();
            if (aa != baac.PRIVATE && !this.x.e()) {
                return;
            }
            if (this.i.r()) {
                this.i.F(this.n);
                this.i.H(this.o);
            }
            deha.q(deew.h(deew.g(deew.h(degp.q(this.b.j(this.i)), new dbrn(this) { // from class: ayvv
                private final aywb a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    aywb aywbVar = this.a;
                    baad baadVar = (baad) obj;
                    if (aywbVar.m) {
                        aywbVar.R(true);
                    }
                    return baadVar;
                }
            }, this.s.h()), new defg(this, aa) { // from class: ayvw
                private final aywb a;
                private final baac b;

                {
                    this.a = this;
                    this.b = aa;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    aywb aywbVar = this.a;
                    baac baacVar = this.b;
                    baad baadVar = (baad) obj;
                    if (!aywbVar.m || baacVar == baac.PRIVATE) {
                        return deha.a(baadVar);
                    }
                    return aywbVar.b.l(baadVar, baacVar);
                }
            }, this.y), new dbrn(this) { // from class: ayvx
                private final aywb a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    aywb aywbVar = this.a;
                    baad baadVar = (baad) obj;
                    if (aywbVar.m) {
                        aywbVar.R(false);
                        gfq.l(aywbVar.h);
                        aywbVar.e.a().i(baadVar);
                    }
                    return baadVar;
                }
            }, this.s.h()), new aywa(this), this.s.h());
            return;
        }
        this.a.g().f();
    }

    @Override // defpackage.egq
    public void Qs(egu eguVar) {
        X();
    }

    public final void R(boolean z) {
        this.G = z;
        O();
        cqkx.p(this);
    }

    public void S(ayve ayveVar) {
        baal r = ((ayvk) ayveVar).r();
        if (r != null && this.i.e(r)) {
            this.p = true;
        }
        Z();
        cqkx.p(this);
    }

    public final void T() {
        dcdc<baal> i = this.i.i();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.k);
        int size = i.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (!arrayList.contains(i.get(i2))) {
                this.p = true;
                V();
                return;
            }
            i2 = i3;
        }
    }

    final int U(int i) {
        if (m().booleanValue()) {
            i--;
        }
        if (x().booleanValue()) {
            i--;
        }
        if (J().booleanValue()) {
            i--;
        }
        return i - 1;
    }

    @Override // defpackage.fzh
    public void b(int i) {
    }

    @Override // defpackage.fzh
    public boolean c(int i, int i2) {
        int U = U(i);
        int U2 = U(i2);
        if (U == U2 || U < 0 || U >= this.k.size() || U2 < 0 || U2 >= this.k.size()) {
            return false;
        }
        this.k.get(U).n(U2);
        this.k.get(U2).n(U);
        Collections.swap(this.k, U, U2);
        cqkx.p(this);
        this.p = true;
        return true;
    }

    @Override // defpackage.fzh
    public void d(View view, int i, int i2, @dzsi cjqm cjqmVar) {
        if (i2 == -1) {
            return;
        }
        int U = U(i);
        int U2 = U(i2);
        if (U2 >= this.k.size()) {
            U2 = this.k.size() - 1;
        }
        if (U2 < 0) {
            U2 = 0;
        }
        if (U < U2) {
            this.A.f(view, this.a.getString(R.string.ACCESSIBILITY_CUSTOM_ORDERING_MOVED_ITEM_AFTER, new Object[]{W(this.k.get(U2)), W(this.k.get(U2 - 1))}));
        } else if (U <= U2) {
        } else {
            this.A.f(view, this.a.getString(R.string.ACCESSIBILITY_CUSTOM_ORDERING_MOVED_ITEM_BEFORE, new Object[]{W(this.k.get(U2)), W(this.k.get(U2 + 1))}));
        }
    }

    @Override // defpackage.ayfi
    public void e(ayfk ayfkVar) {
        cqkx.p(this);
    }

    @Override // defpackage.ayfi
    public void f(ayfk ayfkVar) {
        cqkx.p(this);
        X();
    }

    @Override // defpackage.ayfi
    public void g(ayfk ayfkVar) {
    }

    @Override // defpackage.ayvf
    public void h() {
        ddho ddhoVar;
        if (this.H || this.D != null) {
            return;
        }
        this.H = true;
        if (!K().booleanValue()) {
            return;
        }
        ayyq ayyqVar = this.K;
        bvqg bvqgVar = new bvqg(this) { // from class: ayvy
            private final aywb a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                aywb aywbVar = this.a;
                baal d = aywbVar.b.d(aywbVar.i, (ilo) obj);
                aywbVar.i.b(d);
                aywbVar.p = true;
                aywbVar.j = d;
                aywbVar.T();
            }
        };
        if (this.i.t() == baac.PUBLISHED) {
            ddhoVar = dtxo.C;
        } else {
            baaj baajVar = baaj.PLACE;
            baab baabVar = baab.FAVORITES;
            int ordinal = this.i.o().ordinal();
            if (ordinal == 0) {
                ddhoVar = dtxo.A;
            } else if (ordinal == 1) {
                ddhoVar = dtxo.G;
            } else if (ordinal != 5) {
                String valueOf = String.valueOf(this.i.o());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Unsupported list type ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else {
                ddhoVar = dtxo.y;
            }
        }
        ayyi a = ayyqVar.a(bvqgVar, cjtd.a(ddhoVar));
        this.D = a;
        a.a();
        if (!this.E.isEmpty()) {
            this.D.c(this.E.values());
        }
        cqkx.p(this);
    }

    @Override // defpackage.ayvf
    public void i() {
        if (!this.H) {
            return;
        }
        ayyi ayyiVar = this.D;
        if (ayyiVar != null) {
            ayyiVar.b();
        }
        this.H = false;
    }

    @Override // defpackage.ayvf
    public String j() {
        return this.n;
    }

    @Override // defpackage.ayvf
    public String k() {
        return this.o;
    }

    @Override // defpackage.ayvf
    public String l() {
        return this.a.getString(R.string.EDIT_LIST_DESCRIPTION_HINT);
    }

    @Override // defpackage.ayvf
    public Boolean m() {
        return Boolean.valueOf(this.i.r());
    }

    @Override // defpackage.ayvf
    public Boolean n() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.ayvf
    public Boolean o() {
        return true;
    }

    @Override // defpackage.ayvf
    public Boolean p() {
        boolean z = true;
        if (this.n.equals(this.i.E(this.a.getApplicationContext())) && this.o.equals(this.i.G()) && !this.p) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayvf
    public Boolean q() {
        return this.d.c();
    }

    @Override // defpackage.ayvf
    public Boolean r() {
        return Boolean.valueOf(this.G);
    }

    @Override // defpackage.ayvf
    public cqgl s() {
        return new cqgl(this) { // from class: ayvm
            private final aywb a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                aywb aywbVar = this.a;
                dbsk.l(aywbVar.i.r());
                String charSequence2 = charSequence.toString();
                if (!charSequence2.equals(aywbVar.n)) {
                    aywbVar.n = charSequence2;
                }
                aywbVar.O();
            }
        };
    }

    @Override // defpackage.ayvf
    public cqgl t() {
        return new cqgl(this) { // from class: ayvr
            private final aywb a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                aywb aywbVar = this.a;
                dbsk.l(aywbVar.i.r());
                String charSequence2 = charSequence.toString();
                if (!charSequence2.equals(aywbVar.o)) {
                    aywbVar.o = charSequence2;
                    cqkx.p(aywbVar);
                }
            }
        };
    }

    @Override // defpackage.ayvf
    public List<ayve> u() {
        T();
        return dcbg.b(this.k).o(new dbsl(this) { // from class: ayvz
            private final aywb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.d.d((baal) obj);
            }
        }).s(new dbrn(this) { // from class: ayvn
            private final aywb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                azxb f;
                ayfb f2;
                aywb aywbVar = this.a;
                baal baalVar = (baal) obj;
                baaj baajVar = baaj.PLACE;
                baab baabVar = baab.FAVORITES;
                baac baacVar = baac.PRIVATE;
                int ordinal = baalVar.x().ordinal();
                if (ordinal == 0) {
                    baak z = baalVar.z();
                    dbsk.s(z);
                    akqi a = z.a();
                    baak z2 = baalVar.z();
                    dbsk.s(z2);
                    f = azxb.f(a, z2.b());
                    f2 = aywbVar.d.f(a);
                } else if (ordinal == 1) {
                    baai A = baalVar.A();
                    dbsk.s(A);
                    String a2 = A.a();
                    baai A2 = baalVar.A();
                    dbsk.s(A2);
                    f = azxb.g(a2, A2.b());
                    f2 = aywbVar.d.g(a2);
                } else {
                    String valueOf = String.valueOf(baalVar.x());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Item type not supported: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                ayfb ayfbVar = f2;
                azxb azxbVar = f;
                ayve ayveVar = aywbVar.l.get(azxbVar);
                if (ayveVar == null) {
                    ayvl ayvlVar = aywbVar.c;
                    gga a3 = ayvlVar.a.a();
                    ayvl.a(a3, 1);
                    fd fdVar = (fd) ((dxjd) ayvlVar.b).a;
                    ayvl.a(fdVar, 2);
                    ahjq a4 = ayvlVar.c.a();
                    ayvl.a(a4, 3);
                    bvsl a5 = ayvlVar.d.a();
                    ayvl.a(a5, 4);
                    aydo a6 = ayvlVar.e.a();
                    ayvl.a(a6, 5);
                    aybq a7 = ayvlVar.f.a();
                    ayvl.a(a7, 6);
                    aywv a8 = ayvlVar.g.a();
                    ayvl.a(a8, 7);
                    ayvl.a(baalVar, 8);
                    ayvl.a(aywbVar, 10);
                    ayvk ayvkVar = new ayvk(a3, fdVar, a4, a5, a6, a7, a8, baalVar, ayfbVar, aywbVar);
                    aywbVar.l.put(azxbVar, ayvkVar);
                    return ayvkVar;
                }
                return ayveVar;
            }
        }).z();
    }

    @Override // defpackage.ayvf
    public jib v() {
        ddho ddhoVar;
        String format;
        jhm a = jhm.a();
        a.d(new View.OnClickListener(this) { // from class: ayvs
            private final aywb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.Q();
            }
        });
        a.h = 1;
        a.b = this.a.getString(R.string.SAVE);
        a.a = this.a.getString(R.string.SAVE);
        a.n = this.F;
        if (this.i.ab()) {
            baac k = w().k();
            baaj baajVar = baaj.PLACE;
            baab baabVar = baab.FAVORITES;
            baac baacVar = baac.PRIVATE;
            int ordinal = k.ordinal();
            if (ordinal != 1) {
                ddhoVar = ordinal != 2 ? dtyb.g : dtyb.h;
            } else {
                ddhoVar = dtyb.i;
            }
        } else {
            ddhoVar = this.i.t() == baac.PUBLISHED ? dtxo.W : dtxo.T;
        }
        a.f = cjtd.a(ddhoVar);
        jhz a2 = jhz.a();
        if (this.m) {
            format = this.a.getString(R.string.CREATE_NEW_LIST);
        } else if (this.i.r()) {
            format = this.a.getString(R.string.EDIT_LIST);
        } else {
            format = String.format(this.a.getString(R.string.EDIT_BUILT_IN_LIST_TOOLBAR_TITLE), this.i.E(this.a.getApplicationContext()));
        }
        a2.a = format;
        a2.b = this.B.a(this.i, ibm.n(), false);
        a2.x = false;
        a2.f(new View.OnClickListener(this) { // from class: ayvt
            private final aywb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.onBackPressed();
            }
        });
        a2.c(a.c());
        return a2.b();
    }

    @Override // defpackage.ayvf
    public Boolean x() {
        return n();
    }

    @Override // defpackage.ayvf
    public jar y() {
        ddho ddhoVar;
        axyr axyrVar = this.t;
        baad baadVar = this.i;
        if (baadVar.t() == baac.PUBLISHED) {
            ddhoVar = dtxo.D;
        } else {
            baaj baajVar = baaj.PLACE;
            baab baabVar = baab.FAVORITES;
            int ordinal = this.i.o().ordinal();
            if (ordinal == 0) {
                ddhoVar = dtxo.B;
            } else if (ordinal == 1) {
                ddhoVar = dtxo.H;
            } else if (ordinal != 5) {
                String valueOf = String.valueOf(this.i.o());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Unsupported list type ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else {
                ddhoVar = dtxo.z;
            }
        }
        return axyrVar.a(baadVar, cjtd.a(ddhoVar));
    }

    @Override // defpackage.ayvf
    public void z(azrk azrkVar) {
    }
}
