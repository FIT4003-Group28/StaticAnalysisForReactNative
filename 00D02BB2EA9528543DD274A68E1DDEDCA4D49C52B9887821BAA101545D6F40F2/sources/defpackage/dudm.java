package defpackage;

import com.google.android.libraries.social.populous.core.MatchInfo;
import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dudm  reason: default package */
/* loaded from: classes6.dex */
public final class dudm {
    private static final dbrb a;
    private static final dbrb b;
    private static final dbrb c;
    private static final dbrb d;
    private static final dbrb e;

    static {
        dbrb m = dbrb.p('\b', '\r').j(dbrb.p((char) 28, ' ')).j(dbrb.p((char) 8192, (char) 8202)).j(dbrb.o(" \u1680\u180e\u2028\u2029 \u205f\u3000")).m();
        a = m;
        b = dbrb.p('a', 'z').j(dbrb.p('A', 'Z')).j(dbrb.p('0', '9')).j(dbrb.p((char) 128, (char) 8219)).j(dbrb.p((char) 8222, (char) 65535)).k().m();
        c = dbrb.p('0', '9').k().m();
        d = dbrb.p('(', '/').j(dbrb.p('[', ']')).j(dbrb.o("#_~")).j(m).m();
        e = dbqx.a;
    }

    public static dudl a(String str) {
        if (dbsj.d(str)) {
            return dudl.a;
        }
        return i(str, j(str, c));
    }

    public static dcdc<dudl> b(String str) {
        if (dbsj.d(str)) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        l(F, str, a, e);
        return F.f();
    }

    public static dcdc<dudl> c(String str, boolean z) {
        int indexOf;
        if (dbsj.d(str)) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        if (z && (indexOf = str.indexOf(64)) > 0) {
            F.g(d(str));
            str = str.substring(0, indexOf);
        }
        l(F, str, a, b);
        return F.f();
    }

    public static dudl d(String str) {
        int i = 0;
        while (i < str.length() && a.b(str.charAt(i))) {
            i++;
        }
        return new dudl(str.trim(), i, 2, null);
    }

    public static dcdc<dudl> e(String str) {
        if (dbsj.d(str)) {
            return dcdc.e();
        }
        BitSet j = j(str, c);
        dccx F = dcdc.F();
        h(F, str, 0, str.length(), j);
        return F.f();
    }

    public static dudl f(String str) {
        BitSet[] k = k(str, c, d);
        BitSet bitSet = k[0];
        BitSet bitSet2 = k[1];
        int cardinality = bitSet.cardinality();
        if (cardinality == str.length() || cardinality != bitSet2.cardinality()) {
            return null;
        }
        return i(str, bitSet);
    }

    public static <T> dcdc<T> g(dudl dudlVar, int i) {
        BitSet bitSet = dudlVar.e;
        if (bitSet == null) {
            return dcdc.f(MatchInfo.c(dudlVar.d, i));
        }
        int i2 = dudlVar.d;
        int i3 = i + i2;
        dccx F = dcdc.F();
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i2);
            if (nextSetBit < 0 || nextSetBit >= i3) {
                break;
            }
            int i4 = nextSetBit - i2;
            if (i4 > 0) {
                F.g(MatchInfo.c(i2, i4));
            }
            i2 = nextSetBit + 1;
            i3++;
        }
        int i5 = i3 - i2;
        if (i5 > 0) {
            F.g(MatchInfo.c(i2, i5));
        }
        return F.f();
    }

    private static String h(dccx<dudl> dccxVar, String str, int i, int i2, BitSet bitSet) {
        int nextClearBit = bitSet.nextClearBit(i);
        if (nextClearBit >= i2) {
            return "";
        }
        int nextSetBit = bitSet.nextSetBit(nextClearBit);
        if (nextSetBit < 0) {
            String substring = str.substring(nextClearBit, i2);
            dccxVar.g(new dudl(substring, nextClearBit, 3, bitSet));
            return substring;
        }
        String h = h(dccxVar, str, nextSetBit, i2, bitSet);
        String valueOf = String.valueOf(str.substring(nextClearBit, nextSetBit));
        String valueOf2 = String.valueOf(h);
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        dccxVar.g(new dudl(concat, nextClearBit, 4, bitSet));
        return concat;
    }

    private static dudl i(String str, BitSet bitSet) {
        int length = str.length();
        if (bitSet.isEmpty()) {
            return new dudl(str, 0, 2, null);
        }
        int cardinality = length - bitSet.cardinality();
        if (cardinality <= 0) {
            return dudl.a;
        }
        int nextClearBit = bitSet.nextClearBit(0);
        StringBuilder sb = new StringBuilder(cardinality);
        int i = nextClearBit;
        while (i < length) {
            int nextSetBit = bitSet.nextSetBit(i);
            if (nextSetBit < 0) {
                nextSetBit = length;
            }
            sb.append((CharSequence) str, i, nextSetBit);
            i = bitSet.nextClearBit(nextSetBit);
        }
        return new dudl(sb.toString(), nextClearBit, 4, bitSet);
    }

    private static BitSet j(String str, dbrb dbrbVar) {
        return k(str, dbrbVar, e)[0];
    }

    private static BitSet[] k(String str, dbrb dbrbVar, dbrb dbrbVar2) {
        int length = str.length();
        BitSet[] bitSetArr = {new BitSet(length), new BitSet(length)};
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (dbrbVar.b(charAt)) {
                bitSetArr[0].set(i);
            }
            if (dbrbVar2.b(charAt)) {
                bitSetArr[1].set(i);
            }
        }
        return bitSetArr;
    }

    private static void l(dccx<dudl> dccxVar, String str, dbrb dbrbVar, dbrb dbrbVar2) {
        BitSet[] k = k(str, dbrbVar, dbrbVar2);
        BitSet bitSet = k[0];
        BitSet bitSet2 = k[1];
        int length = str.length();
        if (!bitSet.isEmpty() || !bitSet2.isEmpty()) {
            if (length - bitSet.cardinality() <= 0) {
                return;
            }
            int nextClearBit = bitSet.nextClearBit(0);
            while (nextClearBit < length) {
                int nextSetBit = bitSet.nextSetBit(nextClearBit);
                if (nextSetBit < 0) {
                    nextSetBit = length;
                }
                dccxVar.g(new dudl(str.substring(nextClearBit, nextSetBit), nextClearBit, 2, bitSet));
                int nextSetBit2 = bitSet2.nextSetBit(nextClearBit);
                if (nextSetBit2 >= 0 && bitSet2.nextClearBit(nextSetBit2) < nextSetBit) {
                    h(dccxVar, str, nextClearBit, nextSetBit, bitSet2);
                }
                nextClearBit = bitSet.nextClearBit(nextSetBit);
            }
            return;
        }
        dccxVar.g(new dudl(str, 0, 2, null));
    }
}
