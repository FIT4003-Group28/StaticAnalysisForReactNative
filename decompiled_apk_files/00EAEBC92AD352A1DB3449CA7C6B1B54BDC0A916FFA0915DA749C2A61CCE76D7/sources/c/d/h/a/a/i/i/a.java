package c.d.h.a.a.i.i;

import android.graphics.drawable.Animatable;
import c.d.h.a.a.i.g;
import c.d.h.a.a.i.h;
import c.d.j.k.e;
/* loaded from: classes.dex */
public class a extends c.d.h.c.c<e> {

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.time.b f2950b;

    /* renamed from: c  reason: collision with root package name */
    private final h f2951c;

    /* renamed from: d  reason: collision with root package name */
    private final g f2952d;

    public a(com.facebook.common.time.b bVar, h hVar, g gVar) {
        this.f2950b = bVar;
        this.f2951c = hVar;
        this.f2952d = gVar;
    }

    private void b(long j) {
        this.f2951c.b(false);
        this.f2951c.h(j);
        this.f2952d.a(this.f2951c, 2);
    }

    public void a(long j) {
        this.f2951c.b(true);
        this.f2951c.i(j);
        this.f2952d.a(this.f2951c, 1);
    }

    @Override // c.d.h.c.c, c.d.h.c.d
    public void a(String str) {
        super.a(str);
        long now = this.f2950b.now();
        int a2 = this.f2951c.a();
        if (a2 != 3 && a2 != 5) {
            this.f2951c.a(now);
            this.f2951c.a(str);
            this.f2952d.b(this.f2951c, 4);
        }
        b(now);
    }

    @Override // c.d.h.c.c, c.d.h.c.d
    public void a(String str, e eVar) {
        this.f2951c.d(this.f2950b.now());
        this.f2951c.a(str);
        this.f2951c.a(eVar);
        this.f2952d.b(this.f2951c, 2);
    }

    @Override // c.d.h.c.c, c.d.h.c.d
    public void a(String str, e eVar, Animatable animatable) {
        long now = this.f2950b.now();
        this.f2951c.c(now);
        this.f2951c.f(now);
        this.f2951c.a(str);
        this.f2951c.a(eVar);
        this.f2952d.b(this.f2951c, 3);
    }

    @Override // c.d.h.c.c, c.d.h.c.d
    public void b(String str, Object obj) {
        long now = this.f2950b.now();
        this.f2951c.e(now);
        this.f2951c.a(str);
        this.f2951c.a(obj);
        this.f2952d.b(this.f2951c, 0);
        a(now);
    }

    @Override // c.d.h.c.c, c.d.h.c.d
    public void b(String str, Throwable th) {
        long now = this.f2950b.now();
        this.f2951c.b(now);
        this.f2951c.a(str);
        this.f2952d.b(this.f2951c, 5);
        b(now);
    }
}
