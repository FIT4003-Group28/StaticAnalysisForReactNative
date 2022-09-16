package defpackage;
/* compiled from: PG */
/* renamed from: ayx  reason: default package */
/* loaded from: classes2.dex */
public final class ayx {
    public final ayr a;
    protected final ayw b;
    protected ayt c;
    private final int d;

    public ayx(ayu ayuVar, ayw aywVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = aywVar;
        this.d = i;
        this.a = new ayr(ayuVar, j, j2, j3, j4, j5);
    }

    protected static final int e(azf azfVar, long j, azv azvVar) {
        if (j == ((aza) azfVar).c) {
            return 0;
        }
        azvVar.a = j;
        return 1;
    }

    protected static final boolean f(azf azfVar, long j) {
        long j2 = j - ((aza) azfVar).c;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        azfVar.m((int) j2);
        return true;
    }

    public static int g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int a(azf azfVar, azv azvVar) {
        while (true) {
            ayt aytVar = this.c;
            ptx.b(aytVar);
            long j = aytVar.e;
            long j2 = aytVar.f;
            long j3 = aytVar.g;
            if (j2 - j > this.d) {
                if (f(azfVar, j3)) {
                    azfVar.l();
                    ayv a = this.b.a(azfVar, aytVar.b);
                    int i = a.b;
                    if (i == -3) {
                        d();
                        return e(azfVar, j3, azvVar);
                    } else if (i == -2) {
                        long j4 = a.c;
                        long j5 = a.d;
                        aytVar.c = j4;
                        aytVar.e = j5;
                        aytVar.b();
                    } else if (i == -1) {
                        long j6 = a.c;
                        long j7 = a.d;
                        aytVar.d = j6;
                        aytVar.f = j7;
                        aytVar.b();
                    } else {
                        f(azfVar, a.d);
                        d();
                        return e(azfVar, a.d, azvVar);
                    }
                } else {
                    return e(azfVar, j3, azvVar);
                }
            } else {
                d();
                return e(azfVar, j, azvVar);
            }
        }
    }

    public final void b(long j) {
        ayt aytVar = this.c;
        if (aytVar == null || aytVar.a != j) {
            long a = this.a.a.a(j);
            ayr ayrVar = this.a;
            this.c = new ayt(j, a, ayrVar.b, ayrVar.c, ayrVar.d, ayrVar.e);
        }
    }

    public final boolean c() {
        return this.c != null;
    }

    protected final void d() {
        this.c = null;
        this.b.b();
    }
}
