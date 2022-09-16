package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.b f8329b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8330c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(FirebaseAuth firebaseAuth, FirebaseAuth.b bVar) {
        this.f8330c = firebaseAuth;
        this.f8329b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8329b.a(this.f8330c);
    }
}
