package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cynz  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cynz implements dbrn {
    static final dbrn a = new cynz();

    private cynz() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        duga dugaVar = (duga) obj;
        cylr bZ = cyls.d.bZ();
        String str = dugaVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyls cylsVar = (cyls) bZ.b;
        str.getClass();
        cylsVar.a = str;
        cylsVar.b = dugaVar.c;
        dufm dufmVar = dugaVar.a;
        if (dufmVar == null) {
            dufmVar = dufm.g;
        }
        cyjt g = cyob.g(dufmVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        g.getClass();
        ((cyls) bZ.b).c = g;
        return bZ.bK();
    }
}
