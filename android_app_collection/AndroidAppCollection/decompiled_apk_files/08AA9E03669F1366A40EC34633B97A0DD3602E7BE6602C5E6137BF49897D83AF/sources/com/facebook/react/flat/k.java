package com.facebook.react.flat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Animatable;
import com.facebook.f.e.o;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.flat.s;
import java.util.LinkedList;
import java.util.List;
/* compiled from: DrawImageWithDrawee.java */
/* loaded from: classes.dex */
final class k extends b implements com.facebook.f.c.d, j {

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.react.views.image.a f3400d;
    private n e;
    private PorterDuffColorFilter f;
    private float h;
    private float i;
    private int j;
    private int k;
    private boolean l;
    private s.a n;

    /* renamed from: c  reason: collision with root package name */
    private final List<com.facebook.react.views.b.a> f3399c = new LinkedList();
    private o.b g = com.facebook.react.views.image.d.a();
    private int m = 300;

    @Override // com.facebook.f.c.d
    public void a(String str) {
    }

    @Override // com.facebook.f.c.d
    public void a(String str, Throwable th) {
    }

    @Override // com.facebook.f.c.d
    public void b(String str, Object obj) {
    }

    public k(com.facebook.react.views.image.a aVar) {
        this.f3400d = aVar;
    }

    @Override // com.facebook.react.flat.j
    public void a(Context context, am amVar) {
        this.f3399c.clear();
        if (amVar == null || amVar.size() == 0) {
            return;
        }
        if (amVar.size() == 1) {
            this.f3399c.add(new com.facebook.react.views.b.a(context, amVar.c(0).getString("uri")));
            return;
        }
        for (int i = 0; i < amVar.size(); i++) {
            an c2 = amVar.c(i);
            this.f3399c.add(new com.facebook.react.views.b.a(context, c2.getString("uri"), c2.getDouble("width"), c2.getDouble("height")));
        }
    }

    @Override // com.facebook.react.flat.j
    public void a(int i) {
        if (i == 0) {
            this.f = null;
        } else {
            this.f = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
    }

    @Override // com.facebook.react.flat.j
    public void a(o.b bVar) {
        this.g = bVar;
    }

    @Override // com.facebook.react.flat.j
    public o.b b() {
        return this.g;
    }

    @Override // com.facebook.react.flat.j
    public void a(float f) {
        this.h = f;
    }

    @Override // com.facebook.react.flat.j
    public float c() {
        return this.h;
    }

    @Override // com.facebook.react.flat.j
    public void b(float f) {
        this.i = f;
    }

    @Override // com.facebook.react.flat.j
    public float d() {
        return this.i;
    }

    @Override // com.facebook.react.flat.j
    public void c(int i) {
        this.j = i;
    }

    @Override // com.facebook.react.flat.j
    public int e() {
        return this.j;
    }

    @Override // com.facebook.react.flat.j
    public void d(int i) {
        this.m = i;
    }

    @Override // com.facebook.react.flat.j
    public void a(boolean z) {
        this.l = z;
    }

    @Override // com.facebook.react.flat.j
    public void b(int i) {
        this.k = i;
    }

    @Override // com.facebook.react.flat.b
    public void c(Canvas canvas) {
        if (this.e != null) {
            this.e.c().draw(canvas);
        }
    }

    @Override // com.facebook.react.flat.c
    public void a(s.a aVar) {
        this.n = aVar;
        if (this.e == null) {
            throw new RuntimeException("No DraweeRequestHelper - width: " + (p() - n()) + " - height: " + (q() - o()) + " - number of sources: " + this.f3399c.size());
        }
        com.facebook.f.f.a b2 = this.e.b();
        com.facebook.f.f.d c2 = b2.c();
        if (s()) {
            if (c2 == null) {
                c2 = new com.facebook.f.f.d();
            }
            c2.a(this.j, this.h);
            c2.a(this.i);
            b2.a(c2);
        } else if (c2 != null) {
            b2.a((com.facebook.f.f.d) null);
        }
        b2.a(this.g);
        b2.a(this.f);
        b2.a(this.m);
        b2.a().setBounds(Math.round(n()), Math.round(o()), Math.round(p()), Math.round(q()));
        this.e.a(aVar);
    }

    @Override // com.facebook.react.flat.c
    public void a() {
        if (this.e != null) {
            this.e.a();
        }
    }

    @Override // com.facebook.f.c.d
    public void a(String str, Object obj) {
        if (this.n == null || this.k == 0) {
            return;
        }
        this.n.a(this.k, 4);
    }

    @Override // com.facebook.f.c.d
    public void a(String str, Object obj, Animatable animatable) {
        if (this.n == null || this.k == 0) {
            return;
        }
        this.n.a(this.k, 2);
        this.n.a(this.k, 3);
    }

    @Override // com.facebook.f.c.d
    public void b(String str, Throwable th) {
        if (this.n == null || this.k == 0) {
            return;
        }
        this.n.a(this.k, 1);
        this.n.a(this.k, 3);
    }

    private boolean s() {
        return this.j != 0 || this.i >= 0.5f;
    }
}
