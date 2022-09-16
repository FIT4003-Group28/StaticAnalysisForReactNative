package defpackage;

import android.app.Application;
import android.app.Service;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jzi  reason: default package */
/* loaded from: classes.dex */
public final class jzi implements jyz {
    private volatile dzsj<vvb> A;
    private volatile dzsj<srv> B;
    private volatile dzsj<bvsf> C;
    private volatile dzsj<vva> D;
    private volatile dzsj<klz> E;
    private volatile dzsj<jzn> F;
    private volatile dzsj<kma> G;
    public final iqz a;
    public final kgh b;
    public volatile bvsl c;
    public volatile dzsj<cref> d;
    public volatile dzsj<crdz> e;
    private final Service f;
    private volatile dzsj<Application> g;
    private volatile dzsj<bvsl> h;
    private volatile dzsj<amfi> i;
    private volatile dzsj<cqat> j;
    private volatile dzsj<Executor> k;
    private volatile dzsj<ahjq> l;
    private volatile dzsj<btvo> m;
    private volatile dzsj<axwq> n;
    private volatile dzsj<ckoq> o;
    private volatile dzsj<bvrv> p;
    private volatile dzsj<jzv> q;
    private volatile dzsj<cjqy> r;
    private volatile dzsj<cjqq> s;
    private volatile dzsj<asio> t;
    private volatile dzsj<arpm> u;
    private volatile dzsj<aukk> v;
    private volatile dzsj<ksw> w;
    private volatile dzsj<btrm> x;
    private volatile dzsj<bvjj> y;
    private volatile dzsj<bvrb> z;

    public jzi(kgh kghVar, iqz iqzVar, Service service) {
        this.a = iqzVar;
        this.b = kghVar;
        this.f = service;
    }

    private final dzsj<Application> e() {
        dzsj<Application> dzsjVar = this.g;
        if (dzsjVar == null) {
            jzh jzhVar = new jzh(this, 0);
            this.g = jzhVar;
            return jzhVar;
        }
        return dzsjVar;
    }

    private final dzsj<cqat> f() {
        dzsj<cqat> dzsjVar = this.j;
        if (dzsjVar == null) {
            jzh jzhVar = new jzh(this, 3);
            this.j = jzhVar;
            return jzhVar;
        }
        return dzsjVar;
    }

    private final dzsj<btvo> g() {
        dzsj<btvo> dzsjVar = this.m;
        if (dzsjVar == null) {
            jzh jzhVar = new jzh(this, 6);
            this.m = jzhVar;
            return jzhVar;
        }
        return dzsjVar;
    }

    private final dzsj<bvrv> h() {
        dzsj<bvrv> dzsjVar = this.p;
        if (dzsjVar == null) {
            jzh jzhVar = new jzh(this, 9);
            this.p = jzhVar;
            return jzhVar;
        }
        return dzsjVar;
    }

    private final dzsj<vvb> i() {
        dzsj<vvb> dzsjVar = this.A;
        if (dzsjVar == null) {
            jzh jzhVar = new jzh(this, 22);
            this.A = jzhVar;
            return jzhVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.jyz
    public final jze a() {
        Application a = this.a.a();
        dxjg.e(a);
        cqat rR = this.a.rR();
        dxjg.e(rR);
        kes vq = this.b.vq();
        dxjg.e(vq);
        dzsj<Application> e = e();
        dzsj dzsjVar = this.h;
        if (dzsjVar == null) {
            dzsjVar = new jzh(this, 1);
            this.h = dzsjVar;
        }
        dzsj c = dxjh.c(dzsjVar);
        dzsj dzsjVar2 = this.i;
        if (dzsjVar2 == null) {
            dzsjVar2 = new jzh(this, 2);
            this.i = dzsjVar2;
        }
        dzsj c2 = dxjh.c(dzsjVar2);
        dzsj<cqat> f = f();
        dzsj dzsjVar3 = this.k;
        if (dzsjVar3 == null) {
            dzsjVar3 = new jzh(this, 4);
            this.k = dzsjVar3;
        }
        lxb lxbVar = new lxb(e, c, c2, f, dzsjVar3);
        btrm rz = this.a.rz();
        dxjg.e(rz);
        lww lwwVar = new lww(lxbVar, rz);
        btrm rz2 = this.a.rz();
        dxjg.e(rz2);
        bvrb tn = this.a.tn();
        dxjg.e(tn);
        Executor sU = this.a.sU();
        dxjg.e(sU);
        Executor sV = this.a.sV();
        dxjg.e(sV);
        bvjj rB = this.a.rB();
        dxjg.e(rB);
        ckcw rU = this.a.rU();
        dxjg.e(rU);
        dzsj dzsjVar4 = this.l;
        if (dzsjVar4 == null) {
            dzsjVar4 = new jzh(this, 5);
            this.l = dzsjVar4;
        }
        dxio c3 = dxjc.c(dzsjVar4);
        dxio c4 = dxjc.c(g());
        akfa rK = this.a.rK();
        dxjg.e(rK);
        mgl qt = this.b.qt();
        dxjg.e(qt);
        dzsj dzsjVar5 = this.n;
        if (dzsjVar5 == null) {
            dzsjVar5 = new jzh(this, 7);
            this.n = dzsjVar5;
        }
        dxio c5 = dxjc.c(dzsjVar5);
        dzsj dzsjVar6 = this.o;
        if (dzsjVar6 == null) {
            dzsjVar6 = new jzh(this, 8);
            this.o = dzsjVar6;
        }
        dxio c6 = dxjc.c(dzsjVar6);
        dxio c7 = dxjc.c(h());
        dzsj dzsjVar7 = this.q;
        if (dzsjVar7 == null) {
            dzsjVar7 = new jzh(this, 10);
            this.q = dzsjVar7;
        }
        dxio c8 = dxjc.c(dzsjVar7);
        dzsj dzsjVar8 = this.r;
        if (dzsjVar8 == null) {
            dzsjVar8 = new jzh(this, 11);
            this.r = dzsjVar8;
        }
        dxio c9 = dxjc.c(dzsjVar8);
        dzsj dzsjVar9 = this.s;
        if (dzsjVar9 == null) {
            dzsjVar9 = new jzh(this, 12);
            this.s = dzsjVar9;
        }
        dxio c10 = dxjc.c(dzsjVar9);
        dzsj dzsjVar10 = this.t;
        if (dzsjVar10 == null) {
            dzsjVar10 = new jzh(this, 13);
            this.t = dzsjVar10;
        }
        dxio c11 = dxjc.c(dzsjVar10);
        dzsj dzsjVar11 = this.u;
        if (dzsjVar11 == null) {
            dzsjVar11 = new jzh(this, 14);
            this.u = dzsjVar11;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj dzsjVar13 = this.v;
        if (dzsjVar13 == null) {
            dzsjVar13 = new jzh(this, 15);
            this.v = dzsjVar13;
        }
        dxio c12 = dxjc.c(dzsjVar13);
        ktu qi = this.b.qi();
        dxjg.e(qi);
        ktw p = this.a.p();
        dxjg.e(p);
        ktx q = this.a.q();
        dxjg.e(q);
        arpo vo = this.b.vo();
        dxjg.e(vo);
        Service service = this.f;
        lye rm = this.b.rm();
        dxjg.e(rm);
        btrm rz3 = this.a.rz();
        dxjg.e(rz3);
        axru qR = this.b.qR();
        dxjg.e(qR);
        ckcw rU2 = this.a.rU();
        dxjg.e(rU2);
        kly aY = this.a.aY();
        dxjg.e(aY);
        kfl kflVar = new kfl(rz3, qR, rU2, aY);
        dzsj dzsjVar14 = this.w;
        if (dzsjVar14 == null) {
            dzsjVar14 = new jzh(this, 16);
            this.w = dzsjVar14;
        }
        dxio c13 = dxjc.c(dzsjVar14);
        dzsj<Application> e2 = e();
        dzsj dzsjVar15 = this.x;
        if (dzsjVar15 == null) {
            dzsjVar15 = new jzh(this, 17);
            this.x = dzsjVar15;
        }
        dzsj dzsjVar16 = dzsjVar15;
        dzsj<cqat> f2 = f();
        dzsj<bvjj> c14 = c();
        dzsj dzsjVar17 = this.z;
        if (dzsjVar17 == null) {
            dzsjVar17 = new jzh(this, 19);
            this.z = dzsjVar17;
        }
        dzsj dzsjVar18 = dzsjVar17;
        dzsj dzsjVar19 = this.B;
        if (dzsjVar19 == null) {
            dzsjVar19 = new jzh(this, 20);
            this.B = dzsjVar19;
        }
        dzsj dzsjVar20 = dzsjVar19;
        dzsj<btvo> g = g();
        dzsj dzsjVar21 = this.C;
        if (dzsjVar21 == null) {
            dzsjVar21 = new jzh(this, 24);
            this.C = dzsjVar21;
        }
        dzsj c15 = dxjh.c(dzsjVar21);
        dzsj<vvb> i = i();
        dzsj dzsjVar22 = this.D;
        if (dzsjVar22 == null) {
            dzsjVar22 = new jzh(this, 25);
            this.D = dzsjVar22;
        }
        dzsj dzsjVar23 = dzsjVar22;
        dzsj dzsjVar24 = this.E;
        if (dzsjVar24 == null) {
            dzsjVar24 = new jzh(this, 26);
            this.E = dzsjVar24;
        }
        dzsj dzsjVar25 = dzsjVar24;
        dzsj dzsjVar26 = this.F;
        if (dzsjVar26 == null) {
            dzsjVar26 = new jzh(this, 27);
            this.F = dzsjVar26;
        }
        dzsj dzsjVar27 = dzsjVar26;
        dzsj dzsjVar28 = this.G;
        if (dzsjVar28 == null) {
            dzsjVar28 = new jzh(this, 28);
            this.G = dzsjVar28;
        }
        kss kssVar = new kss(e2, dzsjVar16, f2, c14, dzsjVar18, dzsjVar20, g, c15, i, dzsjVar23, dzsjVar25, dzsjVar27, dzsjVar28);
        ktf ro = this.b.ro();
        dxjg.e(ro);
        kaj pY = this.b.pY();
        dxjg.e(pY);
        dbsg<vxn> rd = this.b.rd();
        dxjg.e(rd);
        return new jze(a, rR, vq, lwwVar, rz2, tn, sU, sV, rB, rU, c3, c4, rK, qt, c5, c6, c7, c8, c9, c10, c11, dzsjVar12, c12, qi, p, q, vo, service, rm, kflVar, c13, kssVar, ro, pY, rd);
    }

    @Override // defpackage.jyz
    public final dxio<bvrv> b() {
        return dxjc.c(h());
    }

    public final dzsj<bvjj> c() {
        dzsj<bvjj> dzsjVar = this.y;
        if (dzsjVar == null) {
            jzh jzhVar = new jzh(this, 18);
            this.y = jzhVar;
            return jzhVar;
        }
        return dzsjVar;
    }

    public final vva d() {
        return new vva(i());
    }
}
