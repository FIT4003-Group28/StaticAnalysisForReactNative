package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: far  reason: default package */
/* loaded from: classes6.dex */
public final class far<T> implements dzsj<T> {
    final /* synthetic */ fas a;
    private final int b;

    public far(fas fasVar, int i) {
        this.a = fasVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            fas fasVar = this.a;
            return (T) new aydu(fasVar.b.eW.oL(), fasVar.b(), fasVar.b());
        } else if (i != 1) {
            caxo ff = this.a.b.ff();
            caxa caxaVar = caxa.LISTS;
            dxjg.f(caxaVar);
            return (T) caxg.b(ff, caxaVar);
        } else {
            fas fasVar2 = this.a;
            dzsj dzsjVar = fasVar2.a;
            if (dzsjVar == null) {
                dzsjVar = new far(fasVar2, 2);
                fasVar2.a = dzsjVar;
            }
            return (T) new aydr(dzsjVar);
        }
    }
}
