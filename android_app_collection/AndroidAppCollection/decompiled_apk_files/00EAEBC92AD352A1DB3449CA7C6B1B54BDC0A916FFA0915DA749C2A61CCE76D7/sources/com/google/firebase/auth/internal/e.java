package com.google.firebase.auth.internal;

import com.google.firebase.auth.FirebaseAuth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final String f8343b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f f8344c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar, String str) {
        this.f8344c = fVar;
        com.google.android.gms.common.internal.s.b(str);
        this.f8343b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.l.a aVar;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(this.f8343b));
        if (firebaseAuth.a() != null) {
            c.e.a.b.g.h<com.google.firebase.auth.b0> a2 = firebaseAuth.a(true);
            aVar = f.f8348h;
            aVar.c("Token refreshing started", new Object[0]);
            a2.a(new h(this));
        }
    }
}
