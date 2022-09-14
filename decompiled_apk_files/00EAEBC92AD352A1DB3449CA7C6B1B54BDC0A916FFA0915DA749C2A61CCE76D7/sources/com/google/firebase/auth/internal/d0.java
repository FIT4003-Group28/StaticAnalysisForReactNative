package com.google.firebase.auth.internal;

import c.e.a.b.d.e.f3;
/* loaded from: classes.dex */
public final class d0 implements com.google.firebase.auth.d {

    /* renamed from: a  reason: collision with root package name */
    private final int f8340a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8341b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8342c;

    public d0(f3 f3Var) {
        this.f8341b = f3Var.s() ? f3Var.q() : f3Var.j();
        this.f8342c = f3Var.j();
        if (!f3Var.t()) {
            this.f8340a = 3;
            return;
        }
        String k = f3Var.k();
        char c2 = 65535;
        switch (k.hashCode()) {
            case -1874510116:
                if (k.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1452371317:
                if (k.equals("PASSWORD_RESET")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1341836234:
                if (k.equals("VERIFY_EMAIL")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1288726400:
                if (k.equals("VERIFY_BEFORE_UPDATE_EMAIL")) {
                    c2 = 3;
                    break;
                }
                break;
            case 870738373:
                if (k.equals("EMAIL_SIGNIN")) {
                    c2 = 2;
                    break;
                }
                break;
            case 970484929:
                if (k.equals("RECOVER_EMAIL")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        this.f8340a = c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? c2 != 5 ? 3 : 6 : 2 : 5 : 4 : 1 : 0;
        int i = this.f8340a;
        if (i == 4 || i == 3) {
            return;
        }
        if (f3Var.u()) {
            new a0(f3Var.j(), p.a(f3Var.g()));
        } else if (f3Var.s()) {
            new v(f3Var.q(), f3Var.j());
        } else if (!f3Var.r()) {
        } else {
            new b0(f3Var.j());
        }
    }

    @Override // com.google.firebase.auth.d
    public final int a() {
        return this.f8340a;
    }

    @Override // com.google.firebase.auth.d
    public final String a(int i) {
        if (this.f8340a == 4) {
            return null;
        }
        if (i == 0) {
            return this.f8341b;
        }
        if (i == 1) {
            return this.f8342c;
        }
        return null;
    }
}
