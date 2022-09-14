package defpackage;
/* renamed from: cctl  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cctl implements dbrn {
    static final dbrn a = new cctl();

    private cctl() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dhuk bZ = dhul.c.bZ();
        drah drahVar = ((dwfa) obj).b;
        if (drahVar == null) {
            drahVar = drah.c;
        }
        String str = drahVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhul dhulVar = (dhul) bZ.b;
        str.getClass();
        dhulVar.a |= 1;
        dhulVar.b = str;
        return bZ.bK();
    }
}
