package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aywl  reason: default package */
/* loaded from: classes3.dex */
public class aywl implements ayvf, ayfi {
    private static final dcqe e = dcqe.c("aywl");
    public final gga a;
    public final aywe b;
    public final ayfk c;
    private final dzsj<axwy> f;
    private final axyr g;
    private final aybl h;
    private final axxb i;
    private final axwg j;
    private final aymh k;
    private List<azxk> m;
    private final ayyq q;
    @dzsi
    private ayyi l = null;
    public final Map<azxb, aywd> d = new HashMap();
    private final HashMap<azxk, ilo> n = new HashMap<>();
    private final List<azxk> o = new ArrayList();
    private boolean p = false;

    public aywl(dzsj dzsjVar, gga ggaVar, axwq axwqVar, axxb axxbVar, aywe ayweVar, axyr axyrVar, aybl ayblVar, ayfl ayflVar, axwg axwgVar, ayyq ayyqVar, aymh aymhVar) {
        this.m = dcdc.e();
        this.f = dzsjVar;
        this.a = ggaVar;
        this.b = ayweVar;
        this.g = axyrVar;
        this.h = ayblVar;
        this.i = axxbVar;
        this.c = ayflVar.a(null, this);
        this.j = axwgVar;
        this.q = ayyqVar;
        this.k = aymhVar;
        try {
            this.m = ayblVar.c(axwqVar.g(azxm.e));
        } catch (axxc unused) {
            this.m = dcdc.e();
        }
        this.c.l(this.m);
    }

    private final List<bwrs<ilo>> O() {
        ArrayList arrayList = new ArrayList();
        for (azxk azxkVar : this.m) {
            arrayList.add(bwrs.a(P(azxkVar)));
        }
        return arrayList;
    }

    @dzsi
    private static ilo P(azxk azxkVar) {
        ilo a = batz.a(azxkVar.c(), azxkVar.b(), azxkVar.d());
        if (a != null) {
            ily g = a.g();
            g.C(true);
            return g.d();
        }
        return null;
    }

    @Override // defpackage.ayvf
    public void A(bdhk bdhkVar) {
    }

    @Override // defpackage.ayvf
    public cqqw B() {
        return this.c;
    }

    @Override // defpackage.ayvf
    @dzsi
    public fzh C() {
        return null;
    }

    @Override // defpackage.ayvf
    public Boolean D() {
        return false;
    }

    @Override // defpackage.ayvf
    @dzsi
    public CompoundButton.OnCheckedChangeListener E() {
        return null;
    }

    @Override // defpackage.ayvf
    public Boolean F() {
        return true;
    }

    @Override // defpackage.ayvf
    public Boolean G() {
        return true;
    }

    @Override // defpackage.ayvf
    public Boolean H() {
        return true;
    }

    @Override // defpackage.ayvf
    public ayvg I() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ayvf
    public Boolean J() {
        return false;
    }

    @Override // defpackage.ayvf
    public Boolean K() {
        return Boolean.valueOf(this.j.b());
    }

    @Override // defpackage.ayvf
    @dzsi
    public ayyi L() {
        return this.l;
    }

    @Override // defpackage.ayvf
    public Boolean M() {
        return false;
    }

    @Override // defpackage.ayvf
    public cqkl N() {
        return cqkl.a;
    }

    @Override // defpackage.egq
    public void Qs(egu eguVar) {
    }

    public void b() {
        for (ilo iloVar : this.n.values()) {
            this.f.a().f(bwrs.a(iloVar));
        }
        for (azxk azxkVar : this.o) {
            this.f.a().f(bwrs.a(P(azxkVar)));
        }
        this.a.g().f();
    }

    public void c(ayve ayveVar) {
        azxk azxkVar = ((aywd) ayveVar).a;
        if (this.n.containsKey(azxkVar)) {
            this.n.remove(azxkVar);
        } else {
            this.o.add(azxkVar);
        }
        ArrayList arrayList = new ArrayList(this.m);
        arrayList.remove(azxkVar);
        this.m = dcdc.r(arrayList);
        ayyi ayyiVar = this.l;
        if (ayyiVar != null) {
            ayyiVar.d(O());
        }
        cqkx.p(this);
    }

    public final void d(ilo iloVar) {
        try {
            azxk b = this.i.b(iloVar);
            aywk aywkVar = new aywk(b);
            if (dcft.m(this.m, aywkVar).a()) {
                return;
            }
            int n = dcft.n(this.o, aywkVar);
            if (n >= 0) {
                this.o.remove(n);
            } else {
                this.n.put(b, iloVar);
            }
            ArrayList arrayList = new ArrayList(this.m);
            int binarySearch = Collections.binarySearch(arrayList, b, this.h.d());
            if (binarySearch < 0) {
                arrayList.add(-(binarySearch + 1), b);
                dcdc r = dcdc.r(arrayList);
                this.m = r;
                this.c.l(r);
            }
            ayyi ayyiVar = this.l;
            if (ayyiVar != null) {
                ayyiVar.d(O());
            }
            cqkx.p(this);
        } catch (IllegalArgumentException e2) {
            bvoo.h("Unable add starred place to list. %s", e2);
        }
    }

    @Override // defpackage.ayfi
    public void e(ayfk ayfkVar) {
        cqkx.p(this);
    }

    @Override // defpackage.ayfi
    public void f(ayfk ayfkVar) {
        cqkx.p(this);
    }

    @Override // defpackage.ayfi
    public void g(ayfk ayfkVar) {
    }

    @Override // defpackage.ayvf
    public void h() {
        if (this.p) {
            return;
        }
        this.p = true;
        if (!K().booleanValue()) {
            return;
        }
        ayyi a = this.q.a(new bvqg(this) { // from class: aywh
            private final aywl a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.d((ilo) obj);
            }
        }, cjtd.a(dtxo.E));
        this.l = a;
        a.a();
        List<bwrs<ilo>> O = O();
        if (!O.isEmpty()) {
            ayyi ayyiVar = this.l;
            dbsk.s(ayyiVar);
            ayyiVar.c(O);
        }
        cqkx.p(this);
    }

    @Override // defpackage.ayvf
    public void i() {
        if (!this.p) {
            return;
        }
        ayyi ayyiVar = this.l;
        if (ayyiVar != null) {
            ayyiVar.b();
        }
        this.p = false;
    }

    @Override // defpackage.ayvf
    public String j() {
        return this.a.getString(R.string.STARRED_PLACES_BUILT_IN_LIST_TITLE);
    }

    @Override // defpackage.ayvf
    public String k() {
        throw new IllegalStateException("Starred Places list does not have description.");
    }

    @Override // defpackage.ayvf
    public String l() {
        return this.a.getString(R.string.EDIT_LIST_DESCRIPTION_HINT);
    }

    @Override // defpackage.ayvf
    public Boolean m() {
        return false;
    }

    @Override // defpackage.ayvf
    public Boolean n() {
        return false;
    }

    @Override // defpackage.ayvf
    public Boolean o() {
        return false;
    }

    @Override // defpackage.ayvf
    public Boolean p() {
        boolean z = true;
        if (this.o.isEmpty() && this.n.isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayvf
    public Boolean q() {
        return this.c.c();
    }

    @Override // defpackage.ayvf
    public Boolean r() {
        return false;
    }

    @Override // defpackage.ayvf
    public cqgl s() {
        throw new IllegalStateException("Starred Places list does not support editing name.");
    }

    @Override // defpackage.ayvf
    public cqgl t() {
        throw new IllegalStateException("Starred Places list does not support editing description.");
    }

    @Override // defpackage.ayvf
    public List<ayve> u() {
        return dcbg.b(this.m).o(new dbsl(this) { // from class: aywi
            private final aywl a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.c.e((azxk) obj);
            }
        }).s(new dbrn(this) { // from class: aywj
            private final aywl a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                aywl aywlVar = this.a;
                azxk azxkVar = (azxk) obj;
                bnju h = aywlVar.c.h(azxkVar.b());
                azxb f = azxb.f(azxkVar.b(), azxkVar.d());
                aywd aywdVar = aywlVar.d.get(f);
                if (aywdVar == null) {
                    aywe ayweVar = aywlVar.b;
                    gga a = ayweVar.a.a();
                    aywe.a(a, 1);
                    ahjq a2 = ayweVar.b.a();
                    aywe.a(a2, 2);
                    bvsl a3 = ayweVar.c.a();
                    aywe.a(a3, 3);
                    aywe.a(azxkVar, 4);
                    aywe.a(aywlVar, 6);
                    aywd aywdVar2 = new aywd(a, a2, a3, azxkVar, h, aywlVar);
                    aywlVar.d.put(f, aywdVar2);
                    return aywdVar2;
                }
                return aywdVar;
            }
        }).z();
    }

    @Override // defpackage.ayvf
    public jib v() {
        jhm a = jhm.a();
        a.d(new View.OnClickListener(this) { // from class: aywf
            private final aywl a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b();
            }
        });
        a.h = 1;
        a.b = this.a.getString(R.string.SAVE);
        a.a = this.a.getString(R.string.SAVE);
        a.n = true;
        a.f = cjtd.a(dtxo.T);
        jhz a2 = jhz.a();
        a2.a = String.format(this.a.getString(R.string.EDIT_BUILT_IN_LIST_TOOLBAR_TITLE), j());
        a2.b = this.k.b(drcs.PRIVATE, ibm.n(), this.m.size());
        a2.f(new View.OnClickListener(this) { // from class: aywg
            private final aywl a;

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
    public aydh w() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ayvf
    public Boolean x() {
        return false;
    }

    @Override // defpackage.ayvf
    public jar y() {
        return this.g.a(null, cjtd.a(dtxo.F));
    }

    @Override // defpackage.ayvf
    public void z(azrk azrkVar) {
        d(azrkVar.a());
    }
}
