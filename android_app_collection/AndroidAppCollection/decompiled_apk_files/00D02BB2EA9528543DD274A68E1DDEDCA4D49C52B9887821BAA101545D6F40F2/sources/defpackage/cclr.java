package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cclr  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class cclr implements dbrn {
    static final dbrn a = new cclr();

    private cclr() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        djqe djqeVar = (djqe) obj;
        cclu bZ = cclv.d.bZ();
        djqi djqiVar = djqeVar.b;
        if (djqiVar == null) {
            djqiVar = djqi.b;
        }
        String str = djqiVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cclv cclvVar = (cclv) bZ.b;
        str.getClass();
        int i = cclvVar.a | 2;
        cclvVar.a = i;
        cclvVar.c = str;
        String str2 = djqeVar.a;
        str2.getClass();
        cclvVar.a = i | 1;
        cclvVar.b = str2;
        return bZ.bK();
    }
}
