package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: amcv  reason: default package */
/* loaded from: classes.dex */
public final class amcv implements amci {
    private static final dcqe a = dcqe.c("amcv");
    @dzsi
    private final akpg b;
    private final akry c;
    private final amcj d;
    private final akrz e;
    private final ckcw f;
    private final cqat g;
    private final alyl h = alyl.o;

    public amcv(amcj amcjVar, akry akryVar, akrz akrzVar, ckcw ckcwVar, cqat cqatVar, @dzsi akpg akpgVar) {
        this.c = akryVar;
        this.d = amcjVar;
        this.e = akrzVar;
        this.f = ckcwVar;
        this.g = cqatVar;
        this.b = akpgVar;
    }

    private final synchronized byte[] s(alyh alyhVar) {
        akpg akpgVar = this.b;
        if (akpgVar != null) {
            try {
                return akpgVar.c(alyhVar.b, alyhVar.c, alyhVar.a);
            } catch (anam e) {
                e.getMessage();
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean t() {
        akpg akpgVar = this.b;
        if (akpgVar == null) {
            return false;
        }
        return akpgVar.d();
    }

    private final synchronized boolean u() {
        akpg akpgVar = this.b;
        if (akpgVar == null) {
            return true;
        }
        return akpgVar.e();
    }

    private final amze v(alyh alyhVar, akpu akpuVar) {
        long b = this.e.b(akpuVar.b, this.g);
        long f = this.e.f(this.c, akpuVar.b, this.g);
        String str = akpuVar.d;
        String str2 = akpuVar.c;
        boolean u = u();
        amzd bZ = amze.o.bZ();
        amza a2 = alym.a(akrw.a(this.c), this.h, this.c.J, alyhVar, str, str2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amze amzeVar = (amze) bZ.b;
        a2.getClass();
        amzeVar.b = a2;
        int i = amzeVar.a | 1;
        amzeVar.a = i;
        long j = akpuVar.b;
        int i2 = i | 1024;
        amzeVar.a = i2;
        amzeVar.l = j;
        int i3 = i2 | 32;
        amzeVar.a = i3;
        amzeVar.g = f;
        int i4 = i3 | 64;
        amzeVar.a = i4;
        amzeVar.h = b;
        amzeVar.a = i4 | 4096;
        amzeVar.n = u;
        return bZ.bK();
    }

    @Override // defpackage.amci
    public final void a() {
    }

    @Override // defpackage.amci
    public final void b(amze amzeVar, byte[] bArr, cqat cqatVar) {
    }

    @Override // defpackage.amci
    public final void c(alyh alyhVar, String str, String str2, int i, int i2) {
    }

    @Override // defpackage.amci
    public final void d(amze amzeVar) {
    }

    @Override // defpackage.amci
    public final void e(alyh alyhVar, String str, String str2, int i, int i2, int i3) {
    }

    @Override // defpackage.amci
    public final void f(int[] iArr) {
    }

    @Override // defpackage.amci
    @dzsi
    public final amze g(alyh alyhVar) {
        byte[] s = s(alyhVar);
        if (s != null) {
            try {
                akpu akpuVar = (akpu) dsqw.cq(akpu.e, s);
                if (akpuVar.a.c() != 0) {
                    return v(alyhVar, akpuVar);
                }
                return null;
            } catch (dsrm e) {
                e.getMessage();
            }
        }
        return null;
    }

    @Override // defpackage.amci
    public final byte[] h(alyh alyhVar) {
        return null;
    }

    @Override // defpackage.amci
    public final boolean i() {
        return false;
    }

    @Override // defpackage.amci
    public final boolean j() {
        return false;
    }

    @Override // defpackage.amci
    public final void k(alyh alyhVar) {
        throw new UnsupportedOperationException("Cannot pin tiles in read only cache");
    }

    @Override // defpackage.amci
    public final void l() {
        throw new UnsupportedOperationException("Cannot unpin tiles in read only cache");
    }

    @Override // defpackage.amcl
    public final boolean m(alyh alyhVar) {
        byte[] s = s(alyhVar);
        if (s != null) {
            try {
                return ((akpu) dsqw.cq(akpu.e, s)).a.c() != 0;
            } catch (dsrm e) {
                e.getMessage();
            }
        }
        return false;
    }

    @Override // defpackage.amcl
    @dzsi
    public final alyg n(alyh alyhVar) {
        byte[] s = s(alyhVar);
        if (s != null) {
            try {
                akpu akpuVar = (akpu) dsqw.cq(akpu.e, s);
                byte[] G = akpuVar.a.G();
                if (G.length == 0) {
                    amzd bZ = amze.o.bZ();
                    amza a2 = alym.a(akrw.a(this.c), this.h, this.c.J, alyhVar, "", "");
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    amze amzeVar = (amze) bZ.b;
                    a2.getClass();
                    amzeVar.b = a2;
                    amzeVar.a |= 1;
                    return new alvx(bZ.bK(), this.c, alyhVar, akrx.OFFLINE);
                }
                alyo a3 = this.d.a(v(alyhVar, akpuVar), this.c, alyhVar, G, t(), akrx.OFFLINE);
                alus.a(this.f, this.c.I.Z, a3);
                a.d(a3.a() == alyn.SUCCESS ? Level.FINE : Level.WARNING).t(2792).r("External read-only tile unpack result result for tile type %s and coords %s: %s", this.c, alyhVar, a3.a());
                return a3.b().f();
            } catch (dsrm e) {
                e.getMessage();
                return null;
            }
        }
        if (this.c.equals(akry.BASE)) {
            ((ckco) this.f.a(ckgh.bv)).a(this.c.I.Z);
        }
        return null;
    }

    @Override // defpackage.amcl
    public final void o(alyh alyhVar, alyg alygVar) {
    }

    @Override // defpackage.amcl
    public final void p(alyh alyhVar) {
    }

    @Override // defpackage.amcl
    public final boolean q(alyg alygVar) {
        return alygVar instanceof alvx;
    }

    @Override // defpackage.amcl
    public final void r() {
    }
}
