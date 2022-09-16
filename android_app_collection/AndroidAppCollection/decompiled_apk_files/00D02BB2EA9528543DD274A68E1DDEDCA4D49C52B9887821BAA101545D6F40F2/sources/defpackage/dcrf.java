package defpackage;
/* compiled from: PG */
/* renamed from: dcrf  reason: default package */
/* loaded from: classes.dex */
public enum dcrf {
    STRING('s', dcrh.GENERAL, "-#", true),
    BOOLEAN('b', dcrh.BOOLEAN, "-", true),
    CHAR('c', dcrh.CHARACTER, "-", true),
    DECIMAL('d', dcrh.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', dcrh.INTEGRAL, "-#0(", false),
    HEX('x', dcrh.INTEGRAL, "-#0(", true),
    FLOAT('f', dcrh.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', dcrh.FLOAT, "-#0+ (", true),
    GENERAL('g', dcrh.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', dcrh.FLOAT, "-#0+ ", true);
    
    public static final dcrf[] k = new dcrf[26];
    public final char l;
    public final dcrh m;
    public final int n;
    public final String o;

    static {
        dcrf[] values;
        for (dcrf dcrfVar : values()) {
            k[a(dcrfVar.l)] = dcrfVar;
        }
    }

    dcrf(char c, dcrh dcrhVar, String str, boolean z) {
        this.l = c;
        this.m = dcrhVar;
        this.n = dcrg.b(str, z);
        StringBuilder sb = new StringBuilder(2);
        sb.append("%");
        sb.append(c);
        this.o = sb.toString();
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }

    public static boolean b(char c) {
        return (c & ' ') != 0;
    }
}
