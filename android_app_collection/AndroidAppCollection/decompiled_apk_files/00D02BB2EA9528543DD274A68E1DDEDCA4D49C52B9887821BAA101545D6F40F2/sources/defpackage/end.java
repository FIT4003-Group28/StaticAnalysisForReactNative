package defpackage;
/* compiled from: PG */
/* renamed from: end  reason: default package */
/* loaded from: classes6.dex */
final class end<T> implements dzsj<T> {
    final /* synthetic */ ene a;
    private final int b;

    public end(ene eneVar, int i) {
        this.a = eneVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            ene eneVar = this.a;
            dzsj dzsjVar = eneVar.a;
            if (dzsjVar == null) {
                dzsjVar = new end(eneVar, 1);
                eneVar.a = dzsjVar;
            }
            return (T) new apcd(dzsjVar, eneVar.b.eV);
        } else if (i == 1) {
            ene eneVar2 = this.a;
            ftt fttVar = eneVar2.b;
            return (T) new apdb(fttVar.eV, fttVar.eW.k(), eneVar2.b.eW.lL(), eneVar2.b.pl());
        } else if (i != 2) {
            return (T) new aphj(this.a.b.a);
        } else {
            ene eneVar3 = this.a;
            cjqy tr = eneVar3.b.eW.a.tr();
            dxjg.e(tr);
            return (T) new apcf(tr, eneVar3.b.eW.oA());
        }
    }
}
