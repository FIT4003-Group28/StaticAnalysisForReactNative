package com.facebook.imagepipeline.memory;
/* compiled from: NativePooledByteBufferOutputStream.java */
/* loaded from: classes.dex */
public class o extends com.facebook.common.g.j {

    /* renamed from: a  reason: collision with root package name */
    private final l f2960a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.common.h.a<NativeMemoryChunk> f2961b;

    /* renamed from: c  reason: collision with root package name */
    private int f2962c;

    public o(l lVar) {
        this(lVar, lVar.d());
    }

    public o(l lVar, int i) {
        com.facebook.common.d.i.a(i > 0);
        this.f2960a = (l) com.facebook.common.d.i.a(lVar);
        this.f2962c = 0;
        this.f2961b = com.facebook.common.h.a.a(this.f2960a.a(i), this.f2960a);
    }

    @Override // com.facebook.common.g.j
    /* renamed from: c */
    public m a() {
        d();
        return new m(this.f2961b, this.f2962c);
    }

    @Override // com.facebook.common.g.j
    public int b() {
        return this.f2962c;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        d();
        a(this.f2962c + i2);
        this.f2961b.a().a(this.f2962c, bArr, i, i2);
        this.f2962c += i2;
    }

    @Override // com.facebook.common.g.j, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.facebook.common.h.a.c(this.f2961b);
        this.f2961b = null;
        this.f2962c = -1;
        super.close();
    }

    void a(int i) {
        d();
        if (i <= this.f2961b.a().b()) {
            return;
        }
        NativeMemoryChunk a2 = this.f2960a.a(i);
        this.f2961b.a().a(0, a2, 0, this.f2962c);
        this.f2961b.close();
        this.f2961b = com.facebook.common.h.a.a(a2, this.f2960a);
    }

    private void d() {
        if (!com.facebook.common.h.a.a((com.facebook.common.h.a<?>) this.f2961b)) {
            throw new a();
        }
    }

    /* compiled from: NativePooledByteBufferOutputStream.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }
}
