package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsom  reason: default package */
/* loaded from: classes.dex */
public final class dsom {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, dsol dsolVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            dsolVar.a = b;
            return i2;
        }
        return b(b, bArr, i2, dsolVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, byte[] bArr, int i2, dsol dsolVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            dsolVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            dsolVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            dsolVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            dsolVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                dsolVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(byte[] bArr, int i, dsol dsolVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            dsolVar.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        dsolVar.b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double f(byte[] bArr, int i) {
        return Double.longBitsToDouble(e(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float g(byte[] bArr, int i) {
        return Float.intBitsToFloat(d(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i, dsol dsolVar) {
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                dsolVar.c = "";
                return a;
            }
            dsolVar.c = new String(bArr, a, i2, dsrk.a);
            return a + i2;
        }
        throw dsrm.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(byte[] bArr, int i, dsol dsolVar) {
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                dsolVar.c = "";
                return a;
            }
            dsolVar.c = dsuo.h(bArr, a, i2);
            return a + i2;
        }
        throw dsrm.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(byte[] bArr, int i, dsol dsolVar) {
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a;
        if (i2 < 0) {
            throw dsrm.b();
        }
        if (i2 > bArr.length - a) {
            throw dsrm.a();
        }
        if (i2 == 0) {
            dsolVar.c = dspd.b;
            return a;
        }
        dsolVar.c = dspd.w(bArr, a, i2);
        return a + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(dstc dstcVar, byte[] bArr, int i, int i2, dsol dsolVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = b(i4, bArr, i3, dsolVar);
            i4 = dsolVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw dsrm.a();
        }
        Object a = dstcVar.a();
        int i6 = i4 + i5;
        dstcVar.i(a, bArr, i5, i6, dsolVar);
        dstcVar.j(a);
        dsolVar.c = a;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(dstc dstcVar, byte[] bArr, int i, int i2, int i3, dsol dsolVar) {
        dssm dssmVar = (dssm) dstcVar;
        Object a = dssmVar.a();
        int h = dssmVar.h(a, bArr, i, i2, i3, dsolVar);
        dssmVar.j(a);
        dsolVar.c = a;
        return h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i, byte[] bArr, int i2, int i3, dsrj<?> dsrjVar, dsol dsolVar) {
        dsqz dsqzVar = (dsqz) dsrjVar;
        int a = a(bArr, i2, dsolVar);
        dsqzVar.h(dsolVar.a);
        while (a < i3) {
            int a2 = a(bArr, a, dsolVar);
            if (i != dsolVar.a) {
                break;
            }
            a = a(bArr, a2, dsolVar);
            dsqzVar.h(dsolVar.a);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(byte[] bArr, int i, dsrj<?> dsrjVar, dsol dsolVar) {
        dsqz dsqzVar = (dsqz) dsrjVar;
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a + a;
        while (a < i2) {
            a = a(bArr, a, dsolVar);
            dsqzVar.h(dsolVar.a);
        }
        if (a == i2) {
            return a;
        }
        throw dsrm.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(byte[] bArr, int i, dsrj<?> dsrjVar, dsol dsolVar) {
        dsrx dsrxVar = (dsrx) dsrjVar;
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a + a;
        while (a < i2) {
            a = c(bArr, a, dsolVar);
            dsrxVar.d(dsolVar.b);
        }
        if (a == i2) {
            return a;
        }
        throw dsrm.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(byte[] bArr, int i, dsrj<?> dsrjVar, dsol dsolVar) {
        dsqz dsqzVar = (dsqz) dsrjVar;
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a + a;
        while (a < i2) {
            dsqzVar.h(d(bArr, a));
            a += 4;
        }
        if (a == i2) {
            return a;
        }
        throw dsrm.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(byte[] bArr, int i, dsrj<?> dsrjVar, dsol dsolVar) {
        dsrx dsrxVar = (dsrx) dsrjVar;
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a + a;
        while (a < i2) {
            dsrxVar.d(e(bArr, a));
            a += 8;
        }
        if (a == i2) {
            return a;
        }
        throw dsrm.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(byte[] bArr, int i, dsrj<?> dsrjVar, dsol dsolVar) {
        dsqk dsqkVar = (dsqk) dsrjVar;
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a + a;
        while (a < i2) {
            dsqkVar.g(g(bArr, a));
            a += 4;
        }
        if (a == i2) {
            return a;
        }
        throw dsrm.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(byte[] bArr, int i, dsrj<?> dsrjVar, dsol dsolVar) {
        dspr dsprVar = (dspr) dsrjVar;
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a + a;
        while (a < i2) {
            dsprVar.f(f(bArr, a));
            a += 8;
        }
        if (a == i2) {
            return a;
        }
        throw dsrm.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(byte[] bArr, int i, dsrj<?> dsrjVar, dsol dsolVar) {
        dsoq dsoqVar = (dsoq) dsrjVar;
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a + a;
        while (a < i2) {
            a = c(bArr, a, dsolVar);
            dsoqVar.d(dsolVar.b != 0);
        }
        if (a == i2) {
            return a;
        }
        throw dsrm.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(byte[] bArr, int i, dsrj<?> dsrjVar, dsol dsolVar) {
        dsqz dsqzVar = (dsqz) dsrjVar;
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a + a;
        while (a < i2) {
            a = a(bArr, a, dsolVar);
            dsqzVar.h(dspj.L(dsolVar.a));
        }
        if (a == i2) {
            return a;
        }
        throw dsrm.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(byte[] bArr, int i, dsrj<?> dsrjVar, dsol dsolVar) {
        dsrx dsrxVar = (dsrx) dsrjVar;
        int a = a(bArr, i, dsolVar);
        int i2 = dsolVar.a + a;
        while (a < i2) {
            a = c(bArr, a, dsolVar);
            dsrxVar.d(dspj.M(dsolVar.b));
        }
        if (a == i2) {
            return a;
        }
        throw dsrm.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(dstc<?> dstcVar, int i, byte[] bArr, int i2, int i3, dsrj<?> dsrjVar, dsol dsolVar) {
        int k = k(dstcVar, bArr, i2, i3, dsolVar);
        dsrjVar.add(dsolVar.c);
        while (k < i3) {
            int a = a(bArr, k, dsolVar);
            if (i != dsolVar.a) {
                break;
            }
            k = k(dstcVar, bArr, a, i3, dsolVar);
            dsrjVar.add(dsolVar.c);
        }
        return k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i, byte[] bArr, int i2, int i3, dsty dstyVar, dsol dsolVar) {
        if (dsut.b(i) != 0) {
            int a = dsut.a(i);
            if (a == 0) {
                int c = c(bArr, i2, dsolVar);
                dstyVar.e(i, Long.valueOf(dsolVar.b));
                return c;
            } else if (a == 1) {
                dstyVar.e(i, Long.valueOf(e(bArr, i2)));
                return i2 + 8;
            } else if (a == 2) {
                int a2 = a(bArr, i2, dsolVar);
                int i4 = dsolVar.a;
                if (i4 < 0) {
                    throw dsrm.b();
                }
                if (i4 > bArr.length - a2) {
                    throw dsrm.a();
                }
                if (i4 == 0) {
                    dstyVar.e(i, dspd.b);
                } else {
                    dstyVar.e(i, dspd.w(bArr, a2, i4));
                }
                return a2 + i4;
            } else if (a != 3) {
                if (a == 5) {
                    dstyVar.e(i, Integer.valueOf(d(bArr, i2)));
                    return i2 + 4;
                }
                throw dsrm.d();
            } else {
                int i5 = (i & (-8)) | 4;
                dsty a3 = dsty.a();
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a4 = a(bArr, i2, dsolVar);
                    int i7 = dsolVar.a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = a4;
                        break;
                    }
                    i6 = i7;
                    i2 = x(i7, bArr, a4, i3, a3, dsolVar);
                }
                if (i2 > i3 || i6 != i5) {
                    throw dsrm.i();
                }
                dstyVar.e(i, a3);
                return i2;
            }
        }
        throw dsrm.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(int i, byte[] bArr, int i2, int i3, dsol dsolVar) {
        if (dsut.b(i) != 0) {
            int a = dsut.a(i);
            if (a == 0) {
                return c(bArr, i2, dsolVar);
            }
            if (a == 1) {
                return i2 + 8;
            }
            if (a == 2) {
                return a(bArr, i2, dsolVar) + dsolVar.a;
            }
            if (a != 3) {
                if (a != 5) {
                    throw dsrm.d();
                }
                return i2 + 4;
            }
            int i4 = (i & (-8)) | 4;
            int i5 = 0;
            while (i2 < i3) {
                i2 = a(bArr, i2, dsolVar);
                i5 = dsolVar.a;
                if (i5 == i4) {
                    break;
                }
                i2 = y(i5, bArr, i2, i3, dsolVar);
            }
            if (i2 <= i3 && i5 == i4) {
                return i2;
            }
            throw dsrm.i();
        }
        throw dsrm.d();
    }
}
