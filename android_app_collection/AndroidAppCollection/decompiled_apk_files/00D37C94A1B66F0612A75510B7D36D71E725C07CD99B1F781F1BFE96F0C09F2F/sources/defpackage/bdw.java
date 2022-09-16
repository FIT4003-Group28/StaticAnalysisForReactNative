package defpackage;

import android.util.SparseArray;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: bdw  reason: default package */
/* loaded from: classes2.dex */
public final class bdw implements aze {
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private azh i;
    private boolean j;
    private ayx k;
    private final pxg a = new pxg(0);
    private final pwu c = new pwu(4096);
    private final SparseArray b = new SparseArray();
    private final bdu d = new bdu();

    @Override // defpackage.aze
    public final int d(azf azfVar, azv azvVar) {
        long j;
        long j2;
        long j3;
        bdd bdfVar;
        ptx.b(this.i);
        aza azaVar = (aza) azfVar;
        long j4 = azaVar.b;
        long j5 = -9223372036854775807L;
        if (j4 != -1) {
            bdu bduVar = this.d;
            if (!bduVar.c) {
                if (!bduVar.e) {
                    int min = (int) Math.min(20000L, j4);
                    long j6 = j4 - min;
                    if (azaVar.c != j6) {
                        azvVar.a = j6;
                        return 1;
                    }
                    bduVar.b.C(min);
                    azfVar.l();
                    azfVar.j(bduVar.b.a, 0, min);
                    pwu pwuVar = bduVar.b;
                    int i = pwuVar.b;
                    int i2 = pwuVar.c - 4;
                    while (true) {
                        if (i2 < i) {
                            break;
                        }
                        if (bdu.c(pwuVar.a, i2) == 442) {
                            pwuVar.G(i2 + 4);
                            long a = bdu.a(pwuVar);
                            if (a != -9223372036854775807L) {
                                j5 = a;
                                break;
                            }
                        }
                        i2--;
                    }
                    bduVar.g = j5;
                    bduVar.e = true;
                } else if (bduVar.g == -9223372036854775807L) {
                    bduVar.b(azfVar);
                } else if (!bduVar.d) {
                    int min2 = (int) Math.min(20000L, j4);
                    if (azaVar.c != 0) {
                        azvVar.a = 0L;
                        return 1;
                    }
                    bduVar.b.C(min2);
                    azfVar.l();
                    azfVar.j(bduVar.b.a, 0, min2);
                    pwu pwuVar2 = bduVar.b;
                    int i3 = pwuVar2.b;
                    int i4 = pwuVar2.c;
                    while (true) {
                        if (i3 >= i4 - 3) {
                            break;
                        }
                        if (bdu.c(pwuVar2.a, i3) == 442) {
                            pwuVar2.G(i3 + 4);
                            long a2 = bdu.a(pwuVar2);
                            if (a2 != -9223372036854775807L) {
                                j5 = a2;
                                break;
                            }
                        }
                        i3++;
                    }
                    bduVar.f = j5;
                    bduVar.d = true;
                } else {
                    long j7 = bduVar.f;
                    if (j7 == -9223372036854775807L) {
                        bduVar.b(azfVar);
                    } else {
                        bduVar.h = bduVar.a.b(bduVar.g) - bduVar.a.b(j7);
                        bduVar.b(azfVar);
                    }
                }
                return 0;
            }
        }
        if (!this.j) {
            this.j = true;
            bdu bduVar2 = this.d;
            long j8 = bduVar2.h;
            if (j8 != -9223372036854775807L) {
                j = 0;
                j2 = j4;
                ayx ayxVar = new ayx(new ays(), new bdt(bduVar2.a), j8, j8 + 1, 0L, j4, 188L, 1000);
                this.k = ayxVar;
                this.i.ry(ayxVar.a);
            } else {
                j = 0;
                j2 = j4;
                this.i.ry(new azx(j8));
            }
        } else {
            j = 0;
            j2 = j4;
        }
        ayx ayxVar2 = this.k;
        if (ayxVar2 == null || !ayxVar2.c()) {
            azfVar.l();
            long d = j2 != -1 ? j2 - azfVar.d() : -1L;
            if ((d != -1 && d < 4) || !azfVar.o(this.c.a, 0, 4, true)) {
                return -1;
            }
            this.c.G(0);
            int d2 = this.c.d();
            if (d2 == 441) {
                return -1;
            }
            if (d2 == 442) {
                azfVar.j(this.c.a, 0, 10);
                this.c.G(9);
                azfVar.m((this.c.i() & 7) + 14);
                return 0;
            } else if (d2 == 443) {
                azfVar.j(this.c.a, 0, 2);
                this.c.G(0);
                azfVar.m(this.c.m() + 6);
                return 0;
            } else if ((d2 >> 8) != 1) {
                azfVar.m(1);
                return 0;
            } else {
                int i5 = d2 & PrivateKeyType.INVALID;
                bdv bdvVar = (bdv) this.b.get(i5);
                if (!this.e) {
                    if (bdvVar == null) {
                        bdd bddVar = null;
                        if (i5 == 189) {
                            bddVar = new bcw();
                            this.f = true;
                            this.h = azaVar.c;
                        } else {
                            if ((i5 & 224) == 192) {
                                bdfVar = new bdp(null);
                                this.f = true;
                                this.h = azaVar.c;
                            } else if ((i5 & 240) == 224) {
                                bdfVar = new bdf(null);
                                this.g = true;
                                this.h = azaVar.c;
                            }
                            bddVar = bdfVar;
                        }
                        if (bddVar != null) {
                            bddVar.b(this.i, new bef(i5, 256));
                            bdvVar = new bdv(bddVar, this.a);
                            this.b.put(i5, bdvVar);
                        }
                    }
                    long j9 = 1048576;
                    if (this.f && this.g) {
                        j9 = this.h + 8192;
                    }
                    if (azaVar.c > j9) {
                        this.e = true;
                        this.i.b();
                    }
                }
                azfVar.j(this.c.a, 0, 2);
                this.c.G(0);
                int m = this.c.m() + 6;
                if (bdvVar == null) {
                    azfVar.m(m);
                } else {
                    this.c.C(m);
                    azfVar.k(this.c.a, 0, m);
                    this.c.G(6);
                    pwu pwuVar3 = this.c;
                    pwuVar3.B(bdvVar.c.a, 0, 3);
                    bdvVar.c.j(0);
                    bdvVar.c.l(8);
                    bdvVar.d = bdvVar.c.n();
                    bdvVar.e = bdvVar.c.n();
                    bdvVar.c.l(6);
                    pwuVar3.B(bdvVar.c.a, 0, bdvVar.c.d(8));
                    bdvVar.c.j(0);
                    if (bdvVar.d) {
                        bdvVar.c.l(4);
                        int d3 = bdvVar.c.d(3);
                        bdvVar.c.l(1);
                        int d4 = bdvVar.c.d(15);
                        bdvVar.c.l(1);
                        long d5 = (d3 << 30) | (d4 << 15) | bdvVar.c.d(15);
                        bdvVar.c.l(1);
                        if (!bdvVar.f && bdvVar.e) {
                            bdvVar.c.l(4);
                            int d6 = bdvVar.c.d(3);
                            bdvVar.c.l(1);
                            int d7 = bdvVar.c.d(15);
                            bdvVar.c.l(1);
                            int d8 = bdvVar.c.d(15);
                            bdvVar.c.l(1);
                            bdvVar.b.b((d6 << 30) | (d7 << 15) | d8);
                            bdvVar.f = true;
                        }
                        j3 = bdvVar.b.b(d5);
                    } else {
                        j3 = j;
                    }
                    bdvVar.a.d(j3, 4);
                    bdvVar.a.a(pwuVar3);
                    bdvVar.a.c();
                    pwu pwuVar4 = this.c;
                    pwuVar4.F(pwuVar4.b());
                }
                return 0;
            }
        }
        return this.k.a(azfVar, azvVar);
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.i = azhVar;
    }

    @Override // defpackage.aze
    public final void f() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r4 != r6) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[LOOP:0: B:15:0x0031->B:17:0x0039, LOOP_END] */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r4, long r6) {
        /*
            r3 = this;
            pxg r4 = r3.a
            long r4 = r4.e()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L23
            pxg r4 = r3.a
            long r4 = r4.c()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L28
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L28
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L28
        L23:
            pxg r4 = r3.a
            r4.f(r6)
        L28:
            ayx r4 = r3.k
            r5 = 0
            if (r4 == 0) goto L30
            r4.b(r6)
        L30:
            r4 = 0
        L31:
            android.util.SparseArray r6 = r3.b
            int r6 = r6.size()
            if (r4 >= r6) goto L4b
            android.util.SparseArray r6 = r3.b
            java.lang.Object r6 = r6.valueAt(r4)
            bdv r6 = (defpackage.bdv) r6
            r6.f = r5
            bdd r6 = r6.a
            r6.e()
            int r4 = r4 + 1
            goto L31
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdw.g(long, long):void");
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        byte[] bArr = new byte[14];
        azfVar.j(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            azfVar.f(bArr[13] & 7);
            azfVar.j(bArr, 0, 3);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }
}
