package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: psf  reason: default package */
/* loaded from: classes7.dex */
public final class psf implements qbr {
    public final gga a;
    public final qbq b;
    public final cklq c;
    public final vnk d;
    private final dzsj<qbt> e;
    private final dzsj<bwjz> f;
    private final bwnj g;
    private final vxa h;
    private final tnv i;
    private final pux j;

    public psf(gga ggaVar, dzsj dzsjVar, dzsj dzsjVar2, vxa vxaVar, cklq cklqVar, tnv tnvVar, vnk vnkVar, bwnj bwnjVar, qbq qbqVar, pux puxVar) {
        this.a = ggaVar;
        this.e = dzsjVar;
        this.f = dzsjVar2;
        this.h = vxaVar;
        this.c = cklqVar;
        this.d = vnkVar;
        this.b = qbqVar;
        this.j = puxVar;
        this.g = bwnjVar;
        this.i = tnvVar;
    }

    private final qbj l() {
        qbj e = this.e.a().e();
        dbsk.s(e);
        return e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: all -> 0x01a9, TryCatch #1 {, blocks: (B:4:0x002d, B:13:0x0083, B:15:0x0099, B:16:0x009d, B:17:0x00b7, B:20:0x00bf, B:22:0x00c8, B:21:0x00c2, B:23:0x00d2, B:25:0x00d6, B:26:0x00db, B:28:0x00ee, B:29:0x00f3, B:33:0x0129, B:34:0x015b, B:9:0x004c, B:10:0x005a, B:11:0x0075), top: B:59:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: all -> 0x01a9, TryCatch #1 {, blocks: (B:4:0x002d, B:13:0x0083, B:15:0x0099, B:16:0x009d, B:17:0x00b7, B:20:0x00bf, B:22:0x00c8, B:21:0x00c2, B:23:0x00d2, B:25:0x00d6, B:26:0x00db, B:28:0x00ee, B:29:0x00f3, B:33:0x0129, B:34:0x015b, B:9:0x004c, B:10:0x005a, B:11:0x0075), top: B:59:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee A[Catch: all -> 0x01a9, TryCatch #1 {, blocks: (B:4:0x002d, B:13:0x0083, B:15:0x0099, B:16:0x009d, B:17:0x00b7, B:20:0x00bf, B:22:0x00c8, B:21:0x00c2, B:23:0x00d2, B:25:0x00d6, B:26:0x00db, B:28:0x00ee, B:29:0x00f3, B:33:0x0129, B:34:0x015b, B:9:0x004c, B:10:0x005a, B:11:0x0075), top: B:59:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r18) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psf.a(int):void");
    }

    @Override // defpackage.qbr
    public final void b(int i, dnqh dnqhVar) {
        boolean z;
        bvrj.UI_THREAD.c();
        j();
        synchronized (this.d) {
            z = true;
            dbsk.b(this.d.aw().size() > 2, "Shouldn't be able to remove second waypoint");
            ArrayList arrayList = new ArrayList(this.d.aw());
            arrayList.remove(i);
            this.d.J(arrayList);
            if (!this.d.aY() || arrayList.size() != 2) {
                z = false;
            }
        }
        i();
        if (z) {
            d();
            this.b.bO(14, dnqhVar);
            return;
        }
        this.b.bO(7, dnqhVar);
    }

    @Override // defpackage.qbr
    public final void c() {
        dbsg<Integer> aD = this.d.aD();
        if (aD.a()) {
            a(aD.b().intValue());
        }
    }

    @Override // defpackage.qbr
    public final void d() {
        synchronized (this.d) {
            this.d.aK(false);
            this.d.bt(1);
        }
    }

    @Override // defpackage.qbr
    public final void e() {
        synchronized (this.d) {
            this.d.bt(2);
            this.d.aC();
        }
        this.b.bO(14, null);
    }

    @Override // defpackage.qbr
    public final void f() {
        this.b.bO(15, null);
    }

    @Override // defpackage.qbr
    public final void g(dqvj dqvjVar, @dzsi dnqh dnqhVar) {
        k(dqvjVar, dnqhVar, 1);
    }

    @Override // defpackage.qbp
    public final void h(dwao dwaoVar, @dzsi dnqh dnqhVar) {
        int f;
        j();
        synchronized (this.d) {
            f = vxi.f(this.d.h(), dwaoVar);
            this.d.R(dwaoVar);
        }
        this.b.bO(f, dnqhVar);
    }

    public final void i() {
        synchronized (this.d) {
            if (this.d.t() == qbs.NAVIGATION) {
                this.d.U(qbs.DEFAULT);
            }
        }
    }

    public final void j() {
        synchronized (this.d) {
            dcpe<amvh> listIterator = this.d.aw().listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().a()) {
                    return;
                }
            }
            l().k().b();
        }
    }

    public final void k(dqvj dqvjVar, @dzsi dnqh dnqhVar, int i) {
        dqvj g;
        boolean aX;
        bvrj.UI_THREAD.c();
        j();
        i();
        synchronized (this.d) {
            g = this.d.g();
            aX = this.d.aX(dqvjVar);
            if (aX) {
                dwao h = this.d.h();
                dphq dphqVar = h.e;
                if (dphqVar == null) {
                    dphqVar = dphq.m;
                }
                int a = dpho.a(dphqVar.c);
                if (a != 0 && a == 3) {
                    this.d.R(this.h.d(h, dqvjVar, 3, vul.DIRECTIONS_UI));
                    this.d.L(this.a);
                }
                dsqp dsqpVar = (dsqp) h.cu(5);
                dsqpVar.bC(h);
                dwal dwalVar = (dwal) dsqpVar;
                dphm bZ = dphq.m.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dphq dphqVar2 = (dphq) bZ.b;
                dphqVar2.c = 3;
                dphqVar2.a |= 2;
                if (dwalVar.c) {
                    dwalVar.bF();
                    dwalVar.c = false;
                }
                dwao dwaoVar = (dwao) dwalVar.b;
                dphq bK = bZ.bK();
                bK.getClass();
                dwaoVar.e = bK;
                dwaoVar.a |= 1;
                h = dwalVar.bK();
                this.d.R(this.h.d(h, dqvjVar, 3, vul.DIRECTIONS_UI));
                this.d.L(this.a);
            }
        }
        if (!aX) {
            l().k().a();
            return;
        }
        l().b(dqvjVar);
        int i2 = 4;
        if (i == 1 && g.equals(dqvjVar)) {
            i2 = 9;
        }
        this.b.bO(i2, dnqhVar);
        this.i.b(dqvjVar);
    }
}
