package defpackage;
/* compiled from: PG */
/* renamed from: fgh  reason: default package */
/* loaded from: classes6.dex */
final class fgh<T> implements dzsj<T> {
    final /* synthetic */ fgi a;

    public fgh(fgi fgiVar) {
        this.a = fgiVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        ftt fttVar = this.a.a;
        dzsj dzsjVar = fttVar.dc;
        if (dzsjVar == null) {
            dzsjVar = new fns(fttVar, 1343);
            fttVar.dc = dzsjVar;
        }
        return (T) new bkdy(dzsjVar);
    }
}
