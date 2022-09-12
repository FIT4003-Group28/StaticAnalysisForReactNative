package defpackage;
/* renamed from: crtd  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class crtd implements dbrn {
    public static final dbrn a = new crtd();

    private crtd() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        String str = (String) obj;
        cruy bZ = cruz.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cruz cruzVar = (cruz) bZ.b;
        str.getClass();
        cruzVar.a |= 1;
        cruzVar.b = str;
        cruf crufVar = cruf.PRECHECK_ACCEPTED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cruz cruzVar2 = (cruz) bZ.b;
        cruzVar2.c = crufVar.l;
        cruzVar2.a |= 2;
        return bZ.bK();
    }
}
