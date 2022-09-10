package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bnvn  reason: default package */
/* loaded from: classes.dex */
public final class bnvn {
    private boolean A;
    public final String a;
    @dzsi
    public bntb b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    final int l;
    public bntc m;
    public bntc n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    private int w;
    private int[] x;
    private short[] y;
    private boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bnvn(java.lang.String r11, float[] r12, int r13, int r14) {
        /*
            r10 = this;
            int r0 = r12.length
            int[] r3 = new int[r0]
            r0 = 0
        L4:
            int r1 = r12.length
            if (r0 >= r1) goto L12
            r1 = r12[r0]
            int r1 = java.lang.Float.floatToIntBits(r1)
            r3[r0] = r1
            int r0 = r0 + 1
            goto L4
        L12:
            int r1 = r1 * 4
            int r12 = d(r13)
            int r4 = r1 / r12
            int r7 = d(r13)
            r8 = 0
            r9 = 0
            r1 = r10
            r2 = r11
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnvn.<init>(java.lang.String, float[], int, int):void");
    }

    private static int d(int i) {
        int i2;
        int i3 = i & 64;
        int i4 = 8;
        int i5 = 4;
        if ((i & 1) != 0) {
            if (i3 == 0) {
                i2 = 12;
            }
            i2 = 8;
        } else if ((i & 2) != 0) {
            if (i3 != 0) {
                i2 = 4;
            }
            i2 = 8;
        } else {
            i2 = 0;
        }
        int i6 = i2 + ((i & 8) != 0 ? 16 : 0) + ((i & 32) != 0 ? 4 : 0);
        if ((i & 16) == 0) {
            i4 = 0;
        }
        int i7 = i6 + i4 + ((i & 2176) != 0 ? 4 : 0) + ((i & 4352) != 0 ? 4 : 0) + ((i & 8704) != 0 ? 4 : 0);
        if ((i & 17408) == 0) {
            i5 = 0;
        }
        return i7 + i5;
    }

    public final void a(boolean z) {
        dbsk.l(!this.A);
        this.z = z;
    }

    public final void b(bntb bntbVar) {
        int[] iArr = this.x;
        short[] sArr = this.y;
        int i = this.w + 1;
        this.w = i;
        if (i == 1) {
            this.b = bntbVar;
            if (this.A && this.z) {
                return;
            }
            this.A = true;
            if (iArr != null) {
                bntc s = bntbVar.s(this.a);
                this.m = s;
                bntbVar.v(s);
                bntbVar.P(iArr, iArr.length);
                bntbVar.w();
            }
            if (sArr != null) {
                bntc t = bntbVar.t(this.a);
                this.n = t;
                bntbVar.x(t);
                bntbVar.K(sArr, sArr.length, 35044);
            }
            if (!this.z) {
                return;
            }
            this.x = null;
            this.y = null;
        }
    }

    public final void c(boolean z) {
        dbsk.l(this.w > 0);
        int i = this.w - 1;
        this.w = i;
        if (i == 0) {
            bntb bntbVar = this.b;
            dbsk.s(bntbVar);
            if (!z) {
                if (this.m.a()) {
                    bntbVar.u(this.m);
                }
                if (this.n.a()) {
                    bntbVar.u(this.n);
                }
            }
            this.m = bntc.a;
            this.n = bntc.a;
            this.b = null;
        }
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof bnvn)) {
            return false;
        }
        bnvn bnvnVar = (bnvn) obj;
        return this.m == bnvnVar.m && this.n == bnvnVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n});
    }

    public bnvn(String str, int[] iArr, int i, int i2, int i3, int i4, short[] sArr, int i5) {
        int i6 = 0;
        this.w = 0;
        this.m = bntc.a;
        this.n = bntc.a;
        this.z = false;
        this.A = false;
        boolean z = true;
        dbsk.l(i4 % 4 == 0);
        int length = iArr.length;
        if (length < (i4 / 4) * i) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Capacity ");
            sb.append(length);
            sb.append(", count ");
            sb.append(i);
            sb.append(", size in bytes ");
            sb.append(i4);
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = str;
        this.x = iArr;
        this.j = i;
        this.l = i2;
        this.k = i3;
        this.o = i4;
        this.m = bntc.a;
        this.y = sArr;
        this.c = i5;
        this.n = bntc.a;
        this.p = (i * i4) + i5 + i5;
        boolean z2 = (i2 & 2) != 0;
        this.e = z2;
        int i7 = i2 & 1;
        this.d = 1 == i7;
        boolean z3 = (i2 & 8) != 0;
        this.g = z3;
        boolean z4 = (i2 & 32) != 0;
        this.h = z4;
        boolean z5 = (i2 & 16) != 0;
        this.f = z5;
        int i8 = i2 & 64;
        this.i = i8 == 0 ? false : z;
        int i9 = 2;
        if (i7 != 0) {
            i6 = (i8 == 0 ? 3 : i9) * 4;
        } else if (z2) {
            i9 = i8 == 0 ? 4 : i9;
            i6 = i9 + i9;
        }
        if (z3) {
            this.r = i6;
            i6 += 16;
        } else if (z4) {
            this.r = i6;
            i6 += 4;
        } else {
            this.r = -1;
        }
        if (z5) {
            this.q = i6;
            i6 += 8;
        } else {
            this.q = -1;
        }
        if ((i2 & 2176) != 0) {
            this.s = i6;
            i6 += 4;
        } else {
            this.s = -1;
        }
        if ((i2 & 4352) != 0) {
            this.t = i6;
            i6 += 4;
        } else {
            this.t = -1;
        }
        if ((i2 & 8704) != 0) {
            this.u = i6;
            i6 += 4;
        } else {
            this.u = -1;
        }
        if ((i2 & 17408) != 0) {
            this.v = i6;
            i6 += 4;
        } else {
            this.v = -1;
        }
        if (i6 != i4) {
            throw new IllegalArgumentException("Mismatched vertex format and vertex size bytes");
        }
    }
}
