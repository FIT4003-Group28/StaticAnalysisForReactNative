package com.facebook.imagepipeline.m;

import com.facebook.imagepipeline.n.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseProducerContext.java */
/* loaded from: classes.dex */
public class d implements ak {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.n.b f2837a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2838b;

    /* renamed from: c  reason: collision with root package name */
    private final am f2839c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f2840d;
    private final b.EnumC0062b e;
    private boolean f;
    private com.facebook.imagepipeline.e.c g;
    private boolean h;
    private boolean i = false;
    private final List<al> j = new ArrayList();

    public d(com.facebook.imagepipeline.n.b bVar, String str, am amVar, Object obj, b.EnumC0062b enumC0062b, boolean z, boolean z2, com.facebook.imagepipeline.e.c cVar) {
        this.f2837a = bVar;
        this.f2838b = str;
        this.f2839c = amVar;
        this.f2840d = obj;
        this.e = enumC0062b;
        this.f = z;
        this.g = cVar;
        this.h = z2;
    }

    @Override // com.facebook.imagepipeline.m.ak
    public com.facebook.imagepipeline.n.b a() {
        return this.f2837a;
    }

    @Override // com.facebook.imagepipeline.m.ak
    public String b() {
        return this.f2838b;
    }

    @Override // com.facebook.imagepipeline.m.ak
    public am c() {
        return this.f2839c;
    }

    @Override // com.facebook.imagepipeline.m.ak
    public Object d() {
        return this.f2840d;
    }

    @Override // com.facebook.imagepipeline.m.ak
    public b.EnumC0062b e() {
        return this.e;
    }

    @Override // com.facebook.imagepipeline.m.ak
    public synchronized boolean f() {
        return this.f;
    }

    @Override // com.facebook.imagepipeline.m.ak
    public synchronized com.facebook.imagepipeline.e.c g() {
        return this.g;
    }

    @Override // com.facebook.imagepipeline.m.ak
    public synchronized boolean h() {
        return this.h;
    }

    @Override // com.facebook.imagepipeline.m.ak
    public void a(al alVar) {
        boolean z;
        synchronized (this) {
            this.j.add(alVar);
            z = this.i;
        }
        if (z) {
            alVar.a();
        }
    }

    public void i() {
        a(j());
    }

    public synchronized List<al> a(boolean z) {
        if (z == this.f) {
            return null;
        }
        this.f = z;
        return new ArrayList(this.j);
    }

    public synchronized List<al> a(com.facebook.imagepipeline.e.c cVar) {
        if (cVar == this.g) {
            return null;
        }
        this.g = cVar;
        return new ArrayList(this.j);
    }

    public synchronized List<al> b(boolean z) {
        if (z == this.h) {
            return null;
        }
        this.h = z;
        return new ArrayList(this.j);
    }

    public synchronized List<al> j() {
        if (this.i) {
            return null;
        }
        this.i = true;
        return new ArrayList(this.j);
    }

    public static void a(List<al> list) {
        if (list == null) {
            return;
        }
        for (al alVar : list) {
            alVar.a();
        }
    }

    public static void b(List<al> list) {
        if (list == null) {
            return;
        }
        for (al alVar : list) {
            alVar.b();
        }
    }

    public static void c(List<al> list) {
        if (list == null) {
            return;
        }
        for (al alVar : list) {
            alVar.c();
        }
    }

    public static void d(List<al> list) {
        if (list == null) {
            return;
        }
        for (al alVar : list) {
            alVar.d();
        }
    }
}
