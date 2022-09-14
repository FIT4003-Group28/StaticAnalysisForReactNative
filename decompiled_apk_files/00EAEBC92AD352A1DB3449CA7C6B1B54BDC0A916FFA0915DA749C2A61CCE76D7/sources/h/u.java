package h;

import java.io.Closeable;
import java.io.Flushable;
/* loaded from: classes.dex */
public interface u extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    w timeout();

    void write(c cVar, long j);
}
