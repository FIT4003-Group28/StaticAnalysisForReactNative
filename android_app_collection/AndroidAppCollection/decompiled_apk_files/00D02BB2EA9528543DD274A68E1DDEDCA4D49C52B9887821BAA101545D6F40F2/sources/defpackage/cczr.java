package defpackage;
/* renamed from: cczr  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cczr implements dbrn {
    static final dbrn a = new cczr();

    private cczr() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        djua djuaVar = (djua) obj;
        ccwt bZ = ccwu.d.bZ();
        String str = djuaVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwu ccwuVar = (ccwu) bZ.b;
        str.getClass();
        ccwuVar.a |= 1;
        ccwuVar.b = str;
        djtz djtzVar = djuaVar.b;
        if (djtzVar == null) {
            djtzVar = djtz.c;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwu ccwuVar2 = (ccwu) bZ.b;
        djtzVar.getClass();
        ccwuVar2.c = djtzVar;
        ccwuVar2.a |= 2;
        return bZ.bK();
    }
}
