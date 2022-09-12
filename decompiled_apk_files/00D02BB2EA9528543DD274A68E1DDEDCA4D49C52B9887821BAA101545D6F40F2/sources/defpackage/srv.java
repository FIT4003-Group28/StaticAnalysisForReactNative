package defpackage;

import android.app.Application;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: srv  reason: default package */
/* loaded from: classes7.dex */
public final class srv implements qbn {
    @dzsi
    private String A;
    private final vmb B;
    public final dxio<cref> a;
    public final ckcw b;
    public final cqat c;
    public final vmg d;
    public final vmy e;
    public final btrm f;
    public final cjqy g;
    public final Executor h;
    public final vva i;
    public final dxio<crdz> j;
    public sry k;
    public qie l;
    @dzsi
    public avtq m;
    @dzsi
    public avtq n;
    public long o;
    public final vmb p;
    private final Application q;
    private final bvsf r;
    private final btpc s;
    private final vtn t;
    private final avnt u;
    private final ahjq v;
    private final dxio<bvjj> w;
    private final bvrb x;
    private final vwv y;
    @dzsi
    private ckcq z;

    public srv(Application application, dxio<cref> dxioVar, ckcw ckcwVar, bvsf bvsfVar, cqat cqatVar, btpc btpcVar, vtn vtnVar, vmy vmyVar, avnt avntVar, vmg vmgVar, btrm btrmVar, ahjq ahjqVar, dxio<bvjj> dxioVar2, bvrb bvrbVar, cjqy cjqyVar, vwv vwvVar, Executor executor, vva vvaVar, dxio<crdz> dxioVar3) {
        srl srlVar = new srl();
        srlVar.b(0);
        srlVar.a = 1;
        srlVar.e(false);
        srlVar.j(false);
        srlVar.h(false);
        this.k = srlVar.a();
        this.o = 0L;
        this.B = new srs(this);
        this.p = new srt(this);
        this.q = application;
        this.a = dxioVar;
        this.b = ckcwVar;
        this.r = bvsfVar;
        this.c = cqatVar;
        this.s = btpcVar;
        this.t = vtnVar;
        this.d = vmgVar;
        this.e = vmyVar;
        this.u = avntVar;
        this.f = btrmVar;
        this.v = ahjqVar;
        this.w = dxioVar2;
        this.x = bvrbVar;
        this.g = cjqyVar;
        this.y = vwvVar;
        this.h = executor;
        this.i = vvaVar;
        this.j = dxioVar3;
    }

    private final void r(amsy amsyVar) {
        if (this.l == null || !amsyVar.d()) {
            return;
        }
        if (dovb.SUCCESS.equals(amsyVar.s())) {
            this.l.a();
        } else {
            this.l.b();
        }
    }

    private final void s(amte amteVar, List<amub> list) {
        this.t.k(amteVar.k());
        if (amteVar.j) {
            this.t.j(vze.e(this.q));
        } else {
            this.t.h(sro.a(amteVar, list), null);
        }
        t(list);
    }

    private final void t(List<amub> list) {
        dqvj l;
        int v = this.k.v();
        if (list.isEmpty() || (l = this.k.l()) == null) {
            return;
        }
        if ((dqvj.DRIVE != l && dqvj.TWO_WHEELER != l) || !zba.e(list.get(v), this.v, this.w.a(), this.y)) {
            return;
        }
        this.x.b(new Runnable(this) { // from class: srq
            private final srv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().x();
            }
        }, bvrj.UI_THREAD);
    }

    private final void u(amte amteVar) {
        srx w = this.k.w();
        w.f(3);
        w.e(false);
        w.k(amteVar);
        this.k = w.a();
        this.f.b(new srf(this, this.k));
        if (this.k.f()) {
            v();
        }
        r(amteVar.a);
        c();
    }

    private final void v() {
        String str = this.A;
        vun g = this.k.g();
        if (g == null || !sry.y(g) || str == null) {
            return;
        }
        if (this.k.x() == 3) {
            this.g.p(dvnp.DIRECTIONS, str, this.k.s());
            return;
        }
        avtq avtqVar = this.m;
        if (avtqVar == null) {
            return;
        }
        this.g.u(avtqVar);
        this.m = null;
    }

    private final boolean w(boolean z) {
        return z || this.s.i();
    }

    @Override // defpackage.qbn
    public final synchronized qbm a() {
        return this.k;
    }

    @Override // defpackage.qbn
    public final synchronized void b(@dzsi dnqh dnqhVar) {
        if (this.k.f()) {
            return;
        }
        srx w = this.k.w();
        w.j(true);
        w.g(dnqhVar);
        sry a = w.a();
        this.k = a;
        if (!a.c()) {
            return;
        }
        v();
    }

    @Override // defpackage.qbn
    public final synchronized void c() {
        ckcq ckcqVar = this.z;
        if (ckcqVar != null) {
            ckcqVar.b();
            this.z = null;
        }
    }

    @Override // defpackage.qbn
    public final synchronized void d() {
        qie qieVar = this.l;
        if (qieVar != null) {
            qieVar.c();
        }
    }

    public final dwaw e(vun vunVar, @dzsi dwbm dwbmVar, List<dwac> list, @dzsi dnwb dnwbVar, boolean z) {
        return vnw.b(vunVar, dwbmVar, albv.a(), this.r.a(), null, dnwbVar, list, z);
    }

    public final vun f(vun vunVar, boolean z, boolean z2) {
        dbsk.l(this.k.x() == 1);
        bvmn bvmnVar = bvmo.a;
        boolean z3 = !sry.y(vunVar);
        this.l = new qie(this.b, z2, z3);
        this.z = ((ckcr) this.b.a(ckeq.k)).a();
        long b = this.c.b();
        int i = true != z2 ? 4 : 2;
        vum vumVar = new vum(vunVar);
        vumVar.q = Long.valueOf(b);
        vun a = vumVar.a();
        srx w = this.k.w();
        w.f(i);
        w.e(!z);
        w.j(z3);
        w.c(a);
        this.k = w.a();
        return a;
    }

    public final synchronized void g(vun vunVar, @dzsi dwbm dwbmVar, boolean z, boolean z2, @dzsi Long l, List<dwac> list, @dzsi dnwb dnwbVar) {
        bvmn bvmnVar = bvmo.a;
        dwaw e = e(vunVar, dwbmVar, list, dnwbVar, this.j.a().a());
        srx w = this.k.w();
        w.i(e);
        this.k = w.a();
        if (z2) {
            this.e.a(this.d.a(e, this.p));
        }
        if (!z) {
            dvzy dvzyVar = e.b;
            if (dvzyVar == null) {
                dvzyVar = dvzy.u;
            }
            dwao dwaoVar = dvzyVar.g;
            if (dwaoVar == null) {
                dwaoVar = dwao.R;
            }
            dphq dphqVar = dwaoVar.e;
            if (dphqVar == null) {
                dphqVar = dphq.m;
            }
            dqvj c = dqvj.c(dphqVar.b);
            if (c == null) {
                c = dqvj.MIXED;
            }
            if (c == dqvj.MIXED) {
                dsqp dsqpVar = (dsqp) e.cu(5);
                dsqpVar.bC(e);
                dwat dwatVar = (dwat) dsqpVar;
                dvzy dvzyVar2 = e.b;
                if (dvzyVar2 == null) {
                    dvzyVar2 = dvzy.u;
                }
                dsqp dsqpVar2 = (dsqp) dvzyVar2.cu(5);
                dsqpVar2.bC(dvzyVar2);
                dvzv dvzvVar = (dvzv) dsqpVar2;
                dvzy dvzyVar3 = e.b;
                if (dvzyVar3 == null) {
                    dvzyVar3 = dvzy.u;
                }
                dwao dwaoVar2 = dvzyVar3.g;
                if (dwaoVar2 == null) {
                    dwaoVar2 = dwao.R;
                }
                dsqp dsqpVar3 = (dsqp) dwaoVar2.cu(5);
                dsqpVar3.bC(dwaoVar2);
                dwal dwalVar = (dwal) dsqpVar3;
                dvzy dvzyVar4 = e.b;
                if (dvzyVar4 == null) {
                    dvzyVar4 = dvzy.u;
                }
                dwao dwaoVar3 = dvzyVar4.g;
                if (dwaoVar3 == null) {
                    dwaoVar3 = dwao.R;
                }
                dphq dphqVar2 = dwaoVar3.e;
                if (dphqVar2 == null) {
                    dphqVar2 = dphq.m;
                }
                dsqp dsqpVar4 = (dsqp) dphqVar2.cu(5);
                dsqpVar4.bC(dphqVar2);
                dphm dphmVar = (dphm) dsqpVar4;
                dqvj dqvjVar = dqvj.DRIVE;
                if (dphmVar.c) {
                    dphmVar.bF();
                    dphmVar.c = false;
                }
                dphq dphqVar3 = (dphq) dphmVar.b;
                dphqVar3.b = dqvjVar.k;
                dphqVar3.a |= 1;
                if (dwalVar.c) {
                    dwalVar.bF();
                    dwalVar.c = false;
                }
                dwao dwaoVar4 = (dwao) dwalVar.b;
                dphq bK = dphmVar.bK();
                bK.getClass();
                dwaoVar4.e = bK;
                dwaoVar4.a |= 1;
                if (dvzvVar.c) {
                    dvzvVar.bF();
                    dvzvVar.c = false;
                }
                dvzy dvzyVar5 = (dvzy) dvzvVar.b;
                dwao bK2 = dwalVar.bK();
                bK2.getClass();
                dvzyVar5.g = bK2;
                dvzyVar5.a |= 4;
                if (dwatVar.c) {
                    dwatVar.bF();
                    dwatVar.c = false;
                }
                dwaw dwawVar = (dwaw) dwatVar.b;
                dvzy dvzyVar6 = (dvzy) dvzvVar.bK();
                dvzyVar6.getClass();
                dwawVar.b = dvzyVar6;
                dwawVar.a |= 1;
                e = (dwaw) dwatVar.bK();
            }
            vmd a = this.d.a(e, this.B);
            this.u.e(a.a(), a.b(), a.f(), bvrj.BACKGROUND_THREADPOOL);
            if (l != null) {
                this.o = this.c.e() + l.longValue();
            }
        }
        this.x.b(new Runnable(this) { // from class: srr
            private final srv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a();
            }
        }, bvrj.UI_THREAD);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[Catch: all -> 0x014e, TryCatch #3 {, blocks: (B:2:0x0000, B:4:0x001d, B:6:0x0025, B:7:0x0027, B:11:0x0032, B:13:0x003a, B:15:0x0054, B:17:0x005a, B:28:0x008d, B:30:0x00ab, B:31:0x00b1, B:34:0x00bf, B:36:0x00c7, B:38:0x00cd, B:40:0x00db, B:41:0x00de, B:46:0x010e, B:42:0x0101, B:45:0x010b, B:50:0x0117, B:53:0x0121, B:55:0x012a, B:56:0x0130, B:19:0x0062, B:23:0x0071, B:25:0x0077), top: B:66:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf A[Catch: all -> 0x0115, TRY_ENTER, TryCatch #3 {, blocks: (B:2:0x0000, B:4:0x001d, B:6:0x0025, B:7:0x0027, B:11:0x0032, B:13:0x003a, B:15:0x0054, B:17:0x005a, B:28:0x008d, B:30:0x00ab, B:31:0x00b1, B:34:0x00bf, B:36:0x00c7, B:38:0x00cd, B:40:0x00db, B:41:0x00de, B:46:0x010e, B:42:0x0101, B:45:0x010b, B:50:0x0117, B:53:0x0121, B:55:0x012a, B:56:0x0130, B:19:0x0062, B:23:0x0071, B:25:0x0077), top: B:66:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117 A[Catch: all -> 0x014a, TRY_ENTER, TryCatch #3 {, blocks: (B:2:0x0000, B:4:0x001d, B:6:0x0025, B:7:0x0027, B:11:0x0032, B:13:0x003a, B:15:0x0054, B:17:0x005a, B:28:0x008d, B:30:0x00ab, B:31:0x00b1, B:34:0x00bf, B:36:0x00c7, B:38:0x00cd, B:40:0x00db, B:41:0x00de, B:46:0x010e, B:42:0x0101, B:45:0x010b, B:50:0x0117, B:53:0x0121, B:55:0x012a, B:56:0x0130, B:19:0x0062, B:23:0x0071, B:25:0x0077), top: B:66:0x0000 }] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.srf h(@defpackage.dzsi defpackage.dwaw r11, defpackage.amsy r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srv.h(dwaw, amsy, boolean):srf");
    }

    public final synchronized void i(vun vunVar, amte amteVar, boolean z, int i) {
        boolean z2 = true;
        if (this.k.x() != 1) {
            z2 = false;
        }
        dbsk.l(z2);
        List<amub> a = amteVar.a(this.q);
        if (i >= a.size()) {
            i = 0;
        }
        srx w = this.k.w();
        w.f(2);
        w.j(z);
        w.c(vunVar);
        w.b(i);
        w.k(amteVar);
        this.k = w.a();
        u(amteVar);
        s(amteVar, a);
    }

    public final void j(vun vunVar, @dzsi dwbm dwbmVar) {
        n(vunVar, false, dwbmVar);
    }

    public final void k(vun vunVar, boolean z) {
        n(vunVar, z, null);
    }

    public final synchronized vun l(vun vunVar, boolean z, @dzsi dwbm dwbmVar, List<dwac> list) {
        vun f;
        boolean w = w(z);
        f = f(vunVar, z, w);
        g(f, dwbmVar, z, w, null, list, null);
        return f;
    }

    public final synchronized void m(vun vunVar, boolean z, @dzsi Long l, List<dwac> list) {
        o(vunVar, z, l, list, null);
    }

    public final void n(vun vunVar, boolean z, @dzsi dwbm dwbmVar) {
        l(vunVar, z, dwbmVar, dcdc.e());
    }

    public final synchronized vun o(vun vunVar, final boolean z, @dzsi final Long l, final List<dwac> list, @dzsi final dnwb dnwbVar) {
        final vun f;
        final boolean w = w(z);
        f = f(vunVar, z, w);
        this.x.b(new Runnable(this, f, z, w, l, list, dnwbVar) { // from class: srp
            private final srv a;
            private final vun b;
            private final boolean c;
            private final boolean d;
            private final Long e;
            private final List f;
            private final dnwb g;

            {
                this.a = this;
                this.b = f;
                this.c = z;
                this.d = w;
                this.e = l;
                this.f = list;
                this.g = dnwbVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(this.b, null, this.c, this.d, this.e, this.f, this.g);
            }
        }, bvrj.NETWORK_THREADPOOL);
        return f;
    }

    public final synchronized void p(vun vunVar) {
        o(vunVar, true, null, dcdc.e(), null);
    }

    public final void q(boolean z) {
        srf srfVar;
        synchronized (this) {
            if (z) {
                dbsk.l(this.k.x() == 2);
                srx w = this.k.w();
                w.f(4);
                this.k = w.a();
            }
            srfVar = this.k.d() ? new srf(this, this.k) : null;
        }
        if (srfVar != null) {
            this.f.b(srfVar);
        }
    }
}
