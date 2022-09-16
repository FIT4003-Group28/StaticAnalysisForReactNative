package defpackage;
/* compiled from: PG */
/* renamed from: ahk  reason: default package */
/* loaded from: classes.dex */
public final class ahk extends ahh {
    private boolean ar;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public ahg d = this.K;
    public int aq = 0;

    public ahk() {
        this.S.clear();
        this.S.add(this.d);
        int length = this.R.length;
        for (int i = 0; i < 6; i++) {
            this.R[i] = this.d;
        }
    }

    @Override // defpackage.ahh
    public final ahg L(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.aq == 0) {
                return this.d;
            }
            return null;
        }
        if (this.aq == 1) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.ahh
    public final void S(boolean z) {
        if (this.T == null) {
            return;
        }
        int o = agy.o(this.d);
        if (this.aq != 1) {
            this.Y = 0;
            this.Z = o;
            D(this.T.j());
            y(0);
            return;
        }
        this.Y = o;
        this.Z = 0;
        y(this.T.h());
        D(0);
    }

    public final void a(int i) {
        this.d.e(i);
        this.ar = true;
    }

    @Override // defpackage.ahh
    public final void b(agy agyVar, boolean z) {
        ahh ahhVar = this.T;
        if (ahhVar == null) {
            return;
        }
        Object L = ahhVar.L(2);
        Object L2 = ahhVar.L(4);
        ahh ahhVar2 = this.T;
        boolean z2 = true;
        boolean z3 = ahhVar2 != null && ahhVar2.ap[0] == 2;
        if (this.aq == 0) {
            L = ahhVar.L(3);
            L2 = ahhVar.L(5);
            ahh ahhVar3 = this.T;
            if (ahhVar3 == null || ahhVar3.ap[1] != 2) {
                z2 = false;
            }
            z3 = z2;
        }
        if (this.ar) {
            ahg ahgVar = this.d;
            if (ahgVar.c) {
                ahc b = agyVar.b(ahgVar);
                agyVar.f(b, this.d.a());
                if (this.b != -1) {
                    if (z3) {
                        agyVar.g(agyVar.b(L2), b, 0, 5);
                    }
                } else if (this.c != -1 && z3) {
                    ahc b2 = agyVar.b(L2);
                    agyVar.g(b, agyVar.b(L), 0, 5);
                    agyVar.g(b2, b, 0, 5);
                }
                this.ar = false;
                return;
            }
        }
        if (this.b != -1) {
            ahc b3 = agyVar.b(this.d);
            agyVar.m(b3, agyVar.b(L), this.b, 8);
            if (!z3) {
                return;
            }
            agyVar.g(agyVar.b(L2), b3, 0, 5);
        } else if (this.c != -1) {
            ahc b4 = agyVar.b(this.d);
            ahc b5 = agyVar.b(L2);
            agyVar.m(b4, b5, -this.c, 8);
            if (!z3) {
                return;
            }
            agyVar.g(b4, agyVar.b(L), 0, 5);
            agyVar.g(b5, b4, 0, 5);
        } else if (this.a == -1.0f) {
        } else {
            ahc b6 = agyVar.b(this.d);
            ahc b7 = agyVar.b(L2);
            float f = this.a;
            agw a = agyVar.a();
            a.e.g(b6, -1.0f);
            a.e.g(b7, f);
            agyVar.e(a);
        }
    }

    public final void c(int i) {
        if (this.aq == i) {
            return;
        }
        this.aq = i;
        this.S.clear();
        if (this.aq == 1) {
            this.d = this.f46J;
        } else {
            this.d = this.K;
        }
        this.S.add(this.d);
        int length = this.R.length;
        for (int i2 = 0; i2 < 6; i2++) {
            this.R[i2] = this.d;
        }
    }

    @Override // defpackage.ahh
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ahh
    public final boolean e() {
        return this.ar;
    }

    @Override // defpackage.ahh
    public final boolean f() {
        return this.ar;
    }
}
