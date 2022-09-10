package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ddbf  reason: default package */
/* loaded from: classes5.dex */
public final class ddbf implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ ddbn b;

    public ddbf(ddbn ddbnVar, Executor executor) {
        this.b = ddbnVar;
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.k(e);
        }
    }
}
