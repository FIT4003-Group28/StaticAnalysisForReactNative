package com.facebook.f.a.a;

import android.content.Context;
import android.net.Uri;
import com.facebook.f.c.b;
import com.facebook.imagepipeline.n.b;
import java.util.Set;
/* compiled from: PipelineDraweeControllerBuilder.java */
/* loaded from: classes.dex */
public class e extends com.facebook.f.c.b<e, com.facebook.imagepipeline.n.b, com.facebook.common.h.a<com.facebook.imagepipeline.i.b>, com.facebook.imagepipeline.i.e> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.f.g f2355a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2356b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.c.b
    /* renamed from: b */
    public e c() {
        return this;
    }

    public e(Context context, g gVar, com.facebook.imagepipeline.f.g gVar2, Set<com.facebook.f.c.d> set) {
        super(context, set);
        this.f2355a = gVar2;
        this.f2356b = gVar;
    }

    @Override // com.facebook.f.h.d
    /* renamed from: a */
    public e b(Uri uri) {
        if (uri == null) {
            return (e) super.b((e) null);
        }
        return (e) super.b((e) com.facebook.imagepipeline.n.c.a(uri).a(com.facebook.imagepipeline.e.e.c()).n());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.c.b
    /* renamed from: a */
    public d d() {
        com.facebook.f.h.a k = k();
        if (k instanceof d) {
            d dVar = (d) k;
            dVar.a(p(), o(), r(), f());
            return dVar;
        }
        return this.f2356b.a(p(), o(), r(), f());
    }

    private com.facebook.b.a.d r() {
        com.facebook.imagepipeline.n.b g = g();
        com.facebook.imagepipeline.d.f e = this.f2355a.e();
        if (e == null || g == null) {
            return null;
        }
        if (g.p() != null) {
            return e.b(g, f());
        }
        return e.a(g, f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.c.b
    public com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> a(com.facebook.imagepipeline.n.b bVar, Object obj, b.a aVar) {
        return this.f2355a.a(bVar, obj, a(aVar));
    }

    public static b.EnumC0062b a(b.a aVar) {
        switch (aVar) {
            case FULL_FETCH:
                return b.EnumC0062b.FULL_FETCH;
            case DISK_CACHE:
                return b.EnumC0062b.DISK_CACHE;
            case BITMAP_MEMORY_CACHE:
                return b.EnumC0062b.BITMAP_MEMORY_CACHE;
            default:
                throw new RuntimeException("Cache level" + aVar + "is not supported. ");
        }
    }
}
