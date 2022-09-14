package com.facebook.react.bridge;
/* compiled from: CallbackImpl.java */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final q f3236a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3237b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3238c = false;

    public e(q qVar, int i) {
        this.f3236a = qVar;
        this.f3237b = i;
    }

    @Override // com.facebook.react.bridge.d
    public void a(Object... objArr) {
        if (this.f3238c) {
            throw new RuntimeException("Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
        }
        this.f3236a.invokeCallback(this.f3237b, b.a(objArr));
        this.f3238c = true;
    }
}
