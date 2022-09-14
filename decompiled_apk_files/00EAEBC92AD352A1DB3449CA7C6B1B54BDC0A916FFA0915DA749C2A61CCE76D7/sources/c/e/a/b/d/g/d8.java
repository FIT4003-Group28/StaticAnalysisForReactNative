package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class d8 extends e8 {
    @Override // c.e.a.b.d.g.e8
    final int a(int i, byte[] bArr, int i2, int i3) {
        int d2;
        int d3;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (b2 >= -16) {
                    if (i4 >= i3 - 2) {
                        d3 = c8.d(bArr, i4, i3);
                        return d3;
                    }
                    int i5 = i4 + 1;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i4 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                } else if (i4 >= i3 - 1) {
                    d2 = c8.d(bArr, i4, i3);
                    return d2;
                } else {
                    int i7 = i4 + 1;
                    byte b4 = bArr[i4];
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        i2 = i7 + 1;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
            }
            i2 = i4;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // c.e.a.b.d.g.e8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.d8.a(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.g.e8
    public final String a(byte[] bArr, int i, int i2) {
        boolean d2;
        boolean d3;
        boolean e2;
        boolean f2;
        boolean d4;
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                d4 = b8.d(b2);
                if (!d4) {
                    break;
                }
                i++;
                b8.b(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                d2 = b8.d(b3);
                if (d2) {
                    int i7 = i5 + 1;
                    b8.b(b3, cArr, i5);
                    while (i6 < i3) {
                        byte b4 = bArr[i6];
                        d3 = b8.d(b4);
                        if (!d3) {
                            break;
                        }
                        i6++;
                        b8.b(b4, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else {
                    e2 = b8.e(b3);
                    if (!e2) {
                        f2 = b8.f(b3);
                        if (f2) {
                            if (i6 >= i3 - 1) {
                                throw j5.f();
                            }
                            int i8 = i6 + 1;
                            b8.b(b3, bArr[i6], bArr[i8], cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else if (i6 >= i3 - 2) {
                            throw j5.f();
                        } else {
                            int i9 = i6 + 1;
                            byte b5 = bArr[i6];
                            int i10 = i9 + 1;
                            b8.b(b3, b5, bArr[i9], bArr[i10], cArr, i5);
                            i = i10 + 1;
                            i5 = i5 + 1 + 1;
                        }
                    } else if (i6 >= i3) {
                        throw j5.f();
                    } else {
                        b8.b(b3, bArr[i6], cArr, i5);
                        i = i6 + 1;
                        i5++;
                    }
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
