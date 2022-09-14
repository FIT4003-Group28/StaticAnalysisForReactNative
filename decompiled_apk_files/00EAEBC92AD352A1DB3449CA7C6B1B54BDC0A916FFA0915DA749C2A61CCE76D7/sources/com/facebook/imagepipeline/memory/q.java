package com.facebook.imagepipeline.memory;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.d.h.c<byte[]> f5261a;

    /* renamed from: b  reason: collision with root package name */
    final b f5262b;

    /* loaded from: classes.dex */
    class a implements c.d.d.h.c<byte[]> {
        a() {
        }

        @Override // c.d.d.h.c
        public void a(byte[] bArr) {
            q.this.a(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends r {
        public b(c.d.d.g.c cVar, g0 g0Var, h0 h0Var) {
            super(cVar, g0Var, h0Var);
        }

        @Override // com.facebook.imagepipeline.memory.a
        f<byte[]> f(int i) {
            e(i);
            return new c0(i, this.f5195c.f5254e, 0);
        }
    }

    public q(c.d.d.g.c cVar, g0 g0Var) {
        c.d.d.d.i.a(g0Var.f5254e > 0);
        this.f5262b = new b(cVar, g0Var, b0.c());
        this.f5261a = new a();
    }

    public c.d.d.h.a<byte[]> a(int i) {
        return c.d.d.h.a.a(this.f5262b.mo186get(i), this.f5261a);
    }

    public void a(byte[] bArr) {
        this.f5262b.a((b) bArr);
    }
}
