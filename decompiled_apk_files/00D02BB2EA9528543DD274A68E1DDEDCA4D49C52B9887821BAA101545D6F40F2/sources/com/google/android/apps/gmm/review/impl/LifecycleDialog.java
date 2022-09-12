package com.google.android.apps.gmm.review.impl;

import android.app.Dialog;
import android.content.Context;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LifecycleDialog extends Dialog implements e {
    private final k a;
    private boolean b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleDialog(Context context, m mVar) {
        super(context);
        dzvx.c(context, "context");
        dzvx.c(mVar, "owner");
        k Nh = mVar.Nh();
        dzvx.b(Nh, "owner.getLifecycle()");
        this.a = Nh;
    }

    @Override // defpackage.f
    public final void a(m mVar) {
    }

    @Override // defpackage.f
    public final void b(m mVar) {
        g();
    }

    @Override // defpackage.f
    public final void c(m mVar) {
    }

    @Override // defpackage.f
    public final void d(m mVar) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.b) {
            this.a.b(this);
            this.b = false;
        }
        if (isShowing()) {
            h();
        }
    }

    @Override // defpackage.f
    public final void e(m mVar) {
        super.dismiss();
    }

    @Override // defpackage.f
    public final void f(m mVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        super.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public final void show() {
        if (this.b || isShowing()) {
            return;
        }
        this.b = true;
        this.a.a(this);
    }
}
