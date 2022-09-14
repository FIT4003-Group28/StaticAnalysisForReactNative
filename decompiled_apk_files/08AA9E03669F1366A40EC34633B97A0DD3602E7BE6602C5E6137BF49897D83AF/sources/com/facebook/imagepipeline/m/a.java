package com.facebook.imagepipeline.m;
/* compiled from: AddImageTransformMetaDataProducer.java */
/* loaded from: classes.dex */
public class a implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final aj<com.facebook.imagepipeline.i.d> f2725a;

    public a(aj<com.facebook.imagepipeline.i.d> ajVar) {
        this.f2725a = ajVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        this.f2725a.a(new C0059a(jVar), akVar);
    }

    /* compiled from: AddImageTransformMetaDataProducer.java */
    /* renamed from: com.facebook.imagepipeline.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0059a extends m<com.facebook.imagepipeline.i.d, com.facebook.imagepipeline.i.d> {
        private C0059a(j<com.facebook.imagepipeline.i.d> jVar) {
            super(jVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            if (dVar == null) {
                d().b(null, z);
                return;
            }
            if (!com.facebook.imagepipeline.i.d.c(dVar)) {
                dVar.l();
            }
            d().b(dVar, z);
        }
    }
}
