package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aked  reason: default package */
/* loaded from: classes2.dex */
public final class aked implements crzp<btlu> {
    final /* synthetic */ akef a;

    public aked(akef akefVar) {
        this.a = akefVar;
    }

    private final void b(final gga ggaVar, final boolean z) {
        this.a.af.execute(new Runnable(this, ggaVar, z) { // from class: akec
            private final aked a;
            private final gga b;
            private final boolean c;

            {
                this.a = this;
                this.b = ggaVar;
                this.c = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aked akedVar = this.a;
                gga ggaVar2 = this.b;
                boolean z2 = this.c;
                gfq.l(akedVar.a);
                akee akeeVar = akedVar.a.a;
                if (akeeVar != null) {
                    akeeVar.a(ggaVar2, z2);
                }
            }
        });
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        if (this.a.aD) {
            btlu q = btlu.q(crzmVar.l());
            gga ggaVar = this.a.aE;
            dbsk.s(ggaVar);
            if (!this.a.d.a().i()) {
                b(ggaVar, false);
            } else if (q.l()) {
                b(ggaVar, true);
            } else {
                akfo akfoVar = this.a.b;
                if (akfoVar == null) {
                    return;
                }
                akfoVar.e(false);
            }
        }
    }
}
