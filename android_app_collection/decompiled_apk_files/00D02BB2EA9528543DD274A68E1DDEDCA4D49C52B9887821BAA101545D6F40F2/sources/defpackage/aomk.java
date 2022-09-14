package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aomk  reason: default package */
/* loaded from: classes2.dex */
public class aomk implements aomh {
    private static final dcqe d = dcqe.c("aomk");
    public final cjqy c;
    private final aolt e;
    private final aoog f;
    private final apjv g;
    private final angu<aogb, aoge> h;
    private final aobn j;
    private dbsg<aoha> l;
    private final jco k = new aomi(this);
    private final List<aomg> i = dchl.a();
    public final List<aoob> a = dchl.a();
    public int b = 0;

    public aomk(angu<aogb, aoge> anguVar, aoha aohaVar, aolt aoltVar, aobn aobnVar, aoog aoogVar, apjv apjvVar, cjqy cjqyVar) {
        this.e = aoltVar;
        this.f = aoogVar;
        this.g = apjvVar;
        this.h = anguVar;
        this.l = dbsg.i(aohaVar);
        this.c = cjqyVar;
        this.j = aobnVar;
        aobnVar.o(false);
        aobnVar.t(false);
        q();
    }

    private final void q() {
        angs<aoge> angsVar;
        dcdc<aogx> dcdcVar;
        int i;
        int i2;
        angs<aoge> angsVar2;
        dcdc<aogx> dcdcVar2;
        int i3;
        int i4;
        dcdc<dvay> dcdcVar3;
        dpop dpopVar;
        int i5;
        int i6;
        this.a.clear();
        angs<aoge> b = this.h.b();
        if (b.e()) {
            int i7 = 1;
            boolean z = b.b() == angr.PENDING_DIRTY_OR_ABSENT_DATA;
            dcdc<aogx> d2 = b.f().d();
            int size = d2.size();
            int i8 = 0;
            while (i8 < size) {
                aogx aogxVar = d2.get(i8);
                if (aogxVar instanceof aohc) {
                    dpop d3 = ((aohc) aogxVar).d();
                    dcdc<dvay> a = aogxVar.a();
                    int size2 = a.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        dvay dvayVar = a.get(i9);
                        dvax b2 = dvax.b(dvayVar.m);
                        if (b2 == null) {
                            b2 = dvax.UNKNOWN;
                        }
                        if (b2 == dvax.ACTIVITY) {
                            List<aoob> list = this.a;
                            aoge f = b.f();
                            aolt aoltVar = this.e;
                            aolt.a(dvayVar, i7);
                            aolt.a(d3, 2);
                            aolt.a(f, 3);
                            anpb a2 = aoltVar.a.a();
                            dcdcVar2 = d2;
                            aolt.a(a2, 5);
                            fd fdVar = (fd) ((dxjd) aoltVar.b).a;
                            aolt.a(fdVar, 6);
                            jkf a3 = aoltVar.c.a();
                            aolt.a(a3, 7);
                            anri a4 = aoltVar.d.a();
                            aolt.a(a4, 8);
                            aoiq a5 = aoltVar.e.a();
                            aolt.a(a5, 9);
                            gga a6 = aoltVar.f.a();
                            aolt.a(a6, 10);
                            cqhn a7 = aoltVar.g.a();
                            aolt.a(a7, 11);
                            angsVar2 = b;
                            i3 = i9;
                            i4 = size2;
                            dcdcVar3 = a;
                            dpopVar = d3;
                            i5 = i8;
                            i6 = size;
                            list.add(new aols(dvayVar, d3, f, z, a2, fdVar, a3, a4, a5, a6, a7));
                        } else {
                            angsVar2 = b;
                            dcdcVar2 = d2;
                            i3 = i9;
                            i4 = size2;
                            dcdcVar3 = a;
                            dpopVar = d3;
                            i5 = i8;
                            i6 = size;
                            dvax b3 = dvax.b(dvayVar.m);
                            if (b3 == null) {
                                b3 = dvax.UNKNOWN;
                            }
                            if (b3 == dvax.STOP) {
                                this.a.add(t(dvayVar, angsVar2.f(), z));
                            }
                        }
                        i9 = i3 + 1;
                        d3 = dpopVar;
                        a = dcdcVar3;
                        d2 = dcdcVar2;
                        i8 = i5;
                        b = angsVar2;
                        size2 = i4;
                        size = i6;
                        i7 = 1;
                    }
                    angsVar = b;
                    dcdcVar = d2;
                    i = i8;
                    i2 = size;
                } else {
                    angsVar = b;
                    dcdcVar = d2;
                    i = i8;
                    i2 = size;
                    dcdc<dvay> a8 = aogxVar.a();
                    int size3 = a8.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        dvay dvayVar2 = a8.get(i10);
                        dvax b4 = dvax.b(dvayVar2.m);
                        if (b4 == null) {
                            b4 = dvax.UNKNOWN;
                        }
                        if (b4 == dvax.STOP) {
                            this.a.add(t(dvayVar2, angsVar.f(), z));
                        }
                    }
                }
                i8 = i + 1;
                d2 = dcdcVar;
                b = angsVar;
                size = i2;
                i7 = 1;
            }
        }
        r();
    }

    private final void r() {
        int n;
        if (!h().booleanValue()) {
            return;
        }
        if (!this.l.a() || (n = dcft.n(this.a, aoob.u(this.l.b()))) < 0) {
            o(akn.b(this.b, 0, this.a.size() - 1));
        } else {
            s(n, this.l);
        }
    }

    private final void s(int i, dbsg<aoha> dbsgVar) {
        this.b = i;
        this.l = dbsgVar;
        aobn aobnVar = this.j;
        dccx F = dcdc.F();
        if (p()) {
            F.g(this.g.d(new aomj(this)));
        }
        aobnVar.n(F.f());
        for (aomg aomgVar : this.i) {
            aomgVar.a(this);
        }
    }

    private final aoof t(dvay dvayVar, aoge aogeVar, boolean z) {
        aoog aoogVar = this.f;
        aoog.a(dvayVar, 1);
        aoog.a(aogeVar, 2);
        jkf a = aoogVar.a.a();
        aoog.a(a, 4);
        anri a2 = aoogVar.b.a();
        aoog.a(a2, 5);
        anrz a3 = aoogVar.c.a();
        aoog.a(a3, 6);
        aoiq a4 = aoogVar.d.a();
        aoog.a(a4, 7);
        fd fdVar = (fd) ((dxjd) aoogVar.e).a;
        aoog.a(fdVar, 8);
        gga a5 = aoogVar.f.a();
        aoog.a(a5, 9);
        bwqv a6 = aoogVar.g.a();
        aoog.a(a6, 10);
        cqhn a7 = aoogVar.h.a();
        aoog.a(a7, 11);
        return new aoof(dvayVar, aogeVar, z, a, a2, a3, a4, fdVar, a5, a6, a7);
    }

    @Override // defpackage.anrs
    public aogb a() {
        return this.h.a();
    }

    @Override // defpackage.anha
    public aogm b() {
        dbsg<aoob> k = k();
        if (k.a()) {
            return k.b().b();
        }
        aogh i = aogm.i();
        i.g(true);
        return i.a();
    }

    @Override // defpackage.aomh
    public List<aony> d() {
        return dcdc.r(this.a);
    }

    @Override // defpackage.aomh
    public Integer e() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.aomh
    public jco f() {
        return this.k;
    }

    @Override // defpackage.aomh
    public void g() {
        if (h().booleanValue()) {
            q();
            aobn aobnVar = this.j;
            if (aobnVar != null) {
                aobnVar.m(this.h);
            }
            cqkx.p(this);
        }
    }

    @Override // defpackage.aomh
    public Boolean h() {
        return Boolean.valueOf(this.h.b().e());
    }

    @Override // defpackage.aomh
    /* renamed from: i */
    public aobn c() {
        return this.j;
    }

    public dbsg<aoha> j() {
        return this.l;
    }

    public dbsg<aoob> k() {
        return (!h().booleanValue() || this.a.isEmpty()) ? dbpy.a : dbsg.i(this.a.get(e().intValue()));
    }

    public void l(aomg aomgVar) {
        List<aomg> list = this.i;
        dbsk.s(aomgVar);
        list.add(aomgVar);
    }

    public void m(aomg aomgVar) {
        this.i.remove(aomgVar);
    }

    public void n(aoha aohaVar) {
        if (!a().equals(aohaVar.a())) {
            bvoo.h("Cannot switch to a segment on a different day", new Object[0]);
            return;
        }
        this.l = dbsg.i(aohaVar);
        r();
        cqkx.p(this);
    }

    public final void o(int i) {
        if (this.a.isEmpty()) {
            s(0, dbpy.a);
        } else {
            s(i, dbsg.i(this.a.get(i).s()));
        }
    }

    public final boolean p() {
        dbsg<aoob> k = k();
        return k.a() && (k.b() instanceof aoof);
    }
}
