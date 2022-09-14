package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.List;
/* compiled from: AnimatedNode.java */
/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a  reason: collision with root package name */
    List<b> f3141a;

    /* renamed from: b  reason: collision with root package name */
    int f3142b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f3143c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f3144d = -1;

    public void a() {
    }

    public void c(b bVar) {
    }

    public void d(b bVar) {
    }

    public final void a(b bVar) {
        if (this.f3141a == null) {
            this.f3141a = new ArrayList(1);
        }
        ((List) com.facebook.j.a.a.b(this.f3141a)).add(bVar);
        bVar.c(this);
    }

    public final void b(b bVar) {
        if (this.f3141a == null) {
            return;
        }
        bVar.d(this);
        this.f3141a.remove(bVar);
    }
}
