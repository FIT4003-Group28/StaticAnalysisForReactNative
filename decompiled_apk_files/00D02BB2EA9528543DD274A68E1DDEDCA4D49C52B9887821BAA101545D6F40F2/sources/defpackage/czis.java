package defpackage;

import java.io.Closeable;
import java.nio.channels.FileLock;
/* compiled from: PG */
/* renamed from: czis  reason: default package */
/* loaded from: classes5.dex */
public final class czis implements Closeable {
    private FileLock a;

    public czis(FileLock fileLock) {
        this.a = fileLock;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileLock fileLock = this.a;
        if (fileLock != null) {
            fileLock.release();
            this.a = null;
        }
    }
}
