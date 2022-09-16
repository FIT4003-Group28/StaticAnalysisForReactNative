package com.facebook.imagepipeline.memory;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface u {
    byte a(int i);

    int a(int i, byte[] bArr, int i2, int i3);

    long a();

    void a(int i, u uVar, int i2, int i3);

    int b();

    int b(int i, byte[] bArr, int i2, int i3);

    ByteBuffer c();

    void close();

    long d();

    boolean isClosed();
}
