package defpackage;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: amdh  reason: default package */
/* loaded from: classes.dex */
public final class amdh implements amci {
    private static final dcqe a = dcqe.c("amdh");
    private final akry b;
    private final akrw c;
    private final alyl d;
    private final amda e;
    private final amcj f;
    private final akrz g;
    private final cqat h;
    private final ckcw i;
    private final aluh j;

    public amdh(akrz akrzVar, amda amdaVar, akrw akrwVar, alyl alylVar, amcj amcjVar, aluh aluhVar, cqat cqatVar, ckcw ckcwVar) {
        this.g = akrzVar;
        this.e = amdaVar;
        this.b = akrwVar.b;
        this.c = akrwVar;
        this.d = alylVar;
        this.f = amcjVar;
        this.j = aluhVar;
        this.h = cqatVar;
        this.i = ckcwVar;
    }

    static amze s(amze amzeVar, cqat cqatVar) {
        amze u = u(amzeVar);
        dsqp dsqpVar = (dsqp) u.cu(5);
        dsqpVar.bC(u);
        amzd amzdVar = (amzd) dsqpVar;
        if ((u.a & 32) != 0) {
            long v = v(cqatVar, u.g);
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar2 = (amze) amzdVar.b;
            amzeVar2.a |= 32;
            amzeVar2.g = v;
        }
        if ((u.a & 64) != 0) {
            long v2 = v(cqatVar, u.h);
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar3 = (amze) amzdVar.b;
            amzeVar3.a |= 64;
            amzeVar3.h = v2;
        }
        return amzdVar.bK();
    }

    static amze t(amze amzeVar, cqat cqatVar) {
        amze u = u(amzeVar);
        dsqp dsqpVar = (dsqp) u.cu(5);
        dsqpVar.bC(u);
        amzd amzdVar = (amzd) dsqpVar;
        if ((u.a & 32) != 0) {
            long a2 = cqav.a(cqatVar, u.g);
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar2 = (amze) amzdVar.b;
            amzeVar2.a |= 32;
            amzeVar2.g = a2;
        }
        if ((u.a & 64) != 0) {
            long a3 = cqav.a(cqatVar, u.h);
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar3 = (amze) amzdVar.b;
            amzeVar3.a |= 64;
            amzeVar3.h = a3;
        }
        return amzdVar.bK();
    }

    private static amze u(amze amzeVar) {
        if ((amzeVar.a & 4) != 0 && amzeVar.d == 0) {
            dsqp dsqpVar = (dsqp) amzeVar.cu(5);
            dsqpVar.bC(amzeVar);
            amzd amzdVar = (amzd) dsqpVar;
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar2 = (amze) amzdVar.b;
            amzeVar2.a &= -5;
            amzeVar2.d = 0;
            amzeVar = amzdVar.bK();
        }
        if ((amzeVar.a & 32) != 0 && amzeVar.g == -1) {
            dsqp dsqpVar2 = (dsqp) amzeVar.cu(5);
            dsqpVar2.bC(amzeVar);
            amzd amzdVar2 = (amzd) dsqpVar2;
            if (amzdVar2.c) {
                amzdVar2.bF();
                amzdVar2.c = false;
            }
            amze amzeVar3 = (amze) amzdVar2.b;
            amzeVar3.a &= -33;
            amzeVar3.g = 0L;
            amzeVar = amzdVar2.bK();
        }
        if ((amzeVar.a & 64) != 0 && amzeVar.h == -1) {
            dsqp dsqpVar3 = (dsqp) amzeVar.cu(5);
            dsqpVar3.bC(amzeVar);
            amzd amzdVar3 = (amzd) dsqpVar3;
            if (amzdVar3.c) {
                amzdVar3.bF();
                amzdVar3.c = false;
            }
            amze amzeVar4 = (amze) amzdVar3.b;
            amzeVar4.a &= -65;
            amzeVar4.h = 0L;
            amzeVar = amzdVar3.bK();
        }
        if ((amzeVar.a & 8) != 0 && amzeVar.e == -1) {
            dsqp dsqpVar4 = (dsqp) amzeVar.cu(5);
            dsqpVar4.bC(amzeVar);
            amzd amzdVar4 = (amzd) dsqpVar4;
            if (amzdVar4.c) {
                amzdVar4.bF();
                amzdVar4.c = false;
            }
            amze amzeVar5 = (amze) amzdVar4.b;
            amzeVar5.a &= -9;
            amzeVar5.e = 0;
            amzeVar = amzdVar4.bK();
        }
        if ((amzeVar.a & 16) != 0 && amzeVar.f == -1) {
            dsqp dsqpVar5 = (dsqp) amzeVar.cu(5);
            dsqpVar5.bC(amzeVar);
            amzd amzdVar5 = (amzd) dsqpVar5;
            if (amzdVar5.c) {
                amzdVar5.bF();
                amzdVar5.c = false;
            }
            amze amzeVar6 = (amze) amzdVar5.b;
            amzeVar6.a &= -17;
            amzeVar6.f = 0;
            amzeVar = amzdVar5.bK();
        }
        if ((amzeVar.a & 256) != 0 && amzeVar.j == 0) {
            dsqp dsqpVar6 = (dsqp) amzeVar.cu(5);
            dsqpVar6.bC(amzeVar);
            amzd amzdVar6 = (amzd) dsqpVar6;
            if (amzdVar6.c) {
                amzdVar6.bF();
                amzdVar6.c = false;
            }
            amze amzeVar7 = (amze) amzdVar6.b;
            amzeVar7.a &= -257;
            amzeVar7.j = 0;
            amzeVar = amzdVar6.bK();
        }
        if ((amzeVar.a & 512) != 0 && amzeVar.k.equals("")) {
            dsqp dsqpVar7 = (dsqp) amzeVar.cu(5);
            dsqpVar7.bC(amzeVar);
            amzd amzdVar7 = (amzd) dsqpVar7;
            if (amzdVar7.c) {
                amzdVar7.bF();
                amzdVar7.c = false;
            }
            amze amzeVar8 = (amze) amzdVar7.b;
            amzeVar8.a &= -513;
            amzeVar8.k = amze.o.k;
            amzeVar = amzdVar7.bK();
        }
        if ((amzeVar.a & 2) == 0 || amzeVar.c != -1) {
            return amzeVar;
        }
        dsqp dsqpVar8 = (dsqp) amzeVar.cu(5);
        dsqpVar8.bC(amzeVar);
        amzd amzdVar8 = (amzd) dsqpVar8;
        if (amzdVar8.c) {
            amzdVar8.bF();
            amzdVar8.c = false;
        }
        amze amzeVar9 = (amze) amzdVar8.b;
        amzeVar9.a &= -3;
        amzeVar9.c = 0;
        return amzdVar8.bK();
    }

    private static long v(cqat cqatVar, long j) {
        if (j >= 0) {
            return Math.max(0L, (j + cqatVar.e()) - cqatVar.b());
        }
        return -1L;
    }

    private final amzd w(alyh alyhVar, int i, String str, String str2, int i2) {
        amzd bZ = amze.o.bZ();
        amza a2 = alym.a(this.c, this.d, this.b.J, alyhVar, str, str2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amze amzeVar = (amze) bZ.b;
        a2.getClass();
        amzeVar.b = a2;
        int i3 = amzeVar.a | 1;
        amzeVar.a = i3;
        if (i != 0) {
            i3 |= 256;
            amzeVar.a = i3;
            amzeVar.j = i;
        }
        if (i2 != 0) {
            amzeVar.a = i3 | 4;
            amzeVar.d = i2;
        }
        long g = this.g.g(this.b, this.h);
        if (g != -1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amze amzeVar2 = (amze) bZ.b;
            amzeVar2.a |= 32;
            amzeVar2.g = g;
        }
        long c = this.g.c(this.b, this.h);
        if (c != -1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amze amzeVar3 = (amze) bZ.b;
            amzeVar3.a |= 64;
            amzeVar3.h = c;
        }
        return bZ;
    }

    private final boolean x(alyh alyhVar, amze amzeVar) {
        long b = this.h.b();
        long j = amzeVar.l;
        if (j < b || (amzeVar.a & 32) == 0 || j - b <= amzeVar.g - j) {
            return false;
        }
        try {
            this.e.k(alym.a(this.c, this.d, this.b.J, alyhVar, this.j.a(), bvom.a(Locale.getDefault())));
            ((ckco) this.i.a(ckev.b)).a(this.b.I.Z);
            return true;
        } catch (IOException unused) {
            return true;
        }
    }

    @Override // defpackage.amci
    public final void a() {
        amda amdaVar = this.e;
        synchronized (amdaVar) {
            if (amdaVar.f) {
                return;
            }
            ckcq a2 = ((ckcr) amdaVar.e.a(ckev.f)).a();
            try {
                amdaVar.d.p();
            } catch (amcx e) {
                amdaVar.o(e);
            } finally {
                a2.b();
            }
        }
    }

    @Override // defpackage.amci
    public final void b(amze amzeVar, byte[] bArr, cqat cqatVar) {
        if (!amzeVar.n) {
            dsqp dsqpVar = (dsqp) amzeVar.cu(5);
            dsqpVar.bC(amzeVar);
            amzd amzdVar = (amzd) dsqpVar;
            long j = ((bvnv) cqatVar).a;
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar2 = (amze) amzdVar.b;
            amzeVar2.a |= 1024;
            amzeVar2.l = j;
            amze bK = amzdVar.bK();
            try {
                bK = t(bK, cqatVar);
                amda amdaVar = this.e;
                ckcq a2 = ((ckcr) amdaVar.e.a(ckev.v)).a();
                try {
                    amdaVar.d.j(bK, bArr);
                    amdaVar.n();
                    a2.b();
                    return;
                } catch (amcx e) {
                    amdaVar.o(e);
                    throw e;
                }
            } catch (IOException unused) {
                amza amzaVar = bK.b;
                if (amzaVar == null) {
                    amzaVar = amza.k;
                }
                if (amzaVar.e != null) {
                    return;
                }
                drsu drsuVar = drsu.e;
                return;
            }
        }
        bvoo.h("Attempting to insert an offroad tile into the SqliteDiskTileCache should not happen.", new Object[0]);
    }

    @Override // defpackage.amci
    public final void c(alyh alyhVar, String str, String str2, int i, int i2) {
        try {
            amze h = this.e.h(alym.a(this.c, this.d, this.b.J, alyhVar, str, str2));
            if (h != null) {
                dsqp dsqpVar = (dsqp) h.cu(5);
                dsqpVar.bC(h);
                amzd amzdVar = (amzd) dsqpVar;
                if (amzdVar.c) {
                    amzdVar.bF();
                    amzdVar.c = false;
                }
                amze amzeVar = (amze) amzdVar.b;
                amzeVar.a |= 16;
                amzeVar.f = i2;
                this.e.j(amzdVar.bK());
                return;
            }
            amzd w = w(alyhVar, i, str, str2, 0);
            if (w.c) {
                w.bF();
                w.c = false;
            }
            amze amzeVar2 = (amze) w.b;
            amze amzeVar3 = amze.o;
            amzeVar2.a |= 16;
            amzeVar2.f = i2;
            this.e.i(w.bK());
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.amci
    public final void d(amze amzeVar) {
        try {
            amda amdaVar = this.e;
            amza amzaVar = amzeVar.b;
            if (amzaVar == null) {
                amzaVar = amza.k;
            }
            if (amdaVar.h(amzaVar) == null) {
                return;
            }
            amzeVar = t(amzeVar, this.h);
            dsqp dsqpVar = (dsqp) amzeVar.cu(5);
            dsqpVar.bC(amzeVar);
            amzd amzdVar = (amzd) dsqpVar;
            long b = this.h.b();
            if (amzdVar.c) {
                amzdVar.bF();
                amzdVar.c = false;
            }
            amze amzeVar2 = (amze) amzdVar.b;
            amzeVar2.a |= 1024;
            amzeVar2.l = b;
            amze bK = amzdVar.bK();
            try {
                this.e.j(bK);
            } catch (IOException unused) {
                amzeVar = bK;
                amza amzaVar2 = amzeVar.b;
                if (amzaVar2 == null) {
                    amzaVar2 = amza.k;
                }
                drsu drsuVar = amzaVar2.e;
                if (drsuVar == null) {
                    drsuVar = drsu.e;
                }
                int i = drsuVar.b;
                int i2 = drsuVar.c;
                int i3 = drsuVar.d;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // defpackage.amci
    public final void e(alyh alyhVar, String str, String str2, int i, int i2, int i3) {
        try {
            amda amdaVar = this.e;
            amzd w = w(alyhVar, i, str, str2, i3);
            if (w.c) {
                w.bF();
                w.c = false;
            }
            amze amzeVar = (amze) w.b;
            amze amzeVar2 = amze.o;
            int i4 = amzeVar.a | 16;
            amzeVar.a = i4;
            amzeVar.f = i2;
            amzeVar.a = i4 | 8;
            amzeVar.e = i2;
            amdaVar.i(w.bK());
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.amci
    public final void f(int[] iArr) {
        try {
            amza a2 = alym.a(this.c, this.d, this.b.J, new alyh(0, 0, 0), this.j.a(), bvom.a(Locale.getDefault()));
            amda amdaVar = this.e;
            ckcq a3 = ((ckcr) amdaVar.e.a(ckev.w)).a();
            try {
                if (iArr.length % 3 != 0) {
                    bvoo.h("zoomXYs array length is not a multiple of 3", new Object[0]);
                    return;
                }
                amdaVar.d.k(a2, iArr);
                amdaVar.n();
                a3.b();
            } catch (amcx e) {
                amdaVar.o(e);
                throw e;
            }
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.amci
    @dzsi
    public final amze g(alyh alyhVar) {
        try {
            amze h = this.e.h(alym.a(this.c, this.d, this.b.J, alyhVar, this.j.a(), bvom.a(Locale.getDefault())));
            if (h != null) {
                if (!x(alyhVar, h)) {
                    return s(h, this.h);
                }
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // defpackage.amci
    public final byte[] h(alyh alyhVar) {
        amzc amzcVar;
        try {
            amzcVar = this.e.g(alym.a(this.c, this.d, this.b.J, alyhVar, this.j.a(), bvom.a(Locale.getDefault())));
        } catch (IOException unused) {
            amzcVar = null;
        }
        if (amzcVar != null) {
            amze amzeVar = amzcVar.a;
            if (amzeVar == null) {
                amzeVar = amze.o;
            }
            if (!x(alyhVar, amzeVar)) {
                return amzcVar.b.G();
            }
        }
        return null;
    }

    @Override // defpackage.amci
    public final boolean i() {
        return true;
    }

    @Override // defpackage.amci
    public final boolean j() {
        return true;
    }

    @Override // defpackage.amci
    public final void k(alyh alyhVar) {
        amza a2 = alym.a(this.c, this.d, this.b.J, alyhVar, this.j.a(), bvom.a(Locale.getDefault()));
        amda amdaVar = this.e;
        try {
            amdaVar.d.v(a2, "str".getBytes());
        } catch (amcx e) {
            amdaVar.o(e);
            throw e;
        }
    }

    @Override // defpackage.amcl
    public final boolean m(alyh alyhVar) {
        try {
            amda amdaVar = this.e;
            try {
                return amdaVar.d.g(alym.a(this.c, this.d, this.b.J, alyhVar, this.j.a(), bvom.a(Locale.getDefault())));
            } catch (amcx e) {
                amdaVar.o(e);
                throw e;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.amcl
    @dzsi
    public final alyg n(alyh alyhVar) {
        amzc amzcVar;
        amza a2 = alym.a(this.c, this.d, this.b.J, alyhVar, this.j.a(), bvom.a(Locale.getDefault()));
        try {
            amzcVar = this.e.g(a2);
        } catch (IOException unused) {
            amzcVar = null;
        }
        if (amzcVar != null) {
            amze amzeVar = amzcVar.a;
            if (amzeVar == null) {
                amzeVar = amze.o;
            }
            if (x(alyhVar, amzeVar)) {
                amzcVar = null;
            }
        }
        if (amzcVar == null) {
            return null;
        }
        amze amzeVar2 = amzcVar.a;
        if (amzeVar2 == null) {
            amzeVar2 = amze.o;
        }
        if (amzcVar.b.c() != 0) {
            alyo a3 = this.f.a(s(amzeVar2, this.h), this.b, alyhVar, amzcVar.b.G(), true, akrx.DISK_CACHE);
            if (a3.a() == alyn.IO_ERROR || a3.a() == alyn.PARSE_ERROR) {
                a3.a();
                try {
                    this.e.k(a2);
                } catch (IOException unused2) {
                }
            }
            alus.a(this.i, this.b.I.Z, a3);
            a.d(a3.a() == alyn.SUCCESS ? Level.FINE : Level.WARNING).t(2850).r("Sqlite disk unpack result for tile type %s and coords %s - %s", this.b, alyhVar, a3.a());
            return a3.b().f();
        }
        return new alvx(s(amzeVar2, this.h), this.b, alyhVar, akrx.DISK_CACHE);
    }

    @Override // defpackage.amcl
    public final void o(alyh alyhVar, alyg alygVar) {
        throw new IllegalStateException("Don't store unencrypted tiles into tile cache.");
    }

    @Override // defpackage.amcl
    public final void p(alyh alyhVar) {
        try {
            this.e.i(w(alyhVar, 0, this.j.a(), bvom.a(Locale.getDefault()), 0).bK());
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.amcl
    public final boolean q(alyg alygVar) {
        return alygVar instanceof alvx;
    }

    @Override // defpackage.amcl
    public final void r() {
    }

    @Override // defpackage.amci
    public final void l() {
        amda amdaVar = this.e;
        try {
            amdaVar.d.w("str".getBytes());
        } catch (amcx e) {
            amdaVar.o(e);
            throw e;
        }
    }
}
