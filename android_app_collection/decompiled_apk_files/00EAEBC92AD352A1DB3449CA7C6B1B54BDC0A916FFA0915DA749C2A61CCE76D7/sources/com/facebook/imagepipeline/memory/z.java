package com.facebook.imagepipeline.memory;
/* loaded from: classes.dex */
public class z extends c.d.d.g.j {

    /* renamed from: b  reason: collision with root package name */
    private final v f5275b;

    /* renamed from: c  reason: collision with root package name */
    private c.d.d.h.a<u> f5276c;

    /* renamed from: d  reason: collision with root package name */
    private int f5277d;

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public z(v vVar) {
        this(vVar, vVar.d());
    }

    public z(v vVar, int i) {
        c.d.d.d.i.a(i > 0);
        c.d.d.d.i.a(vVar);
        this.f5275b = vVar;
        this.f5277d = 0;
        this.f5276c = c.d.d.h.a.a(this.f5275b.mo186get(i), this.f5275b);
    }

    private void b() {
        if (c.d.d.h.a.c(this.f5276c)) {
            return;
        }
        throw new a();
    }

    @Override // c.d.d.g.j
    /* renamed from: a  reason: collision with other method in class */
    public x mo193a() {
        b();
        return new x(this.f5276c, this.f5277d);
    }

    void b(int i) {
        b();
        if (i <= this.f5276c.b().b()) {
            return;
        }
        u mo186get = this.f5275b.mo186get(i);
        this.f5276c.b().a(0, mo186get, 0, this.f5277d);
        this.f5276c.close();
        this.f5276c = c.d.d.h.a.a(mo186get, this.f5275b);
    }

    @Override // c.d.d.g.j, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c.d.d.h.a.b(this.f5276c);
        this.f5276c = null;
        this.f5277d = -1;
        super.close();
    }

    @Override // c.d.d.g.j
    public int size() {
        return this.f5277d;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            b();
            b(this.f5277d + i2);
            this.f5276c.b().b(this.f5277d, bArr, i, i2);
            this.f5277d += i2;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
    }
}
