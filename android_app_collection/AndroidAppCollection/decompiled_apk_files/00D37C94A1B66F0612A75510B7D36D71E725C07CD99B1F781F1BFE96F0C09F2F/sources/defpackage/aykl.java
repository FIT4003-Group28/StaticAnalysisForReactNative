package defpackage;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aykl  reason: default package */
/* loaded from: classes2.dex */
public interface aykl extends Closeable {
    void b();

    void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean d();

    int e();

    int f();

    aykl g(int i);

    void i(ByteBuffer byteBuffer);

    void j(OutputStream outputStream, int i);

    void k(byte[] bArr, int i, int i2);

    void l(int i);
}
