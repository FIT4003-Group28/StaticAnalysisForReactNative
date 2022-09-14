package com.google.firebase.auth.v0.a;

import c.e.a.b.d.e.f3;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p2 extends d2 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n2 f8497a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p2(n2 n2Var) {
        this.f8497a = n2Var;
    }

    private final void a(Status status, com.google.firebase.auth.h hVar, String str, String str2) {
        this.f8497a.b(status);
        n2 n2Var = this.f8497a;
        n2Var.p = hVar;
        n2Var.q = str;
        n2Var.r = str2;
        com.google.firebase.auth.internal.j jVar = n2Var.f8490f;
        if (jVar != null) {
            jVar.a(status);
        }
        this.f8497a.a(status);
    }

    private final void a(u2 u2Var) {
        this.f8497a.i.execute(new v2(this, u2Var));
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void a(f3 f3Var) {
        boolean z = this.f8497a.f8485a == 4;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        n2 n2Var = this.f8497a;
        n2Var.m = f3Var;
        n2Var.b();
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void a(c.e.a.b.d.e.n2 n2Var) {
        a(n2Var.f(), n2Var.j(), n2Var.q(), n2Var.k());
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void a(c.e.a.b.d.e.p2 p2Var) {
        n2 n2Var = this.f8497a;
        n2Var.s = p2Var;
        n2Var.a(com.google.firebase.auth.internal.d.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void a(c.e.a.b.d.e.s2 s2Var) {
        boolean z = this.f8497a.f8485a == 3;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        n2 n2Var = this.f8497a;
        n2Var.l = s2Var;
        n2Var.b();
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void a(c.e.a.b.d.e.y2 y2Var) {
        boolean z = true;
        if (this.f8497a.f8485a != 1) {
            z = false;
        }
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        n2 n2Var = this.f8497a;
        n2Var.j = y2Var;
        n2Var.b();
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void a(c.e.a.b.d.e.y2 y2Var, c.e.a.b.d.e.u2 u2Var) {
        boolean z = this.f8497a.f8485a == 2;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        n2 n2Var = this.f8497a;
        n2Var.j = y2Var;
        n2Var.k = u2Var;
        n2Var.b();
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void a(Status status) {
        String r = status.r();
        if (r != null) {
            if (r.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (r.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (r.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (r.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (r.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (r.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (r.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (r.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (r.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (r.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        n2 n2Var = this.f8497a;
        if (n2Var.f8485a != 8) {
            n2Var.b(status);
            this.f8497a.a(status);
            return;
        }
        n2Var.v = true;
        this.f8497a.w = false;
        a(new s2(this, status));
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void a(Status status, com.google.firebase.auth.m0 m0Var) {
        boolean z = this.f8497a.f8485a == 2;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        a(status, m0Var, (String) null, (String) null);
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void a(com.google.firebase.auth.m0 m0Var) {
        boolean z = this.f8497a.f8485a == 8;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        this.f8497a.v = true;
        this.f8497a.w = true;
        a(new q2(this, m0Var));
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void a(String str) {
        boolean z = this.f8497a.f8485a == 7;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        n2 n2Var = this.f8497a;
        n2Var.n = str;
        n2Var.b();
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void b(String str) {
        boolean z = this.f8497a.f8485a == 8;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        n2 n2Var = this.f8497a;
        n2Var.o = str;
        n2Var.v = true;
        this.f8497a.w = true;
        a(new t2(this, str));
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void c() {
        boolean z = this.f8497a.f8485a == 5;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        this.f8497a.b();
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void c(String str) {
        boolean z = this.f8497a.f8485a == 8;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        this.f8497a.o = str;
        a(new r2(this, str));
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void j() {
        boolean z = this.f8497a.f8485a == 6;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        this.f8497a.b();
    }

    @Override // com.google.firebase.auth.v0.a.e2
    public final void l() {
        boolean z = this.f8497a.f8485a == 9;
        int i = this.f8497a.f8485a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        com.google.android.gms.common.internal.s.b(z, sb.toString());
        this.f8497a.b();
    }
}
