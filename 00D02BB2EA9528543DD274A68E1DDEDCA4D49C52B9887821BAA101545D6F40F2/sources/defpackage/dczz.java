package defpackage;
/* compiled from: PG */
/* renamed from: dczz  reason: default package */
/* loaded from: classes.dex */
final class dczz extends ddad {
    final char[] a;

    public dczz(dczy dczyVar) {
        super(dczyVar, null);
        this.a = new char[512];
        dbsk.a(dczyVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = dczyVar.a(i >>> 4);
            this.a[i | 256] = dczyVar.a(i & 15);
        }
    }

    @Override // defpackage.ddad, defpackage.ddae
    public final int a(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.b.c(charSequence.charAt(i)) << 4) | this.b.c(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new ddab(sb.toString());
    }

    @Override // defpackage.ddad, defpackage.ddae
    public final void b(Appendable appendable, byte[] bArr, int i) {
        dbsk.u(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.a[i3]);
            appendable.append(this.a[i3 | 256]);
        }
    }

    @Override // defpackage.ddad
    public final ddae c(dczy dczyVar) {
        return new dczz(dczyVar);
    }
}
