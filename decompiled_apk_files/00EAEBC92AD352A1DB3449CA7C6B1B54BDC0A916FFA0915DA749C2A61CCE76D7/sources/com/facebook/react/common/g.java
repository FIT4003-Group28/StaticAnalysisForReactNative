package com.facebook.react.common;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private Thread f5456a = null;

    public void a() {
        Thread currentThread = Thread.currentThread();
        if (this.f5456a == null) {
            this.f5456a = currentThread;
        }
        c.d.k.a.a.a(this.f5456a == currentThread);
    }
}
