package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a  reason: collision with root package name */
    List<b> f5357a;

    /* renamed from: b  reason: collision with root package name */
    int f5358b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f5359c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f5360d = -1;

    public void a() {
    }

    public final void a(b bVar) {
        if (this.f5357a == null) {
            this.f5357a = new ArrayList(1);
        }
        List<b> list = this.f5357a;
        c.d.k.a.a.a(list);
        list.add(bVar);
        bVar.b(this);
    }

    public void b(b bVar) {
    }

    public void c(b bVar) {
    }

    public final void d(b bVar) {
        if (this.f5357a == null) {
            return;
        }
        bVar.c(this);
        this.f5357a.remove(bVar);
    }
}
