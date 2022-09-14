package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ceeb  reason: default package */
/* loaded from: classes4.dex */
public final class ceeb implements crzp<btlu> {
    final /* synthetic */ ceec a;

    public ceeb(ceec ceecVar) {
        this.a = ceecVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        final ceec ceecVar = this.a;
        String e = dbsj.e(btlu.h(crzmVar.l()));
        if (e.isEmpty() || !e.equals(ceecVar.ap)) {
            ceecVar.b.b(new Runnable(ceecVar) { // from class: ceea
                private final ceec a;

                {
                    this.a = ceecVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ceec ceecVar2 = this.a;
                    if (ceecVar2.ao == null || ceecVar2.af.e()) {
                        if (ceecVar2.af.e()) {
                            ceecVar2.am.t();
                        }
                        if (ceecVar2.ao != null || ceecVar2.ap.isEmpty()) {
                            ceecVar2.am.u();
                            return;
                        }
                        ceecVar2.ao = ceecVar2.ap;
                        ceecVar2.am.w(ceecVar2.ao);
                    }
                }
            }, bvrj.UI_THREAD);
        }
    }
}
