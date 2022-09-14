package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
/* loaded from: classes.dex */
class c0<V> extends f<V> {

    /* renamed from: f  reason: collision with root package name */
    private LinkedList<c.d.d.h.b<V>> f5213f;

    public c0(int i, int i2, int i3) {
        super(i, i2, i3, false);
        this.f5213f = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.f
    void a(V v) {
        c.d.d.h.b<V> poll = this.f5213f.poll();
        if (poll == null) {
            poll = new c.d.d.h.b<>();
        }
        poll.a(v);
        this.f5232c.add(poll);
    }

    @Override // com.facebook.imagepipeline.memory.f
    public V f() {
        c.d.d.h.b<V> bVar = (c.d.d.h.b) this.f5232c.poll();
        V b2 = bVar.b();
        bVar.a();
        this.f5213f.add(bVar);
        return b2;
    }
}
