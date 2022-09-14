package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
/* compiled from: OOMSoftReferenceBucket.java */
/* loaded from: classes.dex */
class q<V> extends e<V> {

    /* renamed from: d  reason: collision with root package name */
    private LinkedList<com.facebook.common.h.b<V>> f2964d;

    public q(int i, int i2, int i3) {
        super(i, i2, i3);
        this.f2964d = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.e
    public V d() {
        com.facebook.common.h.b<V> bVar = (com.facebook.common.h.b) this.f2949c.poll();
        V a2 = bVar.a();
        bVar.b();
        this.f2964d.add(bVar);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.e
    void b(V v) {
        com.facebook.common.h.b<V> poll = this.f2964d.poll();
        if (poll == null) {
            poll = new com.facebook.common.h.b<>();
        }
        poll.a(v);
        this.f2949c.add(poll);
    }
}
