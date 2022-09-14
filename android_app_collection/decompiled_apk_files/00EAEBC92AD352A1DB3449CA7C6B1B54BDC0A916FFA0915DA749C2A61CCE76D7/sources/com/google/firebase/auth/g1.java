package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ c.e.b.o.c f8331b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8332c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(FirebaseAuth firebaseAuth, c.e.b.o.c cVar) {
        this.f8332c = firebaseAuth;
        this.f8331b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<com.google.firebase.auth.internal.a> list;
        List<FirebaseAuth.b> list2;
        list = this.f8332c.f8290c;
        for (com.google.firebase.auth.internal.a aVar : list) {
            aVar.a(this.f8331b);
        }
        list2 = this.f8332c.f8289b;
        for (FirebaseAuth.b bVar : list2) {
            bVar.a(this.f8332c);
        }
    }
}
