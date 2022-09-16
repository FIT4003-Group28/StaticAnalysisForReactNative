package defpackage;

import android.app.Application;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bdvy  reason: default package */
/* loaded from: classes3.dex */
public final class bdvy implements befw {
    public final dbsg<ff> a;
    public final bvrb b;
    public final axwq c;
    public final axxb d;
    public final dbsg<ckmp> e;
    public boolean f;
    public final Map<bwrs<ilo>, bgef> g = new HashMap();
    private final dbsg<akox> h;
    private final btvo i;
    private final ckcw j;
    private final aehr k;
    private final aeht l;
    private final anhk m;
    private final Application n;
    private final bgeg o;
    private final dbsg<dxio<apni>> p;
    private final dbsg<dxio<aese>> q;
    private final dbsg<dxio<ania>> r;
    private final dbsg<bkgy> s;
    private final dbsg<bkgz> t;
    private final dbsg<abfa> u;
    private final dbsg<bhhf> v;
    private final dbsg<bhat> w;

    public bdvy(Application application, dbsg<ff> dbsgVar, dbsg<akox> dbsgVar2, btvo btvoVar, ckcw ckcwVar, aehr aehrVar, aeht aehtVar, anhk anhkVar, bvrb bvrbVar, axwq axwqVar, axxb axxbVar, bgeg bgegVar, dbsg<dxio<apni>> dbsgVar3, dbsg<dxio<aese>> dbsgVar4, dbsg<dxio<ania>> dbsgVar5, dbsg<bkgy> dbsgVar6, dbsg<bkgz> dbsgVar7, dbsg<abfa> dbsgVar8, dbsg<bhhf> dbsgVar9, dbsg<ckmp> dbsgVar10, dbsg<bhat> dbsgVar11) {
        this.a = dbsgVar;
        this.h = dbsgVar2;
        this.i = btvoVar;
        this.j = ckcwVar;
        this.k = aehrVar;
        this.l = aehtVar;
        this.m = anhkVar;
        this.b = bvrbVar;
        this.n = application;
        this.c = axwqVar;
        this.d = axxbVar;
        this.o = bgegVar;
        this.p = dbsgVar3;
        this.q = dbsgVar4;
        this.r = dbsgVar5;
        this.s = dbsgVar6;
        this.t = dbsgVar7;
        this.u = dbsgVar8;
        this.v = dbsgVar9;
        this.e = dbsgVar10;
        this.w = dbsgVar11;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.bgej g(defpackage.ilo r39, defpackage.bgei r40, defpackage.begr r41, defpackage.befv r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdvy.g(ilo, bgei, begr, befv, boolean, boolean):bgej");
    }

    private final bgef h(ilo iloVar, bvrj bvrjVar, begr begrVar, bgej bgejVar, befv befvVar) {
        bdvu bdvuVar = new bdvu(bgejVar, begrVar, iloVar);
        dksh offlineMapsParameters = this.i.getOfflineMapsParameters();
        long j = befvVar.e() ? offlineMapsParameters.g : offlineMapsParameters.f;
        btxz btxzVar = new btxz(this.j, dunt.TACTILE_PLACE_DETAILS_REQUEST);
        bgeg bgegVar = this.o;
        dvzj dvzjVar = bgejVar.a;
        btpc a = bgegVar.a.a();
        bgeg.a(a, 1);
        dzsj<buqn> dzsjVar = bgegVar.b;
        avnt a2 = bgegVar.c.a();
        bgeg.a(a2, 3);
        cqat a3 = bgegVar.d.a();
        bgeg.a(a3, 4);
        bvrb a4 = bgegVar.e.a();
        bgeg.a(a4, 5);
        ckmp a5 = bgegVar.f.a();
        bgeg.a(a5, 6);
        btvo a6 = bgegVar.g.a();
        bgeg.a(a6, 7);
        bgeg.a(btxzVar, 8);
        bgeg.a(dvzjVar, 9);
        bgeg.a(bdvuVar, 10);
        bgeg.a(bvrjVar, 11);
        bgef bgefVar = new bgef(a, dzsjVar, a2, a3, a4, a5, a6, btxzVar, dvzjVar, bdvuVar, bvrjVar, j);
        bgefVar.c(befvVar.c() || befvVar.d());
        return bgefVar;
    }

    private final bgei i() {
        dbsk.a(this.h.a());
        dhjx Z = this.h.b().Z();
        dbsk.s(Z);
        return bgei.a(this.h.b(), Z);
    }

    @Override // defpackage.befw
    public final void a() {
        this.f = true;
    }

    @Override // defpackage.befw
    public final void b() {
        this.f = false;
        c();
    }

    @Override // defpackage.befw
    public final synchronized void c() {
        for (bgef bgefVar : this.g.values()) {
            bgefVar.b();
        }
        this.g.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r9.g.containsKey(r10.a()) != false) goto L8;
     */
    @Override // defpackage.befw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean d(defpackage.befv r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            bvrj r0 = defpackage.bvrj.UI_THREAD     // Catch: java.lang.Throwable -> L67
            r0.c()     // Catch: java.lang.Throwable -> L67
            bwrs r0 = r10.a()     // Catch: java.lang.Throwable -> L67
            java.io.Serializable r0 = r0.c()     // Catch: java.lang.Throwable -> L67
            ilo r0 = (defpackage.ilo) r0     // Catch: java.lang.Throwable -> L67
            defpackage.dbsk.s(r0)     // Catch: java.lang.Throwable -> L67
            boolean r1 = r0.f     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L1e
            boolean r1 = r0.j()     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L1e
            goto L2a
        L1e:
            java.util.Map<bwrs<ilo>, bgef> r1 = r9.g     // Catch: java.lang.Throwable -> L67
            bwrs r2 = r10.a()     // Catch: java.lang.Throwable -> L67
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L34
        L2a:
            boolean r1 = r10.c()     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L31
            goto L34
        L31:
            r10 = 0
        L32:
            monitor-exit(r9)
            return r10
        L34:
            bdvx r8 = new bdvx     // Catch: java.lang.Throwable -> L67
            bwrs r1 = r10.a()     // Catch: java.lang.Throwable -> L67
            boolean r2 = r10.g()     // Catch: java.lang.Throwable -> L67
            r8.<init>(r9, r1, r2)     // Catch: java.lang.Throwable -> L67
            bgei r3 = r9.i()     // Catch: java.lang.Throwable -> L67
            r6 = 1
            r7 = 0
            r1 = r9
            r2 = r0
            r4 = r8
            r5 = r10
            bgej r5 = r1.g(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L67
            bvrj r3 = defpackage.bvrj.UI_THREAD     // Catch: java.lang.Throwable -> L67
            r1 = r9
            r2 = r0
            r4 = r8
            r6 = r10
            bgef r1 = r1.h(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L67
            r0.y()     // Catch: java.lang.Throwable -> L67
            java.util.Map<bwrs<ilo>, bgef> r0 = r9.g     // Catch: java.lang.Throwable -> L67
            bwrs r10 = r10.a()     // Catch: java.lang.Throwable -> L67
            r0.put(r10, r1)     // Catch: java.lang.Throwable -> L67
            r10 = 1
            goto L32
        L67:
            r10 = move-exception
            monitor-exit(r9)
            goto L6b
        L6a:
            throw r10
        L6b:
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdvy.d(befv):boolean");
    }

    @Override // defpackage.befw
    @dzsi
    /* renamed from: e */
    public final synchronized bgej f(begr begrVar, befv befvVar) {
        bgej g;
        bvrj.UI_THREAD.c();
        ilo c = befvVar.a().c();
        dbsk.s(c);
        g = g(c, i(), begrVar, befvVar, befvVar.i(), befvVar.j());
        h(c, bvrj.UI_THREAD, begrVar, g, befvVar);
        return g;
    }
}
