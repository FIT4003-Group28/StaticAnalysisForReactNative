package com.facebook.imagepipeline.m;
/* compiled from: BranchOnSeparateImagesProducer.java */
/* loaded from: classes.dex */
public class i implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final aj<com.facebook.imagepipeline.i.d> f2847a;

    /* renamed from: b  reason: collision with root package name */
    private final aj<com.facebook.imagepipeline.i.d> f2848b;

    public i(aj<com.facebook.imagepipeline.i.d> ajVar, aj<com.facebook.imagepipeline.i.d> ajVar2) {
        this.f2847a = ajVar;
        this.f2848b = ajVar2;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        this.f2847a.a(new a(jVar, akVar), akVar);
    }

    /* compiled from: BranchOnSeparateImagesProducer.java */
    /* loaded from: classes.dex */
    private class a extends m<com.facebook.imagepipeline.i.d, com.facebook.imagepipeline.i.d> {

        /* renamed from: b  reason: collision with root package name */
        private ak f2850b;

        private a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
            super(jVar);
            this.f2850b = akVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            com.facebook.imagepipeline.n.b a2 = this.f2850b.a();
            boolean a3 = ax.a(dVar, a2.g());
            if (dVar != null && (a3 || a2.k())) {
                d().b(dVar, z && a3);
            }
            if (!z || a3) {
                return;
            }
            com.facebook.imagepipeline.i.d.d(dVar);
            i.this.f2848b.a(d(), this.f2850b);
        }

        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        protected void a(Throwable th) {
            i.this.f2848b.a(d(), this.f2850b);
        }
    }
}
