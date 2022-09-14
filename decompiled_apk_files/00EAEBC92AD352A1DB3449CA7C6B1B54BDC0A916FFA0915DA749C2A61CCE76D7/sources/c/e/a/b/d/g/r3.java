package c.e.a.b.d.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, k5<?> k5Var, q3 q3Var) {
        c5 c5Var = (c5) k5Var;
        int a2 = a(bArr, i2, q3Var);
        while (true) {
            c5Var.d(q3Var.f4367a);
            if (a2 >= i3) {
                break;
            }
            int a3 = a(bArr, a2, q3Var);
            if (i != q3Var.f4367a) {
                break;
            }
            a2 = a(bArr, a3, q3Var);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, q3 q3Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, q3Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, q3Var) + q3Var.f4367a;
            }
            if (i4 != 3) {
                if (i4 != 5) {
                    throw j5.c();
                }
                return i2 + 4;
            }
            int i5 = (i & (-8)) | 4;
            int i6 = 0;
            while (i2 < i3) {
                i2 = a(bArr, i2, q3Var);
                i6 = q3Var.f4367a;
                if (i6 == i5) {
                    break;
                }
                i2 = a(i6, bArr, i2, i3, q3Var);
            }
            if (i2 <= i3 && i6 == i5) {
                return i2;
            }
            throw j5.e();
        }
        throw j5.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, t7 t7Var, q3 q3Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b2 = b(bArr, i2, q3Var);
                t7Var.a(i, Long.valueOf(q3Var.f4368b));
                return b2;
            } else if (i4 == 1) {
                t7Var.a(i, Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a2 = a(bArr, i2, q3Var);
                int i5 = q3Var.f4367a;
                if (i5 < 0) {
                    throw j5.b();
                }
                if (i5 > bArr.length - a2) {
                    throw j5.a();
                }
                t7Var.a(i, i5 == 0 ? v3.f4474c : v3.a(bArr, a2, i5));
                return a2 + i5;
            } else if (i4 != 3) {
                if (i4 != 5) {
                    throw j5.c();
                }
                t7Var.a(i, Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                t7 e2 = t7.e();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a3 = a(bArr, i2, q3Var);
                    int i8 = q3Var.f4367a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a3;
                        break;
                    }
                    int a4 = a(i7, bArr, a3, i3, e2, q3Var);
                    i7 = i8;
                    i2 = a4;
                }
                if (i2 > i3 || i7 != i6) {
                    throw j5.e();
                }
                t7Var.a(i, e2);
                return i2;
            }
        }
        throw j5.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, q3 q3Var) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b3 = bArr[i6];
            if (b3 >= 0) {
                i3 = b3 << 14;
            } else {
                i5 = i7 | ((b3 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b4 = bArr[i8];
                if (b4 >= 0) {
                    i4 = b4 << 21;
                } else {
                    i7 = i5 | ((b4 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b5 = bArr[i6];
                    if (b5 >= 0) {
                        i3 = b5 << 28;
                    } else {
                        int i9 = i7 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                q3Var.f4367a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            q3Var.f4367a = i7 | i3;
            return i8;
        }
        i4 = b2 << 7;
        q3Var.f4367a = i5 | i4;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(b7<?> b7Var, int i, byte[] bArr, int i2, int i3, k5<?> k5Var, q3 q3Var) {
        int a2 = a(b7Var, bArr, i2, i3, q3Var);
        while (true) {
            k5Var.add(q3Var.f4369c);
            if (a2 >= i3) {
                break;
            }
            int a3 = a(bArr, a2, q3Var);
            if (i != q3Var.f4367a) {
                break;
            }
            a2 = a(b7Var, bArr, a3, i3, q3Var);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(b7 b7Var, byte[] bArr, int i, int i2, int i3, q3 q3Var) {
        p6 p6Var = (p6) b7Var;
        Object f2 = p6Var.f();
        int a2 = p6Var.a((p6) f2, bArr, i, i2, i3, q3Var);
        p6Var.c((p6) f2);
        q3Var.f4369c = f2;
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(b7 b7Var, byte[] bArr, int i, int i2, q3 q3Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = a(i4, bArr, i3, q3Var);
            i4 = q3Var.f4367a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw j5.a();
        }
        Object f2 = b7Var.f();
        int i6 = i4 + i5;
        b7Var.a(f2, bArr, i5, i6, q3Var);
        b7Var.c(f2);
        q3Var.f4369c = f2;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, k5<?> k5Var, q3 q3Var) {
        c5 c5Var = (c5) k5Var;
        int a2 = a(bArr, i, q3Var);
        int i2 = q3Var.f4367a + a2;
        while (a2 < i2) {
            a2 = a(bArr, a2, q3Var);
            c5Var.d(q3Var.f4367a);
        }
        if (a2 == i2) {
            return a2;
        }
        throw j5.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, q3 q3Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 >= 0) {
            q3Var.f4367a = b2;
            return i2;
        }
        return a(b2, bArr, i2, q3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i, q3 q3Var) {
        byte b2;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            q3Var.f4368b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b3 = bArr[i2];
        long j2 = (j & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b3 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i4;
            b3 = bArr[i3];
            i3 = i5;
        }
        q3Var.f4368b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(byte[] bArr, int i, q3 q3Var) {
        int a2 = a(bArr, i, q3Var);
        int i2 = q3Var.f4367a;
        if (i2 >= 0) {
            if (i2 == 0) {
                q3Var.f4369c = "";
                return a2;
            }
            q3Var.f4369c = new String(bArr, a2, i2, e5.f4123a);
            return a2 + i2;
        }
        throw j5.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(byte[] bArr, int i, q3 q3Var) {
        int a2 = a(bArr, i, q3Var);
        int i2 = q3Var.f4367a;
        if (i2 >= 0) {
            if (i2 == 0) {
                q3Var.f4369c = "";
                return a2;
            }
            q3Var.f4369c = c8.b(bArr, a2, i2);
            return a2 + i2;
        }
        throw j5.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(byte[] bArr, int i, q3 q3Var) {
        int a2 = a(bArr, i, q3Var);
        int i2 = q3Var.f4367a;
        if (i2 >= 0) {
            if (i2 > bArr.length - a2) {
                throw j5.a();
            }
            if (i2 == 0) {
                q3Var.f4369c = v3.f4474c;
                return a2;
            }
            q3Var.f4369c = v3.a(bArr, a2, i2);
            return a2 + i2;
        }
        throw j5.b();
    }
}
