package defpackage;
/* compiled from: PG */
/* renamed from: beiw  reason: default package */
/* loaded from: classes3.dex */
final class beiw implements crzp<apsi<dbsg<dgac>>> {
    final /* synthetic */ beix a;

    public beiw(beix beixVar) {
        this.a = beixVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<apsi<dbsg<dgac>>> crzmVar) {
        apsi<dbsg<dgac>> l = crzmVar.l();
        if (l != null) {
            int b = l.b();
            if (b == 0) {
                throw null;
            }
            if (b != 3 || !l.a().a()) {
                return;
            }
            beix beixVar = this.a;
            dgab b2 = dgab.b(l.a().b().b);
            if (b2 == null) {
                b2 = dgab.UNKNOWN_CALL_TRACKING_STATUS;
            }
            beixVar.aU(b2);
        }
    }
}
