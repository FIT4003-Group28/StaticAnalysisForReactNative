package com.google.firebase.auth;

import android.net.Uri;
import c.e.a.b.d.e.y2;
import java.util.List;
/* loaded from: classes.dex */
public abstract class z extends com.google.android.gms.common.internal.x.a implements t0 {
    public abstract String A();

    public c.e.a.b.g.h<Void> a(e eVar) {
        return FirebaseAuth.getInstance(y()).a(this, false).b(new n1(this, eVar));
    }

    public c.e.a.b.g.h<i> a(h hVar) {
        com.google.android.gms.common.internal.s.a(hVar);
        return FirebaseAuth.getInstance(y()).b(this, hVar);
    }

    public c.e.a.b.g.h<Void> a(m0 m0Var) {
        return FirebaseAuth.getInstance(y()).a(this, m0Var);
    }

    public c.e.a.b.g.h<Void> a(u0 u0Var) {
        com.google.android.gms.common.internal.s.a(u0Var);
        return FirebaseAuth.getInstance(y()).a(this, u0Var);
    }

    public c.e.a.b.g.h<i> a(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return FirebaseAuth.getInstance(y()).a(this, str);
    }

    public c.e.a.b.g.h<Void> a(String str, e eVar) {
        return FirebaseAuth.getInstance(y()).a(this, false).b(new p1(this, str, eVar));
    }

    public c.e.a.b.g.h<b0> a(boolean z) {
        return FirebaseAuth.getInstance(y()).a(this, z);
    }

    public abstract z a(List<? extends t0> list);

    public abstract String a();

    public abstract void a(y2 y2Var);

    public c.e.a.b.g.h<i> b(h hVar) {
        com.google.android.gms.common.internal.s.a(hVar);
        return FirebaseAuth.getInstance(y()).a(this, hVar);
    }

    public c.e.a.b.g.h<Void> b(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return FirebaseAuth.getInstance(y()).b(this, str);
    }

    public abstract void b(List<h0> list);

    public c.e.a.b.g.h<Void> c(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return FirebaseAuth.getInstance(y()).c(this, str);
    }

    public c.e.a.b.g.h<Void> d(String str) {
        return a(str, null);
    }

    public abstract List<String> f();

    public abstract y2 g();

    public abstract Uri h();

    public abstract String i();

    public abstract z j();

    public abstract String k();

    public abstract String m();

    public abstract String o();

    public abstract String p();

    public c.e.a.b.g.h<Void> q() {
        return FirebaseAuth.getInstance(y()).b(this);
    }

    public abstract a0 r();

    public abstract g0 s();

    public abstract List<? extends t0> t();

    public abstract boolean u();

    public c.e.a.b.g.h<Void> v() {
        return FirebaseAuth.getInstance(y()).a(this);
    }

    public c.e.a.b.g.h<Void> x() {
        return FirebaseAuth.getInstance(y()).a(this, false).b(new o1(this));
    }

    public abstract c.e.b.d y();

    public abstract String z();
}
