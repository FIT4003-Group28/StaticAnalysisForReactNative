package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: axja  reason: default package */
/* loaded from: classes2.dex */
public interface axja extends Closeable {
    int a(ByteBuffer byteBuffer);

    long b();

    long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long d(long j, long j2, WritableByteChannel writableByteChannel);

    ByteBuffer e(long j, long j2);

    void f(long j);
}
