package com.facebook.imagepipeline.d;

import com.facebook.imagepipeline.n.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SplitCachesByImageSizeDiskCachePolicy.java */
/* loaded from: classes.dex */
public class aa implements l {

    /* renamed from: a  reason: collision with root package name */
    private final e f2549a;

    /* renamed from: b  reason: collision with root package name */
    private final e f2550b;

    /* renamed from: c  reason: collision with root package name */
    private final f f2551c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2552d;

    public aa(e eVar, e eVar2, f fVar, int i) {
        this.f2549a = eVar;
        this.f2550b = eVar2;
        this.f2551c = fVar;
        this.f2552d = i;
    }

    @Override // com.facebook.imagepipeline.d.l
    public a.h<com.facebook.imagepipeline.i.d> a(com.facebook.imagepipeline.n.b bVar, Object obj, final AtomicBoolean atomicBoolean) {
        e eVar;
        final e eVar2;
        final com.facebook.b.a.d c2 = this.f2551c.c(bVar, obj);
        boolean a2 = this.f2550b.a(c2);
        boolean a3 = this.f2549a.a(c2);
        if (a2 || !a3) {
            eVar = this.f2550b;
            eVar2 = this.f2549a;
        } else {
            eVar = this.f2549a;
            eVar2 = this.f2550b;
        }
        return eVar.a(c2, atomicBoolean).b(new a.f<com.facebook.imagepipeline.i.d, a.h<com.facebook.imagepipeline.i.d>>() { // from class: com.facebook.imagepipeline.d.aa.1
            @Override // a.f
            /* renamed from: b */
            public a.h<com.facebook.imagepipeline.i.d> a(a.h<com.facebook.imagepipeline.i.d> hVar) {
                return (aa.b(hVar) || (!hVar.d() && hVar.e() != null)) ? hVar : eVar2.a(c2, atomicBoolean);
            }
        });
    }

    @Override // com.facebook.imagepipeline.d.l
    public void a(com.facebook.imagepipeline.i.d dVar, com.facebook.imagepipeline.n.b bVar, Object obj) {
        com.facebook.b.a.d c2 = this.f2551c.c(bVar, obj);
        switch (a(bVar, dVar)) {
            case DEFAULT:
                this.f2549a.a(c2, dVar);
                return;
            case SMALL:
                this.f2550b.a(c2, dVar);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.imagepipeline.d.l
    public b.a a(com.facebook.imagepipeline.n.b bVar, com.facebook.imagepipeline.i.d dVar) {
        int k = dVar.k();
        if (k >= 0 && k < this.f2552d) {
            return b.a.SMALL;
        }
        return b.a.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(a.h<?> hVar) {
        return hVar.c() || (hVar.d() && (hVar.f() instanceof CancellationException));
    }
}
