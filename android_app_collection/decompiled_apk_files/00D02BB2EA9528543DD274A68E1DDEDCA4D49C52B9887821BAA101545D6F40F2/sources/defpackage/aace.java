package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aace  reason: default package */
/* loaded from: classes2.dex */
public final class aace implements btzi<dils, dilu> {
    final /* synthetic */ aacg a;
    final /* synthetic */ aach b;

    public aace(aach aachVar, aacg aacgVar) {
        this.b = aachVar;
        this.a = aacgVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dils> btzrVar, btzy btzyVar) {
        if (!this.b.d(this.a)) {
            return;
        }
        this.b.c();
        this.b.e(new aaco(btzyVar));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dils> btzrVar, dilu diluVar) {
        dilu diluVar2 = diluVar;
        if (!this.b.d(this.a)) {
            return;
        }
        this.b.c();
        this.b.e(new aaco(diluVar2));
    }
}
