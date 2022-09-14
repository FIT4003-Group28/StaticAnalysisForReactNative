package com.google.firebase.auth;

import c.e.a.b.d.e.y2;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i1 implements com.google.firebase.auth.internal.c, com.google.firebase.auth.internal.j {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8335a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(FirebaseAuth firebaseAuth) {
        this.f8335a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.c
    public final void a(y2 y2Var, z zVar) {
        this.f8335a.a(zVar, y2Var, true, true);
    }

    @Override // com.google.firebase.auth.internal.j
    public final void a(Status status) {
        int q = status.q();
        if (q == 17011 || q == 17021 || q == 17005) {
            this.f8335a.e();
        }
    }
}
