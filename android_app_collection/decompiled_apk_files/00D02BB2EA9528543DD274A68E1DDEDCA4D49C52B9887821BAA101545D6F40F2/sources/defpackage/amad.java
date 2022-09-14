package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amad  reason: default package */
/* loaded from: classes2.dex */
public final class amad {
    public final btnc<alyh, Long> a;
    public final btnc<alyh, Long> b;
    private final cqat c;
    private final akry d;
    private final akrz e;

    public amad(btmv btmvVar, akry akryVar, cqat cqatVar, akrz akrzVar) {
        this.a = new btnc<>(1000, btmz.STALE_TILE, btmvVar);
        this.b = new btnc<>(1000, btmz.RECENTLY_UPDATED_TILE, btmvVar);
        this.d = akryVar;
        this.c = cqatVar;
        this.e = akrzVar;
    }

    private final long c(long j) {
        return j - this.e.d(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(alyh alyhVar) {
        this.a.o(alyhVar);
        long e = this.c.e();
        long c = c(e);
        this.b.Pz(alyhVar, Long.valueOf(e));
        int i = alyhVar.a;
        while (true) {
            i--;
            if (i > 0) {
                alyh j = alyhVar.j(i);
                Long n = this.b.n(j);
                if (n == null || n.longValue() < c) {
                    this.a.Pz(j, Long.valueOf(e));
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(alyh alyhVar, long j) {
        Long n = this.a.n(alyhVar);
        if (n == null || c(n.longValue()) <= j) {
            Long n2 = this.b.n(alyhVar);
            int i = alyhVar.a;
            while (true) {
                i--;
                if (i <= 0) {
                    return false;
                }
                Long n3 = this.b.n(alyhVar.j(i));
                if (n3 != null) {
                    long c = c(n3.longValue());
                    if (j < n3.longValue() && (n2 == null || n2.longValue() < c)) {
                        break;
                    }
                }
            }
            return true;
        }
        return true;
    }
}
