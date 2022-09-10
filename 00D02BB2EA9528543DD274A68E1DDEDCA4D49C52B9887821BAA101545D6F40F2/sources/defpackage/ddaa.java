package defpackage;
/* compiled from: PG */
/* renamed from: ddaa  reason: default package */
/* loaded from: classes.dex */
final class ddaa extends ddad {
    private ddaa(dczy dczyVar, Character ch) {
        super(dczyVar, ch);
        dbsk.a(dczyVar.b.length == 64);
    }

    @Override // defpackage.ddad, defpackage.ddae
    public final int a(byte[] bArr, CharSequence charSequence) {
        CharSequence g = g(charSequence);
        if (this.b.b(g.length())) {
            int i = 0;
            int i2 = 0;
            while (i < g.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int c = (this.b.c(g.charAt(i)) << 18) | (this.b.c(g.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (c >>> 16);
                if (i4 < g.length()) {
                    int i6 = i4 + 1;
                    int c2 = c | (this.b.c(g.charAt(i4)) << 6);
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) ((c2 >>> 8) & 255);
                    if (i6 < g.length()) {
                        bArr[i7] = (byte) ((c2 | this.b.c(g.charAt(i6))) & 255);
                        i = i6 + 1;
                        i2 = i7 + 1;
                    } else {
                        i = i6;
                        i2 = i7;
                    }
                } else {
                    i2 = i5;
                    i = i4;
                }
            }
            return i2;
        }
        int length = g.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new ddab(sb.toString());
    }

    @Override // defpackage.ddad, defpackage.ddae
    public final void b(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        dbsk.u(0, i, bArr.length);
        int i3 = i;
        while (i3 >= 3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            appendable.append(this.b.a(i6 >>> 18));
            appendable.append(this.b.a((i6 >>> 12) & 63));
            appendable.append(this.b.a((i6 >>> 6) & 63));
            appendable.append(this.b.a(i6 & 63));
            i3 -= 3;
            i2 = i5 + 1;
        }
        if (i2 < i) {
            e(appendable, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.ddad
    public final ddae c(dczy dczyVar) {
        return new ddaa(dczyVar, null);
    }

    public ddaa(String str, String str2, Character ch) {
        this(new dczy(str, str2.toCharArray()), ch);
    }
}
