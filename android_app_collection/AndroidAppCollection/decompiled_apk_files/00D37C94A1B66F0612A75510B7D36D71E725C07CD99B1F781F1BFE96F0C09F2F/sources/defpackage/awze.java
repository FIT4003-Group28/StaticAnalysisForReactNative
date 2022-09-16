package defpackage;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: PG */
/* renamed from: awze  reason: default package */
/* loaded from: classes2.dex */
final class awze extends UploadDataProvider {
    public awzd a;
    public final awxx b;
    public final long c;
    private final ExecutorService f;
    private final boolean i;
    public int d = 0;
    public int e = 0;
    private int j = 0;
    private final AtomicLong g = new AtomicLong(0);
    private final byte[] h = new byte[65536];
    private long k = SystemClock.elapsedRealtime();

    public awze(ExecutorService executorService, awxx awxxVar) {
        boolean z = false;
        this.f = executorService;
        long j = 0;
        this.b = awxxVar;
        z = awxxVar.a() == -1 ? true : z;
        this.i = z;
        this.c = !z ? awxxVar.a() - awxxVar.e() : j;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        if (this.i) {
            return -1L;
        }
        return Math.min(this.b.a() - this.b.e(), (this.b.c() + this.b.d()) - this.b.e());
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        boolean z = false;
        int b = this.b.b(this.h, 0, Math.min(65536, byteBuffer.capacity()));
        if (b > 0) {
            byteBuffer.put(this.h, 0, b);
            int i = this.j + b;
            this.j = i;
            if (i >= this.d) {
                if (this.e > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - this.k >= this.e) {
                        this.k = elapsedRealtime;
                    }
                }
                this.g.getAndAdd(this.j);
                awzd awzdVar = this.a;
                if (awzdVar != null) {
                    this.f.execute(awzdVar);
                }
                this.j = 0;
            }
        }
        if (this.i && !this.b.i()) {
            z = true;
        }
        uploadDataSink.onReadSucceeded(z);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.b.h();
        uploadDataSink.onRewindSucceeded();
    }
}
