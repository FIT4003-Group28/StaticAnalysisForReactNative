package defpackage;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dbcx  reason: default package */
/* loaded from: classes5.dex */
public final class dbcx {
    public CompletableFuture<Void> a;

    public final CompletableFuture<Void> a(Runnable runnable, Executor executor) {
        CompletableFuture<Void> completableFuture = this.a;
        if (completableFuture == null || completableFuture.isDone()) {
            this.a = CompletableFuture.runAsync(runnable, executor);
        } else {
            this.a = this.a.thenRunAsync(runnable, executor);
        }
        return this.a;
    }
}
