package defpackage;
/* renamed from: blcr  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blcr implements cqlc {
    static final cqlc a = new blcr();

    private blcr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkw blkwVar = (blkw) cqkpVar;
        int i = blda.a;
        if (blkwVar.r() != null) {
            return blkwVar.r();
        }
        if (blkwVar.s() == null) {
            return null;
        }
        cjta c = cjtd.c(blkwVar.s());
        c.d = dtxl.k;
        return c.a();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
