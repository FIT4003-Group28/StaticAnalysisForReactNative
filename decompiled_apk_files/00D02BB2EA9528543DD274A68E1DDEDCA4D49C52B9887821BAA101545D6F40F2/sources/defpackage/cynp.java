package defpackage;
/* renamed from: cynp  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cynp implements dbrn {
    static final dbrn a = new cynp();

    private cynp() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        duel duelVar = (duel) obj;
        cyjr bZ = cyjs.c.bZ();
        String str = duelVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        str.getClass();
        ((cyjs) bZ.b).a = str;
        duej b = duej.b(duelVar.b);
        if (b == null) {
            b = duej.UNKNOWN_CONTAINER;
        }
        int a2 = cynb.a(b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((cyjs) bZ.b).b = cyiu.a(a2);
        return bZ.bK();
    }
}
