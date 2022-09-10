package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bxkv  reason: default package */
/* loaded from: classes4.dex */
public class bxkv extends cjtj {
    public static final dcqe a = dcqe.c("bxkv");
    public static final int[] b = {100, 200, cpnx.a, 400, 500, 700, 1000, 1500, 2000, Integer.MAX_VALUE};
    public final long c;
    private final long d;
    private final bxkr e;
    private final dcdc<bxkx> f;
    private boolean g;

    public bxkv(long j, long j2, bxkr bxkrVar, List<bxkx> list, cqat cqatVar) {
        super(cqatVar);
        this.g = false;
        this.c = j;
        this.d = j2;
        this.e = bxkrVar;
        this.f = dcdc.r(list);
    }

    private static ddgf t(dwjj dwjjVar, int i) {
        ddge bZ = ddgf.e.bZ();
        if ((dwjjVar.a & 8) != 0) {
            dvuh dvuhVar = dwjjVar.e;
            if (dvuhVar == null) {
                dvuhVar = dvuh.d;
            }
            if ((dvuhVar.a & 2) != 0) {
                int i2 = dvuhVar.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddgf ddgfVar = (ddgf) bZ.b;
                ddgfVar.a |= 2;
                ddgfVar.c = i2;
            }
            dsrf dsrfVar = dvuhVar.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddgf ddgfVar2 = (ddgf) bZ.b;
            dsrf dsrfVar2 = ddgfVar2.d;
            if (!dsrfVar2.a()) {
                ddgfVar2.d = dsqw.cg(dsrfVar2);
            }
            dsod.bv(dsrfVar, ddgfVar2.d);
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddgf ddgfVar3 = (ddgf) bZ.b;
        int i3 = ddgfVar3.a | 1;
        ddgfVar3.a = i3;
        ddgfVar3.b = i;
        if ((i3 & 2) == 0) {
            ddgfVar3.a = i3 | 2;
            ddgfVar3.c = 0;
        }
        return bZ.bK();
    }

    @Override // defpackage.cjtj
    protected final synchronized ddgg a() {
        return d();
    }

    @Override // defpackage.cjtj
    protected final synchronized cjqm b() {
        return this.e.c;
    }

    @Override // defpackage.cjtj
    protected final synchronized boolean c() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0263, code lost:
        if (r1.p == false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ddgg d() {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxkv.d():ddgg");
    }

    public final synchronized void e() {
        this.g = true;
    }
}
