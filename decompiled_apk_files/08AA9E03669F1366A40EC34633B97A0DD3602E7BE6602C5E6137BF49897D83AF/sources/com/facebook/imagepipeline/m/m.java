package com.facebook.imagepipeline.m;
/* compiled from: DelegatingConsumer.java */
/* loaded from: classes.dex */
public abstract class m<I, O> extends b<I> {

    /* renamed from: a  reason: collision with root package name */
    private final j<O> f2869a;

    public m(j<O> jVar) {
        this.f2869a = jVar;
    }

    public j<O> d() {
        return this.f2869a;
    }

    @Override // com.facebook.imagepipeline.m.b
    protected void a(Throwable th) {
        this.f2869a.b(th);
    }

    @Override // com.facebook.imagepipeline.m.b
    protected void a() {
        this.f2869a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.m.b
    public void a(float f) {
        this.f2869a.b(f);
    }
}
