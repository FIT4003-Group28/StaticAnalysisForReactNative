package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: nvj  reason: default package */
/* loaded from: classes7.dex */
public final class nvj implements nxb {
    private static final dcqe a = dcqe.c("nvj");
    private final nwc A;
    private final nvz B;
    private final nwx C;
    private final nvr D;
    private final nwu E;
    private final nvy F;
    private final nvw G;
    private final nwf H;
    private final nvx I;
    private final nwp J;
    private final Application K;
    private volatile boolean L;
    private final Object b = new Object();
    private final dxio<nvk> c;
    private final eeu d;
    private final nwn e;
    private final nwr f;
    private final nwz g;
    private final nwj h;
    private final nvo i;
    private final nvu j;
    private final nwe k;
    private final nvq l;
    private final nvm m;
    private final nwd n;
    private final nvn o;
    private final nwo p;
    private final nwq q;
    private final nwa r;
    private final nww s;
    private final nws t;
    private final nvs u;
    private final nwm v;
    private final nvp w;
    private final nvt x;
    private final nwb y;
    private final nwk z;

    public nvj(Application application, eeu eeuVar, nwr nwrVar, nwz nwzVar, nwn nwnVar, nwj nwjVar, nvo nvoVar, nvu nvuVar, nwe nweVar, nvq nvqVar, nvm nvmVar, nwd nwdVar, nvn nvnVar, nwo nwoVar, nwq nwqVar, nwa nwaVar, nww nwwVar, nws nwsVar, nvs nvsVar, nwm nwmVar, nvp nvpVar, nvt nvtVar, nwb nwbVar, nwk nwkVar, nwc nwcVar, nvz nvzVar, nwx nwxVar, nvr nvrVar, nwu nwuVar, nvy nvyVar, nvw nvwVar, nwf nwfVar, nvx nvxVar, nwp nwpVar, dxio<nvk> dxioVar) {
        this.d = eeuVar;
        this.f = nwrVar;
        this.g = nwzVar;
        this.h = nwjVar;
        this.i = nvoVar;
        this.j = nvuVar;
        this.k = nweVar;
        this.e = nwnVar;
        this.l = nvqVar;
        this.m = nvmVar;
        this.n = nwdVar;
        this.o = nvnVar;
        this.p = nwoVar;
        this.q = nwqVar;
        this.r = nwaVar;
        this.s = nwwVar;
        this.t = nwsVar;
        this.u = nvsVar;
        this.v = nwmVar;
        this.w = nvpVar;
        this.x = nvtVar;
        this.y = nwbVar;
        this.z = nwkVar;
        this.A = nwcVar;
        this.B = nvzVar;
        this.C = nwxVar;
        this.D = nvrVar;
        this.E = nwuVar;
        this.F = nvyVar;
        this.G = nvwVar;
        this.H = nwfVar;
        this.c = dxioVar;
        this.K = application;
        this.I = nvxVar;
        this.J = nwpVar;
    }

    @Override // defpackage.nxb
    public final void a() {
        synchronized (this.b) {
            this.L = true;
            nxe[] nxeVarArr = {this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.f, this.e, this.r, this.g, this.s, this.t, this.D, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.I, this.B, this.C, this.E, this.F, this.H, this.G, this.J};
            this.c.a().d();
            for (int i = 0; i < 32; i++) {
                this.c.a().e(nxeVarArr[i]);
            }
            this.c.a().a(dthd.UPDATE_DIRECTIONS_STATE);
        }
    }

    @Override // defpackage.nxb
    public final void b() {
        synchronized (this.b) {
            this.L = false;
            this.c.a().d();
        }
    }

    @Override // defpackage.nxb
    public final dulh c() {
        dthf b;
        try {
            if (!this.L) {
                bvoo.h("ActionFactoryImpl not initialized.", new Object[0]);
            }
            dulg bZ = dulh.b.bZ();
            synchronized (this.b) {
                b = this.c.a().b();
            }
            return ((dulg) bZ.by(b.bS())).bK();
        } catch (dsrm unused) {
            return dulh.b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030 A[Catch: all -> 0x0025, DONT_GENERATE, TryCatch #0 {all -> 0x0025, blocks: (B:12:0x0020, B:18:0x0028, B:20:0x0030, B:23:0x0034, B:25:0x003a, B:27:0x003d, B:28:0x004d, B:30:0x0053, B:32:0x005f, B:34:0x0062), top: B:42:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    @Override // defpackage.nxb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@defpackage.dzsi defpackage.nxd r9, defpackage.dthb r10, defpackage.nxc r11, @defpackage.dzsi defpackage.nxi r12, @defpackage.dzsi defpackage.nxa r13) {
        /*
            r8 = this;
            bvrj r0 = defpackage.bvrj.UI_THREAD
            r0.c()
            eeu r0 = r8.d
            boolean r0 = r0.b()
            if (r0 != 0) goto Le
            return
        Le:
            boolean r0 = r8.L
            r1 = 0
            if (r0 != 0) goto L1a
            java.lang.String r0 = "ActionFactoryImpl not initialized."
            java.lang.Object[] r2 = new java.lang.Object[r1]
            defpackage.bvoo.h(r0, r2)
        L1a:
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
            r2 = 1
            if (r9 == 0) goto L27
            boolean r3 = r9 instanceof defpackage.fd     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L28
            goto L27
        L25:
            r9 = move-exception
            goto L74
        L27:
            r1 = 1
        L28:
            java.lang.String r2 = "delegate must be null or an instance of Fragment, but delegate=%s"
            defpackage.dbsk.g(r1, r2, r9)     // Catch: java.lang.Throwable -> L25
            r1 = 0
            if (r10 != 0) goto L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            goto L63
        L32:
            if (r9 == 0) goto L3d
            nxe r2 = r9.d(r10)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L3d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            r1 = r2
            goto L63
        L3d:
            dxio<nvk> r2 = r8.c     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L25
            nvk r2 = (defpackage.nvk) r2     // Catch: java.lang.Throwable -> L25
            java.util.List r2 = r2.c()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L25
        L4d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L62
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L25
            nxe r3 = (defpackage.nxe) r3     // Catch: java.lang.Throwable -> L25
            boolean r4 = r3.a(r10)     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            r1 = r3
            goto L63
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
        L63:
            if (r1 == 0) goto L73
            nvi r0 = new nvi
            r2 = r0
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r1.b(r0)
        L73:
            return
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            goto L77
        L76:
            throw r9
        L77:
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvj.d(nxd, dthb, nxc, nxi, nxa):void");
    }

    @Override // defpackage.nxb
    public final void e(String str, String str2, dnqh dnqhVar) {
        f(str, null, str2, 0, dnqhVar, false, false, false, false, null);
    }

    @Override // defpackage.nxb
    public final void f(String str, @dzsi akqi akqiVar, String str2, @dzsi int i, dnqh dnqhVar, boolean z, boolean z2, boolean z3, boolean z4, @dzsi akqq akqqVar) {
        if (!this.d.b()) {
            return;
        }
        if (!this.L) {
            bvoo.h("ActionFactoryImpl not initialized.", new Object[0]);
        }
        nwj nwjVar = this.h;
        dbsk.s(nwjVar);
        nwjVar.d(str, akqiVar, dspd.b, str2, i, dnqhVar, z, z2, z3, z4, akqqVar, true);
    }
}
