package com.facebook.imagepipeline.i;

import android.util.Pair;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: EncodedImage.java */
/* loaded from: classes.dex */
public class d implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.h.a<com.facebook.common.g.g> f2706a;

    /* renamed from: b  reason: collision with root package name */
    private final k<FileInputStream> f2707b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.h.c f2708c;

    /* renamed from: d  reason: collision with root package name */
    private int f2709d;
    private int e;
    private int f;
    private int g;
    private int h;
    private com.facebook.b.a.d i;

    public d(com.facebook.common.h.a<com.facebook.common.g.g> aVar) {
        this.f2708c = com.facebook.h.c.f2513a;
        this.f2709d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 1;
        this.h = -1;
        i.a(com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar));
        this.f2706a = aVar.clone();
        this.f2707b = null;
    }

    public d(k<FileInputStream> kVar) {
        this.f2708c = com.facebook.h.c.f2513a;
        this.f2709d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 1;
        this.h = -1;
        i.a(kVar);
        this.f2706a = null;
        this.f2707b = kVar;
    }

    public d(k<FileInputStream> kVar, int i) {
        this(kVar);
        this.h = i;
    }

    public static d a(d dVar) {
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    public d a() {
        d dVar;
        d dVar2;
        if (this.f2707b != null) {
            dVar2 = new d(this.f2707b, this.h);
        } else {
            com.facebook.common.h.a b2 = com.facebook.common.h.a.b(this.f2706a);
            if (b2 == null) {
                dVar = null;
            } else {
                try {
                    dVar = new d(b2);
                } catch (Throwable th) {
                    com.facebook.common.h.a.c(b2);
                    throw th;
                }
            }
            com.facebook.common.h.a.c(b2);
            dVar2 = dVar;
        }
        if (dVar2 != null) {
            dVar2.b(this);
        }
        return dVar2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.facebook.common.h.a.c(this.f2706a);
    }

    public synchronized boolean b() {
        boolean z;
        if (!com.facebook.common.h.a.a((com.facebook.common.h.a<?>) this.f2706a)) {
            if (this.f2707b == null) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public com.facebook.common.h.a<com.facebook.common.g.g> c() {
        return com.facebook.common.h.a.b(this.f2706a);
    }

    public InputStream d() {
        if (this.f2707b != null) {
            return this.f2707b.b();
        }
        com.facebook.common.h.a b2 = com.facebook.common.h.a.b(this.f2706a);
        if (b2 == null) {
            return null;
        }
        try {
            return new com.facebook.common.g.i((com.facebook.common.g.g) b2.a());
        } finally {
            com.facebook.common.h.a.c(b2);
        }
    }

    public void a(com.facebook.h.c cVar) {
        this.f2708c = cVar;
    }

    public void a(int i) {
        this.f = i;
    }

    public void b(int i) {
        this.e = i;
    }

    public void c(int i) {
        this.f2709d = i;
    }

    public void d(int i) {
        this.g = i;
    }

    public void a(com.facebook.b.a.d dVar) {
        this.i = dVar;
    }

    public com.facebook.h.c e() {
        return this.f2708c;
    }

    public int f() {
        return this.f2709d;
    }

    public int g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public com.facebook.b.a.d j() {
        return this.i;
    }

    public boolean e(int i) {
        if (this.f2708c == com.facebook.h.b.f2509a && this.f2707b == null) {
            i.a(this.f2706a);
            com.facebook.common.g.g a2 = this.f2706a.a();
            return a2.a(i + (-2)) == -1 && a2.a(i - 1) == -39;
        }
        return true;
    }

    public int k() {
        if (this.f2706a != null && this.f2706a.a() != null) {
            return this.f2706a.a().a();
        }
        return this.h;
    }

    public void l() {
        Pair<Integer, Integer> n;
        com.facebook.h.c c2 = com.facebook.h.d.c(d());
        this.f2708c = c2;
        if (com.facebook.h.b.a(c2)) {
            n = m();
        } else {
            n = n();
        }
        if (c2 != com.facebook.h.b.f2509a || this.f2709d != -1) {
            this.f2709d = 0;
        } else if (n == null) {
        } else {
            this.f2709d = com.facebook.i.b.a(com.facebook.i.b.a(d()));
        }
    }

    private Pair<Integer, Integer> m() {
        Pair<Integer, Integer> a2 = com.facebook.i.e.a(d());
        if (a2 != null) {
            this.e = ((Integer) a2.first).intValue();
            this.f = ((Integer) a2.second).intValue();
        }
        return a2;
    }

    private Pair<Integer, Integer> n() {
        InputStream inputStream;
        try {
            inputStream = d();
            try {
                Pair<Integer, Integer> a2 = com.facebook.i.a.a(inputStream);
                if (a2 != null) {
                    this.e = ((Integer) a2.first).intValue();
                    this.f = ((Integer) a2.second).intValue();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return a2;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public void b(d dVar) {
        this.f2708c = dVar.e();
        this.e = dVar.g();
        this.f = dVar.h();
        this.f2709d = dVar.f();
        this.g = dVar.i();
        this.h = dVar.k();
        this.i = dVar.j();
    }

    public static boolean c(d dVar) {
        return dVar.f2709d >= 0 && dVar.e >= 0 && dVar.f >= 0;
    }

    public static void d(d dVar) {
        if (dVar != null) {
            dVar.close();
        }
    }

    public static boolean e(d dVar) {
        return dVar != null && dVar.b();
    }
}
