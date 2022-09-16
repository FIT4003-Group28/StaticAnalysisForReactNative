package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dzcz  reason: default package */
/* loaded from: classes6.dex */
public final class dzcz<T, U extends Collection<? super T>, B> extends dzcw<T, U> {
    final dyzv<B> b;
    final Callable<U> c;

    public dzcz(dyzv<T> dyzvVar, dyzv<B> dyzvVar2, Callable<U> callable) {
        super(dyzvVar);
        this.b = dyzvVar2;
        this.c = callable;
    }

    @Override // defpackage.dyzu
    protected final void g(dyzw<? super U> dyzwVar) {
        this.a.f(new dzcy(new dzfx(dyzwVar), this.c, this.b));
    }
}
