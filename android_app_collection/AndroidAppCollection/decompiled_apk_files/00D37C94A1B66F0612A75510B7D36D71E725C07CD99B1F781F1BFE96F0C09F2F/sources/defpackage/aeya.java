package defpackage;
/* compiled from: PG */
/* renamed from: aeya  reason: default package */
/* loaded from: classes.dex */
final class aeya {
    final pqb a;
    ppe c;
    boolean d;
    pkt e;
    long b = 0;
    long f = -1;

    public aeya(pqb pqbVar) {
        this.a = pqbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a() {
        long j = this.f;
        if (j == -1) {
            return Long.MIN_VALUE;
        }
        return j * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(long j) {
        afms.b(j >= 0);
        if (this.b == j) {
            return false;
        }
        this.b = j;
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(long j) {
        afms.b(j > 0 || j == -1);
        if (this.f != j) {
            this.f = j;
            ppe ppeVar = this.c;
            if (ppeVar != null) {
                ppeVar.n(0L, a());
                return true;
            }
        }
        return false;
    }
}
