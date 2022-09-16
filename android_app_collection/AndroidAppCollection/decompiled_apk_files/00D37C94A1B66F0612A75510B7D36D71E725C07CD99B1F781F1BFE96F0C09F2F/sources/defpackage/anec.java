package defpackage;
/* compiled from: PG */
/* renamed from: anec  reason: default package */
/* loaded from: classes.dex */
final class anec extends anef {
    final char[] a;

    public anec(aneb anebVar) {
        super(anebVar, null);
        this.a = new char[512];
        aqxo.p(anebVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = anebVar.a(i >>> 4);
            this.a[i | 256] = anebVar.a(i & 15);
        }
    }

    @Override // defpackage.anef, defpackage.aneg
    public final int a(byte[] bArr, CharSequence charSequence) {
        bArr.getClass();
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.b.b(charSequence.charAt(i)) << 4) | this.b.b(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new anee(sb.toString());
    }

    @Override // defpackage.anef
    public final aneg b(aneb anebVar, Character ch) {
        return new anec(anebVar);
    }

    @Override // defpackage.anef, defpackage.aneg
    public final void c(Appendable appendable, byte[] bArr, int i) {
        aqxo.x(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.a[i3]);
            appendable.append(this.a[i3 | 256]);
        }
    }
}
