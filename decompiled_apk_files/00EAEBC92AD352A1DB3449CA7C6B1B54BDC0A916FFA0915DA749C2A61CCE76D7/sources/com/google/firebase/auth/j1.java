package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8410b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(FirebaseAuth firebaseAuth) {
        this.f8410b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<FirebaseAuth.a> list;
        list = this.f8410b.f8291d;
        for (FirebaseAuth.a aVar : list) {
            aVar.a(this.f8410b);
        }
    }
}
