package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: phi  reason: default package */
/* loaded from: classes7.dex */
final class phi<V, K> implements pfh<V> {
    private final Set<? super K> a = new HashSet();
    private final dbrn<? super V, K> b;
    private final pfh<? super V> c;

    public phi(pfh<? super V> pfhVar, dbrn<? super V, K> dbrnVar) {
        this.b = dbrnVar;
        this.c = pfhVar;
    }

    @Override // defpackage.pfh
    public final void c(pfg pfgVar) {
        this.c.c(pfgVar);
    }

    @Override // defpackage.pfh
    public final void d(V v) {
        K a = this.b.a(v);
        dbsk.t(a, "The keySelector returned a null key");
        if (this.a.add(a)) {
            this.c.d(v);
        }
    }

    @Override // defpackage.pfh
    public final void e() {
        this.a.clear();
        this.c.e();
    }
}
