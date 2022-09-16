package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzmh  reason: default package */
/* loaded from: classes.dex */
public final class bzmh implements bzmm {
    private static final dcqe c = dcqe.c("bzmh");
    private static final long d = TimeUnit.DAYS.toMillis(1);
    private final ckcw e;
    private final btvo f;
    private final bvjj g;
    private final cqat h;
    private final bzmf i;
    private final asik j;
    private final btpc k;
    private final bzme l;
    private final Boolean m;
    private final atbs n;

    public bzmh(ckcw ckcwVar, btvo btvoVar, bvjj bvjjVar, cqat cqatVar, bzmf bzmfVar, asik asikVar, btpc btpcVar, atbs atbsVar, bzme bzmeVar, Boolean bool) {
        this.e = ckcwVar;
        this.f = btvoVar;
        this.g = bvjjVar;
        this.h = cqatVar;
        this.i = bzmfVar;
        this.j = asikVar;
        this.k = btpcVar;
        this.n = atbsVar;
        this.l = bzmeVar;
        this.m = bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        if ((r8 - r6) < r10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
        if (r8 >= r14.g.w(defpackage.bvjk.gr, 0)) goto L45;
     */
    @Override // defpackage.bzmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.bzml r15) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzmh.a(bzml):boolean");
    }

    @Override // defpackage.bzmm
    public final bzmk b(dqkc dqkcVar) {
        if (dqkcVar == dqkc.UNKNOWN_TUTORIAL_TYPE) {
            return bzmk.NONE;
        }
        return this.i.d(dqkcVar);
    }

    @Override // defpackage.bzmm
    public final long c(dqkc dqkcVar) {
        if (dqkcVar == dqkc.UNKNOWN_TUTORIAL_TYPE) {
            return -1L;
        }
        return this.i.e(dqkcVar);
    }

    @Override // defpackage.bzmm
    public final int d(dqkc dqkcVar) {
        if (dqkcVar == dqkc.UNKNOWN_TUTORIAL_TYPE) {
            return 0;
        }
        return this.i.f(dqkcVar);
    }

    @Override // defpackage.bzmm
    public final void e(dqkc dqkcVar) {
        if (dqkcVar == dqkc.UNKNOWN_TUTORIAL_TYPE) {
            return;
        }
        this.i.b(dqkcVar);
    }

    @Override // defpackage.bzmm
    public final void f(dqkc dqkcVar) {
        if (!ckkn.c.containsKey(dqkcVar)) {
            return;
        }
        long e = this.i.e(dqkcVar);
        if (e == -1) {
            return;
        }
        long b = this.h.b();
        if (b <= e || b >= TimeUnit.HOURS.toMillis(1L) + e) {
            return;
        }
        ((ckcp) this.e.a(ckkn.c.get(dqkcVar))).a(b - e);
    }
}
