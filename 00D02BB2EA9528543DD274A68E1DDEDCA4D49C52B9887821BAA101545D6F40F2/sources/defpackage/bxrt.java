package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bxrt  reason: default package */
/* loaded from: classes4.dex */
public final class bxrt implements bxtx {
    public final cqat a;
    public final bxrf b;

    public bxrt(cqat cqatVar, bxrf bxrfVar) {
        this.a = cqatVar;
        this.b = bxrfVar;
    }

    public static long e(cqat cqatVar) {
        return TimeUnit.MILLISECONDS.toMicros(cqatVar.b());
    }

    @Override // defpackage.bxtx
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.bxtx
    public final void b(dpte dpteVar) {
        bxrf bxrfVar = this.b;
        bvrj.UI_THREAD.c();
        bxrfVar.a.f(dpteVar);
    }

    @Override // defpackage.bxtx
    public final void c(String str, String str2) {
        if (str.isEmpty()) {
            return;
        }
        dptc bZ = dpte.g.bZ();
        dpth bZ2 = dpti.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpti dptiVar = (dpti) bZ2.b;
        str.getClass();
        int i = dptiVar.a | 1;
        dptiVar.a = i;
        dptiVar.b = str;
        str2.getClass();
        dptiVar.a = i | 2;
        dptiVar.c = str2;
        dpti bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpte dpteVar = (dpte) bZ.b;
        bK.getClass();
        dpteVar.c = bK;
        dpteVar.b = 5;
        long e = e(this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpte dpteVar2 = (dpte) bZ.b;
        dpteVar2.a |= 2;
        dpteVar2.e = e;
        this.b.f(bZ.bK(), 1);
    }

    @Override // defpackage.bxtx
    public final void d(String str) {
        c(str, str);
    }

    @Override // defpackage.bxtx
    public final void f(ilo iloVar, int i) {
        if (iloVar.n().isEmpty()) {
            return;
        }
        dptc bZ = dpte.g.bZ();
        dptf bZ2 = dptg.q.bZ();
        String y = iloVar.y();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar = (dptg) bZ2.b;
        y.getClass();
        dptgVar.a |= 1;
        dptgVar.b = y;
        String n = iloVar.n();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar2 = (dptg) bZ2.b;
        n.getClass();
        dptgVar2.a |= 2;
        dptgVar2.c = n;
        String B = iloVar.B();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar3 = (dptg) bZ2.b;
        B.getClass();
        dptgVar3.a |= 4;
        dptgVar3.d = B;
        boolean bN = iloVar.bN();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar4 = (dptg) bZ2.b;
        dptgVar4.a |= 128;
        dptgVar4.i = bN;
        String o = iloVar.ai().o();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar5 = (dptg) bZ2.b;
        o.getClass();
        dptgVar5.a |= 8;
        dptgVar5.e = o;
        boolean an = iloVar.an();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar6 = (dptg) bZ2.b;
        dptgVar6.a |= 2048;
        dptgVar6.l = an;
        boolean ba = iloVar.ba();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar7 = (dptg) bZ2.b;
        dptgVar7.a |= 8192;
        dptgVar7.n = ba;
        boolean bb = iloVar.bb();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar8 = (dptg) bZ2.b;
        int i2 = dptgVar8.a | 16384;
        dptgVar8.a = i2;
        dptgVar8.o = bb;
        boolean z = iloVar.o;
        dptgVar8.a = i2 | 32768;
        dptgVar8.p = z;
        String aT = iloVar.aT();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar9 = (dptg) bZ2.b;
        aT.getClass();
        dptgVar9.a |= 4096;
        dptgVar9.m = aT;
        dndr bj = iloVar.bj();
        if (bj != null) {
            int a = dplr.a(bj.h);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dptg dptgVar10 = (dptg) bZ2.b;
            int i3 = a - 2;
            if (a == 0) {
                throw null;
            }
            dptgVar10.h = i3;
            dptgVar10.a |= 64;
        }
        dhjx ak = iloVar.ak();
        if (ak != null) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dptg dptgVar11 = (dptg) bZ2.b;
            ak.getClass();
            dptgVar11.g = ak;
            dptgVar11.a |= 32;
        }
        if (iloVar.aj() != null) {
            dpum h = iloVar.aj().h();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dptg dptgVar12 = (dptg) bZ2.b;
            h.getClass();
            dptgVar12.f = h;
            dptgVar12.a |= 16;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpte dpteVar = (dpte) bZ.b;
        dptg bK = bZ2.bK();
        bK.getClass();
        dpteVar.c = bK;
        dpteVar.b = 4;
        long e = e(this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpte dpteVar2 = (dpte) bZ.b;
        dpteVar2.a |= 2;
        dpteVar2.e = e;
        this.b.f(bZ.bK(), i);
    }

    @Override // defpackage.bxtx
    public final void g(amvh amvhVar, int i, String str, String str2) {
        akqi akqiVar = amvhVar.d;
        if (akqiVar == null) {
            return;
        }
        dptc bZ = dpte.g.bZ();
        dptf bZ2 = dptg.q.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar = (dptg) bZ2.b;
        str.getClass();
        int i2 = dptgVar.a | 1;
        dptgVar.a = i2;
        dptgVar.b = str;
        str.getClass();
        int i3 = i2 | 2;
        dptgVar.a = i3;
        dptgVar.c = str;
        str2.getClass();
        int i4 = i3 | 4;
        dptgVar.a = i4;
        dptgVar.d = str2;
        boolean z = amvhVar.z;
        dptgVar.a = i4 | 8192;
        dptgVar.n = z;
        String o = akqiVar.o();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dptg dptgVar2 = (dptg) bZ2.b;
        o.getClass();
        dptgVar2.a |= 8;
        dptgVar2.e = o;
        akqq akqqVar = amvhVar.e;
        if (akqqVar != null) {
            dpum h = akqqVar.h();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dptg dptgVar3 = (dptg) bZ2.b;
            h.getClass();
            dptgVar3.f = h;
            dptgVar3.a |= 16;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpte dpteVar = (dpte) bZ.b;
        dptg bK = bZ2.bK();
        bK.getClass();
        dpteVar.c = bK;
        dpteVar.b = 4;
        long e = e(this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpte dpteVar2 = (dpte) bZ.b;
        dpteVar2.a |= 2;
        dpteVar2.e = e;
        this.b.f(bZ.bK(), i);
    }

    @Override // defpackage.bxtx
    public final void h(dpte dpteVar) {
        dptc ca = dpte.g.ca(dpteVar);
        long e = e(this.a);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dpte dpteVar2 = (dpte) ca.b;
        dpteVar2.a |= 2;
        dpteVar2.e = e;
        this.b.f(ca.bK(), 1);
    }

    @Override // defpackage.bxtx
    public final void i(amvh amvhVar) {
        dosw F = amvhVar.F();
        if (F == null) {
            return;
        }
        g(amvhVar, 3, F.c, F.d);
    }
}
