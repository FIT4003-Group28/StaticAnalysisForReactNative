package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* compiled from: PG */
/* renamed from: aeh  reason: default package */
/* loaded from: classes.dex */
public class aeh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Drawable drawable) {
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0299, code lost:
        if (r4.d == r7) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
        if (r6.d == r5) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x045e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0703 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x073f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x075e A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.ahi r36, defpackage.agy r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeh.b(ahi, agy, java.util.ArrayList, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x005c -> B:35:0x005f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bpw c(byte[] r7) {
        /*
            bpw r0 = new bpw
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
            bpv r5 = new bpv     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            java.util.Set r3 = r0.a     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            r3.add(r5)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r7 = move-exception
            r7.printStackTrace()
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
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r7 = move-exception
            r7.printStackTrace()
        L57:
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L5b:
            r7 = move-exception
            r7.printStackTrace()
        L5f:
            return r0
        L60:
            if (r7 == 0) goto L6a
            r7.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r7 = move-exception
            r7.printStackTrace()
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r7 = move-exception
            r7.printStackTrace()
        L72:
            goto L74
        L73:
            throw r0
        L74:
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeh.c(byte[]):bpw");
    }

    public static int e(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
        }
        return 1;
    }

    public static int f(int i) {
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
            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
        }
        return 1;
    }

    public static int g(int i) {
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

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
        }
        return 1;
    }

    public static int d(int i) {
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
                            throw new IllegalArgumentException("Could not convert " + ((Object) adz.d(i)) + " to int");
                        }
                    }
                }
            }
            return i3;
        }
        throw null;
    }
}
