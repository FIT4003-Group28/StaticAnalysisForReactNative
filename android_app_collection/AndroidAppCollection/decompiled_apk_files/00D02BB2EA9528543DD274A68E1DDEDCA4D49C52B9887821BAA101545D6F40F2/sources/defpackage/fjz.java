package defpackage;
/* compiled from: PG */
/* renamed from: fjz  reason: default package */
/* loaded from: classes6.dex */
final class fjz<T> implements dzsj<T> {
    final /* synthetic */ fka a;
    private final int b;

    public fjz(fka fkaVar, int i) {
        this.a = fkaVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            fka fkaVar = this.a;
            ftt fttVar = fkaVar.a;
            return (T) new bnyd(fttVar.eV, fttVar.y(), fkaVar.a.fO());
        }
        ftt fttVar2 = this.a.a;
        return (T) new booa(fttVar2.a, fttVar2.cp());
    }
}
