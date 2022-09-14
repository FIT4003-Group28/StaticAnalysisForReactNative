package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import java.util.Set;
/* loaded from: classes.dex */
public final class i0 extends c.e.a.b.e.b.e implements f.a, f.b {

    /* renamed from: h  reason: collision with root package name */
    private static a.AbstractC0144a<? extends c.e.a.b.e.e, c.e.a.b.e.a> f6891h = c.e.a.b.e.d.f4587c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6892a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f6893b;

    /* renamed from: c  reason: collision with root package name */
    private final a.AbstractC0144a<? extends c.e.a.b.e.e, c.e.a.b.e.a> f6894c;

    /* renamed from: d  reason: collision with root package name */
    private Set<Scope> f6895d;

    /* renamed from: e  reason: collision with root package name */
    private com.google.android.gms.common.internal.d f6896e;

    /* renamed from: f  reason: collision with root package name */
    private c.e.a.b.e.e f6897f;

    /* renamed from: g  reason: collision with root package name */
    private j0 f6898g;

    public i0(Context context, Handler handler, com.google.android.gms.common.internal.d dVar) {
        this(context, handler, dVar, f6891h);
    }

    public i0(Context context, Handler handler, com.google.android.gms.common.internal.d dVar, a.AbstractC0144a<? extends c.e.a.b.e.e, c.e.a.b.e.a> abstractC0144a) {
        this.f6892a = context;
        this.f6893b = handler;
        com.google.android.gms.common.internal.s.a(dVar, "ClientSettings must not be null");
        this.f6896e = dVar;
        this.f6895d = dVar.g();
        this.f6894c = abstractC0144a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(c.e.a.b.e.b.l lVar) {
        com.google.android.gms.common.b q = lVar.q();
        if (q.u()) {
            com.google.android.gms.common.internal.u r = lVar.r();
            q = r.r();
            if (q.u()) {
                this.f6898g.a(r.q(), this.f6895d);
                this.f6897f.i();
            }
            String valueOf = String.valueOf(q);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("Sign-in succeeded with resolve account failure: ");
            sb.append(valueOf);
            Log.wtf("SignInCoordinator", sb.toString(), new Exception());
        }
        this.f6898g.b(q);
        this.f6897f.i();
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void a(int i) {
        this.f6897f.i();
    }

    @Override // c.e.a.b.e.b.d
    public final void a(c.e.a.b.e.b.l lVar) {
        this.f6893b.post(new k0(this, lVar));
    }

    public final void a(j0 j0Var) {
        c.e.a.b.e.e eVar = this.f6897f;
        if (eVar != null) {
            eVar.i();
        }
        this.f6896e.a(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0144a<? extends c.e.a.b.e.e, c.e.a.b.e.a> abstractC0144a = this.f6894c;
        Context context = this.f6892a;
        Looper looper = this.f6893b.getLooper();
        com.google.android.gms.common.internal.d dVar = this.f6896e;
        this.f6897f = abstractC0144a.a(context, looper, dVar, (com.google.android.gms.common.internal.d) dVar.h(), (f.a) this, (f.b) this);
        this.f6898g = j0Var;
        Set<Scope> set = this.f6895d;
        if (set == null || set.isEmpty()) {
            this.f6893b.post(new h0(this));
        } else {
            this.f6897f.k();
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void a(com.google.android.gms.common.b bVar) {
        this.f6898g.b(bVar);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void b(Bundle bundle) {
        this.f6897f.a(this);
    }

    public final void e() {
        c.e.a.b.e.e eVar = this.f6897f;
        if (eVar != null) {
            eVar.i();
        }
    }
}
