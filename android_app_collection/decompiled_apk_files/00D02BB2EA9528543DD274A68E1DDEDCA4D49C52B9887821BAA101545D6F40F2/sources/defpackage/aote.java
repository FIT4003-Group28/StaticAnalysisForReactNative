package defpackage;

import android.app.Activity;
import android.net.NetworkInfo;
import android.util.Base64;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aote  reason: default package */
/* loaded from: classes2.dex */
public class aote implements baef {
    public final gga a;
    public Boolean b;
    public digr c;
    private final bvjj d;
    private final aosw e;
    private final aoth f;
    private aosv g;
    private final Runnable h;
    private final iic i;
    private boolean j;

    public aote(anhg anhgVar, gga ggaVar, bvjj bvjjVar, aosw aoswVar, aoth aothVar, bvpe bvpeVar, Runnable runnable) {
        this.a = ggaVar;
        this.d = bvjjVar;
        this.h = runnable;
        this.e = aoswVar;
        this.f = aothVar;
        this.j = bvjjVar.m(bvjk.dS, false);
        iic j = iid.j();
        j.e(dcdc.e());
        ifj ifjVar = (ifj) j;
        ifjVar.f = cjtd.a(dtyc.ac);
        ifjVar.e = bvpeVar.b;
        ifjVar.d = new aota(ggaVar, anhgVar);
        this.i = j;
    }

    public void a() {
        aote aoteVar;
        if (this.g == null) {
            aosw aoswVar = this.e;
            aa aaVar = new aa(this) { // from class: aosy
                private final aote a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    aote aoteVar2 = this.a;
                    aoteVar2.b = (Boolean) obj;
                    aoteVar2.g();
                }
            };
            aa aaVar2 = new aa(this) { // from class: aosz
                private final aote a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    aote aoteVar2 = this.a;
                    bvrj.UI_THREAD.c();
                    aoteVar2.c = (digr) obj;
                    if (!aoteVar2.g()) {
                        cqkx.p(aoteVar2);
                    }
                }
            };
            anqr a = aoswVar.a.a();
            aosw.a(a, 1);
            Executor a2 = aoswVar.b.a();
            aosw.a(a2, 2);
            Executor a3 = aoswVar.c.a();
            aosw.a(a3, 3);
            btpc a4 = aoswVar.d.a();
            aosw.a(a4, 4);
            fd fdVar = (fd) ((dxjd) aoswVar.e).a;
            aosw.a(fdVar, 5);
            btrm a5 = aoswVar.f.a();
            aosw.a(a5, 6);
            anhk a6 = aoswVar.g.a();
            aosw.a(a6, 7);
            burp a7 = aoswVar.h.a();
            aosw.a(a7, 8);
            Activity activity = (Activity) ((dxjd) aoswVar.i).a;
            aosw.a(activity, 9);
            cqat a8 = aoswVar.j.a();
            aosw.a(a8, 10);
            bvju a9 = aoswVar.k.a();
            aosw.a(a9, 11);
            aosw.a(aaVar, 12);
            aosw.a(aaVar2, 13);
            aosv aosvVar = new aosv(a, a2, a3, a4, fdVar, a5, a6, a7, activity, a8, a9, aaVar, aaVar2);
            aoteVar = this;
            aoteVar.g = aosvVar;
        } else {
            aoteVar = this;
        }
        final aosv aosvVar2 = aoteVar.g;
        dbsk.l(!aosvVar2.u);
        if (!aosvVar2.v) {
            digo bZ = digr.d.bZ();
            digp bZ2 = digq.h.bZ();
            String string = aosvVar2.l.getResources().getString(R.string.TIMELINE_YESTERDAY);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            digq digqVar = (digq) bZ2.b;
            string.getClass();
            digqVar.a |= 2;
            digqVar.c = string;
            drpt bZ3 = drqz.e.bZ();
            drpx bZ4 = drqy.c.bZ();
            drpy bZ5 = drqb.d.bZ();
            drpz bZ6 = drqa.d.bZ();
            long b = aosvVar2.m.b() - aosv.a;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drqa drqaVar = (drqa) bZ6.b;
            drqaVar.a |= 1;
            drqaVar.b = b;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            drqb drqbVar = (drqb) bZ5.b;
            drqa bK = bZ6.bK();
            bK.getClass();
            drqbVar.c = bK;
            drqbVar.a |= 2;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drqy drqyVar = (drqy) bZ4.b;
            drqb bK2 = bZ5.bK();
            bK2.getClass();
            drqyVar.b = bK2;
            drqyVar.a = 1;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            drqz drqzVar = (drqz) bZ3.b;
            drqy bK3 = bZ4.bK();
            bK3.getClass();
            drqzVar.b = bK3;
            drqzVar.a |= 1;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            digq digqVar2 = (digq) bZ2.b;
            drqz bK4 = bZ3.bK();
            bK4.getClass();
            digqVar2.g = bK4;
            digqVar2.a |= 32;
            bZ.a(bZ2);
            digp bZ7 = digq.h.bZ();
            String string2 = aosvVar2.l.getResources().getString(R.string.MAPS_ACTIVITY_PLACES_TAB_TITLE);
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            digq digqVar3 = (digq) bZ7.b;
            string2.getClass();
            digqVar3.a |= 2;
            digqVar3.c = string2;
            drqz drqzVar2 = aosv.d;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            digq digqVar4 = (digq) bZ7.b;
            drqzVar2.getClass();
            digqVar4.g = drqzVar2;
            digqVar4.a |= 32;
            bZ.a(bZ7);
            digp bZ8 = digq.h.bZ();
            String string3 = aosvVar2.l.getResources().getString(R.string.MAPS_ACTIVITY_CITIES_TAB_TITLE);
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            digq digqVar5 = (digq) bZ8.b;
            string3.getClass();
            digqVar5.a |= 2;
            digqVar5.c = string3;
            drqz drqzVar3 = aosv.c;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            digq digqVar6 = (digq) bZ8.b;
            drqzVar3.getClass();
            digqVar6.g = drqzVar3;
            digqVar6.a |= 32;
            bZ.a(bZ8);
            digp bZ9 = digq.h.bZ();
            String string4 = aosvVar2.l.getResources().getString(R.string.MAPS_ACTIVITY_COUNTRIES_TAB_TITLE);
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            digq digqVar7 = (digq) bZ9.b;
            string4.getClass();
            digqVar7.a |= 2;
            digqVar7.c = string4;
            drqz drqzVar4 = aosv.b;
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            digq digqVar8 = (digq) bZ9.b;
            drqzVar4.getClass();
            digqVar8.g = drqzVar4;
            digqVar8.a |= 32;
            bZ.a(bZ9);
            digr bK5 = bZ.bK();
            aosvVar2.s.set(bK5);
            aosvVar2.h.b(aosvVar2.n, new aa(aosvVar2) { // from class: aosq
                private final aosv a;

                {
                    this.a = aosvVar2;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    aosv aosvVar3 = this.a;
                    boolean booleanValue = ((Boolean) dbsg.j((NetworkInfo) obj).h(aosr.a).c(false)).booleanValue();
                    if (!aosvVar3.r.get() && booleanValue) {
                        aosvVar3.a();
                    }
                    aosvVar3.r.set(booleanValue);
                }
            });
            String string5 = aosvVar2.o.getString("placeholderEntryPoints", "");
            if (!string5.isEmpty()) {
                try {
                    bK5 = (digr) ((dssr) digr.d.cu(7)).j(Base64.decode(string5, 1));
                } catch (dsrm e) {
                    e.getMessage();
                }
            }
            aosvVar2.t.set(bK5);
            aosvVar2.v = true;
        }
        bvqj.e(aosvVar2.i.a(), new bvqg(aosvVar2) { // from class: aoss
            private final aosv a;

            {
                this.a = aosvVar2;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                aosv aosvVar3 = this.a;
                cora coraVar = (cora) obj;
                if (coraVar == null) {
                    aosvVar3.f.g(false);
                } else {
                    aosvVar3.f.g(Boolean.valueOf(coraVar.e()));
                }
            }
        }, aosvVar2.j);
        if (!aosvVar2.r.get()) {
            aosvVar2.g.f(aosvVar2.t.get());
        } else if (!aosvVar2.q.get()) {
        } else {
            aosvVar2.a();
        }
    }

    public void b() {
        aosv aosvVar = this.g;
        if (aosvVar != null) {
            aosvVar.u = true;
            aosvVar.k.a(aosvVar.p);
            aosvVar.o.edit().putString("placeholderEntryPoints", Base64.encodeToString(aosvVar.t.get().bS(), 1)).apply();
            this.g = null;
        }
    }

    @Override // defpackage.baef
    public baei c() {
        return new aotd(this);
    }

    public Boolean d() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.baef
    public Boolean e() {
        return Boolean.valueOf(h());
    }

    @Override // defpackage.baef
    public iib f() {
        if (h()) {
            this.i.e(dcdc.e());
        } else {
            dccx F = dcdc.F();
            digr digrVar = this.c;
            dbsk.s(digrVar);
            for (digq digqVar : digrVar.a) {
                bade badeVar = new bade();
                anhg a = this.f.a.a();
                aoth.a(a, 1);
                aoth.a(digqVar, 2);
                F.g(cqgr.fT(badeVar, new aotg(a, digqVar)));
            }
            this.i.e(F.f());
        }
        return this.i.f();
    }

    public final boolean g() {
        if (h()) {
            return false;
        }
        digr digrVar = this.c;
        dbsk.s(digrVar);
        Boolean bool = this.b;
        dbsk.s(bool);
        boolean z = bool.booleanValue() || (digrVar.a.size() > 0 && !digrVar.c);
        if (z == this.j) {
            return false;
        }
        this.j = z;
        this.d.S(bvjk.dS, z);
        this.h.run();
        return true;
    }

    final boolean h() {
        return this.b == null || this.c == null;
    }
}
