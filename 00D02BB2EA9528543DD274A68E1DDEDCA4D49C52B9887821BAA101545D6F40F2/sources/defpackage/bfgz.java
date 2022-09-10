package defpackage;
/* compiled from: PG */
/* renamed from: bfgz  reason: default package */
/* loaded from: classes3.dex */
final class bfgz implements dbty {
    public cjtd a = cjtd.b;
    private final cjtd b;
    private final cjtd c;

    public bfgz(ilo iloVar) {
        this.b = c(dtxy.iA, iloVar);
        this.c = c(dtxy.hG, iloVar);
    }

    private static cjtd c(ddho ddhoVar, ilo iloVar) {
        cjta c = cjtd.c(iloVar.bZ());
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Object a() {
        return this.a;
    }

    public final void b(jjn jjnVar) {
        cjtd cjtdVar;
        jjn jjnVar2 = jjn.HIDDEN;
        int ordinal = jjnVar.ordinal();
        if (ordinal == 0) {
            cjtdVar = cjtd.c;
        } else if (ordinal == 1) {
            cjtdVar = this.c;
        } else if (ordinal != 2 && ordinal != 3) {
            return;
        } else {
            cjtdVar = this.b;
        }
        this.a = cjtdVar;
    }
}
