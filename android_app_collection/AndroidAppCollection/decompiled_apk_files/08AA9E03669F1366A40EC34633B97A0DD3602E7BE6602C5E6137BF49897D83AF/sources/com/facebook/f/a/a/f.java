package com.facebook.f.a.a;

import android.content.Context;
import com.facebook.common.d.k;
import com.facebook.imagepipeline.f.j;
import java.util.Set;
/* compiled from: PipelineDraweeControllerBuilderSupplier.java */
/* loaded from: classes.dex */
public class f implements k<e> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2358a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.f.g f2359b;

    /* renamed from: c  reason: collision with root package name */
    private final g f2360c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<com.facebook.f.c.d> f2361d;

    public f(Context context, b bVar) {
        this(context, j.a(), bVar);
    }

    public f(Context context, j jVar, b bVar) {
        this(context, jVar, null, bVar);
    }

    public f(Context context, j jVar, Set<com.facebook.f.c.d> set, b bVar) {
        this.f2358a = context;
        this.f2359b = jVar.i();
        com.facebook.imagepipeline.a.a.b b2 = jVar.b();
        k<Boolean> kVar = null;
        com.facebook.imagepipeline.a.a.a a2 = b2 != null ? b2.a(context) : null;
        if (bVar != null && bVar.b() != null) {
            this.f2360c = bVar.b();
        } else {
            this.f2360c = new g();
        }
        this.f2360c.a(context.getResources(), com.facebook.f.b.a.a(), a2, com.facebook.common.b.f.b(), this.f2359b.d(), bVar != null ? bVar.a() : null, bVar != null ? bVar.c() : kVar);
        this.f2361d = set;
    }

    @Override // com.facebook.common.d.k
    /* renamed from: a */
    public e b() {
        return new e(this.f2358a, this.f2360c, this.f2359b, this.f2361d);
    }
}
