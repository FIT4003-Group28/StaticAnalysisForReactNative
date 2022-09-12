package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: clzv  reason: default package */
/* loaded from: classes5.dex */
public final class clzv implements clun {
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private clzr i;
    private clup j;
    private boolean k;
    private final cmnv a = new cmnv(0);
    private final cmnk c = new cmnk(4096);
    private final SparseArray<clzu> b = new SparseArray<>();
    private final clzs d = new clzs();

    static {
        int i = clzt.a;
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.j = clupVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r4 != r6) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[LOOP:0: B:14:0x0031->B:16:0x0039, LOOP_END] */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r4, long r6) {
        /*
            r3 = this;
            cmnv r4 = r3.a
            long r4 = r4.b()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L1e
        L10:
            cmnv r4 = r3.a
            long r4 = r4.a
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L28
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L28
        L1e:
            cmnv r4 = r3.a
            r4.c()
            cmnv r4 = r3.a
            r4.a(r6)
        L28:
            clzr r4 = r3.i
            r5 = 0
            if (r4 == 0) goto L30
            r4.a(r6)
        L30:
            r4 = 0
        L31:
            android.util.SparseArray<clzu> r6 = r3.b
            int r6 = r6.size()
            if (r4 >= r6) goto L4b
            android.util.SparseArray<clzu> r6 = r3.b
            java.lang.Object r6 = r6.valueAt(r4)
            clzu r6 = (defpackage.clzu) r6
            r6.f = r5
            clyz r6 = r6.a
            r6.a()
            int r4 = r4 + 1
            goto L31
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clzv.e(long, long):void");
    }

    @Override // defpackage.clun
    public final boolean f(cluk clukVar) {
        byte[] bArr = new byte[14];
        clukVar.f(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            clukVar.h(bArr[13] & 7);
            clukVar.f(bArr, 0, 3);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // defpackage.clun
    public final int g(cluk clukVar, clvd clvdVar) {
        int i;
        ?? r13;
        long j;
        clyz clzbVar;
        cmmn.e(this.j);
        long j2 = clukVar.b;
        long j3 = -9223372036854775807L;
        if (j2 != -1) {
            clzs clzsVar = this.d;
            if (!clzsVar.c) {
                if (!clzsVar.e) {
                    int min = (int) Math.min(20000L, j2);
                    long j4 = j2 - min;
                    if (clukVar.c != j4) {
                        clvdVar.a = j4;
                        return 1;
                    }
                    clzsVar.b.a(min);
                    clukVar.i();
                    clukVar.f(clzsVar.b.a, 0, min);
                    cmnk cmnkVar = clzsVar.b;
                    int i2 = cmnkVar.b;
                    int i3 = cmnkVar.c - 4;
                    while (true) {
                        if (i3 < i2) {
                            break;
                        }
                        if (clzs.c(cmnkVar.a, i3) == 442) {
                            cmnkVar.f(i3 + 4);
                            long a = clzs.a(cmnkVar);
                            if (a != -9223372036854775807L) {
                                j3 = a;
                                break;
                            }
                        }
                        i3--;
                    }
                    clzsVar.g = j3;
                    clzsVar.e = true;
                } else if (clzsVar.g == -9223372036854775807L) {
                    clzsVar.b(clukVar);
                } else if (!clzsVar.d) {
                    int min2 = (int) Math.min(20000L, j2);
                    if (clukVar.c != 0) {
                        clvdVar.a = 0L;
                        return 1;
                    }
                    clzsVar.b.a(min2);
                    clukVar.i();
                    clukVar.f(clzsVar.b.a, 0, min2);
                    cmnk cmnkVar2 = clzsVar.b;
                    int i4 = cmnkVar2.b;
                    int i5 = cmnkVar2.c;
                    while (true) {
                        if (i4 >= i5 - 3) {
                            break;
                        }
                        if (clzs.c(cmnkVar2.a, i4) == 442) {
                            cmnkVar2.f(i4 + 4);
                            long a2 = clzs.a(cmnkVar2);
                            if (a2 != -9223372036854775807L) {
                                j3 = a2;
                                break;
                            }
                        }
                        i4++;
                    }
                    clzsVar.f = j3;
                    clzsVar.d = true;
                } else {
                    long j5 = clzsVar.f;
                    if (j5 == -9223372036854775807L) {
                        clzsVar.b(clukVar);
                    } else {
                        clzsVar.h = clzsVar.a.d(clzsVar.g) - clzsVar.a.d(j5);
                        clzsVar.b(clukVar);
                    }
                }
                return 0;
            }
        }
        if (!this.k) {
            this.k = true;
            clzs clzsVar2 = this.d;
            long j6 = clzsVar2.h;
            if (j6 != -9223372036854775807L) {
                i = 0;
                r13 = 1;
                clzr clzrVar = new clzr(clzsVar2.a, j6, j2);
                this.i = clzrVar;
                this.j.b(clzrVar.a);
            } else {
                i = 0;
                r13 = 1;
                this.j.b(new clvf(j6));
            }
        } else {
            i = 0;
            r13 = 1;
        }
        clzr clzrVar2 = this.i;
        if (clzrVar2 == null || !clzrVar2.b()) {
            clukVar.i();
            long j7 = j2 != -1 ? j2 - clukVar.j() : -1L;
            if ((j7 != -1 && j7 < 4) || !clukVar.e(this.c.a, i, 4, r13)) {
                return -1;
            }
            this.c.f(i);
            int r = this.c.r();
            if (r == 441) {
                return -1;
            }
            if (r == 442) {
                clukVar.f(this.c.a, i, 10);
                this.c.f(9);
                clukVar.d((this.c.l() & 7) + 14);
                return i;
            } else if (r == 443) {
                clukVar.f(this.c.a, i, 2);
                this.c.f(i);
                clukVar.d(this.c.m() + 6);
                return i;
            } else if ((r >> 8) != r13) {
                clukVar.d(r13);
                return i;
            } else {
                int i6 = r & 255;
                clzu clzuVar = this.b.get(i6);
                if (!this.e) {
                    if (clzuVar == null) {
                        clyz clyzVar = null;
                        if (i6 == 189) {
                            clyzVar = new clyp();
                            this.f = r13;
                            this.h = clukVar.c;
                        } else {
                            if ((i6 & 224) == 192) {
                                clzbVar = new clzm(null);
                                this.f = r13;
                                this.h = clukVar.c;
                            } else if ((i6 & 240) == 224) {
                                clzbVar = new clzb(null);
                                this.g = r13;
                                this.h = clukVar.c;
                            }
                            clyzVar = clzbVar;
                        }
                        if (clyzVar != null) {
                            clyzVar.b(this.j, new cmaj(i6, 256));
                            clzuVar = new clzu(clyzVar, this.a);
                            this.b.put(i6, clzuVar);
                        }
                    }
                    long j8 = 1048576;
                    if (this.f && this.g) {
                        j8 = this.h + 8192;
                    }
                    if (clukVar.c > j8) {
                        this.e = r13;
                        this.j.RS();
                    }
                }
                clukVar.f(this.c.a, i, 2);
                this.c.f(i);
                int m = this.c.m() + 6;
                if (clzuVar == null) {
                    clukVar.d(m);
                } else {
                    this.c.a(m);
                    clukVar.c(this.c.a, i, m);
                    this.c.f(6);
                    cmnk cmnkVar3 = this.c;
                    cmnkVar3.j(clzuVar.c.a, i, 3);
                    clzuVar.c.f(i);
                    clzuVar.c.h(8);
                    clzuVar.d = clzuVar.c.i();
                    clzuVar.e = clzuVar.c.i();
                    clzuVar.c.h(6);
                    cmnkVar3.j(clzuVar.c.a, i, clzuVar.c.j(8));
                    clzuVar.c.f(i);
                    if (clzuVar.d) {
                        clzuVar.c.h(4);
                        int j9 = clzuVar.c.j(3);
                        cmnj cmnjVar = clzuVar.c;
                        int i7 = r13 == true ? 1 : 0;
                        int i8 = r13 == true ? 1 : 0;
                        int i9 = r13 == true ? 1 : 0;
                        cmnjVar.h(i7);
                        int j10 = clzuVar.c.j(15);
                        clzuVar.c.h(r13);
                        long j11 = (j9 << 30) | (j10 << 15) | clzuVar.c.j(15);
                        clzuVar.c.h(r13);
                        if (!clzuVar.f && clzuVar.e) {
                            clzuVar.c.h(4);
                            int j12 = clzuVar.c.j(3);
                            clzuVar.c.h(r13);
                            int j13 = clzuVar.c.j(15);
                            clzuVar.c.h(r13);
                            int j14 = clzuVar.c.j(15);
                            clzuVar.c.h(r13);
                            clzuVar.b.d((j13 << 15) | (j12 << 30) | j14);
                            clzuVar.f = r13;
                        }
                        j = clzuVar.b.d(j11);
                    } else {
                        j = 0;
                    }
                    clzuVar.a.c(j, 4);
                    clzuVar.a.d(cmnkVar3);
                    clzuVar.a.e();
                    cmnk cmnkVar4 = this.c;
                    cmnkVar4.e(cmnkVar4.g());
                }
                return i;
            }
        }
        return this.i.c(clukVar, clvdVar);
    }
}
