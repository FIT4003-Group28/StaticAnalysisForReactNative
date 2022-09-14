package com.facebook.f.b;
/* compiled from: RetryManager.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2378a;

    /* renamed from: b  reason: collision with root package name */
    private int f2379b;

    /* renamed from: c  reason: collision with root package name */
    private int f2380c;

    public c() {
        a();
    }

    public void a() {
        this.f2378a = false;
        this.f2379b = 4;
        b();
    }

    public void b() {
        this.f2380c = 0;
    }

    public void a(boolean z) {
        this.f2378a = z;
    }

    public boolean c() {
        return this.f2378a && this.f2380c < this.f2379b;
    }

    public void d() {
        this.f2380c++;
    }
}
