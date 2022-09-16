package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* compiled from: PG */
/* renamed from: bxv  reason: default package */
/* loaded from: classes2.dex */
final class bxv extends FutureTask {
    final /* synthetic */ bxw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxv(bxw bxwVar, Callable callable) {
        super(callable);
        this.a = bxwVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.c((bxt) get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.c(new bxt(e));
        }
    }
}
