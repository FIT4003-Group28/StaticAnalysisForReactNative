package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.a f8333b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8334c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f8334c = firebaseAuth;
        this.f8333b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8333b.a(this.f8334c);
    }
}
