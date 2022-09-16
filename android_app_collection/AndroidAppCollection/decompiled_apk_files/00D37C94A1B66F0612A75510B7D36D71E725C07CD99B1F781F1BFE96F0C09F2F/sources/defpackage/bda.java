package defpackage;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: bda  reason: default package */
/* loaded from: classes2.dex */
public final class bda implements bdd {
    private static final byte[] c = {73, 68, 51};
    public long a;
    public long b;
    private final boolean d;
    private final pwt e = new pwt(new byte[7]);
    private final pwu f = new pwu(Arrays.copyOf(c, 10));
    private final String g;
    private String h;
    private bab i;
    private bab j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private int t;
    private bab u;
    private long v;

    public bda(boolean z, String str) {
        h();
        this.p = -1;
        this.q = -1;
        this.a = -9223372036854775807L;
        this.d = z;
        this.g = str;
    }

    public static boolean g(int i) {
        return (i & 65526) == 65520;
    }

    private final void h() {
        this.k = 0;
        this.l = 0;
        this.m = 256;
    }

    private final void i() {
        this.k = 3;
        this.l = 0;
    }

    private final void j(bab babVar, long j, int i, int i2) {
        this.k = 4;
        this.l = i;
        this.u = babVar;
        this.v = j;
        this.t = i2;
    }

    private final boolean k(pwu pwuVar, byte[] bArr, int i) {
        int min = Math.min(pwuVar.a(), i - this.l);
        pwuVar.B(bArr, this.l, min);
        int i2 = this.l + min;
        this.l = i2;
        return i2 == i;
    }

    private static final boolean l(byte b) {
        return g((b & 255) | 65280);
    }

    private static final boolean m(pwu pwuVar, byte[] bArr, int i) {
        if (pwuVar.a() < i) {
            return false;
        }
        pwuVar.B(bArr, 0, i);
        return true;
    }

    @Override // defpackage.bdd
    public final void a(pwu pwuVar) {
        int i;
        int i2;
        int i3;
        ptx.a(this.i);
        int i4 = pxi.a;
        while (pwuVar.a() > 0) {
            int i5 = this.k;
            int i6 = 13;
            int i7 = 2;
            if (i5 == 0) {
                byte[] bArr = pwuVar.a;
                int i8 = pwuVar.b;
                int i9 = pwuVar.c;
                while (true) {
                    if (i8 < i9) {
                        i = i8 + 1;
                        i2 = bArr[i8] & 255;
                        if (this.m == 512 && l((byte) i2)) {
                            if (this.o) {
                                break;
                            }
                            int i10 = i - 2;
                            pwuVar.G(i10 + 1);
                            if (m(pwuVar, this.e.a, 1)) {
                                this.e.j(4);
                                int d = this.e.d(1);
                                int i11 = this.p;
                                if (i11 == -1 || d == i11) {
                                    if (this.q != -1) {
                                        if (!m(pwuVar, this.e.a, 1)) {
                                            break;
                                        }
                                        this.e.j(i7);
                                        if (this.e.d(4) == this.q) {
                                            pwuVar.G(i10 + 2);
                                        }
                                    }
                                    if (!m(pwuVar, this.e.a, 4)) {
                                        break;
                                    }
                                    this.e.j(14);
                                    int d2 = this.e.d(i6);
                                    if (d2 >= 7) {
                                        byte[] bArr2 = pwuVar.a;
                                        int i12 = pwuVar.c;
                                        int i13 = i10 + d2;
                                        if (i13 >= i12) {
                                            break;
                                        } else if ((r8 = bArr2[i13]) == -1) {
                                        }
                                    }
                                }
                            }
                        }
                        int i14 = this.m;
                        int i15 = i14 | i2;
                        if (i15 == 329) {
                            i3 = 768;
                        } else if (i15 == 511) {
                            i3 = 512;
                        } else if (i15 == 836) {
                            i3 = 1024;
                        } else if (i15 == 1075) {
                            this.k = 2;
                            this.l = 3;
                            this.t = 0;
                            this.f.G(0);
                            pwuVar.G(i);
                            break;
                        } else if (i14 != 256) {
                            this.m = 256;
                            i8 = i - 1;
                            i6 = 13;
                            i7 = 2;
                        } else {
                            i8 = i;
                            i6 = 13;
                            i7 = 2;
                        }
                        this.m = i3;
                        i8 = i;
                        i6 = 13;
                        i7 = 2;
                    } else {
                        pwuVar.G(i8);
                        break;
                    }
                }
                this.r = (i2 & 8) >> 3;
                this.n = 1 == ((i2 & 1) ^ 1);
                if (!this.o) {
                    this.k = 1;
                    this.l = 0;
                } else {
                    i();
                }
                pwuVar.G(i);
            } else if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        int min = Math.min(pwuVar.a(), this.t - this.l);
                        this.u.c(pwuVar, min);
                        int i16 = this.l + min;
                        this.l = i16;
                        int i17 = this.t;
                        if (i16 == i17) {
                            this.u.e(this.b, 1, i17, 0, null);
                            this.b += this.v;
                            h();
                        }
                    } else {
                        if (k(pwuVar, this.e.a, true != this.n ? 5 : 7)) {
                            this.e.j(0);
                            if (!this.s) {
                                int d3 = this.e.d(2) + 1;
                                if (d3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(d3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.e.l(5);
                                int d4 = this.e.d(3);
                                int i18 = this.q;
                                int i19 = aym.a;
                                byte[] bArr3 = {(byte) (((i18 >> 1) & 7) | 16), (byte) (((d4 << 3) & 120) | ((i18 << 7) & 128))};
                                agqq a = aym.a(bArr3);
                                pis pisVar = new pis();
                                pisVar.a = this.h;
                                pisVar.k = "audio/mp4a-latm";
                                pisVar.h = a.a;
                                pisVar.x = a.b;
                                pisVar.y = a.c;
                                pisVar.m = Collections.singletonList(bArr3);
                                pisVar.c = this.g;
                                Format a2 = pisVar.a();
                                this.a = 1024000000 / a2.z;
                                this.i.rx(a2);
                                this.s = true;
                            } else {
                                this.e.l(10);
                            }
                            this.e.l(4);
                            int d5 = this.e.d(13) - 7;
                            if (this.n) {
                                d5 -= 2;
                            }
                            j(this.i, this.a, 0, d5);
                        }
                    }
                } else if (k(pwuVar, this.f.a, 10)) {
                    this.j.c(this.f, 10);
                    this.f.G(6);
                    j(this.j, 0L, 10, this.f.h() + 10);
                }
            } else if (pwuVar.a() != 0) {
                pwt pwtVar = this.e;
                pwtVar.a[0] = pwuVar.a[pwuVar.b];
                pwtVar.j(2);
                int d6 = this.e.d(4);
                int i20 = this.q;
                if (i20 == -1 || d6 == i20) {
                    if (!this.o) {
                        this.o = true;
                        this.p = this.r;
                        this.q = d6;
                    }
                    i();
                } else {
                    f();
                }
            }
        }
    }

    @Override // defpackage.bdd
    public final void b(azh azhVar, bef befVar) {
        befVar.c();
        this.h = befVar.b();
        bab pT = azhVar.pT(befVar.a(), 1);
        this.i = pT;
        this.u = pT;
        if (this.d) {
            befVar.c();
            bab pT2 = azhVar.pT(befVar.a(), 5);
            this.j = pT2;
            pis pisVar = new pis();
            pisVar.a = befVar.b();
            pisVar.k = "application/id3";
            pT2.rx(pisVar.a());
            return;
        }
        this.j = new azd();
    }

    @Override // defpackage.bdd
    public final void c() {
    }

    @Override // defpackage.bdd
    public final void d(long j, int i) {
        this.b = j;
    }

    @Override // defpackage.bdd
    public final void e() {
        f();
    }

    public final void f() {
        this.o = false;
        h();
    }
}
