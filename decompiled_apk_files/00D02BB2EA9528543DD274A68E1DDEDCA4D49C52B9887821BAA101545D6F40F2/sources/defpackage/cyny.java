package defpackage;
/* renamed from: cyny  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyny implements dbrn {
    static final dbrn a = new cyny();

    private cyny() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dugc dugcVar = (dugc) obj;
        cyly bZ = cylz.c.bZ();
        String str = dugcVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        str.getClass();
        ((cylz) bZ.b).a = str;
        duej b = duej.b(dugcVar.a);
        if (b == null) {
            b = duej.UNKNOWN_CONTAINER;
        }
        int a2 = cynb.a(b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((cylz) bZ.b).b = cyiu.a(a2);
        return bZ.bK();
    }
}
