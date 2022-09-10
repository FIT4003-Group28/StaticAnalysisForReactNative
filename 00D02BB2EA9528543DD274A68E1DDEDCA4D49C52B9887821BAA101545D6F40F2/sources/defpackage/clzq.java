package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clzq  reason: default package */
/* loaded from: classes5.dex */
public final class clzq implements cluf {
    private final cmnv a;
    private final cmnk b = new cmnk();

    public clzq(cmnv cmnvVar) {
        this.a = cmnvVar;
    }

    @Override // defpackage.cluf
    public final void a() {
        this.b.b(cmny.f);
    }

    @Override // defpackage.cluf
    public final clue b(cluk clukVar, long j) {
        int g;
        long j2;
        long j3 = clukVar.c;
        int min = (int) Math.min(20000L, clukVar.b - j3);
        this.b.a(min);
        clukVar.f(this.b.a, 0, min);
        cmnk cmnkVar = this.b;
        int i = -1;
        long j4 = -9223372036854775807L;
        int i2 = -1;
        while (cmnkVar.d() >= 4) {
            if (clzr.g(cmnkVar.a, cmnkVar.b) != 442) {
                cmnkVar.h(1);
            } else {
                cmnkVar.h(4);
                long a = clzs.a(cmnkVar);
                if (a != -9223372036854775807L) {
                    long d = this.a.d(a);
                    if (d > j) {
                        if (j4 == -9223372036854775807L) {
                            return clue.a(d, j3);
                        }
                        j2 = i2;
                    } else if (100000 + d > j) {
                        j2 = cmnkVar.b;
                    } else {
                        i2 = cmnkVar.b;
                        j4 = d;
                    }
                    return clue.c(j3 + j2);
                }
                int i3 = cmnkVar.c;
                if (cmnkVar.d() < 10) {
                    cmnkVar.f(i3);
                } else {
                    cmnkVar.h(9);
                    int l = cmnkVar.l() & 7;
                    if (cmnkVar.d() < l) {
                        cmnkVar.f(i3);
                    } else {
                        cmnkVar.h(l);
                        if (cmnkVar.d() >= 4) {
                            if (clzr.g(cmnkVar.a, cmnkVar.b) == 443) {
                                cmnkVar.h(4);
                                int m = cmnkVar.m();
                                if (cmnkVar.d() < m) {
                                    cmnkVar.f(i3);
                                } else {
                                    cmnkVar.h(m);
                                }
                            }
                            while (true) {
                                if (cmnkVar.d() < 4 || (g = clzr.g(cmnkVar.a, cmnkVar.b)) == 442 || g == 441 || (g >>> 8) != 1) {
                                    break;
                                }
                                cmnkVar.h(4);
                                if (cmnkVar.d() >= 2) {
                                    cmnkVar.f(Math.min(cmnkVar.c, cmnkVar.b + cmnkVar.m()));
                                } else {
                                    cmnkVar.f(i3);
                                    break;
                                }
                            }
                        } else {
                            cmnkVar.f(i3);
                        }
                    }
                }
                i = cmnkVar.b;
            }
        }
        return j4 != -9223372036854775807L ? clue.b(j4, j3 + i) : clue.a;
    }
}
