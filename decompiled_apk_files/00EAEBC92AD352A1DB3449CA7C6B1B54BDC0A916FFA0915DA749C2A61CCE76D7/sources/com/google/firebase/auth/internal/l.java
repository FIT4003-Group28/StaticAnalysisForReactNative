package com.google.firebase.auth.internal;
/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FederatedSignInActivity f8374b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(FederatedSignInActivity federatedSignInActivity) {
        this.f8374b = federatedSignInActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8374b.k();
        Runnable unused = FederatedSignInActivity.v = null;
    }
}
