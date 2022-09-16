package defpackage;

import android.util.Log;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: pcr  reason: default package */
/* loaded from: classes4.dex */
public final class pcr {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    public static int a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        boolean z = false;
        pce.d(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            d(zArr);
            return i - 3;
        } else if (i3 <= 1 || !zArr[1] || bArr[i] != 1) {
            if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
                int i4 = i2 - 1;
                int i5 = i + 2;
                while (i5 < i4) {
                    byte b2 = bArr[i5];
                    if ((b2 & 254) == 0) {
                        int i6 = i5 - 2;
                        if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                            d(zArr);
                            return i6;
                        }
                        i5 = i6;
                    }
                    i5 += 3;
                }
                zArr[0] = i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
                zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
                if (bArr[i4] == 0) {
                    z = true;
                }
                zArr[2] = z;
                return i2;
            }
            d(zArr);
            return i - 1;
        } else {
            d(zArr);
            return i - 2;
        }
    }

    public static int b(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        int length = iArr.length;
                        d = Arrays.copyOf(iArr, length + length);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    public static pcq c(pcs pcsVar) {
        int b2;
        int i;
        int a2 = pcsVar.a(8);
        pcsVar.e(16);
        int b3 = pcsVar.b();
        int i2 = 1;
        if (a2 == 100 || a2 == 110 || a2 == 122 || a2 == 244 || a2 == 44 || a2 == 83 || a2 == 86 || a2 == 118 || a2 == 128 || a2 == 138) {
            b2 = pcsVar.b();
            if (b2 == 3) {
                pcsVar.f();
                i = 3;
            } else {
                i = b2;
            }
            pcsVar.b();
            pcsVar.b();
            pcsVar.e(1);
            if (pcsVar.f()) {
                int i3 = i != 3 ? 8 : 12;
                int i4 = 0;
                while (i4 < i3) {
                    if (pcsVar.f()) {
                        int i5 = i4 < 6 ? 16 : 64;
                        int i6 = 8;
                        int i7 = 8;
                        for (int i8 = 0; i8 < i5; i8++) {
                            if (i6 != 0) {
                                i6 = ((pcsVar.c() + i7) + 256) % 256;
                            }
                            if (i6 != 0) {
                                i7 = i6;
                            }
                        }
                    }
                    i4++;
                }
            }
        } else {
            b2 = 1;
        }
        pcsVar.b();
        int b4 = pcsVar.b();
        if (b4 == 0) {
            pcsVar.b();
        } else if (b4 == 1) {
            pcsVar.f();
            pcsVar.c();
            pcsVar.c();
            long b5 = pcsVar.b();
            for (int i9 = 0; i9 < b5; i9++) {
                pcsVar.b();
            }
        }
        pcsVar.b();
        pcsVar.e(1);
        int b6 = pcsVar.b() + 1;
        int b7 = pcsVar.b();
        boolean f = pcsVar.f();
        int i10 = 2 - (f ? 1 : 0);
        int i11 = (b7 + 1) * i10;
        if (!f) {
            pcsVar.e(1);
        }
        pcsVar.e(1);
        int i12 = b6 * 16;
        int i13 = i11 * 16;
        if (pcsVar.f()) {
            int b8 = pcsVar.b();
            int b9 = pcsVar.b();
            int b10 = pcsVar.b();
            int b11 = pcsVar.b();
            if (b2 != 0) {
                int i14 = b2 == 3 ? 1 : 2;
                if (b2 == 1) {
                    i2 = 2;
                }
                i10 *= i2;
                i2 = i14;
            }
            i12 -= (b8 + b9) * i2;
            i13 -= (b10 + b11) * i10;
        }
        float f2 = 1.0f;
        if (pcsVar.f() && pcsVar.f()) {
            int a3 = pcsVar.a(8);
            if (a3 == 255) {
                int a4 = pcsVar.a(16);
                int a5 = pcsVar.a(16);
                if (a4 != 0 && a5 != 0) {
                    f2 = a4 / a5;
                }
            } else if (a3 < 17) {
                f2 = b[a3];
            } else {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Unexpected aspect_ratio_idc value: ");
                sb.append(a3);
                Log.w("NalUnitUtil", sb.toString());
            }
        }
        return new pcq(b3, i12, i13, f2);
    }

    public static void d(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static byte[] e(pct pctVar) {
        int k = pctVar.k();
        int i = pctVar.b;
        pctVar.A(k);
        byte[] bArr = pctVar.a;
        byte[] bArr2 = pcf.a;
        byte[] bArr3 = new byte[k + 4];
        System.arraycopy(pcf.a, 0, bArr3, 0, 4);
        System.arraycopy(bArr, i, bArr3, 4, k);
        return bArr3;
    }

    public static abtm f(pcs pcsVar) {
        int b2 = pcsVar.b();
        pcsVar.b();
        pcsVar.e(1);
        pcsVar.f();
        return new abtm(b2);
    }
}
