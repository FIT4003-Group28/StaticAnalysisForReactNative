package defpackage;
/* compiled from: PG */
/* renamed from: bdya  reason: default package */
/* loaded from: classes3.dex */
final class bdya extends cjxx {
    final /* synthetic */ bdyb a;

    public bdya(bdyb bdybVar) {
        this.a = bdybVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bdyb bdybVar = this.a;
        if (bdybVar.aD) {
            gga ggaVar = bdybVar.aE;
            brlu bx = bdybVar.bx();
            boolean z = false;
            if (ggaVar != null && bx != null && bx.x() != null) {
                if (!bdybVar.o.getBoolean("searchResultViewPortMoved")) {
                    alad c = alad.c(bx.x());
                    jjn L = bdybVar.br.l().L();
                    if (c != null && (bdybVar.aU() || !L.b())) {
                        alaa a = alad.a();
                        a.c(c.i);
                        a.c = c.k;
                        bdybVar.bX = a.a();
                    }
                    bdybVar.o.putBoolean("searchResultViewPortMoved", true);
                }
                if (bdybVar.bX != null) {
                    z = true;
                }
            }
            bdyb bdybVar2 = this.a;
            bdybVar2.by(bdybVar2.br(), !z);
        }
    }
}
