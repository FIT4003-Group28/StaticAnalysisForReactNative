package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axjd  reason: default package */
/* loaded from: classes3.dex */
public final class axjd extends itb implements axjh {
    public final axqf a;
    private final dzsj<gga> b;
    private final btvo c;
    private final axhs d;
    private final akfa e;
    private final bvjj f;
    private final auhi g;
    private final Executor h;
    private final bvrb i;

    public axjd(dzsj<gga> dzsjVar, btvo btvoVar, axhs axhsVar, akfa akfaVar, bvjj bvjjVar, auhi auhiVar, axqf axqfVar, Executor executor, bvrb bvrbVar) {
        this.b = dzsjVar;
        this.c = btvoVar;
        this.d = axhsVar;
        this.e = akfaVar;
        this.f = bvjjVar;
        this.g = auhiVar;
        this.a = axqfVar;
        this.h = executor;
        this.i = bvrbVar;
    }

    private final axfo R(dqkn dqknVar, axok axokVar) {
        axgi j = this.d.j();
        if (j != null && dqknVar.d.equals(j.i)) {
            this.d.i(dqknVar.d);
            j.c();
        }
        String str = dqknVar.d;
        String str2 = dqknVar.b;
        axfo axfoVar = new axfo();
        Bundle bundle = new Bundle();
        bundle.putString("obfuscatedGaiaId", str);
        bundle.putString("displayName", str2);
        bundle.putInt("selectedTabIndex", axokVar.ordinal());
        axfoVar.B(bundle);
        this.b.a().D(axfoVar);
        return axfoVar;
    }

    private final dqao S(@dzsi String str) {
        btlu j;
        final dqan bZ = dqao.d.bZ();
        btlu j2 = this.e.j();
        if (str == null || ((j = this.e.j()) != null && str.equals(j.j()))) {
            dbsg<dspd> T = T(bvjk.gZ, j2);
            bZ.getClass();
            bvor.a(T, new mw(bZ) { // from class: axiz
                private final dqan a;

                {
                    this.a = bZ;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    dqan dqanVar = this.a;
                    dspd dspdVar = (dspd) obj;
                    if (dqanVar.c) {
                        dqanVar.bF();
                        dqanVar.c = false;
                    }
                    dqao dqaoVar = (dqao) dqanVar.b;
                    dqao dqaoVar2 = dqao.d;
                    dspdVar.getClass();
                    dqaoVar.a |= 1;
                    dqaoVar.b = dspdVar;
                }
            });
            dbsg<dspd> T2 = T(bvjk.ha, j2);
            bZ.getClass();
            bvor.a(T2, new mw(bZ) { // from class: axja
                private final dqan a;

                {
                    this.a = bZ;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    dqan dqanVar = this.a;
                    dspd dspdVar = (dspd) obj;
                    if (dqanVar.c) {
                        dqanVar.bF();
                        dqanVar.c = false;
                    }
                    dqao dqaoVar = (dqao) dqanVar.b;
                    dqao dqaoVar2 = dqao.d;
                    dspdVar.getClass();
                    dqaoVar.a |= 2;
                    dqaoVar.c = dspdVar;
                }
            });
        }
        return bZ.bK();
    }

    private final dbsg<dspd> T(bvjk bvjkVar, @dzsi btlu btluVar) {
        return dbsg.j(this.f.au(bvjkVar, btluVar));
    }

    @Override // defpackage.axjh
    public final void B(dqac dqacVar) {
        axib axibVar = (axib) this.d;
        if (axibVar.a()) {
            axibVar.r(new axgz(dqacVar));
        } else {
            bvoo.h("Cannot cache PeopleFollowInfo if new cache is not enabled", new Object[0]);
        }
    }

    @Override // defpackage.axjh
    public final void C(dqac dqacVar) {
        axib axibVar = (axib) this.d;
        if (axibVar.a()) {
            axibVar.r(new axhb(dqacVar));
        } else {
            bvoo.h("Cannot warm up repository if new cache is not enabled", new Object[0]);
        }
    }

    @Override // defpackage.axjh
    public final void D(List<String> list) {
        axib axibVar = (axib) this.d;
        if (axibVar.a()) {
            axibVar.r(new axhc(list));
        } else {
            bvoo.h("Cannot warm up repository if new cache is not enabled", new Object[0]);
        }
    }

    @Override // defpackage.axjh
    public final void E(dqas dqasVar) {
        axib axibVar = (axib) this.d;
        if (axibVar.a()) {
            axibVar.r(new axha(dqasVar));
        } else if (axibVar.n == null) {
        } else {
            axix axixVar = axibVar.n;
            axixVar.d = axix.a(dqasVar, axixVar.d);
        }
    }

    @Override // defpackage.axjh
    public final void F(String str, dqam dqamVar) {
        if ((dqamVar.a & 32) != 0) {
            dqas dqasVar = dqamVar.f;
            if (dqasVar == null) {
                dqasVar = dqas.c;
            }
            E(dqasVar);
        }
        if (dqamVar.b == 2) {
            axhs axhsVar = this.d;
            dqaw dqawVar = ((dqaj) dqamVar.c).a;
            if (dqawVar == null) {
                dqawVar = dqaw.d;
            }
            axib axibVar = (axib) axhsVar;
            if (axibVar.a()) {
                axibVar.p(str, dqawVar);
            } else if (axibVar.n != null) {
                axibVar.n.d(str, dqawVar);
            }
        }
        if ((dqamVar.a & 4) != 0) {
            axfm i = this.d.i(str);
            dqah dqahVar = dqamVar.d;
            if (dqahVar == null) {
                dqahVar = dqah.e;
            }
            i.a(dqahVar);
        }
    }

    @Override // defpackage.axjh
    public final void G(String str) {
        axib axibVar = (axib) this.d;
        if (!axibVar.a() && axibVar.n != null) {
            axix axixVar = axibVar.n;
            if (!axixVar.g.containsKey(str) || !axixVar.h.containsKey(str)) {
                return;
            }
            if (axixVar.h.get(str).intValue() == 1) {
                axixVar.g.remove(str);
                axixVar.h.remove(str);
                return;
            }
            Map<String, Integer> map = axixVar.h;
            map.put(str, Integer.valueOf(map.get(str).intValue() - 1));
        }
    }

    @Override // defpackage.axjh
    public final void H(@dzsi String str, diah diahVar) {
        if (e()) {
            dqao S = S(str);
            if (diahVar.c) {
                diahVar.bF();
                diahVar.c = false;
            }
            diai diaiVar = (diai) diahVar.b;
            diai diaiVar2 = diai.h;
            S.getClass();
            diaiVar.d = S;
            diaiVar.a |= 8;
        }
    }

    @Override // defpackage.axjh
    public final boolean I() {
        btlu.i(this.e.j());
        btlt btltVar = btlt.UNKNOWN;
        e();
        return false;
    }

    @Override // defpackage.axjh
    public final axnw J(@dzsi String str) {
        axib axibVar = (axib) this.d;
        for (axnw axnwVar : axibVar.o.keySet()) {
            if (dbsd.a(axnwVar.d, str)) {
                return axnwVar;
            }
        }
        axnw a = axibVar.g.a(str, null);
        a.b(null);
        axibVar.o.put(a, null);
        return a;
    }

    @Override // defpackage.axjh
    public final axnw K(diyr diyrVar) {
        axib axibVar = (axib) this.d;
        axnw a = axibVar.g.a(null, diyrVar);
        axibVar.o.put(a, null);
        return a;
    }

    @Override // defpackage.axjh
    public final boolean L() {
        if (!e()) {
            return false;
        }
        return !this.f.o(bvjk.gW, this.e.j(), false) && dfqg.a(this.f.t(bvjk.hM, this.e.j(), 0)) == 2;
    }

    @Override // defpackage.axjh
    public final void M(@dzsi gfw gfwVar, dqaa dqaaVar) {
        boolean z = false;
        if (dfqg.a(this.f.t(bvjk.hM, this.e.j(), 0)) == 1) {
            this.f.X(bvjk.hM, this.e.j(), 1);
        }
        if (dqaaVar.b.size() == 0) {
            return;
        }
        int a = dfqg.a(this.f.t(bvjk.hM, this.e.j(), 0));
        int t = this.f.t(bvjk.gY, this.e.j(), 0);
        int intValue = ((Integer) Collections.max(dchl.k(dqaaVar.b, axjb.a))).intValue();
        if ((a == 3 || a == 4) && t >= intValue) {
            return;
        }
        bvjj bvjjVar = this.f;
        bvjk bvjkVar = bvjk.hL;
        btlu j = this.e.j();
        dqfc b = dqfc.b(dqaaVar.c);
        if (b == null) {
            b = dqfc.UNKNOWN_VISIBILITY;
        }
        if (b != dqfc.PRIVATE) {
            z = true;
        }
        bvjjVar.T(bvjkVar, j, z);
        dsrj<dpzz> dsrjVar = dqaaVar.b;
        axfc axfcVar = new axfc();
        Bundle bundle = new Bundle();
        bundle.putParcelable("onboardingDataList", new ProtoBufUtil$ParcelableProtoList(dsrjVar));
        axfcVar.B(bundle);
        if (gfwVar == null) {
            this.b.a().D(axfcVar);
        } else {
            gfwVar.aZ(axfcVar);
        }
    }

    @Override // defpackage.axjh
    public final void N(final dqfc dqfcVar) {
        axhs axhsVar = this.d;
        deig d = deig.d();
        axib axibVar = (axib) axhsVar;
        axis axisVar = axibVar.d;
        diah diahVar = (diah) diai.h.bZ();
        dnwb a = axisVar.b.a();
        if (diahVar.c) {
            diahVar.bF();
            diahVar.c = false;
        }
        diai diaiVar = (diai) diahVar.b;
        a.getClass();
        diaiVar.c = a;
        diaiVar.a |= 2;
        dqao dqaoVar = dqao.d;
        if (diahVar.c) {
            diahVar.bF();
            diahVar.c = false;
        }
        diai diaiVar2 = (diai) diahVar.b;
        dqaoVar.getClass();
        diaiVar2.d = dqaoVar;
        diaiVar2.a |= 8;
        deig d2 = deig.d();
        buac buacVar = ((buor) axisVar.i).c;
        btlu j = axisVar.a.a().j();
        dbsk.s(j);
        buacVar.e = j;
        axisVar.b(((buor) axisVar.i).b(), (diai) diahVar.bK(), d2, axin.a);
        deha.q(d2, new axia(d), axibVar.h);
        deha.q(d, bvqj.b(new bvqg(this, dqfcVar) { // from class: axjc
            private final axjd a;
            private final dqfc b;

            {
                this.a = this;
                this.b = dqfcVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                axjd axjdVar = this.a;
                dqfc dqfcVar2 = this.b;
                dqaa dqaaVar = (dqaa) obj;
                dsqp dsqpVar = (dsqp) dqaaVar.cu(5);
                dsqpVar.bC(dqaaVar);
                dpzx dpzxVar = (dpzx) dsqpVar;
                if (dpzxVar.c) {
                    dpzxVar.bF();
                    dpzxVar.c = false;
                }
                dqaa dqaaVar2 = (dqaa) dpzxVar.b;
                dqaa dqaaVar3 = dqaa.d;
                dqaaVar2.c = dqfcVar2.d;
                dqaaVar2.a |= 1;
                axjdVar.M(null, dpzxVar.bK());
            }
        }), this.h);
    }

    @Override // defpackage.axjh
    public final void O(String str, dfqc dfqcVar, dqar dqarVar) {
        axhm axhmVar = new axhm();
        Bundle bundle = new Bundle();
        bundle.putString("obfuscatedGaiaId", str);
        bundle.putInt("followeeSource", dfqcVar.m);
        bvrs.k(bundle, "onboardingData", dqarVar);
        axhmVar.B(bundle);
        this.b.a().D(axhmVar);
    }

    @Override // defpackage.axjh
    public final void P(dwtk dwtkVar) {
        if (e()) {
            dqao S = S(null);
            if (dwtkVar.c) {
                dwtkVar.bF();
                dwtkVar.c = false;
            }
            dwtl dwtlVar = (dwtl) dwtkVar.b;
            dwtl dwtlVar2 = dwtl.d;
            S.getClass();
            dwtlVar.c = S;
            dwtlVar.a |= 2;
        }
    }

    @Override // defpackage.axjh
    public final void Q(String str) {
        axib axibVar = (axib) this.d;
        axis axisVar = axibVar.d;
        deig d = deig.d();
        djoj djojVar = (djoj) djok.c.bZ();
        if (djojVar.c) {
            djojVar.bF();
            djojVar.c = false;
        }
        djok djokVar = (djok) djojVar.b;
        str.getClass();
        djokVar.a |= 4;
        djokVar.b = str;
        buac buacVar = ((buwn) axisVar.g).c;
        btlu j = axisVar.a.a().j();
        dbsk.s(j);
        buacVar.e = j;
        axisVar.b(((buwn) axisVar.g).b(), (djok) djojVar.bK(), d, axil.a);
        axibVar.n(d, str);
    }

    @Override // defpackage.axjh
    public final boolean e() {
        return this.c.getPeopleFollowParameters().a;
    }

    @Override // defpackage.axjh
    public final boolean f() {
        return this.c.getPeopleFollowParameters().b;
    }

    @Override // defpackage.axjh
    public final boolean i() {
        return this.c.getPeopleFollowParameters().d;
    }

    @Override // defpackage.axjh
    public final boolean j() {
        return this.d.a();
    }

    @Override // defpackage.axjh
    public final void k(dqkn dqknVar, axok axokVar) {
        R(dqknVar, axokVar);
    }

    @Override // defpackage.axjh
    public final void l(dqkn dqknVar, axok axokVar, dqam dqamVar) {
        dqal dqalVar;
        dqal dqalVar2;
        axfo R = R(dqknVar, axokVar);
        if (dqamVar.b == 1) {
            dqalVar = (dqal) dqamVar.c;
        } else {
            dqalVar = dqal.e;
        }
        if ((dqalVar.a & 4) != 0) {
            if (dqamVar.b == 1) {
                dqalVar2 = (dqal) dqamVar.c;
            } else {
                dqalVar2 = dqal.e;
            }
            dqaa dqaaVar = dqalVar2.d;
            if (dqaaVar == null) {
                dqaaVar = dqaa.d;
            }
            M(R, dqaaVar);
        }
    }

    @Override // defpackage.axjh
    public final void m(dqkn dqknVar, axok axokVar, dpyv dpyvVar) {
        R(dqknVar, axokVar);
        this.b.a().g().aq();
        avac.bp(this.b.a(), Integer.valueOf(dpyvVar.dm), this.f, this.i, this.g);
    }

    @Override // defpackage.axjh
    public final void n() {
        this.b.a().D(new axje());
    }

    @Override // defpackage.axjh
    public final axne o(String str, String str2, dfqc dfqcVar) {
        return this.a.a(str, str2, this.d.c(str, null), dfqcVar, null);
    }

    @Override // defpackage.axjh
    public final axne p(String str, String str2, dqaw dqawVar, dfqc dfqcVar) {
        return this.a.a(str, str2, this.d.c(str, dqawVar), dfqcVar, null);
    }

    @Override // defpackage.axjh
    public final dbsg<axne> q(final String str, final String str2, final dfqc dfqcVar, final String str3) {
        if (e()) {
            axib axibVar = (axib) this.d;
            return (axibVar.a() ? dbsg.j(axibVar.o(str)) : dbpy.a).h(new dbrn(this, str, str2, dfqcVar, str3) { // from class: axiy
                private final axjd a;
                private final String b;
                private final String c;
                private final dfqc d;
                private final String e;

                {
                    this.a = this;
                    this.b = str;
                    this.c = str2;
                    this.d = dfqcVar;
                    this.e = str3;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    axjd axjdVar = this.a;
                    String str4 = this.b;
                    String str5 = this.c;
                    dfqc dfqcVar2 = this.d;
                    String str6 = this.e;
                    return axjdVar.a.a(str4, str5, (crzo) obj, dfqcVar2, str6);
                }
            });
        }
        return dbpy.a;
    }

    @Override // defpackage.axjh
    @dzsi
    public final dqau r(String str) {
        axib axibVar = (axib) this.d;
        axix axixVar = axibVar.n;
        dbsk.s(axixVar);
        dqau dqauVar = axixVar.e.get(str);
        if (dqauVar == null) {
            ((ckco) axibVar.f.a(ckik.b)).a(ckii.a(2));
        }
        return dqauVar;
    }

    @Override // defpackage.axjh
    public final void s(List<dqau> list) {
        axib axibVar = (axib) this.d;
        if (axibVar.a()) {
            if (!axibVar.a()) {
                return;
            }
            for (dqau dqauVar : list) {
                dqkn dqknVar = dqauVar.b;
                if (dqknVar == null) {
                    dqknVar = dqkn.e;
                }
                String str = dqknVar.d;
                dqaw dqawVar = dqauVar.c;
                if (dqawVar == null) {
                    dqawVar = dqaw.d;
                }
                axibVar.p(str, dqawVar);
            }
        } else if (axibVar.n != null) {
            axix axixVar = axibVar.n;
            for (dqau dqauVar2 : list) {
                dqkn dqknVar2 = dqauVar2.b;
                if (dqknVar2 == null) {
                    dqknVar2 = dqkn.e;
                }
                String str2 = dqknVar2.d;
                Map<String, crzo<axoj>> map = axixVar.f;
                dqaw dqawVar2 = dqauVar2.c;
                if (dqawVar2 == null) {
                    dqawVar2 = dqaw.d;
                }
                map.put(str2, axixVar.b(str2, dqawVar2));
                axixVar.e.put(str2, dqauVar2);
            }
        }
    }

    @Override // defpackage.axjh
    public final void t(final List<String> list) {
        axib axibVar = (axib) this.d;
        if (!axibVar.a() && axibVar.n != null) {
            axix axixVar = axibVar.n;
            axixVar.f = new HashMap(dcjz.x(axixVar.f, new dbsl(list) { // from class: axiu
                private final List a;

                {
                    this.a = list;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    dqaw dqawVar = axix.a;
                    return this.a.contains((String) obj);
                }
            }));
            axixVar.e = new HashMap(dcjz.x(axixVar.e, new dbsl(list) { // from class: axiv
                private final List a;

                {
                    this.a = list;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    dqaw dqawVar = axix.a;
                    return this.a.contains((String) obj);
                }
            }));
        }
    }
}
