package defpackage;
/* renamed from: ili  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class ili implements dbrn {
    public static final dbrn a = new ili();

    private ili() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dnwx dnwxVar = (dnwx) obj;
        dnwv b = dnwv.b(dnwxVar.b);
        if (b == null) {
            b = dnwv.UNKNOWN_ACTION_TYPE;
        }
        dnxf dnxfVar = dnwxVar.e;
        if (dnxfVar == null) {
            dnxfVar = dnxf.k;
        }
        return ilm.c(b, dnxfVar);
    }
}
