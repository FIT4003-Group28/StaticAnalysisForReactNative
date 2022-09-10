package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: ddae  reason: default package */
/* loaded from: classes.dex */
public abstract class ddae {
    public static final ddae d = new ddaa("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final ddae e = new ddaa("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final ddae f = new ddad("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    static {
        new ddad("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new dczz(new dczy("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void b(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int f(int i);

    public CharSequence g(CharSequence charSequence) {
        throw null;
    }

    public abstract ddae h();

    public final String i(byte[] bArr) {
        int length = bArr.length;
        dbsk.u(0, length, length);
        StringBuilder sb = new StringBuilder(d(length));
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] j(CharSequence charSequence) {
        try {
            CharSequence g = g(charSequence);
            int f2 = f(g.length());
            byte[] bArr = new byte[f2];
            int a = a(bArr, g);
            if (a == f2) {
                return bArr;
            }
            byte[] bArr2 = new byte[a];
            System.arraycopy(bArr, 0, bArr2, 0, a);
            return bArr2;
        } catch (ddab e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
