package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dv  reason: default package */
/* loaded from: classes6.dex */
public final class dv {
    public final du d;
    public ea a = null;
    public float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public dv(dw dwVar) {
        this.d = new du(this, dwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        du duVar = this.d;
        int i = duVar.f;
        for (int i2 = 0; i != -1 && i2 < duVar.a; i2++) {
            ea eaVar = duVar.b.a[duVar.c[i]];
            int i3 = 0;
            while (true) {
                int i4 = eaVar.g;
                if (i3 < i4) {
                    if (eaVar.f[i3] == this) {
                        break;
                    }
                    i3++;
                } else {
                    dv[] dvVarArr = eaVar.f;
                    int length = dvVarArr.length;
                    if (i4 >= length) {
                        eaVar.f = (dv[]) Arrays.copyOf(dvVarArr, length + length);
                    }
                    dv[] dvVarArr2 = eaVar.f;
                    int i5 = eaVar.g;
                    dvVarArr2[i5] = this;
                    eaVar.g = i5 + 1;
                }
            }
            i = duVar.d[i];
        }
    }

    public final void b(ea eaVar) {
        ea eaVar2 = this.a;
        if (eaVar2 != null) {
            this.d.a(eaVar2, -1.0f);
            this.a = null;
        }
        float f = -this.d.c(eaVar);
        this.a = eaVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        du duVar = this.d;
        int i = duVar.f;
        for (int i2 = 0; i != -1 && i2 < duVar.a; i2++) {
            float[] fArr = duVar.e;
            fArr[i] = fArr[i] / f;
            i = duVar.d[i];
        }
    }

    public final void c(ea eaVar, ea eaVar2) {
        this.d.a(eaVar, 1.0f);
        this.d.a(eaVar2, -1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(ea eaVar, ea eaVar2, int i, float f, ea eaVar3, ea eaVar4, int i2) {
        if (eaVar2 == eaVar3) {
            this.d.a(eaVar, 1.0f);
            this.d.a(eaVar4, 1.0f);
            this.d.a(eaVar2, -2.0f);
        } else if (f == 0.5f) {
            this.d.a(eaVar, 1.0f);
            this.d.a(eaVar2, -1.0f);
            this.d.a(eaVar3, -1.0f);
            this.d.a(eaVar4, 1.0f);
            if (i <= 0 && i2 <= 0) {
                return;
            }
            this.b = (-i) + i2;
        } else if (f <= 0.0f) {
            this.d.a(eaVar, -1.0f);
            this.d.a(eaVar2, 1.0f);
            this.b = i;
        } else if (f >= 1.0f) {
            this.d.a(eaVar3, -1.0f);
            this.d.a(eaVar4, 1.0f);
            this.b = i2;
        } else {
            float f2 = 1.0f - f;
            this.d.a(eaVar, f2);
            this.d.a(eaVar2, -f2);
            this.d.a(eaVar3, -f);
            this.d.a(eaVar4, f);
            if (i <= 0 && i2 <= 0) {
                return;
            }
            this.b = ((-i) * f2) + (i2 * f);
        }
    }

    public final void e(ea eaVar, ea eaVar2, ea eaVar3, ea eaVar4, float f) {
        this.d.a(eaVar, -1.0f);
        this.d.a(eaVar2, 1.0f);
        this.d.a(eaVar3, f);
        this.d.a(eaVar4, -f);
    }

    public final void g(ea eaVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.a(eaVar, 1.0f);
            return;
        }
        this.b = i;
        this.d.a(eaVar, -1.0f);
    }

    public final void k(dv dvVar) {
        this.d.d(this, dvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv.toString():java.lang.String");
    }

    public final void h(ea eaVar, ea eaVar2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.a(eaVar, 1.0f);
                this.d.a(eaVar2, -1.0f);
                return;
            }
        }
        this.d.a(eaVar, -1.0f);
        this.d.a(eaVar2, 1.0f);
    }

    public final void i(ea eaVar, ea eaVar2, ea eaVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.a(eaVar, 1.0f);
                this.d.a(eaVar2, -1.0f);
                this.d.a(eaVar3, -1.0f);
                return;
            }
        }
        this.d.a(eaVar, -1.0f);
        this.d.a(eaVar2, 1.0f);
        this.d.a(eaVar3, 1.0f);
    }

    public final void j(ea eaVar, ea eaVar2, ea eaVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.a(eaVar, 1.0f);
                this.d.a(eaVar2, -1.0f);
                this.d.a(eaVar3, 1.0f);
                return;
            }
        }
        this.d.a(eaVar, -1.0f);
        this.d.a(eaVar2, 1.0f);
        this.d.a(eaVar3, -1.0f);
    }

    public final void f(float f, float f2, float f3, ea eaVar, int i, ea eaVar2, int i2, ea eaVar3, int i3, ea eaVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.b = ((-i) - i2) + i3 + i4;
            this.d.a(eaVar, 1.0f);
            this.d.a(eaVar2, -1.0f);
            this.d.a(eaVar4, 1.0f);
            this.d.a(eaVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = ((-i) - i2) + (i3 * f4) + (i4 * f4);
        this.d.a(eaVar, 1.0f);
        this.d.a(eaVar2, -1.0f);
        this.d.a(eaVar4, f4);
        this.d.a(eaVar3, -f4);
    }
}
