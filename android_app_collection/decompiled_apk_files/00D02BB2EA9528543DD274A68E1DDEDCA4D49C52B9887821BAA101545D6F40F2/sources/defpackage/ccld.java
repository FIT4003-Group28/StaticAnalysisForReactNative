package defpackage;
/* renamed from: ccld  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ccld implements dbrn {
    public static final dbrn a = new ccld();

    private ccld() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        String str = (String) obj;
        dwfi bZ = dwfl.w.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar = (dwfl) bZ.b;
        str.getClass();
        dwflVar.a |= 128;
        dwflVar.h = str;
        dwfl dwflVar2 = (dwfl) bZ.b;
        dwflVar2.i = 1;
        dwflVar2.a |= 256;
        return bZ.bK();
    }
}
