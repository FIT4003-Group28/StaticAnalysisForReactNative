package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.filament.R;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: clyv  reason: default package */
/* loaded from: classes5.dex */
public final class clyv implements clyz {
    private static final byte[] c = {73, 68, 51};
    public long a;
    public long b;
    private final boolean d;
    private final cmnj e = new cmnj(new byte[7]);
    private final cmnk f = new cmnk(Arrays.copyOf(c, 10));
    private final String g;
    private String h;
    private clvk i;
    private clvk j;
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
    private clvk u;
    private long v;

    public clyv(boolean z, String str) {
        i();
        this.p = -1;
        this.q = -1;
        this.a = -9223372036854775807L;
        this.d = z;
        this.g = str;
    }

    public static boolean f(int i) {
        return (i & 65526) == 65520;
    }

    private final boolean h(cmnk cmnkVar, byte[] bArr, int i) {
        int min = Math.min(cmnkVar.d(), i - this.l);
        cmnkVar.j(bArr, this.l, min);
        int i2 = this.l + min;
        this.l = i2;
        return i2 == i;
    }

    private final void i() {
        this.k = 0;
        this.l = 0;
        this.m = 256;
    }

    private final void j(clvk clvkVar, long j, int i, int i2) {
        this.k = 4;
        this.l = i;
        this.u = clvkVar;
        this.v = j;
        this.t = i2;
    }

    private final void k() {
        this.k = 3;
        this.l = 0;
    }

    private static final boolean l(byte b) {
        return f((b & 255) | 65280);
    }

    private static final boolean m(cmnk cmnkVar, byte[] bArr, int i) {
        if (cmnkVar.d() < i) {
            return false;
        }
        cmnkVar.j(bArr, 0, i);
        return true;
    }

    @Override // defpackage.clyz
    public final void a() {
        g();
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        cmajVar.a();
        this.h = cmajVar.c();
        clvk RT = clupVar.RT(cmajVar.b());
        this.i = RT;
        this.u = RT;
        if (this.d) {
            cmajVar.a();
            clvk RT2 = clupVar.RT(cmajVar.b());
            this.j = RT2;
            clnf clnfVar = new clnf();
            clnfVar.a = cmajVar.c();
            clnfVar.k = "application/id3";
            RT2.a(clnfVar.a());
            return;
        }
        this.j = new clum();
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        this.b = j;
    }

    @Override // defpackage.clyz
    public final void d(cmnk cmnkVar) {
        int i;
        int i2;
        int i3;
        cmmn.f(this.i);
        int i4 = cmny.a;
        while (cmnkVar.d() > 0) {
            int i5 = this.k;
            int i6 = 13;
            int i7 = 2;
            if (i5 == 0) {
                byte[] bArr = cmnkVar.a;
                int i8 = cmnkVar.b;
                int i9 = cmnkVar.c;
                while (true) {
                    if (i8 < i9) {
                        i = i8 + 1;
                        i2 = bArr[i8] & 255;
                        if (this.m == 512 && l((byte) i2)) {
                            if (this.o) {
                                break;
                            }
                            int i10 = i - 2;
                            cmnkVar.f(i10 + 1);
                            if (m(cmnkVar, this.e.a, 1)) {
                                this.e.f(4);
                                int j = this.e.j(1);
                                int i11 = this.p;
                                if (i11 == -1 || j == i11) {
                                    if (this.q != -1) {
                                        if (!m(cmnkVar, this.e.a, 1)) {
                                            break;
                                        }
                                        this.e.f(i7);
                                        if (this.e.j(4) == this.q) {
                                            cmnkVar.f(i10 + 2);
                                        }
                                    }
                                    if (!m(cmnkVar, this.e.a, 4)) {
                                        break;
                                    }
                                    this.e.f(14);
                                    int j2 = this.e.j(i6);
                                    if (j2 >= 7) {
                                        byte[] bArr2 = cmnkVar.a;
                                        int i12 = cmnkVar.c;
                                        int i13 = i10 + j2;
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
                            this.f.f(0);
                            cmnkVar.f(i);
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
                        cmnkVar.f(i8);
                        break;
                    }
                }
                this.r = (i2 & 8) >> 3;
                this.n = 1 == ((i2 & 1) ^ 1);
                if (!this.o) {
                    this.k = 1;
                    this.l = 0;
                } else {
                    k();
                }
                cmnkVar.f(i);
            } else if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        int min = Math.min(cmnkVar.d(), this.t - this.l);
                        this.u.d(cmnkVar, min);
                        int i16 = this.l + min;
                        this.l = i16;
                        int i17 = this.t;
                        if (i16 == i17) {
                            this.u.b(this.b, 1, i17, 0, null);
                            this.b += this.v;
                            i();
                        }
                    } else {
                        if (h(cmnkVar, this.e.a, true != this.n ? 5 : 7)) {
                            this.e.f(0);
                            if (!this.s) {
                                int j3 = this.e.j(2) + 1;
                                if (j3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(j3);
                                    sb.append(", but assuming AAC LC.");
                                    sb.toString();
                                }
                                this.e.h(5);
                                int j4 = this.e.j(3);
                                int i18 = this.q;
                                int i19 = clqy.a;
                                byte[] bArr3 = {(byte) (((i18 >> 1) & 7) | 16), (byte) (((j4 << 3) & R.styleable.AppCompatTheme_windowFixedHeightMajor) | ((i18 << 7) & 128))};
                                clqx a = clqy.a(bArr3);
                                clnf clnfVar = new clnf();
                                clnfVar.a = this.h;
                                clnfVar.k = "audio/mp4a-latm";
                                clnfVar.h = a.c;
                                clnfVar.x = a.b;
                                clnfVar.y = a.a;
                                clnfVar.m = Collections.singletonList(bArr3);
                                clnfVar.c = this.g;
                                Format a2 = clnfVar.a();
                                this.a = 1024000000 / a2.z;
                                this.i.a(a2);
                                this.s = true;
                            } else {
                                this.e.h(10);
                            }
                            this.e.h(4);
                            int j5 = this.e.j(13) - 7;
                            if (this.n) {
                                j5 -= 2;
                            }
                            j(this.i, this.a, 0, j5);
                        }
                    }
                } else if (h(cmnkVar, this.f.a, 10)) {
                    this.j.d(this.f, 10);
                    this.f.f(6);
                    j(this.j, 0L, 10, this.f.u() + 10);
                }
            } else if (cmnkVar.d() != 0) {
                cmnj cmnjVar = this.e;
                cmnjVar.a[0] = cmnkVar.a[cmnkVar.b];
                cmnjVar.f(2);
                int j6 = this.e.j(4);
                int i20 = this.q;
                if (i20 == -1 || j6 == i20) {
                    if (!this.o) {
                        this.o = true;
                        this.p = this.r;
                        this.q = j6;
                    }
                    k();
                } else {
                    g();
                }
            }
        }
    }

    @Override // defpackage.clyz
    public final void e() {
    }

    public final void g() {
        this.o = false;
        i();
    }
}
