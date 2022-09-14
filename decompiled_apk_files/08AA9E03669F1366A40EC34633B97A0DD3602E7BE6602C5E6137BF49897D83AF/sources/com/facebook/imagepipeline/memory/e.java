package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
/* compiled from: Bucket.java */
/* loaded from: classes.dex */
class e<V> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2947a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2948b;

    /* renamed from: c  reason: collision with root package name */
    final Queue f2949c;

    /* renamed from: d  reason: collision with root package name */
    private int f2950d;

    public e(int i, int i2, int i3) {
        boolean z = false;
        com.facebook.common.d.i.b(i > 0);
        com.facebook.common.d.i.b(i2 >= 0);
        com.facebook.common.d.i.b(i3 >= 0 ? true : z);
        this.f2947a = i;
        this.f2948b = i2;
        this.f2949c = new LinkedList();
        this.f2950d = i3;
    }

    public boolean a() {
        return this.f2950d + b() > this.f2948b;
    }

    int b() {
        return this.f2949c.size();
    }

    public V c() {
        V d2 = d();
        if (d2 != null) {
            this.f2950d++;
        }
        return d2;
    }

    public V d() {
        return (V) this.f2949c.poll();
    }

    public void e() {
        this.f2950d++;
    }

    public void a(V v) {
        com.facebook.common.d.i.a(v);
        com.facebook.common.d.i.b(this.f2950d > 0);
        this.f2950d--;
        b(v);
    }

    void b(V v) {
        this.f2949c.add(v);
    }

    public void f() {
        com.facebook.common.d.i.b(this.f2950d > 0);
        this.f2950d--;
    }
}
