package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: cmnm  reason: default package */
/* loaded from: classes5.dex */
public final class cmnm extends BufferedOutputStream {
    private boolean a;

    public cmnm(OutputStream outputStream) {
        super(outputStream);
    }

    public final void a(OutputStream outputStream) {
        cmmn.c(this.a);
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
        int i = cmny.a;
        throw th;
    }

    public cmnm(OutputStream outputStream, byte[] bArr) {
        super(outputStream, 20480);
    }
}
