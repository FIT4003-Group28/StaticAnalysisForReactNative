package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dsrk  reason: default package */
/* loaded from: classes.dex */
public final class dsrk {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        dspj.J(bArr);
    }

    public static boolean a(byte[] bArr) {
        return dsuo.a.a(bArr, 0, bArr.length);
    }

    public static String b(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int d(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int e(byte[] bArr) {
        int length = bArr.length;
        int f = f(length, bArr, 0, length);
        if (f == 0) {
            return 1;
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object g(Object obj, Object obj2) {
        return ((dssj) obj).Nn().bw((dssj) obj2).bJ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void h(T t) {
        t.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void i(T t, String str) {
        if (t != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(dssj dssjVar) {
        if (!(dssjVar instanceof dsof)) {
            return;
        }
        dsof dsofVar = (dsof) dssjVar;
        throw null;
    }
}
