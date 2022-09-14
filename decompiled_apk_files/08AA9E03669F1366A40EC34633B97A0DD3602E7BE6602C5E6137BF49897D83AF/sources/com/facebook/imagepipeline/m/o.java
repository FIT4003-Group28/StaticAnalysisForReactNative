package com.facebook.imagepipeline.m;

import com.facebook.imagepipeline.n.b;
/* compiled from: DiskCacheWriteProducer.java */
/* loaded from: classes.dex */
public class o implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final aj<com.facebook.imagepipeline.i.d> f2878a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.l f2879b;

    public o(aj<com.facebook.imagepipeline.i.d> ajVar, com.facebook.imagepipeline.d.l lVar) {
        this.f2878a = ajVar;
        this.f2879b = lVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        b(jVar, akVar);
    }

    private void b(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        if (akVar.e().a() >= b.EnumC0062b.DISK_CACHE.a()) {
            jVar.b(null, true);
            return;
        }
        if (akVar.a().n()) {
            jVar = new a(jVar, akVar, this.f2879b);
        }
        this.f2878a.a(jVar, akVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskCacheWriteProducer.java */
    /* loaded from: classes.dex */
    public static class a extends m<com.facebook.imagepipeline.i.d, com.facebook.imagepipeline.i.d> {

        /* renamed from: a  reason: collision with root package name */
        private final ak f2880a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.imagepipeline.d.l f2881b;

        private a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar, com.facebook.imagepipeline.d.l lVar) {
            super(jVar);
            this.f2880a = akVar;
            this.f2881b = lVar;
        }

        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            if (dVar != null && z) {
                this.f2881b.a(dVar, this.f2880a.a(), this.f2880a.d());
            }
            d().b(dVar, z);
        }
    }
}
