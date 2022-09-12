package defpackage;
/* compiled from: PG */
/* renamed from: bnjy  reason: default package */
/* loaded from: classes3.dex */
public final class bnjy extends befr<bnkd> {
    public bnjy(final bnkf bnkfVar, bvvq bvvqVar) {
        super(bnkfVar, 3, 3);
        bnkfVar.getClass();
        final Runnable runnable = new Runnable(bnkfVar) { // from class: bnjx
            private final bnkf a;

            {
                this.a = bnkfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        };
        ((bvuh) bvvqVar).a.a.a(new crzp(runnable) { // from class: bvug
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.run();
            }
        }, dege.a);
    }

    @Override // defpackage.befz
    public final void a(cqiv cqivVar) {
        cqivVar.a(new bnkc(), (bnkd) this.a);
    }
}
