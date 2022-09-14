package defpackage;
/* compiled from: PG */
/* renamed from: dcyz  reason: default package */
/* loaded from: classes.dex */
public abstract class dcyz {
    private static final char[] a = "0123456789abcdef".toCharArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcyz g(byte[] bArr) {
        return new dcyw(bArr);
    }

    public abstract int a();

    public abstract byte[] b();

    public abstract int c();

    public abstract long d();

    public byte[] e() {
        return b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcyz) {
            dcyz dcyzVar = (dcyz) obj;
            if (a() == dcyzVar.a() && f(dcyzVar)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean f(dcyz dcyzVar);

    public final int hashCode() {
        if (a() >= 32) {
            return c();
        }
        byte[] e = e();
        int i = e[0] & 255;
        for (int i2 = 1; i2 < e.length; i2++) {
            i |= (e[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] e = e();
        int length = e.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : e) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
