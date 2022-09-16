package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: aopv  reason: default package */
/* loaded from: classes.dex */
public final class aopv {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;
    public static final ByteBuffer c;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        c = ByteBuffer.wrap(bArr);
        aoog.O(bArr);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int d = d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    public static int c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(Object obj, Object obj2) {
        return ((aoqu) obj).mo52toBuilder().mo32mergeFrom((aoqu) obj2).mo48buildPartial();
    }

    public static String f(byte[] bArr) {
        return new String(bArr, a);
    }

    public static boolean g(byte[] bArr) {
        aphq aphqVar = aosi.a;
        return aphq.q(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Object obj) {
        obj.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(aoqu aoquVar) {
        if (!(aoquVar instanceof aonl)) {
            return;
        }
        aonl aonlVar = (aonl) aoquVar;
        throw null;
    }
}
