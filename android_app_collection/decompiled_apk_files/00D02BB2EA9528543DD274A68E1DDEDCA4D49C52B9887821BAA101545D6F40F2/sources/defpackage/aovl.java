package defpackage;
/* renamed from: aovl  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aovl implements dbsl {
    static final dbsl a = new aovl();

    private aovl() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        bwrs bwrsVar = (bwrs) obj;
        if (bwrsVar != null) {
            aoyg aoygVar = (aoyg) bwrsVar.c();
            dbsk.s(aoygVar);
            return aoygVar.b() != aoyf.INITIAL_LOADING;
        }
        return false;
    }
}
