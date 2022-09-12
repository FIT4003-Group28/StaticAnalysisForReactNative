package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ayfk  reason: default package */
/* loaded from: classes3.dex */
public class ayfk extends cqqw {
    private static final dcdc<baab> q = dcdc.h(baab.CUSTOM, baab.WANT_TO_GO, baab.FAVORITES);
    public final gga a;
    public final ges b;
    public final ahjq c;
    public final ayfc d;
    public final begg e;
    public final bvrb f;
    public final cztz g;
    public final bnjv h;
    public final batz i;
    @dzsi
    public final baad j;
    @dzsi
    public List<azxk> k;
    @dzsi
    public List<baal> l;
    private final btpc m;
    private final btvo n;
    private final btrg o;
    private final Executor p;
    @dzsi
    private final ayfi r;
    private boolean s = false;

    public ayfk(gga ggaVar, fd fdVar, ahjq ahjqVar, dxio<ayfd> dxioVar, btpc btpcVar, begg beggVar, bvrb bvrbVar, cztz cztzVar, bnjv bnjvVar, btvo btvoVar, btrg btrgVar, Executor executor, batz batzVar, @dzsi baad baadVar, @dzsi ayfi ayfiVar) {
        this.a = ggaVar;
        this.b = (ges) fdVar;
        this.c = ahjqVar;
        this.m = btpcVar;
        this.f = bvrbVar;
        this.g = cztzVar;
        this.e = beggVar;
        this.h = bnjvVar;
        this.n = btvoVar;
        this.o = btrgVar;
        this.p = executor;
        this.i = batzVar;
        this.r = ayfiVar;
        this.j = baadVar;
        this.d = dxioVar.a().a(baadVar);
    }

    private final boolean m() {
        dcdc r;
        int size;
        akqi b;
        akqq d;
        azxb f;
        if (!this.m.i()) {
            ayfi ayfiVar = this.r;
            if (ayfiVar != null) {
                ayfiVar.g(this);
            }
            return false;
        } else if (this.s) {
            return false;
        } else {
            this.d.p();
            dpov dpovVar = null;
            if (this.j != null) {
                List<baal> list = this.l;
                dbsk.s(list);
                size = list.size();
                r = null;
            } else {
                List<azxk> list2 = this.k;
                dbsk.s(list2);
                r = dcdc.r(list2);
                size = r.size();
            }
            for (int i = 0; i < size && this.d.m().size() < 25; i++) {
                if (this.j != null) {
                    List<baal> list3 = this.l;
                    dbsk.s(list3);
                    baal baalVar = list3.get(i);
                    f = baalVar.a();
                    if (baalVar.x() == baaj.PLACE) {
                        baak z = baalVar.z();
                        dbsk.s(z);
                        b = z.a();
                        d = z.b();
                    } else {
                        d = null;
                        b = null;
                    }
                } else {
                    dbsk.s(r);
                    b = ((azwm) r.get(i)).b();
                    dbsk.s(r);
                    d = ((azwm) r.get(i)).d();
                    f = azxb.f(b, d);
                }
                if (!this.d.g(f)) {
                    if (!f.c().isEmpty()) {
                        this.d.h(f);
                    } else if (akqi.d(b)) {
                        this.d.h(f);
                    } else if (d != null) {
                        this.d.i(f);
                    }
                }
            }
            if (!this.d.l()) {
                return false;
            }
            this.s = true;
            diar bZ = diaw.g.bZ();
            if (!this.d.k()) {
                baad baadVar = this.j;
                if (baadVar != null && q.contains(baadVar.o())) {
                    dpou bZ2 = dpov.f.bZ();
                    baad baadVar2 = this.j;
                    dbsk.s(baadVar2);
                    String l = baadVar2.l();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dpov dpovVar2 = (dpov) bZ2.b;
                    l.getClass();
                    dpovVar2.a |= 1;
                    dpovVar2.b = l;
                    dpovVar = bZ2.bK();
                }
                if (dpovVar != null && this.j != null) {
                    diau bZ3 = diav.d.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    diaw diawVar = (diaw) bZ.b;
                    dpovVar.getClass();
                    diawVar.b = dpovVar;
                    diawVar.a |= 1;
                    boolean z2 = this.j.o() != baab.FAVORITES;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    diav diavVar = (diav) bZ3.b;
                    diavVar.a |= 1;
                    diavVar.b = z2;
                    if (!this.j.y()) {
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        diav diavVar2 = (diav) bZ3.b;
                        diavVar2.a |= 2;
                        diavVar2.c = true;
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    diaw diawVar2 = (diaw) bZ.b;
                    diav bK = bZ3.bK();
                    bK.getClass();
                    diawVar2.d = bK;
                    diawVar2.a |= 2;
                }
            }
            dias bZ4 = diat.d.bZ();
            dnyc bZ5 = dnzj.Z.bZ();
            baad baadVar3 = this.j;
            boolean y = baadVar3 != null ? baadVar3.y() : false;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dnzj dnzjVar = (dnzj) bZ5.b;
            dnzjVar.a |= 4;
            dnzjVar.f = y;
            dnzj.c(dnzjVar);
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dnzj.e((dnzj) bZ5.b);
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dnzj.h((dnzj) bZ5.b);
            dnyf bZ6 = dnyh.d.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dnyh.b((dnyh) bZ6.b);
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dnzj dnzjVar2 = (dnzj) bZ5.b;
            dnyh bK2 = bZ6.bK();
            bK2.getClass();
            dnzjVar2.G = bK2;
            dnzjVar2.b |= 2097152;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            diat diatVar = (diat) bZ4.b;
            dnzj bK3 = bZ5.bK();
            bK3.getClass();
            diatVar.b = bK3;
            diatVar.a |= 1;
            if (n()) {
                diwc bZ7 = diwd.j.bZ();
                dhkd e = bfki.e(this.a);
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                diwd diwdVar = (diwd) bZ7.b;
                e.getClass();
                diwdVar.c = e;
                diwdVar.a |= 4;
                diwd.b(diwdVar);
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                diat diatVar2 = (diat) bZ4.b;
                diwd bK4 = bZ7.bK();
                bK4.getClass();
                diatVar2.c = bK4;
                diatVar2.a |= 2;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            diaw diawVar3 = (diaw) bZ.b;
            diat bK5 = bZ4.bK();
            bK5.getClass();
            diawVar3.e = bK5;
            diawVar3.a |= 4;
            dcpd<azxb> it = this.d.m().iterator();
            while (it.hasNext()) {
                azxb next = it.next();
                if (!n() || next.c().isEmpty()) {
                    akqi a = next.a();
                    if (akqi.d(a)) {
                        diap bZ8 = diaq.d.bZ();
                        dppq bZ9 = dppt.e.bZ();
                        dppw bZ10 = dppz.c.bZ();
                        dppy dppyVar = dppy.PLACE_ENTITY_LIST_ITEM;
                        if (bZ10.c) {
                            bZ10.bF();
                            bZ10.c = false;
                        }
                        dppz dppzVar = (dppz) bZ10.b;
                        dppzVar.b = dppyVar.e;
                        dppzVar.a |= 1;
                        if (bZ9.c) {
                            bZ9.bF();
                            bZ9.c = false;
                        }
                        dppt dpptVar = (dppt) bZ9.b;
                        dppz bK6 = bZ10.bK();
                        bK6.getClass();
                        dpptVar.d = bK6;
                        dpptVar.a |= 1;
                        dpsn i2 = a.i();
                        if (bZ9.c) {
                            bZ9.bF();
                            bZ9.c = false;
                        }
                        dppt dpptVar2 = (dppt) bZ9.b;
                        i2.getClass();
                        dpptVar2.c = i2;
                        dpptVar2.b = 2;
                        if (bZ8.c) {
                            bZ8.bF();
                            bZ8.c = false;
                        }
                        diaq diaqVar = (diaq) bZ8.b;
                        dppt bK7 = bZ9.bK();
                        bK7.getClass();
                        diaqVar.b = bK7;
                        diaqVar.a |= 1;
                        bZ.a(bZ8);
                    }
                } else {
                    diap bZ11 = diaq.d.bZ();
                    dppq bZ12 = dppt.e.bZ();
                    dppw bZ13 = dppz.c.bZ();
                    dppy dppyVar2 = dppy.EXPERIENCE_ENTITY_LIST_ITEM;
                    if (bZ13.c) {
                        bZ13.bF();
                        bZ13.c = false;
                    }
                    dppz dppzVar2 = (dppz) bZ13.b;
                    dppzVar2.b = dppyVar2.e;
                    dppzVar2.a |= 1;
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    dppt dpptVar3 = (dppt) bZ12.b;
                    dppz bK8 = bZ13.bK();
                    bK8.getClass();
                    dpptVar3.d = bK8;
                    dpptVar3.a |= 1;
                    String c = next.c();
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    dppt dpptVar4 = (dppt) bZ12.b;
                    c.getClass();
                    dpptVar4.b = 4;
                    dpptVar4.c = c;
                    if (bZ11.c) {
                        bZ11.bF();
                        bZ11.c = false;
                    }
                    diaq diaqVar2 = (diaq) bZ11.b;
                    dppt bK9 = bZ12.bK();
                    bK9.getClass();
                    diaqVar2.b = bK9;
                    diaqVar2.a |= 1;
                    dpuk d2 = next.d();
                    if (bZ11.c) {
                        bZ11.bF();
                        bZ11.c = false;
                    }
                    diaq diaqVar3 = (diaq) bZ11.b;
                    diaqVar3.c = d2.e;
                    diaqVar3.a |= 2;
                    bZ.a(bZ11);
                }
            }
            deha.q(this.o.d(bZ.bK()), new ayfh(this), this.p);
            ayfi ayfiVar2 = this.r;
            if (ayfiVar2 != null) {
                ayfiVar2.e(this);
            }
            return true;
        }
    }

    private final boolean n() {
        return this.n.getEnableFeatureParameters().aO || this.n.getEnableFeatureParameters().aN;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        abs absVar = recyclerView.l;
        if (absVar instanceof aag) {
            aag aagVar = (aag) absVar;
            if (aagVar.af() < aagVar.aN() - 3 || i2 <= 0 || this.s) {
                return;
            }
            m();
        }
    }

    public final Boolean c() {
        return Boolean.valueOf(this.s);
    }

    public final boolean d(baal baalVar) {
        boolean z = true;
        if (!this.m.i()) {
            return true;
        }
        if (this.j == null) {
            z = false;
        }
        dbsk.m(z, "LocalList is null.");
        return this.d.g(baalVar.a());
    }

    public final boolean e(azxk azxkVar) {
        boolean z = true;
        if (!this.m.i()) {
            return true;
        }
        if (this.k == null) {
            z = false;
        }
        dbsk.m(z, "List of StarredPlaces is null.");
        return this.d.g(azxb.f(azxkVar.b(), azxkVar.d()));
    }

    @dzsi
    public final ayfb f(akqi akqiVar) {
        ayfb ayfbVar = this.d.b.get(azxb.f(akqiVar, null));
        if (ayfbVar == null || ayfbVar.c() != dqhy.OK) {
            return null;
        }
        return ayfbVar;
    }

    @dzsi
    public final ayfb g(String str) {
        return this.d.b.get(azxb.g(str, dpuk.UNKNOWN_KNOWLEDGE_ENTITY));
    }

    @dzsi
    public final bnju h(akqi akqiVar) {
        ayfb f = f(akqiVar);
        if (f == null) {
            return null;
        }
        return f.a();
    }

    public final boolean i(List<baal> list) {
        dbsk.l(this.j != null);
        this.l = list;
        return m();
    }

    public final void j() {
        this.d.o();
    }

    public final void k() {
        this.s = false;
        this.d.p();
        ayfi ayfiVar = this.r;
        if (ayfiVar != null) {
            ayfiVar.f(this);
        }
    }

    public final void l(List<azxk> list) {
        dbsk.l(this.j == null);
        this.k = list;
        m();
    }
}
