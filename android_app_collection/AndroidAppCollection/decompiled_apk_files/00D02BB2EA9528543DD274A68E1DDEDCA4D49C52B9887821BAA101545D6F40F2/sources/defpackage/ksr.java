package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ksr  reason: default package */
/* loaded from: classes7.dex */
public class ksr {
    static final long a = TimeUnit.SECONDS.toMillis(3);
    public static final /* synthetic */ int h = 0;
    public final cqat b;
    public final bvrb c;
    public GmmLocation f;
    private final Application i;
    private final btrm j;
    private final bvjj k;
    @dzsi
    private final akox l;
    private final dzsj<srv> m;
    private final btvo n;
    private final dxio<bvsf> o;
    private final vva p;
    private final vxo q;
    private final int r;
    private int t;
    public final HashMap<ksq, ksl> d = new HashMap<>();
    private final HashMap<ksq, ksl> s = new HashMap<>();
    public final HashMap<ksq, ksl> e = new HashMap<>();
    private boolean u = false;
    public final Set<kso> g = new HashSet();
    private final ksn v = new ksn(this);

    public ksr(Application application, btrm btrmVar, cqat cqatVar, bvjj bvjjVar, bvrb bvrbVar, akox akoxVar, dzsj dzsjVar, btvo btvoVar, dxio dxioVar, vxo vxoVar, vvb vvbVar, vva vvaVar, klz klzVar, jzn jznVar, kma kmaVar, int i) {
        dbsk.s(application);
        this.i = application;
        dbsk.s(btrmVar);
        this.j = btrmVar;
        dbsk.s(cqatVar);
        this.b = cqatVar;
        dbsk.s(bvjjVar);
        this.k = bvjjVar;
        dbsk.s(bvrbVar);
        this.c = bvrbVar;
        this.l = akoxVar;
        dbsk.s(dzsjVar);
        this.m = dzsjVar;
        this.n = btvoVar;
        this.o = dxioVar;
        this.q = vxoVar;
        dbsk.s(vvbVar);
        dbsk.s(vvaVar);
        this.p = vvaVar;
        dbsk.s(klzVar);
        dbsk.s(jznVar);
        dbsk.s(kmaVar);
        this.r = i;
    }

    private final void k(ksq ksqVar, ksl kslVar) {
        dcdc<amvh> e = ksqVar.e();
        if (this.f == null) {
            return;
        }
        int size = e.size();
        for (int i = 0; i < size; i++) {
            amvh amvhVar = e.get(i);
            if (amvhVar.n() && this.f.F(amvhVar.e) > 1500000.0f) {
                return;
            }
        }
        if (this.d.size() >= this.r) {
            this.s.put(ksqVar, kslVar);
        } else if (this.d.put(ksqVar, kslVar) == null) {
            dwao d = kslVar.d();
            dbsk.s(d);
            l(ksqVar, this.f, true, d);
        }
    }

    private final void l(ksq ksqVar, GmmLocation gmmLocation, boolean z, dwao dwaoVar) {
        dwbm dwbmVar;
        srv a2 = this.m.a();
        amvh g = amvh.g(this.i, gmmLocation.B());
        dccx F = dcdc.F();
        F.g(g);
        F.i(ksqVar.e());
        dcdc<amvh> f = F.f();
        ksqVar.b();
        vun m = m(dwaoVar, f, gmmLocation, z);
        if ((dwaoVar.a & 16777216) != 0) {
            dwbl bZ = dwbm.c.bZ();
            dore doreVar = dore.REROUTE_AND_ALTERNATES_FROM_NEW_LOCATION;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwbm dwbmVar2 = (dwbm) bZ.b;
            dwbmVar2.b = doreVar.i;
            dwbmVar2.a |= 1;
            dwbmVar = bZ.bK();
        } else {
            dwbmVar = null;
        }
        a2.j(m, dwbmVar);
    }

    private final vun m(dwao dwaoVar, dcdc<amvh> dcdcVar, @dzsi GmmLocation gmmLocation, boolean z) {
        akox akoxVar = this.l;
        dtaq dtaqVar = null;
        dhjx aa = akoxVar == null ? null : akoxVar.aa();
        if (gmmLocation != null) {
            dtaqVar = gmmLocation.a();
        }
        dowa a2 = bvsl.a(this.k);
        dnqg bZ = dnqh.p.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 2048;
        dnqhVar.j = z;
        vum vumVar = new vum();
        vumVar.e = aa;
        vumVar.f = dtaqVar;
        vumVar.c(dcdcVar);
        dcdc e = dcdc.e();
        vumVar.c.clear();
        vumVar.c.addAll(e);
        vumVar.a = dwaoVar;
        vumVar.o = bZ.bK();
        vumVar.g = a2;
        vumVar.p = true;
        return vumVar.a();
    }

    private final dwao n(@dzsi amte amteVar, @dzsi vup vupVar, @dzsi dspd dspdVar) {
        dwao c;
        if (amteVar != null) {
            c = amteVar.i();
        } else {
            c = new vxa(this.n, this.o, btsp.c(this.k), btsp.c(this.q), null, null, null, dbpy.a, dbpy.a, dbpy.a, dbpy.a, dbpy.a, null).c(dqvj.DRIVE, 3, vul.NAVIGATION_ONLY);
        }
        dsqp dsqpVar = (dsqp) c.cu(5);
        dsqpVar.bC(c);
        dwal dwalVar = (dwal) dsqpVar;
        dqnz dqnzVar = c.K;
        if (dqnzVar == null) {
            dqnzVar = dqnz.c;
        }
        dsqp dsqpVar2 = (dsqp) dqnzVar.cu(5);
        dsqpVar2.bC(dqnzVar);
        dqny dqnyVar = (dqny) dsqpVar2;
        if (dqnyVar.c) {
            dqnyVar.bF();
            dqnyVar.c = false;
        }
        dqnz dqnzVar2 = (dqnz) dqnyVar.b;
        dqnzVar2.a |= 16;
        dqnzVar2.b = false;
        if (dwalVar.c) {
            dwalVar.bF();
            dwalVar.c = false;
        }
        dwao dwaoVar = (dwao) dwalVar.b;
        dqnz bK = dqnyVar.bK();
        bK.getClass();
        dwaoVar.K = bK;
        dwaoVar.b |= 16384;
        vuz a2 = this.p.a(dwalVar.bK(), dqvj.DRIVE);
        if (vupVar != null) {
            a2.d = vupVar.a;
        }
        if (dspdVar != null) {
            a2.c(dspdVar);
        }
        dwao a3 = a2.a();
        dsqp dsqpVar3 = (dsqp) a3.cu(5);
        dsqpVar3.bC(a3);
        return ((dwal) dsqpVar3).bK();
    }

    public final void a() {
        if (this.t == 0) {
            btrm btrmVar = this.j;
            ksn ksnVar = this.v;
            dceq a2 = dcet.a();
            a2.b(srf.class, new kst(0, srf.class, ksnVar, bvrj.UI_THREAD));
            a2.b(amqo.class, new kst(1, amqo.class, ksnVar, bvrj.UI_THREAD));
            btrmVar.g(ksnVar, a2.a());
        }
        this.t++;
    }

    public final void b() {
        int i = this.t - 1;
        this.t = i;
        if (i == 0) {
            this.j.a(this.v);
        }
    }

    public final void c(ldm ldmVar, ksu ksuVar, dcdc<ldm> dcdcVar) {
        bvrj.UI_THREAD.c();
        dcdcVar.isEmpty();
        ksl f = ksl.f(ldmVar, ksuVar, n(ldmVar.l(), null, ldmVar.i), this.b);
        dccx F = dcdc.F();
        F.g(ldmVar);
        F.i(dcdcVar);
        k(ksp.d(F.f()), f);
    }

    public final void d(dcdc<ldm> dcdcVar, ksu ksuVar, @dzsi vup vupVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(!dcdcVar.isEmpty());
        ldm ldmVar = dcdcVar.get(0);
        dcdcVar.get(0);
        e(ksp.d(dcdcVar), this.f, ksl.f(ldmVar, ksuVar, n(ldmVar.l(), vupVar, ldmVar.i), this.b));
    }

    public final void e(ksq ksqVar, @dzsi GmmLocation gmmLocation, ksl kslVar) {
        if (gmmLocation == null) {
            this.e.put(ksqVar, kslVar);
        } else if (this.d.put(ksqVar, kslVar) != null) {
        } else {
            this.u = ahnb.a(this.f, this.b);
            dwao d = kslVar.d();
            dbsk.s(d);
            l(ksqVar, gmmLocation, false, d);
        }
    }

    public final void f(ldm ldmVar, @dzsi GmmLocation gmmLocation, amte amteVar) {
        bvrj.UI_THREAD.c();
        dwao n = n(ldmVar.l(), null, ldmVar.i);
        dcdc<amvh> t = dcdc.t(amteVar.c);
        dcdc.t(amteVar.d);
        vun m = m(n, t, gmmLocation, false);
        srv a2 = this.m.a();
        a2.i(m, amteVar, false, 0);
        ldmVar.j(a2, a2.a());
    }

    public final boolean g() {
        bvrj.UI_THREAD.c();
        GmmLocation gmmLocation = this.f;
        if (gmmLocation == null) {
            return true;
        }
        return this.u && ahnb.a(gmmLocation, this.b);
    }

    public final void h(kso ksoVar) {
        bvrj.UI_THREAD.c();
        this.g.add(ksoVar);
    }

    public final void i(kso ksoVar) {
        bvrj.UI_THREAD.c();
        this.g.remove(ksoVar);
    }

    public final void j(qbn qbnVar, qbm qbmVar, ksq ksqVar) {
        Map.Entry entry;
        ksl kslVar = this.d.get(ksqVar);
        if (!qbmVar.b()) {
            this.d.remove(ksqVar);
        }
        if (kslVar == null) {
            return;
        }
        if (!ksqVar.c()) {
            kslVar.a().j(qbnVar, qbmVar);
            ksu b = kslVar.b();
            if (b != null) {
                b.a(kslVar.a());
            }
        } else {
            boolean z = false;
            dbsk.l(false);
            dccx F = dcdc.F();
            int i = 1;
            while (i < qbmVar.i().size()) {
                ldm f = ldm.f(qbmVar.i().get(i), this.i.getResources(), null);
                if (!z) {
                    f.j(qbnVar, qbmVar);
                }
                F.g(f);
                i++;
                z = true;
            }
            ksj c = kslVar.c();
            if (c != null) {
                F.f();
                c.a();
            }
        }
        if (this.s.isEmpty() || this.d.size() >= this.r || (entry = (Map.Entry) dcft.r(this.s.entrySet(), null)) == null) {
            return;
        }
        this.s.remove(entry.getKey());
        k((ksq) entry.getKey(), (ksl) entry.getValue());
    }
}
