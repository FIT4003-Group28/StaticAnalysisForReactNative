package com.facebook.imagepipeline.m;

import android.util.Pair;
import com.facebook.imagepipeline.n.b;
/* compiled from: EncodedCacheKeyMultiplexProducer.java */
/* loaded from: classes.dex */
public class q extends ae<Pair<com.facebook.b.a.d, b.EnumC0062b>, com.facebook.imagepipeline.i.d> {

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.f f2882b;

    public q(com.facebook.imagepipeline.d.f fVar, aj ajVar) {
        super(ajVar);
        this.f2882b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.m.ae
    /* renamed from: a */
    public Pair<com.facebook.b.a.d, b.EnumC0062b> b(ak akVar) {
        return Pair.create(this.f2882b.c(akVar.a(), akVar.d()), akVar.e());
    }

    @Override // com.facebook.imagepipeline.m.ae
    public com.facebook.imagepipeline.i.d a(com.facebook.imagepipeline.i.d dVar) {
        return com.facebook.imagepipeline.i.d.a(dVar);
    }
}
