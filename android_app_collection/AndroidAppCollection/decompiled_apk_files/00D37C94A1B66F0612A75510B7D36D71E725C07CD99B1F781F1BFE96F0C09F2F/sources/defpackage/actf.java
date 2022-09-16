package defpackage;
/* compiled from: PG */
/* renamed from: actf  reason: default package */
/* loaded from: classes.dex */
public final class actf {
    public final long a;

    public actf(long j) {
        this.a = j;
    }

    public actf(asvv asvvVar) {
        long j;
        if (asvvVar == null || (asvvVar.c & 2) == 0) {
            j = 0;
        } else {
            awbr awbrVar = asvvVar.e;
            j = (awbrVar == null ? awbr.a : awbrVar).c;
        }
        this.a = j;
    }

    private static boolean c(long j, int i) {
        return (j & ((long) (i + (-1)))) > 0;
    }

    public final int a() {
        if (c(this.a, 9)) {
            return 9;
        }
        return c(this.a, 3) ? 3 : 1;
    }

    public final int b() {
        if (c(this.a, 5)) {
            return 5;
        }
        return c(this.a, 2) ? 2 : 1;
    }
}
