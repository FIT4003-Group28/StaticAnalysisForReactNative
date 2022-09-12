package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cwtu  reason: default package */
/* loaded from: classes5.dex */
final class cwtu implements Callable {
    final /* synthetic */ Callable a;
    final /* synthetic */ cwtv b;

    public cwtu(cwtv cwtvVar, Callable callable) {
        this.b = cwtvVar;
        this.a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return this.a.call();
        } catch (Throwable th) {
            this.b.a.a(th);
            throw th;
        }
    }
}
