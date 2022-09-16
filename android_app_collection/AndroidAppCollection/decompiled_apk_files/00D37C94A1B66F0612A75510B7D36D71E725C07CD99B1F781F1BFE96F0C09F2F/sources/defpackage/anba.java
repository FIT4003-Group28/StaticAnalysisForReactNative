package defpackage;
/* compiled from: PG */
/* renamed from: anba  reason: default package */
/* loaded from: classes.dex */
public enum anba {
    STRING('s', anbc.GENERAL, "-#", true),
    BOOLEAN('b', anbc.BOOLEAN, "-", true),
    CHAR('c', anbc.CHARACTER, "-", true),
    DECIMAL('d', anbc.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', anbc.INTEGRAL, "-#0(", false),
    HEX('x', anbc.INTEGRAL, "-#0(", true),
    FLOAT('f', anbc.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', anbc.FLOAT, "-#0+ (", true),
    GENERAL('g', anbc.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', anbc.FLOAT, "-#0+ ", true);
    
    public static final anba[] k = new anba[26];
    public final char l;
    public final anbc m;
    public final int n;
    public final String o;

    static {
        anba[] values;
        for (anba anbaVar : values()) {
            k[a(anbaVar.l)] = anbaVar;
        }
    }

    anba(char c, anbc anbcVar, String str, boolean z) {
        this.l = c;
        this.m = anbcVar;
        this.n = anbb.a(str, z);
        StringBuilder sb = new StringBuilder(2);
        sb.append("%");
        sb.append(c);
        this.o = sb.toString();
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }
}
