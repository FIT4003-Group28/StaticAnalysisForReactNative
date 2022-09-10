package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crvx  reason: default package */
/* loaded from: classes5.dex */
public final class crvx extends duis {
    public final dbsz<String> a;
    public final crvs b;
    private final dbsz<crua> c;
    private boolean d;

    public crvx(dbsz<crua> dbszVar, dbsz<String> dbszVar2, crvs crvsVar, boolean z) {
        this.c = dbszVar;
        this.a = dbszVar2;
        this.b = crvsVar;
        this.d = z;
    }

    @Override // defpackage.duis
    public final void a(duio duioVar) {
        long f = duioVar.f();
        if (this.d) {
            crvq crvqVar = this.b.a;
            ((crve) crvqVar).o = Long.valueOf(f);
            crvqVar.c(58);
            this.d = false;
        }
        crtt bZ = crua.o.bZ();
        crtx crtxVar = crtx.IN_PROGRESS;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crua cruaVar = (crua) bZ.b;
        cruaVar.e = crtxVar.l;
        int i = cruaVar.a | 8;
        cruaVar.a = i;
        cruaVar.a = i | 64;
        cruaVar.i = f;
        this.c.NU(bZ.bK());
    }

    @Override // defpackage.duis
    public final void b(duio duioVar) {
        String str = ((duim) duioVar).a;
        if (str != null) {
            this.a.NU(str);
        }
    }
}
