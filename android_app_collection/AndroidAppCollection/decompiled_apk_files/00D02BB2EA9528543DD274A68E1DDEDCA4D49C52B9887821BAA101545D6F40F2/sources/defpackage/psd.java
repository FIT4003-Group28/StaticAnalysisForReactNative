package defpackage;

import android.content.Intent;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: psd  reason: default package */
/* loaded from: classes7.dex */
final class psd implements vmv {
    private final ptc a;
    private final vwv b;
    private final vwo c;
    private final gek d;
    private final puy e;
    private final vnk f;
    private final jkf g;
    private final vox h;
    private final pyq i;
    private final bzcm j;

    public psd(ptc ptcVar, vwv vwvVar, vwo vwoVar, gek gekVar, puy puyVar, vnk vnkVar, jkf jkfVar, vox voxVar, pyq pyqVar, bzcm bzcmVar) {
        this.a = ptcVar;
        this.b = vwvVar;
        this.c = vwoVar;
        this.d = gekVar;
        this.e = puyVar;
        this.f = vnkVar;
        this.g = jkfVar;
        this.h = voxVar;
        this.i = pyqVar;
        this.j = bzcmVar;
    }

    @Override // defpackage.vmx
    public final void a(@dzsi dnqh dnqhVar) {
        puy puyVar = this.e;
        if (!puyVar.aD) {
            return;
        }
        puyVar.bO(9, dnqhVar);
    }

    @Override // defpackage.vou
    public final void b(@dzsi dnqh dnqhVar) {
        puy puyVar = this.e;
        if (!puyVar.aD) {
            return;
        }
        puyVar.bO(9, dnqhVar);
    }

    @Override // defpackage.vou
    public final void c(int i, boolean z) {
        qbr qbrVar;
        if (!this.e.bg()) {
            return;
        }
        this.e.bV().a();
        if (z) {
            this.i.a(i);
            return;
        }
        pyq pyqVar = this.i;
        amve f = pyqVar.d(i).f();
        if (f == null) {
            return;
        }
        wuv a = pyqVar.b.a(f, i);
        Intent c = a == null ? null : a.c();
        if (c != null) {
            pyqVar.c(i);
            pyqVar.d.a().f(pyqVar.a, c, 4);
            return;
        }
        dqvj c2 = dqvj.c(f.b().b);
        if (c2 == null) {
            c2 = dqvj.DRIVE;
        }
        if (c2 != dqvj.TAXI || pyqVar.e.l().a() == dqvj.TAXI || (qbrVar = pyqVar.f) == null) {
            dqvj c3 = dqvj.c(f.b().b);
            if (c3 == null) {
                c3 = dqvj.DRIVE;
            }
            if (c3 != dqvj.BIKESHARING || pyqVar.e.l().a() == dqvj.BICYCLE || pyqVar.f == null) {
                pyqVar.b(i);
                return;
            }
            pyqVar.c(i);
            amuk c4 = qho.c(f);
            if (c4 != null) {
                pyqVar.c.ac(bvjk.bO, c4.c());
            }
            qbr qbrVar2 = pyqVar.f;
            dbsk.s(qbrVar2);
            qbrVar2.g(dqvj.BICYCLE, null);
            return;
        }
        qbrVar.g(dqvj.TAXI, null);
        pyqVar.c(i);
    }

    @Override // defpackage.vmv
    public final void d(vnu vnuVar, boolean z) {
        if (!this.e.aD || !z) {
            return;
        }
        this.h.e();
    }

    @Override // defpackage.vmv
    public final void e(int i, dnqh dnqhVar) {
        puy puyVar = this.e;
        if (!puyVar.aD) {
            return;
        }
        qbr qbrVar = puyVar.by;
        dbsk.s(qbrVar);
        qbrVar.b(i, dnqhVar);
    }

    @Override // defpackage.vmx
    public final void f(@dzsi dnqh dnqhVar) {
        if (!this.e.aD) {
            return;
        }
        dwao h = this.f.h();
        if ((h.a & 1073741824) == 0) {
            return;
        }
        dwao h2 = this.f.h();
        dsqp dsqpVar = (dsqp) h2.cu(5);
        dsqpVar.bC(h2);
        dwal dwalVar = (dwal) dsqpVar;
        dosz doszVar = h.B;
        if (doszVar == null) {
            doszVar = dosz.e;
        }
        dsqp dsqpVar2 = (dsqp) doszVar.cu(5);
        dsqpVar2.bC(doszVar);
        dosy dosyVar = (dosy) dsqpVar2;
        if (dosyVar.c) {
            dosyVar.bF();
            dosyVar.c = false;
        }
        dosz doszVar2 = (dosz) dosyVar.b;
        doszVar2.a &= -5;
        doszVar2.d = 0L;
        dosz bK = dosyVar.bK();
        if (dwalVar.c) {
            dwalVar.bF();
            dwalVar.c = false;
        }
        dwao dwaoVar = (dwao) dwalVar.b;
        bK.getClass();
        dwaoVar.B = bK;
        dwaoVar.a |= 1073741824;
        qbr qbrVar = this.e.by;
        dbsk.s(qbrVar);
        qbrVar.h(dwalVar.bK(), dnqhVar);
    }

    @Override // defpackage.vmv
    public final void g(vnu vnuVar, vnu vnuVar2, boolean z) {
        if (!this.e.aD || !z) {
            return;
        }
        if (vnuVar2.d().t()) {
            this.e.bH(false, vnuVar2, this.d.c);
        } else {
            this.h.e();
        }
    }

    @Override // defpackage.vmv
    public final void h(dqvj dqvjVar, @dzsi dnqh dnqhVar) {
        qbr qbrVar = this.e.by;
        dbsk.s(qbrVar);
        qbrVar.g(dqvjVar, dnqhVar);
    }

    @Override // defpackage.vmv
    public final void i() {
        pvk pvkVar = this.e.bh;
        if (pvkVar != null) {
            pvkVar.u();
        }
    }

    @Override // defpackage.vmv
    public final boolean j() {
        return this.g.l().L().b();
    }

    @Override // defpackage.vmx
    public final dbsg<dosz> k() {
        if (!this.f.bn()) {
            return dbpy.a;
        }
        dosz doszVar = this.f.h().B;
        if (doszVar == null) {
            doszVar = dosz.e;
        }
        return dbsg.i(doszVar);
    }

    @Override // defpackage.vmv
    public final void l() {
        if (!this.e.bg()) {
            return;
        }
        this.j.a(this.e.H(), this.e.aT);
    }

    @Override // defpackage.xzm
    public final void m(boolean z, int i) {
        vnu l = this.f.l();
        vwi s = l.d().s();
        vwh b = zay.b(s, l.d().e());
        HashSet hashSet = new HashSet(b.i);
        if (z) {
            hashSet.add(Integer.valueOf(i));
        } else {
            hashSet.remove(Integer.valueOf(i));
        }
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        vwa vwaVar = (vwa) dsqpVar;
        if (vwaVar.c) {
            vwaVar.bF();
            vwaVar.c = false;
        }
        ((vwh) vwaVar.b).i = vwh.cf();
        if (vwaVar.c) {
            vwaVar.bF();
            vwaVar.c = false;
        }
        vwh vwhVar = (vwh) vwaVar.b;
        dsrf dsrfVar = vwhVar.i;
        if (!dsrfVar.a()) {
            vwhVar.i = dsqw.cg(dsrfVar);
        }
        dsod.bv(hashSet, vwhVar.i);
        final vwi a = zay.a(s, vwaVar.bK());
        this.f.m(l.j(this.e.H(), this.c.a(l.d(), new mw(a) { // from class: psc
            private final vwi a;

            {
                this.a = a;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                ((vwl) obj).o(this.a);
            }
        })));
    }

    @Override // defpackage.vmv
    public final void n(dwao dwaoVar, @dzsi dnqh dnqhVar) {
        int f;
        synchronized (this.f) {
            f = vxi.f(this.f.h(), dwaoVar);
            this.f.R(dwaoVar);
        }
        this.e.bO(f, dnqhVar);
    }

    @Override // defpackage.xze
    public final void o(boolean z, boolean z2) {
        ptc ptcVar = this.a;
        vnk vnkVar = this.f;
        vnu l = vnkVar.l();
        vwi s = l.d().s();
        vwh b = zay.b(s, l.d().e());
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        vwa vwaVar = (vwa) dsqpVar;
        if (z2) {
            if (vwaVar.c) {
                vwaVar.bF();
                vwaVar.c = false;
            }
            vwh vwhVar = (vwh) vwaVar.b;
            vwh vwhVar2 = vwh.n;
            vwhVar.a |= 2;
            vwhVar.c = z;
        } else {
            if (vwaVar.c) {
                vwaVar.bF();
                vwaVar.c = false;
            }
            vwh vwhVar3 = (vwh) vwaVar.b;
            vwh vwhVar4 = vwh.n;
            vwhVar3.a |= 4;
            vwhVar3.d = z;
        }
        final vwi a = zay.a(s, vwaVar.bK());
        vnkVar.m(l.j(ptcVar.b, ptcVar.c.a(l.d(), new mw(a) { // from class: psx
            private final vwi a;

            {
                this.a = a;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                ((vwl) obj).o(this.a);
            }
        })));
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0251  */
    @Override // defpackage.xze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.wuo r21) {
        /*
            Method dump skipped, instructions count: 1643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psd.p(wuo):void");
    }

    @Override // defpackage.xze
    public final void q(boolean z, boolean z2) {
        ptc ptcVar = this.a;
        vnk vnkVar = this.f;
        vnu l = vnkVar.l();
        vwi s = l.d().s();
        vwh b = zay.b(s, l.d().e());
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        vwa vwaVar = (vwa) dsqpVar;
        if (z2) {
            if (vwaVar.c) {
                vwaVar.bF();
                vwaVar.c = false;
            }
            vwh vwhVar = (vwh) vwaVar.b;
            vwh vwhVar2 = vwh.n;
            vwhVar.a |= 8;
            vwhVar.e = z;
        } else {
            if (vwaVar.c) {
                vwaVar.bF();
                vwaVar.c = false;
            }
            vwh vwhVar3 = (vwh) vwaVar.b;
            vwh vwhVar4 = vwh.n;
            vwhVar3.a |= 16;
            vwhVar3.f = z;
        }
        final vwi a = zay.a(s, vwaVar.bK());
        vnkVar.m(l.j(ptcVar.b, ptcVar.c.a(l.d(), new mw(a) { // from class: psy
            private final vwi a;

            {
                this.a = a;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                ((vwl) obj).o(this.a);
            }
        })));
    }

    @Override // defpackage.xze
    public final void r(int i, boolean z) {
        ptc ptcVar = this.a;
        vnk vnkVar = this.f;
        vnu l = vnkVar.l();
        vwi s = l.d().s();
        vwh b = zay.b(s, l.d().e());
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        vwa vwaVar = (vwa) dsqpVar;
        if (z) {
            if (vwaVar.c) {
                vwaVar.bF();
                vwaVar.c = false;
            }
            vwh vwhVar = (vwh) vwaVar.b;
            vwh vwhVar2 = vwh.n;
            vwhVar.a |= 32;
            vwhVar.g = i;
        } else {
            if (vwaVar.c) {
                vwaVar.bF();
                vwaVar.c = false;
            }
            vwh vwhVar3 = (vwh) vwaVar.b;
            vwh vwhVar4 = vwh.n;
            vwhVar3.a |= 64;
            vwhVar3.h = i;
        }
        final vwi a = zay.a(s, vwaVar.bK());
        vnkVar.m(l.j(ptcVar.b, ptcVar.c.a(l.d(), new mw(a) { // from class: psz
            private final vwi a;

            {
                this.a = a;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                ((vwl) obj).o(this.a);
            }
        })));
    }

    @Override // defpackage.vmv
    public final void s() {
        puy puyVar = this.e;
        puyVar.aT.U(qbs.DEFAULT);
        puyVar.bU(12, null, false, true, false);
    }

    @Override // defpackage.vmv
    public final void t() {
        ptc ptcVar = this.a;
        vnk vnkVar = this.f;
        vnu l = vnkVar.l();
        vwi s = l.d().s();
        vwh b = zay.b(s, l.d().e());
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        vwa vwaVar = (vwa) dsqpVar;
        if (vwaVar.c) {
            vwaVar.bF();
            vwaVar.c = false;
        }
        vwh vwhVar = (vwh) vwaVar.b;
        vwh vwhVar2 = vwh.n;
        vwhVar.m = null;
        vwhVar.a &= -1025;
        final vwi a = zay.a(s, vwaVar.bK());
        vnkVar.m(l.j(ptcVar.b, ptcVar.c.a(l.d(), new mw(a) { // from class: ptb
            private final vwi a;

            {
                this.a = a;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                ((vwl) obj).o(this.a);
            }
        })));
    }

    @Override // defpackage.xyw
    public final void u(int i, boolean z, dspd dspdVar) {
        amve m;
        amsy aS = this.f.aS();
        if (aS == null || (m = aS.m(i)) == null) {
            return;
        }
        vxg vxgVar = new vxg(m);
        dspd dspdVar2 = null;
        if (z) {
            dpic f = vxgVar.f().f();
            puy puyVar = this.e;
            if (f != null) {
                dspdVar2 = f.e;
            }
            puyVar.bF(dspdVar, dspdVar2, true);
            return;
        }
        dpic f2 = vxgVar.e().f();
        puy puyVar2 = this.e;
        if (f2 != null) {
            dspdVar2 = f2.e;
        }
        puyVar2.bF(dspdVar2, dspdVar, false);
    }

    @Override // defpackage.vmv
    public final void v(int i) {
        this.e.bY(i, false, true);
    }
}
