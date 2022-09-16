package defpackage;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: daru  reason: default package */
/* loaded from: classes5.dex */
final class daru extends BufferedOutputStream {
    public daru(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
    }
}
