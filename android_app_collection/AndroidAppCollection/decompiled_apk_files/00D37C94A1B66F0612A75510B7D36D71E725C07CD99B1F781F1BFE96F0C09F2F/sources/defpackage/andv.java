package defpackage;
/* compiled from: PG */
/* renamed from: andv  reason: default package */
/* loaded from: classes.dex */
public abstract class andv {
    private static final char[] a = "0123456789abcdef".toCharArray();

    public static andv e(int i) {
        return new andu(i);
    }

    public abstract int a();

    public abstract boolean b(andv andvVar);

    public abstract byte[] c();

    public abstract void d();

    public final boolean equals(Object obj) {
        if (obj instanceof andv) {
            andv andvVar = (andv) obj;
            andvVar.d();
            if (b(andvVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a();
    }

    public final String toString() {
        byte[] c = c();
        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 4; i++) {
            byte b = c[i];
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
