package defpackage;

import android.app.Application;
import android.text.Html;
import com.google.ar.core.ImageMetadata;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brlu  reason: default package */
/* loaded from: classes4.dex */
public class brlu extends iqw {
    private static final dcqe s = dcqe.c("brlu");
    @dzsi
    private String A;
    @dzsi
    private transient amsy D;
    @dzsi
    private transient djrs E;
    @dzsi
    private transient dhyf F;
    @dzsi
    private transient djrs G;
    @dzsi
    private transient djrs H;
    @dzsi
    private transient dpns I;
    private bvrt<dndp> K;
    @dzsi
    private dkee L;
    @dzsi
    private dspd M;
    private boolean N;
    private boolean O;
    @dzsi
    private bvrt<dwij> P;
    @dzsi
    private bvrt<dqgj> R;
    @dzsi
    private bvrt<dpnq> S;
    @dzsi
    private bvrt<dfzq> T;
    @dzsi
    private bvrt<dfpo> W;
    @dzsi
    public String a;
    @dzsi
    private int aa;
    @dzsi
    public String b;
    public boolean c;
    public boolean d;
    public boolean g;
    public boolean h;
    public boolean i;
    @dzsi
    public bvrt<dhjx> j;
    @dzsi
    public bvrt<dwhp> k;
    @dzsi
    public bvrt<djqm> l;
    @dzsi
    public bvrt<dqdk> m;
    @dzsi
    public bvrt<dqim> n;
    private boolean t = false;
    private int u = 0;
    private dbsg<Integer> v = dbpy.a;
    private boolean w = false;
    private boolean x = false;
    @dzsi
    private bttq y = null;
    private List<broc> z = dchl.a();
    @dzsi
    private transient dwiv B = dwiv.M;
    @dzsi
    private transient dwif C = null;
    private bvrt<doed> J = bvrt.b(doed.c);
    public boolean e = true;
    public boolean f = true;
    private bvrt<dwix> Q = bvrt.b(dwix.h);
    public bsjm o = new bsjm();
    private final List<broh> U = dchl.a();
    public transient dcdc<dqfg> p = dcdc.e();
    private final List<bvrt<dmni>> V = dchl.a();
    private List<brof> X = dchl.a();
    public boolean q = true;
    private boolean Y = false;
    private List<brof> Z = dchl.a();
    public final Map<bwrs<ilo>, brlt> r = new HashMap();

    private final synchronized boolean aH(int i) {
        boolean z;
        if (i >= 0) {
            if (i < d()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @dzsi
    private final synchronized broh aI() {
        for (int i = 0; i < E(); i++) {
            broh D = D(i);
            if (aP(D)) {
                return D;
            }
        }
        return null;
    }

    private final synchronized void aJ(ilo iloVar, int i) {
        int o = o(iloVar);
        if (o >= 0 && o < E()) {
            k(o, i);
            this.U.add(i, this.U.remove(o));
        }
    }

    private final synchronized List<ilo> aK(List<ilo> list) {
        ArrayList f;
        ilo d;
        HashSet hashSet = new HashSet();
        for (broh brohVar : this.U) {
            if (aP(brohVar) && (d = brohVar.d()) != null) {
                akqi ai = d.ai();
                if (akqi.d(ai)) {
                    hashSet.add(Long.valueOf(ai.c));
                }
            }
        }
        f = dchl.f(list.size());
        for (ilo iloVar : list) {
            akqi ai2 = iloVar.ai();
            if (!akqi.d(ai2) || iloVar.aM() || !hashSet.contains(Long.valueOf(ai2.c))) {
                f.add(iloVar);
            }
        }
        return f;
    }

    private static List<ilo> aL(dwiv dwivVar, @dzsi Application application, String str) {
        dsrj<dvyw> dsrjVar = dwivVar.c;
        ArrayList f = dchl.f(dsrjVar.size());
        for (dvyw dvywVar : dsrjVar) {
            f.add(aM(dvywVar, application, str));
        }
        return f;
    }

    private static ilo aM(dvyw dvywVar, @dzsi Application application, String str) {
        ily ilyVar = new ily();
        ilyVar.E(dvywVar);
        if (!dbsj.d(str)) {
            ilyVar.t = str;
        }
        if ((dvywVar.d & 131072) != 0) {
            ila ilaVar = new ila();
            dvwr dvwrVar = dvywVar.bj;
            if (dvwrVar == null) {
                dvwrVar = dvwr.b;
            }
            ilaVar.a = bvrt.a(dvwrVar);
            ilyVar.L = new ilb(ilaVar.a);
        }
        ilo d = ilyVar.d();
        if (application == null || !d.cu() || d.bi() || d.an()) {
            return d;
        }
        String str2 = (String) brlj.a(application, dbsg.i(Integer.valueOf(d.cv())), false).first;
        dpxf cz = d.cz();
        dsqp dsqpVar = (dsqp) cz.cu(5);
        dsqpVar.bC(cz);
        dpxc dpxcVar = (dpxc) dsqpVar;
        if (dpxcVar.c) {
            dpxcVar.bF();
            dpxcVar.c = false;
        }
        dpxf dpxfVar = (dpxf) dpxcVar.b;
        dpxf dpxfVar2 = dpxf.f;
        str2.getClass();
        dpxfVar.a |= 2;
        dpxfVar.c = str2;
        dpxf bK = dpxcVar.bK();
        ily g = d.g();
        dvyw h = d.h();
        dsqp dsqpVar2 = (dsqp) h.cu(5);
        dsqpVar2.bC(h);
        dvya dvyaVar = (dvya) dsqpVar2;
        if (dvyaVar.c) {
            dvyaVar.bF();
            dvyaVar.c = false;
        }
        dvyw dvywVar2 = (dvyw) dvyaVar.b;
        bK.getClass();
        dvywVar2.az = bK;
        dvywVar2.c |= 512;
        g.E(dvyaVar.bK());
        return g.d();
    }

    private final synchronized void aN(List<ilo> list) {
        dcdn D = dcbg.b(list).o(brlq.a).D(brlr.a);
        Iterator<broh> it = this.U.iterator();
        while (it.hasNext()) {
            broh next = it.next();
            ilo d = next.d();
            if (d != null && d.bS().a()) {
                akqi ai = d.ai();
                if (!akqi.d(ai) || !D.containsKey(Long.valueOf(ai.c))) {
                    it.remove();
                    l(d);
                    m(d);
                } else {
                    ilo iloVar = (ilo) D.get(Long.valueOf(ai.c));
                    dbsk.s(iloVar);
                    aO(next, d, iloVar.bS());
                }
            }
        }
    }

    private final synchronized void aO(broh brohVar, ilo iloVar, dbsg<dnng> dbsgVar) {
        broh broeVar;
        if (!dbsgVar.a()) {
            return;
        }
        iloVar.bR(dbsgVar.b());
        if (brohVar.a()) {
            broeVar = new brog(bwrs.a(iloVar));
        } else {
            broeVar = new broe(bwrs.a(iloVar));
        }
        List<broh> list = this.U;
        list.set(list.indexOf(brohVar), broeVar);
        int n = n(iloVar);
        if (n >= 0 && n < g()) {
            j(n, iloVar);
        }
        C(iloVar);
    }

    private static boolean aP(broh brohVar) {
        return !brohVar.a() && brohVar.c();
    }

    public final synchronized broh D(int i) {
        if (this.h) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        return this.U.get(i);
    }

    public final synchronized int E() {
        if (this.h) {
            return 0;
        }
        return this.U.size();
    }

    @dzsi
    public final synchronized ilo F() {
        broh aI = aI();
        if (aI != null) {
            return aI.d();
        }
        return null;
    }

    public final synchronized List<ilo> G() {
        ArrayList a;
        a = dchl.a();
        for (int i = 0; i < E(); i++) {
            broh D = D(i);
            if (aP(D)) {
                a.add(D.d());
            }
        }
        return a;
    }

    public final boolean H() {
        return this.l != null;
    }

    public final synchronized void I(dwiv dwivVar, @dzsi Application application, int i, btvo btvoVar) {
        J(dwivVar, application, i, btvoVar, "");
    }

    public final synchronized void J(dwiv dwivVar, @dzsi Application application, int i, @dzsi btvo btvoVar, String str) {
        dbsg<Integer> dbsgVar;
        int a;
        akqi f;
        brof broiVar;
        if (dwivVar == null) {
            return;
        }
        this.B = dwivVar;
        this.A = dwivVar.q;
        if ((dwivVar.a & 64) != 0) {
            dwib dwibVar = dwivVar.i;
            if (dwibVar == null) {
                dwibVar = dwib.b;
            }
            this.a = Html.fromHtml(dwibVar.a).toString();
        }
        doed doedVar = dwivVar.n;
        if (doedVar == null) {
            doedVar = doed.c;
        }
        this.J = bvrt.b(doedVar);
        bsjm bsjmVar = this.o;
        djnc djncVar = dwivVar.v;
        if (djncVar == null) {
            djncVar = djnc.b;
        }
        djnk djnkVar = djncVar.a;
        if (djnkVar == null) {
            djnkVar = djnk.f;
        }
        bsjmVar.a(djnkVar);
        int a2 = dwiu.a(dwivVar.r);
        if (a2 == 0) {
            a2 = 1;
        }
        this.aa = a2;
        bvrt<dhjx> bvrtVar = null;
        switch (a2 - 1) {
            case 0:
                this.L = null;
                break;
            case 1:
            case 9:
                this.L = dkee.COMMODITY;
                break;
            case 2:
                this.L = dkee.RICH;
                break;
            case 3:
                this.L = dkee.LEAN;
                break;
            case 4:
                this.L = dkee.CHAIN;
                break;
            case 5:
                this.L = dkee.DINING;
                break;
            case 6:
                this.L = dkee.PARKING;
                break;
            case 7:
                this.L = dkee.HOTEL;
                break;
            case 8:
                this.L = dkee.HOTEL_CHAIN;
                break;
            case 10:
                this.L = dkee.SHOPPING;
                break;
            default:
                this.L = dkee.TRANSIT;
                break;
        }
        this.M = dwivVar.C;
        this.c = dwivVar.D;
        this.O = dwivVar.p;
        this.g = dwivVar.u;
        List<ilo> a3 = dchl.a();
        dvus dvusVar = dwivVar.h;
        if (dvusVar == null) {
            dvusVar = dvus.c;
        }
        List<broh> list = this.U;
        dvuw dvuwVar = dvusVar.b;
        if (dvuwVar == null) {
            dvuwVar = dvuw.b;
        }
        if (dvuwVar.a.size() > 0) {
            dvuw dvuwVar2 = dvusVar.b;
            if (dvuwVar2 == null) {
                dvuwVar2 = dvuw.b;
            }
            dvyw dvywVar = dvuwVar2.a.get(0).a;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            ilo aM = aM(dvywVar, application, "");
            if (aM.bS().a()) {
                a3.add(aM);
                list.add(new broe(bwrs.a(aM)));
            }
        }
        boolean z = btvoVar != null && btvoVar.getAdsParameters().k;
        this.X = dchl.a();
        this.Z = dchl.a();
        for (dvuy dvuyVar : ikz.b(dvusVar)) {
            int a4 = dndf.a(dvuyVar.l);
            if (a4 != 0 && a4 == 3) {
            }
            if (dvuyVar.j.size() > 0 && (dvuyVar.j.get(0).a & 1) != 0) {
                ily ilyVar = new ily();
                ilyVar.h(dvuyVar, z);
                broiVar = new brog(bwrs.a(ilyVar.d()));
            } else {
                broiVar = new broi(new ikz(null, dvuyVar));
            }
            if (broiVar.b()) {
                this.X.add(broiVar);
            } else {
                this.Z.add(broiVar);
            }
        }
        for (brof brofVar : this.X) {
            if (brofVar.c()) {
                a3.add(brofVar.d());
            }
        }
        this.U.addAll(this.X);
        List<ilo> aL = aL(dwivVar, application, str);
        List<dvuy> b = ikz.b(dvusVar);
        if (!b.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (dvuy dvuyVar2 : b) {
                if (dvuyVar2.j.size() > 0 && (dvuyVar2.j.get(0).a & 8) != 0 && (a = dndf.a(dvuyVar2.l)) != 0 && a == 3 && (f = akqi.f(dvuyVar2.j.get(0).d)) != null) {
                    hashMap.put(Long.valueOf(f.c), dvuyVar2);
                }
            }
            for (int i2 = 0; i2 < aL.size(); i2++) {
                ilo iloVar = aL.get(i2);
                dvuy dvuyVar3 = (dvuy) hashMap.get(Long.valueOf(iloVar.ai().c));
                if (dvuyVar3 != null) {
                    ily g = iloVar.g();
                    g.h(dvuyVar3, z);
                    aL.set(i2, g.d());
                }
            }
        }
        a3.addAll(aL);
        int size = G().size() + 1;
        for (ilo iloVar2 : aL) {
            ily g2 = iloVar2.g();
            g2.s = size;
            size++;
            this.U.add(new broe(bwrs.a(g2.d())));
        }
        for (brof brofVar2 : this.Z) {
            if (brofVar2.c()) {
                a3.add(brofVar2.d());
            }
        }
        this.U.addAll(this.Z);
        this.t = dwivVar.d;
        this.u = i;
        this.h = false;
        int i3 = dwivVar.e;
        if (i3 > 0) {
            dbsgVar = dbsg.i(Integer.valueOf(i3));
        } else {
            dbsgVar = dbpy.a;
        }
        this.v = dbsgVar;
        dhjx dhjxVar = dwivVar.f;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        w(dhjxVar);
        if ((dwivVar.a & 16) != 0) {
            dhjx dhjxVar2 = dwivVar.g;
            if (dhjxVar2 == null) {
                dhjxVar2 = dhjx.f;
            }
            bvrtVar = bvrt.b(dhjxVar2);
        }
        this.j = bvrtVar;
        if ((dwivVar.a & 128) != 0) {
            dwid dwidVar = dwivVar.j;
            if (dwidVar == null) {
                dwidVar = dwid.b;
            }
            ArrayList a5 = dchl.a();
            for (dwhz dwhzVar : dwidVar.a) {
                String str2 = dwhzVar.a;
                String str3 = dwhzVar.c;
                if (!dbsj.d(str2)) {
                    akqi f2 = akqi.f(str3);
                    dccx F = dcdc.F();
                    for (dwhy dwhyVar : dwhzVar.b) {
                        F.g(dwhyVar.a);
                    }
                    a5.add(new broc(str2, f2, F.f()));
                }
            }
            this.z = a5;
        }
        dwbc dwbcVar = dwivVar.k;
        if (dwbcVar == null) {
            dwbcVar = dwbc.g;
        }
        dwaa dwaaVar = dwbcVar.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        if ((dwaaVar.a & 1) != 0) {
            this.D = new amsy(dwbcVar);
        }
        if ((dwivVar.a & ImageMetadata.SHADING_MODE) != 0) {
            dndp dndpVar = dwivVar.t;
            if (dndpVar == null) {
                dndpVar = dndp.f;
            }
            this.K = bvrt.b(dndpVar);
        }
        a(a3);
        if ((dwivVar.a & ImageMetadata.LENS_APERTURE) != 0) {
            dwij dwijVar = dwivVar.s;
            if (dwijVar == null) {
                dwijVar = dwij.c;
            }
            this.P = bvrt.b(dwijVar);
        }
        if ((dwivVar.a & 512) != 0) {
            dwif dwifVar = dwivVar.l;
            if (dwifVar == null) {
                dwifVar = dwif.a;
            }
            this.C = dwifVar;
        }
        if ((dwivVar.a & 16777216) != 0) {
            djrs djrsVar = dwivVar.w;
            if (djrsVar == null) {
                djrsVar = djrs.g;
            }
            this.E = djrsVar;
        }
        if ((dwivVar.b & 2) != 0) {
            dhyf dhyfVar = dwivVar.F;
            if (dhyfVar == null) {
                dhyfVar = dhyf.c;
            }
            this.F = dhyfVar;
        }
        if ((dwivVar.a & 33554432) != 0) {
            djrs djrsVar2 = dwivVar.x;
            if (djrsVar2 == null) {
                djrsVar2 = djrs.g;
            }
            this.G = djrsVar2;
        }
        if ((dwivVar.a & 67108864) != 0) {
            djrs djrsVar3 = dwivVar.y;
            if (djrsVar3 == null) {
                djrsVar3 = djrs.g;
            }
            this.H = djrsVar3;
        }
        if ((dwivVar.b & 16) != 0) {
            dpns dpnsVar = dwivVar.I;
            if (dpnsVar == null) {
                dpnsVar = dpns.f;
            }
            this.I = dpnsVar;
        }
        if ((dwivVar.a & 134217728) != 0) {
            djqm djqmVar = dwivVar.z;
            if (djqmVar == null) {
                djqmVar = djqm.b;
            }
            this.l = bvrt.b(djqmVar);
        }
        if ((dwivVar.a & 536870912) != 0) {
            dwhp dwhpVar = dwivVar.A;
            if (dwhpVar == null) {
                dwhpVar = dwhp.c;
            }
            this.k = bvrt.b(dwhpVar);
        }
        if ((dwivVar.b & 4) != 0) {
            dqgj dqgjVar = dwivVar.G;
            if (dqgjVar == null) {
                dqgjVar = dqgj.a;
            }
            this.R = bvrt.b(dqgjVar);
        }
        if ((dwivVar.b & 8) != 0) {
            dpnq dpnqVar = dwivVar.H;
            if (dpnqVar == null) {
                dpnqVar = dpnq.a;
            }
            this.S = bvrt.b(dpnqVar);
        }
        if ((dwivVar.a & 1024) != 0) {
            dqdk dqdkVar = dwivVar.m;
            if (dqdkVar == null) {
                dqdkVar = dqdk.e;
            }
            this.m = bvrt.b(dqdkVar);
        }
        if ((dwivVar.b & 64) != 0) {
            dqim dqimVar = dwivVar.K;
            if (dqimVar == null) {
                dqimVar = dqim.g;
            }
            this.n = bvrt.b(dqimVar);
        }
        if ((dwivVar.b & 128) != 0) {
            dfzq dfzqVar = dwivVar.L;
            if (dfzqVar == null) {
                dfzqVar = dfzq.j;
            }
            this.T = bvrt.b(dfzqVar);
        }
        dqbx dqbxVar = dwivVar.o;
        if (dqbxVar == null) {
            dqbxVar = dqbx.c;
        }
        if ((dqbxVar.a & 1) != 0) {
            dqbx dqbxVar2 = dwivVar.o;
            if (dqbxVar2 == null) {
                dqbxVar2 = dqbx.c;
            }
            dfpo dfpoVar = dqbxVar2.b;
            if (dfpoVar == null) {
                dfpoVar = dfpo.h;
            }
            this.W = bvrt.b(dfpoVar);
        }
        this.p = dcbg.b(dwivVar.B).s(brlo.a).z();
        this.V.clear();
        if ((dwivVar.b & 32) != 0) {
            dmni dmniVar = dwivVar.J;
            if (dmniVar == null) {
                dmniVar = dmni.f;
            }
            dmni dmniVar2 = dwivVar.J;
            if (dmniVar2 == null) {
                dmniVar2 = dmni.f;
            }
            if ((dmniVar2.a & 32) != 0) {
                dmni dmniVar3 = dwivVar.J;
                if (dmniVar3 == null) {
                    dmniVar3 = dmni.f;
                }
                dmpp dmppVar = dmniVar3.e;
                if (dmppVar == null) {
                    dmppVar = dmpp.b;
                }
                dsrj<dmpn> dsrjVar = dmppVar.a;
                ArrayList arrayList = new ArrayList(dsrjVar.size());
                for (dmpn dmpnVar : dsrjVar) {
                    dsqp dsqpVar = (dsqp) dmpnVar.cu(5);
                    dsqpVar.bC(dmpnVar);
                    dmpk dmpkVar = (dmpk) dsqpVar;
                    if (btvoVar != null && btvoVar.getCategoricalSearchParameters().h()) {
                        final akqi c = akxf.c(dmpnVar);
                        dbsg r = dcbg.b(a3).r(new dbsl(c) { // from class: brlp
                            private final akqi a;

                            {
                                this.a = c;
                            }

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                return ((ilo) obj).ai().equals(this.a);
                            }
                        });
                        if (r.a()) {
                            anbd.a(dmpkVar, (ilo) r.b(), 5357, false);
                        }
                    }
                    akxf.O(dmpkVar);
                    arrayList.add((dmpn) dmpkVar.bK());
                }
                dsqp dsqpVar2 = (dsqp) dmniVar.cu(5);
                dsqpVar2.bC(dmniVar);
                dmnh dmnhVar = (dmnh) dsqpVar2;
                dmpp dmppVar2 = dmniVar.e;
                if (dmppVar2 == null) {
                    dmppVar2 = dmpp.b;
                }
                dsqp dsqpVar3 = (dsqp) dmppVar2.cu(5);
                dsqpVar3.bC(dmppVar2);
                dmpo dmpoVar = (dmpo) dsqpVar3;
                if (dmpoVar.c) {
                    dmpoVar.bF();
                    dmpoVar.c = false;
                }
                ((dmpp) dmpoVar.b).a = dmpp.ck();
                dmpoVar.a(arrayList);
                if (dmnhVar.c) {
                    dmnhVar.bF();
                    dmnhVar.c = false;
                }
                dmni dmniVar4 = (dmni) dmnhVar.b;
                dmpp bK = dmpoVar.bK();
                bK.getClass();
                dmniVar4.e = bK;
                dmniVar4.a |= 32;
                dmniVar = (dmni) dmnhVar.bK();
            }
            this.V.add(bvrt.b(dmniVar));
        }
        this.q = dwivVar.E;
    }

    public final synchronized void K(List<ilo> list) {
        if (al()) {
            aN(list);
        }
        List<ilo> aK = aK(list);
        a(aK);
        int size = G().size() + 1;
        for (ilo iloVar : aK) {
            ily g = iloVar.g();
            g.s = size;
            size++;
            this.U.add(new broe(bwrs.a(g.d())));
        }
    }

    public final synchronized void L(brlu brluVar, @dzsi Application application, boolean z) {
        String str;
        synchronized (brluVar) {
            if (v().equals(brluVar.v()) || (str = this.a) == null || str.equals(brluVar.v())) {
                if (!this.x) {
                    this.t = brluVar.t;
                    this.u += brluVar.u;
                }
                this.v = brluVar.v;
                dwiv dwivVar = brluVar.B;
                if (dwivVar == null) {
                    bvoo.h("SearchResult#merge called with deserialized searchResult.", new Object[0]);
                    dwivVar = dwiv.M;
                }
                if (!this.x) {
                    bsjm bsjmVar = this.o;
                    djnc djncVar = dwivVar.v;
                    if (djncVar == null) {
                        djncVar = djnc.b;
                    }
                    djnk djnkVar = djncVar.a;
                    if (djnkVar == null) {
                        djnkVar = djnk.f;
                    }
                    bsjmVar.a(djnkVar);
                }
                if (dwivVar.c.size() > 0) {
                    w(brluVar.x());
                }
                if (z) {
                    ArrayList a = dchl.a();
                    for (brof brofVar : brluVar.X) {
                        if (brofVar.c()) {
                            a.add(brofVar.d());
                            this.U.add(brofVar);
                        }
                    }
                    a(a);
                }
                K(aL(dwivVar, application, ""));
                djrs ac = brluVar.ac();
                if (ac != null) {
                    this.E = ac;
                }
                djrs ae = brluVar.ae();
                if (ae != null) {
                    this.G = ae;
                }
                djrs af = brluVar.af();
                if (af != null) {
                    this.H = af;
                }
                dhyf ad = brluVar.ad();
                if (ad != null) {
                    this.F = ad;
                }
                dpns ag = brluVar.ag();
                if (ag != null) {
                    this.I = ag;
                }
                if (brluVar.H()) {
                    this.l = brluVar.l;
                }
                if (brluVar.aB()) {
                    this.k = brluVar.k;
                }
                bvrt<dqgj> bvrtVar = brluVar.R;
                if (bvrtVar != null) {
                    this.R = bvrtVar;
                }
                bvrt<dpnq> bvrtVar2 = brluVar.S;
                if (bvrtVar2 != null) {
                    this.S = bvrtVar2;
                }
                bvrt<dqdk> bvrtVar3 = brluVar.m;
                if (bvrtVar3 != null) {
                    this.m = bvrtVar3;
                }
                this.p = dcdc.r(brluVar.p);
                this.A = brluVar.N();
                this.c = brluVar.at();
                List<bvrt<dmni>> list = brluVar.V;
                if (al()) {
                    this.V.clear();
                }
                this.V.addAll(list);
                bvrt<dfpo> bvrtVar4 = brluVar.W;
                if (bvrtVar4 != null) {
                    dfpo aD = aD();
                    if (aD == null) {
                        this.W = bvrtVar4;
                    } else {
                        dsqp dsqpVar = (dsqp) aD.cu(5);
                        dsqpVar.bC(aD);
                        dfpn dfpnVar = (dfpn) dsqpVar;
                        dfpo e = bvrtVar4.e((dssr) dfpo.h.cu(7), dfpo.h);
                        dsrj<dfpm> dsrjVar = e.g;
                        if (dfpnVar.c) {
                            dfpnVar.bF();
                            dfpnVar.c = false;
                        }
                        dfpo dfpoVar = (dfpo) dfpnVar.b;
                        dfpoVar.b();
                        dsod.bv(dsrjVar, dfpoVar.g);
                        if (!this.x) {
                            dfos dfosVar = e.b;
                            if (dfosVar == null) {
                                dfosVar = dfos.g;
                            }
                            if (dfpnVar.c) {
                                dfpnVar.bF();
                                dfpnVar.c = false;
                            }
                            dfpo dfpoVar2 = (dfpo) dfpnVar.b;
                            dfosVar.getClass();
                            dfpoVar2.b = dfosVar;
                            dfpoVar2.a |= 1;
                        }
                        this.W = bvrt.b(dfpnVar.bK());
                    }
                }
                this.q = brluVar.q;
                return;
            }
            Object[] objArr = new Object[3];
            objArr[0] = v();
            String str2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = brluVar.v();
            bvoo.h("Tried to merge SearchResults with non-matching queries: original result's query: [%s] and corrected query: [%s], new query: [%s].", objArr);
        }
    }

    public final synchronized void M(brlu brluVar, int i, @dzsi Application application) {
        synchronized (brluVar) {
            this.j = brluVar.j;
        }
        this.d = brluVar.d;
        if (brluVar.E() <= 0) {
            return;
        }
        broh D = brluVar.D(0);
        this.h = false;
        ilo d = D.d();
        if (d == null) {
            return;
        }
        L(brluVar, application, true);
        if (g() > 0) {
            s(g() - 1);
        }
        if (!aH(i)) {
            return;
        }
        aJ(d, i);
    }

    @dzsi
    public final synchronized String N() {
        return this.A;
    }

    public final synchronized doed O() {
        return this.J.e((dssr) doed.c.cu(7), doed.c);
    }

    public final synchronized boolean P() {
        return !this.z.isEmpty();
    }

    public final synchronized List<broc> Q() {
        return this.z;
    }

    public final synchronized boolean R() {
        return this.D != null;
    }

    @dzsi
    public final synchronized amsy S() {
        return this.D;
    }

    public final synchronized boolean T() {
        return this.t;
    }

    public final synchronized int U() {
        return this.u;
    }

    public final synchronized dbsg<Integer> V() {
        return this.v;
    }

    public final synchronized void W(dwix dwixVar) {
        this.Q = bvrt.b(dwixVar);
    }

    public final dwix X() {
        return this.Q.e((dssr) dwix.h.cu(7), dwix.h);
    }

    public final synchronized void Y(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this);
    }

    public final synchronized void Z() {
        this.U.clear();
        this.u = 0;
        this.t = false;
        this.h = false;
        this.v = dbpy.a;
        this.V.clear();
    }

    @dzsi
    public final synchronized dndp aA() {
        return (dndp) bvrt.f(this.K, (dssr) dndp.f.cu(7), dndp.f);
    }

    public final boolean aB() {
        return this.k != null;
    }

    public final List<dmni> aC() {
        return dcbg.b(this.V).s(brls.a).z();
    }

    @dzsi
    public final dfpo aD() {
        bvrt<dfpo> bvrtVar = this.W;
        if (bvrtVar != null) {
            return bvrtVar.e((dssr) dfpo.h.cu(7), dfpo.h);
        }
        return null;
    }

    @dzsi
    public final dfzq aE() {
        bvrt<dfzq> bvrtVar = this.T;
        if (bvrtVar != null) {
            return bvrtVar.e((dssr) dfzq.j.cu(7), dfzq.j);
        }
        return null;
    }

    @dzsi
    public final synchronized int aF() {
        return this.aa;
    }

    public final synchronized void aG(dwiv dwivVar) {
        J(dwivVar, null, 0, null, "");
    }

    public final synchronized void aa() {
        this.h = true;
    }

    public final synchronized void ab() {
        this.h = false;
    }

    @dzsi
    public final synchronized djrs ac() {
        if (this.h) {
            return null;
        }
        return this.E;
    }

    @dzsi
    public final synchronized dhyf ad() {
        dhyf dhyfVar = this.F;
        if (dhyfVar == null) {
            return null;
        }
        if (dhyfVar.a != 1) {
            return dhyfVar;
        }
        if (!this.h) {
            return dhyfVar;
        }
        return null;
    }

    @dzsi
    public final synchronized djrs ae() {
        if (this.h) {
            return null;
        }
        return this.G;
    }

    @dzsi
    public final synchronized djrs af() {
        if (this.h) {
            return null;
        }
        return this.H;
    }

    @dzsi
    public final synchronized dpns ag() {
        if (this.h) {
            return null;
        }
        return this.I;
    }

    public final synchronized boolean ah() {
        return this.w;
    }

    public final synchronized void ai(boolean z) {
        this.w = z;
    }

    public final synchronized boolean aj() {
        return this.x;
    }

    public final synchronized void ak(boolean z) {
        this.x = z;
    }

    public final synchronized boolean al() {
        return this.Y;
    }

    public final synchronized void am(boolean z) {
        this.Y = z;
    }

    @dzsi
    public final synchronized bttq an() {
        return this.y;
    }

    public final synchronized void ao(@dzsi bttq bttqVar) {
        this.y = bttqVar;
    }

    public final synchronized void ap() {
        this.N = true;
    }

    public final synchronized boolean aq() {
        return this.N;
    }

    @dzsi
    public final synchronized dkee ar() {
        return this.L;
    }

    @dzsi
    public final synchronized dspd as() {
        return this.M;
    }

    public final synchronized boolean at() {
        return this.c;
    }

    public final synchronized boolean au() {
        return this.O;
    }

    @dzsi
    public final synchronized dhjx av() {
        return (dhjx) bvrt.f(this.j, (dssr) dhjx.f.cu(7), dhjx.f);
    }

    public final synchronized boolean aw() {
        return this.P != null;
    }

    @dzsi
    public final synchronized dwij ax() {
        return (dwij) bvrt.f(this.P, (dssr) dwij.c.cu(7), dwij.c);
    }

    public final synchronized boolean ay() {
        boolean z;
        if (aw()) {
            if (this.C != null) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean az() {
        return this.K != null;
    }

    @Override // defpackage.iqw
    public final synchronized List<ilo> c() {
        ArrayList a;
        a = dchl.a();
        for (int i = 0; i < E(); i++) {
            broh D = D(i);
            if (D.c()) {
                a.add(D.d());
            }
        }
        return a;
    }

    @Override // defpackage.iqw
    public final synchronized void z() {
        super.z();
        Z();
        this.z.clear();
        this.B = dwiv.M;
        this.E = null;
        this.G = null;
        this.H = null;
        this.F = null;
        this.I = null;
        this.p = dcdc.e();
        this.A = null;
        this.w = false;
        this.x = false;
        this.Y = false;
        this.y = null;
        this.q = true;
        this.W = null;
    }
}
