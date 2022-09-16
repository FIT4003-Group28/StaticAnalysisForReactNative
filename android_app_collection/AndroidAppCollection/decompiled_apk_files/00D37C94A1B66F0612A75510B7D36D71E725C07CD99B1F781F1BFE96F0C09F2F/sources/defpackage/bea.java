package defpackage;
/* compiled from: PG */
/* renamed from: bea  reason: default package */
/* loaded from: classes2.dex */
public final class bea implements ayw {
    private final pxg a;
    private final pwu b = new pwu();
    private final int c;

    public bea(int i, pxg pxgVar) {
        this.c = i;
        this.a = pxgVar;
    }

    @Override // defpackage.ayw
    public final ayv a(azf azfVar, long j) {
        int d;
        int d2;
        long j2;
        aza azaVar = (aza) azfVar;
        long j3 = azaVar.c;
        int min = (int) Math.min(112800L, azaVar.b - j3);
        this.b.C(min);
        azfVar.j(this.b.a, 0, min);
        pwu pwuVar = this.b;
        int i = pwuVar.c;
        long j4 = -1;
        long j5 = -1;
        long j6 = -9223372036854775807L;
        while (pwuVar.a() >= 188 && (d2 = (d = jb.d(pwuVar.a, pwuVar.b, i)) + 188) <= i) {
            long e = jb.e(pwuVar, d, this.c);
            if (e != -9223372036854775807L) {
                long b = this.a.b(e);
                if (b > j) {
                    if (j6 == -9223372036854775807L) {
                        return ayv.a(b, j3);
                    }
                    j2 = j3 + j5;
                } else if (100000 + b > j) {
                    j2 = j3 + d;
                } else {
                    j5 = d;
                    j6 = b;
                }
                return ayv.b(j2);
            }
            pwuVar.G(d2);
            j4 = d2;
        }
        return j6 != -9223372036854775807L ? ayv.c(j6, j3 + j4) : ayv.a;
    }

    @Override // defpackage.ayw
    public final void b() {
        this.b.D(pxi.f);
    }
}
