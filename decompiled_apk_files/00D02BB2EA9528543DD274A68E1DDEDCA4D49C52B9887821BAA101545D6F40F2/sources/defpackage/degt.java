package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: degt  reason: default package */
/* loaded from: classes.dex */
public abstract class degt<V> extends degr<V> implements dehn<V> {
    @Override // defpackage.dehn
    public final void Pk(Runnable runnable, Executor executor) {
        h().Pk(runnable, executor);
    }

    @Override // defpackage.degr
    protected /* bridge */ /* synthetic */ Future g() {
        throw null;
    }

    protected abstract dehn<? extends V> h();
}
