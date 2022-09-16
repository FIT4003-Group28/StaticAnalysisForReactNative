package defpackage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ealz  reason: default package */
/* loaded from: classes6.dex */
final class ealz extends eala {
    public final HttpURLConnection f;
    final /* synthetic */ eamc g;
    private final AtomicBoolean h;
    private WritableByteChannel i;
    private OutputStream j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ealz(eamc eamcVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, eaml eamlVar) {
        super(executor, executor2, eamlVar);
        this.g = eamcVar;
        this.h = new AtomicBoolean(false);
        this.f = httpURLConnection;
    }

    @Override // defpackage.eala
    protected final Runnable c(eamd eamdVar) {
        return this.g.j(eamdVar);
    }

    @Override // defpackage.eala
    protected final Runnable d(eamd eamdVar) {
        return this.g.k(eamdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eala
    public final void e(Throwable th) {
        this.g.e(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eala
    public final int f(ByteBuffer byteBuffer) {
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            i += this.i.write(byteBuffer);
        }
        this.j.flush();
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eala
    public final void g() {
        i();
        this.g.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eala
    public final void h() {
        if (this.i == null) {
            this.g.k = 10;
            this.f.setDoOutput(true);
            this.f.connect();
            this.g.k = 12;
            OutputStream outputStream = this.f.getOutputStream();
            this.j = outputStream;
            this.i = Channels.newChannel(outputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        if (this.i == null || !this.h.compareAndSet(false, true)) {
            return;
        }
        this.i.close();
    }
}
