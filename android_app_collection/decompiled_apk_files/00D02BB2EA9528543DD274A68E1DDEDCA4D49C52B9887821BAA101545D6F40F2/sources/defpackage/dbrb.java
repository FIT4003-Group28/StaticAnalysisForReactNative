package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dbrb  reason: default package */
/* loaded from: classes.dex */
public abstract class dbrb implements dbsl<Character> {
    public static dbrb n(char c) {
        return new dbqq(c);
    }

    public static dbrb o(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return n(charSequence.charAt(0));
            }
            if (length == 2) {
                return v(charSequence.charAt(0), charSequence.charAt(1));
            }
            return new dbqj(charSequence);
        }
        return dbqx.a;
    }

    public static dbrb p(char c, char c2) {
        return new dbqo(c, c2);
    }

    public static String u(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    private static dbqr v(char c, char c2) {
        return new dbqr(c, c2);
    }

    @Override // defpackage.dbsl
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Character ch) {
        return b(ch.charValue());
    }

    public abstract boolean b(char c);

    public int c(CharSequence charSequence) {
        return d(charSequence, 0);
    }

    public int d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        dbsk.y(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int e(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (b(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (b(charSequence.charAt(length)));
        return false;
    }

    public boolean g(CharSequence charSequence) {
        return c(charSequence) == -1;
    }

    public String h(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int c = c(charSequence2);
        if (c == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            c++;
            while (c != charArray.length) {
                if (b(charArray[c])) {
                    break;
                }
                charArray[c - i] = charArray[c];
                c++;
            }
            return new String(charArray, 0, c - i);
            i++;
        }
    }

    public String i(CharSequence charSequence, char c) {
        String charSequence2 = charSequence.toString();
        int c2 = c(charSequence2);
        if (c2 == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[c2] = c;
        while (true) {
            c2++;
            if (c2 < charArray.length) {
                if (b(charArray[c2])) {
                    charArray[c2] = c;
                }
            } else {
                return new String(charArray);
            }
        }
    }

    public dbrb j(dbrb dbrbVar) {
        return new dbqy(this, dbrbVar);
    }

    public dbrb k() {
        return new dbqv(this);
    }

    public void l(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (b((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public dbrb m() {
        return dbsj.b(this);
    }

    public final int r(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (b(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public final String s(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && b(charSequence.charAt(i))) {
            i++;
        }
        do {
            length--;
            if (length <= i) {
                break;
            }
        } while (b(charSequence.charAt(length)));
        return charSequence.subSequence(i, length + 1).toString();
    }

    public final String t(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (b(charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1).toString();
    }

    public static dbrb q(int i, BitSet bitSet, String str) {
        int i2;
        if (i != 0) {
            if (i == 1) {
                return n((char) bitSet.nextSetBit(0));
            }
            int i3 = 2;
            if (i == 2) {
                char nextSetBit = (char) bitSet.nextSetBit(0);
                return v(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
            }
            int length = bitSet.length();
            if (i > 1023 || length <= i * 64) {
                return new dbql(bitSet, str);
            }
            int cardinality = bitSet.cardinality();
            boolean z = bitSet.get(0);
            if (cardinality != 1) {
                int highestOneBit = Integer.highestOneBit(cardinality - 1);
                i3 = highestOneBit + highestOneBit;
                while (true) {
                    double d = i3;
                    Double.isNaN(d);
                    if (d * 0.5d >= cardinality) {
                        break;
                    }
                    i3 += i3;
                }
            }
            char[] cArr = new char[i3];
            int i4 = i3 - 1;
            int nextSetBit2 = bitSet.nextSetBit(0);
            long j = 0;
            while (nextSetBit2 != -1) {
                long j2 = (1 << nextSetBit2) | j;
                int v = dbtc.v(nextSetBit2);
                while (true) {
                    i2 = v & i4;
                    if (cArr[i2] == 0) {
                        break;
                    }
                    v = i2 + 1;
                }
                cArr[i2] = (char) nextSetBit2;
                nextSetBit2 = bitSet.nextSetBit(nextSetBit2 + 1);
                j = j2;
            }
            return new dbtc(cArr, j, z, str);
        }
        return dbqx.a;
    }
}
