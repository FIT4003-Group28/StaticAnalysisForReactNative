package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dbra  reason: default package */
/* loaded from: classes.dex */
public final class dbra extends dbqu {
    static final int a = Integer.numberOfLeadingZeros(31);
    public static final dbra b = new dbra();

    public dbra() {
        super("CharMatcher.whitespace()");
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> a) == c;
    }

    @Override // defpackage.dbrb
    public final void l(BitSet bitSet) {
        for (int i = 0; i < 32; i++) {
            bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i));
        }
    }
}
