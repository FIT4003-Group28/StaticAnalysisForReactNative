package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bw  reason: default package */
/* loaded from: classes2.dex */
public final class bw {
    public final bv d;
    public cb a = null;
    public float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public bw(bx bxVar) {
        this.d = new bv(this, bxVar);
    }

    public final void a(cb cbVar) {
        cb cbVar2 = this.a;
        if (cbVar2 != null) {
            this.d.f(cbVar2, -1.0f);
            this.a = null;
        }
        float f = -this.d.c(cbVar);
        this.a = cbVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        bv bvVar = this.d;
        int i = bvVar.f;
        for (int i2 = 0; i != -1 && i2 < bvVar.a; i2++) {
            float[] fArr = bvVar.e;
            fArr[i] = fArr[i] / f;
            i = bvVar.d[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        bv bvVar = this.d;
        int i = bvVar.f;
        for (int i2 = 0; i != -1 && i2 < bvVar.a; i2++) {
            cb cbVar = bvVar.b.a[bvVar.c[i]];
            int i3 = 0;
            while (true) {
                int i4 = cbVar.g;
                if (i3 < i4) {
                    if (cbVar.f[i3] == this) {
                        break;
                    }
                    i3++;
                } else {
                    bw[] bwVarArr = cbVar.f;
                    int length = bwVarArr.length;
                    if (i4 >= length) {
                        cbVar.f = (bw[]) Arrays.copyOf(bwVarArr, length + length);
                    }
                    bw[] bwVarArr2 = cbVar.f;
                    int i5 = cbVar.g;
                    bwVarArr2[i5] = this;
                    cbVar.g = i5 + 1;
                }
            }
            i = bvVar.d[i];
        }
    }

    public final void c(cb cbVar, cb cbVar2) {
        this.d.f(cbVar, 1.0f);
        this.d.f(cbVar2, -1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(cb cbVar, cb cbVar2, int i, float f, cb cbVar3, cb cbVar4, int i2) {
        if (cbVar2 == cbVar3) {
            this.d.f(cbVar, 1.0f);
            this.d.f(cbVar4, 1.0f);
            this.d.f(cbVar2, -2.0f);
        } else if (f == 0.5f) {
            this.d.f(cbVar, 1.0f);
            this.d.f(cbVar2, -1.0f);
            this.d.f(cbVar3, -1.0f);
            this.d.f(cbVar4, 1.0f);
            if (i <= 0 && i2 <= 0) {
                return;
            }
            this.b = (-i) + i2;
        } else if (f <= 0.0f) {
            this.d.f(cbVar, -1.0f);
            this.d.f(cbVar2, 1.0f);
            this.b = i;
        } else if (f >= 1.0f) {
            this.d.f(cbVar3, -1.0f);
            this.d.f(cbVar4, 1.0f);
            this.b = i2;
        } else {
            float f2 = 1.0f - f;
            this.d.f(cbVar, f2);
            this.d.f(cbVar2, -f2);
            this.d.f(cbVar3, -f);
            this.d.f(cbVar4, f);
            if (i <= 0 && i2 <= 0) {
                return;
            }
            this.b = ((-i) * f2) + (i2 * f);
        }
    }

    public final void e(cb cbVar, cb cbVar2, cb cbVar3, cb cbVar4, float f) {
        this.d.f(cbVar, -1.0f);
        this.d.f(cbVar2, 1.0f);
        this.d.f(cbVar3, f);
        this.d.f(cbVar4, -f);
    }

    public final void g(cb cbVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(cbVar, 1.0f);
            return;
        }
        this.b = i;
        this.d.f(cbVar, -1.0f);
    }

    public final void k(bw bwVar) {
        this.d.g(this, bwVar);
    }

    public final void h(cb cbVar, cb cbVar2, int i) {
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
                this.d.f(cbVar, 1.0f);
                this.d.f(cbVar2, -1.0f);
                return;
            }
        }
        this.d.f(cbVar, -1.0f);
        this.d.f(cbVar2, 1.0f);
    }

    public final void i(cb cbVar, cb cbVar2, cb cbVar3, int i) {
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
                this.d.f(cbVar, 1.0f);
                this.d.f(cbVar2, -1.0f);
                this.d.f(cbVar3, -1.0f);
                return;
            }
        }
        this.d.f(cbVar, -1.0f);
        this.d.f(cbVar2, 1.0f);
        this.d.f(cbVar3, 1.0f);
    }

    public final void j(cb cbVar, cb cbVar2, cb cbVar3, int i) {
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
                this.d.f(cbVar, 1.0f);
                this.d.f(cbVar2, -1.0f);
                this.d.f(cbVar3, 1.0f);
                return;
            }
        }
        this.d.f(cbVar, -1.0f);
        this.d.f(cbVar2, 1.0f);
        this.d.f(cbVar3, -1.0f);
    }

    public final void f(float f, float f2, float f3, cb cbVar, int i, cb cbVar2, int i2, cb cbVar3, int i3, cb cbVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.b = ((-i) - i2) + i3 + i4;
            this.d.f(cbVar, 1.0f);
            this.d.f(cbVar2, -1.0f);
            this.d.f(cbVar4, 1.0f);
            this.d.f(cbVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = ((-i) - i2) + (i3 * f4) + (i4 * f4);
        this.d.f(cbVar, 1.0f);
        this.d.f(cbVar2, -1.0f);
        this.d.f(cbVar4, f4);
        this.d.f(cbVar3, -f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            cb r0 = r7.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L1a
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            cb r1 = r7.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r7.b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r7.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L48
        L47:
            r1 = 0
        L48:
            bv r5 = r7.d
            int r5 = r5.a
        L4c:
            if (r2 >= r5) goto Lcf
            bv r6 = r7.d
            cb r6 = r6.d(r2)
            if (r6 != 0) goto L58
            goto Lcb
        L58:
            bv r6 = r7.d
            float r6 = r6.b(r2)
            if (r1 != 0) goto L76
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L9e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L9d
        L76:
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L9e
        L8c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L9d:
            float r6 = -r6
        L9e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lca
        Lb6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Lca:
            r1 = 1
        Lcb:
            int r2 = r2 + 1
            goto L4c
        Lcf:
            if (r1 != 0) goto Le2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw.toString():java.lang.String");
    }
}
