package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l1 implements com.google.firebase.auth.internal.g {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ z f8414a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8415b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l1(FirebaseAuth firebaseAuth, z zVar) {
        this.f8415b = firebaseAuth;
        this.f8414a = zVar;
    }

    @Override // com.google.firebase.auth.internal.j
    public final void a(Status status) {
        if (status.q() == 17011 || status.q() == 17021 || status.q() == 17005) {
            this.f8415b.e();
        }
    }

    @Override // com.google.firebase.auth.internal.g
    public final void f() {
        z zVar;
        zVar = this.f8415b.f8293f;
        if (zVar.i().equalsIgnoreCase(this.f8414a.i())) {
            this.f8415b.g();
        }
    }
}
