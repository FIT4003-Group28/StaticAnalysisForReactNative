package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gmm.shared.feedback.GmmLifecycleObserver;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cjvj  reason: default package */
/* loaded from: classes.dex */
public final class cjvj implements cjqy, btvt {
    private final AtomicReference<Integer> A;
    @dzsi
    private ddho B;
    @dzsi
    private cjrc D;
    @dzsi
    private String E;
    private final dzsj<dujz> H;
    @dzsi
    private cjqm I;
    private final btnc<String, dvnp> J;
    @dzsi
    private String K;
    @dzsi
    private String L;
    private final cjut P;
    private final dxio<cjqq> Q;
    private final cjqh R;
    public final Context a;
    public final cqat b;
    public final cjwl c;
    public final cjur d;
    public final dzsj<duxm> f;
    public String h;
    private final SharedPreferences i;
    private final btrm j;
    private final cjvn k;
    private final dxio<bvkx> l;
    private final dxio<ckcw> m;
    private final bvow n;
    private final dehq o;
    private final dxio<akfa> p;
    @dzsi
    private final ckov q;
    private final cjqc r;
    private final dzsj<ddbq> s;
    private final dzsj<dbsg<ddlj>> t;
    private final AtomicInteger y;
    private final AtomicInteger z;
    private final cjvi u = new cjvi(this);
    private final List<cjqv> v = dchl.a();
    private final List<cjqw> w = dchl.a();
    private final List<cjqx> x = dchl.a();
    private final Set<cjtd> C = dcnm.h();
    private int F = -1;
    private long G = -1;
    public int e = 0;
    @dzsi
    public volatile btlu g = btlu.a;
    private final crzp<btlu> M = new cjvg(this);
    private final ConcurrentLinkedQueue<WeakReference<cjuz>> N = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<cjtk> O = new ConcurrentLinkedQueue<>();

    public cjvj(Context context, btmv btmvVar, cqat cqatVar, btrm btrmVar, dzsj dzsjVar, dxio dxioVar, cjvn cjvnVar, dxio dxioVar2, dxio dxioVar3, dehq dehqVar, dbsg dbsgVar, bvow bvowVar, cjqc cjqcVar, dzsj dzsjVar2, dzsj dzsjVar3, btsg btsgVar, cjqh cjqhVar, dzsj dzsjVar4, cjwl cjwlVar, bvju bvjuVar, dxio dxioVar4, dzsj dzsjVar5) {
        this.a = context;
        this.o = dehqVar;
        this.p = dxioVar;
        this.b = cqatVar;
        this.j = btrmVar;
        this.f = dzsjVar;
        this.k = cjvnVar;
        this.l = dxioVar2;
        this.m = dxioVar3;
        this.n = bvowVar;
        this.q = (ckov) ((dbsu) dbsgVar).a;
        this.r = cjqcVar;
        this.H = dzsjVar2;
        this.R = cjqhVar;
        this.s = dzsjVar4;
        this.c = cjwlVar;
        this.P = new cjut(dehqVar, cqatVar, new dbsz(this) { // from class: cjvd
            private final cjvj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                this.a.u((cjtp) obj);
            }
        });
        this.Q = dxioVar4;
        this.d = new cjur(dzsjVar3);
        this.t = dzsjVar5;
        SharedPreferences a = bvjuVar.a("ue3Preference");
        this.i = a;
        this.y = new AtomicInteger(a.getInt("activationId", 1));
        this.z = new AtomicInteger(a.getInt("sequenceId", (int) (Math.random() * 1.073741824E9d)));
        this.A = new AtomicReference<>(null);
        this.L = a.getString("previousClientEventId", null);
        String string = a.getString("baseEventId", W());
        this.h = string;
        if (cjra.c(string) == null) {
            this.h = W();
        }
        this.J = new btnc<>(20, btmz.PREFETCH_UPGRADES, btmvVar);
        new ArrayList();
        if (btsgVar != null) {
            String name = getClass().getName();
            cjve cjveVar = new cjve(this);
            GmmLifecycleObserver gmmLifecycleObserver = new GmmLifecycleObserver();
            gmmLifecycleObserver.a = cjveVar;
            btsc.a.put(name, gmmLifecycleObserver);
        }
    }

    static boolean V(@dzsi String str, @dzsi String str2) {
        return !dbsd.a(dbsj.f(str), dbsj.f(str2));
    }

    static String W() {
        Random random = new Random();
        long nextLong = random.nextLong() % 4294967296000000L;
        if (nextLong < 0) {
            nextLong += 4294967296000000L;
        }
        ddya bZ = ddyb.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyb ddybVar = (ddyb) bZ.b;
        ddybVar.a |= 1;
        ddybVar.b = nextLong;
        int nextInt = random.nextInt(16777216) - 536870912;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyb ddybVar2 = (ddyb) bZ.b;
        ddybVar2.a |= 2;
        ddybVar2.c = nextInt;
        int nextInt2 = random.nextInt();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyb ddybVar3 = (ddyb) bZ.b;
        ddybVar3.a |= 4;
        ddybVar3.d = nextInt2;
        return cjra.d(bZ.bK());
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
        if (r2 != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.cjqn X(@defpackage.dzsi defpackage.btlu r8, defpackage.cjsy r9, @defpackage.dzsi defpackage.cjqk r10) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjvj.X(btlu, cjsy, cjqk):cjqn");
    }

    private final List<cjrc> Y(@dzsi btlu btluVar, cjtk... cjtkVarArr) {
        ArrayList a = dchl.a();
        for (int i = 0; i <= 0; i++) {
            cjtk cjtkVar = cjtkVarArr[i];
            a.add(Z(cjtkVar));
            if (this.H.a().g && (cjtkVar instanceof cjuh)) {
                ((cjuh) cjtkVar).A();
            }
        }
        ac();
        if (btlu.a.equals(btluVar)) {
            Collections.addAll(this.O, cjtkVarArr);
        } else {
            ad(btluVar, new ArrayDeque(Arrays.asList(cjtkVarArr)));
        }
        cjqc cjqcVar = this.r;
        Arrays.asList(cjtkVarArr);
        cjqcVar.a();
        return a;
    }

    private final synchronized cjrc Z(cjtk cjtkVar) {
        String ab;
        Integer num;
        if (this.p.a().d()) {
            cjtkVar.p();
        }
        if (this.f.a().M && (num = this.A.get()) != null) {
            cjtkVar.s(num.intValue());
        }
        if (cjtkVar instanceof cjtp) {
            ab = aa((cjtp) cjtkVar);
        } else {
            ab = ab(cjtkVar);
        }
        return cjrc.a(ab).b();
    }

    private final synchronized String aa(cjtp cjtpVar) {
        String o;
        cjtpVar.v(this.s.a());
        if (!cjtpVar.d()) {
            cjtpVar.y(this.z.getAndIncrement());
        }
        if (cjtpVar.o() == null) {
            cjtpVar.n(cjra.a(this.h, cjtpVar.c()));
        }
        o = cjtpVar.o();
        dnqh j = cjtpVar.j();
        if (j == null) {
            j = dnqh.p;
        }
        if ((j.a & 2) == 0) {
            if (this.L != null) {
                dsqp dsqpVar = (dsqp) j.cu(5);
                dsqpVar.bC(j);
                dnqg dnqgVar = (dnqg) dsqpVar;
                String str = this.L;
                if (dnqgVar.c) {
                    dnqgVar.bF();
                    dnqgVar.c = false;
                }
                dnqh dnqhVar = (dnqh) dnqgVar.b;
                str.getClass();
                dnqhVar.a |= 2;
                dnqhVar.c = str;
                j = dnqgVar.bK();
            }
            this.L = o;
        }
        cjtpVar.i(j);
        dbsg<ddlj> a = this.t.a();
        if (a.a()) {
            cjtpVar.w(a.b());
        }
        if (!this.f.a().C) {
            cjtpVar.e(this.Q.a().a());
        }
        dbsk.s(o);
        return o;
    }

    private final synchronized String ab(cjtk cjtkVar) {
        String b;
        b = b();
        cjtkVar.n(b);
        dnqh j = cjtkVar.j();
        if (j == null) {
            j = dnqh.p;
        }
        if ((j.a & 1) == 0) {
            dsqp dsqpVar = (dsqp) j.cu(5);
            dsqpVar.bC(j);
            dnqg dnqgVar = (dnqg) dsqpVar;
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar = (dnqh) dnqgVar.b;
            b.getClass();
            dnqhVar.a |= 1;
            dnqhVar.b = b;
            j = dnqgVar.bK();
        }
        if ((j.a & 2) == 0) {
            if (this.L != null) {
                dsqp dsqpVar2 = (dsqp) j.cu(5);
                dsqpVar2.bC(j);
                dnqg dnqgVar2 = (dnqg) dsqpVar2;
                String str = this.L;
                if (dnqgVar2.c) {
                    dnqgVar2.bF();
                    dnqgVar2.c = false;
                }
                dnqh dnqhVar2 = (dnqh) dnqgVar2.b;
                str.getClass();
                dnqhVar2.a |= 2;
                dnqhVar2.c = str;
                j = dnqgVar2.bK();
            }
            this.L = j.b;
        }
        cjtkVar.i(j);
        dbsk.s(b);
        return b;
    }

    private final synchronized void ac() {
        this.i.edit().putInt("sequenceId", this.z.get()).putInt("activationId", this.y.get()).putString("previousClientEventId", this.L).putString("baseEventId", this.h).apply();
    }

    private final void ad(@dzsi btlu btluVar, Queue<cjtk> queue) {
        while (true) {
            cjtk poll = queue.poll();
            if (poll != null) {
                this.c.a(btluVar, poll);
                ckcw a = this.m.a();
                ((ckcn) a.a(ckip.am)).a();
                ((ckcn) a.a(ckip.al)).a();
            } else {
                return;
            }
        }
    }

    @dzsi
    private final cjrc ae() {
        cjsa d = this.Q.a().d();
        if (d == null) {
            return null;
        }
        return d.a;
    }

    private final cjqm af(@dzsi cjql cjqlVar, cjte cjteVar, cjtd cjtdVar) {
        ddxz c;
        cjrc cjrcVar = null;
        if (cjqlVar == null) {
            cjqlVar = null;
        }
        dbsk.r(true, "Either 'loggedImpression' (%s) or 'cause' (%s) can be set but not both at the same time", cjqlVar, null);
        boolean z = dbsd.a(cjteVar, new cjte(deaf.TAP)) && dbsd.a(cjtdVar, cjtd.a(dtyi.p));
        if (!this.f.a().E || cjqlVar != null || deaf.AUTOMATED.equals(cjteVar.a) || z) {
            dbsk.s(cjtdVar);
            dbsk.p(cjtdVar.l(), "Invalid UE3 params: %s", cjtdVar);
            ddho ddhoVar = cjtdVar.g;
            if (ddhoVar != null) {
                dbsk.p(!(ddhoVar instanceof ddhn), "logUiInteraction is called with Request Type: %s . Use logRequest instead", ddhoVar);
            } else {
                bvoo.j(new RuntimeException("Attempted to log interaction without VE type."));
            }
            if (!deaf.AUTOMATED.equals(cjteVar.a)) {
                ((ckcn) this.m.a().a(ckef.c)).a();
            }
            ddho ddhoVar2 = cjtdVar.g;
            if (ddhoVar2 != null) {
                cjur cjurVar = this.d;
                int b = ddhoVar2.b();
                long b2 = this.b.b();
                synchronized (cjurVar.b) {
                    cjurVar.b.add(cjuq.c(b, b2));
                }
            }
            cjsh cjshVar = cjqlVar != null ? cjqlVar.b : null;
            cjsa cjsaVar = cjtdVar.m;
            dbsg<ddlp> dbsgVar = dbpy.a;
            if (this.f.a().C) {
                if (cjqlVar != null) {
                    cjrcVar = cjqlVar.c;
                }
                cjsa c2 = cjsaVar != null ? cjsaVar : this.Q.a().c();
                if (cjrcVar == null) {
                    cjrcVar = ae();
                }
                dbsgVar = dbsg.i(cjqg.q(c2, cjrcVar));
            }
            cjug cjugVar = new cjug();
            cjugVar.a = cjteVar;
            cjugVar.j = this.b;
            cjugVar.b = cjtdVar.d();
            cjugVar.e = cjtdVar.f;
            cjugVar.h = cjtdVar.i;
            cjugVar.i = cjtdVar.j;
            cjugVar.b(cjtdVar.e());
            cjugVar.n = cjsaVar;
            cjugVar.f = cjtdVar.l;
            cjugVar.k = dbsgVar;
            if (cjshVar != null) {
                ddxw bZ = ddxx.j.bZ();
                if (cjshVar.a().a() && (c = cjshVar.a().b().c()) != null) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddxx ddxxVar = (ddxx) bZ.b;
                    c.getClass();
                    ddxxVar.i = c;
                    ddxxVar.a |= 2048;
                }
                if (cjshVar.b().a()) {
                    ddhm c3 = cjshVar.b().b().c();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddxx ddxxVar2 = (ddxx) bZ.b;
                    c3.getClass();
                    ddxxVar2.c = c3;
                    ddxxVar2.a |= 4;
                }
                if (cjshVar.c().a()) {
                    int intValue = cjshVar.c().b().intValue();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddxx ddxxVar3 = (ddxx) bZ.b;
                    ddxxVar3.a |= 8;
                    ddxxVar3.d = intValue;
                }
                cjugVar.d = cjrx.b(bZ.bK());
            } else {
                cjugVar.d = cjtdVar.d;
                cjugVar.c = cjtdVar.e;
                cjugVar.g = cjtdVar.g;
            }
            synchronized (this.w) {
                for (cjqw cjqwVar : this.w) {
                    cjqwVar.c(cjteVar, cjtdVar);
                }
            }
            cjuh a = cjugVar.a();
            a.i(dnqh.p.bZ().bK());
            cjqi cjqiVar = cjqi.a;
            ddho ddhoVar3 = cjtdVar.g;
            cjqm b3 = cjqm.b(cjqiVar, u(a).get(0));
            this.I = b3;
            return b3;
        }
        return cjqm.a;
    }

    @Override // defpackage.cjqy
    public final void A(cjqv cjqvVar) {
        synchronized (this.v) {
            this.v.remove(cjqvVar);
        }
    }

    @Override // defpackage.cjqy
    public final void B(cjqi cjqiVar, cjtd cjtdVar) {
        dbsk.s(cjqiVar);
        synchronized (this.v) {
            for (cjqv cjqvVar : this.v) {
                cjqvVar.a(cjtdVar);
            }
        }
    }

    @Override // defpackage.cjqy
    public final void C(cjqw cjqwVar) {
        synchronized (this.w) {
            if (!this.w.contains(cjqwVar)) {
                this.w.add(cjqwVar);
            }
        }
    }

    @Override // defpackage.cjqy
    public final void D(cjqw cjqwVar) {
        synchronized (this.w) {
            this.w.remove(cjqwVar);
        }
    }

    @Override // defpackage.cjqy
    public final void E(cjqx cjqxVar) {
        synchronized (this.x) {
            if (!this.x.contains(cjqxVar)) {
                this.x.add(cjqxVar);
            }
        }
    }

    @Override // defpackage.cjqy
    public final void F(eacd eacdVar) {
        u(new cjue(eacdVar, this.b));
    }

    @Override // defpackage.cjqy
    public final dbsg<ddlp> G() {
        return this.f.a().C ? dbsg.i(cjqg.q(this.Q.a().c(), ae())) : dbpy.a;
    }

    @Override // defpackage.cjqy
    public final void H(cjuz cjuzVar) {
        this.N.add(new WeakReference<>(cjuzVar));
    }

    @Override // defpackage.cjqy
    public final void I(cjuz cjuzVar) {
        Iterator<WeakReference<cjuz>> it = this.N.iterator();
        while (it.hasNext()) {
            if (cjuzVar.equals(it.next().get())) {
                it.remove();
                return;
            }
        }
    }

    @Override // defpackage.cjqy
    public final void J(dukj dukjVar) {
        R(dukjVar, null, null, null, null, null);
    }

    @Override // defpackage.cjqy
    public final void K(cjsy cjsyVar, cjqk cjqkVar) {
        X(this.g, cjsyVar, cjqkVar);
    }

    @Override // defpackage.cjqy
    public final void L() {
        bvrj.UI_THREAD.c();
        af(null, new cjte(deaf.TAP), cjtd.a(dtyi.p));
    }

    @Override // defpackage.cjqy
    public final void M(cjql cjqlVar, cjte cjteVar, cjtd cjtdVar) {
        af(cjqlVar, cjteVar, cjtdVar);
    }

    @Override // defpackage.cjqy
    public final void N(cjsh cjshVar, cjte cjteVar, cjtd cjtdVar) {
        af(new cjql(cjqi.a, cjshVar), cjteVar, cjtdVar);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.cjqy
    public final void O(cjte cjteVar, cjtd cjtdVar) {
        af(null, cjteVar, cjtdVar);
    }

    @Override // defpackage.cjqy
    public final void P(cjql cjqlVar, cjtd cjtdVar, dead deadVar) {
        bvrj.UI_THREAD.c();
        af(cjqlVar, new cjte(deaf.SWIPE, deadVar), cjtdVar);
    }

    @Override // defpackage.cjqy
    public final void Q(cjtd cjtdVar, dead deadVar) {
        bvrj.UI_THREAD.c();
        af(null, new cjte(deaf.SWIPE, deadVar), cjtdVar);
    }

    @Override // defpackage.cjqy
    public final void R(dukj dukjVar, @dzsi String str, @dzsi String str2, @dzsi ddkk ddkkVar, @dzsi ddkq ddkqVar, @dzsi ddou ddouVar) {
        dbsg dbsgVar;
        ddjm bZ = ddkr.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddkr ddkrVar = (ddkr) bZ.b;
        ddkrVar.b = dukjVar.G;
        ddkrVar.a |= 1;
        if (V(str, str2) && V(this.K, str2)) {
            ddjt bZ2 = ddju.d.bZ();
            if (str != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddju ddjuVar = (ddju) bZ2.b;
                str.getClass();
                ddjuVar.a |= 1;
                ddjuVar.b = str;
            }
            if (str2 != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddju ddjuVar2 = (ddju) bZ2.b;
                str2.getClass();
                ddjuVar2.a |= 2;
                ddjuVar2.c = str2;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddkr ddkrVar2 = (ddkr) bZ.b;
            ddju bK = bZ2.bK();
            bK.getClass();
            ddkrVar2.d = bK;
            ddkrVar2.a |= 4;
            this.K = str2;
        }
        if (ddkkVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddkr ddkrVar3 = (ddkr) bZ.b;
            ddkkVar.getClass();
            ddkrVar3.e = ddkkVar;
            ddkrVar3.a |= 8;
        }
        if (ddkqVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddkr ddkrVar4 = (ddkr) bZ.b;
            ddkqVar.getClass();
            ddkrVar4.f = ddkqVar;
            ddkrVar4.a |= 16;
        }
        if (ddouVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddkr ddkrVar5 = (ddkr) bZ.b;
            ddouVar.getClass();
            ddkrVar5.g = ddouVar;
            ddkrVar5.a |= 64;
        }
        cqat cqatVar = this.b;
        ddkr bK2 = bZ.bK();
        if (this.f.a().C) {
            dbsgVar = dbsg.i(ddlp.d);
        } else {
            dbsgVar = dbpy.a;
        }
        cjti cjtiVar = new cjti(cqatVar, bK2, dbsgVar, dukjVar == dukj.APP_BACKGROUNDED ? cjsc.a(this.a) : null);
        btls btlsVar = btls.UNKNOWN;
        int ordinal = dukjVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 7 || ordinal == 8) {
            this.A.set(Integer.valueOf(this.z.getAndIncrement()));
            this.l.a().k(new cjvh(this), this.o, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
        u(cjtiVar).get(0);
        if (dukjVar == dukj.APP_BACKGROUNDED || dukjVar == dukj.PROJECTED_APP_BACKGROUNDED) {
            this.A.set(null);
        }
    }

    public final void S(@dzsi btlu btluVar, boolean z) {
        dnqg bZ;
        synchronized (this) {
            if (!this.f.a().L && z) {
                cjul cjulVar = new cjul(dchl.a(), dbsg.j(this.B), this.b, this.G, this.f, G(), false);
                String str = this.E;
                if (str != null && !str.isEmpty()) {
                    String str2 = this.E;
                    dbsk.s(str2);
                    cjulVar.n(str2);
                }
                cjrc cjrcVar = this.D;
                if (cjrcVar != null) {
                    dnqh j = cjulVar.j();
                    if (j == null) {
                        bZ = dnqh.p.bZ();
                    } else {
                        dsqp dsqpVar = (dsqp) j.cu(5);
                        dsqpVar.bC(j);
                        bZ = (dnqg) dsqpVar;
                    }
                    String str3 = cjrcVar.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnqh dnqhVar = (dnqh) bZ.b;
                    str3.getClass();
                    dnqhVar.a |= 2;
                    dnqhVar.c = str3;
                    cjulVar.y(this.F);
                    cjulVar.i(bZ.bK());
                }
                Y(btluVar, cjulVar);
            }
            this.E = null;
            this.D = null;
            this.F = -1;
            this.G = -1L;
        }
        Iterator<WeakReference<cjuz>> it = this.N.iterator();
        while (it.hasNext()) {
            cjuz cjuzVar = it.next().get();
            if (cjuzVar != null) {
                cjuzVar.a.f();
            }
        }
    }

    public final void T(@dzsi btlu btluVar) {
        dbsk.l(!btlu.a.equals(btluVar));
        ad(btluVar, this.O);
    }

    public final void U(@dzsi btlu btluVar, ddda dddaVar) {
        cjsx i = cjsy.i();
        i.b(dddaVar);
        X(btluVar, i.a(), null);
    }

    @Override // defpackage.btvt
    public final void a(decj decjVar) {
        int i;
        cjut cjutVar = this.P;
        long e = cjutVar.a.e();
        int i2 = decjVar.b;
        int[] iArr = new int[i2];
        synchronized (cjutVar) {
            Iterator<Map.Entry<Integer, Long>> it = cjutVar.c.entrySet().iterator();
            while (true) {
                if (!it.hasNext() || e < it.next().getValue().longValue() + 60000) {
                    break;
                }
                it.remove();
            }
            int i3 = 0;
            for (i = 0; i < decjVar.b; i++) {
                int f = decjVar.f(i);
                LinkedHashMap<Integer, Long> linkedHashMap = cjutVar.c;
                Integer valueOf = Integer.valueOf(f);
                if (!linkedHashMap.containsKey(valueOf)) {
                    cjutVar.c.put(valueOf, Long.valueOf(e));
                    iArr[i3] = f;
                    i3++;
                }
            }
            int i4 = cjutVar.d;
            int i5 = i4 - 1;
            if (i4 != 0) {
                if (i5 == 0) {
                    return;
                }
                if (i3 == 0) {
                    return;
                }
                if (i3 < i2) {
                    iArr = Arrays.copyOf(iArr, i3);
                }
                Arrays.sort(iArr);
                dbsz<cjtp> dbszVar = cjutVar.b;
                cjtp cjtpVar = new cjtp(e, dbpy.a);
                cjtpVar.x(iArr);
                dbszVar.NU(cjtpVar);
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.cjqy
    public final String b() {
        return cjra.a(this.h, this.z.getAndIncrement());
    }

    @Override // defpackage.cjqy
    public final cjqm d(cjqi cjqiVar) {
        dbsk.s(cjqiVar);
        cjqm cjqmVar = this.I;
        return cjqmVar == null ? cjqm.a : cjqmVar;
    }

    @Override // defpackage.cjqy
    public final int e(cjqi cjqiVar) {
        dbsk.s(cjqiVar);
        return this.z.getAndIncrement();
    }

    @Override // defpackage.cjqy
    public final void f(cjqi cjqiVar, cjtd cjtdVar) {
        dbsk.s(cjqiVar);
        synchronized (this) {
            this.C.add(cjtdVar);
        }
    }

    @Override // defpackage.cjqy
    public final void g() {
        S(this.g, false);
    }

    @Override // defpackage.cjqy
    public final void h() {
        S(this.g, true);
    }

    @Override // defpackage.cjqy
    public final cjqm i(cjtd cjtdVar) {
        bvrj.UI_THREAD.c();
        return af(null, new cjte(deaf.TAP), cjtdVar);
    }

    @Override // defpackage.cjqy
    public final cjqm j(cjql cjqlVar, cjtd cjtdVar) {
        bvrj.UI_THREAD.c();
        return af(cjqlVar, new cjte(deaf.TAP), cjtdVar);
    }

    @Override // defpackage.cjqy
    public final cjqn k(cjsy cjsyVar) {
        return X(this.g, cjsyVar, null);
    }

    @Override // defpackage.cjqy
    public final void l(cjsu cjsuVar) {
        dccx dccxVar = new dccx();
        dcdc<cjrz> a = cjsuVar.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cjrz cjrzVar = a.get(i);
            ddhh ddhhVar = (ddhh) ddhk.k.bZ();
            int i2 = cjrzVar.a().a;
            if (ddhhVar.c) {
                ddhhVar.bF();
                ddhhVar.c = false;
            }
            ddhk ddhkVar = (ddhk) ddhhVar.b;
            ddhkVar.a = 1 | ddhkVar.a;
            ddhkVar.b = i2;
            if (cjrzVar.d()) {
                ddhj ddhjVar = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
                if (ddhhVar.c) {
                    ddhhVar.bF();
                    ddhhVar.c = false;
                }
                ddhk ddhkVar2 = (ddhk) ddhhVar.b;
                ddhkVar2.h = ddhjVar.g;
                ddhkVar2.a |= 32;
            }
            if (cjrzVar.c() != null) {
                ddhhVar.k(dddg.h, cjrzVar.c());
            }
            if (cjrzVar.b() != null) {
                ddhhVar.k(ddzg.u, cjrzVar.b());
            }
            dccxVar.g((ddhk) ddhhVar.bK());
        }
        dnqg bZ = dnqh.p.bZ();
        int b = cjsuVar.b().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = b;
        if (cjsuVar.c() != null) {
            String c = cjsuVar.c();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            c.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = c;
        }
        cjtr cjtrVar = new cjtr(this.b, dccxVar.f());
        cjtrVar.i(bZ.bK());
        cjsuVar.e(u(cjtrVar).get(0).a);
    }

    @Override // defpackage.cjqy
    public final cjqm m(cjte cjteVar, cjtd cjtdVar) {
        bvrj.UI_THREAD.c();
        return af(null, cjteVar, cjtdVar);
    }

    @Override // defpackage.cjqy
    public final cjqm n(cjql cjqlVar, cjte cjteVar, cjtd cjtdVar) {
        bvrj.UI_THREAD.c();
        return af(cjqlVar, cjteVar, cjtdVar);
    }

    @Override // defpackage.cjqy
    public final cjqm o(cjtd cjtdVar) {
        bvrj.UI_THREAD.c();
        return af(null, new cjte(deaf.AUTOMATED), cjtdVar);
    }

    @Override // defpackage.cjqy
    public final void p(dvnp dvnpVar, String str, @dzsi dnqh dnqhVar) {
        if (this.J.n(str) != null) {
            return;
        }
        this.J.Pz(str, dvnpVar);
        cjty cjtyVar = new cjty(dvnpVar, str, this.b);
        cjtyVar.i(dnqhVar);
        u(cjtyVar);
    }

    @Override // defpackage.cjqy
    public final void q(dhjx dhjxVar, dpld dpldVar, @dzsi List<dnpo> list, dpxk dpxkVar, dnqh dnqhVar, int i) {
        cjuj cjujVar = new cjuj(dhjxVar, dpldVar, this.b, list, dpxkVar, i);
        cjujVar.i(dnqhVar);
        u(cjujVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    @Override // defpackage.cjqy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cjrc r(defpackage.cjtg r21) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjvj.r(cjtg):cjrc");
    }

    @Override // defpackage.cjqy
    public final cjrc s(String str, @dzsi ddjr ddjrVar, durz durzVar, dukj dukjVar, @dzsi String str2, boolean z) {
        dbsg dbsgVar;
        durzVar.name();
        ddjp bZ = ddjs.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddjs ddjsVar = (ddjs) bZ.b;
        str.getClass();
        int i = ddjsVar.a | 1;
        ddjsVar.a = i;
        ddjsVar.b = str;
        ddjsVar.e = durzVar.aZ;
        int i2 = i | 8;
        ddjsVar.a = i2;
        int i3 = i2 | 16;
        ddjsVar.a = i3;
        ddjsVar.f = z;
        if (ddjrVar != null) {
            ddjsVar.d = ddjrVar.H;
            ddjsVar.a = i3 | 4;
        }
        if (!dbsj.d(str2)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjs ddjsVar2 = (ddjs) bZ.b;
            str2.getClass();
            ddjsVar2.a |= 2;
            ddjsVar2.c = str2;
        }
        ddjm bZ2 = ddkr.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddkr ddkrVar = (ddkr) bZ2.b;
        ddkrVar.b = dukjVar.G;
        ddkrVar.a |= 1;
        ddjs bK = bZ.bK();
        bK.getClass();
        ddkrVar.c = bK;
        ddkrVar.a |= 2;
        ddkr bK2 = bZ2.bK();
        cjtk[] cjtkVarArr = new cjtk[1];
        cqat cqatVar = this.b;
        if (this.f.a().C) {
            dbsgVar = dbsg.i(ddlp.d);
        } else {
            dbsgVar = dbpy.a;
        }
        cjtkVarArr[0] = new cjti(cqatVar, bK2, dbsgVar, null);
        return u(cjtkVarArr).get(0);
    }

    @Override // defpackage.cjqy
    public final void t(String str) {
        dbsg dbsgVar;
        ddjp bZ = ddjs.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddjs ddjsVar = (ddjs) bZ.b;
        str.getClass();
        int i = ddjsVar.a | 1;
        ddjsVar.a = i;
        ddjsVar.b = str;
        ddjsVar.a = i | 32;
        ddjsVar.g = true;
        ddjs bK = bZ.bK();
        ddjm bZ2 = ddkr.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddkr ddkrVar = (ddkr) bZ2.b;
        bK.getClass();
        ddkrVar.c = bK;
        ddkrVar.a |= 2;
        dukj dukjVar = dukj.EXTERNAL_INVOCATION_COMPLETED;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddkr ddkrVar2 = (ddkr) bZ2.b;
        ddkrVar2.b = dukjVar.G;
        ddkrVar2.a |= 1;
        ddkr bK2 = bZ2.bK();
        cjtk[] cjtkVarArr = new cjtk[1];
        cqat cqatVar = this.b;
        if (!this.f.a().C) {
            dbsgVar = dbpy.a;
        } else {
            dbsgVar = dbsg.i(ddlp.d);
        }
        cjtkVarArr[0] = new cjti(cqatVar, bK2, dbsgVar, null);
        u(cjtkVarArr);
    }

    @Override // defpackage.cjqy
    public final List<cjrc> u(cjtk... cjtkVarArr) {
        return Y(this.g, cjtkVarArr);
    }

    @Override // defpackage.cjqy
    public final synchronized void v() {
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            this.j.a(this.u);
            this.p.a().C().c(this.M);
            this.P.a();
            this.o.execute(new Runnable(this) { // from class: cjvf
                private final cjvj a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cjvj cjvjVar = this.a;
                    synchronized (cjvjVar) {
                        if (cjvjVar.e == 0) {
                            cjvjVar.g();
                            cjvjVar.c.c();
                        }
                    }
                }
            });
        }
    }

    @Override // defpackage.cjqy
    public final synchronized void w() {
        if (this.e == 0) {
            btrm btrmVar = this.j;
            cjvi cjviVar = this.u;
            dceq a = dcet.a();
            a.b(cjqs.class, new cjvk(cjqs.class, cjviVar));
            btrmVar.g(cjviVar, a.a());
            this.p.a().C().d(this.M, this.o);
            this.c.b();
        }
        this.e++;
    }

    @Override // defpackage.cjqy
    public final void x(Throwable th, boolean z) {
        dbsg dbsgVar;
        ddjn bZ = ddjo.e.bZ();
        String name = th.getClass().getName();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddjo ddjoVar = (ddjo) bZ.b;
        name.getClass();
        int i = ddjoVar.a | 1;
        ddjoVar.a = i;
        ddjoVar.b = name;
        ddjoVar.a = i | 4;
        ddjoVar.d = z;
        try {
            boolean a = this.n.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjo ddjoVar2 = (ddjo) bZ.b;
            ddjoVar2.a |= 2;
            ddjoVar2.c = a;
        } catch (bvov unused) {
        }
        this.P.a();
        ddjm bZ2 = ddkr.i.bZ();
        dukj dukjVar = dukj.APP_CRASHED;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddkr ddkrVar = (ddkr) bZ2.b;
        ddkrVar.b = dukjVar.G;
        ddkrVar.a |= 1;
        ddjo bK = bZ.bK();
        bK.getClass();
        ddkrVar.h = bK;
        ddkrVar.a |= 128;
        ddkr bK2 = bZ2.bK();
        cqat cqatVar = this.b;
        if (this.f.a().C) {
            dbsgVar = dbsg.i(ddlp.d);
        } else {
            dbsgVar = dbpy.a;
        }
        u(new cjti(cqatVar, bK2, dbsgVar, null));
        g();
        this.c.c();
    }

    @Override // defpackage.cjqy
    public final void z(cjqv cjqvVar) {
        ArrayList<cjtd> a = dchl.a();
        synchronized (this) {
            a.addAll(this.C);
        }
        synchronized (this.v) {
            if (!this.v.contains(cjqvVar)) {
                this.v.add(cjqvVar);
                for (cjtd cjtdVar : a) {
                    cjqvVar.a(cjtdVar);
                }
            }
        }
    }

    @Override // defpackage.cjqy
    public final void y(String str, @dzsi String str2, @dzsi String str3, @dzsi cjrc cjrcVar) {
        u(new cjud(str, str2, str3, cjrcVar == null ? null : cjrcVar.a, this.b, G()));
    }
}
