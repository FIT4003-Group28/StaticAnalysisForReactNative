package defpackage;
/* renamed from: bxyr  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bxyr implements dbsl {
    static final dbsl a = new bxyr();

    private bxyr() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dptb dptbVar;
        dpte dpteVar = (dpte) obj;
        bxys bxysVar = bxys.TODAY;
        int a2 = dptd.a(dpteVar.b);
        int i = a2 - 1;
        if (a2 != 0) {
            if (i == 0 || i == 1) {
                return true;
            }
            if (i != 2) {
                return false;
            }
            if (dpteVar.b == 6) {
                dptbVar = (dptb) dpteVar.c;
            } else {
                dptbVar = dptb.e;
            }
            dpuk b = dpuk.b(dptbVar.b);
            if (b == null) {
                b = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
            }
            return b == dpuk.MAJOR_EVENT;
        }
        throw null;
    }
}
