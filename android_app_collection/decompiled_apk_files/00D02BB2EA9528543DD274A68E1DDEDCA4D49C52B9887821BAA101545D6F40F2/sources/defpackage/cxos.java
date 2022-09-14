package defpackage;
/* compiled from: PG */
/* renamed from: cxos  reason: default package */
/* loaded from: classes5.dex */
final class cxos {
    private static final char[] a = "http://".toCharArray();
    private static final char[] b = "https://".toCharArray();
    private static final char[] c = "lh".toCharArray();
    private static final char[] d = "ap".toCharArray();
    private static final char[] e = "sp".toCharArray();
    private static final char[] f = "bp".toCharArray();
    private static final char[] g = "ccp-lh".toCharArray();
    private static final char[] h = "play-lh".toCharArray();
    private static final char[] i = "play-ti-lh".toCharArray();
    private static final char[] j = "gz0".toCharArray();
    private static final char[] k = ".googleusercontent.com/".toCharArray();
    private static final char[] l = "www.google.com/visualsearch/lh/".toCharArray();
    private static final char[] m = ".google.com/".toCharArray();
    private static final char[] n = ".blogger.com/".toCharArray();
    private static final char[] o = ".bp.blogspot.com/".toCharArray();
    private static final char[] p = ".ggpht.com/".toCharArray();
    private static final char[] q = "image".toCharArray();
    private static final char[] r = "%3D".toCharArray();
    private static final char[] s = "%3d".toCharArray();
    private static final char[][] t = {new char[]{'O'}, new char[]{'J'}, new char[]{'U', 't'}, new char[]{'U'}, new char[]{'I'}};
    private boolean A;
    private int C;
    private int D;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z;
    private final char[] u = new char[2000];
    private boolean B = true;
    private final int[] E = new int[8];
    private final int[] F = new int[8];

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017b, code lost:
        if (d(defpackage.cxos.k) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x019c, code lost:
        if (d(defpackage.cxos.n) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01bd, code lost:
        if (d(defpackage.cxos.o) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c7, code lost:
        if (d(defpackage.cxos.k) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (d(defpackage.cxos.k) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
        if (d(defpackage.cxos.k) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
        if (d(defpackage.cxos.k) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f3, code lost:
        if (d(defpackage.cxos.p) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011c, code lost:
        if (d(defpackage.cxos.p) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0143, code lost:
        if (d(defpackage.cxos.p) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
        if (d(defpackage.cxos.k) == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxos.c(java.lang.String):void");
    }

    private final boolean d(char[] cArr) {
        int i2 = this.w;
        int length = cArr.length;
        if (i2 + length <= this.v) {
            int i3 = 0;
            while (i3 < length) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (this.u[i2] != cArr[i3]) {
                    return false;
                }
                i2 = i4;
                i3 = i5;
            }
            this.w = i2;
            return true;
        }
        return false;
    }

    private final boolean e(int i2, char[] cArr) {
        int length = cArr.length;
        if (i2 + length <= this.v) {
            for (int i3 = 0; i3 < length; i3++) {
                if (this.u[i2 + i3] != cArr[i3]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int f(int r5, int r6, char[] r7) {
        /*
            r4 = this;
            int r0 = r7.length
        L1:
            int r1 = r5 + r0
            if (r1 >= r6) goto L19
            r1 = 0
        L6:
            if (r1 >= r0) goto L18
            char[] r2 = r4.u
            int r3 = r5 + r1
            char r2 = r2[r3]
            char r3 = r7[r1]
            if (r2 == r3) goto L15
            int r5 = r5 + 1
            goto L1
        L15:
            int r1 = r1 + 1
            goto L6
        L18:
            return r5
        L19:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxos.f(int, int, char[]):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a(String str) {
        c(str);
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized String b(String str, int i2, int i3, int i4) {
        char c2;
        int length;
        boolean z;
        c(str);
        if (this.B) {
            StringBuilder sb = new StringBuilder(this.v + 50);
            if (this.A) {
                sb.append(this.u, 0, this.x);
            } else {
                sb.append(this.u, 0, this.y);
                sb.append('=');
            }
            int length2 = sb.length();
            if (i3 == 0) {
                if (i4 == 0) {
                    sb.append('s');
                    sb.append(0);
                    sb.append('-');
                    i3 = 0;
                    i4 = 0;
                } else {
                    i3 = 0;
                }
            }
            if (i3 != 0) {
                sb.append('w');
                sb.append(i3);
                sb.append('-');
            }
            if (i4 != 0) {
                sb.append('h');
                sb.append(i4);
                sb.append('-');
            }
            if ((i2 & 32) != 0) {
                sb.append("rw-");
            }
            if ((i2 & 1) != 0) {
                sb.append("c-");
            }
            if ((i2 & 2) != 0) {
                sb.append("d-");
            }
            if ((i2 & 16) != 0) {
                sb.append("k-");
            }
            if ((i2 & 4) != 0) {
                sb.append("no-");
            }
            if ((i2 & 8) != 0) {
                sb.append("p-");
            }
            int i5 = this.x;
            int i6 = this.C + i5;
            while (i5 < i6) {
                int i7 = 0;
                while (true) {
                    char[][] cArr = t;
                    int length3 = cArr.length;
                    if (i7 >= 5) {
                        break;
                    }
                    char[] cArr2 = cArr[i7];
                    int i8 = i5;
                    int i9 = 0;
                    while (true) {
                        length = cArr2.length;
                        if (i9 >= length || i8 >= i6) {
                            break;
                        }
                        int i10 = i9 + 1;
                        int i11 = i8 + 1;
                        if (cArr2[i9] != this.u[i8]) {
                            i9 = i10;
                            i8 = i11;
                            z = false;
                            break;
                        }
                        i9 = i10;
                        i8 = i11;
                    }
                    z = true;
                    if (z && i9 == length && (i8 == i6 || this.u[i8] == '-')) {
                        break;
                    }
                    i7++;
                }
                sb.append(t[i7]);
                sb.append('-');
                while (i5 < i6 && this.u[i5] != '-') {
                    i5++;
                }
                i5++;
            }
            int i12 = this.x;
            int i13 = this.C + i12;
            while (i12 < i13) {
                char c3 = this.u[i12];
                while (i12 < i13 && (c2 = this.u[i12]) != '-') {
                    if (c3 == 'f') {
                        sb.append(c2);
                    }
                    i12++;
                }
                if (c3 == 'f') {
                    sb.append('-');
                }
                i12++;
            }
            int i14 = this.x;
            int i15 = this.C + i14;
            while (i14 < i15) {
                char[] cArr3 = this.u;
                boolean z2 = cArr3[i14] == 'i' && cArr3[i14 + 1] == 'v';
                while (i14 < i15) {
                    char c4 = this.u[i14];
                    if (c4 == '-') {
                        break;
                    }
                    if (z2) {
                        sb.append(c4);
                    }
                    i14++;
                }
                if (z2) {
                    sb.append('-');
                }
                i14++;
            }
            if (sb.length() > length2) {
                sb.setLength(sb.length() - 1);
            }
            if (this.A && this.C == 0) {
                sb.append('/');
            }
            char[] cArr4 = this.u;
            int i16 = this.x + this.C;
            sb.append(cArr4, i16, this.v - i16);
            return sb.toString();
        }
        return null;
    }
}
