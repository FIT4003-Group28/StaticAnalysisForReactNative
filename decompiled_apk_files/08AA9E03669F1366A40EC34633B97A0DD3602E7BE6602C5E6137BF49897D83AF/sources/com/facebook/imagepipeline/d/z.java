package com.facebook.imagepipeline.d;

import com.facebook.imagepipeline.n.b;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SmallCacheIfRequestedDiskCachePolicy.java */
/* loaded from: classes.dex */
public class z implements l {

    /* renamed from: a  reason: collision with root package name */
    private final e f2617a;

    /* renamed from: b  reason: collision with root package name */
    private final e f2618b;

    /* renamed from: c  reason: collision with root package name */
    private final f f2619c;

    public z(e eVar, e eVar2, f fVar) {
        this.f2617a = eVar;
        this.f2618b = eVar2;
        this.f2619c = fVar;
    }

    @Override // com.facebook.imagepipeline.d.l
    public a.h<com.facebook.imagepipeline.i.d> a(com.facebook.imagepipeline.n.b bVar, Object obj, AtomicBoolean atomicBoolean) {
        com.facebook.b.a.d c2 = this.f2619c.c(bVar, obj);
        if (bVar.a() == b.a.SMALL) {
            return this.f2618b.a(c2, atomicBoolean);
        }
        return this.f2617a.a(c2, atomicBoolean);
    }

    @Override // com.facebook.imagepipeline.d.l
    public void a(com.facebook.imagepipeline.i.d dVar, com.facebook.imagepipeline.n.b bVar, Object obj) {
        com.facebook.b.a.d c2 = this.f2619c.c(bVar, obj);
        if (a(bVar, dVar) == b.a.SMALL) {
            this.f2618b.a(c2, dVar);
        } else {
            this.f2617a.a(c2, dVar);
        }
    }

    @Override // com.facebook.imagepipeline.d.l
    public b.a a(com.facebook.imagepipeline.n.b bVar, com.facebook.imagepipeline.i.d dVar) {
        return bVar.a() == null ? b.a.DEFAULT : bVar.a();
    }
}
