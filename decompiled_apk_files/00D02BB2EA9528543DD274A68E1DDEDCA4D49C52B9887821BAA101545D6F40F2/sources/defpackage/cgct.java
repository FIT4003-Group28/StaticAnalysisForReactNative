package defpackage;
/* renamed from: cgct  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class cgct implements dbrn {
    public static final dbrn a = new cgct();

    private cgct() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dqrk dqrkVar = (dqrk) obj;
        cgce bZ = cgcf.d.bZ();
        int a2 = dqrd.a(dqrkVar.a);
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = cgcu.a(a2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cgcf cgcfVar = (cgcf) bZ.b;
        cgcfVar.b = a3 - 1;
        int i = cgcfVar.a | 1;
        cgcfVar.a = i;
        String str = dqrkVar.b;
        str.getClass();
        cgcfVar.a = i | 2;
        cgcfVar.c = str;
        return bZ.bK();
    }
}
