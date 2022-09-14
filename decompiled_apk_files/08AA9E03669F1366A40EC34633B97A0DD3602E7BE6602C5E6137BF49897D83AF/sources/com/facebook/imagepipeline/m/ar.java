package com.facebook.imagepipeline.m;
/* compiled from: SwallowResultProducer.java */
/* loaded from: classes.dex */
public class ar<T> implements aj<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final aj<T> f2804a;

    public ar(aj<T> ajVar) {
        this.f2804a = ajVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<Void> jVar, ak akVar) {
        this.f2804a.a(new m<T, Void>(jVar) { // from class: com.facebook.imagepipeline.m.ar.1
            @Override // com.facebook.imagepipeline.m.b
            protected void a(T t, boolean z) {
                if (z) {
                    d().b(null, z);
                }
            }
        }, akVar);
    }
}
