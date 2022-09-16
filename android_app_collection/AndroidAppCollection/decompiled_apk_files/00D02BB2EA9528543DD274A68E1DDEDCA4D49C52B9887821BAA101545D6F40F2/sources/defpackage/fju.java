package defpackage;
/* compiled from: PG */
/* renamed from: fju  reason: default package */
/* loaded from: classes6.dex */
final class fju<T> implements dzsj<T> {
    final /* synthetic */ fjv a;
    private final int b;

    public fju(fjv fjvVar, int i) {
        this.a = fjvVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            fjv fjvVar = this.a;
            ftt fttVar = fjvVar.a;
            return (T) new bnyd(fttVar.eV, fttVar.y(), fjvVar.a.fO());
        }
        ftt fttVar2 = this.a.a;
        return (T) new booa(fttVar2.a, fttVar2.cp());
    }
}
