package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anjz  reason: default package */
/* loaded from: classes2.dex */
public final class anjz implements angp {
    private static final dcqe a = dcqe.c("anjz");
    private static final anru b = new anru();
    private final cqat c;
    private final bvrb d;
    private final CopyOnWriteArrayList<ango> e;
    private final anku<duyc, duye, dcdc<anhm>> f;
    private final ankb g;
    private final dzsj<bulf> h;

    public anjz(anhk anhkVar, bvrb bvrbVar, dzsj<bulf> dzsjVar, cqat cqatVar, ankb ankbVar) {
        anku<duyc, duye, dcdc<anhm>> ankuVar = new anku<>(dzsjVar.a().c(), new anjx(anhkVar), bvrj.BACKGROUND_THREADPOOL);
        this.c = cqatVar;
        this.d = bvrbVar;
        this.h = dzsjVar;
        CopyOnWriteArrayList<ango> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.e = copyOnWriteArrayList;
        this.f = ankuVar;
        ankuVar.a(new anjy(anhkVar));
        this.g = ankbVar;
        ankuVar.a(x(copyOnWriteArrayList));
    }

    private final void s(dvay dvayVar, List<dvyw> list, List<dvyw> list2) {
        long b2 = this.c.b();
        dvyw d = anru.d(dvayVar);
        dnsc l = ankp.l(ankp.f(dvayVar), d, ankp.n(dvayVar), b2, dbsg.i(dvayVar.s));
        dnrk bZ = dnrl.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnrl dnrlVar = (dnrl) bZ.b;
        l.getClass();
        dnrlVar.b = l;
        dnrlVar.a |= 1;
        dnrc i = ankp.i(list2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnrl dnrlVar2 = (dnrl) bZ.b;
        dnrd bK = i.bK();
        bK.getClass();
        dnrlVar2.d = bK;
        dnrlVar2.a |= 2;
        dcbg b3 = dcbg.b(list);
        ankp.b.getClass();
        dcdc z = b3.s(new dbrn() { // from class: ankl
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return anru.f((dvyw) obj);
            }
        }).z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnrl dnrlVar3 = (dnrl) bZ.b;
        dsrj<dniu> dsrjVar = dnrlVar3.c;
        if (!dsrjVar.a()) {
            dnrlVar3.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(z, dnrlVar3.c);
        dnqr bZ2 = dnrw.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnrw dnrwVar = (dnrw) bZ2.b;
        dnrl bK2 = bZ.bK();
        bK2.getClass();
        dnrwVar.b = bK2;
        dnrwVar.a = 12;
        t(new ankp(bZ2.bK(), dbsg.i(dvayVar), dbsg.i(d)));
    }

    private final void t(anhm anhmVar) {
        dnqg bZ = dnqh.p.bZ();
        int i = ddfv.i.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        u(anhmVar, bZ.bK(), dbpy.a);
    }

    private final void u(anhm anhmVar, dnqh dnqhVar, dbsg<ango> dbsgVar) {
        v(dcdc.f(anhmVar), dnqhVar, dbsgVar, true);
    }

    private final void v(dcdc<anhm> dcdcVar, dnqh dnqhVar, dbsg<ango> dbsgVar, boolean z) {
        duyb w = w();
        if (w.c) {
            w.bF();
            w.c = false;
        }
        duyc duycVar = (duyc) w.b;
        duyc duycVar2 = duyc.h;
        dnqhVar.getClass();
        duycVar.f = dnqhVar;
        duycVar.a |= 8;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            w.a(dcdcVar.get(i).a());
        }
        ArrayList arrayList = new ArrayList();
        if (dbsgVar.a()) {
            arrayList.add(dbsgVar.b());
        }
        if (z) {
            arrayList.add(this.g);
        }
        this.f.b(w.bK(), dcdcVar, dbsg.i(x(arrayList)));
    }

    private static duyb w() {
        duyb bZ = duyc.h.bZ();
        dhvp bZ2 = dhvq.c.bZ();
        dhvn bZ3 = dhvo.c.bZ();
        String str = Build.FINGERPRINT;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhvo dhvoVar = (dhvo) bZ3.b;
        str.getClass();
        dhvoVar.a |= 1;
        dhvoVar.b = str;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhvq dhvqVar = (dhvq) bZ2.b;
        dhvo bK = bZ3.bK();
        bK.getClass();
        dhvqVar.b = bK;
        dhvqVar.a = 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duyc duycVar = (duyc) bZ.b;
        dhvq bK2 = bZ2.bK();
        bK2.getClass();
        duycVar.g = bK2;
        duycVar.a |= 16;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duyc duycVar2 = (duyc) bZ.b;
        duycVar2.a |= 1;
        duycVar2.c = true;
        return bZ;
    }

    private static anks<duyc, duye, dcdc<anhm>> x(List<ango> list) {
        return new anjw(list);
    }

    @Override // defpackage.angp
    public final void a(ango angoVar) {
        this.e.add(angoVar);
    }

    @Override // defpackage.angp
    public final void b(ango angoVar) {
        this.e.remove(angoVar);
    }

    @Override // defpackage.angp
    public final void c(dvay dvayVar, dvyw dvywVar, dnqm dnqmVar, dnsf dnsfVar) {
        dbsg i;
        long b2 = this.c.b();
        dvax b3 = dvax.b(dvayVar.m);
        if (b3 == null) {
            b3 = dvax.UNKNOWN;
        }
        if (b3 != dvax.STOP) {
            Object[] objArr = new Object[1];
            dvax b4 = dvax.b(dvayVar.m);
            if (b4 == null) {
                b4 = dvax.UNKNOWN;
            }
            objArr[0] = b4;
            bvoo.h("Expected stop segment, got segment of type %s", objArr);
            i = dbpy.a;
        } else {
            dvyw d = anru.d(dvayVar);
            int n = ankp.n(dvayVar);
            dnsc l = ankp.l(ankp.f(dvayVar), d, n, b2, dbsg.i(dvayVar.s));
            dwyn dwynVar = dvayVar.f;
            if (dwynVar == null) {
                dwynVar = dwyn.d;
            }
            dwyn dwynVar2 = dvayVar.g;
            if (dwynVar2 == null) {
                dwynVar2 = dwyn.d;
            }
            dngq e = aogf.d(dwynVar, dwynVar2).e();
            dniu f = anru.f(dvywVar);
            i = dbsg.i(ankp.d(l, ankp.e(anru.g(e, f, n, b2), f, dbpy.a).bK(), dvayVar, dbsg.i(dvywVar), dbsg.i(dnqmVar), dnsfVar));
        }
        if (!i.a()) {
            bvoo.h("Can't create the metadata for modify stop segment place edit.", new Object[0]);
        } else {
            t((anhm) i.b());
        }
    }

    @Override // defpackage.angp
    public final void d(dvay dvayVar, dqjl dqjlVar, dnqm dnqmVar, dnsf dnsfVar) {
        dwyn dwynVar = dvayVar.f;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        dwyn dwynVar2 = dvayVar.g;
        if (dwynVar2 == null) {
            dwynVar2 = dwyn.d;
        }
        dbsg<ankp> j = ankp.j(dvayVar, aogc.e(dwynVar, dwynVar2), dqjlVar, true != dvayVar.r ? 1 : 2, this.c.b(), dbsg.i(dnqmVar), dnsfVar);
        if (!j.a()) {
            bvoo.h("Can't create the metadata for modify activity segment edit.", new Object[0]);
        } else {
            t(j.b());
        }
    }

    @Override // defpackage.angp
    public final void e(dwfl dwflVar) {
        long j = dwflVar.o;
        dnqr bZ = dnrw.c.bZ();
        dnrm bZ2 = dnrn.b.bZ();
        dnhx bZ3 = dnic.f.bZ();
        dpoo bZ4 = dpop.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dpop dpopVar = (dpop) bZ4.b;
        int i = dpopVar.a | 1;
        dpopVar.a = i;
        dpopVar.b = j;
        dpopVar.a = i | 2;
        dpopVar.c = j;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnic dnicVar = (dnic) bZ3.b;
        dpop bK = bZ4.bK();
        bK.getClass();
        dnicVar.b = bK;
        dnicVar.a |= 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnrn dnrnVar = (dnrn) bZ2.b;
        dnic bK2 = bZ3.bK();
        bK2.getClass();
        dsrj<dnic> dsrjVar = dnrnVar.a;
        if (!dsrjVar.a()) {
            dnrnVar.a = dsqw.cl(dsrjVar);
        }
        dnrnVar.a.add(bK2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnrw dnrwVar = (dnrw) bZ.b;
        dnrn bK3 = bZ2.bK();
        bK3.getClass();
        dnrwVar.b = bK3;
        dnrwVar.a = 5;
        t(new ankp(bZ.bK(), dbpy.a, dbpy.a));
    }

    @Override // defpackage.angp
    public final void f(aogb aogbVar, dork dorkVar) {
        dnqr bZ = dnrw.c.bZ();
        dnre bZ2 = dnrf.d.bZ();
        dngs h = aogbVar.h();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnrf dnrfVar = (dnrf) bZ2.b;
        h.getClass();
        dnrfVar.b = h;
        int i = dnrfVar.a | 1;
        dnrfVar.a = i;
        dorkVar.getClass();
        dnrfVar.c = dorkVar;
        dnrfVar.a = i | 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnrw dnrwVar = (dnrw) bZ.b;
        dnrf bK = bZ2.bK();
        bK.getClass();
        dnrwVar.b = bK;
        dnrwVar.a = 8;
        t(new ankp(bZ.bK(), dbpy.a, dbpy.a));
    }

    @Override // defpackage.angp
    public final void g(dbsg<dnhz> dbsgVar, dbsg<dnhz> dbsgVar2, dvyw dvywVar, dbsg<dvyw> dbsgVar3, dnqh dnqhVar, dbsg<String> dbsgVar4, dbsg<ango> dbsgVar5) {
        u(ankp.o(dbsgVar, dbsgVar2, dvywVar, dbsgVar4, this.c.b()), dnqhVar, dbsgVar5);
    }

    @Override // defpackage.angp
    public final void h(dcdc<dvyw> dcdcVar, dnqh dnqhVar, dbsg<ango> dbsgVar) {
        dccx dccxVar = new dccx();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dvyw dvywVar = dcdcVar.get(i);
            dbpy<Object> dbpyVar = dbpy.a;
            dnhy bZ = dnhz.e.bZ();
            long b2 = this.c.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnhz dnhzVar = (dnhz) bZ.b;
            dnhzVar.a |= 4;
            dnhzVar.d = b2;
            dccxVar.g(ankp.o(dbpyVar, dbsg.i(bZ.bK()), dvywVar, dbpy.a, this.c.b()));
        }
        v(dccxVar.f(), dnqhVar, dbsgVar, true);
    }

    @Override // defpackage.angp
    public final void i(dvyw dvywVar, dnqh dnqhVar, dbsg<ango> dbsgVar) {
        dnrs bZ = dnrt.c.bZ();
        dniu f = anru.f(dvywVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnrt dnrtVar = (dnrt) bZ.b;
        f.getClass();
        dnrtVar.b = f;
        dnrtVar.a |= 1;
        dnqr bZ2 = dnrw.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnrw dnrwVar = (dnrw) bZ2.b;
        dnrt bK = bZ.bK();
        bK.getClass();
        dnrwVar.b = bK;
        dnrwVar.a = 11;
        u(new ankp(bZ2.bK(), dbpy.a, dbsg.i(dvywVar)), dnqhVar, dbsgVar);
    }

    @Override // defpackage.angp
    public final void j(dvyw dvywVar, dnhz dnhzVar, dnqh dnqhVar, dnqq dnqqVar, dbsg<ango> dbsgVar) {
        dnqu bZ = dnqv.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqv dnqvVar = (dnqv) bZ.b;
        dnhzVar.getClass();
        dnqvVar.d = dnhzVar;
        dnqvVar.a |= 1;
        dnzk bZ2 = dnzl.c.bZ();
        dniu f = anru.f(dvywVar);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnzl dnzlVar = (dnzl) bZ2.b;
        f.getClass();
        dnzlVar.b = f;
        dnzlVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqv dnqvVar2 = (dnqv) bZ.b;
        dnzl bK = bZ2.bK();
        bK.getClass();
        dnqvVar2.c = bK;
        dnqvVar2.b = 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqv dnqvVar3 = (dnqv) bZ.b;
        dnqqVar.getClass();
        dnqvVar3.e = dnqqVar;
        dnqvVar3.a |= 8;
        dnqr bZ3 = dnrw.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnrw dnrwVar = (dnrw) bZ3.b;
        dnqv bK2 = bZ.bK();
        bK2.getClass();
        dnrwVar.b = bK2;
        dnrwVar.a = 9;
        u(new ankp(bZ3.bK(), dbpy.a, dbsg.i(dvywVar)), dnqhVar, dbsgVar);
    }

    @Override // defpackage.angp
    public final void k(dvay dvayVar, final dvay dvayVar2) {
        dcbg b2 = dcbg.b(dvayVar.o);
        dvayVar2.getClass();
        dcbg o = b2.o(dbst.a(new dbsl(dvayVar2) { // from class: anjs
            private final dvay a;

            {
                this.a = dvayVar2;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.equals((dvay) obj);
            }
        }));
        dsqp dsqpVar = (dsqp) dvayVar.cu(5);
        dsqpVar.bC(dvayVar);
        dval dvalVar = (dval) dsqpVar;
        if (dvalVar.c) {
            dvalVar.bF();
            dvalVar.c = false;
        }
        ((dvay) dvalVar.b).o = dvay.ck();
        if (dvalVar.c) {
            dvalVar.bF();
            dvalVar.c = false;
        }
        dvay dvayVar3 = (dvay) dvalVar.b;
        dvayVar3.c();
        dsod.bv(o, dvayVar3.o);
        dcdc e = dcdc.e();
        b.getClass();
        s(dvalVar.bK(), e, o.s(new dbrn() { // from class: anjt
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return anru.d((dvay) obj);
            }
        }).z());
    }

    @Override // defpackage.angp
    public final void l(dvay dvayVar, dvyw dvywVar) {
        if (anru.d(dvayVar).g.equals(dvywVar.g)) {
            return;
        }
        dcbg<dvyw> h = ankp.h(dvayVar);
        if (h.s(anju.a).l(dvywVar.g)) {
            return;
        }
        dsqp dsqpVar = (dsqp) dvayVar.cu(5);
        dsqpVar.bC(dvayVar);
        dval dvalVar = (dval) dsqpVar;
        dval bZ = dvay.u.bZ();
        dvap dvapVar = dvayVar.e;
        if (dvapVar == null) {
            dvapVar = dvap.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar2 = (dvay) bZ.b;
        dvapVar.getClass();
        dvayVar2.e = dvapVar;
        int i = dvayVar2.a | 2;
        dvayVar2.a = i;
        String str = dvywVar.i;
        str.getClass();
        dvayVar2.a = i | 16;
        dvayVar2.h = str;
        dvax dvaxVar = dvax.STOP;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar3 = (dvay) bZ.b;
        dvayVar3.m = dvaxVar.f;
        dvayVar3.a |= 64;
        dvay dvayVar4 = (dvay) bZ.b;
        dvayVar4.n = 2;
        dvayVar4.a |= 128;
        dvaq bZ2 = dvat.g.bZ();
        dvar bZ3 = dvas.g.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvas dvasVar = (dvas) bZ3.b;
        dvywVar.getClass();
        dvasVar.b = dvywVar;
        dvasVar.a |= 1;
        bZ2.a(bZ3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar5 = (dvay) bZ.b;
        dvat bK = bZ2.bK();
        bK.getClass();
        dvayVar5.c = bK;
        dvayVar5.b = 7;
        dvay bK2 = bZ.bK();
        if (dvalVar.c) {
            dvalVar.bF();
            dvalVar.c = false;
        }
        dvay dvayVar6 = (dvay) dvalVar.b;
        bK2.getClass();
        dvayVar6.c();
        dvayVar6.o.add(bK2);
        s(dvalVar.bK(), dcdc.f(dvywVar), h.z());
    }

    @Override // defpackage.angp
    public final void m(btlu btluVar, dnhz dnhzVar, dpwp dpwpVar, ango angoVar) {
        bulf a2 = this.h.a();
        a2.a().e = btluVar;
        bulh c = a2.c();
        dnrq bZ = dnrr.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnrr dnrrVar = (dnrr) bZ.b;
        dnhzVar.getClass();
        dnrrVar.b = dnhzVar;
        int i = dnrrVar.a | 1;
        dnrrVar.a = i;
        dpwpVar.getClass();
        dnrrVar.c = dpwpVar;
        dnrrVar.a = i | 2;
        dnqr bZ2 = dnrw.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnrw dnrwVar = (dnrw) bZ2.b;
        dnrr bK = bZ.bK();
        bK.getClass();
        dnrwVar.b = bK;
        dnrwVar.a = 13;
        ankp ankpVar = new ankp(bZ2.bK(), dbpy.a, dbpy.a);
        Executor g = this.d.g(bvrj.BACKGROUND_THREADPOOL);
        if (g == null) {
            bvoo.h("Background thread pool is null.", new Object[0]);
            return;
        }
        duyb w = w();
        if (w.c) {
            w.bF();
            w.c = false;
        }
        duyc duycVar = (duyc) w.b;
        duyc duycVar2 = duyc.h;
        duycVar.a |= 2;
        duycVar.d = false;
        w.a(ankpVar.c);
        dnwb dnwbVar = dnwb.i;
        if (w.c) {
            w.bF();
            w.c = false;
        }
        duyc duycVar3 = (duyc) w.b;
        dnwbVar.getClass();
        duycVar3.e = dnwbVar;
        duycVar3.a |= 4;
        dcdc.f(ankpVar);
        dcdc.f(ankpVar);
        c.b(w.bK(), new anjv(angoVar), g);
    }

    @Override // defpackage.angp
    public final void n(dvay dvayVar, int i, dnsf dnsfVar) {
        dvat dvatVar;
        dvat dvatVar2;
        long b2 = this.c.b();
        dvyw dvywVar = dvyw.bv;
        if (dvayVar.b == 7) {
            dvatVar = (dvat) dvayVar.c;
        } else {
            dvatVar = dvat.g;
        }
        if (dvatVar.b.size() > 0) {
            if (dvayVar.b == 7) {
                dvatVar2 = (dvat) dvayVar.c;
            } else {
                dvatVar2 = dvat.g;
            }
            dvywVar = dvatVar2.b.get(0).b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
        }
        dnrc g = ankp.g(dvayVar);
        dnqw bZ = dnqx.e.bZ();
        dnsc l = ankp.l(ankp.f(dvayVar), dvywVar, i, b2, dbsg.i(dvayVar.s));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqx dnqxVar = (dnqx) bZ.b;
        l.getClass();
        dnqxVar.b = l;
        dnqxVar.a |= 1;
        dnrd bK = g.bK();
        bK.getClass();
        dnqxVar.c = bK;
        dnqxVar.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqx dnqxVar2 = (dnqx) bZ.b;
        dnsfVar.getClass();
        dnqxVar2.d = dnsfVar;
        dnqxVar2.a |= 4;
        dnqr bZ2 = dnrw.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnrw dnrwVar = (dnrw) bZ2.b;
        dnqx bK2 = bZ.bK();
        bK2.getClass();
        dnrwVar.b = bK2;
        dnrwVar.a = 2;
        t(new ankp(bZ2.bK(), dbsg.i(dvayVar), dbsg.i(dvywVar)));
    }

    @Override // defpackage.angp
    public final void o(dvay dvayVar, dngq dngqVar, int i, dnsf dnsfVar) {
        dbsg i2;
        long b2 = this.c.b();
        dvax b3 = dvax.b(dvayVar.m);
        if (b3 == null) {
            b3 = dvax.UNKNOWN;
        }
        if (b3 != dvax.STOP) {
            Object[] objArr = new Object[1];
            dvax b4 = dvax.b(dvayVar.m);
            if (b4 == null) {
                b4 = dvax.UNKNOWN;
            }
            objArr[0] = b4;
            bvoo.h("Expected stop segment, got segment of type %s", objArr);
            i2 = dbpy.a;
        } else {
            dvyw d = anru.d(dvayVar);
            i2 = dbsg.i(ankp.d(ankp.l(ankp.f(dvayVar), d, ankp.n(dvayVar), b2, dbsg.i(dvayVar.s)), ankp.k(dngqVar, anru.f(d), i, b2, dbpy.a).bK(), dvayVar, dbsg.i(d), dbpy.a, dnsfVar));
        }
        if (!i2.a()) {
            bvoo.h("Can't create the metadata for modify stop segment duration edit.", new Object[0]);
        } else {
            t((anhm) i2.b());
        }
    }

    @Override // defpackage.angp
    public final void p(dvay dvayVar, dpop dpopVar, int i, dnsf dnsfVar) {
        dvak dvakVar;
        if (dvayVar.b == 9) {
            dvakVar = (dvak) dvayVar.c;
        } else {
            dvakVar = dvak.e;
        }
        dqjl b2 = dqjl.b(dvakVar.b);
        if (b2 == null) {
            b2 = dqjl.UNKNOWN_ACTIVITY_TYPE;
        }
        dbsg<ankp> j = ankp.j(dvayVar, dpopVar, b2, i, this.c.b(), dbpy.a, dnsfVar);
        if (!j.a()) {
            bvoo.h("Can't create the metadata for modify activity segment edit.", new Object[0]);
        } else {
            t(j.b());
        }
    }

    @Override // defpackage.angp
    public final void q(dvay dvayVar, int i, dpop dpopVar, dbsg<ango> dbsgVar, boolean z) {
        dbsg i2;
        long b2 = this.c.b();
        dvax b3 = dvax.b(dvayVar.m);
        if (b3 == null) {
            b3 = dvax.UNKNOWN;
        }
        if (b3 != dvax.STOP) {
            Object[] objArr = new Object[1];
            dvax b4 = dvax.b(dvayVar.m);
            if (b4 == null) {
                b4 = dvax.UNKNOWN;
            }
            objArr[0] = b4;
            bvoo.h("Expected stop segment, got segment of type %s", objArr);
            i2 = dbpy.a;
        } else {
            dvyw d = anru.d(dvayVar);
            dpop f = ankp.f(dvayVar);
            dpoo bZ = dpop.d.bZ();
            long max = Math.max(f.b, dpopVar.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpop dpopVar2 = (dpop) bZ.b;
            dpopVar2.a |= 1;
            dpopVar2.b = max;
            long min = Math.min(f.c, dpopVar.c);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpop dpopVar3 = (dpop) bZ.b;
            dpopVar3.a |= 2;
            dpopVar3.c = min;
            dnsc l = ankp.l(bZ.bK(), d, i, b2, dbsg.i(dvayVar.s));
            dnqr bZ2 = dnrw.c.bZ();
            dnro bZ3 = dnrp.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnrp dnrpVar = (dnrp) bZ3.b;
            l.getClass();
            dnrpVar.b = l;
            dnrpVar.a |= 2;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnrw dnrwVar = (dnrw) bZ2.b;
            dnrp bK = bZ3.bK();
            bK.getClass();
            dnrwVar.b = bK;
            dnrwVar.a = 1;
            i2 = dbsg.i(new ankp(bZ2.bK(), dbsg.i(dvayVar), dbsg.i(d)));
        }
        if (!i2.a()) {
            bvoo.h("Can't create the metadata for remove edit.", new Object[0]);
            return;
        }
        dcdc<anhm> f2 = dcdc.f((anhm) i2.b());
        dnqg bZ4 = dnqh.p.bZ();
        int i3 = ddfv.i.a;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ4.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i3;
        v(f2, bZ4.bK(), dbsgVar, z);
    }

    @Override // defpackage.angp
    public final void r(dbsg<dvay> dbsgVar, dngq dngqVar, dvyw dvywVar, int i, dbsg<String> dbsgVar2, dnqm dnqmVar, dbsg<ango> dbsgVar3, boolean z) {
        dvak dvakVar;
        long b2 = this.c.b();
        dbsg i2 = dbsg.i(dnqmVar);
        dnsb k = ankp.k(dngqVar, anru.f(dvywVar), i, b2, dbsgVar2);
        dnqy bZ = dnqz.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqz dnqzVar = (dnqz) bZ.b;
        dnsc bK = k.bK();
        bK.getClass();
        dnqzVar.b = bK;
        int i3 = 1;
        dnqzVar.a |= 1;
        if (dbsgVar.a()) {
            dpoo bZ2 = dpop.d.bZ();
            dwyn dwynVar = dbsgVar.b().f;
            if (dwynVar == null) {
                dwynVar = dwyn.d;
            }
            long j = dwynVar.b * 1000;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpop dpopVar = (dpop) bZ2.b;
            dpopVar.a |= 1;
            dpopVar.b = j;
            dwyn dwynVar2 = dbsgVar.b().g;
            if (dwynVar2 == null) {
                dwynVar2 = dwyn.d;
            }
            long j2 = dwynVar2.b * 1000;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpop dpopVar2 = (dpop) bZ2.b;
            dpopVar2.a |= 2;
            dpopVar2.c = j2;
            dpop bK2 = bZ2.bK();
            dvay b3 = dbsgVar.b();
            if (b3.b == 9) {
                dvakVar = (dvak) b3.c;
            } else {
                dvakVar = dvak.e;
            }
            dqjl b4 = dqjl.b(dvakVar.b);
            if (b4 == null) {
                b4 = dqjl.UNKNOWN_ACTIVITY_TYPE;
            }
            if (true == dbsgVar.b().r) {
                i3 = 2;
            }
            dnsc m = ankp.m(bK2, b4, i3, b2, dbpy.a);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqz dnqzVar2 = (dnqz) bZ.b;
            m.getClass();
            dnqzVar2.c = m;
            dnqzVar2.a |= 2;
        }
        dnqm dnqmVar2 = (dnqm) ((dbsu) i2).a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqz dnqzVar3 = (dnqz) bZ.b;
        dnqmVar2.getClass();
        dnqzVar3.d = dnqmVar2;
        dnqzVar3.a |= 4;
        dnqr bZ3 = dnrw.c.bZ();
        dnqz bK3 = bZ.bK();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnrw dnrwVar = (dnrw) bZ3.b;
        bK3.getClass();
        dnrwVar.b = bK3;
        dnrwVar.a = 4;
        dcdc<anhm> f = dcdc.f(new ankp(bZ3.bK(), dbpy.a, dbsg.i(dvywVar)));
        dnqg bZ4 = dnqh.p.bZ();
        int i4 = ddfv.i.a;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ4.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i4;
        v(f, bZ4.bK(), dbsgVar3, z);
    }
}
