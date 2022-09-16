package defpackage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: PG */
/* renamed from: bafk  reason: default package */
/* loaded from: classes2.dex */
public final class bafk extends UploadDataSink {
    public final UploadDataProvider b;
    public ByteBuffer c;
    public long d;
    public long e;
    public final HttpURLConnection f;
    public WritableByteChannel g;
    public OutputStream h;
    final /* synthetic */ bagd i;
    private final Executor j;
    private final Executor k;
    public final AtomicInteger a = new AtomicInteger(3);
    private final AtomicBoolean l = new AtomicBoolean(false);

    public bafk(bagd bagdVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, bagw bagwVar) {
        this.i = bagdVar;
        this.j = new baff(this, executor);
        this.k = executor2;
        this.b = bagwVar;
        this.f = httpURLConnection;
    }

    public final void a(bage bageVar) {
        try {
            this.j.execute(this.i.c(bageVar));
        } catch (RejectedExecutionException e) {
            f(e);
        }
    }

    public final void b() {
        this.k.execute(c(new bafi(this)));
    }

    protected final Runnable c(bage bageVar) {
        return this.i.b(bageVar);
    }

    public final void d() {
        if (this.g == null || !this.l.compareAndSet(false, true)) {
            return;
        }
        this.g.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        d();
        this.i.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(Throwable th) {
        this.i.f(th);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        f(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        if (!this.a.compareAndSet(0, 2)) {
            throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + this.a.get());
        }
        this.k.execute(c(new bafj(this, z, 1)));
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        f(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        if (!this.a.compareAndSet(1, 2)) {
            throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + this.a.get());
        }
        b();
    }
}
