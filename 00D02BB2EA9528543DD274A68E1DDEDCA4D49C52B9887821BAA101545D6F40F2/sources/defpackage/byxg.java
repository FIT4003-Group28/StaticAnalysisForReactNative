package defpackage;
/* renamed from: byxg  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class byxg implements dbrn {
    static final dbrn a = new byxg();

    private byxg() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        bzha bZ = bzhb.c.bZ();
        int intValue = ((Integer) obj).intValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bzhb bzhbVar = (bzhb) bZ.b;
        bzhbVar.a |= 1;
        bzhbVar.b = intValue;
        return bZ.bK();
    }
}
