package com.google.firebase.auth.v0.a;

import android.app.Activity;
import android.content.Context;
import c.e.a.b.d.e.c3;
import c.e.a.b.d.e.i3;
import c.e.a.b.d.e.o3;
import c.e.a.b.d.e.v3;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.n0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class i extends b<i2> {

    /* renamed from: c  reason: collision with root package name */
    private final Context f8471c;

    /* renamed from: d  reason: collision with root package name */
    private final i2 f8472d;

    /* renamed from: e  reason: collision with root package name */
    private final Future<a<i2>> f8473e = a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context, i2 i2Var) {
        this.f8471c = context;
        this.f8472d = i2Var;
    }

    private final <ResultT> c.e.a.b.g.h<ResultT> a(c.e.a.b.g.h<ResultT> hVar, e<z1, ResultT> eVar) {
        return (c.e.a.b.g.h<ResultT>) hVar.b(new h(this, eVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.firebase.auth.internal.k0 a(c.e.b.d dVar, c.e.a.b.d.e.u2 u2Var) {
        com.google.android.gms.common.internal.s.a(dVar);
        com.google.android.gms.common.internal.s.a(u2Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.firebase.auth.internal.g0(u2Var, "firebase"));
        List<c3> v = u2Var.v();
        if (v != null && !v.isEmpty()) {
            for (int i = 0; i < v.size(); i++) {
                arrayList.add(new com.google.firebase.auth.internal.g0(v.get(i)));
            }
        }
        com.google.firebase.auth.internal.k0 k0Var = new com.google.firebase.auth.internal.k0(dVar, arrayList);
        k0Var.a(new com.google.firebase.auth.internal.m0(u2Var.t(), u2Var.s()));
        k0Var.b(u2Var.u());
        k0Var.a(u2Var.x());
        k0Var.b(com.google.firebase.auth.internal.p.a(u2Var.y()));
        return k0Var;
    }

    public final c.e.a.b.g.h<Void> a(c.e.b.d dVar, com.google.firebase.auth.e eVar, String str) {
        q0 q0Var = new q0(str, eVar);
        q0Var.a(dVar);
        q0 q0Var2 = q0Var;
        return a((c.e.a.b.g.h) b(q0Var2), (e) q0Var2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, com.google.firebase.auth.h hVar, String str, com.google.firebase.auth.internal.c cVar) {
        w0 w0Var = new w0(hVar, str);
        w0Var.a(dVar);
        w0Var.a((w0) cVar);
        w0 w0Var2 = w0Var;
        return a((c.e.a.b.g.h) b(w0Var2), (e) w0Var2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, com.google.firebase.auth.internal.c cVar, String str) {
        u0 u0Var = new u0(str);
        u0Var.a(dVar);
        u0Var.a((u0) cVar);
        u0 u0Var2 = u0Var;
        return a((c.e.a.b.g.h) b(u0Var2), (e) u0Var2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, com.google.firebase.auth.j jVar, com.google.firebase.auth.internal.c cVar) {
        c1 c1Var = new c1(jVar);
        c1Var.a(dVar);
        c1Var.a((c1) cVar);
        c1 c1Var2 = c1Var;
        return a((c.e.a.b.g.h) b(c1Var2), (e) c1Var2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, com.google.firebase.auth.m0 m0Var, String str, com.google.firebase.auth.internal.c cVar) {
        e1 e1Var = new e1(m0Var, str);
        e1Var.a(dVar);
        e1Var.a((e1) cVar);
        e1 e1Var2 = e1Var;
        return a((c.e.a.b.g.h) b(e1Var2), (e) e1Var2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, com.google.firebase.auth.z zVar, com.google.firebase.auth.h hVar, com.google.firebase.auth.internal.w wVar) {
        com.google.android.gms.common.internal.s.a(dVar);
        com.google.android.gms.common.internal.s.a(hVar);
        com.google.android.gms.common.internal.s.a(zVar);
        com.google.android.gms.common.internal.s.a(wVar);
        List<String> f2 = zVar.f();
        if (f2 == null || !f2.contains(hVar.q())) {
            if (hVar instanceof com.google.firebase.auth.j) {
                com.google.firebase.auth.j jVar = (com.google.firebase.auth.j) hVar;
                if (!jVar.t()) {
                    y yVar = new y(jVar);
                    yVar.a(dVar);
                    yVar.a(zVar);
                    yVar.a((y) wVar);
                    yVar.a((com.google.firebase.auth.internal.j) wVar);
                    y yVar2 = yVar;
                    return a((c.e.a.b.g.h) b(yVar2), (e) yVar2);
                }
                e0 e0Var = new e0(jVar);
                e0Var.a(dVar);
                e0Var.a(zVar);
                e0Var.a((e0) wVar);
                e0Var.a((com.google.firebase.auth.internal.j) wVar);
                e0 e0Var2 = e0Var;
                return a((c.e.a.b.g.h) b(e0Var2), (e) e0Var2);
            } else if (hVar instanceof com.google.firebase.auth.m0) {
                c0 c0Var = new c0((com.google.firebase.auth.m0) hVar);
                c0Var.a(dVar);
                c0Var.a(zVar);
                c0Var.a((c0) wVar);
                c0Var.a((com.google.firebase.auth.internal.j) wVar);
                c0 c0Var2 = c0Var;
                return a((c.e.a.b.g.h) b(c0Var2), (e) c0Var2);
            } else {
                com.google.android.gms.common.internal.s.a(dVar);
                com.google.android.gms.common.internal.s.a(hVar);
                com.google.android.gms.common.internal.s.a(zVar);
                com.google.android.gms.common.internal.s.a(wVar);
                a0 a0Var = new a0(hVar);
                a0Var.a(dVar);
                a0Var.a(zVar);
                a0Var.a((a0) wVar);
                a0Var.a((com.google.firebase.auth.internal.j) wVar);
                a0 a0Var2 = a0Var;
                return a((c.e.a.b.g.h) b(a0Var2), (e) a0Var2);
            }
        }
        return c.e.a.b.g.k.a((Exception) a2.a(new Status(17015)));
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, com.google.firebase.auth.z zVar, com.google.firebase.auth.h hVar, String str, com.google.firebase.auth.internal.w wVar) {
        g0 g0Var = new g0(hVar, str);
        g0Var.a(dVar);
        g0Var.a(zVar);
        g0Var.a((g0) wVar);
        g0Var.a((com.google.firebase.auth.internal.j) wVar);
        g0 g0Var2 = g0Var;
        return a((c.e.a.b.g.h) b(g0Var2), (e) g0Var2);
    }

    public final c.e.a.b.g.h<Void> a(c.e.b.d dVar, com.google.firebase.auth.z zVar, com.google.firebase.auth.internal.w wVar) {
        o0 o0Var = new o0();
        o0Var.a(dVar);
        o0Var.a(zVar);
        o0Var.a((o0) wVar);
        o0Var.a((com.google.firebase.auth.internal.j) wVar);
        o0 o0Var2 = o0Var;
        return a((c.e.a.b.g.h) a(o0Var2), (e) o0Var2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, com.google.firebase.auth.z zVar, com.google.firebase.auth.j jVar, com.google.firebase.auth.internal.w wVar) {
        i0 i0Var = new i0(jVar);
        i0Var.a(dVar);
        i0Var.a(zVar);
        i0Var.a((i0) wVar);
        i0Var.a((com.google.firebase.auth.internal.j) wVar);
        i0 i0Var2 = i0Var;
        return a((c.e.a.b.g.h) b(i0Var2), (e) i0Var2);
    }

    public final c.e.a.b.g.h<Void> a(c.e.b.d dVar, com.google.firebase.auth.z zVar, com.google.firebase.auth.m0 m0Var, com.google.firebase.auth.internal.w wVar) {
        o1 o1Var = new o1(m0Var);
        o1Var.a(dVar);
        o1Var.a(zVar);
        o1Var.a((o1) wVar);
        o1Var.a((com.google.firebase.auth.internal.j) wVar);
        o1 o1Var2 = o1Var;
        return a((c.e.a.b.g.h) b(o1Var2), (e) o1Var2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, com.google.firebase.auth.z zVar, com.google.firebase.auth.m0 m0Var, String str, com.google.firebase.auth.internal.w wVar) {
        m0 m0Var2 = new m0(m0Var, str);
        m0Var2.a(dVar);
        m0Var2.a(zVar);
        m0Var2.a((m0) wVar);
        m0Var2.a((com.google.firebase.auth.internal.j) wVar);
        m0 m0Var3 = m0Var2;
        return a((c.e.a.b.g.h) b(m0Var3), (e) m0Var3);
    }

    public final c.e.a.b.g.h<Void> a(c.e.b.d dVar, com.google.firebase.auth.z zVar, com.google.firebase.auth.u0 u0Var, com.google.firebase.auth.internal.w wVar) {
        q1 q1Var = new q1(u0Var);
        q1Var.a(dVar);
        q1Var.a(zVar);
        q1Var.a((q1) wVar);
        q1Var.a((com.google.firebase.auth.internal.j) wVar);
        q1 q1Var2 = q1Var;
        return a((c.e.a.b.g.h) b(q1Var2), (e) q1Var2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.b0> a(c.e.b.d dVar, com.google.firebase.auth.z zVar, String str, com.google.firebase.auth.internal.w wVar) {
        w wVar2 = new w(str);
        wVar2.a(dVar);
        wVar2.a(zVar);
        wVar2.a((w) wVar);
        wVar2.a((com.google.firebase.auth.internal.j) wVar);
        w wVar3 = wVar2;
        return a((c.e.a.b.g.h) a(wVar3), (e) wVar3);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, com.google.firebase.auth.z zVar, String str, String str2, String str3, com.google.firebase.auth.internal.w wVar) {
        k0 k0Var = new k0(str, str2, str3);
        k0Var.a(dVar);
        k0Var.a(zVar);
        k0Var.a((k0) wVar);
        k0Var.a((com.google.firebase.auth.internal.j) wVar);
        k0 k0Var2 = k0Var;
        return a((c.e.a.b.g.h) b(k0Var2), (e) k0Var2);
    }

    public final c.e.a.b.g.h<Void> a(c.e.b.d dVar, String str, com.google.firebase.auth.e eVar, String str2) {
        eVar.a(o3.PASSWORD_RESET);
        s0 s0Var = new s0(str, eVar, str2, "sendPasswordResetEmail");
        s0Var.a(dVar);
        s0 s0Var2 = s0Var;
        return a((c.e.a.b.g.h) b(s0Var2), (e) s0Var2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.q0> a(c.e.b.d dVar, String str, String str2) {
        u uVar = new u(str, str2);
        uVar.a(dVar);
        u uVar2 = uVar;
        return a((c.e.a.b.g.h) a(uVar2), (e) uVar2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, String str, String str2, com.google.firebase.auth.internal.c cVar) {
        y0 y0Var = new y0(str, str2);
        y0Var.a(dVar);
        y0Var.a((y0) cVar);
        y0 y0Var2 = y0Var;
        return a((c.e.a.b.g.h) b(y0Var2), (e) y0Var2);
    }

    public final c.e.a.b.g.h<Void> a(c.e.b.d dVar, String str, String str2, String str3) {
        o oVar = new o(str, str2, str3);
        oVar.a(dVar);
        o oVar2 = oVar;
        return a((c.e.a.b.g.h) b(oVar2), (e) oVar2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> a(c.e.b.d dVar, String str, String str2, String str3, com.google.firebase.auth.internal.c cVar) {
        q qVar = new q(str, str2, str3);
        qVar.a(dVar);
        qVar.a((q) cVar);
        q qVar2 = qVar;
        return a((c.e.a.b.g.h) b(qVar2), (e) qVar2);
    }

    public final c.e.a.b.g.h<Void> a(com.google.firebase.auth.z zVar, com.google.firebase.auth.internal.g gVar) {
        s sVar = new s();
        sVar.a(zVar);
        sVar.a((s) gVar);
        sVar.a((com.google.firebase.auth.internal.j) gVar);
        s sVar2 = sVar;
        return a((c.e.a.b.g.h) b(sVar2), (e) sVar2);
    }

    public final c.e.a.b.g.h<Void> a(String str, String str2, com.google.firebase.auth.e eVar) {
        eVar.a(o3.VERIFY_AND_CHANGE_EMAIL);
        return b(new s1(str, str2, eVar));
    }

    @Override // com.google.firebase.auth.v0.a.b
    final Future<a<i2>> a() {
        Future<a<i2>> future = this.f8473e;
        if (future != null) {
            return future;
        }
        return c.e.a.b.d.e.w2.a().a(v3.f4007a).submit(new x1(this.f8472d, this.f8471c));
    }

    public final void a(c.e.b.d dVar, i3 i3Var, n0.b bVar, Activity activity, Executor executor) {
        w1 w1Var = new w1(i3Var);
        w1Var.a(dVar);
        w1Var.a(bVar, activity, executor);
        w1 w1Var2 = w1Var;
        a((c.e.a.b.g.h) b(w1Var2), (e) w1Var2);
    }

    public final c.e.a.b.g.h<Void> b(c.e.b.d dVar, com.google.firebase.auth.z zVar, String str, com.google.firebase.auth.internal.w wVar) {
        k1 k1Var = new k1(str);
        k1Var.a(dVar);
        k1Var.a(zVar);
        k1Var.a((k1) wVar);
        k1Var.a((com.google.firebase.auth.internal.j) wVar);
        k1 k1Var2 = k1Var;
        return a((c.e.a.b.g.h) b(k1Var2), (e) k1Var2);
    }

    public final c.e.a.b.g.h<Void> b(c.e.b.d dVar, String str, com.google.firebase.auth.e eVar, String str2) {
        eVar.a(o3.EMAIL_SIGNIN);
        s0 s0Var = new s0(str, eVar, str2, "sendSignInLinkToEmail");
        s0Var.a(dVar);
        s0 s0Var2 = s0Var;
        return a((c.e.a.b.g.h) b(s0Var2), (e) s0Var2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.d> b(c.e.b.d dVar, String str, String str2) {
        m mVar = new m(str, str2);
        mVar.a(dVar);
        m mVar2 = mVar;
        return a((c.e.a.b.g.h) b(mVar2), (e) mVar2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> b(c.e.b.d dVar, String str, String str2, String str3, com.google.firebase.auth.internal.c cVar) {
        a1 a1Var = new a1(str, str2, str3);
        a1Var.a(dVar);
        a1Var.a((a1) cVar);
        a1 a1Var2 = a1Var;
        return a((c.e.a.b.g.h) b(a1Var2), (e) a1Var2);
    }

    public final c.e.a.b.g.h<Void> c(c.e.b.d dVar, com.google.firebase.auth.z zVar, String str, com.google.firebase.auth.internal.w wVar) {
        m1 m1Var = new m1(str);
        m1Var.a(dVar);
        m1Var.a(zVar);
        m1Var.a((m1) wVar);
        m1Var.a((com.google.firebase.auth.internal.j) wVar);
        m1 m1Var2 = m1Var;
        return a((c.e.a.b.g.h) b(m1Var2), (e) m1Var2);
    }

    public final c.e.a.b.g.h<Void> c(c.e.b.d dVar, String str, String str2) {
        k kVar = new k(str, str2);
        kVar.a(dVar);
        k kVar2 = kVar;
        return a((c.e.a.b.g.h) b(kVar2), (e) kVar2);
    }

    public final c.e.a.b.g.h<com.google.firebase.auth.i> d(c.e.b.d dVar, com.google.firebase.auth.z zVar, String str, com.google.firebase.auth.internal.w wVar) {
        com.google.android.gms.common.internal.s.a(dVar);
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(zVar);
        com.google.android.gms.common.internal.s.a(wVar);
        List<String> f2 = zVar.f();
        if ((f2 == null || f2.contains(str)) && !zVar.u()) {
            char c2 = 65535;
            if (str.hashCode() == 1216985755 && str.equals("password")) {
                c2 = 0;
            }
            if (c2 != 0) {
                i1 i1Var = new i1(str);
                i1Var.a(dVar);
                i1Var.a(zVar);
                i1Var.a((i1) wVar);
                i1Var.a((com.google.firebase.auth.internal.j) wVar);
                i1 i1Var2 = i1Var;
                return a((c.e.a.b.g.h) b(i1Var2), (e) i1Var2);
            }
            g1 g1Var = new g1();
            g1Var.a(dVar);
            g1Var.a(zVar);
            g1Var.a((g1) wVar);
            g1Var.a((com.google.firebase.auth.internal.j) wVar);
            g1 g1Var2 = g1Var;
            return a((c.e.a.b.g.h) b(g1Var2), (e) g1Var2);
        }
        return c.e.a.b.g.k.a((Exception) a2.a(new Status(17016, str)));
    }

    public final c.e.a.b.g.h<String> d(c.e.b.d dVar, String str, String str2) {
        u1 u1Var = new u1(str, str2);
        u1Var.a(dVar);
        u1 u1Var2 = u1Var;
        return a((c.e.a.b.g.h) b(u1Var2), (e) u1Var2);
    }
}
