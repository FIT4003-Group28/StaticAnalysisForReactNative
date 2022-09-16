package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: prx  reason: default package */
/* loaded from: classes7.dex */
public final class prx {
    public static final /* synthetic */ int o = 0;
    private static final dcqe p = dcqe.c("prx");
    private static final long q = TimeUnit.SECONDS.toMillis(2);
    private final btvo A;
    private final xfc B;
    private final yzl C;
    private final dxio<bzll> D;
    private final ahjp E;
    private final anhk F;
    private final vwv G;
    @dzsi
    private byym H;
    @dzsi
    private qbn I;
    @dzsi
    private qbn J;
    private long M;
    private final prn N;
    public final ckcw b;
    public final bvrb c;
    public final vns d;
    public final qdx e;
    public final zar f;
    public final xcs g;
    public final vwo h;
    @dzsi
    public vnk i;
    @dzsi
    public prw j;
    public final ptd l;
    public final Context m;
    public final bvjj n;
    private final cqat r;
    private final btrm s;
    private final ahjq t;
    private final zah u;
    private final qfr v;
    private final vxa w;
    private final afos x;
    private final Executor y;
    private final dxio<bxtx> z;
    public final Object a = new Object();
    private int K = -1;
    private int O = 1;
    private boolean L = false;
    public final AtomicBoolean k = new AtomicBoolean(false);

    static {
        TimeUnit.MINUTES.toMillis(2L);
    }

    public prx(ckcw ckcwVar, cqat cqatVar, btrm btrmVar, ahjq ahjqVar, bvrb bvrbVar, prn prnVar, vns vnsVar, qdx qdxVar, zah zahVar, qfr qfrVar, vxa vxaVar, afos afosVar, Executor executor, zar zarVar, dxio dxioVar, dxio dxioVar2, btvo btvoVar, xfc xfcVar, ptd ptdVar, yzl yzlVar, Context context, bvjj bvjjVar, ahjp ahjpVar, anhk anhkVar, xcs xcsVar, vwo vwoVar, vwv vwvVar) {
        this.b = ckcwVar;
        this.N = prnVar;
        this.r = cqatVar;
        this.s = btrmVar;
        this.t = ahjqVar;
        this.c = bvrbVar;
        this.d = vnsVar;
        this.e = qdxVar;
        this.u = zahVar;
        this.v = qfrVar;
        this.x = afosVar;
        this.y = executor;
        this.w = vxaVar;
        this.f = zarVar;
        this.D = dxioVar;
        this.z = dxioVar2;
        this.A = btvoVar;
        this.B = xfcVar;
        this.l = ptdVar;
        this.C = yzlVar;
        this.m = context;
        this.n = bvjjVar;
        this.E = ahjpVar;
        this.F = anhkVar;
        this.g = xcsVar;
        this.h = vwoVar;
        this.G = vwvVar;
    }

    private final void l() {
        if (!this.L) {
            btrm btrmVar = this.s;
            dceq a = dcet.a();
            a.b(srf.class, new psa(srf.class, this, bvrj.UI_THREAD));
            btrmVar.g(this, a.a());
            this.L = true;
        }
    }

    private final void m() {
        if (this.L) {
            this.s.a(this);
            this.L = false;
        }
    }

    private final synchronized vun n(List<amvh> list, @dzsi dnqh dnqhVar) {
        vun a;
        vnk vnkVar = this.i;
        dbsk.s(vnkVar);
        synchronized (vnkVar) {
            dwao h = this.i.h();
            if (vyr.c(list)) {
                dsqp dsqpVar = (dsqp) h.cu(5);
                dsqpVar.bC(h);
                dwal dwalVar = (dwal) dsqpVar;
                dwalVar.bC(vyq.a);
                h = dwalVar.bK();
            }
            duqc i = vnkVar.i();
            if (i == null) {
                i = duqc.f;
            }
            dphq dphqVar = h.e;
            if (dphqVar == null) {
                dphqVar = dphq.m;
            }
            dqvj c = dqvj.c(dphqVar.b);
            if (c == null) {
                c = dqvj.MIXED;
            }
            if ((c.equals(dqvj.TRANSIT) || c.equals(dqvj.MIXED)) && this.A.getTransitPagesParameters().l) {
                dsqp dsqpVar2 = (dsqp) h.cu(5);
                dsqpVar2.bC(h);
                dwal dwalVar2 = (dwal) dsqpVar2;
                dwbk dwbkVar = h.f;
                if (dwbkVar == null) {
                    dwbkVar = dwbk.s;
                }
                dsqp dsqpVar3 = (dsqp) dwbkVar.cu(5);
                dsqpVar3.bC(dwbkVar);
                dwbd dwbdVar = (dwbd) dsqpVar3;
                if (dwbdVar.c) {
                    dwbdVar.bF();
                    dwbdVar.c = false;
                }
                dwbk.g((dwbk) dwbdVar.b);
                if (dwalVar2.c) {
                    dwalVar2.bF();
                    dwalVar2.c = false;
                }
                dwao dwaoVar = (dwao) dwalVar2.b;
                dwbk bK = dwbdVar.bK();
                bK.getClass();
                dwaoVar.f = bK;
                dwaoVar.a |= 2;
                h = dwalVar2.bK();
            }
            vnu l = vnkVar.l();
            dquz dquzVar = null;
            if (l.a().equals(dqvj.BICYCLE) || l.a().equals(dqvj.WALK)) {
                vwn d = l.d();
                String h2 = d.h();
                String i2 = d.i();
                String j = d.j();
                dotp dotpVar = h.j;
                if (dotpVar == null) {
                    dotpVar = dotp.f;
                }
                dsqp dsqpVar4 = (dsqp) dotpVar.cu(5);
                dsqpVar4.bC(dotpVar);
                dotm dotmVar = (dotm) dsqpVar4;
                if (dotmVar.c) {
                    dotmVar.bF();
                    dotmVar.c = false;
                }
                dotp dotpVar2 = (dotp) dotmVar.b;
                int i3 = dotpVar2.b;
                if (i3 == 2) {
                    dotpVar2.b = 0;
                    dotpVar2.c = null;
                    i3 = 0;
                }
                if (i3 == 4) {
                    dotpVar2.b = 0;
                    dotpVar2.c = null;
                }
                if (h2 != null) {
                    h2.getClass();
                    dotpVar2.b = 2;
                    dotpVar2.c = h2;
                } else if (i2 != null && j != null) {
                    dotk bZ = dotl.d.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dotl dotlVar = (dotl) bZ.b;
                    i2.getClass();
                    int i4 = dotlVar.a | 1;
                    dotlVar.a = i4;
                    dotlVar.b = i2;
                    j.getClass();
                    dotlVar.a = 2 | i4;
                    dotlVar.c = j;
                    if (dotmVar.c) {
                        dotmVar.bF();
                        dotmVar.c = false;
                    }
                    dotp dotpVar3 = (dotp) dotmVar.b;
                    dotl bK2 = bZ.bK();
                    bK2.getClass();
                    dotpVar3.c = bK2;
                    dotpVar3.b = 4;
                }
                dsqp dsqpVar5 = (dsqp) h.cu(5);
                dsqpVar5.bC(h);
                dwal dwalVar3 = (dwal) dsqpVar5;
                if (dwalVar3.c) {
                    dwalVar3.bF();
                    dwalVar3.c = false;
                }
                dwao dwaoVar2 = (dwao) dwalVar3.b;
                dotp bK3 = dotmVar.bK();
                bK3.getClass();
                dwaoVar2.j = bK3;
                dwaoVar2.a |= 32;
                h = dwalVar3.bK();
            }
            if (vnkVar.w() != null) {
                dquzVar = dquz.STRICT_MATCHING;
            }
            vum vumVar = new vum();
            vumVar.e = vnkVar.aM();
            vumVar.c(list);
            vumVar.a = h;
            vumVar.d = i;
            vumVar.f = vnkVar.f();
            vumVar.g = vnkVar.u();
            vumVar.h = vnkVar.v();
            vumVar.i = vnkVar.w();
            vumVar.l = vnkVar.x();
            vumVar.k = dquzVar;
            vumVar.o = dnqhVar;
            vumVar.p = false;
            a = vumVar.a();
        }
        return a;
    }

    private final dcdc<amvh> o() {
        dcdc<amvh> f;
        vnk vnkVar = this.i;
        dbsk.s(vnkVar);
        synchronized (vnkVar) {
            vnk vnkVar2 = this.i;
            dbsk.s(vnkVar2);
            dqvj g = vnkVar2.g();
            dccx F = dcdc.F();
            vnk vnkVar3 = this.i;
            dbsk.s(vnkVar3);
            dcpe<amvh> listIterator = vnkVar3.aw().listIterator();
            while (listIterator.hasNext()) {
                amvh next = listIterator.next();
                if (!next.a() && !next.y) {
                    if (g != dqvj.DRIVE) {
                        next = vyr.b(next);
                    }
                    F.g(next);
                }
            }
            f = F.f();
        }
        return f;
    }

    private final synchronized dcdc<dwac> p() {
        dccx F;
        F = dcdc.F();
        vnk vnkVar = this.i;
        dbsk.s(vnkVar);
        synchronized (vnkVar) {
            int i = 0;
            while (true) {
                vnk vnkVar2 = this.i;
                dbsk.s(vnkVar2);
                if (i < vnkVar2.aG()) {
                    vnk vnkVar3 = this.i;
                    dbsk.s(vnkVar3);
                    dwac bq = vnkVar3.bq(i);
                    if (bq != null) {
                        F.g(bq);
                    }
                    i++;
                }
            }
        }
        return F.f();
    }

    private final synchronized void q(@dzsi amte amteVar) {
        vnk vnkVar = this.i;
        dbsk.s(vnkVar);
        synchronized (vnkVar) {
            vnk vnkVar2 = this.i;
            dbsk.s(vnkVar2);
            vnkVar2.aB(amteVar);
            if (amteVar != null) {
                vnk vnkVar3 = this.i;
                dbsk.s(vnkVar3);
                vnkVar3.F(amteVar);
                vnk vnkVar4 = this.i;
                dbsk.s(vnkVar4);
                vun ae = vnkVar4.ae();
                if (ae != null) {
                    dphq dphqVar = ae.b.e;
                    if (dphqVar == null) {
                        dphqVar = dphq.m;
                    }
                    int a = dpho.a(dphqVar.c);
                    if (a != 0 && a == 2) {
                        vnk vnkVar5 = this.i;
                        dbsk.s(vnkVar5);
                        vnkVar5.R(this.w.d(this.i.h(), amteVar.d(), 3, vul.DIRECTIONS_UI));
                    }
                    vnk vnkVar6 = this.i;
                    dbsk.s(vnkVar6);
                    vum vumVar = new vum(ae);
                    vumVar.c(o());
                    vumVar.p = false;
                    vnkVar6.af(vumVar.a());
                }
                if (this.A.getDirectionsPageParameters().x && amteVar.b == dqvj.TRANSIT) {
                    vnk vnkVar7 = this.i;
                    dbsk.s(vnkVar7);
                    vnkVar7.bs(amteVar.a.g());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[Catch: all -> 0x0186, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0013, B:7:0x001f, B:8:0x0020, B:10:0x0038, B:53:0x0150, B:54:0x016b, B:58:0x017d, B:59:0x0183, B:13:0x0053, B:15:0x0059, B:17:0x0067, B:20:0x0073, B:22:0x007b, B:23:0x0080, B:31:0x00af, B:26:0x008c, B:28:0x009a, B:32:0x00c6, B:35:0x00e0, B:37:0x00e7, B:39:0x00f5, B:51:0x0139, B:42:0x0101, B:44:0x0109, B:45:0x010e, B:48:0x0119), top: B:70:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139 A[Catch: all -> 0x0186, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0013, B:7:0x001f, B:8:0x0020, B:10:0x0038, B:53:0x0150, B:54:0x016b, B:58:0x017d, B:59:0x0183, B:13:0x0053, B:15:0x0059, B:17:0x0067, B:20:0x0073, B:22:0x007b, B:23:0x0080, B:31:0x00af, B:26:0x008c, B:28:0x009a, B:32:0x00c6, B:35:0x00e0, B:37:0x00e7, B:39:0x00f5, B:51:0x0139, B:42:0x0101, B:44:0x0109, B:45:0x010e, B:48:0x0119), top: B:70:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void r(defpackage.qbm r13) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prx.r(qbm):void");
    }

    private final void s(final qbn qbnVar) {
        long max = Math.max(this.M - this.r.e(), 0L);
        this.r.e();
        this.c.a(new Runnable(this, qbnVar) { // from class: pru
            private final prx a;
            private final qbn b;

            {
                this.a = this;
                this.b = qbnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                prx prxVar = this.a;
                qbn qbnVar2 = this.b;
                prxVar.h(qbnVar2, qbnVar2.a(), false);
            }
        }, bvrj.UI_THREAD, max);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
        if (r2.b != 2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
        r9 = (java.lang.String) r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (r9.equals(r5.c().g().f()) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
        r9 = defpackage.qfo.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.vnr t(defpackage.qbm r9) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prx.t(qbm):vnr");
    }

    private final synchronized boolean u() {
        boolean z = true;
        if (this.H == null) {
            return true;
        }
        vnk vnkVar = this.i;
        dbsk.s(vnkVar);
        synchronized (vnkVar) {
            vnk vnkVar2 = this.i;
            dbsk.s(vnkVar2);
            vwn d = vnkVar2.l().d();
            amte p2 = d.p();
            if (p2 == null) {
                return false;
            }
            amub b = p2.b(d.e(), this.m);
            if (b != null) {
                byym byymVar = this.H;
                dbsk.s(byymVar);
                if (byymVar.c().a(b)) {
                    return z;
                }
            }
            z = false;
            return z;
        }
    }

    private final void v(vwn vwnVar, @dzsi dspd dspdVar, @dzsi dspd dspdVar2, int i) {
        amte p2;
        amub b;
        qbn qbnVar = this.J;
        if ((qbnVar == null || !qbnVar.a().b()) && !u() && (p2 = vwnVar.p()) != null && (b = p2.b(vwnVar.e(), this.m)) != null) {
            vxg vxgVar = new vxg(b.d);
            if (!vxgVar.e().a() && !vxgVar.f().a()) {
                return;
            }
            dspd dspdVar3 = null;
            vun n = n(o(), null);
            if (dspdVar == null && dspdVar2 == null) {
                zah zahVar = this.u;
                amve amveVar = b.d;
                if ((amveVar.a.a & 64) != 0) {
                    vxg vxgVar2 = new vxg(amveVar);
                    dbsg<dpic> e = vxgVar2.e();
                    dspd dspdVar4 = e.a() ? e.b().e : null;
                    dbsg<dpic> f = vxgVar2.f();
                    if (f.a()) {
                        dspdVar3 = f.b().e;
                    }
                    n = zahVar.a(n, amveVar.a.g, dspdVar4, dspdVar3);
                }
            } else {
                n = this.u.a(n, b.d.a.g, dspdVar, dspdVar2);
            }
            vnk vnkVar = this.i;
            dbsk.s(vnkVar);
            zan.d(vnkVar, this.m, vwnVar.e(), i, 2, this.h);
            srv a = this.N.a();
            a.p(n);
            l();
            this.I = a;
            this.J = a;
            this.K = vwnVar.e();
            this.O = i;
        }
    }

    public final synchronized void a(qbn qbnVar) {
        qbm a = qbnVar.a();
        this.I = qbnVar;
        if (a.b()) {
            l();
        } else {
            m();
        }
        if (a.d()) {
            t(a);
            return;
        }
        this.M = this.r.e() + q;
        if (!a.c()) {
            return;
        }
        vnk vnkVar = this.i;
        dbsk.s(vnkVar);
        synchronized (vnkVar) {
            this.i.af(a.g());
        }
        if (a.b()) {
            s(qbnVar);
        } else {
            t(a);
        }
    }

    public final synchronized void b(vnk vnkVar, prw prwVar, byym byymVar) {
        if (this.i != null) {
            bvoo.h("More than one state at a time.", new Object[0]);
        }
        this.i = vnkVar;
        if (this.j != null) {
            bvoo.h("More than one listener at a time.", new Object[0]);
        }
        this.j = prwVar;
        this.H = byymVar;
        this.E.a();
        this.c.b(new Runnable(this) { // from class: prt
            private final prx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FileInputStream fileInputStream;
                amte amteVar;
                final prx prxVar = this.a;
                synchronized (prxVar.a) {
                    String valueOf = String.valueOf(prxVar.m.getCacheDir());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append(valueOf);
                    sb.append("fetchedDirections.txt");
                    File file = new File(sb.toString());
                    final amte amteVar2 = null;
                    if (file.exists()) {
                        try {
                            fileInputStream = new FileInputStream(file);
                            amteVar = (amte) new ObjectInputStream(fileInputStream).readObject();
                        } catch (IOException | ClassNotFoundException unused) {
                        }
                        try {
                            fileInputStream.close();
                            file.delete();
                            amteVar2 = amteVar;
                        } catch (IOException | ClassNotFoundException unused2) {
                            amteVar2 = amteVar;
                            ((ckcn) prxVar.b.a(ckeq.s)).a();
                            final vnr vnrVar = (vnr) prxVar.n.H(bvjk.jS, vnr.class, vnr.FULLY_REPLACED);
                            prxVar.n.P(bvjk.jS);
                            prxVar.c.b(new Runnable(prxVar, amteVar2, vnrVar) { // from class: prv
                                private final prx a;
                                private final amte b;
                                private final vnr c;

                                {
                                    this.a = prxVar;
                                    this.b = amteVar2;
                                    this.c = vnrVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    prx prxVar2 = this.a;
                                    amte amteVar3 = this.b;
                                    vnr vnrVar2 = this.c;
                                    synchronized (prxVar2) {
                                        if (amteVar3 != null) {
                                            prw prwVar2 = prxVar2.j;
                                            dbsk.s(prwVar2);
                                            prwVar2.a(vnrVar2);
                                        }
                                    }
                                }
                            }, bvrj.UI_THREAD);
                        }
                    }
                    final vnr vnrVar2 = (vnr) prxVar.n.H(bvjk.jS, vnr.class, vnr.FULLY_REPLACED);
                    prxVar.n.P(bvjk.jS);
                    prxVar.c.b(new Runnable(prxVar, amteVar2, vnrVar2) { // from class: prv
                        private final prx a;
                        private final amte b;
                        private final vnr c;

                        {
                            this.a = prxVar;
                            this.b = amteVar2;
                            this.c = vnrVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            prx prxVar2 = this.a;
                            amte amteVar3 = this.b;
                            vnr vnrVar22 = this.c;
                            synchronized (prxVar2) {
                                if (amteVar3 != null) {
                                    prw prwVar2 = prxVar2.j;
                                    dbsk.s(prwVar2);
                                    prwVar2.a(vnrVar22);
                                }
                            }
                        }
                    }, bvrj.UI_THREAD);
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    public final synchronized void c() {
        m();
        qbn qbnVar = this.I;
        this.I = null;
        boolean b = qbnVar != null ? qbnVar.a().b() : false;
        vnk vnkVar = this.i;
        dbsk.s(vnkVar);
        synchronized (vnkVar) {
            if (b) {
                qbnVar.c();
                vnk vnkVar2 = this.i;
                dbsk.s(vnkVar2);
                vnkVar2.af(null);
            }
            vnk vnkVar3 = this.i;
            dbsk.s(vnkVar3);
            vnkVar3.o();
            vnk vnkVar4 = this.i;
            dbsk.s(vnkVar4);
            zan.b(vnkVar4, this.m, this.h);
        }
        this.e.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        vnk vnkVar = this.i;
        dbsk.s(vnkVar);
        synchronized (vnkVar) {
            vnk vnkVar2 = this.i;
            dbsk.s(vnkVar2);
            vwn d = vnkVar2.l().d();
            if (zan.a(d, d.e())) {
                return;
            }
            v(d, null, null, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(@dzsi dspd dspdVar, @dzsi dspd dspdVar2, boolean z) {
        vnk vnkVar = this.i;
        dbsk.s(vnkVar);
        synchronized (vnkVar) {
            vnk vnkVar2 = this.i;
            dbsk.s(vnkVar2);
            v(vnkVar2.l().d(), dspdVar, dspdVar2, z ? 3 : 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dehn<dbsg<amte>> f(boolean z, final boolean z2) {
        vnu l;
        qbs t;
        dcdc<qdv> b;
        synchronized (this) {
            vnk vnkVar = this.i;
            dbsk.s(vnkVar);
            synchronized (vnkVar) {
                vnk vnkVar2 = this.i;
                dbsk.s(vnkVar2);
                l = vnkVar2.l();
                vnk vnkVar3 = this.i;
                dbsk.s(vnkVar3);
                t = vnkVar3.t();
            }
        }
        return deew.h(this.e.b(b, r1), new dbrn(this, z2, r1) { // from class: prr
            private final prx a;
            private final boolean b;
            private final boolean c;

            {
                this.a = this;
                this.b = z2;
                this.c = r3;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                amte amteVar;
                prx prxVar = this.a;
                boolean z3 = this.b;
                boolean z4 = this.c;
                Map<qdv, dopk> map = (Map) obj;
                prxVar.g.a(xcs.b(map.values()), ckkm.y, ckkm.z);
                synchronized (prxVar) {
                    vnk vnkVar4 = prxVar.i;
                    amteVar = null;
                    if (vnkVar4 != null) {
                        boolean z5 = false;
                        if (z3 && !z4) {
                            z5 = true;
                        }
                        synchronized (vnkVar4) {
                            vnk vnkVar5 = prxVar.i;
                            dbsk.s(vnkVar5);
                            int aW = vnkVar5.aW(dqvj.TRANSIT);
                            if (aW != -1) {
                                vnk vnkVar6 = prxVar.i;
                                dbsk.s(vnkVar6);
                                vnu vnuVar = vnkVar6.r().get(aW);
                                vnk vnkVar7 = prxVar.i;
                                dbsk.s(vnkVar7);
                                vun ae = vnkVar7.ae();
                                vnk vnkVar8 = prxVar.i;
                                dbsk.s(vnkVar8);
                                qbs t2 = vnkVar8.t();
                                vwn d = vnuVar.d();
                                amte p2 = d.p();
                                if (p2 != null) {
                                    final amte b2 = prxVar.f.b(p2, map, null, prxVar.g(t2));
                                    if (z5 && zag.a(b2, p2)) {
                                        prxVar.k.set(true);
                                    }
                                    vwn a = prxVar.h.a(d, new mw(b2) { // from class: prs
                                        private final amte a;

                                        {
                                            this.a = b2;
                                        }

                                        @Override // defpackage.mw
                                        public final void a(Object obj2) {
                                            amte amteVar2 = this.a;
                                            int i = prx.o;
                                            ((vwl) obj2).q(amteVar2);
                                        }
                                    });
                                    if (ae != null) {
                                        vns vnsVar = prxVar.d;
                                        vnk vnkVar9 = prxVar.i;
                                        dbsk.s(vnkVar9);
                                        vnsVar.a(vnkVar9, a, dqvj.TRANSIT, ae);
                                        amteVar = b2;
                                    }
                                }
                            }
                        }
                        if (amteVar != null) {
                            prw prwVar = prxVar.j;
                            dbsk.s(prwVar);
                            prwVar.a(vnr.REALTIME_UPDATED);
                        }
                    }
                }
                return dbsg.j(amteVar);
            }
        }, this.y);
        boolean g = g(t);
        if (l.a() != dqvj.TRANSIT) {
            b = dcdc.e();
        } else {
            amte p2 = l.d().p();
            if (p2 == null) {
                b = dcdc.e();
            } else {
                amsy amsyVar = p2.a;
                int e = l.d().e();
                boolean F = amsyVar.F();
                qbs qbsVar = qbs.DEFAULT;
                int ordinal = t.ordinal();
                if (ordinal == 0) {
                    b = zat.b(amsyVar, F, g);
                } else if (ordinal == 2) {
                    b = zat.a(amsyVar.m(e), F, g);
                } else {
                    b = dcdc.e();
                }
            }
        }
        final boolean z3 = true;
        if (!z2 || (!this.k.getAndSet(false) && !z)) {
            z3 = false;
        }
        return deew.h(this.e.b(b, z3), new dbrn(this, z2, z3) { // from class: prr
            private final prx a;
            private final boolean b;
            private final boolean c;

            {
                this.a = this;
                this.b = z2;
                this.c = z3;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                amte amteVar;
                prx prxVar = this.a;
                boolean z32 = this.b;
                boolean z4 = this.c;
                Map<qdv, dopk> map = (Map) obj;
                prxVar.g.a(xcs.b(map.values()), ckkm.y, ckkm.z);
                synchronized (prxVar) {
                    vnk vnkVar4 = prxVar.i;
                    amteVar = null;
                    if (vnkVar4 != null) {
                        boolean z5 = false;
                        if (z32 && !z4) {
                            z5 = true;
                        }
                        synchronized (vnkVar4) {
                            vnk vnkVar5 = prxVar.i;
                            dbsk.s(vnkVar5);
                            int aW = vnkVar5.aW(dqvj.TRANSIT);
                            if (aW != -1) {
                                vnk vnkVar6 = prxVar.i;
                                dbsk.s(vnkVar6);
                                vnu vnuVar = vnkVar6.r().get(aW);
                                vnk vnkVar7 = prxVar.i;
                                dbsk.s(vnkVar7);
                                vun ae = vnkVar7.ae();
                                vnk vnkVar8 = prxVar.i;
                                dbsk.s(vnkVar8);
                                qbs t2 = vnkVar8.t();
                                vwn d = vnuVar.d();
                                amte p22 = d.p();
                                if (p22 != null) {
                                    final amte b2 = prxVar.f.b(p22, map, null, prxVar.g(t2));
                                    if (z5 && zag.a(b2, p22)) {
                                        prxVar.k.set(true);
                                    }
                                    vwn a = prxVar.h.a(d, new mw(b2) { // from class: prs
                                        private final amte a;

                                        {
                                            this.a = b2;
                                        }

                                        @Override // defpackage.mw
                                        public final void a(Object obj2) {
                                            amte amteVar2 = this.a;
                                            int i = prx.o;
                                            ((vwl) obj2).q(amteVar2);
                                        }
                                    });
                                    if (ae != null) {
                                        vns vnsVar = prxVar.d;
                                        vnk vnkVar9 = prxVar.i;
                                        dbsk.s(vnkVar9);
                                        vnsVar.a(vnkVar9, a, dqvj.TRANSIT, ae);
                                        amteVar = b2;
                                    }
                                }
                            }
                        }
                        if (amteVar != null) {
                            prw prwVar = prxVar.j;
                            dbsk.s(prwVar);
                            prwVar.a(vnr.REALTIME_UPDATED);
                        }
                    }
                }
                return dbsg.j(amteVar);
            }
        }, this.y);
    }

    public final boolean g(qbs qbsVar) {
        return qbsVar == qbs.TRANSIT_TRIP_DETAILS && this.G.d();
    }

    public final void h(qbn qbnVar, qbm qbmVar, boolean z) {
        amte n;
        vnr t;
        int a;
        synchronized (this) {
            vnk vnkVar = this.i;
            dbsk.s(vnkVar);
            zan.b(vnkVar, this.m, this.h);
            if (qbnVar != this.I) {
                return;
            }
            this.E.a();
            qbn qbnVar2 = this.J;
            qbmVar.d();
            qbmVar.b();
            qbmVar.c();
            eapd eapdVar = null;
            if (qbnVar != qbnVar2) {
                if (qbmVar.b() && qbmVar.c() && z) {
                    s(qbnVar);
                    return;
                }
                n = qbmVar.n();
                if (qbmVar.o()) {
                    dbsk.s(n);
                    if (n.a.d()) {
                        qbnVar.d();
                    }
                }
                if (!qbmVar.b()) {
                    this.I = null;
                    m();
                }
                t = t(qbmVar);
            } else {
                if (!u()) {
                    r(qbmVar);
                }
                t = vnr.TRIP_MODIFIED_WITH_ALTERNATES;
                n = null;
            }
            if (n != null) {
                amsy amsyVar = n.a;
                long j = 0;
                for (int i = 0; i < amsyVar.n(); i++) {
                    amve m = amsyVar.m(i);
                    for (int i2 = 0; i2 < m.e(); i2++) {
                        amtr d = m.d(i2);
                        for (int i3 = 0; i3 < d.e(); i3++) {
                            dphd dphdVar = d.d(i3).g().r;
                            if (dphdVar == null) {
                                dphdVar = dphd.f;
                            }
                            if ((dphdVar.a & 8) != 0) {
                                dpuc dpucVar = dphdVar.e;
                                if (dpucVar == null) {
                                    dpucVar = dpuc.c;
                                }
                                j = Math.max(j, dpucVar.b);
                            }
                        }
                    }
                }
                eapdVar = j != 0 ? new eapd(j) : null;
            }
            this.g.a(eapdVar, ckkm.w, ckkm.x);
            prw prwVar = this.j;
            dbsk.s(prwVar);
            dbsk.s(t);
            prwVar.a(t);
            if (n != null && (a = dwaj.a(n.a.e().a)) != 0 && a == 3) {
                prw prwVar2 = this.j;
                dbsk.s(prwVar2);
                Toast.makeText(((fd) prwVar2).J(), ((fd) prwVar2).Rp(R.string.LIMITED_ROUTE_OPTIONS), 1).show();
            }
            if (n == null) {
                return;
            }
            if (qbmVar.c()) {
                this.x.a(n.c);
            }
            this.D.a().a(qbmVar);
            this.B.a(n.a);
        }
    }

    public final synchronized boolean i() {
        qbn qbnVar = this.I;
        if (qbnVar == null) {
            return false;
        }
        return qbnVar.a().b();
    }

    public final synchronized void j() {
        vwn a;
        vnk vnkVar = this.i;
        dbsk.s(vnkVar);
        synchronized (vnkVar) {
            vns vnsVar = this.d;
            vnk vnkVar2 = this.i;
            dbsk.s(vnkVar2);
            synchronized (vnkVar2) {
                vwn d = vnkVar2.l().d();
                if (d.p() == null) {
                    bvoo.h("Attempted to upgrade pending storage item without a current storage item", new Object[0]);
                } else {
                    vnv vnvVar = vnsVar.b;
                    dcdc<vnu> r = vnkVar2.r();
                    if (d.q() == null) {
                        a = d.x(0);
                    } else {
                        vwl o2 = vwn.o();
                        o2.q(d.q());
                        a = o2.a();
                    }
                    vnkVar2.S(vnvVar.a(r, a, vnkVar2.ae(), vnkVar2.g()));
                }
            }
            vnk vnkVar3 = this.i;
            dbsk.s(vnkVar3);
            q(vnkVar3.l().d().p());
        }
        prw prwVar = this.j;
        dbsk.s(prwVar);
        prwVar.a(vnr.FULLY_REPLACED);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d5, code lost:
        if (r9.get(12) == r7.get(12)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0432, code lost:
        if (r3.l().a().equals(defpackage.dqvj.WALK) != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
        r16 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:274:0x053c A[Catch: all -> 0x05cc, TryCatch #4 {, blocks: (B:4:0x0003, B:5:0x0008, B:6:0x0009, B:8:0x0012, B:10:0x0025, B:12:0x002b, B:15:0x002e, B:17:0x0045, B:18:0x004a, B:86:0x01ac, B:87:0x01b7, B:90:0x01ba, B:94:0x01c7, B:98:0x01da, B:100:0x01eb, B:102:0x01fd, B:104:0x0207, B:106:0x0211, B:108:0x021b, B:110:0x0225, B:112:0x022f, B:114:0x0239, B:116:0x024b, B:126:0x027b, B:128:0x0283, B:130:0x0289, B:131:0x028b, B:149:0x02d7, B:151:0x02ea, B:134:0x0292, B:136:0x0298, B:137:0x029a, B:139:0x02a2, B:140:0x02a4, B:142:0x02a8, B:144:0x02ac, B:147:0x02bd, B:119:0x0256, B:123:0x0263, B:125:0x0277, B:155:0x02ee, B:156:0x02f3, B:186:0x03fc, B:188:0x0400, B:189:0x040a, B:191:0x041f, B:196:0x043f, B:200:0x044d, B:207:0x045c, B:220:0x048a, B:225:0x049f, B:227:0x04b0, B:228:0x04b2, B:230:0x04ba, B:231:0x04bc, B:233:0x04c4, B:235:0x04cf, B:236:0x04d1, B:238:0x04d5, B:239:0x04d7, B:241:0x04db, B:242:0x04dd, B:244:0x04e1, B:245:0x04e3, B:247:0x04e7, B:248:0x04e9, B:250:0x04fc, B:251:0x04fe, B:253:0x0504, B:254:0x0506, B:256:0x050a, B:257:0x050c, B:259:0x051a, B:260:0x051c, B:262:0x0520, B:263:0x0522, B:265:0x0526, B:267:0x052a, B:272:0x0532, B:274:0x053c, B:276:0x0541, B:278:0x0545, B:279:0x0547, B:281:0x054f, B:283:0x0553, B:284:0x0555, B:286:0x0566, B:287:0x0568, B:299:0x057f, B:301:0x058b, B:303:0x0595, B:302:0x0591, B:275:0x053f, B:304:0x0598, B:305:0x05c1, B:199:0x044b, B:195:0x0437, B:166:0x0305, B:180:0x03d1, B:182:0x03e0, B:184:0x03f3, B:185:0x03fb, B:167:0x030f, B:168:0x032b, B:169:0x0351, B:171:0x0371, B:174:0x0378, B:176:0x03aa, B:175:0x038a, B:177:0x03ae, B:179:0x03c9, B:309:0x05c5, B:19:0x004b, B:20:0x0062, B:22:0x006a, B:25:0x0078, B:27:0x007a, B:30:0x0088, B:32:0x008e, B:34:0x0094, B:36:0x0099, B:38:0x009e, B:41:0x00a9, B:43:0x00b8, B:65:0x0135, B:47:0x00d1, B:49:0x00d7, B:58:0x00f2, B:61:0x0124, B:66:0x0139, B:68:0x014b, B:70:0x0160, B:74:0x0173, B:76:0x017e, B:78:0x0185, B:80:0x0190, B:82:0x019c, B:84:0x01a9, B:208:0x045d, B:209:0x0469, B:211:0x046f, B:213:0x0477, B:215:0x047d, B:217:0x0487, B:219:0x0489), top: B:324:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x053f A[Catch: all -> 0x05cc, TryCatch #4 {, blocks: (B:4:0x0003, B:5:0x0008, B:6:0x0009, B:8:0x0012, B:10:0x0025, B:12:0x002b, B:15:0x002e, B:17:0x0045, B:18:0x004a, B:86:0x01ac, B:87:0x01b7, B:90:0x01ba, B:94:0x01c7, B:98:0x01da, B:100:0x01eb, B:102:0x01fd, B:104:0x0207, B:106:0x0211, B:108:0x021b, B:110:0x0225, B:112:0x022f, B:114:0x0239, B:116:0x024b, B:126:0x027b, B:128:0x0283, B:130:0x0289, B:131:0x028b, B:149:0x02d7, B:151:0x02ea, B:134:0x0292, B:136:0x0298, B:137:0x029a, B:139:0x02a2, B:140:0x02a4, B:142:0x02a8, B:144:0x02ac, B:147:0x02bd, B:119:0x0256, B:123:0x0263, B:125:0x0277, B:155:0x02ee, B:156:0x02f3, B:186:0x03fc, B:188:0x0400, B:189:0x040a, B:191:0x041f, B:196:0x043f, B:200:0x044d, B:207:0x045c, B:220:0x048a, B:225:0x049f, B:227:0x04b0, B:228:0x04b2, B:230:0x04ba, B:231:0x04bc, B:233:0x04c4, B:235:0x04cf, B:236:0x04d1, B:238:0x04d5, B:239:0x04d7, B:241:0x04db, B:242:0x04dd, B:244:0x04e1, B:245:0x04e3, B:247:0x04e7, B:248:0x04e9, B:250:0x04fc, B:251:0x04fe, B:253:0x0504, B:254:0x0506, B:256:0x050a, B:257:0x050c, B:259:0x051a, B:260:0x051c, B:262:0x0520, B:263:0x0522, B:265:0x0526, B:267:0x052a, B:272:0x0532, B:274:0x053c, B:276:0x0541, B:278:0x0545, B:279:0x0547, B:281:0x054f, B:283:0x0553, B:284:0x0555, B:286:0x0566, B:287:0x0568, B:299:0x057f, B:301:0x058b, B:303:0x0595, B:302:0x0591, B:275:0x053f, B:304:0x0598, B:305:0x05c1, B:199:0x044b, B:195:0x0437, B:166:0x0305, B:180:0x03d1, B:182:0x03e0, B:184:0x03f3, B:185:0x03fb, B:167:0x030f, B:168:0x032b, B:169:0x0351, B:171:0x0371, B:174:0x0378, B:176:0x03aa, B:175:0x038a, B:177:0x03ae, B:179:0x03c9, B:309:0x05c5, B:19:0x004b, B:20:0x0062, B:22:0x006a, B:25:0x0078, B:27:0x007a, B:30:0x0088, B:32:0x008e, B:34:0x0094, B:36:0x0099, B:38:0x009e, B:41:0x00a9, B:43:0x00b8, B:65:0x0135, B:47:0x00d1, B:49:0x00d7, B:58:0x00f2, B:61:0x0124, B:66:0x0139, B:68:0x014b, B:70:0x0160, B:74:0x0173, B:76:0x017e, B:78:0x0185, B:80:0x0190, B:82:0x019c, B:84:0x01a9, B:208:0x045d, B:209:0x0469, B:211:0x046f, B:213:0x0477, B:215:0x047d, B:217:0x0487, B:219:0x0489), top: B:324:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0545 A[Catch: all -> 0x05cc, TryCatch #4 {, blocks: (B:4:0x0003, B:5:0x0008, B:6:0x0009, B:8:0x0012, B:10:0x0025, B:12:0x002b, B:15:0x002e, B:17:0x0045, B:18:0x004a, B:86:0x01ac, B:87:0x01b7, B:90:0x01ba, B:94:0x01c7, B:98:0x01da, B:100:0x01eb, B:102:0x01fd, B:104:0x0207, B:106:0x0211, B:108:0x021b, B:110:0x0225, B:112:0x022f, B:114:0x0239, B:116:0x024b, B:126:0x027b, B:128:0x0283, B:130:0x0289, B:131:0x028b, B:149:0x02d7, B:151:0x02ea, B:134:0x0292, B:136:0x0298, B:137:0x029a, B:139:0x02a2, B:140:0x02a4, B:142:0x02a8, B:144:0x02ac, B:147:0x02bd, B:119:0x0256, B:123:0x0263, B:125:0x0277, B:155:0x02ee, B:156:0x02f3, B:186:0x03fc, B:188:0x0400, B:189:0x040a, B:191:0x041f, B:196:0x043f, B:200:0x044d, B:207:0x045c, B:220:0x048a, B:225:0x049f, B:227:0x04b0, B:228:0x04b2, B:230:0x04ba, B:231:0x04bc, B:233:0x04c4, B:235:0x04cf, B:236:0x04d1, B:238:0x04d5, B:239:0x04d7, B:241:0x04db, B:242:0x04dd, B:244:0x04e1, B:245:0x04e3, B:247:0x04e7, B:248:0x04e9, B:250:0x04fc, B:251:0x04fe, B:253:0x0504, B:254:0x0506, B:256:0x050a, B:257:0x050c, B:259:0x051a, B:260:0x051c, B:262:0x0520, B:263:0x0522, B:265:0x0526, B:267:0x052a, B:272:0x0532, B:274:0x053c, B:276:0x0541, B:278:0x0545, B:279:0x0547, B:281:0x054f, B:283:0x0553, B:284:0x0555, B:286:0x0566, B:287:0x0568, B:299:0x057f, B:301:0x058b, B:303:0x0595, B:302:0x0591, B:275:0x053f, B:304:0x0598, B:305:0x05c1, B:199:0x044b, B:195:0x0437, B:166:0x0305, B:180:0x03d1, B:182:0x03e0, B:184:0x03f3, B:185:0x03fb, B:167:0x030f, B:168:0x032b, B:169:0x0351, B:171:0x0371, B:174:0x0378, B:176:0x03aa, B:175:0x038a, B:177:0x03ae, B:179:0x03c9, B:309:0x05c5, B:19:0x004b, B:20:0x0062, B:22:0x006a, B:25:0x0078, B:27:0x007a, B:30:0x0088, B:32:0x008e, B:34:0x0094, B:36:0x0099, B:38:0x009e, B:41:0x00a9, B:43:0x00b8, B:65:0x0135, B:47:0x00d1, B:49:0x00d7, B:58:0x00f2, B:61:0x0124, B:66:0x0139, B:68:0x014b, B:70:0x0160, B:74:0x0173, B:76:0x017e, B:78:0x0185, B:80:0x0190, B:82:0x019c, B:84:0x01a9, B:208:0x045d, B:209:0x0469, B:211:0x046f, B:213:0x0477, B:215:0x047d, B:217:0x0487, B:219:0x0489), top: B:324:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x054f A[Catch: all -> 0x05cc, TryCatch #4 {, blocks: (B:4:0x0003, B:5:0x0008, B:6:0x0009, B:8:0x0012, B:10:0x0025, B:12:0x002b, B:15:0x002e, B:17:0x0045, B:18:0x004a, B:86:0x01ac, B:87:0x01b7, B:90:0x01ba, B:94:0x01c7, B:98:0x01da, B:100:0x01eb, B:102:0x01fd, B:104:0x0207, B:106:0x0211, B:108:0x021b, B:110:0x0225, B:112:0x022f, B:114:0x0239, B:116:0x024b, B:126:0x027b, B:128:0x0283, B:130:0x0289, B:131:0x028b, B:149:0x02d7, B:151:0x02ea, B:134:0x0292, B:136:0x0298, B:137:0x029a, B:139:0x02a2, B:140:0x02a4, B:142:0x02a8, B:144:0x02ac, B:147:0x02bd, B:119:0x0256, B:123:0x0263, B:125:0x0277, B:155:0x02ee, B:156:0x02f3, B:186:0x03fc, B:188:0x0400, B:189:0x040a, B:191:0x041f, B:196:0x043f, B:200:0x044d, B:207:0x045c, B:220:0x048a, B:225:0x049f, B:227:0x04b0, B:228:0x04b2, B:230:0x04ba, B:231:0x04bc, B:233:0x04c4, B:235:0x04cf, B:236:0x04d1, B:238:0x04d5, B:239:0x04d7, B:241:0x04db, B:242:0x04dd, B:244:0x04e1, B:245:0x04e3, B:247:0x04e7, B:248:0x04e9, B:250:0x04fc, B:251:0x04fe, B:253:0x0504, B:254:0x0506, B:256:0x050a, B:257:0x050c, B:259:0x051a, B:260:0x051c, B:262:0x0520, B:263:0x0522, B:265:0x0526, B:267:0x052a, B:272:0x0532, B:274:0x053c, B:276:0x0541, B:278:0x0545, B:279:0x0547, B:281:0x054f, B:283:0x0553, B:284:0x0555, B:286:0x0566, B:287:0x0568, B:299:0x057f, B:301:0x058b, B:303:0x0595, B:302:0x0591, B:275:0x053f, B:304:0x0598, B:305:0x05c1, B:199:0x044b, B:195:0x0437, B:166:0x0305, B:180:0x03d1, B:182:0x03e0, B:184:0x03f3, B:185:0x03fb, B:167:0x030f, B:168:0x032b, B:169:0x0351, B:171:0x0371, B:174:0x0378, B:176:0x03aa, B:175:0x038a, B:177:0x03ae, B:179:0x03c9, B:309:0x05c5, B:19:0x004b, B:20:0x0062, B:22:0x006a, B:25:0x0078, B:27:0x007a, B:30:0x0088, B:32:0x008e, B:34:0x0094, B:36:0x0099, B:38:0x009e, B:41:0x00a9, B:43:0x00b8, B:65:0x0135, B:47:0x00d1, B:49:0x00d7, B:58:0x00f2, B:61:0x0124, B:66:0x0139, B:68:0x014b, B:70:0x0160, B:74:0x0173, B:76:0x017e, B:78:0x0185, B:80:0x0190, B:82:0x019c, B:84:0x01a9, B:208:0x045d, B:209:0x0469, B:211:0x046f, B:213:0x0477, B:215:0x047d, B:217:0x0487, B:219:0x0489), top: B:324:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0574 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x058b A[Catch: all -> 0x05cc, TryCatch #4 {, blocks: (B:4:0x0003, B:5:0x0008, B:6:0x0009, B:8:0x0012, B:10:0x0025, B:12:0x002b, B:15:0x002e, B:17:0x0045, B:18:0x004a, B:86:0x01ac, B:87:0x01b7, B:90:0x01ba, B:94:0x01c7, B:98:0x01da, B:100:0x01eb, B:102:0x01fd, B:104:0x0207, B:106:0x0211, B:108:0x021b, B:110:0x0225, B:112:0x022f, B:114:0x0239, B:116:0x024b, B:126:0x027b, B:128:0x0283, B:130:0x0289, B:131:0x028b, B:149:0x02d7, B:151:0x02ea, B:134:0x0292, B:136:0x0298, B:137:0x029a, B:139:0x02a2, B:140:0x02a4, B:142:0x02a8, B:144:0x02ac, B:147:0x02bd, B:119:0x0256, B:123:0x0263, B:125:0x0277, B:155:0x02ee, B:156:0x02f3, B:186:0x03fc, B:188:0x0400, B:189:0x040a, B:191:0x041f, B:196:0x043f, B:200:0x044d, B:207:0x045c, B:220:0x048a, B:225:0x049f, B:227:0x04b0, B:228:0x04b2, B:230:0x04ba, B:231:0x04bc, B:233:0x04c4, B:235:0x04cf, B:236:0x04d1, B:238:0x04d5, B:239:0x04d7, B:241:0x04db, B:242:0x04dd, B:244:0x04e1, B:245:0x04e3, B:247:0x04e7, B:248:0x04e9, B:250:0x04fc, B:251:0x04fe, B:253:0x0504, B:254:0x0506, B:256:0x050a, B:257:0x050c, B:259:0x051a, B:260:0x051c, B:262:0x0520, B:263:0x0522, B:265:0x0526, B:267:0x052a, B:272:0x0532, B:274:0x053c, B:276:0x0541, B:278:0x0545, B:279:0x0547, B:281:0x054f, B:283:0x0553, B:284:0x0555, B:286:0x0566, B:287:0x0568, B:299:0x057f, B:301:0x058b, B:303:0x0595, B:302:0x0591, B:275:0x053f, B:304:0x0598, B:305:0x05c1, B:199:0x044b, B:195:0x0437, B:166:0x0305, B:180:0x03d1, B:182:0x03e0, B:184:0x03f3, B:185:0x03fb, B:167:0x030f, B:168:0x032b, B:169:0x0351, B:171:0x0371, B:174:0x0378, B:176:0x03aa, B:175:0x038a, B:177:0x03ae, B:179:0x03c9, B:309:0x05c5, B:19:0x004b, B:20:0x0062, B:22:0x006a, B:25:0x0078, B:27:0x007a, B:30:0x0088, B:32:0x008e, B:34:0x0094, B:36:0x0099, B:38:0x009e, B:41:0x00a9, B:43:0x00b8, B:65:0x0135, B:47:0x00d1, B:49:0x00d7, B:58:0x00f2, B:61:0x0124, B:66:0x0139, B:68:0x014b, B:70:0x0160, B:74:0x0173, B:76:0x017e, B:78:0x0185, B:80:0x0190, B:82:0x019c, B:84:0x01a9, B:208:0x045d, B:209:0x0469, B:211:0x046f, B:213:0x0477, B:215:0x047d, B:217:0x0487, B:219:0x0489), top: B:324:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0591 A[Catch: all -> 0x05cc, TryCatch #4 {, blocks: (B:4:0x0003, B:5:0x0008, B:6:0x0009, B:8:0x0012, B:10:0x0025, B:12:0x002b, B:15:0x002e, B:17:0x0045, B:18:0x004a, B:86:0x01ac, B:87:0x01b7, B:90:0x01ba, B:94:0x01c7, B:98:0x01da, B:100:0x01eb, B:102:0x01fd, B:104:0x0207, B:106:0x0211, B:108:0x021b, B:110:0x0225, B:112:0x022f, B:114:0x0239, B:116:0x024b, B:126:0x027b, B:128:0x0283, B:130:0x0289, B:131:0x028b, B:149:0x02d7, B:151:0x02ea, B:134:0x0292, B:136:0x0298, B:137:0x029a, B:139:0x02a2, B:140:0x02a4, B:142:0x02a8, B:144:0x02ac, B:147:0x02bd, B:119:0x0256, B:123:0x0263, B:125:0x0277, B:155:0x02ee, B:156:0x02f3, B:186:0x03fc, B:188:0x0400, B:189:0x040a, B:191:0x041f, B:196:0x043f, B:200:0x044d, B:207:0x045c, B:220:0x048a, B:225:0x049f, B:227:0x04b0, B:228:0x04b2, B:230:0x04ba, B:231:0x04bc, B:233:0x04c4, B:235:0x04cf, B:236:0x04d1, B:238:0x04d5, B:239:0x04d7, B:241:0x04db, B:242:0x04dd, B:244:0x04e1, B:245:0x04e3, B:247:0x04e7, B:248:0x04e9, B:250:0x04fc, B:251:0x04fe, B:253:0x0504, B:254:0x0506, B:256:0x050a, B:257:0x050c, B:259:0x051a, B:260:0x051c, B:262:0x0520, B:263:0x0522, B:265:0x0526, B:267:0x052a, B:272:0x0532, B:274:0x053c, B:276:0x0541, B:278:0x0545, B:279:0x0547, B:281:0x054f, B:283:0x0553, B:284:0x0555, B:286:0x0566, B:287:0x0568, B:299:0x057f, B:301:0x058b, B:303:0x0595, B:302:0x0591, B:275:0x053f, B:304:0x0598, B:305:0x05c1, B:199:0x044b, B:195:0x0437, B:166:0x0305, B:180:0x03d1, B:182:0x03e0, B:184:0x03f3, B:185:0x03fb, B:167:0x030f, B:168:0x032b, B:169:0x0351, B:171:0x0371, B:174:0x0378, B:176:0x03aa, B:175:0x038a, B:177:0x03ae, B:179:0x03c9, B:309:0x05c5, B:19:0x004b, B:20:0x0062, B:22:0x006a, B:25:0x0078, B:27:0x007a, B:30:0x0088, B:32:0x008e, B:34:0x0094, B:36:0x0099, B:38:0x009e, B:41:0x00a9, B:43:0x00b8, B:65:0x0135, B:47:0x00d1, B:49:0x00d7, B:58:0x00f2, B:61:0x0124, B:66:0x0139, B:68:0x014b, B:70:0x0160, B:74:0x0173, B:76:0x017e, B:78:0x0185, B:80:0x0190, B:82:0x019c, B:84:0x01a9, B:208:0x045d, B:209:0x0469, B:211:0x046f, B:213:0x0477, B:215:0x047d, B:217:0x0487, B:219:0x0489), top: B:324:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int k(int r20, boolean r21, @defpackage.dzsi defpackage.dnqh r22) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prx.k(int, boolean, dnqh):int");
    }
}
