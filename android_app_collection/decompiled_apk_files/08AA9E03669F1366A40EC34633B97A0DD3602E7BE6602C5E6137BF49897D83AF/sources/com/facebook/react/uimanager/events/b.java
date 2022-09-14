package com.facebook.react.uimanager.events;

import com.facebook.react.uimanager.events.b;
/* compiled from: Event.java */
/* loaded from: classes.dex */
public abstract class b<T extends b> {

    /* renamed from: a  reason: collision with root package name */
    private static int f3875a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3876b;

    /* renamed from: c  reason: collision with root package name */
    private int f3877c;

    /* renamed from: d  reason: collision with root package name */
    private long f3878d;
    private int e;

    public abstract String a();

    public abstract void a(RCTEventEmitter rCTEventEmitter);

    public boolean b() {
        return true;
    }

    public void c() {
    }

    public short f() {
        return (short) 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
        int i = f3875a;
        f3875a = i + 1;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i) {
        int i2 = f3875a;
        f3875a = i2 + 1;
        this.e = i2;
        a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i) {
        this.f3877c = i;
        this.f3878d = com.facebook.react.b.i.c();
        this.f3876b = true;
    }

    public final int d() {
        return this.f3877c;
    }

    public final long e() {
        return this.f3878d;
    }

    public T a(T t) {
        return e() >= t.e() ? this : t;
    }

    public int g() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.f3876b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.f3876b = false;
        c();
    }
}
