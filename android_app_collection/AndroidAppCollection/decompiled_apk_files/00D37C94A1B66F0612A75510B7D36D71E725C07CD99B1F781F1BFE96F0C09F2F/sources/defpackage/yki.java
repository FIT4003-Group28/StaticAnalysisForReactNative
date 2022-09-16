package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: yki  reason: default package */
/* loaded from: classes4.dex */
public final class yki extends FilterOutputStream {
    final /* synthetic */ ykj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yki(ykj ykjVar, OutputStream outputStream) {
        super(outputStream);
        this.a = ykjVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.out.close();
        } catch (IOException unused) {
            this.a.b = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.out.flush();
        } catch (IOException unused) {
            this.a.b = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException unused) {
            this.a.b = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.a.b = true;
        }
    }
}
