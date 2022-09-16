package defpackage;

import android.util.Log;
import com.google.android.exoplayer.MediaFormat;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ozv  reason: default package */
/* loaded from: classes4.dex */
final class ozv extends ozs implements oye {
    private ozu e;
    private int g;
    private long h;
    private boolean i;
    private final ozo j = new ozo();
    private long k = -1;
    private ozw l;
    private long m;
    private long n;
    private long o;
    private long p;
    private pdo q;

    @Override // defpackage.ozs
    public final int a(oxn oxnVar, oxz oxzVar) {
        oxz oxzVar2;
        int i;
        int i2;
        int i3;
        ozq ozqVar;
        long j;
        ozq ozqVar2;
        long j2;
        int i4;
        long j3;
        oxn oxnVar2 = oxnVar;
        int i5 = 24;
        int i6 = 16;
        if (this.o == 0) {
            if (this.e == null) {
                this.m = oxnVar2.b;
                pct pctVar = this.a;
                if (this.l == null) {
                    this.b.a(oxnVar2, pctVar);
                    pae.b(1, pctVar, false);
                    pctVar.l();
                    int h = pctVar.h();
                    long l = pctVar.l();
                    pctVar.d();
                    int d = pctVar.d();
                    pctVar.d();
                    int h2 = pctVar.h();
                    double pow = Math.pow(2.0d, h2 & 15);
                    double pow2 = Math.pow(2.0d, (h2 & 240) >> 4);
                    pctVar.h();
                    this.l = new ozw(h, l, d, (int) pow, (int) pow2, Arrays.copyOf(pctVar.a, pctVar.c));
                    pctVar.v();
                }
                if (this.q == null) {
                    this.b.a(oxnVar2, pctVar);
                    pae.b(3, pctVar, false);
                    pctVar.r((int) pctVar.l()).length();
                    long l2 = pctVar.l();
                    String[] strArr = new String[(int) l2];
                    for (int i7 = 0; i7 < l2; i7++) {
                        String r = pctVar.r((int) pctVar.l());
                        strArr[i7] = r;
                        r.length();
                    }
                    if ((pctVar.h() & 1) != 0) {
                        this.q = new pdo();
                        pctVar.v();
                    } else {
                        throw new ouf("framing bit expected to be set");
                    }
                }
                this.b.a(oxnVar2, pctVar);
                int i8 = pctVar.c;
                byte[] bArr = new byte[i8];
                System.arraycopy(pctVar.a, 0, bArr, 0, i8);
                int i9 = this.l.a;
                int i10 = 5;
                pae.b(5, pctVar, false);
                int h3 = pctVar.h() + 1;
                ozt oztVar = new ozt(pctVar.a);
                oztVar.c(pctVar.b * 8);
                int i11 = 0;
                while (i11 < h3) {
                    if (oztVar.b(i5) == 5653314) {
                        int b = oztVar.b(i6);
                        int b2 = oztVar.b(i5);
                        long[] jArr = new long[b2];
                        if (!oztVar.d()) {
                            boolean d2 = oztVar.d();
                            int i12 = 0;
                            while (i12 < b2) {
                                if (d2) {
                                    if (oztVar.d()) {
                                        jArr[i12] = oztVar.b(i10) + 1;
                                    } else {
                                        jArr[i12] = 0;
                                    }
                                } else {
                                    jArr[i12] = oztVar.b(5) + 1;
                                }
                                i12++;
                                i10 = 5;
                            }
                        } else {
                            int b3 = oztVar.b(5) + 1;
                            int i13 = 0;
                            while (i13 < b2) {
                                int b4 = oztVar.b(pae.a(b2 - i13));
                                for (int i14 = 0; i14 < b4 && i13 < b2; i14++) {
                                    jArr[i13] = b3;
                                    i13++;
                                }
                                b3++;
                            }
                        }
                        int b5 = oztVar.b(4);
                        if (b5 <= 2) {
                            if (b5 != 1) {
                                if (b5 == 2) {
                                    b5 = 2;
                                } else {
                                    i11++;
                                    i5 = 24;
                                    i6 = 16;
                                    i10 = 5;
                                }
                            }
                            oztVar.c(32);
                            oztVar.c(32);
                            int b6 = oztVar.b(4) + 1;
                            oztVar.c(1);
                            if (b5 != 1) {
                                j3 = b2 * b;
                            } else if (b != 0) {
                                double d3 = b;
                                Double.isNaN(d3);
                                j3 = (long) Math.floor(Math.pow(b2, 1.0d / d3));
                            } else {
                                j3 = 0;
                            }
                            oztVar.c((int) (j3 * b6));
                            i11++;
                            i5 = 24;
                            i6 = 16;
                            i10 = 5;
                        } else {
                            StringBuilder sb = new StringBuilder(53);
                            sb.append("lookup type greater than 2 not decodable: ");
                            sb.append(b5);
                            throw new ouf(sb.toString());
                        }
                    } else {
                        int a = oztVar.a();
                        StringBuilder sb2 = new StringBuilder(66);
                        sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb2.append(a);
                        throw new ouf(sb2.toString());
                    }
                }
                int i15 = 6;
                int b7 = oztVar.b(6) + 1;
                for (int i16 = 0; i16 < b7; i16++) {
                    if (oztVar.b(16) != 0) {
                        throw new ouf("placeholder of time domain transforms not zeroed out");
                    }
                }
                int i17 = 1;
                int b8 = oztVar.b(6) + 1;
                int i18 = 0;
                while (i18 < b8) {
                    int b9 = oztVar.b(16);
                    if (b9 == 0) {
                        int i19 = 8;
                        oztVar.c(8);
                        oztVar.c(16);
                        oztVar.c(16);
                        oztVar.c(6);
                        oztVar.c(8);
                        int b10 = oztVar.b(4) + 1;
                        int i20 = 0;
                        while (i20 < b10) {
                            oztVar.c(i19);
                            i20++;
                            i19 = 8;
                        }
                    } else if (b9 == i17) {
                        int b11 = oztVar.b(5);
                        int[] iArr = new int[b11];
                        int i21 = -1;
                        for (int i22 = 0; i22 < b11; i22++) {
                            int b12 = oztVar.b(4);
                            iArr[i22] = b12;
                            if (b12 > i21) {
                                i21 = b12;
                            }
                        }
                        int i23 = i21 + 1;
                        int[] iArr2 = new int[i23];
                        for (int i24 = 0; i24 < i23; i24++) {
                            int i25 = 1;
                            iArr2[i24] = oztVar.b(3) + 1;
                            int b13 = oztVar.b(2);
                            if (b13 > 0) {
                                i4 = 8;
                                oztVar.c(8);
                            } else {
                                i4 = 8;
                            }
                            int i26 = 0;
                            while (i26 < (i25 << b13)) {
                                oztVar.c(i4);
                                i26++;
                                i25 = 1;
                                i4 = 8;
                            }
                        }
                        oztVar.c(2);
                        int b14 = oztVar.b(4);
                        int i27 = 0;
                        int i28 = 0;
                        for (int i29 = 0; i29 < b11; i29++) {
                            i27 += iArr2[iArr[i29]];
                            while (i28 < i27) {
                                oztVar.c(b14);
                                i28++;
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder(52);
                        sb3.append("floor type greater than 1 not decodable: ");
                        sb3.append(b9);
                        throw new ouf(sb3.toString());
                    }
                    i18++;
                    i15 = 6;
                    i17 = 1;
                }
                int i30 = 1;
                int b15 = oztVar.b(i15) + 1;
                int i31 = 0;
                while (i31 < b15) {
                    if (oztVar.b(16) <= 2) {
                        oztVar.c(24);
                        oztVar.c(24);
                        oztVar.c(24);
                        int b16 = oztVar.b(i15) + i30;
                        int i32 = 8;
                        oztVar.c(8);
                        int[] iArr3 = new int[b16];
                        for (int i33 = 0; i33 < b16; i33++) {
                            iArr3[i33] = ((oztVar.d() ? oztVar.b(5) : 0) * 8) + oztVar.b(3);
                        }
                        int i34 = 0;
                        while (i34 < b16) {
                            int i35 = 0;
                            while (i35 < i32) {
                                if ((iArr3[i34] & (1 << i35)) != 0) {
                                    oztVar.c(i32);
                                }
                                i35++;
                                i32 = 8;
                            }
                            i34++;
                            i32 = 8;
                        }
                        i31++;
                        i15 = 6;
                        i30 = 1;
                    } else {
                        throw new ouf("residueType greater than 2 is not decodable");
                    }
                }
                int b17 = oztVar.b(i15) + 1;
                for (int i36 = 0; i36 < b17; i36++) {
                    int b18 = oztVar.b(16);
                    if (b18 == 0) {
                        int b19 = oztVar.d() ? oztVar.b(4) + 1 : 1;
                        if (oztVar.d()) {
                            int b20 = oztVar.b(8) + 1;
                            for (int i37 = 0; i37 < b20; i37++) {
                                int i38 = i9 - 1;
                                oztVar.c(pae.a(i38));
                                oztVar.c(pae.a(i38));
                            }
                        }
                        if (oztVar.b(2) != 0) {
                            throw new ouf("to reserved bits must be zero after mapping coupling steps");
                        }
                        if (b19 > 1) {
                            for (int i39 = 0; i39 < i9; i39++) {
                                oztVar.c(4);
                            }
                        }
                        for (int i40 = 0; i40 < b19; i40++) {
                            oztVar.c(8);
                            oztVar.c(8);
                            oztVar.c(8);
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(52);
                        sb4.append("mapping type other than 0 not supported: ");
                        sb4.append(b18);
                        Log.e("VorbisUtil", sb4.toString());
                    }
                }
                int b21 = oztVar.b(6) + 1;
                vcb[] vcbVarArr = new vcb[b21];
                for (int i41 = 0; i41 < b21; i41++) {
                    boolean d4 = oztVar.d();
                    oztVar.b(16);
                    oztVar.b(16);
                    oztVar.b(8);
                    vcbVarArr[i41] = new vcb(d4);
                }
                if (oztVar.d()) {
                    pctVar.v();
                    this.e = new ozu(this.l, bArr, vcbVarArr, pae.a(b21 - 1), null);
                    oxnVar2 = oxnVar;
                    this.n = oxnVar2.c;
                    this.d.pS(this);
                    if (this.m != -1) {
                        oxzVar.a = Math.max(0L, oxnVar2.b - 8000);
                        return 1;
                    }
                    oxzVar2 = oxzVar;
                } else {
                    throw new ouf("framing bit after modes not set as expected");
                }
            } else {
                oxzVar2 = oxzVar;
            }
            if (this.m == -1) {
                j2 = -1;
            } else {
                ozn oznVar = this.b;
                pce.b(oxnVar2.b != -1);
                ozr.b(oxnVar);
                oznVar.a.a();
                while (true) {
                    ozqVar2 = oznVar.a;
                    if ((ozqVar2.a & 4) == 4 || oxnVar2.c >= oxnVar2.b) {
                        break;
                    }
                    ozr.c(oxnVar2, ozqVar2, oznVar.b, false);
                    ozq ozqVar3 = oznVar.a;
                    oxnVar2.j(ozqVar3.d + ozqVar3.e);
                }
                j2 = ozqVar2.b;
            }
            this.o = j2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.e.a.f);
            arrayList.add(this.e.b);
            long j4 = this.m == -1 ? -1L : (this.o * 1000000) / this.e.a.b;
            this.p = j4;
            oyf oyfVar = this.c;
            ozw ozwVar = this.e.a;
            oyfVar.d(MediaFormat.b(null, "audio/vorbis", ozwVar.c, 65025, j4, ozwVar.a, (int) ozwVar.b, arrayList, null));
            long j5 = this.m;
            if (j5 != -1) {
                ozo ozoVar = this.j;
                long j6 = j5 - this.n;
                long j7 = this.o;
                pce.b(j6 > 0 && j7 > 0);
                ozoVar.c = j6;
                ozoVar.d = j7;
                oxzVar2.a = this.n;
                return 1;
            }
        } else {
            oxzVar2 = oxzVar;
        }
        if (!this.i && this.k > -1) {
            ozr.b(oxnVar);
            ozo ozoVar2 = this.j;
            long j8 = this.k;
            pce.d((ozoVar2.c == -1 || ozoVar2.d == 0) ? false : true);
            ozr.c(oxnVar2, ozoVar2.a, ozoVar2.b, false);
            long j9 = j8 - ozoVar2.a.b;
            if (j9 <= 0 || j9 > 72000) {
                j = ((j9 * ozoVar2.c) / ozoVar2.d) + (oxnVar2.c - ((ozqVar.e + ozqVar.d) * (j9 <= 0 ? 2 : 1)));
            } else {
                oxnVar.i();
                j = -1;
            }
            if (j != -1) {
                oxzVar2.a = j;
                return 1;
            }
            ozn oznVar2 = this.b;
            long j10 = this.k;
            ozr.b(oxnVar);
            ozr.c(oxnVar2, oznVar2.a, oznVar2.b, false);
            while (true) {
                ozq ozqVar4 = oznVar2.a;
                if (ozqVar4.b >= j10) {
                    break;
                }
                oxnVar2.j(ozqVar4.d + ozqVar4.e);
                ozq ozqVar5 = oznVar2.a;
                oznVar2.d = ozqVar5.b;
                ozr.c(oxnVar2, ozqVar5, oznVar2.b, false);
            }
            if (oznVar2.d == 0) {
                throw new ouf();
            }
            oxnVar.i();
            long j11 = oznVar2.d;
            oznVar2.d = 0L;
            oznVar2.c = -1;
            this.h = j11;
            this.g = this.l.d;
            this.i = true;
        }
        if (this.b.a(oxnVar2, this.a)) {
            byte b22 = this.a.a[0];
            if ((b22 & 1) != 1) {
                ozu ozuVar = this.e;
                if (!ozuVar.d[ozr.d(b22, ozuVar.c)].a) {
                    i = ozuVar.a.d;
                } else {
                    i = ozuVar.a.e;
                }
                if (this.i) {
                    i2 = 4;
                    i3 = (this.g + i) / 4;
                } else {
                    i2 = 4;
                    i3 = 0;
                }
                long j12 = i3;
                if (this.h + j12 >= this.k) {
                    pct pctVar2 = this.a;
                    pctVar2.y(pctVar2.c + i2);
                    byte[] bArr2 = pctVar2.a;
                    int i42 = pctVar2.c;
                    bArr2[i42 - 4] = (byte) (j12 & 255);
                    bArr2[i42 - 3] = (byte) ((j12 >>> 8) & 255);
                    bArr2[i42 - 2] = (byte) ((j12 >>> 16) & 255);
                    bArr2[i42 - 1] = (byte) (255 & (j12 >>> 24));
                    long j13 = (this.h * 1000000) / this.e.a.b;
                    oyf oyfVar2 = this.c;
                    pct pctVar3 = this.a;
                    oyfVar2.f(pctVar3, pctVar3.c);
                    this.c.g(j13, 1, this.a.c, 0, null);
                    this.k = -1L;
                }
                this.i = true;
                this.h += j12;
                this.g = i;
            }
            this.a.v();
            return 0;
        }
        return -1;
    }

    @Override // defpackage.oye
    public final long b(long j) {
        if (j == 0) {
            this.k = -1L;
            return this.n;
        }
        this.k = (this.e.a.b * j) / 1000000;
        long j2 = this.n;
        return Math.max(j2, (((this.m - j2) * j) / this.p) - 4000);
    }

    @Override // defpackage.oye
    public final boolean c() {
        return (this.e == null || this.m == -1) ? false : true;
    }

    @Override // defpackage.ozs
    public final void d() {
        super.d();
        this.g = 0;
        this.h = 0L;
        this.i = false;
    }
}
