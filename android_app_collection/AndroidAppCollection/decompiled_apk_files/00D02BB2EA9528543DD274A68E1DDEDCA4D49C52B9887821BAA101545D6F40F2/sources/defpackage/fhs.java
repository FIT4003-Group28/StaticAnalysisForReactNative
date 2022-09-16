package defpackage;
/* compiled from: PG */
/* renamed from: fhs  reason: default package */
/* loaded from: classes6.dex */
final class fhs<T> implements dzsj<T> {
    final /* synthetic */ fht a;

    public fhs(fht fhtVar) {
        this.a = fhtVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        fht fhtVar = this.a;
        Object obj2 = fhtVar.a;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = fhtVar.a;
                if (obj instanceof dxjf) {
                    obj = new abbm(fhtVar.b.cg(), new abbh(fhtVar.b.cd(), fhtVar.b.as(), fhtVar.b.cy(), fhtVar.b.dF(), dxjh.c(fhtVar.b.av()), fhtVar.b.eW.n(), fhtVar.b.eW.fr(), fhtVar.b.eW.R(), fhtVar.b.cf()));
                    dxjc.d(fhtVar.a, obj);
                    fhtVar.a = obj;
                }
            }
            obj2 = obj;
        }
        return (T) ((abbm) obj2);
    }
}
