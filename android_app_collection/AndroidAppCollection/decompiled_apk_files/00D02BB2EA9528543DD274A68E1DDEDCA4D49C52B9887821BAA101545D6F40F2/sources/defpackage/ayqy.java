package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayqy  reason: default package */
/* loaded from: classes3.dex */
public class ayqy implements aymt, ayfi {
    public final ayfk a;
    public final ayng b;
    private final gga c;
    private final aybl d;
    private final jkf e;
    private final ayqb f;
    private final dzsj<ayfn> g;
    private final axwg h;
    private final List<azxk> i;
    private final ayms j;
    @dzsi
    private jmk k;

    public ayqy(gga ggaVar, ayfl ayflVar, aynh aynhVar, aybl ayblVar, jkf jkfVar, ayqc ayqcVar, ayqu ayquVar, dzsj<ayfn> dzsjVar, axwg axwgVar) {
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.c = ggaVar;
        this.b = aynhVar.a(this);
        this.d = ayblVar;
        this.e = jkfVar;
        this.g = dzsjVar;
        this.h = axwgVar;
        ayfk a = ayflVar.a(null, this);
        this.a = a;
        this.f = ayqcVar.a(null, a);
        gga a2 = ayquVar.a.a();
        ayqu.a(a2, 1);
        aymh a3 = ayquVar.b.a();
        ayqu.a(a3, 2);
        ayak a4 = ayquVar.c.a();
        ayqu.a(a4, 3);
        ayqu.a(arrayList, 4);
        this.j = new ayqt(a2, a3, a4, arrayList);
    }

    @Override // defpackage.aymt
    public String a() {
        return this.c.getString(R.string.STARRED_PLACES_BUILT_IN_LIST_TITLE);
    }

    @Override // defpackage.aymt
    public List<aymp> b() {
        dcbg b = dcbg.b(this.i);
        final ayfk ayfkVar = this.a;
        ayfkVar.getClass();
        return b.o(new dbsl(ayfkVar) { // from class: ayqv
            private final ayfk a;

            {
                this.a = ayfkVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.e((azxk) obj);
            }
        }).s(new dbrn(this) { // from class: ayqw
            private final ayqy a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ayfb ayfbVar;
                ayqy ayqyVar = this.a;
                azxk azxkVar = (azxk) obj;
                if (akqi.d(azxkVar.b())) {
                    ayfk ayfkVar2 = ayqyVar.a;
                    akqi b2 = azxkVar.b();
                    dbsk.s(b2);
                    ayfbVar = ayfkVar2.f(b2);
                } else {
                    ayfbVar = null;
                }
                ayng ayngVar = ayqyVar.b;
                akqi b3 = azxkVar.b();
                akqq d = azxkVar.d();
                azxb f = azxb.f(b3, d);
                ayqp ayqpVar = ayngVar.b.get(f);
                if (ayqpVar == null) {
                    ayqq ayqqVar = ayngVar.e;
                    dbsk.s(azxkVar);
                    String a = ayngVar.c.a();
                    int intValue = ayngVar.c.d().intValue();
                    bnju a2 = ayfbVar == null ? null : ayfbVar.a();
                    Integer a3 = batx.a(ayngVar.f, d);
                    gga a4 = ayqqVar.a.a();
                    ayqq.a(a4, 1);
                    bwqv a5 = ayqqVar.b.a();
                    ayqq.a(a5, 2);
                    axwy a6 = ayqqVar.c.a();
                    ayqq.a(a6, 3);
                    begg a7 = ayqqVar.d.a();
                    ayqq.a(a7, 4);
                    bvsl a8 = ayqqVar.e.a();
                    ayqq.a(a8, 5);
                    cztz a9 = ayqqVar.f.a();
                    ayqq.a(a9, 6);
                    batm a10 = ayqqVar.g.a();
                    ayqq.a(a10, 7);
                    ayqe a11 = ayqqVar.h.a();
                    ayqq.a(a11, 8);
                    ayrc a12 = ayqqVar.i.a();
                    ayqq.a(a12, 9);
                    axwg a13 = ayqqVar.j.a();
                    ayqq.a(a13, 10);
                    batz a14 = ayqqVar.k.a();
                    ayqq.a(a14, 11);
                    dxio a15 = ((dxjh) ayqqVar.l).a();
                    ayqq.a(a15, 12);
                    isd a16 = ayqqVar.m.a();
                    ayqq.a(a16, 13);
                    ayqq.a(azxkVar, 14);
                    ayqq.a(a, 15);
                    ayqp ayqpVar2 = new ayqp(a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, azxkVar, a, intValue, a2, a3);
                    ayngVar.b.put(f, ayqpVar2);
                    return ayqpVar2;
                }
                return ayqpVar;
            }
        }).z();
    }

    @Override // defpackage.aymt
    public Boolean c() {
        return this.a.c();
    }

    @Override // defpackage.aymt
    public Integer d() {
        return Integer.valueOf(this.i.size());
    }

    @Override // defpackage.ayfi
    public void e(ayfk ayfkVar) {
        n();
    }

    @Override // defpackage.ayfi
    public void f(ayfk ayfkVar) {
        n();
        if (this.h.c()) {
            this.g.a().d(this);
        }
    }

    @Override // defpackage.ayfi
    public void g(ayfk ayfkVar) {
    }

    @Override // defpackage.aymt
    public drcs h() {
        return drcs.PRIVATE;
    }

    @Override // defpackage.aymt
    public cqqw i() {
        if (!this.h.c()) {
            return this.a;
        }
        if (this.k == null) {
            this.k = new jmk(this.a, this.g.a());
        }
        return this.k;
    }

    @Override // defpackage.aymt
    public void j() {
        k();
        this.f.t(dcbg.b(this.i).s(ayqx.a).z());
    }

    @Override // defpackage.aymt
    public void k() {
        this.a.l(this.i);
    }

    @Override // defpackage.aymt
    public void l() {
    }

    @Override // defpackage.aymt
    public void m() {
        this.a.j();
    }

    @Override // defpackage.aymt
    public void n() {
        cqkx.p(this);
    }

    @Override // defpackage.aymt
    public bfkk o() {
        return this.f;
    }

    @Override // defpackage.aymt
    public cqkl p() {
        if (this.h.c()) {
            this.g.a().e();
        } else {
            this.e.setExpandingStateTransition(jkc.d, jkc.j, true);
            this.e.B(jjn.HIDDEN);
        }
        return cqkl.a;
    }

    @Override // defpackage.aymt
    public ayms q() {
        return this.j;
    }

    @Override // defpackage.aymt
    public void r(bdhk bdhkVar) {
    }

    @Override // defpackage.aymt
    public Boolean s() {
        return false;
    }

    @Override // defpackage.aymt
    @dzsi
    public aymv t() {
        return null;
    }

    @Override // defpackage.aymt
    public Boolean u() {
        return Boolean.valueOf(this.h.c());
    }

    public void v(List<azxk> list) {
        bvrj.UI_THREAD.c();
        this.i.clear();
        this.i.addAll(this.d.c(list));
        if (this.h.c()) {
            this.g.a().d(this);
        }
        j();
        n();
    }
}
