package defpackage;

import java.util.BitSet;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ayaq  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayaq {
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

    public ayaq(String str, boolean z) {
        str.getClass();
        this.d = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        aqxo.q(!lowerCase.isEmpty(), "token must have at least 1 tchar");
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
                throw new IllegalArgumentException(aqxo.k("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
            i++;
        }
        this.a = lowerCase;
        this.b = lowerCase.getBytes(amoz.a);
    }

    public static ayaq c(String str, ayao ayaoVar) {
        return new ayan(str, ayaoVar);
    }

    public static ayaq d(String str, boolean z, ayas ayasVar) {
        return new ayar(str, z, ayasVar);
    }

    public static ayaq e(String str, azqc azqcVar) {
        return new ayap(str);
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((ayaq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("Key{name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
