package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dhou  reason: default package */
/* loaded from: classes.dex */
public final class dhou extends dsqw<dhou, dhnw> implements dhov {
    public static final dhou I;
    private static volatile dssr<dhou> M;
    public boolean A;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    private int J;
    private int K;
    private int L;
    public int a;
    public boolean c;
    public boolean d;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public dhon m;
    public boolean n;
    public dhol o;
    public boolean p;
    public dhoh q;
    public dhoe r;
    public dhob s;
    public dhot t;
    public dhoq u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int b = 1;
    public dsrf e = dsqz.b;
    public dsrf f = dsqz.b;
    public int l = -1;
    public int B = 1;
    public int C = 1;

    static {
        dhou dhouVar = new dhou();
        I = dhouVar;
        dsqw.cc(dhou.class, dhouVar);
    }

    private dhou() {
    }

    @Override // defpackage.dhov
    public final boolean A() {
        return this.E;
    }

    @Override // defpackage.dhov
    public final boolean B() {
        return this.F;
    }

    @Override // defpackage.dhov
    public final boolean C() {
        return this.G;
    }

    @Override // defpackage.dhov
    public final boolean D() {
        return this.H;
    }

    @Override // defpackage.dhov
    public final void E() {
    }

    @Override // defpackage.dhov
    public final int F() {
        int a = dhny.a(this.b);
        if (a == 0) {
            return 2;
        }
        return a;
    }

    @Override // defpackage.dhov
    public final int G() {
        int a = dhny.a(this.v);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(I, "\u0001!\u0000\u0004\u0004\u0085!\u0000\u0002\u0000\u0004ဌ\u0004\u000bဇ\u000e\u001f\u0016 \u0016%ဇ\u001d?ဇ1@ဇ\fDဇ5Gဇ9Hဉ<Jဇ8Sဇ>TဉCZဇG\\ဉIbဌRcဇTdဉJgဇSkဇ\\mဇ]nဇ^pဉNtငbuငcxင;yဇe|ဉK~ဇh\u0080ဇj\u0081ဇl\u0082ဉO\u0085ဇk", new Object[]{"J", "K", "a", "L", "b", dhnx.a, "d", "e", "f", "g", "h", "c", "i", "k", "m", "j", "n", "o", "p", "q", "v", dhnx.a, "x", "r", "w", "y", "z", "A", "t", "B", "C", "l", "D", "s", "E", "F", "H", "u", "G"});
            }
            if (i2 == 3) {
                return new dhou();
            }
            if (i2 == 4) {
                return new dhnw();
            }
            if (i2 == 5) {
                return I;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhou> dssrVar = M;
            if (dssrVar == null) {
                synchronized (dhou.class) {
                    dssrVar = M;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(I);
                        M = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    @Override // defpackage.dhov
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.dhov
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.dhov
    public final List<Integer> c() {
        return this.e;
    }

    @Override // defpackage.dhov
    public final List<Integer> d() {
        return this.f;
    }

    @Override // defpackage.dhov
    public final boolean e() {
        return this.g;
    }

    @Override // defpackage.dhov
    public final boolean f() {
        return this.h;
    }

    @Override // defpackage.dhov
    public final boolean g() {
        return this.i;
    }

    @Override // defpackage.dhov
    public final boolean h() {
        return this.j;
    }

    @Override // defpackage.dhov
    public final dhon i() {
        dhon dhonVar = this.m;
        return dhonVar == null ? dhon.b : dhonVar;
    }

    @Override // defpackage.dhov
    public final boolean j() {
        return this.n;
    }

    @Override // defpackage.dhov
    public final boolean k() {
        return (this.a & 8) != 0;
    }

    @Override // defpackage.dhov
    public final dhol l() {
        dhol dholVar = this.o;
        return dholVar == null ? dhol.b : dholVar;
    }

    @Override // defpackage.dhov
    public final boolean m() {
        return this.p;
    }

    @Override // defpackage.dhov
    public final dhoh n() {
        dhoh dhohVar = this.q;
        return dhohVar == null ? dhoh.c : dhohVar;
    }

    @Override // defpackage.dhov
    public final dhoe o() {
        dhoe dhoeVar = this.r;
        return dhoeVar == null ? dhoe.c : dhoeVar;
    }

    @Override // defpackage.dhov
    public final dhob p() {
        dhob dhobVar = this.s;
        return dhobVar == null ? dhob.c : dhobVar;
    }

    @Override // defpackage.dhov
    public final dhot q() {
        dhot dhotVar = this.t;
        return dhotVar == null ? dhot.c : dhotVar;
    }

    @Override // defpackage.dhov
    public final dhoq r() {
        dhoq dhoqVar = this.u;
        return dhoqVar == null ? dhoq.c : dhoqVar;
    }

    @Override // defpackage.dhov
    public final boolean s() {
        return this.w;
    }

    @Override // defpackage.dhov
    public final boolean t() {
        return this.x;
    }

    @Override // defpackage.dhov
    public final boolean u() {
        return this.y;
    }

    @Override // defpackage.dhov
    public final boolean v() {
        return this.z;
    }

    @Override // defpackage.dhov
    public final boolean w() {
        return this.A;
    }

    @Override // defpackage.dhov
    public final int x() {
        return this.B;
    }

    @Override // defpackage.dhov
    public final int y() {
        return this.C;
    }

    @Override // defpackage.dhov
    public final boolean z() {
        return this.D;
    }
}
