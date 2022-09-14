package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dzco  reason: default package */
/* loaded from: classes6.dex */
public final class dzco<T> extends dzaa<T> {
    final dyzr a;
    final Callable<? extends T> b;

    public dzco(dyzr dyzrVar, Callable<? extends T> callable) {
        this.a = dyzrVar;
        this.b = callable;
    }

    @Override // defpackage.dzaa
    protected final void g(dzab<? super T> dzabVar) {
        this.a.f(new dzcn(this, dzabVar));
    }
}
