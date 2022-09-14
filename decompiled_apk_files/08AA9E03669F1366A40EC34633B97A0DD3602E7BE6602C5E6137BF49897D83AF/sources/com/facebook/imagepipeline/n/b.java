package com.facebook.imagepipeline.n;

import android.net.Uri;
import com.facebook.common.d.h;
import java.io.File;
/* compiled from: ImageRequest.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f2982a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f2983b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2984c;

    /* renamed from: d  reason: collision with root package name */
    private final d f2985d;
    private File e;
    private final boolean f;
    private final boolean g;
    private final com.facebook.imagepipeline.e.a h;
    private final com.facebook.imagepipeline.e.d i;
    private final com.facebook.imagepipeline.e.e j;
    private final com.facebook.imagepipeline.e.c k;
    private final EnumC0062b l;
    private final boolean m;
    private final e n;
    private final com.facebook.imagepipeline.j.c o;

    /* compiled from: ImageRequest.java */
    /* loaded from: classes.dex */
    public enum a {
        SMALL,
        DEFAULT
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(c cVar) {
        this.f2982a = cVar.g();
        this.f2983b = cVar.a();
        this.f2984c = a(this.f2983b);
        this.f2985d = cVar.b();
        this.f = cVar.h();
        this.g = cVar.i();
        this.h = cVar.f();
        this.i = cVar.d();
        this.j = cVar.e() == null ? com.facebook.imagepipeline.e.e.a() : cVar.e();
        this.k = cVar.k();
        this.l = cVar.c();
        this.m = cVar.j();
        this.n = cVar.l();
        this.o = cVar.m();
    }

    public a a() {
        return this.f2982a;
    }

    public Uri b() {
        return this.f2983b;
    }

    public int c() {
        return this.f2984c;
    }

    public d d() {
        return this.f2985d;
    }

    public int e() {
        if (this.i != null) {
            return this.i.f2632a;
        }
        return 2048;
    }

    public int f() {
        if (this.i != null) {
            return this.i.f2633b;
        }
        return 2048;
    }

    public com.facebook.imagepipeline.e.d g() {
        return this.i;
    }

    public com.facebook.imagepipeline.e.e h() {
        return this.j;
    }

    public com.facebook.imagepipeline.e.a i() {
        return this.h;
    }

    public boolean j() {
        return this.f;
    }

    public boolean k() {
        return this.g;
    }

    public com.facebook.imagepipeline.e.c l() {
        return this.k;
    }

    public EnumC0062b m() {
        return this.l;
    }

    public boolean n() {
        return this.m;
    }

    public synchronized File o() {
        if (this.e == null) {
            this.e = new File(this.f2983b.getPath());
        }
        return this.e;
    }

    public e p() {
        return this.n;
    }

    public com.facebook.imagepipeline.j.c q() {
        return this.o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f2983b, bVar.f2983b) && h.a(this.f2982a, bVar.f2982a) && h.a(this.f2985d, bVar.f2985d) && h.a(this.e, bVar.e);
    }

    public int hashCode() {
        return h.a(this.f2982a, this.f2983b, this.f2985d, this.e);
    }

    public String toString() {
        return h.a(this).a("uri", this.f2983b).a("cacheChoice", this.f2982a).a("decodeOptions", this.h).a("postprocessor", this.n).a("priority", this.k).a("resizeOptions", this.i).a("rotationOptions", this.j).a("mediaVariations", this.f2985d).toString();
    }

    /* compiled from: ImageRequest.java */
    /* renamed from: com.facebook.imagepipeline.n.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0062b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int e;

        EnumC0062b(int i) {
            this.e = i;
        }

        public int a() {
            return this.e;
        }

        public static EnumC0062b a(EnumC0062b enumC0062b, EnumC0062b enumC0062b2) {
            return enumC0062b.a() > enumC0062b2.a() ? enumC0062b : enumC0062b2;
        }
    }

    private static int a(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (com.facebook.common.l.f.a(uri)) {
            return 0;
        }
        if (com.facebook.common.l.f.b(uri)) {
            return com.facebook.common.f.a.a(com.facebook.common.f.a.b(uri.getPath())) ? 2 : 3;
        } else if (com.facebook.common.l.f.c(uri)) {
            return 4;
        } else {
            if (com.facebook.common.l.f.f(uri)) {
                return 5;
            }
            if (com.facebook.common.l.f.g(uri)) {
                return 6;
            }
            if (com.facebook.common.l.f.i(uri)) {
                return 7;
            }
            return com.facebook.common.l.f.h(uri) ? 8 : -1;
        }
    }
}
