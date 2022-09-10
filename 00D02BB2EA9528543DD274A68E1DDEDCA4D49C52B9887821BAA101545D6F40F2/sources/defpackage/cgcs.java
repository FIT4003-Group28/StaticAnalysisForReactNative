package defpackage;
/* renamed from: cgcs  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class cgcs implements dbrn {
    public static final dbrn a = new cgcs();

    private cgcs() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dqqf dqqfVar = (dqqf) obj;
        cgbr bZ = cgbs.e.bZ();
        int a2 = dqrd.a(dqqfVar.a);
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = cgcu.a(a2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cgbs cgbsVar = (cgbs) bZ.b;
        cgbsVar.b = a3 - 1;
        int i = cgbsVar.a | 1;
        cgbsVar.a = i;
        String str = dqqfVar.b;
        str.getClass();
        int i2 = i | 2;
        cgbsVar.a = i2;
        cgbsVar.c = str;
        String str2 = dqqfVar.c;
        str2.getClass();
        cgbsVar.a = i2 | 4;
        cgbsVar.d = str2;
        return bZ.bK();
    }
}
