package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: akqm  reason: default package */
/* loaded from: classes.dex */
public final class akqm {
    public static void a(byte[] bArr, int i, int[] iArr) {
        int min = Math.min(bArr.length, i);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = true;
        while (i2 < min) {
            int i6 = i2 + 1;
            try {
                int i7 = bArr[i2];
                if (i7 < 0) {
                    int i8 = i6 + 1;
                    int i9 = bArr[i6];
                    i7 = (i7 & 127) | ((i9 & 127) << 7);
                    if (i9 < 0) {
                        i6 = i8 + 1;
                        int i10 = bArr[i8];
                        i7 |= (i10 & 127) << 14;
                        if (i10 < 0) {
                            i8 = i6 + 1;
                            int i11 = bArr[i6];
                            i7 |= (i11 & 127) << 21;
                            if (i11 < 0) {
                                i6 = i8 + 1;
                                int i12 = bArr[i8];
                                i7 |= (i12 & 127) << 28;
                                while (i12 < 0) {
                                    int i13 = i6 + 1;
                                    i12 = bArr[i6];
                                    i6 = i13;
                                }
                            }
                        }
                    }
                    i6 = i8;
                }
                int i14 = (-(i7 & 1)) ^ (i7 >>> 1);
                if (z) {
                    i3 += i14;
                    iArr[i5] = i3;
                } else {
                    i4 += i14;
                    iArr[i5] = i4;
                }
                z = !z;
                i5++;
                i2 = i6;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IOException("Invalid vertex data", e);
            }
        }
        if (z) {
            return;
        }
        throw new IOException("Odd number of vertices");
    }

    private static int d(dspd dspdVar, int[] iArr, int i) {
        dsox it = dspdVar.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        while (it.hasNext()) {
            try {
                int a = it.a();
                if (a < 0) {
                    byte a2 = it.a();
                    a = (a & 127) | ((a2 & Byte.MAX_VALUE) << 7);
                    if (a2 < 0) {
                        byte a3 = it.a();
                        a |= (a3 & Byte.MAX_VALUE) << 14;
                        if (a3 < 0) {
                            byte a4 = it.a();
                            a |= (a4 & Byte.MAX_VALUE) << 21;
                            if (a4 < 0) {
                                byte a5 = it.a();
                                a |= (a5 & Byte.MAX_VALUE) << 28;
                                while (a5 < 0) {
                                    a5 = it.a();
                                }
                            }
                        }
                    }
                }
                int i5 = (-(a & 1)) ^ (a >>> 1);
                if (z) {
                    i3 += i5;
                    iArr[i + i2] = i3;
                } else {
                    i4 += i5;
                    iArr[i + i2] = i4;
                }
                z = !z;
                i2++;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IOException("Invalid vertex data", e);
            }
        }
        if (z) {
            return i2;
        }
        throw new IOException("Odd number of vertices");
    }

    public static int c(byte[] bArr, int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return bArr.length >> 1;
            }
            if (i2 != 3) {
                String valueOf = String.valueOf(dmsy.b(i));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Unknown vertex encoding :");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
        }
        int i3 = 0;
        for (byte b : bArr) {
            if (b >= 0) {
                i3++;
            }
        }
        return i3;
    }

    public static int b(dspd dspdVar, int i, int i2, int[] iArr, int i3) {
        if (i != 4 || i2 != 2) {
            ddav ddavVar = new ddav(dspdVar.r());
            int i4 = i - 1;
            int i5 = 0;
            if (i4 == 1) {
                while (ddavVar.available() > 0) {
                    iArr[i3 + i5] = bvpf.b(ddavVar);
                    i5++;
                }
            } else if (i4 == 2) {
                while (ddavVar.available() > 0) {
                    iArr[i3 + i5] = ddavVar.readShort();
                    i5++;
                }
            } else if (i4 != 3) {
                String valueOf = String.valueOf(dmsy.b(i));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Unknown vertex encoding :");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            } else if (i2 != 3) {
                int i6 = 0;
                int i7 = 0;
                while (ddavVar.available() > 0) {
                    i6 += bvpf.b(ddavVar);
                    i7 += bvpf.b(ddavVar);
                    int i8 = i3 + i5;
                    iArr[i8] = i6;
                    iArr[i8 + 1] = i7;
                    i5 += 2;
                }
            } else {
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (ddavVar.available() > 0) {
                    i9 += bvpf.b(ddavVar);
                    i10 += bvpf.b(ddavVar);
                    i11 += bvpf.b(ddavVar);
                    int i12 = i3 + i5;
                    iArr[i12] = i9;
                    iArr[i12 + 1] = i10;
                    iArr[i12 + 2] = i11;
                    i5 += 3;
                }
            }
            return i5;
        }
        return d(dspdVar, iArr, i3);
    }
}
