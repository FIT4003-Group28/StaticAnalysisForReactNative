package defpackage;
/* compiled from: PG */
/* renamed from: fhx  reason: default package */
/* loaded from: classes6.dex */
final class fhx<T> implements dzsj<T> {
    final /* synthetic */ fhy a;
    private final int b;

    public fhx(fhy fhyVar, int i) {
        this.a = fhyVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            fhy fhyVar = this.a;
            return (T) bpyi.b(fhyVar.a.cu(), fhyVar.a.ap());
        } else if (i != 1) {
            ftt fttVar = this.a.a;
            return (T) new booa(fttVar.a, fttVar.cp());
        } else {
            fhy fhyVar2 = this.a;
            ftt fttVar2 = fhyVar2.a;
            return (T) new bnyd(fttVar2.eV, fttVar2.y(), fhyVar2.a.fO());
        }
    }
}
