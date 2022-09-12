package defpackage;
/* compiled from: PG */
/* renamed from: ckco  reason: default package */
/* loaded from: classes.dex */
public final class ckco {
    @dzsi
    private final cnkl a;

    public ckco() {
        this(null);
    }

    public ckco(@dzsi cnkl cnklVar) {
        this.a = cnklVar;
    }

    public final void a(int i) {
        cnkl cnklVar = this.a;
        if (cnklVar != null) {
            cnklVar.a(i, 1L, cnkr.e);
        }
    }

    public final void b(int i, long j) {
        cnkl cnklVar = this.a;
        if (cnklVar != null) {
            cnklVar.a(i, j, cnkr.e);
        }
    }

    public final long c(int i) {
        Integer g;
        cnkr cnkrVar;
        cnkl cnklVar = this.a;
        long j = 0;
        if (cnklVar == null) {
            return 0L;
        }
        long j2 = i;
        cnkk cnkkVar = cnkr.e;
        cnklVar.d.h.readLock().lock();
        try {
            synchronized (cnklVar.b) {
                if (cnkkVar == cnkr.e) {
                    cnkr cnkrVar2 = cnklVar.d;
                    g = cnkrVar2.m;
                    if (g == null) {
                        g = cnkrVar2.g(cnkrVar2.l);
                    }
                } else {
                    g = cnklVar.d.g(cnkkVar);
                }
                if (g == null) {
                    cnkrVar = cnklVar.d;
                } else {
                    aik<long[]> b = cnklVar.c.b(g.intValue());
                    if (b == null) {
                        cnkrVar = cnklVar.d;
                    } else {
                        long[] b2 = b.b(j2);
                        if (b2 == null) {
                            cnkrVar = cnklVar.d;
                        } else {
                            j = b2[0];
                            cnkrVar = cnklVar.d;
                        }
                    }
                }
            }
            cnkrVar.h.readLock().unlock();
            return j;
        } catch (Throwable th) {
            cnklVar.d.h.readLock().unlock();
            throw th;
        }
    }

    public final String toString() {
        cnkl cnklVar = this.a;
        return cnklVar == null ? "" : cnklVar.toString();
    }
}
