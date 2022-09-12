package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apn  reason: default package */
/* loaded from: classes2.dex */
public final class apn extends FutureTask {
    final /* synthetic */ app a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apn(app appVar, Callable callable) {
        super(callable);
        this.a = appVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        try {
            this.a.d(get());
        } catch (InterruptedException unused) {
        } catch (CancellationException unused2) {
            this.a.d(null);
        } catch (ExecutionException e) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
