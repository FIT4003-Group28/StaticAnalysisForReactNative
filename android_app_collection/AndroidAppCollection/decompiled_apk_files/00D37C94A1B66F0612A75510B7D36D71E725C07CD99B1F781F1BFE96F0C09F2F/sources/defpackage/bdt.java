package defpackage;
/* compiled from: PG */
/* renamed from: bdt  reason: default package */
/* loaded from: classes2.dex */
public final class bdt implements ayw {
    private final pxg a;
    private final pwu b = new pwu();

    public bdt(pxg pxgVar) {
        this.a = pxgVar;
    }

    @Override // defpackage.ayw
    public final ayv a(azf azfVar, long j) {
        int g;
        long j2;
        aza azaVar = (aza) azfVar;
        long j3 = azaVar.c;
        int min = (int) Math.min(20000L, azaVar.b - j3);
        this.b.C(min);
        azfVar.j(this.b.a, 0, min);
        pwu pwuVar = this.b;
        int i = -1;
        long j4 = -9223372036854775807L;
        int i2 = -1;
        while (pwuVar.a() >= 4) {
            if (ayx.g(pwuVar.a, pwuVar.b) != 442) {
                pwuVar.H(1);
            } else {
                pwuVar.H(4);
                long a = bdu.a(pwuVar);
                if (a != -9223372036854775807L) {
                    long b = this.a.b(a);
                    if (b > j) {
                        if (j4 == -9223372036854775807L) {
                            return ayv.a(b, j3);
                        }
                        j2 = i2;
                    } else if (100000 + b > j) {
                        j2 = pwuVar.b;
                    } else {
                        i2 = pwuVar.b;
                        j4 = b;
                    }
                    return ayv.b(j3 + j2);
                }
                int i3 = pwuVar.c;
                if (pwuVar.a() < 10) {
                    pwuVar.G(i3);
                } else {
                    pwuVar.H(9);
                    int i4 = pwuVar.i() & 7;
                    if (pwuVar.a() < i4) {
                        pwuVar.G(i3);
                    } else {
                        pwuVar.H(i4);
                        if (pwuVar.a() >= 4) {
                            if (ayx.g(pwuVar.a, pwuVar.b) == 443) {
                                pwuVar.H(4);
                                int m = pwuVar.m();
                                if (pwuVar.a() < m) {
                                    pwuVar.G(i3);
                                } else {
                                    pwuVar.H(m);
                                }
                            }
                            while (true) {
                                if (pwuVar.a() < 4 || (g = ayx.g(pwuVar.a, pwuVar.b)) == 442 || g == 441 || (g >>> 8) != 1) {
                                    break;
                                }
                                pwuVar.H(4);
                                if (pwuVar.a() >= 2) {
                                    pwuVar.G(Math.min(pwuVar.c, pwuVar.b + pwuVar.m()));
                                } else {
                                    pwuVar.G(i3);
                                    break;
                                }
                            }
                        } else {
                            pwuVar.G(i3);
                        }
                    }
                }
                i = pwuVar.b;
            }
        }
        return j4 != -9223372036854775807L ? ayv.c(j4, j3 + i) : ayv.a;
    }

    @Override // defpackage.ayw
    public final void b() {
        this.b.D(pxi.f);
    }
}
