package defpackage;
/* compiled from: PG */
/* renamed from: cedx  reason: default package */
/* loaded from: classes4.dex */
final class cedx implements crzp<btlu> {
    final /* synthetic */ cedy a;

    public cedx(cedy cedyVar) {
        this.a = cedyVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        final cedy cedyVar = this.a;
        btlu l = crzmVar.l();
        if (cedyVar.ai != null) {
            return;
        }
        String e = dbsj.e(btlu.h(l));
        if (!e.isEmpty() && e.equals(cedyVar.ak)) {
            return;
        }
        cedyVar.b.b(new Runnable(cedyVar) { // from class: cedw
            private final cedy a;

            {
                this.a = cedyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cedy cedyVar2 = this.a;
                if (cedyVar2.aD) {
                    cedyVar2.a.g().f();
                }
            }
        }, bvrj.UI_THREAD);
    }
}
