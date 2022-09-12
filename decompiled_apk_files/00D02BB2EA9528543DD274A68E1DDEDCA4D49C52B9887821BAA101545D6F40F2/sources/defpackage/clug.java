package defpackage;
/* compiled from: PG */
/* renamed from: clug  reason: default package */
/* loaded from: classes5.dex */
public class clug {
    public final clua a;
    protected final cluf b;
    protected cluc c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public clug(clud cludVar, cluf clufVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = clufVar;
        this.d = i;
        this.a = new clua(cludVar, j, j2, j3, j4, j5);
    }

    protected static final int e(cluk clukVar, long j, clvd clvdVar) {
        if (j == clukVar.c) {
            return 0;
        }
        clvdVar.a = j;
        return 1;
    }

    protected static final boolean f(cluk clukVar, long j) {
        long j2 = j - clukVar.c;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        clukVar.d((int) j2);
        return true;
    }

    public final void a(long j) {
        cluc clucVar = this.c;
        if (clucVar == null || clucVar.a != j) {
            long a = this.a.a.a(j);
            clua cluaVar = this.a;
            this.c = new cluc(j, a, cluaVar.b, cluaVar.c, cluaVar.d, cluaVar.e);
        }
    }

    public final boolean b() {
        return this.c != null;
    }

    public final int c(cluk clukVar, clvd clvdVar) {
        while (true) {
            cluc clucVar = this.c;
            cmmn.e(clucVar);
            long j = clucVar.e;
            long j2 = clucVar.f;
            long j3 = clucVar.g;
            if (j2 - j > this.d) {
                if (f(clukVar, j3)) {
                    clukVar.i();
                    clue b = this.b.b(clukVar, clucVar.b);
                    int i = b.b;
                    if (i == -3) {
                        d();
                        return e(clukVar, j3, clvdVar);
                    } else if (i == -2) {
                        long j4 = b.c;
                        long j5 = b.d;
                        clucVar.c = j4;
                        clucVar.e = j5;
                        clucVar.b();
                    } else if (i == -1) {
                        long j6 = b.c;
                        long j7 = b.d;
                        clucVar.d = j6;
                        clucVar.f = j7;
                        clucVar.b();
                    } else {
                        f(clukVar, b.d);
                        long j8 = b.d;
                        d();
                        return e(clukVar, b.d, clvdVar);
                    }
                } else {
                    return e(clukVar, j3, clvdVar);
                }
            } else {
                d();
                return e(clukVar, j, clvdVar);
            }
        }
    }

    protected final void d() {
        this.c = null;
        this.b.a();
    }
}
