package com.facebook.b.b;

import android.content.Context;
import com.facebook.common.d.k;
import java.io.File;
/* compiled from: DiskCacheConfig.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f2202a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2203b;

    /* renamed from: c  reason: collision with root package name */
    private final k<File> f2204c;

    /* renamed from: d  reason: collision with root package name */
    private final long f2205d;
    private final long e;
    private final long f;
    private final h g;
    private final com.facebook.b.a.a h;
    private final com.facebook.b.a.c i;
    private final com.facebook.common.a.b j;
    private final Context k;
    private final boolean l;

    private c(a aVar) {
        com.facebook.b.a.a aVar2;
        com.facebook.b.a.c cVar;
        com.facebook.common.a.b bVar;
        this.f2202a = aVar.f2206a;
        this.f2203b = (String) com.facebook.common.d.i.a(aVar.f2207b);
        this.f2204c = (k) com.facebook.common.d.i.a(aVar.f2208c);
        this.f2205d = aVar.f2209d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = (h) com.facebook.common.d.i.a(aVar.g);
        if (aVar.h == null) {
            aVar2 = com.facebook.b.a.g.a();
        } else {
            aVar2 = aVar.h;
        }
        this.h = aVar2;
        if (aVar.i == null) {
            cVar = com.facebook.b.a.h.b();
        } else {
            cVar = aVar.i;
        }
        this.i = cVar;
        if (aVar.j == null) {
            bVar = com.facebook.common.a.c.a();
        } else {
            bVar = aVar.j;
        }
        this.j = bVar;
        this.k = aVar.l;
        this.l = aVar.k;
    }

    public int a() {
        return this.f2202a;
    }

    public String b() {
        return this.f2203b;
    }

    public k<File> c() {
        return this.f2204c;
    }

    public long d() {
        return this.f2205d;
    }

    public long e() {
        return this.e;
    }

    public long f() {
        return this.f;
    }

    public h g() {
        return this.g;
    }

    public com.facebook.b.a.a h() {
        return this.h;
    }

    public com.facebook.b.a.c i() {
        return this.i;
    }

    public com.facebook.common.a.b j() {
        return this.j;
    }

    public Context k() {
        return this.k;
    }

    public boolean l() {
        return this.l;
    }

    public static a a(Context context) {
        return new a(context);
    }

    /* compiled from: DiskCacheConfig.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f2206a;

        /* renamed from: b  reason: collision with root package name */
        private String f2207b;

        /* renamed from: c  reason: collision with root package name */
        private k<File> f2208c;

        /* renamed from: d  reason: collision with root package name */
        private long f2209d;
        private long e;
        private long f;
        private h g;
        private com.facebook.b.a.a h;
        private com.facebook.b.a.c i;
        private com.facebook.common.a.b j;
        private boolean k;
        private final Context l;

        private a(Context context) {
            this.f2206a = 1;
            this.f2207b = "image_cache";
            this.f2209d = 41943040L;
            this.e = 10485760L;
            this.f = 2097152L;
            this.g = new b();
            this.l = context;
        }

        public c a() {
            com.facebook.common.d.i.b((this.f2208c == null && this.l == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f2208c == null && this.l != null) {
                this.f2208c = new k<File>() { // from class: com.facebook.b.b.c.a.1
                    @Override // com.facebook.common.d.k
                    /* renamed from: a */
                    public File b() {
                        return a.this.l.getApplicationContext().getCacheDir();
                    }
                };
            }
            return new c(this);
        }
    }
}
