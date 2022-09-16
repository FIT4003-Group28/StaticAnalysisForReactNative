package defpackage;

import java.util.BitSet;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: dyhs  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyhs<T> {
    private static final BitSet c;
    public final String a;
    public final byte[] b;
    private final String d;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        c = bitSet;
    }

    public dyhs(String str, boolean z) {
        dbsk.t(str, "name");
        this.d = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        dbsk.t(lowerCase, "name");
        dbsk.b(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            if (z && charAt == ':') {
                if (i == 0) {
                    i = 0;
                    i++;
                } else {
                    charAt = ':';
                }
            }
            if (!c.get(charAt)) {
                throw new IllegalArgumentException(dbtx.b("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
            i++;
        }
        this.a = lowerCase;
        this.b = lowerCase.getBytes(dbrc.a);
    }

    public static <T> dyhs<T> c(String str, dyhp<T> dyhpVar) {
        return new dyho(str, dyhpVar);
    }

    public static <T> dyhs<T> d(String str, dyhn<T> dyhnVar) {
        return new dyhm(str, dyhnVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> dyhs<T> e(String str, boolean z, dyhv<T> dyhvVar) {
        return new dyhu(str, z, dyhvVar);
    }

    public abstract byte[] a(T t);

    public abstract T b(byte[] bArr);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((dyhs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append("Key{name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
