package com.facebook.react.flat;

import android.graphics.drawable.Drawable;
import com.facebook.react.flat.s;
/* compiled from: DraweeRequestHelper.java */
/* loaded from: classes.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.f.h.a f3405a;

    /* renamed from: b  reason: collision with root package name */
    private int f3406b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(s.a aVar) {
        this.f3406b++;
        if (this.f3406b == 1) {
            c().setCallback((Drawable.Callback) aVar.get());
            this.f3405a.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f3406b--;
        if (this.f3406b == 0) {
            this.f3405a.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.facebook.f.f.a b() {
        return (com.facebook.f.f.a) com.facebook.j.a.a.a(this.f3405a.i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable c() {
        return b().a();
    }
}
