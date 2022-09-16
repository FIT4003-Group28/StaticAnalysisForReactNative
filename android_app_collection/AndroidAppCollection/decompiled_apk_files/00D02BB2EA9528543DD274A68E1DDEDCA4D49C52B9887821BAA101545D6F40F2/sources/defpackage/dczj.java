package defpackage;

import java.nio.ByteOrder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dczj  reason: default package */
/* loaded from: classes5.dex */
public final class dczj {
    private static final dczg a;

    static {
        dczg dczgVar = dczf.a;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                if (!ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                    dczgVar = dczi.UNSAFE_BIG_ENDIAN;
                } else {
                    dczgVar = dczi.UNSAFE_LITTLE_ENDIAN;
                }
            }
        } catch (Throwable unused) {
        }
        a = dczgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(byte[] bArr, int i) {
        return a.a(bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
