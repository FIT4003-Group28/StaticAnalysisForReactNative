package com.facebook.imagepipeline.m;
/* compiled from: ThumbnailBranchProducer.java */
/* loaded from: classes.dex */
public class av implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final aw<com.facebook.imagepipeline.i.d>[] f2823a;

    public av(aw<com.facebook.imagepipeline.i.d>... awVarArr) {
        this.f2823a = (aw[]) com.facebook.common.d.i.a(awVarArr);
        com.facebook.common.d.i.a(0, this.f2823a.length);
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        if (akVar.a().g() == null) {
            jVar.b(null, true);
        } else if (a(0, jVar, akVar)) {
        } else {
            jVar.b(null, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ThumbnailBranchProducer.java */
    /* loaded from: classes.dex */
    public class a extends m<com.facebook.imagepipeline.i.d, com.facebook.imagepipeline.i.d> {

        /* renamed from: b  reason: collision with root package name */
        private final ak f2825b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2826c;

        /* renamed from: d  reason: collision with root package name */
        private final com.facebook.imagepipeline.e.d f2827d;

        public a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar, int i) {
            super(jVar);
            this.f2825b = akVar;
            this.f2826c = i;
            this.f2827d = this.f2825b.a().g();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            if (dVar != null && (!z || ax.a(dVar, this.f2827d))) {
                d().b(dVar, z);
            } else if (!z) {
            } else {
                com.facebook.imagepipeline.i.d.d(dVar);
                if (av.this.a(this.f2826c + 1, d(), this.f2825b)) {
                    return;
                }
                d().b(null, true);
            }
        }

        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        protected void a(Throwable th) {
            if (!av.this.a(this.f2826c + 1, d(), this.f2825b)) {
                d().b(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        int a2 = a(i, akVar.a().g());
        if (a2 == -1) {
            return false;
        }
        this.f2823a[a2].a(new a(jVar, akVar, a2), akVar);
        return true;
    }

    private int a(int i, com.facebook.imagepipeline.e.d dVar) {
        while (i < this.f2823a.length) {
            if (this.f2823a[i].a(dVar)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
