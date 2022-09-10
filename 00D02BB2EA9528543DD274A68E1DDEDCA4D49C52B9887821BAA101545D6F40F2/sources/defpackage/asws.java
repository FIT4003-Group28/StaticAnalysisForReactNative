package defpackage;
/* compiled from: PG */
/* renamed from: asws  reason: default package */
/* loaded from: classes2.dex */
final class asws implements Runnable {
    final /* synthetic */ aswz a;

    public asws(aswz aswzVar) {
        this.a = aswzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        atlr bZ = atls.k.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        atls atlsVar = (atls) bZ.b;
        int i = atlsVar.a | 4;
        atlsVar.a = i;
        atlsVar.d = true;
        atlsVar.a = i | 8;
        atlsVar.e = true;
        this.a.aE.D((atbq) gfp.a(atbq.class, atbq.aJ(bZ.bK())));
    }
}
