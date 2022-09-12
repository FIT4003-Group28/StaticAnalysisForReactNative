package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clym  reason: default package */
/* loaded from: classes5.dex */
public final class clym extends clyk {
    private clyl a;
    private int o;
    private boolean p;
    private clvo q;
    private clvm r;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clyk
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clyk
    public final long b(cmnk cmnkVar) {
        int i;
        int i2 = 0;
        byte b = cmnkVar.a[0];
        if ((b & 1) != 1) {
            clyl clylVar = this.a;
            if (!clylVar.c[(b >> 1) & (255 >>> (8 - clylVar.d))].a) {
                i = clylVar.a.e;
            } else {
                i = clylVar.a.f;
            }
            if (this.p) {
                i2 = (this.o + i) / 4;
            }
            long j = i2;
            int g = cmnkVar.g();
            int i3 = cmnkVar.c + 4;
            if (g >= i3) {
                cmnkVar.e(i3);
            } else {
                cmnkVar.b(Arrays.copyOf(cmnkVar.a, i3));
            }
            byte[] bArr = cmnkVar.a;
            int i4 = cmnkVar.c;
            bArr[i4 - 4] = (byte) (j & 255);
            bArr[i4 - 3] = (byte) ((j >>> 8) & 255);
            bArr[i4 - 2] = (byte) ((j >>> 16) & 255);
            bArr[i4 - 1] = (byte) ((j >>> 24) & 255);
            this.p = true;
            this.o = i;
            return j;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clyk
    public final boolean c(cmnk cmnkVar, long j, clyi clyiVar) {
        clyl clylVar;
        int i;
        if (this.a == null) {
            if (this.q == null) {
                clvp.c(1, cmnkVar, false);
                cmnkVar.w();
                int l = cmnkVar.l();
                int w = cmnkVar.w();
                int s = cmnkVar.s();
                int i2 = s <= 0 ? -1 : s;
                int s2 = cmnkVar.s();
                int i3 = s2 <= 0 ? -1 : s2;
                cmnkVar.s();
                int l2 = cmnkVar.l();
                double pow = Math.pow(2.0d, l2 & 15);
                double pow2 = Math.pow(2.0d, (l2 & 240) >> 4);
                cmnkVar.l();
                this.q = new clvo(l, w, i2, i3, (int) pow, (int) pow2, Arrays.copyOf(cmnkVar.a, cmnkVar.c));
            } else if (this.r != null) {
                int i4 = cmnkVar.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(cmnkVar.a, 0, bArr, 0, i4);
                int i5 = this.q.a;
                int i6 = 5;
                clvp.c(5, cmnkVar, false);
                int l3 = cmnkVar.l() + 1;
                clvl clvlVar = new clvl(cmnkVar.a);
                clvlVar.c(cmnkVar.b * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    if (i7 < l3) {
                        if (clvlVar.b(24) == 5653314) {
                            int b = clvlVar.b(16);
                            int b2 = clvlVar.b(24);
                            long[] jArr = new long[b2];
                            long j2 = 0;
                            if (!clvlVar.a()) {
                                boolean a = clvlVar.a();
                                int i10 = 0;
                                while (i10 < b2) {
                                    if (a) {
                                        if (clvlVar.a()) {
                                            jArr[i10] = clvlVar.b(i6) + 1;
                                        } else {
                                            jArr[i10] = 0;
                                        }
                                    } else {
                                        jArr[i10] = clvlVar.b(i6) + 1;
                                    }
                                    i10++;
                                    i6 = 5;
                                }
                            } else {
                                int b3 = clvlVar.b(5) + 1;
                                int i11 = 0;
                                while (i11 < b2) {
                                    int b4 = clvlVar.b(clvp.a(b2 - i11));
                                    int i12 = 0;
                                    while (i12 < b4 && i11 < b2) {
                                        jArr[i11] = b3;
                                        i11++;
                                        i12++;
                                        b2 = b2;
                                    }
                                    b3++;
                                    b2 = b2;
                                }
                            }
                            int i13 = b2;
                            int b5 = clvlVar.b(4);
                            if (b5 <= 2) {
                                if (b5 == 1) {
                                    i8 = b5;
                                } else if (b5 != 2) {
                                    i7++;
                                    i6 = 5;
                                }
                                clvlVar.c(32);
                                clvlVar.c(32);
                                int b6 = clvlVar.b(4) + 1;
                                clvlVar.c(1);
                                if (i8 != 1) {
                                    j2 = i13 * b;
                                } else if (b != 0) {
                                    double d = b;
                                    Double.isNaN(d);
                                    j2 = (long) Math.floor(Math.pow(i13, 1.0d / d));
                                }
                                clvlVar.c((int) (b6 * j2));
                                i7++;
                                i6 = 5;
                            } else {
                                StringBuilder sb = new StringBuilder(53);
                                sb.append("lookup type greater than 2 not decodable: ");
                                sb.append(b5);
                                throw new clob(sb.toString());
                            }
                        } else {
                            int i14 = clvlVar.a;
                            int i15 = clvlVar.b;
                            StringBuilder sb2 = new StringBuilder(66);
                            sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb2.append((i14 * 8) + i15);
                            throw new clob(sb2.toString());
                        }
                    } else {
                        int i16 = 6;
                        int b7 = clvlVar.b(6) + 1;
                        for (int i17 = 0; i17 < b7; i17++) {
                            if (clvlVar.b(16) != 0) {
                                throw new clob("placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i18 = 1;
                        int b8 = clvlVar.b(6) + 1;
                        int i19 = 0;
                        while (true) {
                            int i20 = 3;
                            if (i19 < b8) {
                                int b9 = clvlVar.b(i9);
                                if (b9 == 0) {
                                    int i21 = 8;
                                    clvlVar.c(8);
                                    clvlVar.c(16);
                                    clvlVar.c(16);
                                    clvlVar.c(6);
                                    clvlVar.c(8);
                                    int b10 = clvlVar.b(4) + 1;
                                    int i22 = 0;
                                    while (i22 < b10) {
                                        clvlVar.c(i21);
                                        i22++;
                                        i21 = 8;
                                    }
                                } else if (b9 == i18) {
                                    int b11 = clvlVar.b(5);
                                    int[] iArr = new int[b11];
                                    int i23 = -1;
                                    for (int i24 = 0; i24 < b11; i24++) {
                                        int b12 = clvlVar.b(4);
                                        iArr[i24] = b12;
                                        if (b12 > i23) {
                                            i23 = b12;
                                        }
                                    }
                                    int i25 = i23 + 1;
                                    int[] iArr2 = new int[i25];
                                    int i26 = 0;
                                    while (i26 < i25) {
                                        iArr2[i26] = clvlVar.b(i20) + 1;
                                        int b13 = clvlVar.b(2);
                                        if (b13 > 0) {
                                            i = 8;
                                            clvlVar.c(8);
                                        } else {
                                            i = 8;
                                        }
                                        int i27 = 0;
                                        for (int i28 = 1; i27 < (i28 << b13); i28 = 1) {
                                            clvlVar.c(i);
                                            i27++;
                                            i = 8;
                                        }
                                        i26++;
                                        i20 = 3;
                                    }
                                    clvlVar.c(2);
                                    int b14 = clvlVar.b(4);
                                    int i29 = 0;
                                    int i30 = 0;
                                    for (int i31 = 0; i31 < b11; i31++) {
                                        i29 += iArr2[iArr[i31]];
                                        while (i30 < i29) {
                                            clvlVar.c(b14);
                                            i30++;
                                        }
                                    }
                                } else {
                                    StringBuilder sb3 = new StringBuilder(52);
                                    sb3.append("floor type greater than 1 not decodable: ");
                                    sb3.append(b9);
                                    throw new clob(sb3.toString());
                                }
                                i19++;
                                i16 = 6;
                                i18 = 1;
                                i9 = 16;
                            } else {
                                int i32 = 1;
                                int b15 = clvlVar.b(i16) + 1;
                                int i33 = 0;
                                while (i33 < b15) {
                                    if (clvlVar.b(16) <= 2) {
                                        clvlVar.c(24);
                                        clvlVar.c(24);
                                        clvlVar.c(24);
                                        int b16 = clvlVar.b(i16) + i32;
                                        int i34 = 8;
                                        clvlVar.c(8);
                                        int[] iArr3 = new int[b16];
                                        for (int i35 = 0; i35 < b16; i35++) {
                                            iArr3[i35] = ((clvlVar.a() ? clvlVar.b(5) : 0) * 8) + clvlVar.b(3);
                                        }
                                        int i36 = 0;
                                        while (i36 < b16) {
                                            int i37 = 0;
                                            while (i37 < i34) {
                                                if ((iArr3[i36] & (1 << i37)) != 0) {
                                                    clvlVar.c(i34);
                                                }
                                                i37++;
                                                i34 = 8;
                                            }
                                            i36++;
                                            i34 = 8;
                                        }
                                        i33++;
                                        i16 = 6;
                                        i32 = 1;
                                    } else {
                                        throw new clob("residueType greater than 2 is not decodable");
                                    }
                                }
                                int b17 = clvlVar.b(i16) + 1;
                                for (int i38 = 0; i38 < b17; i38++) {
                                    int b18 = clvlVar.b(16);
                                    if (b18 != 0) {
                                        StringBuilder sb4 = new StringBuilder(52);
                                        sb4.append("mapping type other than 0 not supported: ");
                                        sb4.append(b18);
                                        sb4.toString();
                                    } else {
                                        int b19 = clvlVar.a() ? clvlVar.b(4) + 1 : 1;
                                        if (clvlVar.a()) {
                                            int b20 = clvlVar.b(8) + 1;
                                            for (int i39 = 0; i39 < b20; i39++) {
                                                int i40 = i5 - 1;
                                                clvlVar.c(clvp.a(i40));
                                                clvlVar.c(clvp.a(i40));
                                            }
                                        }
                                        if (clvlVar.b(2) != 0) {
                                            throw new clob("to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (b19 > 1) {
                                            for (int i41 = 0; i41 < i5; i41++) {
                                                clvlVar.c(4);
                                            }
                                        }
                                        for (int i42 = 0; i42 < b19; i42++) {
                                            clvlVar.c(8);
                                            clvlVar.c(8);
                                            clvlVar.c(8);
                                        }
                                    }
                                }
                                int b21 = clvlVar.b(6) + 1;
                                clvn[] clvnVarArr = new clvn[b21];
                                for (int i43 = 0; i43 < b21; i43++) {
                                    boolean a2 = clvlVar.a();
                                    clvlVar.b(16);
                                    clvlVar.b(16);
                                    clvlVar.b(8);
                                    clvnVarArr[i43] = new clvn(a2);
                                }
                                if (clvlVar.a()) {
                                    clylVar = new clyl(this.q, bArr, clvnVarArr, clvp.a(b21 - 1));
                                } else {
                                    throw new clob("framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            } else {
                this.r = clvp.b(cmnkVar, true, true);
            }
            clylVar = null;
            this.a = clylVar;
            if (clylVar == null) {
                return true;
            }
            clvo clvoVar = clylVar.a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(clvoVar.g);
            arrayList.add(this.a.b);
            clnf clnfVar = new clnf();
            clnfVar.k = "audio/vorbis";
            clnfVar.f = clvoVar.d;
            clnfVar.g = clvoVar.c;
            clnfVar.x = clvoVar.a;
            clnfVar.y = clvoVar.b;
            clnfVar.m = arrayList;
            clyiVar.a = clnfVar.a();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clyk
    public final void f(long j) {
        this.h = j;
        int i = 0;
        this.p = j != 0;
        clvo clvoVar = this.q;
        if (clvoVar != null) {
            i = clvoVar.e;
        }
        this.o = i;
    }
}
