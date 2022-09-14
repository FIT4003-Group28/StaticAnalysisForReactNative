package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.google.android.gms.common.api.GoogleApiActivity;
/* loaded from: classes.dex */
final class u0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final v0 f6927b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t0 f6928c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(t0 t0Var, v0 v0Var) {
        this.f6928c = t0Var;
        this.f6927b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f6928c.f6922c) {
            return;
        }
        com.google.android.gms.common.b a2 = this.f6927b.a();
        if (a2.t()) {
            t0 t0Var = this.f6928c;
            t0Var.f6828b.startActivityForResult(GoogleApiActivity.a(t0Var.a(), a2.s(), this.f6927b.b(), false), 1);
        } else if (this.f6928c.f6925f.b(a2.q())) {
            t0 t0Var2 = this.f6928c;
            t0Var2.f6925f.a(t0Var2.a(), this.f6928c.f6828b, a2.q(), 2, this.f6928c);
        } else if (a2.q() != 18) {
            this.f6928c.a(a2, this.f6927b.b());
        } else {
            Dialog a3 = com.google.android.gms.common.e.a(this.f6928c.a(), this.f6928c);
            t0 t0Var3 = this.f6928c;
            t0Var3.f6925f.a(t0Var3.a().getApplicationContext(), new w0(this, a3));
        }
    }
}
