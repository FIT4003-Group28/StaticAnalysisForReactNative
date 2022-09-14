package c.d.b.b;

import android.content.Context;
import c.d.d.d.l;
import java.io.File;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f2756a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2757b;

    /* renamed from: c  reason: collision with root package name */
    private final l<File> f2758c;

    /* renamed from: d  reason: collision with root package name */
    private final long f2759d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2760e;

    /* renamed from: f  reason: collision with root package name */
    private final long f2761f;

    /* renamed from: g  reason: collision with root package name */
    private final h f2762g;

    /* renamed from: h  reason: collision with root package name */
    private final c.d.b.a.a f2763h;
    private final c.d.b.a.c i;
    private final c.d.d.a.b j;
    private final Context k;
    private final boolean l;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f2764a;

        /* renamed from: b  reason: collision with root package name */
        private String f2765b;

        /* renamed from: c  reason: collision with root package name */
        private l<File> f2766c;

        /* renamed from: d  reason: collision with root package name */
        private long f2767d;

        /* renamed from: e  reason: collision with root package name */
        private long f2768e;

        /* renamed from: f  reason: collision with root package name */
        private long f2769f;

        /* renamed from: g  reason: collision with root package name */
        private h f2770g;

        /* renamed from: h  reason: collision with root package name */
        private c.d.b.a.a f2771h;
        private c.d.b.a.c i;
        private c.d.d.a.b j;
        private boolean k;
        private final Context l;

        /* loaded from: classes.dex */
        class a implements l<File> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // c.d.d.d.l
            /* renamed from: get */
            public File mo139get() {
                return b.this.l.getApplicationContext().getCacheDir();
            }
        }

        private b(Context context) {
            this.f2764a = 1;
            this.f2765b = "image_cache";
            this.f2767d = 41943040L;
            this.f2768e = 10485760L;
            this.f2769f = 2097152L;
            this.f2770g = new c.d.b.b.b();
            this.l = context;
        }

        public c a() {
            c.d.d.d.i.b((this.f2766c == null && this.l == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f2766c == null && this.l != null) {
                this.f2766c = new a();
            }
            return new c(this);
        }
    }

    private c(b bVar) {
        this.f2756a = bVar.f2764a;
        String str = bVar.f2765b;
        c.d.d.d.i.a(str);
        this.f2757b = str;
        l<File> lVar = bVar.f2766c;
        c.d.d.d.i.a(lVar);
        this.f2758c = lVar;
        this.f2759d = bVar.f2767d;
        this.f2760e = bVar.f2768e;
        this.f2761f = bVar.f2769f;
        h hVar = bVar.f2770g;
        c.d.d.d.i.a(hVar);
        this.f2762g = hVar;
        this.f2763h = bVar.f2771h == null ? c.d.b.a.g.a() : bVar.f2771h;
        this.i = bVar.i == null ? c.d.b.a.h.b() : bVar.i;
        this.j = bVar.j == null ? c.d.d.a.c.a() : bVar.j;
        this.k = bVar.l;
        this.l = bVar.k;
    }

    public static b a(Context context) {
        return new b(context);
    }

    public String a() {
        return this.f2757b;
    }

    public l<File> b() {
        return this.f2758c;
    }

    public c.d.b.a.a c() {
        return this.f2763h;
    }

    public c.d.b.a.c d() {
        return this.i;
    }

    public Context e() {
        return this.k;
    }

    public long f() {
        return this.f2759d;
    }

    public c.d.d.a.b g() {
        return this.j;
    }

    public h h() {
        return this.f2762g;
    }

    public boolean i() {
        return this.l;
    }

    public long j() {
        return this.f2760e;
    }

    public long k() {
        return this.f2761f;
    }

    public int l() {
        return this.f2756a;
    }
}
