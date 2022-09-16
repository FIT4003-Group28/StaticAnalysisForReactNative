package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aexz  reason: default package */
/* loaded from: classes.dex */
final class aexz extends pkt {
    private final pkt[] a;
    private final long[] b;
    private final long[] d;
    private final Object[] e;
    private final AtomicInteger f;
    private final int g;

    public aexz(aeya aeyaVar, aeya aeyaVar2, AtomicInteger atomicInteger, int i) {
        pkt pktVar = aeyaVar.e;
        pkt pktVar2 = aeyaVar2 != null ? aeyaVar2.e : null;
        boolean h = h(pktVar);
        boolean h2 = h(pktVar2);
        if (h) {
            this.a = new pkt[0];
            long[] jArr = new long[0];
            this.b = jArr;
            this.d = jArr;
            this.e = new Object[0];
        } else if (!h2) {
            this.a = new pkt[]{pktVar, pktVar2};
            this.b = new long[]{aeyaVar.b, aeyaVar2.b};
            this.d = new long[]{aeyaVar.f, aeyaVar2.f};
            this.e = new Object[]{aeyaVar, aeyaVar2};
        } else {
            this.a = new pkt[]{pktVar};
            this.b = new long[]{aeyaVar.b};
            this.d = new long[]{aeyaVar.f};
            this.e = new Object[]{aeyaVar};
        }
        this.f = atomicInteger;
        this.g = i;
    }

    private static boolean h(pkt pktVar) {
        int q;
        int i = 1;
        if (pktVar == null || (q = pktVar.q()) == 0) {
            return true;
        }
        if (q != 1) {
            i = q;
        } else if (pktVar.p() == 1) {
            return false;
        }
        int p = pktVar.p();
        StringBuilder sb = new StringBuilder(74);
        sb.append("Child Timeline too complex windowCount ");
        sb.append(i);
        sb.append(" periodCount ");
        sb.append(p);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.pkt
    public final int b(Object obj) {
        int i = 0;
        while (true) {
            Object[] objArr = this.e;
            if (i < objArr.length) {
                if (objArr[i] == obj) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override // defpackage.pkt
    public final pkr e(int i, pkr pkrVar, boolean z) {
        this.a[i].e(0, pkrVar, z);
        pkrVar.c = i;
        if (z) {
            pkrVar.b = this.e[i];
        }
        long j = this.d[i];
        if (j != -1) {
            pkrVar.d = j * 1000;
        }
        return pkrVar;
    }

    @Override // defpackage.pkt
    public final pks g(int i, pks pksVar, long j) {
        this.a[i].g(0, pksVar, j);
        pksVar.b = this.e[i];
        pksVar.o = i;
        pksVar.p = i;
        pksVar.c = new aexy(this.g, this.f, this.a[i], pksVar.c);
        long j2 = this.b[i];
        if (j2 != 0) {
            long j3 = (j2 * 1000) - pksVar.q;
            pksVar.m = j3;
            if (j3 < 0) {
                afki afkiVar = afki.ABR;
                pksVar.m = 0L;
            } else {
                long j4 = pksVar.n;
                if (j4 != -9223372036854775807L && j3 > j4) {
                    afki afkiVar2 = afki.ABR;
                }
            }
        }
        long j5 = this.d[i];
        if (j5 != -1) {
            long j6 = (j5 * 1000) - pksVar.q;
            if (pksVar.m > j6) {
                pksVar.m = j6;
            }
            if (pksVar.n > j6) {
                pksVar.n = j6;
            }
        }
        return pksVar;
    }

    @Override // defpackage.pkt
    public final Object j(int i) {
        return this.e[i];
    }

    @Override // defpackage.pkt
    public final int p() {
        return this.a.length;
    }

    @Override // defpackage.pkt
    public final int q() {
        return this.a.length;
    }
}
