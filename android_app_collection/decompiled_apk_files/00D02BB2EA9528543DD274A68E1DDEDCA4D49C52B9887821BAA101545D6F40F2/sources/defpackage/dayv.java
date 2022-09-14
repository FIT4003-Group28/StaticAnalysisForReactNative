package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dayv  reason: default package */
/* loaded from: classes5.dex */
final class dayv<T> implements Runnable {
    public deff<T> a;
    public Executor b;

    public dayv(deff<T> deffVar, Executor executor) {
        dbsk.s(deffVar);
        this.a = deffVar;
        dbsk.s(executor);
        this.b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
        this.b = null;
    }
}
