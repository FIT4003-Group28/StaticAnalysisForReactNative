package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: bct  reason: default package */
/* loaded from: classes2.dex */
final class bct extends bcr {
    private bcs a;
    private int o;
    private boolean p;
    private bae q;
    private bad r;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcr
    public final long a(pwu pwuVar) {
        int i = 0;
        byte b = pwuVar.a[0];
        if ((b & 1) != 1) {
            bcs bcsVar = this.a;
            ptx.b(bcsVar);
            int i2 = !bcsVar.d[(b >> 1) & (PrivateKeyType.INVALID >>> (8 - bcsVar.c))].a ? bcsVar.a.e : bcsVar.a.f;
            if (this.p) {
                i = (this.o + i2) / 4;
            }
            long j = i;
            int b2 = pwuVar.b();
            int i3 = pwuVar.c + 4;
            if (b2 >= i3) {
                pwuVar.F(i3);
            } else {
                pwuVar.D(Arrays.copyOf(pwuVar.a, i3));
            }
            byte[] bArr = pwuVar.a;
            int i4 = pwuVar.c;
            bArr[i4 - 4] = (byte) (j & 255);
            bArr[i4 - 3] = (byte) ((j >>> 8) & 255);
            bArr[i4 - 2] = (byte) ((j >>> 16) & 255);
            bArr[i4 - 1] = (byte) ((j >>> 24) & 255);
            this.p = true;
            this.o = i2;
            return j;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcr
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcr
    public final boolean c(pwu pwuVar, long j, bcp bcpVar) {
        bcs bcsVar;
        int i;
        int i2;
        int i3;
        bae baeVar;
        int i4;
        bae baeVar2;
        if (this.a == null) {
            bae baeVar3 = this.q;
            int i5 = 4;
            if (baeVar3 == null) {
                ja.K(1, pwuVar, false);
                pwuVar.f();
                int i6 = pwuVar.i();
                int f = pwuVar.f();
                int e = pwuVar.e();
                int i7 = e <= 0 ? -1 : e;
                int e2 = pwuVar.e();
                int i8 = e2 <= 0 ? -1 : e2;
                pwuVar.e();
                int i9 = pwuVar.i();
                double pow = Math.pow(2.0d, i9 & 15);
                double pow2 = Math.pow(2.0d, (i9 & 240) >> 4);
                pwuVar.i();
                this.q = new bae(i6, f, i7, i8, (int) pow, (int) pow2, Arrays.copyOf(pwuVar.a, pwuVar.c));
            } else if (this.r == null) {
                this.r = ja.J(pwuVar, true, true);
            } else {
                int i10 = pwuVar.c;
                byte[] bArr = new byte[i10];
                System.arraycopy(pwuVar.a, 0, bArr, 0, i10);
                int i11 = baeVar3.a;
                int i12 = 5;
                ja.K(5, pwuVar, false);
                int i13 = pwuVar.i() + 1;
                bac bacVar = new bac(pwuVar.a);
                bacVar.b(pwuVar.b * 8);
                int i14 = 0;
                while (i14 < i13) {
                    if (bacVar.a(24) != 5653314) {
                        int i15 = bacVar.a;
                        int i16 = bacVar.b;
                        StringBuilder sb = new StringBuilder(66);
                        sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb.append((i15 * 8) + i16);
                        throw pjq.a(sb.toString(), null);
                    }
                    int a = bacVar.a(16);
                    int a2 = bacVar.a(24);
                    long[] jArr = new long[a2];
                    long j2 = 0;
                    if (!bacVar.c()) {
                        boolean c = bacVar.c();
                        int i17 = 0;
                        while (i17 < a2) {
                            if (c) {
                                if (bacVar.c()) {
                                    baeVar2 = baeVar3;
                                    jArr[i17] = bacVar.a(i12) + 1;
                                } else {
                                    baeVar2 = baeVar3;
                                    jArr[i17] = 0;
                                }
                            } else {
                                baeVar2 = baeVar3;
                                jArr[i17] = bacVar.a(i12) + 1;
                            }
                            i17++;
                            baeVar3 = baeVar2;
                            i5 = 4;
                        }
                        baeVar = baeVar3;
                        i4 = i13;
                    } else {
                        baeVar = baeVar3;
                        int a3 = bacVar.a(i12) + 1;
                        int i18 = 0;
                        while (i18 < a2) {
                            int a4 = bacVar.a(ja.I(a2 - i18));
                            int i19 = 0;
                            while (i19 < a4 && i18 < a2) {
                                jArr[i18] = a3;
                                i18++;
                                i19++;
                                i13 = i13;
                            }
                            a3++;
                            i13 = i13;
                        }
                        i4 = i13;
                        i5 = 4;
                    }
                    int a5 = bacVar.a(i5);
                    if (a5 <= 2) {
                        if (a5 != 1) {
                            if (a5 == 2) {
                                a5 = 2;
                            } else {
                                i14++;
                                baeVar3 = baeVar;
                                i13 = i4;
                                i5 = 4;
                                i12 = 5;
                            }
                        }
                        bacVar.b(32);
                        bacVar.b(32);
                        int a6 = bacVar.a(i5) + 1;
                        bacVar.b(1);
                        if (a5 != 1) {
                            j2 = a2 * a;
                        } else if (a != 0) {
                            double d = a;
                            Double.isNaN(d);
                            j2 = (long) Math.floor(Math.pow(a2, 1.0d / d));
                        }
                        bacVar.b((int) (a6 * j2));
                        i14++;
                        baeVar3 = baeVar;
                        i13 = i4;
                        i5 = 4;
                        i12 = 5;
                    } else {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("lookup type greater than 2 not decodable: ");
                        sb2.append(a5);
                        throw pjq.a(sb2.toString(), null);
                    }
                }
                bae baeVar4 = baeVar3;
                int i20 = 6;
                int a7 = bacVar.a(6) + 1;
                for (int i21 = 0; i21 < a7; i21++) {
                    if (bacVar.a(16) != 0) {
                        throw pjq.a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i22 = 1;
                int a8 = bacVar.a(6) + 1;
                int i23 = 0;
                while (true) {
                    int i24 = 3;
                    if (i23 < a8) {
                        int a9 = bacVar.a(16);
                        if (a9 == 0) {
                            int i25 = 8;
                            bacVar.b(8);
                            bacVar.b(16);
                            bacVar.b(16);
                            bacVar.b(6);
                            bacVar.b(8);
                            int a10 = bacVar.a(4) + 1;
                            int i26 = 0;
                            while (i26 < a10) {
                                bacVar.b(i25);
                                i26++;
                                i25 = 8;
                            }
                        } else if (a9 == i22) {
                            int a11 = bacVar.a(5);
                            int[] iArr = new int[a11];
                            int i27 = -1;
                            for (int i28 = 0; i28 < a11; i28++) {
                                int a12 = bacVar.a(4);
                                iArr[i28] = a12;
                                if (a12 > i27) {
                                    i27 = a12;
                                }
                            }
                            int i29 = i27 + 1;
                            int[] iArr2 = new int[i29];
                            int i30 = 0;
                            while (i30 < i29) {
                                iArr2[i30] = bacVar.a(i24) + 1;
                                int a13 = bacVar.a(2);
                                if (a13 > 0) {
                                    i3 = 8;
                                    bacVar.b(8);
                                } else {
                                    i3 = 8;
                                }
                                int i31 = 0;
                                for (int i32 = 1; i31 < (i32 << a13); i32 = 1) {
                                    bacVar.b(i3);
                                    i31++;
                                    i3 = 8;
                                }
                                i30++;
                                i24 = 3;
                            }
                            bacVar.b(2);
                            int a14 = bacVar.a(4);
                            int i33 = 0;
                            int i34 = 0;
                            for (int i35 = 0; i35 < a11; i35++) {
                                i33 += iArr2[iArr[i35]];
                                while (i34 < i33) {
                                    bacVar.b(a14);
                                    i34++;
                                }
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(52);
                            sb3.append("floor type greater than 1 not decodable: ");
                            sb3.append(a9);
                            throw pjq.a(sb3.toString(), null);
                        }
                        i23++;
                        i20 = 6;
                        i22 = 1;
                    } else {
                        int i36 = 1;
                        int a15 = bacVar.a(i20) + 1;
                        int i37 = 0;
                        while (i37 < a15) {
                            if (bacVar.a(16) <= 2) {
                                bacVar.b(24);
                                bacVar.b(24);
                                bacVar.b(24);
                                int a16 = bacVar.a(i20) + i36;
                                int i38 = 8;
                                bacVar.b(8);
                                int[] iArr3 = new int[a16];
                                for (int i39 = 0; i39 < a16; i39++) {
                                    iArr3[i39] = ((bacVar.c() ? bacVar.a(5) : 0) * 8) + bacVar.a(3);
                                }
                                int i40 = 0;
                                while (i40 < a16) {
                                    int i41 = 0;
                                    while (i41 < i38) {
                                        if ((iArr3[i40] & (1 << i41)) != 0) {
                                            bacVar.b(i38);
                                        }
                                        i41++;
                                        i38 = 8;
                                    }
                                    i40++;
                                    i38 = 8;
                                }
                                i37++;
                                i20 = 6;
                                i36 = 1;
                            } else {
                                throw pjq.a("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int a17 = bacVar.a(i20) + 1;
                        for (int i42 = 0; i42 < a17; i42++) {
                            int a18 = bacVar.a(16);
                            if (a18 != 0) {
                                StringBuilder sb4 = new StringBuilder(52);
                                sb4.append("mapping type other than 0 not supported: ");
                                sb4.append(a18);
                                Log.e("VorbisUtil", sb4.toString());
                            } else {
                                if (bacVar.c()) {
                                    i = 1;
                                    i2 = bacVar.a(4) + 1;
                                } else {
                                    i = 1;
                                    i2 = 1;
                                }
                                if (bacVar.c()) {
                                    int a19 = bacVar.a(8) + i;
                                    for (int i43 = 0; i43 < a19; i43++) {
                                        int i44 = i11 - 1;
                                        bacVar.b(ja.I(i44));
                                        bacVar.b(ja.I(i44));
                                    }
                                }
                                if (bacVar.a(2) != 0) {
                                    throw pjq.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i2 > 1) {
                                    for (int i45 = 0; i45 < i11; i45++) {
                                        bacVar.b(4);
                                    }
                                }
                                for (int i46 = 0; i46 < i2; i46++) {
                                    bacVar.b(8);
                                    bacVar.b(8);
                                    bacVar.b(8);
                                }
                            }
                        }
                        int a20 = bacVar.a(6) + 1;
                        rjm[] rjmVarArr = new rjm[a20];
                        for (int i47 = 0; i47 < a20; i47++) {
                            boolean c2 = bacVar.c();
                            bacVar.a(16);
                            bacVar.a(16);
                            bacVar.a(8);
                            rjmVarArr[i47] = new rjm(c2);
                        }
                        if (bacVar.c()) {
                            bcsVar = new bcs(baeVar4, bArr, rjmVarArr, ja.I(a20 - 1), null);
                        } else {
                            throw pjq.a("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
            bcsVar = null;
            this.a = bcsVar;
            if (bcsVar == null) {
                return true;
            }
            bae baeVar5 = bcsVar.a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(baeVar5.g);
            arrayList.add(bcsVar.b);
            pis pisVar = new pis();
            pisVar.k = "audio/vorbis";
            pisVar.f = baeVar5.d;
            pisVar.g = baeVar5.c;
            pisVar.x = baeVar5.a;
            pisVar.y = baeVar5.b;
            pisVar.m = arrayList;
            bcpVar.a = pisVar.a();
            return true;
        }
        ptx.a(bcpVar.a);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcr
    public final void f(long j) {
        this.h = j;
        int i = 0;
        this.p = j != 0;
        bae baeVar = this.q;
        if (baeVar != null) {
            i = baeVar.e;
        }
        this.o = i;
    }
}
