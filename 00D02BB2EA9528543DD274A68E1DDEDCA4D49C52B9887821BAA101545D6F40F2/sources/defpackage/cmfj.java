package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.ar.core.ImageMetadata;
import java.io.EOFException;
/* compiled from: PG */
/* renamed from: cmfj  reason: default package */
/* loaded from: classes5.dex */
public final class cmfj implements clvk {
    private boolean A;
    private boolean B;
    public final cmfg a;
    public cmfi c;
    public int d;
    public int e;
    public int f;
    public cltv h;
    private final cltu i;
    private Format j;
    private int s;
    private boolean v;
    private Format y;
    private Format z;
    public final cmfh b = new cmfh();
    private int k = 1000;
    private int[] l = new int[1000];
    private long[] m = new long[1000];
    private long[] p = new long[1000];
    private int[] o = new int[1000];
    private int[] n = new int[1000];
    private clvj[] q = new clvj[1000];
    private Format[] r = new Format[1000];
    public long g = Long.MIN_VALUE;
    private long t = Long.MIN_VALUE;
    private long u = Long.MIN_VALUE;
    private boolean x = true;
    private boolean w = true;

    public cmfj(cmkk cmkkVar, cltu cltuVar) {
        this.i = cltuVar;
        this.a = new cmfg(cmkkVar);
    }

    private final int A(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.p[i] <= j; i4++) {
            if (!z || (this.o[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.k) {
                i = 0;
            }
        }
        return i3;
    }

    private final int C(int i) {
        int i2 = this.s + i;
        int i3 = this.k;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized void t() {
        this.f = 0;
        cmfg cmfgVar = this.a;
        cmfgVar.c = cmfgVar.b;
    }

    private final synchronized boolean u(Format format) {
        this.x = false;
        if (cmny.b(format, this.y)) {
            return false;
        }
        if (cmny.b(format, this.z)) {
            this.y = this.z;
        } else {
            this.y = format;
        }
        Format format2 = this.y;
        this.A = cmnf.d(format2.l, format2.i);
        this.B = false;
        return true;
    }

    private final synchronized long v() {
        int i = this.d;
        if (i == 0) {
            return -1L;
        }
        return B(i);
    }

    private final synchronized void w(long j, int i, long j2, int i2, clvj clvjVar) {
        int i3 = this.d;
        if (i3 > 0) {
            int C = C(i3 - 1);
            cmmn.a(this.m[C] + ((long) this.n[C]) <= j2);
        }
        this.v = (536870912 & i) != 0;
        this.u = Math.max(this.u, j);
        int C2 = C(this.d);
        this.p[C2] = j;
        long[] jArr = this.m;
        jArr[C2] = j2;
        this.n[C2] = i2;
        this.o[C2] = i;
        this.q[C2] = clvjVar;
        Format[] formatArr = this.r;
        Format format = this.y;
        formatArr[C2] = format;
        this.l[C2] = 0;
        this.z = format;
        int i4 = this.d + 1;
        this.d = i4;
        int i5 = this.k;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            clvj[] clvjVarArr = new clvj[i6];
            Format[] formatArr2 = new Format[i6];
            int i7 = this.s;
            int i8 = i5 - i7;
            System.arraycopy(jArr, i7, jArr2, 0, i8);
            System.arraycopy(this.p, this.s, jArr3, 0, i8);
            System.arraycopy(this.o, this.s, iArr2, 0, i8);
            System.arraycopy(this.n, this.s, iArr3, 0, i8);
            System.arraycopy(this.q, this.s, clvjVarArr, 0, i8);
            System.arraycopy(this.r, this.s, formatArr2, 0, i8);
            System.arraycopy(this.l, this.s, iArr, 0, i8);
            int i9 = this.s;
            System.arraycopy(this.m, 0, jArr2, i8, i9);
            System.arraycopy(this.p, 0, jArr3, i8, i9);
            System.arraycopy(this.o, 0, iArr2, i8, i9);
            System.arraycopy(this.n, 0, iArr3, i8, i9);
            System.arraycopy(this.q, 0, clvjVarArr, i8, i9);
            System.arraycopy(this.r, 0, formatArr2, i8, i9);
            System.arraycopy(this.l, 0, iArr, i8, i9);
            this.m = jArr2;
            this.p = jArr3;
            this.o = iArr2;
            this.n = iArr3;
            this.q = clvjVarArr;
            this.r = formatArr2;
            this.l = iArr;
            this.s = 0;
            this.k = i6;
        }
    }

    private final boolean x() {
        return this.f != this.d;
    }

    private final void y(Format format, clng clngVar) {
        Format format2 = this.j;
        cltv cltvVar = null;
        DrmInitData drmInitData = format2 == null ? null : format2.o;
        this.j = format;
        DrmInitData drmInitData2 = format.o;
        clngVar.a = format.b(this.i.a(format));
        clngVar.b = this.h;
        if (format2 == null || !cmny.b(drmInitData, drmInitData2)) {
            if (format.o != null) {
                cltvVar = new cltv(new cltp(new cltx()));
            }
            this.h = cltvVar;
            clngVar.b = cltvVar;
        }
    }

    private final boolean z(int i) {
        if (this.h != null) {
            return (this.o[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    @Override // defpackage.clvk
    public final void a(Format format) {
        boolean u = u(format);
        cmfi cmfiVar = this.c;
        if (cmfiVar == null || !u) {
            return;
        }
        cmfb cmfbVar = (cmfb) cmfiVar;
        cmfbVar.i.post(cmfbVar.g);
    }

    @Override // defpackage.clvk
    public final void b(long j, int i, int i2, int i3, clvj clvjVar) {
        int i4 = i & 1;
        if (this.w) {
            if (i4 == 0) {
                return;
            }
            this.w = false;
        }
        if (this.A) {
            if (j < this.g) {
                return;
            }
            if (i4 == 0) {
                if (!this.B) {
                    String valueOf = String.valueOf(this.y);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                    sb.append("Overriding unexpected non-sync sample for format: ");
                    sb.append(valueOf);
                    sb.toString();
                    this.B = true;
                }
                i |= 1;
            }
        }
        w(j, i, (this.a.e - i2) - i3, i2, clvjVar);
    }

    @Override // defpackage.clvk
    public final int c(cmkd cmkdVar, int i, boolean z) {
        return clvi.a(this, cmkdVar, i, z);
    }

    @Override // defpackage.clvk
    public final void d(cmnk cmnkVar, int i) {
        clvi.b(this, cmnkVar, i);
    }

    @Override // defpackage.clvk
    public final int e(cmkd cmkdVar, int i, boolean z) {
        cmfg cmfgVar = this.a;
        int d = cmfgVar.d(i);
        cmff cmffVar = cmfgVar.d;
        int a = cmkdVar.a(cmffVar.d.a, cmffVar.a(cmfgVar.e), d);
        if (a != -1) {
            cmfgVar.e(a);
            return a;
        } else if (!z) {
            throw new EOFException();
        } else {
            return -1;
        }
    }

    @Override // defpackage.clvk
    public final void f(cmnk cmnkVar, int i) {
        cmfg cmfgVar = this.a;
        while (i > 0) {
            int d = cmfgVar.d(i);
            cmff cmffVar = cmfgVar.d;
            cmnkVar.j(cmffVar.d.a, cmffVar.a(cmfgVar.e), d);
            i -= d;
            cmfgVar.e(d);
        }
    }

    public final void g() {
        h(false);
    }

    public final void h(boolean z) {
        cmfg cmfgVar = this.a;
        cmff cmffVar = cmfgVar.b;
        if (cmffVar.c) {
            cmff cmffVar2 = cmfgVar.d;
            boolean z2 = cmffVar2.c;
            int i = (z2 ? 1 : 0) + (((int) (cmffVar2.a - cmffVar.a)) / ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
            cmjs[] cmjsVarArr = new cmjs[i];
            for (int i2 = 0; i2 < i; i2++) {
                cmjsVarArr[i2] = cmffVar.d;
                cmffVar = cmffVar.b();
            }
            cmfgVar.f.e(cmjsVarArr);
        }
        cmfgVar.b = new cmff(0L);
        cmff cmffVar3 = cmfgVar.b;
        cmfgVar.c = cmffVar3;
        cmfgVar.d = cmffVar3;
        cmfgVar.e = 0L;
        cmfgVar.f.f();
        this.d = 0;
        this.e = 0;
        this.s = 0;
        this.f = 0;
        this.w = true;
        this.g = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = false;
        this.z = null;
        if (z) {
            this.y = null;
            this.x = true;
        }
    }

    public final synchronized Format i() {
        if (this.x) {
            return null;
        }
        return this.y;
    }

    public final synchronized long j() {
        return this.u;
    }

    public final synchronized boolean k() {
        return this.v;
    }

    public final synchronized boolean l(boolean z) {
        boolean z2 = true;
        if (x()) {
            int C = C(this.f);
            if (this.r[C] != this.j) {
                return true;
            }
            return z(C);
        }
        if (!z && !this.v) {
            Format format = this.y;
            if (format == null) {
                z2 = false;
            } else if (format == this.j) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean m(long j, boolean z) {
        t();
        int C = C(this.f);
        if (!x() || j < this.p[C] || (j > this.u && !z)) {
            return false;
        }
        int A = A(C, this.d - this.f, j, true);
        if (A == -1) {
            return false;
        }
        this.g = j;
        this.f += A;
        return true;
    }

    public final synchronized int n(long j, boolean z) {
        int C = C(this.f);
        if (x() && j >= this.p[C]) {
            if (j > this.u && z) {
                return this.d - this.f;
            }
            int A = A(C, this.d - this.f, j, true);
            if (A != -1) {
                return A;
            }
            return 0;
        }
        return 0;
    }

    public final synchronized void o(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f + i <= this.d) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        cmmn.a(z);
        this.f += i;
    }

    public final void p() {
        this.a.a(v());
    }

    public final synchronized int q(clng clngVar, cltg cltgVar, boolean z, boolean z2, cmfh cmfhVar) {
        cltgVar.c = false;
        if (!x()) {
            if (!z2 && !this.v) {
                Format format = this.y;
                if (format == null || (!z && format == this.j)) {
                    return -3;
                }
                y(format, clngVar);
                return -5;
            }
            cltgVar.setFlags(4);
            return -4;
        }
        int C = C(this.f);
        if (!z && this.r[C] == this.j) {
            if (!z(C)) {
                cltgVar.c = true;
                return -3;
            }
            cltgVar.setFlags(this.o[C]);
            long j = this.p[C];
            cltgVar.d = j;
            if (j < this.g) {
                cltgVar.addFlag(Integer.MIN_VALUE);
            }
            if (cltgVar.b()) {
                return -4;
            }
            cmfhVar.a = this.n[C];
            cmfhVar.b = this.m[C];
            cmfhVar.c = this.q[C];
            this.f++;
            return -4;
        }
        y(this.r[C], clngVar);
        return -5;
    }

    public final void r() {
        if (this.h != null) {
            this.h = null;
            this.j = null;
        }
    }

    public final synchronized long s(long j, boolean z) {
        int i;
        int i2 = this.d;
        if (i2 != 0) {
            long[] jArr = this.p;
            int i3 = this.s;
            if (j >= jArr[i3]) {
                if (z && (i = this.f) != i2) {
                    i2 = i + 1;
                }
                int A = A(i3, i2, j, false);
                if (A != -1) {
                    return B(A);
                }
                return -1L;
            }
        }
        return -1L;
    }

    private final long B(int i) {
        int i2;
        long j = this.t;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int C = C(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.p[C]);
                if ((this.o[C] & 1) != 0) {
                    break;
                }
                C--;
                if (C == -1) {
                    C = this.k - 1;
                }
            }
        }
        this.t = Math.max(j, j2);
        int i4 = this.d - i;
        this.d = i4;
        this.e += i;
        int i5 = this.s + i;
        this.s = i5;
        int i6 = this.k;
        if (i5 >= i6) {
            i5 -= i6;
            this.s = i5;
        }
        int i7 = this.f - i;
        this.f = i7;
        if (i7 < 0) {
            this.f = 0;
        }
        if (i4 == 0) {
            if (i5 != 0) {
                i6 = i5;
            }
            return this.m[i6 - 1] + this.n[i2];
        }
        return this.m[i5];
    }
}
