package defpackage;
/* renamed from: baii  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class baii implements dbsl {
    static final dbsl a = new baii();

    private baii() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        baal baalVar = (baal) obj;
        if (baalVar == null || baalVar.x() != baaj.PLACE) {
            return false;
        }
        baak z = baalVar.z();
        dbsk.s(z);
        return !z.a().equals(akqi.a);
    }
}
