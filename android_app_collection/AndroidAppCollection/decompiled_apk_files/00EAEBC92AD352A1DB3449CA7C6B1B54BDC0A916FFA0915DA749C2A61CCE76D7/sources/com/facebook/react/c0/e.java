package com.facebook.react.c0;
/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final e f5442a = new e();

    private e() {
    }

    @Override // com.facebook.react.c0.d
    public d a() {
        throw new IllegalStateException("Should not update as canRetry is: " + b());
    }

    @Override // com.facebook.react.c0.d
    public boolean b() {
        return false;
    }

    @Override // com.facebook.react.c0.d
    public d copy() {
        return this;
    }
}
