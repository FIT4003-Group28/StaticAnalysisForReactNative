package com.google.firebase.auth.v0.a;

import android.app.Activity;
import c.e.a.b.d.e.f3;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.firebase.auth.n0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n2<ResultT, CallbackT> implements e<z1, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    protected final int f8485a;

    /* renamed from: c  reason: collision with root package name */
    protected c.e.b.d f8487c;

    /* renamed from: d  reason: collision with root package name */
    protected com.google.firebase.auth.z f8488d;

    /* renamed from: e  reason: collision with root package name */
    protected CallbackT f8489e;

    /* renamed from: f  reason: collision with root package name */
    protected com.google.firebase.auth.internal.j f8490f;

    /* renamed from: g  reason: collision with root package name */
    protected o2<ResultT> f8491g;
    protected Executor i;
    protected c.e.a.b.d.e.y2 j;
    protected c.e.a.b.d.e.u2 k;
    protected c.e.a.b.d.e.s2 l;
    protected f3 m;
    protected String n;
    protected String o;
    protected com.google.firebase.auth.h p;
    protected String q;
    protected String r;
    protected c.e.a.b.d.e.p2 s;
    protected boolean t;
    protected boolean u;
    private boolean v;
    boolean w;

    /* renamed from: b  reason: collision with root package name */
    final p2 f8486b = new p2(this);

    /* renamed from: h  reason: collision with root package name */
    protected final List<n0.b> f8492h = new ArrayList();

    /* loaded from: classes.dex */
    static class a extends LifecycleCallback {

        /* renamed from: c  reason: collision with root package name */
        private final List<n0.b> f8493c;

        private a(com.google.android.gms.common.api.internal.h hVar, List<n0.b> list) {
            super(hVar);
            this.f6828b.a("PhoneAuthActivityStopCallback", this);
            this.f8493c = list;
        }

        public static void a(Activity activity, List<n0.b> list) {
            com.google.android.gms.common.api.internal.h a2 = LifecycleCallback.a(activity);
            if (((a) a2.a("PhoneAuthActivityStopCallback", a.class)) == null) {
                new a(a2, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void e() {
            synchronized (this.f8493c) {
                this.f8493c.clear();
            }
        }
    }

    public n2(int i) {
        this.f8485a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        a();
        com.google.android.gms.common.internal.s.b(this.v, "no success or failure set on method implementation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Status status) {
        com.google.firebase.auth.internal.j jVar = this.f8490f;
        if (jVar != null) {
            jVar.a(status);
        }
    }

    public final n2<ResultT, CallbackT> a(c.e.b.d dVar) {
        com.google.android.gms.common.internal.s.a(dVar, "firebaseApp cannot be null");
        this.f8487c = dVar;
        return this;
    }

    public final n2<ResultT, CallbackT> a(com.google.firebase.auth.internal.j jVar) {
        com.google.android.gms.common.internal.s.a(jVar, "external failure callback cannot be null");
        this.f8490f = jVar;
        return this;
    }

    public final n2<ResultT, CallbackT> a(n0.b bVar, Activity activity, Executor executor) {
        synchronized (this.f8492h) {
            List<n0.b> list = this.f8492h;
            com.google.android.gms.common.internal.s.a(bVar);
            list.add(bVar);
        }
        if (activity != null) {
            a.a(activity, this.f8492h);
        }
        com.google.android.gms.common.internal.s.a(executor);
        this.i = executor;
        return this;
    }

    public final n2<ResultT, CallbackT> a(com.google.firebase.auth.z zVar) {
        com.google.android.gms.common.internal.s.a(zVar, "firebaseUser cannot be null");
        this.f8488d = zVar;
        return this;
    }

    public final n2<ResultT, CallbackT> a(CallbackT callbackt) {
        com.google.android.gms.common.internal.s.a(callbackt, "external callback cannot be null");
        this.f8489e = callbackt;
        return this;
    }

    public abstract void a();

    public final void a(Status status) {
        this.v = true;
        this.f8491g.a(null, status);
    }

    public final void b(ResultT resultt) {
        this.v = true;
        this.f8491g.a(resultt, null);
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final e<z1, ResultT> k() {
        this.u = true;
        return this;
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final e<z1, ResultT> l() {
        this.t = true;
        return this;
    }
}
