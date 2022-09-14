package com.facebook.imagepipeline.memory;
/* compiled from: FlexByteArrayPool.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    final a f2953a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.h.c<byte[]> f2954b;

    public j(com.facebook.common.g.c cVar, t tVar) {
        com.facebook.common.d.i.a(tVar.f > 0);
        this.f2953a = new a(cVar, tVar, p.a());
        this.f2954b = new com.facebook.common.h.c<byte[]>() { // from class: com.facebook.imagepipeline.memory.j.1
            @Override // com.facebook.common.h.c
            public void a(byte[] bArr) {
                j.this.a(bArr);
            }
        };
    }

    public com.facebook.common.h.a<byte[]> a(int i) {
        return com.facebook.common.h.a.a(this.f2953a.a(i), this.f2954b);
    }

    public void a(byte[] bArr) {
        this.f2953a.a((a) bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlexByteArrayPool.java */
    /* loaded from: classes.dex */
    public static class a extends k {
        public a(com.facebook.common.g.c cVar, t tVar, u uVar) {
            super(cVar, tVar, uVar);
        }

        @Override // com.facebook.imagepipeline.memory.a
        e<byte[]> g(int i) {
            return new q(d(i), this.f2935b.f, 0);
        }
    }
}
