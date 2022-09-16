package com.facebook.react.uimanager.events;

import com.facebook.react.uimanager.events.c;
/* loaded from: classes.dex */
public abstract class c<T extends c> {

    /* renamed from: e  reason: collision with root package name */
    private static int f5895e;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5896a;

    /* renamed from: b  reason: collision with root package name */
    private int f5897b;

    /* renamed from: c  reason: collision with root package name */
    private long f5898c;

    /* renamed from: d  reason: collision with root package name */
    private int f5899d;

    /* JADX INFO: Access modifiers changed from: protected */
    public c() {
        int i = f5895e;
        f5895e = i + 1;
        this.f5899d = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int i) {
        int i2 = f5895e;
        f5895e = i2 + 1;
        this.f5899d = i2;
        a(i);
    }

    public T a(T t) {
        return e() >= t.e() ? this : t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i) {
        this.f5897b = i;
        this.f5898c = com.facebook.react.common.i.c();
        this.f5896a = true;
    }

    public abstract void a(RCTEventEmitter rCTEventEmitter);

    public boolean a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f5896a = false;
        i();
    }

    public short c() {
        return (short) 0;
    }

    public abstract String d();

    public final long e() {
        return this.f5898c;
    }

    public int f() {
        return this.f5899d;
    }

    public final int g() {
        return this.f5897b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.f5896a;
    }

    public void i() {
    }
}
