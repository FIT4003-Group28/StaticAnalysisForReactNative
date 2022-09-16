package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: pwy  reason: default package */
/* loaded from: classes4.dex */
public final class pwy extends BufferedOutputStream {
    private boolean a;

    public pwy(OutputStream outputStream) {
        super(outputStream);
    }

    public final void a(OutputStream outputStream) {
        ptx.e(this.a);
        this.out = outputStream;
        this.count = 0;
        this.a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = pxi.a;
        throw th;
    }

    public pwy(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
