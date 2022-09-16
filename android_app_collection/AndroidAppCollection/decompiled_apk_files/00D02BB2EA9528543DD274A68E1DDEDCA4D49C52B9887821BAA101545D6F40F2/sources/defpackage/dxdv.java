package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxdv  reason: default package */
/* loaded from: classes6.dex */
public final class dxdv extends FilterOutputStream {
    final /* synthetic */ dxdw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxdv(dxdw dxdwVar, OutputStream outputStream) {
        super(outputStream);
        this.a = dxdwVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.out.close();
        } catch (IOException unused) {
            this.a.d = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.out.flush();
        } catch (IOException unused) {
            this.a.d = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException unused) {
            this.a.d = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.a.d = true;
        }
    }
}
