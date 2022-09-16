package defpackage;
/* compiled from: PG */
/* renamed from: clzz  reason: default package */
/* loaded from: classes5.dex */
final class clzz implements cluf {
    private final cmnv a;
    private final cmnk b = new cmnk();
    private final int c;

    public clzz(int i, cmnv cmnvVar) {
        this.c = i;
        this.a = cmnvVar;
    }

    @Override // defpackage.cluf
    public final void a() {
        this.b.b(cmny.f);
    }

    @Override // defpackage.cluf
    public final clue b(cluk clukVar, long j) {
        int a;
        int a2;
        long j2;
        long j3 = clukVar.c;
        int min = (int) Math.min(112800L, clukVar.b - j3);
        this.b.a(min);
        clukVar.f(this.b.a, 0, min);
        cmnk cmnkVar = this.b;
        int i = cmnkVar.c;
        long j4 = -1;
        long j5 = -1;
        long j6 = -9223372036854775807L;
        while (cmnkVar.d() >= 188 && (a2 = (a = cmal.a(cmnkVar.a, cmnkVar.b, i)) + 188) <= i) {
            long b = cmal.b(cmnkVar, a, this.c);
            if (b != -9223372036854775807L) {
                long d = this.a.d(b);
                if (d > j) {
                    if (j6 == -9223372036854775807L) {
                        return clue.a(d, j3);
                    }
                    j2 = j3 + j5;
                } else if (100000 + d > j) {
                    j2 = j3 + a;
                } else {
                    j5 = a;
                    j6 = d;
                }
                return clue.c(j2);
            }
            cmnkVar.f(a2);
            j4 = a2;
        }
        return j6 != -9223372036854775807L ? clue.b(j6, j3 + j4) : clue.a;
    }
}
