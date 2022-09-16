package defpackage;
/* compiled from: PG */
/* renamed from: azke  reason: default package */
/* loaded from: classes2.dex */
public final class azke extends aynx {
    final azoy b;
    final int c;

    public azke(azoy azoyVar, int i) {
        this.b = azoyVar;
        this.c = i;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        azkd azkdVar = new azkd(bameVar, this.b.a(), this.c);
        bameVar.f(azkdVar);
        azoy azoyVar = this.b;
        azkb[] azkbVarArr = azkdVar.b;
        if (!azoyVar.c(azkbVarArr)) {
            return;
        }
        int length = azkbVarArr.length;
        bame[] bameVarArr = new bame[length];
        for (int i = 0; i < length; i++) {
            azjx azjxVar = (azjx) azoyVar;
            bameVarArr[i] = aywb.a(azkbVarArr[i], azjxVar.b, Integer.MAX_VALUE, azjxVar.c);
        }
        azoy azoyVar2 = ((azjx) azoyVar).a;
        if (!azoyVar2.c(bameVarArr)) {
            return;
        }
        bame[] bameVarArr2 = new bame[length];
        azkj azkjVar = (azkj) azoyVar2;
        ayor ayorVar = azkjVar.b;
        if (ayorVar instanceof aznj) {
            ((aznj) ayorVar).b(length, new azkg(azkjVar, bameVarArr, bameVarArr2));
        } else {
            for (int i2 = 0; i2 < length; i2++) {
                azkjVar.b(i2, bameVarArr, bameVarArr2, azkjVar.b.a());
            }
        }
        azoy azoyVar3 = azkjVar.a;
        if (!azoyVar3.c(bameVarArr2)) {
            return;
        }
        azka azkaVar = (azka) azoyVar3;
        azkaVar.a.ad(new azjz(bameVarArr2, azkaVar.c));
    }
}
