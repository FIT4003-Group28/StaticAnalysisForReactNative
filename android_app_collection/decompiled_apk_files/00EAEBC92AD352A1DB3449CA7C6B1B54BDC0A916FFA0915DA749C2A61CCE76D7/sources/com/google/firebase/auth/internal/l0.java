package com.google.firebase.auth.internal;
/* loaded from: classes.dex */
public final class l0 extends com.google.firebase.auth.v {

    /* renamed from: a  reason: collision with root package name */
    private String f8375a;

    /* renamed from: b  reason: collision with root package name */
    private String f8376b;

    public final String a() {
        return this.f8375a;
    }

    @Override // com.google.firebase.auth.v
    public final void a(String str, String str2) {
        this.f8375a = str;
        this.f8376b = str2;
    }

    public final String b() {
        return this.f8376b;
    }

    public final boolean c() {
        return (this.f8375a == null || this.f8376b == null) ? false : true;
    }
}
