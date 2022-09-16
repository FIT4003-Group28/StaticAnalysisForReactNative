package defpackage;
/* compiled from: PG */
/* renamed from: czfd  reason: default package */
/* loaded from: classes5.dex */
public abstract class czfd {
    static final Character a = 9786;
    private static final dbrb b = dbrb.p('0', '9').j(dbrb.p('a', 'z')).m();

    public abstract String a(String str);

    public abstract String b(String str);

    public final Character c(String str) {
        if (dbsj.d(str)) {
            return a;
        }
        if (str.codePointCount(0, str.length()) > 3) {
            str = str.substring(0, str.offsetByCodePoints(0, 3));
        }
        int codePointAt = b(a(str)).codePointAt(0);
        if (codePointAt <= 65535) {
            char c = (char) codePointAt;
            if (b.b(c)) {
                return Character.valueOf(c);
            }
        }
        return a;
    }
}
