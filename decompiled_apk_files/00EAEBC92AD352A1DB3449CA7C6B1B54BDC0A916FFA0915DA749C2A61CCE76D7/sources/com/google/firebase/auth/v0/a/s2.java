package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.n0;
/* loaded from: classes.dex */
final class s2 implements u2 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Status f8503a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s2(p2 p2Var, Status status) {
        this.f8503a = status;
    }

    @Override // com.google.firebase.auth.v0.a.u2
    public final void a(n0.b bVar, Object... objArr) {
        bVar.a(a2.a(this.f8503a));
    }
}
