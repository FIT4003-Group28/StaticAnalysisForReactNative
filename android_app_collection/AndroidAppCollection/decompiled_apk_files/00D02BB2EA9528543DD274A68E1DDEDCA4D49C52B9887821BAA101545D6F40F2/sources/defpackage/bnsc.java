package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
/* compiled from: PG */
/* renamed from: bnsc  reason: default package */
/* loaded from: classes.dex */
public class bnsc implements bnsa {
    private static final bnvo h = new bnvo(0, 0, 0);
    private bnrw b;
    private bnvn d;
    protected bnrw i;
    public final bnuo j;
    protected bntb l;
    protected bnrs r;
    private final Object a = new Object();
    public boolean k = true;
    public bnuv m = null;
    private final bnvl[] c = new bnvl[8];
    public bnuk n = null;
    protected final bnvr o = new bnvr();
    public boolean p = true;
    protected final bnvr q = new bnvr();
    public boolean t = false;
    private int e = 1;
    private int f = 0;
    public int u = 519;
    public boolean v = false;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public final float z = 1.0f;
    private final bnrz g = new bnsb(this);
    public String s = "<no name>";

    public bnsc(bnuo bnuoVar, bnrw bnrwVar) {
        this.j = bnuoVar;
        this.b = bnrwVar;
        this.i = bnrwVar;
    }

    protected float[] A(bnrr bnrrVar) {
        if (this.p || bnrrVar.f() != this.r) {
            Matrix.multiplyMM(this.q.a, 0, bnrrVar.x(), 0, this.o.a, 0);
            this.q.a();
            this.p = false;
            this.r = bnrrVar.f();
        }
        return this.q.a;
    }

    @Override // defpackage.bnsa
    public final bnuo B() {
        return this.j;
    }

    @Override // defpackage.bnsa
    public boolean C() {
        return this.d != null && this.k;
    }

    @Override // defpackage.bnsa
    public bnvl D(int i) {
        return this.c[i];
    }

    @Override // defpackage.bnsa
    public void E(boolean z) {
        if (!this.t) {
            return;
        }
        bnvn bnvnVar = this.d;
        if (bnvnVar != null) {
            bnvnVar.c(z);
        }
        bnvl[] bnvlVarArr = this.c;
        for (int i = 0; i < 8; i++) {
            bnvl bnvlVar = bnvlVarArr[i];
            if (bnvlVar != null) {
                bnvlVar.e(z);
            }
        }
        bnuv bnuvVar = this.m;
        if (bnuvVar != null) {
            bnuvVar.e();
        }
        this.l = null;
        this.t = false;
    }

    @Override // defpackage.bnsa
    public final boolean F() {
        return this.t;
    }

    @Override // defpackage.bnsa
    public bnvo G() {
        return h;
    }

    @Override // defpackage.bnsa
    public void a(long j) {
    }

    @Override // defpackage.bnsa
    public void b(bnsa bnsaVar, bnsa bnsaVar2, bnrr bnrrVar) {
        bntb bntbVar = this.l;
        bnvn bnvnVar = this.d;
        bnuv bnuvVar = this.m;
        if (bntbVar == null || bnvnVar == null || bnuvVar == null) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            bnvl D = D(i);
            bntbVar.D(bntb.n[i], D != null ? D.c : bntc.a);
        }
        bnuu bnuuVar = bnuvVar.l;
        bntbVar.h(bnuuVar == null ? 0 : bnuuVar.w);
        bnuvVar.a(bntbVar, this, bnrrVar, this.o.a, bnrrVar.x(), A(bnrrVar));
        bntbVar.n(this.e, this.f);
        bntbVar.o(this.u);
        bntbVar.p(1);
        bntbVar.r(this.v, this.w, this.x, this.y);
        bntbVar.q(0.0f, 0.0f);
        dbsk.l(bntbVar.g);
        if (bntbVar.c != 1.0f) {
            GLES20.glLineWidth(1.0f);
            bntbVar.c = 1.0f;
        }
        bntb bntbVar2 = bnvnVar.b;
        dbsk.s(bntbVar2);
        if (bnvnVar.m.a()) {
            bntc bntcVar = bntbVar2.d;
            bntc bntcVar2 = bnvnVar.m;
            if (bntcVar != bntcVar2 || bntbVar2.e != bnvnVar.n) {
                bntbVar2.v(bntcVar2);
                if (bnvnVar.n.a()) {
                    bntbVar2.x(bnvnVar.n);
                }
                bntbVar2.z(0);
                bntbVar2.A(1);
                if (bnvnVar.g || bnvnVar.h) {
                    bntbVar2.z(2);
                } else {
                    bntbVar2.A(2);
                }
                if (bnvnVar.f) {
                    bntbVar2.z(3);
                } else {
                    bntbVar2.A(3);
                }
                if (bnvnVar.d) {
                    GLES20.glVertexAttribPointer(0, true != bnvnVar.i ? 3 : 2, 5126, false, bnvnVar.o, 0);
                } else if (bnvnVar.e) {
                    GLES20.glVertexAttribPointer(0, true != bnvnVar.i ? 3 : 2, 5122, false, bnvnVar.o, 0);
                }
                if (bnvnVar.g) {
                    GLES20.glVertexAttribPointer(2, 4, 5126, false, bnvnVar.o, bnvnVar.r);
                }
                if (bnvnVar.h) {
                    GLES20.glVertexAttribPointer(2, 4, 5121, true, bnvnVar.o, bnvnVar.r);
                }
                if (bnvnVar.f) {
                    GLES20.glVertexAttribPointer(3, 2, 5126, true, bnvnVar.o, bnvnVar.q);
                }
                int i2 = bnvnVar.l;
                if ((i2 & 2176) == 0) {
                    bntbVar2.A(4);
                } else if ((i2 & 128) != 0) {
                    bntbVar2.z(4);
                    GLES20.glVertexAttribPointer(4, 4, 5121, false, bnvnVar.o, bnvnVar.s);
                } else {
                    bntbVar2.z(4);
                    GLES20.glVertexAttribPointer(4, 1, 5126, false, bnvnVar.o, bnvnVar.s);
                }
                int i3 = bnvnVar.l;
                if ((i3 & 4352) == 0) {
                    bntbVar2.A(5);
                } else if ((i3 & 256) != 0) {
                    bntbVar2.z(5);
                    GLES20.glVertexAttribPointer(5, 4, 5121, false, bnvnVar.o, bnvnVar.t);
                } else {
                    bntbVar2.z(5);
                    GLES20.glVertexAttribPointer(5, 1, 5126, false, bnvnVar.o, bnvnVar.t);
                }
                int i4 = bnvnVar.l;
                if ((i4 & 8704) == 0) {
                    bntbVar2.A(6);
                } else if ((i4 & 512) != 0) {
                    bntbVar2.z(6);
                    GLES20.glVertexAttribPointer(6, 4, 5121, false, bnvnVar.o, bnvnVar.u);
                } else {
                    bntbVar2.z(6);
                    GLES20.glVertexAttribPointer(6, 1, 5126, false, bnvnVar.o, bnvnVar.u);
                }
                int i5 = bnvnVar.l;
                if ((i5 & 17408) == 0) {
                    bntbVar2.A(7);
                } else if ((i5 & 1024) != 0) {
                    bntbVar2.z(7);
                    GLES20.glVertexAttribPointer(7, 4, 5121, false, bnvnVar.o, bnvnVar.v);
                } else {
                    bntbVar2.z(7);
                    GLES20.glVertexAttribPointer(7, 1, 5126, false, bnvnVar.o, bnvnVar.v);
                }
            }
        }
        dbsk.s(bnvnVar.b);
        if (bnvnVar.n.a()) {
            bntb.R(bnvnVar.k, bnvnVar.c, 0);
        } else {
            bntb.Q(bnvnVar.k, bnvnVar.j);
        }
    }

    public void e(int i, bnvl bnvlVar) {
        boolean z = this.t;
        if (z) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        bnvl[] bnvlVarArr = this.c;
        bnvl bnvlVar2 = bnvlVarArr[i];
        bnvlVarArr[i] = bnvlVar;
        if (z) {
            if (bnvlVar2 != null) {
                bnvlVar2.e(false);
            }
            bntb bntbVar = this.l;
            dbsk.s(bntbVar);
            bnvlVar.d(bntbVar);
        }
    }

    @Override // defpackage.bnsa
    public int h() {
        return 0;
    }

    @Override // defpackage.bnsa
    public bnrz i() {
        return this.g;
    }

    @Override // defpackage.bnsa
    public final void n(boolean z) {
        if (this.t) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        this.k = z;
    }

    @Override // defpackage.bnsa
    public final bnrw o() {
        bnrw bnrwVar;
        synchronized (this.a) {
            bnrwVar = this.i;
        }
        return bnrwVar;
    }

    @Override // defpackage.bnsa
    public final void p() {
        synchronized (this.a) {
            bnrw bnrwVar = this.b;
            if (bnrwVar != null && !bnrwVar.equals(this.i)) {
                this.i = this.b;
            }
        }
    }

    @Override // defpackage.bnsa
    public final String q() {
        return this.s;
    }

    public final void r(bnvn bnvnVar) {
        boolean z = this.t;
        if (z) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        bnvn bnvnVar2 = this.d;
        if (z) {
            bntb bntbVar = this.l;
            dbsk.s(bntbVar);
            if (bnvnVar2 != null) {
                bnvnVar2.c(false);
            }
            if (bnvnVar != null) {
                bnvnVar.b(bntbVar);
            }
        }
        this.d = bnvnVar;
    }

    public final void s(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final void t(bnuv bnuvVar) {
        boolean z = this.t;
        if (z) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        bnuv bnuvVar2 = this.m;
        this.m = bnuvVar;
        if (z) {
            if (bnuvVar2 != null) {
                bnuvVar2.e();
            }
            if (bnuvVar == null) {
                return;
            }
            bntb bntbVar = this.l;
            dbsk.s(bntbVar);
            bnuvVar.d(bntbVar);
        }
    }

    public final void u(bnrw bnrwVar) {
        synchronized (this.a) {
            this.b = bnrwVar;
        }
    }

    public final void v(int i, int i2) {
        this.v = true;
        this.w = 514;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.bnsa
    public final bnuk x() {
        return this.n;
    }

    @Override // defpackage.bnsa
    public final boolean y() {
        bntv bntvVar;
        bnvl[] bnvlVarArr = this.c;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < 8) {
                bnvl bnvlVar = bnvlVarArr[i];
                if (bnvlVar != null && (bntvVar = bnvlVar.b) != null) {
                    bnrd bnrdVar = bntvVar.d;
                    if (bnrdVar != null) {
                        z = bnrdVar.d();
                    } else {
                        bnrt bnrtVar = bntvVar.k;
                        if (bnrtVar == null) {
                            continue;
                        } else if (bnrtVar.a == null) {
                            z = false;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // defpackage.bnsa
    public final void z(bntb bntbVar) {
        if (this.t) {
            return;
        }
        this.l = bntbVar;
        bnvn bnvnVar = this.d;
        if (bnvnVar != null) {
            bnvnVar.b(bntbVar);
        }
        bnvl[] bnvlVarArr = this.c;
        for (int i = 0; i < 8; i++) {
            bnvl bnvlVar = bnvlVarArr[i];
            if (bnvlVar != null) {
                bnvlVar.d(bntbVar);
            }
        }
        bnuv bnuvVar = this.m;
        if (bnuvVar != null) {
            bnuvVar.d(bntbVar);
        }
        this.t = true;
    }
}
