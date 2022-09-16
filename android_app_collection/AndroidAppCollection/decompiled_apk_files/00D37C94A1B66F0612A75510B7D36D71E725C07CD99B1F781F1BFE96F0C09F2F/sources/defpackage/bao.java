package defpackage;
/* compiled from: PG */
/* renamed from: bao  reason: default package */
/* loaded from: classes2.dex */
final class bao extends ban {
    private final pwu a;
    private final pwu b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;

    public bao(bab babVar) {
        super(babVar);
        this.a = new pwu(pwo.a);
        this.b = new pwu(4);
    }

    @Override // defpackage.ban
    protected final boolean a(pwu pwuVar) {
        int i = pwuVar.i();
        int i2 = i >> 4;
        int i3 = i & 15;
        if (i3 == 7) {
            this.g = i2;
            return i2 != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i3);
        throw new bam(sb.toString());
    }

    @Override // defpackage.ban
    protected final boolean b(pwu pwuVar, long j) {
        int i = pwuVar.i();
        byte[] bArr = pwuVar.a;
        int i2 = pwuVar.b;
        int i3 = i2 + 1;
        pwuVar.b = i3;
        byte b = bArr[i2];
        int i4 = i3 + 1;
        pwuVar.b = i4;
        byte b2 = bArr[i3];
        pwuVar.b = i4 + 1;
        long j2 = j + (((bArr[i4] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8)) * 1000);
        if (i == 0) {
            if (!this.e) {
                pwu pwuVar2 = new pwu(new byte[pwuVar.a()]);
                pwuVar.B(pwuVar2.a, 0, pwuVar.a());
                ayq a = ayq.a(pwuVar2);
                this.c = a.b;
                pis pisVar = new pis();
                pisVar.k = "video/avc";
                pisVar.h = a.f;
                pisVar.p = a.c;
                pisVar.q = a.d;
                pisVar.t = a.e;
                pisVar.m = a.a;
                this.d.rx(pisVar.a());
                this.e = true;
                return false;
            }
        } else if (i == 1 && this.e) {
            int i5 = this.g == 1 ? 1 : 0;
            if (!this.f && i5 == 0) {
                return false;
            }
            byte[] bArr2 = this.b.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i6 = 4 - this.c;
            int i7 = 0;
            while (pwuVar.a() > 0) {
                pwuVar.B(this.b.a, i6, this.c);
                this.b.G(0);
                int l = this.b.l();
                this.a.G(0);
                this.d.c(this.a, 4);
                this.d.c(pwuVar, l);
                i7 = i7 + 4 + l;
            }
            this.d.e(j2, i5, i7, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
