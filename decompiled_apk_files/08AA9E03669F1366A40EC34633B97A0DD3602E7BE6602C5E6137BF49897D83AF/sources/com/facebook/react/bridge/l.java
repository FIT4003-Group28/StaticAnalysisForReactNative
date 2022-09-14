package com.facebook.react.bridge;
/* compiled from: GuardedRunnable.java */
/* loaded from: classes.dex */
public abstract class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final aj f3247a;

    public abstract void a();

    public l(aj ajVar) {
        this.f3247a = ajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (RuntimeException e) {
            this.f3247a.a(e);
        }
    }
}
