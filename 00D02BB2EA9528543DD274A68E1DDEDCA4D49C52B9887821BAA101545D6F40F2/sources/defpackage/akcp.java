package defpackage;
/* compiled from: PG */
/* renamed from: akcp  reason: default package */
/* loaded from: classes2.dex */
final class akcp implements crzp<btlu> {
    final /* synthetic */ akcr a;

    public akcp(akcr akcrVar) {
        this.a = akcrVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        akcr akcrVar = this.a;
        if (akcrVar.aD) {
            if (!akcrVar.d.a().i()) {
                this.a.aS();
            } else if (crzmVar.l().l()) {
                this.a.g();
                this.a.aS();
            } else {
                akfu akfuVar = this.a.a;
                if (akfuVar == null) {
                    return;
                }
                akfuVar.e(false);
            }
        }
    }
}
