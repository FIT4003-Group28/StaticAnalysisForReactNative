package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class PublicSuffixDatabase {
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final CountDownLatch f = new CountDownLatch(1);
    private byte[] g;
    private byte[] h;
    private static final byte[] b = {42};
    private static final String[] c = new String[0];
    private static final String[] d = {"*"};
    public static final PublicSuffixDatabase a = new PublicSuffixDatabase();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        r8 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(byte[] r13, byte[][] r14, int r15) {
        /*
            int r0 = r13.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L7f
            int r3 = r2 + r0
            int r3 = r3 / 2
        L9:
            r4 = 10
            if (r3 < 0) goto L14
            r5 = r13[r3]
            if (r5 == r4) goto L14
            int r3 = r3 + (-1)
            goto L9
        L14:
            int r3 = r3 + 1
            r5 = 1
            r6 = 1
        L18:
            int r7 = r3 + r6
            r8 = r13[r7]
            if (r8 == r4) goto L21
            int r6 = r6 + 1
            goto L18
        L21:
            int r4 = r7 - r3
            r6 = -1
            r9 = r15
            r8 = 0
            r10 = 0
            r11 = 0
        L28:
            if (r8 == 0) goto L2d
            r8 = 46
            goto L33
        L2d:
            r8 = r14[r9]
            r8 = r8[r10]
            r8 = r8 & 255(0xff, float:3.57E-43)
        L33:
            int r12 = r3 + r11
            r12 = r13[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r8 = r8 - r12
            if (r8 == 0) goto L3d
            goto L4f
        L3d:
            int r11 = r11 + 1
            int r10 = r10 + 1
            if (r11 != r4) goto L45
        L43:
            r8 = 0
            goto L4f
        L45:
            r8 = r14[r9]
            int r8 = r8.length
            if (r8 != r10) goto L7d
            int r8 = r14.length
            int r8 = r8 + r6
            if (r9 != r8) goto L78
            goto L43
        L4f:
            if (r8 >= 0) goto L55
        L51:
            int r3 = r3 + (-1)
            r0 = r3
            goto L3
        L55:
            if (r8 <= 0) goto L5a
        L57:
            int r2 = r7 + 1
            goto L3
        L5a:
            int r5 = r4 - r11
            r6 = r14[r9]
            int r6 = r6.length
            int r6 = r6 - r10
        L60:
            int r9 = r9 + 1
            int r8 = r14.length
            if (r9 >= r8) goto L6a
            r8 = r14[r9]
            int r8 = r8.length
            int r6 = r6 + r8
            goto L60
        L6a:
            if (r6 >= r5) goto L6d
            goto L51
        L6d:
            if (r6 <= r5) goto L70
            goto L57
        L70:
            java.lang.String r14 = new java.lang.String
            java.nio.charset.Charset r15 = defpackage.eafa.d
            r14.<init>(r13, r3, r4, r15)
            goto L80
        L78:
            int r9 = r9 + 1
            r8 = 1
            r10 = -1
            goto L28
        L7d:
            r8 = 0
            goto L28
        L7f:
            r14 = 0
        L80:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b(byte[], byte[][], int):java.lang.String");
    }

    private final void c() {
        InputStream resourceAsStream;
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
                        break;
                    } finally {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (IOException e) {
                    eaim.c.e(5, "Failed to read public suffix list", e);
                    if (!z) {
                        return;
                    }
                }
            } catch (InterruptedIOException unused) {
                Thread.interrupted();
                z = true;
            }
        }
        if (resourceAsStream != null) {
            eajb a2 = eajl.a(new eajg(eajl.e(resourceAsStream)));
            try {
                byte[] bArr = new byte[a2.k()];
                a2.x(bArr);
                byte[] bArr2 = new byte[a2.k()];
                a2.x(bArr2);
                synchronized (this) {
                    this.g = bArr;
                    this.h = bArr2;
                }
                this.f.countDown();
            } finally {
                eafa.b(a2);
            }
        }
    }

    public final String[] a(String[] strArr) {
        String str;
        String str2;
        String str3;
        int i = 0;
        if (this.e.get() || !this.e.compareAndSet(false, true)) {
            try {
                this.f.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            c();
        }
        synchronized (this) {
            if (this.g == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(eafa.d);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = b(this.g, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = b;
                str3 = b(this.g, bArr2, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String b2 = b(this.h, bArr, i);
                if (b2 != null) {
                    str = b2;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        } else if (str2 == null && str3 == null) {
            return d;
        } else {
            String[] split = str2 != null ? str2.split("\\.") : c;
            String[] split2 = str3 != null ? str3.split("\\.") : c;
            return split.length > split2.length ? split : split2;
        }
    }
}
