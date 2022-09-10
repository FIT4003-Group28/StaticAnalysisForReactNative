package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: beft  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class beft implements dbrn {
    static final dbrn a = new beft();

    private beft() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cjtd cjtdVar = (cjtd) obj;
        dnqg bZ = dnqh.p.bZ();
        String str = cjtdVar.e;
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            str.getClass();
            dnqhVar.a |= 4;
            dnqhVar.d = str;
        }
        String str2 = cjtdVar.d;
        if (str2 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            str2.getClass();
            dnqhVar2.a |= 8;
            dnqhVar2.e = str2;
        }
        ddho ddhoVar = cjtdVar.g;
        if (ddhoVar != null) {
            ddxw bZ2 = ddxx.j.bZ();
            int b = ddhoVar.b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddxx ddxxVar = (ddxx) bZ2.b;
            ddxxVar.a |= 8;
            ddxxVar.d = b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar3 = (dnqh) bZ.b;
            ddxx bK = bZ2.bK();
            bK.getClass();
            dnqhVar3.f = bK;
            dnqhVar3.a |= 16;
        }
        return bZ.bK();
    }
}
