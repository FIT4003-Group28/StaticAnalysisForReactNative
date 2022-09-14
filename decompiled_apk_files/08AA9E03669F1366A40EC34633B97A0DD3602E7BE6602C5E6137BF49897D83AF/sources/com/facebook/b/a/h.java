package com.facebook.b.a;
/* compiled from: NoOpCacheEventListener.java */
/* loaded from: classes.dex */
public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private static h f2176a;

    @Override // com.facebook.b.a.c
    public void a() {
    }

    @Override // com.facebook.b.a.c
    public void a(b bVar) {
    }

    @Override // com.facebook.b.a.c
    public void b(b bVar) {
    }

    @Override // com.facebook.b.a.c
    public void c(b bVar) {
    }

    @Override // com.facebook.b.a.c
    public void d(b bVar) {
    }

    @Override // com.facebook.b.a.c
    public void e(b bVar) {
    }

    @Override // com.facebook.b.a.c
    public void f(b bVar) {
    }

    @Override // com.facebook.b.a.c
    public void g(b bVar) {
    }

    private h() {
    }

    public static synchronized h b() {
        h hVar;
        synchronized (h.class) {
            if (f2176a == null) {
                f2176a = new h();
            }
            hVar = f2176a;
        }
        return hVar;
    }
}
