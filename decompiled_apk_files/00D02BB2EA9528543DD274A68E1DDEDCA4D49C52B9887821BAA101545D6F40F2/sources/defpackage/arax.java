package defpackage;
/* compiled from: PG */
/* renamed from: arax  reason: default package */
/* loaded from: classes2.dex */
final class arax implements degu<pnv> {
    final /* synthetic */ Runnable a;
    final /* synthetic */ aray b;

    public arax(aray arayVar, Runnable runnable) {
        this.b = arayVar;
        this.a = runnable;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(pnv pnvVar) {
        final pnv pnvVar2 = pnvVar;
        if (!pnvVar2.a().h()) {
            return;
        }
        this.b.t = pnvVar2;
        final aksm a = pnvVar2.a();
        final Runnable runnable = this.a;
        a.c(new Runnable(a, pnvVar2, runnable) { // from class: arav
            private final aksm a;
            private final pnv b;
            private final Runnable c;

            {
                this.a = a;
                this.b = pnvVar2;
                this.c = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aksm aksmVar = this.a;
                pnv pnvVar3 = this.b;
                Runnable runnable2 = this.c;
                aksmVar.b(pnp.DRIVE.g);
                aksmVar.i(new araw(pnvVar3));
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }
}
