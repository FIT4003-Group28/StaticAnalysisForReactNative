package com.facebook.react.b;
/* compiled from: SingleThreadAsserter.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private Thread f3184a = null;

    public void a() {
        Thread currentThread = Thread.currentThread();
        if (this.f3184a == null) {
            this.f3184a = currentThread;
        }
        com.facebook.j.a.a.a(this.f3184a == currentThread);
    }
}
