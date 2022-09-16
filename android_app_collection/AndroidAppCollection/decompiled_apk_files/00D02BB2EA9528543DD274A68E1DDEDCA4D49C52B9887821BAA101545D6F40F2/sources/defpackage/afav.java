package defpackage;
/* compiled from: PG */
/* renamed from: afav  reason: default package */
/* loaded from: classes2.dex */
final class afav implements crzp<btlu> {
    final /* synthetic */ afaw a;

    public afav(afaw afawVar) {
        this.a = afawVar;
    }

    private final void b(final gga ggaVar, final boolean z) {
        this.a.ai.execute(new Runnable(this, ggaVar, z) { // from class: afau
            private final afav a;
            private final gga b;
            private final boolean c;

            {
                this.a = this;
                this.b = ggaVar;
                this.c = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afav afavVar = this.a;
                gga ggaVar2 = this.b;
                boolean z2 = this.c;
                gfq.l(afavVar.a);
                afds afdsVar = afavVar.a.b;
                if (afdsVar != null) {
                    afdsVar.Pn(ggaVar2, z2);
                }
            }
        });
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        if (!this.a.aD) {
            return;
        }
        btlu q = btlu.q(crzmVar.l());
        gga ggaVar = this.a.aE;
        dbsk.s(ggaVar);
        if (!this.a.ad.a().i()) {
            b(ggaVar, false);
        } else if (!q.l()) {
        } else {
            b(ggaVar, true);
        }
    }
}
