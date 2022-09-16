package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deeu  reason: default package */
/* loaded from: classes6.dex */
public final class deeu<I, O> extends deew<I, O, defg<? super I, ? extends O>, dehn<? extends O>> {
    public deeu(dehn<? extends I> dehnVar, defg<? super I, ? extends O> defgVar) {
        super(dehnVar, defgVar);
    }

    @Override // defpackage.deew
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        p((dehn) obj);
    }

    @Override // defpackage.deew
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2) {
        defg defgVar = (defg) obj;
        dehn<O> a = defgVar.a(obj2);
        dbsk.w(a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", defgVar);
        return a;
    }
}
