package defpackage;
/* compiled from: PG */
/* renamed from: fjr  reason: default package */
/* loaded from: classes6.dex */
final class fjr<T> implements dzsj<T> {
    final /* synthetic */ fjs a;
    private final int b;

    public fjr(fjs fjsVar, int i) {
        this.a = fjsVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            ftt fttVar = this.a.a;
            return (T) new bpgk(fttVar.eV, fttVar.eW.il());
        } else if (i != 1) {
            return (T) this.a.b();
        } else {
            ftt fttVar2 = this.a.a;
            return (T) new booa(fttVar2.a, fttVar2.cp());
        }
    }
}
