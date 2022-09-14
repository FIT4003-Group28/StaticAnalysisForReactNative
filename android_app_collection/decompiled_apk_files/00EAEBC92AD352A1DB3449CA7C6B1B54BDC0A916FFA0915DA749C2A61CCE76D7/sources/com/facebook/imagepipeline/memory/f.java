package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
/* loaded from: classes.dex */
class f<V> {

    /* renamed from: a  reason: collision with root package name */
    public final int f5230a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5231b;

    /* renamed from: c  reason: collision with root package name */
    final Queue f5232c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5233d;

    /* renamed from: e  reason: collision with root package name */
    private int f5234e;

    public f(int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        c.d.d.d.i.b(i > 0);
        c.d.d.d.i.b(i2 >= 0);
        c.d.d.d.i.b(i3 < 0 ? false : z2);
        this.f5230a = i;
        this.f5231b = i2;
        this.f5232c = new LinkedList();
        this.f5234e = i3;
        this.f5233d = z;
    }

    public void a() {
        c.d.d.d.i.b(this.f5234e > 0);
        this.f5234e--;
    }

    void a(V v) {
        this.f5232c.add(v);
    }

    @Deprecated
    public V b() {
        V f2 = f();
        if (f2 != null) {
            this.f5234e++;
        }
        return f2;
    }

    public void b(V v) {
        int i;
        c.d.d.d.i.a(v);
        boolean z = false;
        if (this.f5233d) {
            if (this.f5234e > 0) {
                z = true;
            }
            c.d.d.d.i.b(z);
            i = this.f5234e;
        } else {
            i = this.f5234e;
            if (i <= 0) {
                c.d.d.e.a.a("BUCKET", "Tried to release value %s from an empty bucket!", v);
                return;
            }
        }
        this.f5234e = i - 1;
        a(v);
    }

    int c() {
        return this.f5232c.size();
    }

    public void d() {
        this.f5234e++;
    }

    public boolean e() {
        return this.f5234e + c() > this.f5231b;
    }

    public V f() {
        return (V) this.f5232c.poll();
    }
}
