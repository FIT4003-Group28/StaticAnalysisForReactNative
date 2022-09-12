package defpackage;
/* compiled from: PG */
/* renamed from: cedt  reason: default package */
/* loaded from: classes4.dex */
final class cedt implements crzp<btlu> {
    final /* synthetic */ cedu a;

    public cedt(cedu ceduVar) {
        this.a = ceduVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        final cedu ceduVar = this.a;
        String e = dbsj.e(btlu.h(crzmVar.l()));
        if (!e.isEmpty()) {
            dqkn dqknVar = ceduVar.ad.b;
            if (dqknVar == null) {
                dqknVar = dqkn.e;
            }
            if (e.equals(dqknVar.d)) {
                return;
            }
        }
        ceduVar.a.b(new Runnable(ceduVar) { // from class: ceds
            private final cedu a;

            {
                this.a = ceduVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.q();
            }
        }, bvrj.UI_THREAD);
    }
}
