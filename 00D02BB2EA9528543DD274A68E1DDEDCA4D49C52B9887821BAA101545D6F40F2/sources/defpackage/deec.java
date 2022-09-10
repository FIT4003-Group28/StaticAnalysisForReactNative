package defpackage;

import java.lang.Throwable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deec  reason: default package */
/* loaded from: classes6.dex */
public final class deec<V, X extends Throwable> extends deee<V, X, defg<? super X, ? extends V>, dehn<? extends V>> {
    public deec(dehn<? extends V> dehnVar, Class<X> cls, defg<? super X, ? extends V> defgVar) {
        super(dehnVar, cls, defgVar);
    }

    @Override // defpackage.deee
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        p((dehn) obj);
    }

    @Override // defpackage.deee
    public final /* bridge */ /* synthetic */ Object f(Object obj, Throwable th) {
        defg defgVar = (defg) obj;
        dehn a = defgVar.a(th);
        dbsk.w(a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", defgVar);
        return a;
    }
}
