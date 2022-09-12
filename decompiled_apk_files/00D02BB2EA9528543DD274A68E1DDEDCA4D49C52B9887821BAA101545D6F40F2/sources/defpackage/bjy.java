package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* compiled from: PG */
/* renamed from: bjy  reason: default package */
/* loaded from: classes3.dex */
final class bjy extends FutureTask<bjw> {
    final /* synthetic */ bjz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjy(bjz bjzVar, Callable<bjw> callable) {
        super(callable);
        this.a = bjzVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.a(get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.a(new bjw(e));
        }
    }
}
