package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* compiled from: PG */
/* renamed from: aqr  reason: default package */
/* loaded from: classes2.dex */
final class aqr extends FutureTask {
    final /* synthetic */ aqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqr(aqt aqtVar, Callable callable) {
        super(callable);
        this.a = aqtVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        try {
            this.a.e(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            this.a.e(null);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
