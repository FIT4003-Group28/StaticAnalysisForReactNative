package defpackage;
/* compiled from: PG */
/* renamed from: azkj  reason: default package */
/* loaded from: classes2.dex */
public final class azkj extends azoy {
    final azoy a;
    final ayor b;
    final int c;

    public azkj(azoy azoyVar, ayor ayorVar, int i) {
        this.a = azoyVar;
        this.b = ayorVar;
        this.c = i;
    }

    @Override // defpackage.azoy
    public final int a() {
        return ((azka) this.a).b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, bame[] bameVarArr, bame[] bameVarArr2, ayoq ayoqVar) {
        bame bameVar = bameVarArr[i];
        azmk azmkVar = new azmk(this.c);
        if (bameVar instanceof ayre) {
            bameVarArr2[i] = new azkh((ayre) bameVar, this.c, azmkVar, ayoqVar);
        } else {
            bameVarArr2[i] = new azki(bameVar, this.c, azmkVar, ayoqVar);
        }
    }
}
