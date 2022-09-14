package com.facebook.imagepipeline.m;

import android.util.Pair;
import com.facebook.imagepipeline.n.b;
/* compiled from: BitmapMemoryCacheKeyMultiplexProducer.java */
/* loaded from: classes.dex */
public class g extends ae<Pair<com.facebook.b.a.d, b.EnumC0062b>, com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.f f2841b;

    public g(com.facebook.imagepipeline.d.f fVar, aj ajVar) {
        super(ajVar);
        this.f2841b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.m.ae
    /* renamed from: a */
    public Pair<com.facebook.b.a.d, b.EnumC0062b> b(ak akVar) {
        return Pair.create(this.f2841b.a(akVar.a(), akVar.d()), akVar.e());
    }

    @Override // com.facebook.imagepipeline.m.ae
    public com.facebook.common.h.a<com.facebook.imagepipeline.i.b> a(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar) {
        return com.facebook.common.h.a.b(aVar);
    }
}
