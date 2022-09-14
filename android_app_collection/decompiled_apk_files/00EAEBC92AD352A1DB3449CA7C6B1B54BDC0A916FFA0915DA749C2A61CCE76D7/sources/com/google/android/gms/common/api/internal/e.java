package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class e implements Handler.Callback {
    public static final Status n = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status o = new Status(4, "The user must be signed in to make this API call.");
    private static final Object p = new Object();
    private static e q;

    /* renamed from: d  reason: collision with root package name */
    private final Context f6856d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.gms.common.e f6857e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.android.gms.common.internal.l f6858f;
    private final Handler m;

    /* renamed from: a  reason: collision with root package name */
    private long f6853a = 5000;

    /* renamed from: b  reason: collision with root package name */
    private long f6854b = 120000;

    /* renamed from: c  reason: collision with root package name */
    private long f6855c = 10000;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicInteger f6859g = new AtomicInteger(1);

    /* renamed from: h  reason: collision with root package name */
    private final AtomicInteger f6860h = new AtomicInteger(0);
    private final Map<com.google.android.gms.common.api.internal.b<?>, a<?>> i = new ConcurrentHashMap(5, 0.75f, 1);
    private q j = null;
    private final Set<com.google.android.gms.common.api.internal.b<?>> k = new a.e.b();
    private final Set<com.google.android.gms.common.api.internal.b<?>> l = new a.e.b();

    /* loaded from: classes.dex */
    public class a<O extends a.d> implements f.a, f.b, y0 {

        /* renamed from: b  reason: collision with root package name */
        private final a.f f6862b;

        /* renamed from: c  reason: collision with root package name */
        private final a.b f6863c;

        /* renamed from: d  reason: collision with root package name */
        private final com.google.android.gms.common.api.internal.b<O> f6864d;

        /* renamed from: e  reason: collision with root package name */
        private final z0 f6865e;

        /* renamed from: h  reason: collision with root package name */
        private final int f6868h;
        private final i0 i;
        private boolean j;

        /* renamed from: a  reason: collision with root package name */
        private final Queue<g0> f6861a = new LinkedList();

        /* renamed from: f  reason: collision with root package name */
        private final Set<s0> f6866f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        private final Map<i<?>, f0> f6867g = new HashMap();
        private final List<c> k = new ArrayList();
        private com.google.android.gms.common.b l = null;

        public a(com.google.android.gms.common.api.e<O> eVar) {
            this.f6862b = eVar.a(e.this.m.getLooper(), this);
            a.b bVar = this.f6862b;
            this.f6863c = bVar instanceof com.google.android.gms.common.internal.v ? ((com.google.android.gms.common.internal.v) bVar).A() : bVar;
            this.f6864d = eVar.b();
            this.f6865e = new z0();
            this.f6868h = eVar.d();
            if (this.f6862b.j()) {
                this.i = eVar.a(e.this.f6856d, e.this.m);
            } else {
                this.i = null;
            }
        }

        private final com.google.android.gms.common.d a(com.google.android.gms.common.d[] dVarArr) {
            if (dVarArr != null && dVarArr.length != 0) {
                com.google.android.gms.common.d[] g2 = this.f6862b.g();
                if (g2 == null) {
                    g2 = new com.google.android.gms.common.d[0];
                }
                a.e.a aVar = new a.e.a(g2.length);
                for (com.google.android.gms.common.d dVar : g2) {
                    aVar.put(dVar.q(), Long.valueOf(dVar.r()));
                }
                for (com.google.android.gms.common.d dVar2 : dVarArr) {
                    if (!aVar.containsKey(dVar2.q()) || ((Long) aVar.get(dVar2.q())).longValue() < dVar2.r()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(c cVar) {
            if (this.k.contains(cVar) && !this.j) {
                if (!this.f6862b.a()) {
                    a();
                } else {
                    o();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a(boolean z) {
            com.google.android.gms.common.internal.s.a(e.this.m);
            if (!this.f6862b.a() || this.f6867g.size() != 0) {
                return false;
            }
            if (!this.f6865e.a()) {
                this.f6862b.i();
                return true;
            }
            if (z) {
                q();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(c cVar) {
            com.google.android.gms.common.d[] b2;
            if (this.k.remove(cVar)) {
                e.this.m.removeMessages(15, cVar);
                e.this.m.removeMessages(16, cVar);
                com.google.android.gms.common.d dVar = cVar.f6876b;
                ArrayList arrayList = new ArrayList(this.f6861a.size());
                for (g0 g0Var : this.f6861a) {
                    if ((g0Var instanceof t) && (b2 = ((t) g0Var).b((a<?>) this)) != null && com.google.android.gms.common.util.b.a(b2, dVar)) {
                        arrayList.add(g0Var);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    g0 g0Var2 = (g0) obj;
                    this.f6861a.remove(g0Var2);
                    g0Var2.a(new com.google.android.gms.common.api.m(dVar));
                }
            }
        }

        private final boolean b(g0 g0Var) {
            if (!(g0Var instanceof t)) {
                c(g0Var);
                return true;
            }
            t tVar = (t) g0Var;
            com.google.android.gms.common.d a2 = a(tVar.b((a<?>) this));
            if (a2 == null) {
                c(g0Var);
                return true;
            } else if (!tVar.c(this)) {
                tVar.a(new com.google.android.gms.common.api.m(a2));
                return false;
            } else {
                c cVar = new c(this.f6864d, a2, null);
                int indexOf = this.k.indexOf(cVar);
                if (indexOf >= 0) {
                    c cVar2 = this.k.get(indexOf);
                    e.this.m.removeMessages(15, cVar2);
                    e.this.m.sendMessageDelayed(Message.obtain(e.this.m, 15, cVar2), e.this.f6853a);
                    return false;
                }
                this.k.add(cVar);
                e.this.m.sendMessageDelayed(Message.obtain(e.this.m, 15, cVar), e.this.f6853a);
                e.this.m.sendMessageDelayed(Message.obtain(e.this.m, 16, cVar), e.this.f6854b);
                com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(2, null);
                if (c(bVar)) {
                    return false;
                }
                e.this.b(bVar, this.f6868h);
                return false;
            }
        }

        private final void c(g0 g0Var) {
            g0Var.a(this.f6865e, d());
            try {
                g0Var.a((a<?>) this);
            } catch (DeadObjectException unused) {
                a(1);
                this.f6862b.i();
            }
        }

        private final boolean c(com.google.android.gms.common.b bVar) {
            synchronized (e.p) {
                if (e.this.j == null || !e.this.k.contains(this.f6864d)) {
                    return false;
                }
                e.this.j.b(bVar, this.f6868h);
                return true;
            }
        }

        private final void d(com.google.android.gms.common.b bVar) {
            for (s0 s0Var : this.f6866f) {
                String str = null;
                if (com.google.android.gms.common.internal.r.a(bVar, com.google.android.gms.common.b.f6940f)) {
                    str = this.f6862b.h();
                }
                s0Var.a(this.f6864d, bVar, str);
            }
            this.f6866f.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m() {
            j();
            d(com.google.android.gms.common.b.f6940f);
            p();
            Iterator<f0> it = this.f6867g.values().iterator();
            while (it.hasNext()) {
                f0 next = it.next();
                if (a(next.f6885a.b()) == null) {
                    try {
                        next.f6885a.a(this.f6863c, new c.e.a.b.g.i<>());
                    } catch (DeadObjectException unused) {
                        a(1);
                        this.f6862b.i();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            o();
            q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n() {
            j();
            this.j = true;
            this.f6865e.c();
            e.this.m.sendMessageDelayed(Message.obtain(e.this.m, 9, this.f6864d), e.this.f6853a);
            e.this.m.sendMessageDelayed(Message.obtain(e.this.m, 11, this.f6864d), e.this.f6854b);
            e.this.f6858f.a();
        }

        private final void o() {
            ArrayList arrayList = new ArrayList(this.f6861a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                g0 g0Var = (g0) obj;
                if (!this.f6862b.a()) {
                    return;
                }
                if (b(g0Var)) {
                    this.f6861a.remove(g0Var);
                }
            }
        }

        private final void p() {
            if (this.j) {
                e.this.m.removeMessages(11, this.f6864d);
                e.this.m.removeMessages(9, this.f6864d);
                this.j = false;
            }
        }

        private final void q() {
            e.this.m.removeMessages(12, this.f6864d);
            e.this.m.sendMessageDelayed(e.this.m.obtainMessage(12, this.f6864d), e.this.f6855c);
        }

        public final void a() {
            com.google.android.gms.common.internal.s.a(e.this.m);
            if (this.f6862b.a() || this.f6862b.e()) {
                return;
            }
            int a2 = e.this.f6858f.a(e.this.f6856d, this.f6862b);
            if (a2 != 0) {
                a(new com.google.android.gms.common.b(a2, null));
                return;
            }
            b bVar = new b(this.f6862b, this.f6864d);
            if (this.f6862b.j()) {
                this.i.a(bVar);
            }
            this.f6862b.a(bVar);
        }

        @Override // com.google.android.gms.common.api.internal.d
        public final void a(int i) {
            if (Looper.myLooper() == e.this.m.getLooper()) {
                n();
            } else {
                e.this.m.post(new w(this));
            }
        }

        public final void a(Status status) {
            com.google.android.gms.common.internal.s.a(e.this.m);
            for (g0 g0Var : this.f6861a) {
                g0Var.a(status);
            }
            this.f6861a.clear();
        }

        public final void a(g0 g0Var) {
            com.google.android.gms.common.internal.s.a(e.this.m);
            if (this.f6862b.a()) {
                if (b(g0Var)) {
                    q();
                    return;
                } else {
                    this.f6861a.add(g0Var);
                    return;
                }
            }
            this.f6861a.add(g0Var);
            com.google.android.gms.common.b bVar = this.l;
            if (bVar == null || !bVar.t()) {
                a();
            } else {
                a(this.l);
            }
        }

        public final void a(s0 s0Var) {
            com.google.android.gms.common.internal.s.a(e.this.m);
            this.f6866f.add(s0Var);
        }

        @Override // com.google.android.gms.common.api.internal.j
        public final void a(com.google.android.gms.common.b bVar) {
            com.google.android.gms.common.internal.s.a(e.this.m);
            i0 i0Var = this.i;
            if (i0Var != null) {
                i0Var.e();
            }
            j();
            e.this.f6858f.a();
            d(bVar);
            if (bVar.q() == 4) {
                a(e.o);
            } else if (this.f6861a.isEmpty()) {
                this.l = bVar;
            } else if (c(bVar) || e.this.b(bVar, this.f6868h)) {
            } else {
                if (bVar.q() == 18) {
                    this.j = true;
                }
                if (this.j) {
                    e.this.m.sendMessageDelayed(Message.obtain(e.this.m, 9, this.f6864d), e.this.f6853a);
                    return;
                }
                String a2 = this.f6864d.a();
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 63 + String.valueOf(valueOf).length());
                sb.append("API: ");
                sb.append(a2);
                sb.append(" is not available on this device. Connection failed with: ");
                sb.append(valueOf);
                a(new Status(17, sb.toString()));
            }
        }

        public final int b() {
            return this.f6868h;
        }

        @Override // com.google.android.gms.common.api.internal.d
        public final void b(Bundle bundle) {
            if (Looper.myLooper() == e.this.m.getLooper()) {
                m();
            } else {
                e.this.m.post(new v(this));
            }
        }

        public final void b(com.google.android.gms.common.b bVar) {
            com.google.android.gms.common.internal.s.a(e.this.m);
            this.f6862b.i();
            a(bVar);
        }

        final boolean c() {
            return this.f6862b.a();
        }

        public final boolean d() {
            return this.f6862b.j();
        }

        public final void e() {
            com.google.android.gms.common.internal.s.a(e.this.m);
            if (this.j) {
                a();
            }
        }

        public final a.f f() {
            return this.f6862b;
        }

        public final void g() {
            com.google.android.gms.common.internal.s.a(e.this.m);
            if (this.j) {
                p();
                a(e.this.f6857e.b(e.this.f6856d) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f6862b.i();
            }
        }

        public final void h() {
            com.google.android.gms.common.internal.s.a(e.this.m);
            a(e.n);
            this.f6865e.b();
            for (i iVar : (i[]) this.f6867g.keySet().toArray(new i[this.f6867g.size()])) {
                a(new r0(iVar, new c.e.a.b.g.i()));
            }
            d(new com.google.android.gms.common.b(4));
            if (this.f6862b.a()) {
                this.f6862b.a(new y(this));
            }
        }

        public final Map<i<?>, f0> i() {
            return this.f6867g;
        }

        public final void j() {
            com.google.android.gms.common.internal.s.a(e.this.m);
            this.l = null;
        }

        public final com.google.android.gms.common.b k() {
            com.google.android.gms.common.internal.s.a(e.this.m);
            return this.l;
        }

        public final boolean l() {
            return a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements j0, c.InterfaceC0148c {

        /* renamed from: a  reason: collision with root package name */
        private final a.f f6869a;

        /* renamed from: b  reason: collision with root package name */
        private final com.google.android.gms.common.api.internal.b<?> f6870b;

        /* renamed from: c  reason: collision with root package name */
        private com.google.android.gms.common.internal.m f6871c = null;

        /* renamed from: d  reason: collision with root package name */
        private Set<Scope> f6872d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f6873e = false;

        public b(a.f fVar, com.google.android.gms.common.api.internal.b<?> bVar) {
            this.f6869a = fVar;
            this.f6870b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a() {
            com.google.android.gms.common.internal.m mVar;
            if (!this.f6873e || (mVar = this.f6871c) == null) {
                return;
            }
            this.f6869a.a(mVar, this.f6872d);
        }

        @Override // com.google.android.gms.common.internal.c.InterfaceC0148c
        public final void a(com.google.android.gms.common.b bVar) {
            e.this.m.post(new a0(this, bVar));
        }

        @Override // com.google.android.gms.common.api.internal.j0
        public final void a(com.google.android.gms.common.internal.m mVar, Set<Scope> set) {
            if (mVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new com.google.android.gms.common.b(4));
                return;
            }
            this.f6871c = mVar;
            this.f6872d = set;
            a();
        }

        @Override // com.google.android.gms.common.api.internal.j0
        public final void b(com.google.android.gms.common.b bVar) {
            ((a) e.this.i.get(this.f6870b)).b(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.android.gms.common.api.internal.b<?> f6875a;

        /* renamed from: b  reason: collision with root package name */
        private final com.google.android.gms.common.d f6876b;

        private c(com.google.android.gms.common.api.internal.b<?> bVar, com.google.android.gms.common.d dVar) {
            this.f6875a = bVar;
            this.f6876b = dVar;
        }

        /* synthetic */ c(com.google.android.gms.common.api.internal.b bVar, com.google.android.gms.common.d dVar, u uVar) {
            this(bVar, dVar);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                if (com.google.android.gms.common.internal.r.a(this.f6875a, cVar.f6875a) && com.google.android.gms.common.internal.r.a(this.f6876b, cVar.f6876b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.r.a(this.f6875a, this.f6876b);
        }

        public final String toString() {
            r.a a2 = com.google.android.gms.common.internal.r.a(this);
            a2.a("key", this.f6875a);
            a2.a("feature", this.f6876b);
            return a2.toString();
        }
    }

    private e(Context context, Looper looper, com.google.android.gms.common.e eVar) {
        this.f6856d = context;
        this.m = new c.e.a.b.d.b.d(looper, this);
        this.f6857e = eVar;
        this.f6858f = new com.google.android.gms.common.internal.l(eVar);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static e a(Context context) {
        e eVar;
        synchronized (p) {
            if (q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                q = new e(context.getApplicationContext(), handlerThread.getLooper(), com.google.android.gms.common.e.a());
            }
            eVar = q;
        }
        return eVar;
    }

    private final void b(com.google.android.gms.common.api.e<?> eVar) {
        com.google.android.gms.common.api.internal.b<?> b2 = eVar.b();
        a<?> aVar = this.i.get(b2);
        if (aVar == null) {
            aVar = new a<>(eVar);
            this.i.put(b2, aVar);
        }
        if (aVar.d()) {
            this.l.add(b2);
        }
        aVar.a();
    }

    public final int a() {
        return this.f6859g.getAndIncrement();
    }

    public final void a(com.google.android.gms.common.api.e<?> eVar) {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final <O extends a.d, ResultT> void a(com.google.android.gms.common.api.e<O> eVar, int i, n<a.b, ResultT> nVar, c.e.a.b.g.i<ResultT> iVar, m mVar) {
        q0 q0Var = new q0(i, nVar, iVar, mVar);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(4, new e0(q0Var, this.f6860h.get(), eVar)));
    }

    public final void a(com.google.android.gms.common.b bVar, int i) {
        if (!b(bVar, i)) {
            Handler handler = this.m;
            handler.sendMessage(handler.obtainMessage(5, i, 0, bVar));
        }
    }

    public final void b() {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    final boolean b(com.google.android.gms.common.b bVar, int i) {
        return this.f6857e.a(this.f6856d, bVar, i);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a<?> aVar;
        c.e.a.b.g.i<Boolean> b2;
        boolean valueOf;
        int i = message.what;
        long j = 300000;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f6855c = j;
                this.m.removeMessages(12);
                for (com.google.android.gms.common.api.internal.b<?> bVar : this.i.keySet()) {
                    Handler handler = this.m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f6855c);
                }
                break;
            case 2:
                s0 s0Var = (s0) message.obj;
                Iterator<com.google.android.gms.common.api.internal.b<?>> it = s0Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        com.google.android.gms.common.api.internal.b<?> next = it.next();
                        a<?> aVar2 = this.i.get(next);
                        if (aVar2 == null) {
                            s0Var.a(next, new com.google.android.gms.common.b(13), null);
                            break;
                        } else if (aVar2.c()) {
                            s0Var.a(next, com.google.android.gms.common.b.f6940f, aVar2.f().h());
                        } else if (aVar2.k() != null) {
                            s0Var.a(next, aVar2.k(), null);
                        } else {
                            aVar2.a(s0Var);
                            aVar2.a();
                        }
                    }
                }
            case 3:
                for (a<?> aVar3 : this.i.values()) {
                    aVar3.j();
                    aVar3.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                e0 e0Var = (e0) message.obj;
                a<?> aVar4 = this.i.get(e0Var.f6879c.b());
                if (aVar4 == null) {
                    b(e0Var.f6879c);
                    aVar4 = this.i.get(e0Var.f6879c.b());
                }
                if (!aVar4.d() || this.f6860h.get() == e0Var.f6878b) {
                    aVar4.a(e0Var.f6877a);
                    break;
                } else {
                    e0Var.f6877a.a(n);
                    aVar4.h();
                    break;
                }
            case 5:
                int i2 = message.arg1;
                com.google.android.gms.common.b bVar2 = (com.google.android.gms.common.b) message.obj;
                Iterator<a<?>> it2 = this.i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = it2.next();
                        if (aVar.b() == i2) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar != null) {
                    String a2 = this.f6857e.a(bVar2.q());
                    String r = bVar2.r();
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 69 + String.valueOf(r).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(a2);
                    sb.append(": ");
                    sb.append(r);
                    aVar.a(new Status(17, sb.toString()));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (com.google.android.gms.common.util.l.a() && (this.f6856d.getApplicationContext() instanceof Application)) {
                    com.google.android.gms.common.api.internal.c.a((Application) this.f6856d.getApplicationContext());
                    com.google.android.gms.common.api.internal.c.b().a(new u(this));
                    if (!com.google.android.gms.common.api.internal.c.b().a(true)) {
                        this.f6855c = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                b((com.google.android.gms.common.api.e) message.obj);
                break;
            case 9:
                if (this.i.containsKey(message.obj)) {
                    this.i.get(message.obj).e();
                    break;
                }
                break;
            case 10:
                for (com.google.android.gms.common.api.internal.b<?> bVar3 : this.l) {
                    this.i.remove(bVar3).h();
                }
                this.l.clear();
                break;
            case 11:
                if (this.i.containsKey(message.obj)) {
                    this.i.get(message.obj).g();
                    break;
                }
                break;
            case 12:
                if (this.i.containsKey(message.obj)) {
                    this.i.get(message.obj).l();
                    break;
                }
                break;
            case 14:
                r rVar = (r) message.obj;
                com.google.android.gms.common.api.internal.b<?> a3 = rVar.a();
                if (!this.i.containsKey(a3)) {
                    b2 = rVar.b();
                    valueOf = false;
                } else {
                    boolean a4 = this.i.get(a3).a(false);
                    b2 = rVar.b();
                    valueOf = Boolean.valueOf(a4);
                }
                b2.a((c.e.a.b.g.i<Boolean>) valueOf);
                break;
            case 15:
                c cVar = (c) message.obj;
                if (this.i.containsKey(cVar.f6875a)) {
                    this.i.get(cVar.f6875a).a(cVar);
                    break;
                }
                break;
            case 16:
                c cVar2 = (c) message.obj;
                if (this.i.containsKey(cVar2.f6875a)) {
                    this.i.get(cVar2.f6875a).b(cVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
