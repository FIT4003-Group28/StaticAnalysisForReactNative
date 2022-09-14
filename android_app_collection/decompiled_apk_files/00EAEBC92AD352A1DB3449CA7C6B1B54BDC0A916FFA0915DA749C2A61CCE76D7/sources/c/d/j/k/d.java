package c.d.j.k;

import android.graphics.ColorSpace;
import android.util.Pair;
import c.d.d.d.i;
import c.d.d.d.l;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class d implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final c.d.d.h.a<c.d.d.g.g> f3379b;

    /* renamed from: c  reason: collision with root package name */
    private final l<FileInputStream> f3380c;

    /* renamed from: d  reason: collision with root package name */
    private c.d.i.c f3381d;

    /* renamed from: e  reason: collision with root package name */
    private int f3382e;

    /* renamed from: f  reason: collision with root package name */
    private int f3383f;

    /* renamed from: g  reason: collision with root package name */
    private int f3384g;

    /* renamed from: h  reason: collision with root package name */
    private int f3385h;
    private int i;
    private int j;
    private c.d.j.e.a k;
    private ColorSpace l;

    public d(l<FileInputStream> lVar) {
        this.f3381d = c.d.i.c.f3152b;
        this.f3382e = -1;
        this.f3383f = 0;
        this.f3384g = -1;
        this.f3385h = -1;
        this.i = 1;
        this.j = -1;
        i.a(lVar);
        this.f3379b = null;
        this.f3380c = lVar;
    }

    public d(l<FileInputStream> lVar, int i) {
        this(lVar);
        this.j = i;
    }

    public d(c.d.d.h.a<c.d.d.g.g> aVar) {
        this.f3381d = c.d.i.c.f3152b;
        this.f3382e = -1;
        this.f3383f = 0;
        this.f3384g = -1;
        this.f3385h = -1;
        this.i = 1;
        this.j = -1;
        i.a(c.d.d.h.a.c(aVar));
        this.f3379b = aVar.m124clone();
        this.f3380c = null;
    }

    private void D() {
        if (this.f3384g < 0 || this.f3385h < 0) {
            C();
        }
    }

    private com.facebook.imageutils.b E() {
        InputStream inputStream;
        try {
            inputStream = h();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            com.facebook.imageutils.b b2 = com.facebook.imageutils.a.b(inputStream);
            this.l = b2.a();
            Pair<Integer, Integer> b3 = b2.b();
            if (b3 != null) {
                this.f3384g = ((Integer) b3.first).intValue();
                this.f3385h = ((Integer) b3.second).intValue();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return b2;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private Pair<Integer, Integer> F() {
        Pair<Integer, Integer> e2 = com.facebook.imageutils.f.e(h());
        if (e2 != null) {
            this.f3384g = ((Integer) e2.first).intValue();
            this.f3385h = ((Integer) e2.second).intValue();
        }
        return e2;
    }

    public static d b(d dVar) {
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    public static void c(d dVar) {
        if (dVar != null) {
            dVar.close();
        }
    }

    public static boolean d(d dVar) {
        return dVar.f3382e >= 0 && dVar.f3384g >= 0 && dVar.f3385h >= 0;
    }

    public static boolean e(d dVar) {
        return dVar != null && dVar.B();
    }

    public int A() {
        D();
        return this.f3384g;
    }

    public synchronized boolean B() {
        boolean z;
        if (!c.d.d.h.a.c(this.f3379b)) {
            if (this.f3380c == null) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public void C() {
        int i;
        int a2;
        c.d.i.c c2 = c.d.i.d.c(h());
        this.f3381d = c2;
        Pair<Integer, Integer> F = c.d.i.b.b(c2) ? F() : E().b();
        if (c2 == c.d.i.b.f3144a && this.f3382e == -1) {
            if (F == null) {
                return;
            }
            a2 = com.facebook.imageutils.c.a(h());
        } else if (c2 != c.d.i.b.k || this.f3382e != -1) {
            i = 0;
            this.f3382e = i;
        } else {
            a2 = HeifExifUtil.a(h());
        }
        this.f3383f = a2;
        i = com.facebook.imageutils.c.a(this.f3383f);
        this.f3382e = i;
    }

    public d a() {
        d dVar;
        l<FileInputStream> lVar = this.f3380c;
        if (lVar != null) {
            dVar = new d(lVar, this.j);
        } else {
            c.d.d.h.a a2 = c.d.d.h.a.a((c.d.d.h.a) this.f3379b);
            if (a2 == null) {
                dVar = null;
            } else {
                try {
                    dVar = new d(a2);
                } finally {
                    c.d.d.h.a.b(a2);
                }
            }
        }
        if (dVar != null) {
            dVar.a(this);
        }
        return dVar;
    }

    public void a(c.d.i.c cVar) {
        this.f3381d = cVar;
    }

    public void a(c.d.j.e.a aVar) {
        this.k = aVar;
    }

    public void a(d dVar) {
        this.f3381d = dVar.g();
        this.f3384g = dVar.A();
        this.f3385h = dVar.f();
        this.f3382e = dVar.i();
        this.f3383f = dVar.e();
        this.i = dVar.w();
        this.j = dVar.z();
        this.k = dVar.c();
        this.l = dVar.d();
    }

    public c.d.d.h.a<c.d.d.g.g> b() {
        return c.d.d.h.a.a((c.d.d.h.a) this.f3379b);
    }

    public String b(int i) {
        c.d.d.h.a<c.d.d.g.g> b2 = b();
        if (b2 == null) {
            return "";
        }
        int min = Math.min(z(), i);
        byte[] bArr = new byte[min];
        try {
            c.d.d.g.g b3 = b2.b();
            if (b3 == null) {
                return "";
            }
            b3.a(0, bArr, 0, min);
            b2.close();
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            int length = bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i2])));
            }
            return sb.toString();
        } finally {
            b2.close();
        }
    }

    public c.d.j.e.a c() {
        return this.k;
    }

    public boolean c(int i) {
        if (this.f3381d == c.d.i.b.f3144a && this.f3380c == null) {
            i.a(this.f3379b);
            c.d.d.g.g b2 = this.f3379b.b();
            return b2.a(i + (-2)) == -1 && b2.a(i - 1) == -39;
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c.d.d.h.a.b(this.f3379b);
    }

    public ColorSpace d() {
        D();
        return this.l;
    }

    public void d(int i) {
        this.f3383f = i;
    }

    public int e() {
        D();
        return this.f3383f;
    }

    public void e(int i) {
        this.f3385h = i;
    }

    public int f() {
        D();
        return this.f3385h;
    }

    public void f(int i) {
        this.f3382e = i;
    }

    public c.d.i.c g() {
        D();
        return this.f3381d;
    }

    public void g(int i) {
        this.i = i;
    }

    public InputStream h() {
        l<FileInputStream> lVar = this.f3380c;
        if (lVar != null) {
            return lVar.mo139get();
        }
        c.d.d.h.a a2 = c.d.d.h.a.a((c.d.d.h.a) this.f3379b);
        if (a2 == null) {
            return null;
        }
        try {
            return new c.d.d.g.i((c.d.d.g.g) a2.b());
        } finally {
            c.d.d.h.a.b(a2);
        }
    }

    public void h(int i) {
        this.f3384g = i;
    }

    public int i() {
        D();
        return this.f3382e;
    }

    public int w() {
        return this.i;
    }

    public int z() {
        c.d.d.h.a<c.d.d.g.g> aVar = this.f3379b;
        return (aVar == null || aVar.b() == null) ? this.j : this.f3379b.b().size();
    }
}
