package defpackage;
/* compiled from: PG */
/* renamed from: fjg  reason: default package */
/* loaded from: classes6.dex */
final class fjg<T> implements dzsj<T> {
    final /* synthetic */ fjh a;
    private final int b;

    public fjg(fjh fjhVar, int i) {
        this.a = fjhVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (T) this.a.b();
            }
            if (i == 2) {
                fjh fjhVar = this.a;
                return (T) new bozp(fjhVar.a.eW.il(), fjhVar.a.uS(), fjhVar.a.eW.fr());
            } else if (i != 3) {
                return (T) new boyb(this.a.a.a);
            } else {
                return (T) new boyc(this.a.a.a);
            }
        }
        return (T) boyv.b();
    }
}
