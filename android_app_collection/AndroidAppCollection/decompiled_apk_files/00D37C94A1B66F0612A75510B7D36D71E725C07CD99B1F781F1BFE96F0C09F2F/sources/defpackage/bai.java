package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: bai  reason: default package */
/* loaded from: classes2.dex */
public final class bai implements aze {
    private final byte[] a;
    private final pwu b;
    private final azj c;
    private azh d;
    private bab e;
    private int f;
    private Metadata g;
    private azn h;
    private int i;
    private int j;
    private int k;
    private long l;
    private ayx m;

    public bai() {
        this(null);
    }

    private final long a(pwu pwuVar, boolean z) {
        boolean z2;
        ptx.a(this.h);
        int i = pwuVar.b;
        while (i <= pwuVar.c - 16) {
            pwuVar.G(i);
            if (awz.d(pwuVar, this.h, this.j, this.c)) {
                pwuVar.G(i);
                return this.c.a;
            }
            i++;
        }
        if (!z) {
            pwuVar.G(i);
            return -1L;
        }
        while (true) {
            int i2 = pwuVar.c;
            if (i <= i2 - this.i) {
                pwuVar.G(i);
                try {
                    z2 = awz.d(pwuVar, this.h, this.j, this.c);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (pwuVar.b <= pwuVar.c && z2) {
                    pwuVar.G(i);
                    return this.c.a;
                }
                i++;
            } else {
                pwuVar.G(i2);
                return -1L;
            }
        }
    }

    private final void b() {
        long j = this.l;
        azn aznVar = this.h;
        int i = pxi.a;
        this.e.e((j * 1000000) / aznVar.e, 1, this.k, 0, null);
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.d = azhVar;
        this.e = azhVar.pT(0, 1);
        azhVar.b();
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        axm.c(azfVar, false);
        pwu pwuVar = new pwu(4);
        azfVar.j(pwuVar.a, 0, 4);
        return pwuVar.p() == 1716281667;
    }

    public bai(byte[] bArr) {
        this.a = new byte[42];
        this.b = new pwu(new byte[32768], 0);
        this.c = new azj();
        this.f = 0;
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f = 0;
        } else {
            ayx ayxVar = this.m;
            if (ayxVar != null) {
                ayxVar.b(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.l = j3;
        this.k = 0;
        this.b.C(0);
    }

    @Override // defpackage.aze
    public final int d(azf azfVar, azv azvVar) {
        azy azxVar;
        long j;
        long j2;
        long j3;
        int i = this.f;
        boolean z = true;
        if (i == 0) {
            azfVar.l();
            long d = azfVar.d();
            Metadata c = axm.c(azfVar, true);
            azfVar.m((int) (azfVar.d() - d));
            this.g = c;
            this.f = 1;
            return 0;
        } else if (i == 1) {
            azfVar.j(this.a, 0, 42);
            azfVar.l();
            this.f = 2;
            return 0;
        } else {
            int i2 = 3;
            int i3 = 4;
            if (i == 2) {
                pwu pwuVar = new pwu(4);
                azfVar.k(pwuVar.a, 0, 4);
                if (pwuVar.p() != 1716281667) {
                    throw pjq.a("Failed to read FLAC stream marker.", null);
                }
                this.f = 3;
                return 0;
            }
            int i4 = 7;
            if (i != 3) {
                if (i == 4) {
                    azfVar.l();
                    pwu pwuVar2 = new pwu(2);
                    azfVar.j(pwuVar2.a, 0, 2);
                    int m = pwuVar2.m();
                    if ((m >> 2) != 16382) {
                        azfVar.l();
                        throw pjq.a("First frame does not start with sync code.", null);
                    }
                    azfVar.l();
                    this.j = m;
                    azh azhVar = this.d;
                    int i5 = pxi.a;
                    aza azaVar = (aza) azfVar;
                    long j4 = azaVar.c;
                    long j5 = azaVar.b;
                    ptx.a(this.h);
                    final azn aznVar = this.h;
                    if (aznVar.k != null) {
                        azxVar = new azl(aznVar, j4);
                    } else if (j5 == -1 || aznVar.j <= 0) {
                        azxVar = new azx(aznVar.a());
                    } else {
                        int i6 = this.j;
                        aznVar.getClass();
                        ayu ayuVar = new ayu() { // from class: bag
                            @Override // defpackage.ayu
                            public final long a(long j6) {
                                return azn.this.b(j6);
                            }
                        };
                        bah bahVar = new bah(aznVar, i6);
                        long a = aznVar.a();
                        long j6 = aznVar.j;
                        int i7 = aznVar.d;
                        if (i7 > 0) {
                            j = j4;
                            j2 = j6;
                            j3 = ((i7 + aznVar.c) / 2) + 1;
                        } else {
                            j = j4;
                            j2 = j6;
                            int i8 = aznVar.a;
                            long j7 = 4096;
                            if (i8 == aznVar.b && i8 > 0) {
                                j7 = i8;
                            }
                            j3 = (((j7 * aznVar.g) * aznVar.h) / 8) + 64;
                        }
                        ayx ayxVar = new ayx(ayuVar, bahVar, a, j2, j, j5, j3, Math.max(6, aznVar.c));
                        this.m = ayxVar;
                        azxVar = ayxVar.a;
                    }
                    azhVar.ry(azxVar);
                    this.f = 5;
                    return 0;
                }
                ptx.a(this.e);
                ptx.a(this.h);
                ayx ayxVar2 = this.m;
                if (ayxVar2 != null && ayxVar2.c()) {
                    return this.m.a(azfVar, azvVar);
                }
                if (this.l == -1) {
                    azn aznVar2 = this.h;
                    azfVar.l();
                    azfVar.f(1);
                    byte[] bArr = new byte[1];
                    azfVar.j(bArr, 0, 1);
                    int i9 = bArr[0] & 1;
                    azfVar.f(2);
                    if (1 != i9) {
                        i4 = 6;
                    }
                    pwu pwuVar3 = new pwu(i4);
                    pwuVar3.F(asg.b(azfVar, pwuVar3.a, 0, i4));
                    azfVar.l();
                    azj azjVar = new azj();
                    if (1 != i9) {
                        z = false;
                    }
                    if (!awz.c(pwuVar3, aznVar2, z, azjVar)) {
                        throw pjq.a(null, null);
                    }
                    this.l = azjVar.a;
                    return 0;
                }
                pwu pwuVar4 = this.b;
                int i10 = pwuVar4.c;
                if (i10 < 32768) {
                    int g = azfVar.g(pwuVar4.a, i10, 32768 - i10);
                    if (g != -1) {
                        z = false;
                    }
                    if (!z) {
                        this.b.F(i10 + g);
                    } else if (this.b.a() == 0) {
                        b();
                        return -1;
                    }
                } else {
                    z = false;
                }
                pwu pwuVar5 = this.b;
                int i11 = pwuVar5.b;
                int i12 = this.k;
                int i13 = this.i;
                if (i12 < i13) {
                    pwuVar5.H(Math.min(i13 - i12, pwuVar5.a()));
                }
                long a2 = a(this.b, z);
                pwu pwuVar6 = this.b;
                int i14 = pwuVar6.b - i11;
                pwuVar6.G(i11);
                this.e.c(this.b, i14);
                this.k += i14;
                if (a2 != -1) {
                    b();
                    this.k = 0;
                    this.l = a2;
                }
                if (this.b.a() >= 16) {
                    return 0;
                }
                int a3 = this.b.a();
                pwu pwuVar7 = this.b;
                byte[] bArr2 = pwuVar7.a;
                System.arraycopy(bArr2, pwuVar7.b, bArr2, 0, a3);
                this.b.G(0);
                this.b.F(a3);
                return 0;
            }
            azk azkVar = new azk(this.h);
            while (true) {
                azfVar.l();
                pwt pwtVar = new pwt(new byte[i3]);
                azfVar.j(pwtVar.a, 0, i3);
                boolean n = pwtVar.n();
                int d2 = pwtVar.d(i4);
                int d3 = pwtVar.d(24) + i3;
                if (d2 == 0) {
                    byte[] bArr3 = new byte[38];
                    azfVar.k(bArr3, 0, 38);
                    azkVar.a = new azn(bArr3, i3);
                } else {
                    azn aznVar3 = azkVar.a;
                    if (aznVar3 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (d2 == i2) {
                        pwu pwuVar8 = new pwu(d3);
                        azfVar.k(pwuVar8.a, 0, d3);
                        azkVar.a = aznVar3.c(axm.b(pwuVar8));
                    } else if (d2 == i3) {
                        pwu pwuVar9 = new pwu(d3);
                        azfVar.k(pwuVar9.a, 0, d3);
                        pwuVar9.H(i3);
                        azkVar.a = new azn(aznVar3.a, aznVar3.b, aznVar3.c, aznVar3.d, aznVar3.e, aznVar3.g, aznVar3.h, aznVar3.j, aznVar3.k, aznVar3.f(azn.e(Arrays.asList(ja.J(pwuVar9, false, false).a), Collections.emptyList())));
                    } else if (d2 == 6) {
                        pwu pwuVar10 = new pwu(d3);
                        azfVar.k(pwuVar10.a, 0, d3);
                        pwuVar10.H(4);
                        int d4 = pwuVar10.d();
                        String w = pwuVar10.w(pwuVar10.d(), amoz.a);
                        String v = pwuVar10.v(pwuVar10.d());
                        int d5 = pwuVar10.d();
                        int d6 = pwuVar10.d();
                        int d7 = pwuVar10.d();
                        int d8 = pwuVar10.d();
                        int d9 = pwuVar10.d();
                        byte[] bArr4 = new byte[d9];
                        pwuVar10.B(bArr4, 0, d9);
                        azkVar.a = new azn(aznVar3.a, aznVar3.b, aznVar3.c, aznVar3.d, aznVar3.e, aznVar3.g, aznVar3.h, aznVar3.j, aznVar3.k, aznVar3.f(azn.e(Collections.emptyList(), Collections.singletonList(new PictureFrame(d4, w, v, d5, d6, d7, d8, bArr4)))));
                    } else {
                        azfVar.m(d3);
                    }
                }
                azn aznVar4 = azkVar.a;
                int i15 = pxi.a;
                this.h = aznVar4;
                if (n) {
                    ptx.a(aznVar4);
                    this.i = Math.max(this.h.c, 6);
                    this.e.rx(this.h.d(this.a, this.g));
                    this.f = 4;
                    return 0;
                }
                i2 = 3;
                i3 = 4;
                i4 = 7;
            }
        }
    }
}
