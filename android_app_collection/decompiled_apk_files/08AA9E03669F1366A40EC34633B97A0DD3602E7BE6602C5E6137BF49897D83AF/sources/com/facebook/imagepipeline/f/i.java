package com.facebook.imagepipeline.f;

import com.facebook.common.m.b;
import com.facebook.imagepipeline.d.q;
import com.facebook.imagepipeline.f.h;
/* compiled from: ImagePipelineExperiments.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f2663a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2664b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2665c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.d.k<Boolean> f2666d;
    private final q e;
    private final b.a f;
    private final boolean g;
    private final com.facebook.common.m.b h;
    private final boolean i;
    private final boolean j;

    private i(a aVar, h.a aVar2) {
        this.f2663a = aVar.f2669b;
        this.f2664b = aVar.f2670c;
        this.f2665c = aVar.f2671d;
        if (aVar.e == null) {
            this.f2666d = new com.facebook.common.d.k<Boolean>() { // from class: com.facebook.imagepipeline.f.i.1
                @Override // com.facebook.common.d.k
                /* renamed from: a */
                public Boolean b() {
                    return Boolean.FALSE;
                }
            };
        } else {
            this.f2666d = aVar.e;
        }
        this.e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.h;
        this.h = aVar.i;
        this.i = aVar.j;
        this.j = aVar.k;
    }

    public boolean a() {
        return this.f2665c;
    }

    public int b() {
        return this.f2663a;
    }

    public boolean c() {
        return this.f2666d.b().booleanValue();
    }

    public q d() {
        return this.e;
    }

    public boolean e() {
        return this.j;
    }

    public boolean f() {
        return this.f2664b;
    }

    public boolean g() {
        return this.g;
    }

    public b.a h() {
        return this.f;
    }

    public com.facebook.common.m.b i() {
        return this.h;
    }

    /* compiled from: ImagePipelineExperiments.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final h.a f2668a;
        private q f;
        private b.a g;
        private com.facebook.common.m.b i;

        /* renamed from: b  reason: collision with root package name */
        private int f2669b = 0;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2670c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2671d = false;
        private com.facebook.common.d.k<Boolean> e = null;
        private boolean h = false;
        private boolean j = false;
        private boolean k = false;

        public a(h.a aVar) {
            this.f2668a = aVar;
        }

        public i a() {
            return new i(this, this.f2668a);
        }
    }
}
