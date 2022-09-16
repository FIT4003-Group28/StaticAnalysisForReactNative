package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: beht  reason: default package */
/* loaded from: classes3.dex */
public final class beht implements behx {
    private final dxio<abfa> b;
    private final dxio<behn> c;
    private final dxio<behq> d;
    private final dxio<behs> e;
    private final dxio<behv> f;
    private final dxio<behu> g;
    private iln h = iln.UNRESOLVED;
    private boolean i = false;
    private final List<befz<? extends bega>> a = new ArrayList();

    public beht(dxio<abfa> dxioVar, dxio<behn> dxioVar2, dxio<behq> dxioVar3, dxio<behs> dxioVar4, dxio<behv> dxioVar5, dxio<behu> dxioVar6) {
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = dxioVar4;
        this.g = dxioVar6;
        this.f = dxioVar5;
    }

    @Override // defpackage.behx
    public final List<befz<? extends bega>> a() {
        return dcdc.r(this.a);
    }

    @Override // defpackage.behx
    public final void b(iln ilnVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.h == ilnVar && this.i == z) {
            return;
        }
        this.h = ilnVar;
        this.i = z;
        this.a.clear();
        if (!this.b.a().a() || !z) {
            iln ilnVar2 = iln.GEOCODE;
            int ordinal = ilnVar.ordinal();
            if (ordinal == 0) {
                behs a = this.e.a();
                List<befz<? extends bega>> list = this.a;
                list.add(a.s.a());
                list.add(a.v.a());
                if (!btlu.i(a.E.a().j()).equals(btlt.INCOGNITO)) {
                    list.add(a.g.a());
                }
                list.add(a.B.a().a(dpwr.PLACESHEET_PROMINENT_EVENTS));
                if (a.a.getPlaceSheetParameters().ad()) {
                    list.add(a.D.a().a(behr.a));
                }
                list.add(a.i.a());
                if (a.c.d()) {
                    list.add(a.y.a().a(false));
                }
                bmjb a2 = a.n.a();
                T t = a2.a;
                if (t != 0) {
                    ((bmlb) t).x(true);
                }
                list.add(a2);
                list.add((befz) a.w.a());
                list.add(a.j.a());
                list.add(a.k.a());
                if (a.F.a()) {
                    a.u.a().g(z4);
                    list.add(a.u.a());
                }
                list.add(a.B.a().a(dpwr.PLACESHEET_EVENTS));
                list.add(a.t.a().a(biyb.NON_POI_PLACESHEET));
                list.add(a.h.a());
                list.add(a.o.a());
                if (a.b.a()) {
                    list.add(a.r.a());
                } else {
                    list.add(a.p.a());
                }
                if (a.a.getEnableFeatureParameters().ad) {
                    list.add(a.q.a());
                }
                list.add(a.x.a());
                list.add(a.z.a());
                list.add(a.A.a());
                list.add(a.l.a());
                ((biye) a.m.a().a).i(true);
                list.add(a.m.a());
                list.add(a.f.a());
                list.add(a.d.a());
                if (a.a.getUgcParameters().aU()) {
                    list.add(a.e.a());
                }
                list.add(a.C.a());
                return;
            } else if (ordinal == 7) {
                return;
            } else {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        behu a3 = this.g.a();
                        List<befz<? extends bega>> list2 = this.a;
                        list2.add(a3.a.a());
                        list2.add(a3.b.a());
                        list2.add(a3.c.a());
                        list2.add(a3.d.a());
                        return;
                    }
                    this.c.a().a(this.a, z2, z4, z3);
                    return;
                }
                behv a4 = this.f.a();
                List<befz<? extends bega>> list3 = this.a;
                list3.add(a4.j.a());
                list3.add(a4.n.a());
                if (!btlu.i(a4.w.a().j()).equals(btlt.INCOGNITO)) {
                    list3.add(a4.d.a());
                }
                list3.add(a4.u.a().a(dpwr.PLACESHEET_PROMINENT_EVENTS));
                list3.add((befz) a4.o.a());
                if (a4.x.a()) {
                    a4.i.a().g(z4);
                    list3.add(a4.i.a());
                }
                list3.add(a4.h.a().a(biyb.NON_POI_PLACESHEET));
                if (z3) {
                    list3.add(a4.k.a());
                    list3.add(a4.l.a());
                }
                boolean d = a4.c.d();
                if (d) {
                    list3.add(a4.r.a().a(false));
                } else {
                    list3.add(a4.p.a().a());
                }
                if (a4.b.a()) {
                    list3.add(a4.g.a());
                } else {
                    list3.add(a4.e.a());
                }
                if (a4.a.getEnableFeatureParameters().ad) {
                    list3.add(a4.f.a());
                }
                if (d) {
                    list3.add(a4.p.a().a());
                }
                list3.add(a4.q.a());
                list3.add(a4.s.a());
                list3.add(a4.t.a());
                list3.add(a4.u.a().a(dpwr.PLACESHEET_EVENTS));
                list3.add(a4.m.a());
                list3.add(a4.v.a());
                return;
            }
        }
        behq a5 = this.d.a();
        List<befz<? extends bega>> list4 = this.a;
        if (!a5.b.a().b()) {
            list4.add(a5.c.a());
            list4.add(a5.d.a());
        }
        list4.add((befz) a5.e.a());
        list4.add(a5.a.a());
    }
}
