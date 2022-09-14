package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import c.e.a.b.d.e.i3;
import c.e.a.b.d.e.o3;
import c.e.a.b.d.e.y2;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.n0;
import com.google.firebase.auth.v0.a.a2;
import com.google.firebase.auth.v0.a.h2;
import com.google.firebase.auth.v0.a.l2;
import com.google.firebase.auth.v0.a.m2;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class FirebaseAuth implements com.google.firebase.auth.internal.b {

    /* renamed from: a  reason: collision with root package name */
    private c.e.b.d f8288a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f8289b;

    /* renamed from: c  reason: collision with root package name */
    private final List<com.google.firebase.auth.internal.a> f8290c;

    /* renamed from: d  reason: collision with root package name */
    private List<a> f8291d;

    /* renamed from: e  reason: collision with root package name */
    private com.google.firebase.auth.v0.a.i f8292e;

    /* renamed from: f  reason: collision with root package name */
    private z f8293f;

    /* renamed from: g  reason: collision with root package name */
    private com.google.firebase.auth.internal.l0 f8294g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f8295h;
    private String i;
    private final Object j;
    private String k;
    private final com.google.firebase.auth.internal.s l;
    private final com.google.firebase.auth.internal.k m;
    private com.google.firebase.auth.internal.u n;
    private com.google.firebase.auth.internal.x o;

    /* loaded from: classes.dex */
    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements com.google.firebase.auth.internal.c, com.google.firebase.auth.internal.j {
        c() {
        }

        @Override // com.google.firebase.auth.internal.c
        public final void a(y2 y2Var, z zVar) {
            com.google.android.gms.common.internal.s.a(y2Var);
            com.google.android.gms.common.internal.s.a(zVar);
            zVar.a(y2Var);
            FirebaseAuth.this.a(zVar, y2Var, true, true);
        }

        @Override // com.google.firebase.auth.internal.j
        public final void a(Status status) {
            if (status.q() == 17011 || status.q() == 17021 || status.q() == 17005 || status.q() == 17091) {
                FirebaseAuth.this.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements com.google.firebase.auth.internal.c {
        d() {
        }

        @Override // com.google.firebase.auth.internal.c
        public final void a(y2 y2Var, z zVar) {
            com.google.android.gms.common.internal.s.a(y2Var);
            com.google.android.gms.common.internal.s.a(zVar);
            zVar.a(y2Var);
            FirebaseAuth.this.a(zVar, y2Var, true);
        }
    }

    public FirebaseAuth(c.e.b.d dVar) {
        this(dVar, h2.a(dVar.b(), new l2(dVar.d().a()).a()), new com.google.firebase.auth.internal.s(dVar.b(), dVar.e()), com.google.firebase.auth.internal.k.a());
    }

    private FirebaseAuth(c.e.b.d dVar, com.google.firebase.auth.v0.a.i iVar, com.google.firebase.auth.internal.s sVar, com.google.firebase.auth.internal.k kVar) {
        y2 b2;
        this.f8295h = new Object();
        this.j = new Object();
        com.google.android.gms.common.internal.s.a(dVar);
        this.f8288a = dVar;
        com.google.android.gms.common.internal.s.a(iVar);
        this.f8292e = iVar;
        com.google.android.gms.common.internal.s.a(sVar);
        this.l = sVar;
        this.f8294g = new com.google.firebase.auth.internal.l0();
        com.google.android.gms.common.internal.s.a(kVar);
        this.m = kVar;
        this.f8289b = new CopyOnWriteArrayList();
        this.f8290c = new CopyOnWriteArrayList();
        this.f8291d = new CopyOnWriteArrayList();
        this.o = com.google.firebase.auth.internal.x.a();
        this.f8293f = this.l.a();
        z zVar = this.f8293f;
        if (zVar != null && (b2 = this.l.b(zVar)) != null) {
            a(this.f8293f, b2, false);
        }
        this.m.a(this);
    }

    private final c.e.a.b.g.h<Void> a(z zVar, com.google.firebase.auth.internal.w wVar) {
        com.google.android.gms.common.internal.s.a(zVar);
        return this.f8292e.a(this.f8288a, zVar, wVar);
    }

    private final n0.b a(String str, n0.b bVar) {
        return (!this.f8294g.c() || !str.equals(this.f8294g.a())) ? bVar : new k1(this, bVar);
    }

    private final synchronized void a(com.google.firebase.auth.internal.u uVar) {
        this.n = uVar;
    }

    private final void c(z zVar) {
        String str;
        if (zVar != null) {
            String i = zVar.i();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 45);
            sb.append("Notifying id token listeners about user ( ");
            sb.append(i);
            sb.append(" ).");
            str = sb.toString();
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        this.o.execute(new g1(this, new c.e.b.o.c(zVar != null ? zVar.A() : null)));
    }

    private final void d(z zVar) {
        String str;
        if (zVar != null) {
            String i = zVar.i();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
            sb.append("Notifying auth state listeners about user ( ");
            sb.append(i);
            sb.append(" ).");
            str = sb.toString();
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        this.o.execute(new j1(this));
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) c.e.b.d.k().a(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(c.e.b.d dVar) {
        return (FirebaseAuth) dVar.a(FirebaseAuth.class);
    }

    private final synchronized com.google.firebase.auth.internal.u i() {
        if (this.n == null) {
            a(new com.google.firebase.auth.internal.u(this.f8288a));
        }
        return this.n;
    }

    private final boolean i(String str) {
        f a2 = f.a(str);
        return a2 != null && !TextUtils.equals(this.k, a2.b());
    }

    public final c.e.a.b.g.h<Void> a(e eVar, String str) {
        com.google.android.gms.common.internal.s.b(str);
        if (this.i != null) {
            if (eVar == null) {
                eVar = e.f();
            }
            eVar.a(this.i);
        }
        return this.f8292e.a(this.f8288a, eVar, str);
    }

    public c.e.a.b.g.h<i> a(h hVar) {
        com.google.android.gms.common.internal.s.a(hVar);
        h f2 = hVar.f();
        if (f2 instanceof j) {
            j jVar = (j) f2;
            return !jVar.t() ? this.f8292e.b(this.f8288a, jVar.j(), jVar.s(), this.k, new d()) : i(jVar.k()) ? c.e.a.b.g.k.a((Exception) a2.a(new Status(17072))) : this.f8292e.a(this.f8288a, jVar, new d());
        } else if (!(f2 instanceof m0)) {
            return this.f8292e.a(this.f8288a, f2, this.k, new d());
        } else {
            return this.f8292e.a(this.f8288a, (m0) f2, this.k, (com.google.firebase.auth.internal.c) new d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    public final c.e.a.b.g.h<Void> a(z zVar) {
        return a(zVar, (com.google.firebase.auth.internal.w) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    public final c.e.a.b.g.h<i> a(z zVar, h hVar) {
        com.google.android.gms.common.internal.s.a(zVar);
        com.google.android.gms.common.internal.s.a(hVar);
        h f2 = hVar.f();
        if (!(f2 instanceof j)) {
            return f2 instanceof m0 ? this.f8292e.a(this.f8288a, zVar, (m0) f2, this.k, (com.google.firebase.auth.internal.w) new c()) : this.f8292e.a(this.f8288a, zVar, f2, zVar.k(), (com.google.firebase.auth.internal.w) new c());
        }
        j jVar = (j) f2;
        return "password".equals(jVar.r()) ? this.f8292e.a(this.f8288a, zVar, jVar.j(), jVar.s(), zVar.k(), new c()) : i(jVar.k()) ? c.e.a.b.g.k.a((Exception) a2.a(new Status(17072))) : this.f8292e.a(this.f8288a, zVar, jVar, (com.google.firebase.auth.internal.w) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    public final c.e.a.b.g.h<Void> a(z zVar, m0 m0Var) {
        com.google.android.gms.common.internal.s.a(zVar);
        com.google.android.gms.common.internal.s.a(m0Var);
        return this.f8292e.a(this.f8288a, zVar, (m0) m0Var.f(), (com.google.firebase.auth.internal.w) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    public final c.e.a.b.g.h<Void> a(z zVar, u0 u0Var) {
        com.google.android.gms.common.internal.s.a(zVar);
        com.google.android.gms.common.internal.s.a(u0Var);
        return this.f8292e.a(this.f8288a, zVar, u0Var, (com.google.firebase.auth.internal.w) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    public final c.e.a.b.g.h<i> a(z zVar, String str) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(zVar);
        return this.f8292e.d(this.f8288a, zVar, str, new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.i1, com.google.firebase.auth.internal.w] */
    public final c.e.a.b.g.h<b0> a(z zVar, boolean z) {
        if (zVar == null) {
            return c.e.a.b.g.k.a((Exception) a2.a(new Status(17495)));
        }
        y2 g2 = zVar.g();
        return (!g2.j() || z) ? this.f8292e.a(this.f8288a, zVar, g2.q(), (com.google.firebase.auth.internal.w) new i1(this)) : c.e.a.b.g.k.a(com.google.firebase.auth.internal.n.a(g2.k()));
    }

    public c.e.a.b.g.h<Void> a(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return this.f8292e.c(this.f8288a, str, this.k);
    }

    public c.e.a.b.g.h<Void> a(String str, e eVar) {
        com.google.android.gms.common.internal.s.b(str);
        if (eVar == null) {
            eVar = e.f();
        }
        String str2 = this.i;
        if (str2 != null) {
            eVar.a(str2);
        }
        eVar.a(o3.PASSWORD_RESET);
        return this.f8292e.a(this.f8288a, str, eVar, this.k);
    }

    public c.e.a.b.g.h<Void> a(String str, String str2) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        return this.f8292e.a(this.f8288a, str, str2, this.k);
    }

    public final c.e.a.b.g.h<Void> a(String str, String str2, e eVar) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        if (eVar == null) {
            eVar = e.f();
        }
        String str3 = this.i;
        if (str3 != null) {
            eVar.a(str3);
        }
        return this.f8292e.a(str, str2, eVar);
    }

    public c.e.a.b.g.h<b0> a(boolean z) {
        return a(this.f8293f, z);
    }

    public z a() {
        return this.f8293f;
    }

    public void a(a aVar) {
        this.f8291d.add(aVar);
        this.o.execute(new h1(this, aVar));
    }

    public void a(b bVar) {
        this.f8289b.add(bVar);
        this.o.execute(new f1(this, bVar));
    }

    public final void a(z zVar, y2 y2Var, boolean z) {
        a(zVar, y2Var, z, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(z zVar, y2 y2Var, boolean z, boolean z2) {
        boolean z3;
        com.google.android.gms.common.internal.s.a(zVar);
        com.google.android.gms.common.internal.s.a(y2Var);
        boolean z4 = true;
        boolean z5 = this.f8293f != null && zVar.i().equals(this.f8293f.i());
        if (z5 || !z2) {
            z zVar2 = this.f8293f;
            if (zVar2 == null) {
                z3 = true;
            } else {
                z3 = !z5 || (zVar2.g().k().equals(y2Var.k()) ^ true);
                if (z5) {
                    z4 = false;
                }
            }
            com.google.android.gms.common.internal.s.a(zVar);
            z zVar3 = this.f8293f;
            if (zVar3 == null) {
                this.f8293f = zVar;
            } else {
                zVar3.a(zVar.t());
                if (!zVar.u()) {
                    this.f8293f.j();
                }
                this.f8293f.b(zVar.s().a());
            }
            if (z) {
                this.l.a(this.f8293f);
            }
            if (z3) {
                z zVar4 = this.f8293f;
                if (zVar4 != null) {
                    zVar4.a(y2Var);
                }
                c(this.f8293f);
            }
            if (z4) {
                d(this.f8293f);
            }
            if (z) {
                this.l.a(zVar, y2Var);
            }
            i().a(this.f8293f.g());
        }
    }

    public final void a(String str, long j, TimeUnit timeUnit, n0.b bVar, Activity activity, Executor executor, boolean z, String str2) {
        long convert = TimeUnit.SECONDS.convert(j, timeUnit);
        if (convert < 0 || convert > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        this.f8292e.a(this.f8288a, new i3(str, convert, z, this.i, this.k, str2), a(str, bVar), activity, executor);
    }

    public final c.e.a.b.g.h<Void> b(z zVar) {
        com.google.android.gms.common.internal.s.a(zVar);
        return this.f8292e.a(zVar, new l1(this, zVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    public final c.e.a.b.g.h<i> b(z zVar, h hVar) {
        com.google.android.gms.common.internal.s.a(hVar);
        com.google.android.gms.common.internal.s.a(zVar);
        return this.f8292e.a(this.f8288a, zVar, hVar.f(), (com.google.firebase.auth.internal.w) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    public final c.e.a.b.g.h<Void> b(z zVar, String str) {
        com.google.android.gms.common.internal.s.a(zVar);
        com.google.android.gms.common.internal.s.b(str);
        return this.f8292e.b(this.f8288a, zVar, str, (com.google.firebase.auth.internal.w) new c());
    }

    public c.e.a.b.g.h<com.google.firebase.auth.d> b(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return this.f8292e.b(this.f8288a, str, this.k);
    }

    public c.e.a.b.g.h<Void> b(String str, e eVar) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(eVar);
        if (eVar.q()) {
            String str2 = this.i;
            if (str2 != null) {
                eVar.a(str2);
            }
            return this.f8292e.b(this.f8288a, str, eVar, this.k);
        }
        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
    }

    public c.e.a.b.g.h<i> b(String str, String str2) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        return this.f8292e.a(this.f8288a, str, str2, this.k, new d());
    }

    public v b() {
        return this.f8294g;
    }

    public void b(a aVar) {
        this.f8291d.remove(aVar);
    }

    public void b(b bVar) {
        this.f8289b.remove(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, com.google.firebase.auth.internal.w] */
    public final c.e.a.b.g.h<Void> c(z zVar, String str) {
        com.google.android.gms.common.internal.s.a(zVar);
        com.google.android.gms.common.internal.s.b(str);
        return this.f8292e.c(this.f8288a, zVar, str, new c());
    }

    public c.e.a.b.g.h<q0> c(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return this.f8292e.a(this.f8288a, str, this.k);
    }

    public c.e.a.b.g.h<i> c(String str, String str2) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        return this.f8292e.b(this.f8288a, str, str2, this.k, new d());
    }

    public String c() {
        String str;
        synchronized (this.f8295h) {
            str = this.i;
        }
        return str;
    }

    public c.e.a.b.g.h<i> d() {
        z zVar = this.f8293f;
        if (zVar == null || !zVar.u()) {
            return this.f8292e.a(this.f8288a, new d(), this.k);
        }
        com.google.firebase.auth.internal.k0 k0Var = (com.google.firebase.auth.internal.k0) this.f8293f;
        k0Var.b(false);
        return c.e.a.b.g.k.a(new com.google.firebase.auth.internal.e0(k0Var));
    }

    public c.e.a.b.g.h<Void> d(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return a(str, (e) null);
    }

    public c.e.a.b.g.h<i> d(String str, String str2) {
        return a(k.b(str, str2));
    }

    public void e() {
        g();
        com.google.firebase.auth.internal.u uVar = this.n;
        if (uVar != null) {
            uVar.a();
        }
    }

    public void e(String str) {
        com.google.android.gms.common.internal.s.b(str);
        synchronized (this.f8295h) {
            this.i = str;
        }
    }

    public c.e.a.b.g.h<i> f(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return this.f8292e.a(this.f8288a, str, this.k, new d());
    }

    public void f() {
        synchronized (this.f8295h) {
            this.i = m2.a();
        }
    }

    public c.e.a.b.g.h<String> g(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return this.f8292e.d(this.f8288a, str, this.k);
    }

    public final void g() {
        z zVar = this.f8293f;
        if (zVar != null) {
            com.google.firebase.auth.internal.s sVar = this.l;
            com.google.android.gms.common.internal.s.a(zVar);
            sVar.a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", zVar.i()));
            this.f8293f = null;
        }
        this.l.a("com.google.firebase.auth.FIREBASE_USER");
        c((z) null);
        d((z) null);
    }

    public final c.e.b.d h() {
        return this.f8288a;
    }

    public final void h(String str) {
        com.google.android.gms.common.internal.s.b(str);
        synchronized (this.j) {
            this.k = str;
        }
    }
}
