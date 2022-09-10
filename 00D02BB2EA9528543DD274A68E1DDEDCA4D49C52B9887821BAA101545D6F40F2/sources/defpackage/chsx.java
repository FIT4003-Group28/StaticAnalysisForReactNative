package defpackage;

import java.util.Map;
/* renamed from: chsx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class chsx implements dbrn {
    public static final dbrn a = new chsx();

    private chsx() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        chun bZ = chuo.d.bZ();
        chxr chxrVar = (chxr) entry.getKey();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chuo chuoVar = (chuo) bZ.b;
        chxrVar.getClass();
        chuoVar.b = chxrVar;
        chuoVar.a |= 1;
        int intValue = ((Integer) entry.getValue()).intValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chuo chuoVar2 = (chuo) bZ.b;
        chuoVar2.a |= 2;
        chuoVar2.c = intValue;
        return bZ.bK();
    }
}
