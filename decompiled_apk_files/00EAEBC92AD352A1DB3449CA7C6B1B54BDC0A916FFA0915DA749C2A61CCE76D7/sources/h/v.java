package h;

import java.io.Closeable;
/* loaded from: classes.dex */
public interface v extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(c cVar, long j);

    w timeout();
}
