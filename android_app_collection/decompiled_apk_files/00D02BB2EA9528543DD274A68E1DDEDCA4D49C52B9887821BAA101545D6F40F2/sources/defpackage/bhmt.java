package defpackage;
/* renamed from: bhmt  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhmt implements dbsl {
    static final dbsl a = new bhmt();

    private bhmt() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dvwl dvwlVar = (dvwl) obj;
        dcqe dcqeVar = bhmz.a;
        if ((dvwlVar.a & 16) != 0) {
            dopk dopkVar = dvwlVar.c;
            if (dopkVar == null) {
                dopkVar = dopk.x;
            }
            return dopkVar.e.size() > 0;
        }
        return false;
    }
}
