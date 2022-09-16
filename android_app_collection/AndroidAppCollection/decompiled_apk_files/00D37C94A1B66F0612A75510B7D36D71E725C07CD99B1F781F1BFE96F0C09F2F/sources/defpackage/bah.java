package defpackage;
/* compiled from: PG */
/* renamed from: bah  reason: default package */
/* loaded from: classes2.dex */
public final class bah implements ayw {
    private final azn a;
    private final int b;
    private final azj c = new azj();

    public bah(azn aznVar, int i) {
        this.a = aznVar;
        this.b = i;
    }

    private final long c(azf azfVar) {
        aza azaVar;
        while (true) {
            azaVar = (aza) azfVar;
            if (azfVar.d() >= azaVar.b - 6) {
                break;
            }
            azn aznVar = this.a;
            int i = this.b;
            azj azjVar = this.c;
            long d = azfVar.d();
            byte[] bArr = new byte[2];
            azfVar.j(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                azfVar.l();
                azfVar.f((int) (d - azaVar.c));
            } else {
                pwu pwuVar = new pwu(16);
                System.arraycopy(bArr, 0, pwuVar.a, 0, 2);
                pwuVar.F(asg.b(azfVar, pwuVar.a, 2, 14));
                azfVar.l();
                azfVar.f((int) (d - azaVar.c));
                if (awz.d(pwuVar, aznVar, i, azjVar)) {
                    break;
                }
            }
            azfVar.f(1);
        }
        long d2 = azfVar.d();
        long j = azaVar.b;
        if (d2 >= (-6) + j) {
            azfVar.f((int) (j - azfVar.d()));
            return this.a.j;
        }
        return this.c.a;
    }

    @Override // defpackage.ayw
    public final ayv a(azf azfVar, long j) {
        long j2 = ((aza) azfVar).c;
        long c = c(azfVar);
        long d = azfVar.d();
        azfVar.f(Math.max(6, this.a.c));
        long c2 = c(azfVar);
        return (c > j || c2 <= j) ? c2 <= j ? ayv.c(c2, azfVar.d()) : ayv.a(c, j2) : ayv.b(d);
    }

    @Override // defpackage.ayw
    public final /* synthetic */ void b() {
    }
}
