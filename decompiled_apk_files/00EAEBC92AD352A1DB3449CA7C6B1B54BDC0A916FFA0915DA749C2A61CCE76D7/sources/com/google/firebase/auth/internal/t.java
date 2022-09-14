package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ u f8394a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(u uVar) {
        this.f8394a = uVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z) {
        boolean b2;
        f fVar;
        if (z) {
            this.f8394a.f8400c = true;
            this.f8394a.a();
            return;
        }
        this.f8394a.f8400c = false;
        b2 = this.f8394a.b();
        if (!b2) {
            return;
        }
        fVar = this.f8394a.f8399b;
        fVar.a();
    }
}
