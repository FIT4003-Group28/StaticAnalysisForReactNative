package defpackage;
/* renamed from: aypq  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class aypq implements dbsl {
    static final dbsl a = new aypq();

    private aypq() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        baal baalVar = (baal) obj;
        dbsk.s(baalVar);
        baaj x = baalVar.x();
        return x == baaj.PLACE || x == baaj.EXPERIENCE || x == baaj.DEAL;
    }
}
