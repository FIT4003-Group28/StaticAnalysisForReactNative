package com.facebook.imagepipeline.g;

import com.facebook.common.d.i;
import com.facebook.imagepipeline.m.aj;
import com.facebook.imagepipeline.m.ap;
import com.facebook.imagepipeline.m.j;
/* compiled from: AbstractProducerToDataSourceAdapter.java */
/* loaded from: classes.dex */
public abstract class a<T> extends com.facebook.c.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ap f2687a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.j.c f2688b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(aj<T> ajVar, ap apVar, com.facebook.imagepipeline.j.c cVar) {
        this.f2687a = apVar;
        this.f2688b = cVar;
        this.f2688b.a(apVar.a(), this.f2687a.d(), this.f2687a.b(), this.f2687a.f());
        ajVar.a(j(), apVar);
    }

    private j<T> j() {
        return new com.facebook.imagepipeline.m.b<T>() { // from class: com.facebook.imagepipeline.g.a.1
            @Override // com.facebook.imagepipeline.m.b
            protected void a(T t, boolean z) {
                a.this.b((a) t, z);
            }

            @Override // com.facebook.imagepipeline.m.b
            protected void a(Throwable th) {
                a.this.b(th);
            }

            @Override // com.facebook.imagepipeline.m.b
            protected void a() {
                a.this.k();
            }

            @Override // com.facebook.imagepipeline.m.b
            protected void a(float f) {
                a.this.a(f);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(T t, boolean z) {
        if (!super.a((a<T>) t, z) || !z) {
            return;
        }
        this.f2688b.a(this.f2687a.a(), this.f2687a.b(), this.f2687a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Throwable th) {
        if (super.a(th)) {
            this.f2688b.a(this.f2687a.a(), this.f2687a.b(), th, this.f2687a.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        i.b(a());
    }

    @Override // com.facebook.c.a, com.facebook.c.c
    public boolean h() {
        if (!super.h()) {
            return false;
        }
        if (super.b()) {
            return true;
        }
        this.f2688b.a(this.f2687a.b());
        this.f2687a.i();
        return true;
    }
}
