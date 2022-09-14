package com.google.android.gms.common.api.internal;

import android.app.Dialog;
/* loaded from: classes.dex */
final class w0 extends b0 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Dialog f6933a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ u0 f6934b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(u0 u0Var, Dialog dialog) {
        this.f6934b = u0Var;
        this.f6933a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void a() {
        this.f6934b.f6928c.g();
        if (this.f6933a.isShowing()) {
            this.f6933a.dismiss();
        }
    }
}
