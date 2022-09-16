package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ahhw  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class ahhw implements dbrn {
    static final dbrn a = new ahhw();

    private ahhw() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        ahim ahimVar = (ahim) obj;
        agyl bZ = agym.d.bZ();
        dlcv dlcvVar = ahimVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agym agymVar = (agym) bZ.b;
        dlcvVar.getClass();
        agymVar.b = dlcvVar;
        agymVar.a |= 1;
        agyh n = ahimVar.b.n();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agym agymVar2 = (agym) bZ.b;
        n.getClass();
        agymVar2.c = n;
        agymVar2.a |= 2;
        return bZ.bK();
    }
}
