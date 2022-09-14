package c.d.b.b;

import c.d.b.a.a;
import c.d.b.b.d;
import c.d.d.c.c;
import c.d.d.d.l;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f2788f = f.class;

    /* renamed from: a  reason: collision with root package name */
    private final int f2789a;

    /* renamed from: b  reason: collision with root package name */
    private final l<File> f2790b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2791c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.b.a.a f2792d;

    /* renamed from: e  reason: collision with root package name */
    volatile a f2793e = new a(null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f2794a;

        /* renamed from: b  reason: collision with root package name */
        public final File f2795b;

        a(File file, d dVar) {
            this.f2794a = dVar;
            this.f2795b = file;
        }
    }

    public f(int i, l<File> lVar, String str, c.d.b.a.a aVar) {
        this.f2789a = i;
        this.f2792d = aVar;
        this.f2790b = lVar;
        this.f2791c = str;
    }

    private void g() {
        File file = new File(this.f2790b.mo139get(), this.f2791c);
        a(file);
        this.f2793e = new a(file, new c.d.b.b.a(file, this.f2789a, this.f2792d));
    }

    private boolean h() {
        File file;
        a aVar = this.f2793e;
        return aVar.f2794a == null || (file = aVar.f2795b) == null || !file.exists();
    }

    @Override // c.d.b.b.d
    public long a(d.a aVar) {
        return f().a(aVar);
    }

    @Override // c.d.b.b.d
    public long a(String str) {
        return f().a(str);
    }

    @Override // c.d.b.b.d
    public d.b a(String str, Object obj) {
        return f().a(str, obj);
    }

    @Override // c.d.b.b.d
    public void a() {
        f().a();
    }

    void a(File file) {
        try {
            c.d.d.c.c.a(file);
            c.d.d.e.a.a(f2788f, "Created cache directory %s", file.getAbsolutePath());
        } catch (c.a e2) {
            this.f2792d.a(a.EnumC0068a.WRITE_CREATE_DIR, f2788f, "createRootDirectoryIfNecessary", e2);
            throw e2;
        }
    }

    @Override // c.d.b.b.d
    /* renamed from: b */
    public Collection<d.a> mo115b() {
        return f().mo115b();
    }

    @Override // c.d.b.b.d
    public boolean b(String str, Object obj) {
        return f().b(str, obj);
    }

    @Override // c.d.b.b.d
    public c.d.a.a c(String str, Object obj) {
        return f().c(str, obj);
    }

    @Override // c.d.b.b.d
    public boolean c() {
        try {
            return f().c();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // c.d.b.b.d
    public void d() {
        try {
            f().d();
        } catch (IOException e2) {
            c.d.d.e.a.a(f2788f, "purgeUnexpectedResources", (Throwable) e2);
        }
    }

    void e() {
        if (this.f2793e.f2794a == null || this.f2793e.f2795b == null) {
            return;
        }
        c.d.d.c.a.b(this.f2793e.f2795b);
    }

    synchronized d f() {
        d dVar;
        if (h()) {
            e();
            g();
        }
        dVar = this.f2793e.f2794a;
        c.d.d.d.i.a(dVar);
        return dVar;
    }
}
