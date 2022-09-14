package com.facebook.b.b;

import com.facebook.b.a.a;
import com.facebook.b.b.d;
import com.facebook.common.c.c;
import com.facebook.common.d.k;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
/* compiled from: DynamicDefaultDiskStorage.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f2222b = f.class;

    /* renamed from: a  reason: collision with root package name */
    volatile a f2223a = new a(null, null);

    /* renamed from: c  reason: collision with root package name */
    private final int f2224c;

    /* renamed from: d  reason: collision with root package name */
    private final k<File> f2225d;
    private final String e;
    private final com.facebook.b.a.a f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DynamicDefaultDiskStorage.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f2226a;

        /* renamed from: b  reason: collision with root package name */
        public final File f2227b;

        a(File file, d dVar) {
            this.f2226a = dVar;
            this.f2227b = file;
        }
    }

    public f(int i, k<File> kVar, String str, com.facebook.b.a.a aVar) {
        this.f2224c = i;
        this.f = aVar;
        this.f2225d = kVar;
        this.e = str;
    }

    @Override // com.facebook.b.b.d
    public boolean a() {
        try {
            return d().a();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.facebook.b.b.d
    public com.facebook.a.a b(String str, Object obj) {
        return d().b(str, obj);
    }

    @Override // com.facebook.b.b.d
    public boolean c(String str, Object obj) {
        return d().c(str, obj);
    }

    @Override // com.facebook.b.b.d
    public void b() {
        try {
            d().b();
        } catch (IOException e) {
            com.facebook.common.e.a.b(f2222b, "purgeUnexpectedResources", (Throwable) e);
        }
    }

    @Override // com.facebook.b.b.d
    public d.b a(String str, Object obj) {
        return d().a(str, obj);
    }

    @Override // com.facebook.b.b.d
    public Collection<d.a> e() {
        return d().e();
    }

    @Override // com.facebook.b.b.d
    public long a(d.a aVar) {
        return d().a(aVar);
    }

    @Override // com.facebook.b.b.d
    public void c() {
        d().c();
    }

    synchronized d d() {
        if (g()) {
            f();
            h();
        }
        return (d) com.facebook.common.d.i.a(this.f2223a.f2226a);
    }

    private boolean g() {
        a aVar = this.f2223a;
        return aVar.f2226a == null || aVar.f2227b == null || !aVar.f2227b.exists();
    }

    void f() {
        if (this.f2223a.f2226a == null || this.f2223a.f2227b == null) {
            return;
        }
        com.facebook.common.c.a.b(this.f2223a.f2227b);
    }

    private void h() {
        File file = new File(this.f2225d.b(), this.e);
        a(file);
        this.f2223a = new a(file, new com.facebook.b.b.a(file, this.f2224c, this.f));
    }

    void a(File file) {
        try {
            com.facebook.common.c.c.a(file);
            com.facebook.common.e.a.b(f2222b, "Created cache directory %s", file.getAbsolutePath());
        } catch (c.a e) {
            this.f.a(a.EnumC0042a.WRITE_CREATE_DIR, f2222b, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }
}
