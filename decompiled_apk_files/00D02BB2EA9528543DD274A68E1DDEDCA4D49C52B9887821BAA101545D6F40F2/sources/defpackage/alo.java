package defpackage;
/* compiled from: PG */
/* renamed from: alo  reason: default package */
/* loaded from: classes2.dex */
final class alo {
    private static final byte[] e = new byte[1792];
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public alo(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public static byte a(char c) {
        return c < 1792 ? e[c] : Character.getDirectionality(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte b() {
        char charAt = this.a.charAt(this.c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(this.a, this.c);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c--;
        return a(this.d);
    }
}
