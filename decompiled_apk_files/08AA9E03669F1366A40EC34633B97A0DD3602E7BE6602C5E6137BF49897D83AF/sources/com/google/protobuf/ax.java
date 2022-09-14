package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utf8.java */
/* loaded from: classes.dex */
public final class ax {

    /* renamed from: a  reason: collision with root package name */
    private static final a f4402a;

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static {
        f4402a = d.a() ? new d() : new b();
    }

    public static boolean a(byte[] bArr) {
        return f4402a.a(bArr, 0, bArr.length);
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return f4402a.a(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return b(b2);
            case 1:
                return b(b2, bArr[i]);
            case 2:
                return b(b2, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static class c extends IllegalArgumentException {
        c(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += a(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
        }
        return i2;
    }

    private static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new c(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f4402a.a(charSequence, bArr, i, i2);
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    static abstract class a {
        abstract int a(int i, byte[] bArr, int i2, int i3);

        abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

        a() {
        }

        final boolean a(byte[] bArr, int i, int i2) {
            return a(0, bArr, i, i2) == 0;
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    static final class b extends a {
        b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
            if (r8[r7] > (-65)) goto L51;
         */
        @Override // com.google.protobuf.ax.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int a(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L7d
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L18
                r7 = -62
                if (r0 < r7) goto L17
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L7e
            L17:
                return r2
            L18:
                r4 = -16
                if (r0 >= r4) goto L45
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L30
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L2d
                int r7 = com.google.protobuf.ax.a(r0, r9)
                return r7
            L2d:
                r5 = r9
                r9 = r7
                r7 = r5
            L30:
                if (r7 > r3) goto L44
                r4 = -96
                if (r0 != r1) goto L38
                if (r7 < r4) goto L44
            L38:
                r1 = -19
                if (r0 != r1) goto L3e
                if (r7 >= r4) goto L44
            L3e:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L7e
            L44:
                return r2
            L45:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L57
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = com.google.protobuf.ax.a(r0, r1)
                return r7
            L57:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
                r7 = r9
            L5b:
                if (r4 != 0) goto L69
                int r9 = r7 + 1
                r4 = r8[r7]
                if (r9 < r10) goto L68
                int r7 = com.google.protobuf.ax.a(r0, r1, r4)
                return r7
            L68:
                r7 = r9
            L69:
                if (r1 > r3) goto L7c
                int r9 = r0 << 28
                int r1 = r1 + 112
                int r9 = r9 + r1
                int r9 = r9 >> 30
                if (r9 != 0) goto L7c
                if (r4 > r3) goto L7c
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L7d
            L7c:
                return r2
            L7d:
                r7 = r9
            L7e:
                int r7 = b(r8, r7, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ax.b.a(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.protobuf.ax.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ax.b.a(java.lang.CharSequence, byte[], int, int):int");
        }

        private static int b(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return c(bArr, i, i2);
        }

        private static int c(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i3 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b2 >= -16) {
                        if (i3 >= i2 - 2) {
                            return ax.c(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                            int i5 = i4 + 1;
                            if (bArr[i4] <= -65) {
                                i3 = i5 + 1;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 1) {
                        return ax.c(bArr, i3, i2);
                    } else {
                        int i6 = i3 + 1;
                        byte b4 = bArr[i3];
                        if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                            i = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    static final class d extends a {
        d() {
        }

        static boolean a() {
            return aw.a() && aw.b();
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
            if (com.google.protobuf.aw.a(r13, r9) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
            if (com.google.protobuf.aw.a(r13, r9) > (-65)) goto L56;
         */
        @Override // com.google.protobuf.ax.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int a(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ax.d.a(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.ax.a
        int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            int i3;
            char charAt;
            long c2 = aw.c() + i;
            long j2 = i2 + c2;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (i4 < length && (charAt = charSequence.charAt(i4)) < 128) {
                aw.a(bArr, c2, (byte) charAt);
                i4++;
                c2 = 1 + c2;
            }
            if (i4 == length) {
                return (int) (c2 - aw.c());
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 >= 128 || c2 >= j2) {
                    if (charAt2 < 2048 && c2 <= j2 - 2) {
                        long j3 = c2 + 1;
                        aw.a(bArr, c2, (byte) ((charAt2 >>> 6) | 960));
                        c2 = j3 + 1;
                        aw.a(bArr, j3, (byte) ((charAt2 & '?') | 128));
                    } else if ((charAt2 >= 55296 && 57343 >= charAt2) || c2 > j2 - 3) {
                        if (c2 <= j2 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j4 = c2 + 1;
                                    aw.a(bArr, c2, (byte) ((codePoint >>> 18) | 240));
                                    long j5 = j4 + 1;
                                    aw.a(bArr, j4, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j6 = j5 + 1;
                                    aw.a(bArr, j5, (byte) (((codePoint >>> 6) & 63) | 128));
                                    c2 = j6 + 1;
                                    aw.a(bArr, j6, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                }
                            } else {
                                i5 = i4;
                            }
                            throw new c(i5 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new c(i4, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + c2);
                        }
                    } else {
                        long j7 = c2 + 1;
                        aw.a(bArr, c2, (byte) ((charAt2 >>> '\f') | 480));
                        long j8 = j7 + 1;
                        aw.a(bArr, j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j = j8 + 1;
                        aw.a(bArr, j8, (byte) ((charAt2 & '?') | 128));
                    }
                    i4++;
                } else {
                    j = c2 + 1;
                    aw.a(bArr, c2, (byte) charAt2);
                }
                c2 = j;
                i4++;
            }
            return (int) (c2 - aw.c());
        }

        private static int a(byte[] bArr, long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = 8 - (((int) j) & 7);
            long j2 = j;
            int i3 = i2;
            while (i3 > 0) {
                long j3 = 1 + j2;
                if (aw.a(bArr, j2) < 0) {
                    return i2 - i3;
                }
                i3--;
                j2 = j3;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (aw.b(bArr, j2) & (-9187201950435737472L)) == 0) {
                j2 += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int b(byte[] r8, long r9, int r11) {
            /*
                int r0 = a(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = com.google.protobuf.aw.a(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.aw.a(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L65
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = a(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.aw.a(r8, r9)
                if (r9 > r4) goto L64
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L64
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L64
            L5c:
                r9 = 0
                long r2 = r2 + r6
                byte r9 = com.google.protobuf.aw.a(r8, r6)
                if (r9 <= r4) goto L37
            L64:
                return r5
            L65:
                r0 = 3
                if (r11 >= r0) goto L6d
                int r8 = a(r8, r1, r9, r11)
                return r8
            L6d:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.aw.a(r8, r9)
                if (r9 > r4) goto L8f
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8f
                long r9 = r6 + r2
                byte r0 = com.google.protobuf.aw.a(r8, r6)
                if (r0 > r4) goto L8f
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.aw.a(r8, r9)
                if (r9 <= r4) goto L37
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ax.d.b(byte[], long, int):int");
        }

        private static int a(byte[] bArr, int i, long j, int i2) {
            switch (i2) {
                case 0:
                    return ax.b(i);
                case 1:
                    return ax.b(i, aw.a(bArr, j));
                case 2:
                    return ax.b(i, aw.a(bArr, j), aw.a(bArr, j + 1));
                default:
                    throw new AssertionError();
            }
        }
    }
}
