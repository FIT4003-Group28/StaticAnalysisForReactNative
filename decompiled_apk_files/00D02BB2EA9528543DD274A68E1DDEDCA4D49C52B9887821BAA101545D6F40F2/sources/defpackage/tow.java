package defpackage;
/* renamed from: tow  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class tow implements dbrn {
    static final dbrn a = new tow();

    private tow() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        tnz tnzVar = (tnz) obj;
        tqk bZ = tql.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        tql tqlVar = (tql) bZ.b;
        tqlVar.b = tnzVar.n;
        tqlVar.a |= 1;
        return bZ.bK();
    }
}
