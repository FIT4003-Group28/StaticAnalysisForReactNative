package com.facebook.react.a;

import android.view.View;
/* compiled from: Animation.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f3080a;

    /* renamed from: b  reason: collision with root package name */
    private final c f3081b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f3082c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f3083d;
    private b e;
    private View f;

    public abstract void a();

    public void a(b bVar) {
        this.e = bVar;
    }

    public final void a(View view) {
        this.f = view;
        this.f3081b.a(view);
        a();
    }

    public final void b() {
        if (this.f3083d || this.f3082c) {
            return;
        }
        this.f3082c = true;
        if (this.e == null) {
            return;
        }
        this.e.a();
    }

    public int c() {
        return this.f3080a;
    }
}
