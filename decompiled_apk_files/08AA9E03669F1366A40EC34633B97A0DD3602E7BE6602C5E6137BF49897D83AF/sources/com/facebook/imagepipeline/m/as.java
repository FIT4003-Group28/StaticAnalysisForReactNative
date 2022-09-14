package com.facebook.imagepipeline.m;

import java.util.Map;
/* compiled from: ThreadHandoffProducer.java */
/* loaded from: classes.dex */
public class as<T> implements aj<T> {

    /* renamed from: a  reason: collision with root package name */
    private final aj<T> f2806a;

    /* renamed from: b  reason: collision with root package name */
    private final at f2807b;

    public as(aj<T> ajVar, at atVar) {
        this.f2806a = (aj) com.facebook.common.d.i.a(ajVar);
        this.f2807b = atVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(final j<T> jVar, final ak akVar) {
        final am c2 = akVar.c();
        final String b2 = akVar.b();
        final aq<T> aqVar = new aq<T>(jVar, c2, "BackgroundThreadHandoffProducer", b2) { // from class: com.facebook.imagepipeline.m.as.1
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            protected void b(T t) {
            }

            @Override // com.facebook.common.b.e
            protected T c() {
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            public void a(T t) {
                c2.a(b2, "BackgroundThreadHandoffProducer", (Map<String, String>) null);
                as.this.f2806a.a(jVar, akVar);
            }
        };
        akVar.a(new e() { // from class: com.facebook.imagepipeline.m.as.2
            @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
            public void a() {
                aqVar.a();
                as.this.f2807b.b(aqVar);
            }
        });
        this.f2807b.a(aqVar);
    }
}
