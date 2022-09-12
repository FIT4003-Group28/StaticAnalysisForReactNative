package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: PG */
/* renamed from: eala  reason: default package */
/* loaded from: classes6.dex */
public abstract class eala extends UploadDataSink {
    public final AtomicReference<Integer> a = new AtomicReference<>(3);
    public final UploadDataProvider b;
    public ByteBuffer c;
    public long d;
    public long e;
    private final Executor f;
    private final Executor g;

    public eala(Executor executor, Executor executor2, UploadDataProvider uploadDataProvider) {
        this.f = new eaku(this, executor);
        this.g = executor2;
        this.b = uploadDataProvider;
    }

    public final void a() {
        this.g.execute(c(new eaky(this)));
    }

    public final void b(eamd eamdVar) {
        try {
            this.f.execute(d(eamdVar));
        } catch (RejectedExecutionException e) {
            e(e);
        }
    }

    protected abstract Runnable c(eamd eamdVar);

    protected abstract Runnable d(eamd eamdVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(Throwable th);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int f(ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void g();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void h();

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        e(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        if (!this.a.compareAndSet(0, 2)) {
            throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + this.a.get());
        }
        this.g.execute(c(new eakw(this, z)));
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        e(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        if (!this.a.compareAndSet(1, 2)) {
            throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + this.a.get());
        }
        a();
    }
}
