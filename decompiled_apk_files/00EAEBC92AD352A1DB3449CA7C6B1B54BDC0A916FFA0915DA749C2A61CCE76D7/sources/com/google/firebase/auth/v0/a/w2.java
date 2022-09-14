package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class w2<ResultT, CallbackT> implements o2<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final n2<ResultT, CallbackT> f8513a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.b.g.i<ResultT> f8514b;

    public w2(n2<ResultT, CallbackT> n2Var, c.e.a.b.g.i<ResultT> iVar) {
        this.f8513a = n2Var;
        this.f8514b = iVar;
    }

    @Override // com.google.firebase.auth.v0.a.o2
    public final void a(ResultT resultt, Status status) {
        com.google.android.gms.common.internal.s.a(this.f8514b, "completion source cannot be null");
        if (status == null) {
            this.f8514b.a((c.e.a.b.g.i<ResultT>) resultt);
            return;
        }
        n2<ResultT, CallbackT> n2Var = this.f8513a;
        if (n2Var.s != null) {
            c.e.a.b.g.i<ResultT> iVar = this.f8514b;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(n2Var.f8487c);
            n2<ResultT, CallbackT> n2Var2 = this.f8513a;
            iVar.a(a2.a(firebaseAuth, n2Var2.s, ("reauthenticateWithCredential".equals(n2Var2.f()) || "reauthenticateWithCredentialWithData".equals(this.f8513a.f())) ? this.f8513a.f8488d : null));
            return;
        }
        com.google.firebase.auth.h hVar = n2Var.p;
        if (hVar != null) {
            this.f8514b.a(a2.a(status, hVar, n2Var.q, n2Var.r));
        } else {
            this.f8514b.a(a2.a(status));
        }
    }
}
