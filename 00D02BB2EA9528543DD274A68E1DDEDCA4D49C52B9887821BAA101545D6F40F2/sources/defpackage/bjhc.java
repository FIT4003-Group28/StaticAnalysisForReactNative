package defpackage;
/* compiled from: PG */
/* renamed from: bjhc  reason: default package */
/* loaded from: classes3.dex */
public class bjhc {
    public final dxio<akfa> a;
    public final btrm b;
    private final akfc c;
    private final cchz d;

    public bjhc(dxio<akfa> dxioVar, akfc akfcVar, cchz cchzVar, btrm btrmVar) {
        this.a = dxioVar;
        this.c = akfcVar;
        this.d = cchzVar;
        this.b = btrmVar;
    }

    public final boolean a() {
        return btlu.i(this.a.a().j()).equals(btlt.GOOGLE);
    }

    public final jic b(ilo iloVar) {
        btlu j = this.a.a().j();
        String str = null;
        if (a() && !iloVar.bf().r) {
            cchz cchzVar = this.d;
            dbsk.s(j);
            str = cchzVar.c(j);
        }
        return new jic(str, ckqc.FIFE_MERGE, true != d(iloVar) ? 2131232998 : 2131231770);
    }

    public final void c(final Runnable runnable) {
        final btlu j = this.a.a().j();
        this.c.a(akeu.j(new akeo(this, j, runnable) { // from class: bjhb
            private final bjhc a;
            private final btlu b;
            private final Runnable c;

            {
                this.a = this;
                this.b = j;
                this.c = runnable;
            }

            @Override // defpackage.akeo
            public final void a(gga ggaVar, btlu btluVar) {
                bjhc bjhcVar = this.a;
                btlu btluVar2 = this.b;
                Runnable runnable2 = this.c;
                if (!btlu.g(btluVar2, btluVar)) {
                    bjhcVar.b.b(new bjff());
                }
                runnable2.run();
            }

            @Override // defpackage.akeo
            public final void b(gga ggaVar, btlu btluVar) {
            }
        }).b());
    }

    public final boolean d(ilo iloVar) {
        return a() && iloVar.bf().r;
    }
}
