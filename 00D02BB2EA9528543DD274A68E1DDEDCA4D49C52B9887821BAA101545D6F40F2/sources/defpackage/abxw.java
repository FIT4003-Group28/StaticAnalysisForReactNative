package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.ar.core.ImageMetadata;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abxw  reason: default package */
/* loaded from: classes2.dex */
public final class abxw implements abwq {
    public final abyc a;
    private final abys c;
    private final Executor d;
    private final bvrb e;
    private final abxu<acei> f = new abxu<>();
    private final abxu<dcdc<aced>> g = new abxu<>();
    private final abxu<dcdc<aceh>> h = new abxu<>();
    private final abxu<awwb> i = new abxu<>();
    private final CopyOnWriteArrayList<WeakReference<abwp>> j = new CopyOnWriteArrayList<>();
    public abxy b = new abxy();

    public abxw(abys abysVar, abyc abycVar, bvrb bvrbVar) {
        this.c = abysVar;
        this.d = bvrbVar.h();
        this.e = bvrbVar;
        this.a = abycVar;
    }

    public static btzy m(Throwable th) {
        if (!(th instanceof btzz)) {
            return btzy.a;
        }
        return ((btzz) th).a;
    }

    private final synchronized void n(dhjx dhjxVar, dqmi dqmiVar, dqlu dqluVar) {
        bvrj.UI_THREAD.c();
        deha.q(this.c.b(acem.a(dhjxVar, dqluVar, dqmiVar), abyl.a), this.g.a(new bvqg(this) { // from class: abxc
            private final abxw a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                abxw abxwVar = this.a;
                dcdc dcdcVar = (dcdc) obj;
                abxy abxyVar = abxwVar.b;
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    aced acedVar = (aced) dcdcVar.get(i);
                    abxyVar.a.put(new abwt(acedVar.a(), acedVar.c().d()), acedVar);
                }
                abxwVar.l(abxf.a);
            }
        }, abxd.a), this.d);
    }

    @Override // defpackage.abwq
    public final void a(abwp abwpVar) {
        this.j.add(new WeakReference<>(abwpVar));
    }

    @Override // defpackage.abwq
    public final void b(abwp abwpVar) {
        Iterator<WeakReference<abwp>> it = this.j.iterator();
        while (it.hasNext()) {
            WeakReference<abwp> next = it.next();
            abwp abwpVar2 = next.get();
            if (abwpVar2 == null || abwpVar2 == abwpVar) {
                this.j.remove(next);
            }
        }
    }

    @Override // defpackage.abwq
    public final void c() {
        dehn b;
        bvrj.UI_THREAD.c();
        cryz<acei> cryzVar = this.f.a;
        if ((cryzVar == null || cryzVar.d()) && this.c.a()) {
            abys abysVar = this.c;
            if (!abysVar.a()) {
                b = deha.c();
            } else {
                dhjx a = abysVar.c.a();
                dbsk.s(a);
                String b2 = abysVar.c.b();
                dqmi c = abysVar.c.c();
                dbsk.s(c);
                b = abysVar.b(acem.c(a, b2, c, abysVar.c.e()), abyk.a);
            }
            deha.q(b, this.f.a(new bvqg(this) { // from class: abxa
                private final abxw a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    abxw abxwVar = this.a;
                    acei aceiVar = (acei) obj;
                    acei e = abxwVar.e();
                    dccx F = dcdc.F();
                    F.i(e.c());
                    F.i(aceiVar.c());
                    abxwVar.k(new aceb(aceiVar.a(), aceiVar.b(), F.f(), aceiVar.d(), aceiVar.e()));
                }
            }, new bvqg(this) { // from class: abxb
                private final abxw a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    abxw abxwVar = this.a;
                    btzy m = abxw.m((Throwable) obj);
                    if (!m.equals(btzy.k)) {
                        return;
                    }
                    abxwVar.k(acei.h(m));
                }
            }), this.d);
        }
    }

    @Override // defpackage.abwq
    public final void d() {
        bvrj.UI_THREAD.c();
        abxy abxyVar = this.b;
        final dhjx dhjxVar = abxyVar.d;
        dqlu dqluVar = abxyVar.c;
        dqmi dqmiVar = abxyVar.g;
        if (!abxyVar.e) {
            abxyVar.e = true;
            n(dhjxVar, dqmiVar, dqluVar);
            bvrj.UI_THREAD.c();
            this.b.b = acei.g();
            l(abwy.a);
            abys abysVar = this.c;
            abyq f = abyr.f();
            ((abwv) f).d = false;
            abysVar.c = f.a();
            final dehn b = abysVar.b(acem.c(dhjxVar, null, dqmiVar, dqluVar), abyj.a);
            if (dqmiVar != dqmi.BEST && this.b.c.a != 3) {
                final deig d = deig.d();
                this.e.b(new Runnable(this, d, dhjxVar) { // from class: abxn
                    private final abxw a;
                    private final deig b;
                    private final dhjx c;

                    {
                        this.a = this;
                        this.b = d;
                        this.c = dhjxVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        abyc abycVar;
                        dhjx dhjxVar2;
                        dced<akqi, bbtm> dcedVar;
                        Iterator<akqi> it;
                        abxw abxwVar = this.a;
                        deig deigVar = this.b;
                        dhjx dhjxVar3 = this.c;
                        abyc abycVar2 = abxwVar.a;
                        bvrj.UI_THREAD.d();
                        dcdd a = dcde.a();
                        ArrayList arrayList = new ArrayList();
                        String o = abycVar2.b.o();
                        if (o != null) {
                            dced<akqi, bbtm> b2 = ((bbrq) abycVar2.a).k.b(o, a.a());
                            Iterator<akqi> it2 = b2.J().iterator();
                            while (it2.hasNext()) {
                                akqi next = it2.next();
                                for (bbtm bbtmVar : b2.f(next)) {
                                    Long b3 = bbtmVar.b();
                                    dbsg<akqq> o2 = bbtmVar.o();
                                    if (o2.a() && b3 != null) {
                                        if (akyx.m(dhjxVar3).b(akra.f(o2.b()).S())) {
                                            if (!Boolean.valueOf(((int) TimeUnit.MILLISECONDS.toSeconds(abycVar2.c.b() - b3.longValue())) > 600).booleanValue()) {
                                                akqq b4 = o2.b();
                                                btlu j = abycVar2.b.j();
                                                dggc dggcVar = bbtmVar.j().a() ? dggc.VIDEO : dggc.PHOTO;
                                                dwfi bZ = dwfl.w.bZ();
                                                if (dggcVar == dggc.VIDEO) {
                                                    dkdz bZ2 = dkea.d.bZ();
                                                    dkeb bZ3 = dkec.f.bZ();
                                                    abycVar = abycVar2;
                                                    String b5 = bbtmVar.q().b();
                                                    dhjxVar2 = dhjxVar3;
                                                    if (bZ3.c) {
                                                        bZ3.bF();
                                                        bZ3.c = false;
                                                    }
                                                    dkec dkecVar = (dkec) bZ3.b;
                                                    b5.getClass();
                                                    dcedVar = b2;
                                                    dkecVar.a |= 8;
                                                    dkecVar.e = b5;
                                                    dkec bK = bZ3.bK();
                                                    if (bZ2.c) {
                                                        bZ2.bF();
                                                        bZ2.c = false;
                                                    }
                                                    dkea dkeaVar = (dkea) bZ2.b;
                                                    bK.getClass();
                                                    dkeaVar.b();
                                                    dkeaVar.c.add(bK);
                                                    dkea bK2 = bZ2.bK();
                                                    if (bZ.c) {
                                                        bZ.bF();
                                                        bZ.c = false;
                                                    }
                                                    dwfl dwflVar = (dwfl) bZ.b;
                                                    bK2.getClass();
                                                    dwflVar.j = bK2;
                                                    dwflVar.a |= 512;
                                                } else {
                                                    abycVar = abycVar2;
                                                    dhjxVar2 = dhjxVar3;
                                                    dcedVar = b2;
                                                }
                                                if (bbtmVar.l().a()) {
                                                    String b6 = bbtmVar.l().b();
                                                    if (bZ.c) {
                                                        bZ.bF();
                                                        bZ.c = false;
                                                    }
                                                    dwfl dwflVar2 = (dwfl) bZ.b;
                                                    b6.getClass();
                                                    dwflVar2.a |= 4;
                                                    dwflVar2.d = b6;
                                                }
                                                String valueOf = String.valueOf(bbtmVar.z());
                                                if (bZ.c) {
                                                    bZ.bF();
                                                    bZ.c = false;
                                                }
                                                dwfl dwflVar3 = (dwfl) bZ.b;
                                                valueOf.getClass();
                                                dwflVar3.a |= 128;
                                                dwflVar3.h = valueOf;
                                                dpsm bZ4 = dpsn.d.bZ();
                                                long j2 = next.b;
                                                if (bZ4.c) {
                                                    bZ4.bF();
                                                    bZ4.c = false;
                                                }
                                                dpsn dpsnVar = (dpsn) bZ4.b;
                                                int i = dpsnVar.a | 1;
                                                dpsnVar.a = i;
                                                dpsnVar.b = j2;
                                                long j3 = next.c;
                                                dpsnVar.a = i | 2;
                                                dpsnVar.c = j3;
                                                if (bZ.c) {
                                                    bZ.bF();
                                                    bZ.c = false;
                                                }
                                                dwfl dwflVar4 = (dwfl) bZ.b;
                                                dpsn bK3 = bZ4.bK();
                                                bK3.getClass();
                                                dwflVar4.t = bK3;
                                                dwflVar4.a |= ImageMetadata.LENS_APERTURE;
                                                dizg bZ5 = dizh.j.bZ();
                                                dghj bZ6 = dghk.g.bZ();
                                                if (bZ6.c) {
                                                    bZ6.bF();
                                                    bZ6.c = false;
                                                }
                                                dghk dghkVar = (dghk) bZ6.b;
                                                dghkVar.b = dggcVar.f;
                                                dghkVar.a |= 2;
                                                dghk bK4 = bZ6.bK();
                                                if (bZ5.c) {
                                                    bZ5.bF();
                                                    bZ5.c = false;
                                                }
                                                dizh dizhVar = (dizh) bZ5.b;
                                                bK4.getClass();
                                                dizhVar.c = bK4;
                                                dizhVar.a |= 2;
                                                Long b7 = bbtmVar.b();
                                                if (b7 != null) {
                                                    diir bZ7 = diis.h.bZ();
                                                    eaol eaolVar = new eaol(b7.longValue(), eaou.b);
                                                    dhpe bZ8 = dhpf.i.bZ();
                                                    int y = eaolVar.y();
                                                    if (bZ8.c) {
                                                        bZ8.bF();
                                                        bZ8.c = false;
                                                    }
                                                    dhpf dhpfVar = (dhpf) bZ8.b;
                                                    it = it2;
                                                    dhpfVar.a |= 1;
                                                    dhpfVar.b = y;
                                                    int z = eaolVar.z();
                                                    if (bZ8.c) {
                                                        bZ8.bF();
                                                        bZ8.c = false;
                                                    }
                                                    dhpf dhpfVar2 = (dhpf) bZ8.b;
                                                    dhpfVar2.a |= 2;
                                                    dhpfVar2.c = z;
                                                    int A = eaolVar.A();
                                                    if (bZ8.c) {
                                                        bZ8.bF();
                                                        bZ8.c = false;
                                                    }
                                                    dhpf dhpfVar3 = (dhpf) bZ8.b;
                                                    dhpfVar3.a |= 4;
                                                    dhpfVar3.d = A;
                                                    int C = eaolVar.C();
                                                    if (bZ8.c) {
                                                        bZ8.bF();
                                                        bZ8.c = false;
                                                    }
                                                    dhpf dhpfVar4 = (dhpf) bZ8.b;
                                                    dhpfVar4.a |= 8;
                                                    dhpfVar4.e = C;
                                                    int D = eaolVar.D();
                                                    if (bZ8.c) {
                                                        bZ8.bF();
                                                        bZ8.c = false;
                                                    }
                                                    dhpf dhpfVar5 = (dhpf) bZ8.b;
                                                    dhpfVar5.a |= 16;
                                                    dhpfVar5.f = D;
                                                    dhpf bK5 = bZ8.bK();
                                                    if (bZ7.c) {
                                                        bZ7.bF();
                                                        bZ7.c = false;
                                                    }
                                                    diis diisVar = (diis) bZ7.b;
                                                    bK5.getClass();
                                                    diisVar.e = bK5;
                                                    diisVar.a |= 2;
                                                    if (bZ5.c) {
                                                        bZ5.bF();
                                                        bZ5.c = false;
                                                    }
                                                    dizh dizhVar2 = (dizh) bZ5.b;
                                                    diis bK6 = bZ7.bK();
                                                    bK6.getClass();
                                                    dizhVar2.g = bK6;
                                                    dizhVar2.a |= 16;
                                                } else {
                                                    it = it2;
                                                }
                                                if (bbtmVar.p().a()) {
                                                    dlwj bZ9 = dlwk.g.bZ();
                                                    String b8 = bbtmVar.p().b();
                                                    if (bZ9.c) {
                                                        bZ9.bF();
                                                        bZ9.c = false;
                                                    }
                                                    dlwk dlwkVar = (dlwk) bZ9.b;
                                                    b8.getClass();
                                                    dlwkVar.a |= 8;
                                                    dlwkVar.f = b8;
                                                    if (bZ5.c) {
                                                        bZ5.bF();
                                                        bZ5.c = false;
                                                    }
                                                    dizh dizhVar3 = (dizh) bZ5.b;
                                                    dlwk bK7 = bZ9.bK();
                                                    bK7.getClass();
                                                    dizhVar3.d = bK7;
                                                    dizhVar3.a |= 4;
                                                }
                                                if (bZ.c) {
                                                    bZ.bF();
                                                    bZ.c = false;
                                                }
                                                dwfl dwflVar5 = (dwfl) bZ.b;
                                                dizh bK8 = bZ5.bK();
                                                bK8.getClass();
                                                dwflVar5.p = bK8;
                                                dwflVar5.a |= 32768;
                                                if (j != null && btlu.i(j).equals(btlt.GOOGLE)) {
                                                    dnpp bZ10 = dnpq.g.bZ();
                                                    String v = j.v();
                                                    String str = j.i;
                                                    if (v != null) {
                                                        if (bZ10.c) {
                                                            bZ10.bF();
                                                            bZ10.c = false;
                                                        }
                                                        dnpq dnpqVar = (dnpq) bZ10.b;
                                                        v.getClass();
                                                        dnpqVar.a |= 8;
                                                        dnpqVar.d = v;
                                                    }
                                                    if (str != null) {
                                                        if (bZ10.c) {
                                                            bZ10.bF();
                                                            bZ10.c = false;
                                                        }
                                                        dnpq dnpqVar2 = (dnpq) bZ10.b;
                                                        str.getClass();
                                                        dnpqVar2.a |= 16;
                                                        dnpqVar2.e = str;
                                                    }
                                                    dwfg bZ11 = dwfh.d.bZ();
                                                    dnpq bK9 = bZ10.bK();
                                                    if (bZ11.c) {
                                                        bZ11.bF();
                                                        bZ11.c = false;
                                                    }
                                                    dwfh dwfhVar = (dwfh) bZ11.b;
                                                    bK9.getClass();
                                                    dwfhVar.c = bK9;
                                                    dwfhVar.a |= 2;
                                                    dwfh bK10 = bZ11.bK();
                                                    if (bZ.c) {
                                                        bZ.bF();
                                                        bZ.c = false;
                                                    }
                                                    dwfl dwflVar6 = (dwfl) bZ.b;
                                                    bK10.getClass();
                                                    dwflVar6.k = bK10;
                                                    dwflVar6.a |= 1024;
                                                }
                                                dhjw bZ12 = dhjx.f.bZ();
                                                dhjz i2 = b4.i();
                                                if (bZ12.c) {
                                                    bZ12.bF();
                                                    bZ12.c = false;
                                                }
                                                dhjx dhjxVar4 = (dhjx) bZ12.b;
                                                i2.getClass();
                                                dhjxVar4.b = i2;
                                                dhjxVar4.a |= 1;
                                                if (bZ.c) {
                                                    bZ.bF();
                                                    bZ.c = false;
                                                }
                                                dwfl dwflVar7 = (dwfl) bZ.b;
                                                dhjx bK11 = bZ12.bK();
                                                bK11.getClass();
                                                dwflVar7.m = bK11;
                                                dwflVar7.a |= 4096;
                                                dwfl bK12 = bZ.bK();
                                                long longValue = b3.longValue();
                                                dpub bZ13 = dpuc.c.bZ();
                                                if (bZ13.c) {
                                                    bZ13.bF();
                                                    bZ13.c = false;
                                                }
                                                dpuc dpucVar = (dpuc) bZ13.b;
                                                dpucVar.a |= 1;
                                                dpucVar.b = longValue;
                                                dpuc bK13 = bZ13.bK();
                                                dqll bZ14 = dqlo.d.bZ();
                                                if (bZ14.c) {
                                                    bZ14.bF();
                                                    bZ14.c = false;
                                                }
                                                dqlo dqloVar = (dqlo) bZ14.b;
                                                bK13.getClass();
                                                dqloVar.b = bK13;
                                                dqloVar.a |= 1;
                                                dqlo dqloVar2 = (dqlo) bZ14.b;
                                                dqloVar2.c = 3;
                                                dqloVar2.a |= 2;
                                                arrayList.add(acej.c(bK12, dbsg.i(bZ14.bK())));
                                                dhjxVar3 = dhjxVar2;
                                                abycVar2 = abycVar;
                                                b2 = dcedVar;
                                                it2 = it;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        deigVar.j(dcdc.w(new abyb(), dcdc.r(arrayList)));
                    }
                }, bvrj.BACKGROUND_THREADPOOL);
                degy m = deha.m(b, d);
                Callable callable = new Callable(b, d) { // from class: abxi
                    private final dehn a;
                    private final dehn b;

                    {
                        this.a = b;
                        this.b = d;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dehn dehnVar = this.a;
                        dehn dehnVar2 = this.b;
                        acei aceiVar = (acei) deha.s(dehnVar);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        dcdc SL = ((dcdc) deha.s(dehnVar2)).SL();
                        int size = SL.size();
                        for (int i = 0; i < size; i++) {
                            acej acejVar = (acej) SL.get(i);
                            linkedHashMap.put(acejVar.d(), acejVar);
                        }
                        dcdc<acej> c = aceiVar.c();
                        int size2 = c.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            acej acejVar2 = c.get(i2);
                            linkedHashMap.put(acejVar2.d(), acejVar2);
                        }
                        dcdc r = dcdc.r(linkedHashMap.values());
                        int size3 = r.size();
                        int size4 = aceiVar.c().size();
                        return new aceb(aceiVar.a(), aceiVar.b() + (size3 - size4), r, aceiVar.d(), null);
                    }
                };
                Executor g = this.e.g(bvrj.BACKGROUND_THREADPOOL);
                dbsk.s(g);
                b = m.b(callable, g);
            }
            deha.q(b, this.f.a(new bvqg(this) { // from class: abxs
                private final abxw a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.k((acei) obj);
                }
            }, new bvqg(this) { // from class: abwz
                private final abxw a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.k(acei.h(abxw.m((Throwable) obj)));
                }
            }), this.d);
        }
        abxy abxyVar2 = this.b;
        if (!abxyVar2.f) {
            abxyVar2.f = true;
            l(abxq.a);
            if (!dqluVar.equals(abys.b)) {
                bvrj.UI_THREAD.c();
                abys abysVar2 = this.c;
                btvo btvoVar = abysVar2.d;
                deha.q(abysVar2.b(acem.b(dhjxVar, dqmiVar), abym.a), this.h.a(new bvqg(this) { // from class: abxl
                    private final abxw a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        abxw abxwVar = this.a;
                        abxwVar.b.a((dcdc) obj);
                        abxwVar.l(abxk.a);
                    }
                }, new bvqg(this) { // from class: abxm
                    private final abxw a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        abxw abxwVar = this.a;
                        abxw.m((Throwable) obj);
                        abxwVar.b.a(dcdc.e());
                        abxwVar.l(abxj.a);
                    }
                }), this.d);
            }
        }
        bvrj.UI_THREAD.c();
        abys abysVar3 = this.c;
        awws u = awwt.u();
        u.t(dcdc.f("visual_explore_immersive"));
        u.e(awvv.a);
        awwt a = u.a();
        awvw f2 = awvx.f();
        f2.e(a);
        f2.b(dhjxVar);
        GmmLocation a2 = abysVar3.f.a().a();
        if (a2 != null) {
            f2.d(a2);
        }
        deha.q(abysVar3.e.b(f2.a()), this.i.a(new bvqg(this) { // from class: abxo
            private final abxw a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.l(new abxv((dvha) ((awwb) obj).a(awvv.a).f()) { // from class: abxh
                    private final dvha a;

                    {
                        this.a = r1;
                    }

                    @Override // defpackage.abxv
                    public final void a(abwp abwpVar) {
                        abwpVar.d(this.a);
                    }
                });
            }
        }, new bvqg(this) { // from class: abxp
            private final abxw a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                Throwable th = (Throwable) obj;
                this.a.l(abxg.a);
            }
        }), this.d);
    }

    @Override // defpackage.abwq
    public final acei e() {
        return this.b.b;
    }

    @Override // defpackage.abwq
    public final void f() {
        bvrj.UI_THREAD.c();
        abxy abxyVar = this.b;
        abxyVar.e = false;
        abxyVar.f = false;
    }

    @Override // defpackage.abwq
    public final void g(dhjx dhjxVar) {
        dqlt dqltVar;
        bvrj.UI_THREAD.c();
        abxy abxyVar = this.b;
        if (!abxyVar.d.equals(dhjxVar)) {
            abxyVar.d = dhjxVar;
            abxyVar.e = false;
            abxyVar.f = false;
            abxx abxxVar = abxyVar.h;
            dqlu dqluVar = abxyVar.c;
            if (dqluVar.a == 3) {
                dqltVar = (dqlt) dqluVar.b;
            } else {
                dqltVar = dqlt.c;
            }
            abxyVar.h = new abxx(abxxVar.a, abxx.a(abxxVar.c, dqltVar.b));
        }
    }

    @Override // defpackage.abwq
    public final void h(dqlu dqluVar) {
        bvrj.UI_THREAD.c();
        abxy abxyVar = this.b;
        if (!abxyVar.c.equals(dqluVar)) {
            if ((abxyVar.c.a != 3 || dqluVar.a != 1) && dqluVar.a != 3) {
                abxyVar.f = false;
                abxyVar.h = abxx.b();
            }
            abxyVar.c = dqluVar;
            abxyVar.e = false;
            abxyVar.a.evictAll();
        }
        if (abxyVar.e || !abxyVar.f) {
            return;
        }
        l(abxr.a);
    }

    @Override // defpackage.abwq
    public final dcdc<aceh> i() {
        return this.b.h.c;
    }

    @Override // defpackage.abwq
    public final dbsg<dspd> j() {
        bvrj.UI_THREAD.c();
        dqlu dqluVar = this.b.c;
        return dqluVar.a == 3 ? dbsg.i(((dqlt) dqluVar.b).b) : dbpy.a;
    }

    public final void k(acei aceiVar) {
        this.b.b = aceiVar;
        l(abxe.a);
    }

    public final void l(abxv abxvVar) {
        Iterator<WeakReference<abwp>> it = this.j.iterator();
        while (it.hasNext()) {
            WeakReference<abwp> next = it.next();
            abwp abwpVar = next.get();
            if (abwpVar != null) {
                abxvVar.a(abwpVar);
            } else {
                this.j.remove(next);
            }
        }
    }
}
