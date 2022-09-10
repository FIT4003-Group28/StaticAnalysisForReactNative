package defpackage;
/* renamed from: chti  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class chti implements dbsl {
    static final dbsl a = new chti();

    private chti() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        chwl chwlVar;
        chxk chxkVar = (chxk) obj;
        if (chxj.a(chxkVar.b) == chxj.PLACE_REOPEN) {
            if (chxkVar.b == 17) {
                chwlVar = (chwl) chxkVar.c;
            } else {
                chwlVar = chwl.c;
            }
            return !chwlVar.b.u();
        }
        return false;
    }
}
