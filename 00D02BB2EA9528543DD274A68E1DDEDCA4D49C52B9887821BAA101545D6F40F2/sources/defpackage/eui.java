package defpackage;
/* compiled from: PG */
/* renamed from: eui  reason: default package */
/* loaded from: classes6.dex */
final class eui<T> implements dzsj<T> {
    final /* synthetic */ euj a;
    private final int b;

    public eui(euj eujVar, int i) {
        this.a = eujVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            return (T) new aafh(this.a.a.eV);
        }
        ftt fttVar = this.a.a;
        return (T) new aafq(fttVar.eV, fttVar.eW.il());
    }
}
