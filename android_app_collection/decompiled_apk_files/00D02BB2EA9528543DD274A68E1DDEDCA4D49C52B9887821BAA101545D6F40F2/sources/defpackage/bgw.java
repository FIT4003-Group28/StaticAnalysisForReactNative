package defpackage;
/* compiled from: PG */
/* renamed from: bgw  reason: default package */
/* loaded from: classes3.dex */
public final class bgw {
    /* JADX WARN: Removed duplicated region for block: B:48:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x005c -> B:35:0x005f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bbn a(byte[] r7) {
        /*
            bbn r0 = new bbn
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
        L17:
            if (r7 <= 0) goto L32
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            bbm r5 = new bbm     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            java.util.Set<bbm> r3 = r0.a     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            r3.add(r5)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r7 = move-exception
            defpackage.deki.b(r7)
        L3a:
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L3e:
            r7 = move-exception
            r0 = r7
            r7 = r2
            goto L60
        L42:
            r7 = move-exception
            goto L4a
        L44:
            r0 = move-exception
            goto L60
        L46:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4a:
            defpackage.deki.b(r7)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r7 = move-exception
            defpackage.deki.b(r7)
        L57:
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L5b:
            r7 = move-exception
            defpackage.deki.b(r7)
        L5f:
            return r0
        L60:
            if (r7 == 0) goto L6a
            r7.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r7 = move-exception
            defpackage.deki.b(r7)
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r7 = move-exception
            defpackage.deki.b(r7)
        L72:
            goto L74
        L73:
            throw r0
        L74:
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgw.a(byte[]):bbn");
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            if (i == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to State");
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
        }
        return 1;
    }

    public static int b(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return 0;
            }
            int i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    i3 = 3;
                    if (i2 != 3) {
                        i3 = 4;
                        if (i2 != 4) {
                            if (i2 == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + ((Object) bck.a(i)) + " to int");
                        }
                    }
                }
            }
            return i3;
        }
        throw null;
    }
}
