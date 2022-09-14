package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: aybh  reason: default package */
/* loaded from: classes3.dex */
final class aybh implements Comparator<baal> {
    private final long a;

    public aybh(cqat cqatVar) {
        this.a = cqatVar.b();
    }

    private final int a(baal baalVar) {
        if (baalVar.x() != baaj.EXPERIENCE) {
            return 2;
        }
        baai A = baalVar.A();
        dbsk.s(A);
        dpop g = A.g();
        if (g == null) {
            return 2;
        }
        long j = g.b;
        if (j == 0 && g.c == 0) {
            return 2;
        }
        long j2 = this.a;
        return (j >= j2 || g.c >= j2) ? 1 : 3;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(baal baalVar, baal baalVar2) {
        baal baalVar3 = baalVar;
        baal baalVar4 = baalVar2;
        int a = a(baalVar3);
        int a2 = a(baalVar4);
        if (a != a2) {
            if (a == 1) {
                return -1;
            }
            return (a == 3 || a2 == 1) ? 1 : -1;
        }
        int i = a - 1;
        if (i == 1 || i == 2) {
            return 0;
        }
        baai A = baalVar3.A();
        dbsk.s(A);
        dpop g = A.g();
        dbsk.s(g);
        baai A2 = baalVar4.A();
        dbsk.s(A2);
        dpop g2 = A2.g();
        dbsk.s(g2);
        long j = g.b;
        long j2 = g2.b;
        return j != j2 ? (j > j2 ? 1 : (j == j2 ? 0 : -1)) : (g.c > g2.c ? 1 : (g.c == g2.c ? 0 : -1));
    }
}
