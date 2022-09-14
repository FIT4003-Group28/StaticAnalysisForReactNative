package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class c<T extends IInterface> {
    private static final com.google.android.gms.common.d[] v = new com.google.android.gms.common.d[0];

    /* renamed from: a  reason: collision with root package name */
    private k0 f6966a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6967b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.gms.common.internal.j f6968c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.gms.common.f f6969d;

    /* renamed from: e  reason: collision with root package name */
    final Handler f6970e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f6971f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f6972g;

    /* renamed from: h  reason: collision with root package name */
    private p f6973h;
    protected InterfaceC0148c i;
    private T j;
    private final ArrayList<h<?>> k;
    private j l;
    private int m;
    private final a n;
    private final b o;
    private final int p;
    private final String q;
    private com.google.android.gms.common.b r;
    private boolean s;
    private volatile e0 t;
    protected AtomicInteger u;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);

        void b(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(com.google.android.gms.common.b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0148c {
        void a(com.google.android.gms.common.b bVar);
    }

    /* loaded from: classes.dex */
    protected class d implements InterfaceC0148c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.c.InterfaceC0148c
        public void a(com.google.android.gms.common.b bVar) {
            if (bVar.u()) {
                c cVar = c.this;
                cVar.a((m) null, cVar.u());
            } else if (c.this.o == null) {
            } else {
                c.this.o.a(bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes.dex */
    private abstract class f extends h<Boolean> {

        /* renamed from: d  reason: collision with root package name */
        private final int f6975d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f6976e;

        protected f(int i, Bundle bundle) {
            super(true);
            this.f6975d = i;
            this.f6976e = bundle;
        }

        protected abstract void a(com.google.android.gms.common.b bVar);

        @Override // com.google.android.gms.common.internal.c.h
        protected final /* synthetic */ void a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                c.this.b(1, null);
                return;
            }
            int i = this.f6975d;
            if (i == 0) {
                if (e()) {
                    return;
                }
                c.this.b(1, null);
                a(new com.google.android.gms.common.b(8, null));
            } else if (i == 10) {
                c.this.b(1, null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), c.this.x(), c.this.w()));
            } else {
                c.this.b(1, null);
                Bundle bundle = this.f6976e;
                if (bundle != null) {
                    pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                }
                a(new com.google.android.gms.common.b(this.f6975d, pendingIntent));
            }
        }

        @Override // com.google.android.gms.common.internal.c.h
        protected final void c() {
        }

        protected abstract boolean e();
    }

    /* loaded from: classes.dex */
    final class g extends c.e.a.b.d.c.d {
        public g(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            h hVar = (h) message.obj;
            hVar.c();
            hVar.b();
        }

        private static boolean b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (c.this.u.get() != message.arg1) {
                if (!b(message)) {
                    return;
                }
                a(message);
                return;
            }
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !c.this.n()) || message.what == 5)) && !c.this.e()) {
                a(message);
                return;
            }
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                c.this.r = new com.google.android.gms.common.b(message.arg2);
                if (c.this.C() && !c.this.s) {
                    c.this.b(3, null);
                    return;
                }
                com.google.android.gms.common.b bVar = c.this.r != null ? c.this.r : new com.google.android.gms.common.b(8);
                c.this.i.a(bVar);
                c.this.a(bVar);
            } else if (i2 == 5) {
                com.google.android.gms.common.b bVar2 = c.this.r != null ? c.this.r : new com.google.android.gms.common.b(8);
                c.this.i.a(bVar2);
                c.this.a(bVar2);
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                com.google.android.gms.common.b bVar3 = new com.google.android.gms.common.b(message.arg2, pendingIntent);
                c.this.i.a(bVar3);
                c.this.a(bVar3);
            } else if (i2 == 6) {
                c.this.b(5, null);
                if (c.this.n != null) {
                    c.this.n.a(message.arg2);
                }
                c.this.a(message.arg2);
                c.this.a(5, 1, (int) null);
            } else if (i2 == 2 && !c.this.a()) {
                a(message);
            } else if (b(message)) {
                ((h) message.obj).d();
            } else {
                int i3 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i3);
                Log.wtf("GmsClient", sb.toString(), new Exception());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public abstract class h<TListener> {

        /* renamed from: a  reason: collision with root package name */
        private TListener f6979a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f6980b = false;

        public h(TListener tlistener) {
            this.f6979a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.f6979a = null;
            }
        }

        protected abstract void a(TListener tlistener);

        public final void b() {
            a();
            synchronized (c.this.k) {
                c.this.k.remove(this);
            }
        }

        protected abstract void c();

        public final void d() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f6979a;
                if (this.f6980b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e2) {
                    c();
                    throw e2;
                }
            } else {
                c();
            }
            synchronized (this) {
                this.f6980b = true;
            }
            b();
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends n.a {

        /* renamed from: a  reason: collision with root package name */
        private c f6982a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6983b;

        public i(c cVar, int i) {
            this.f6982a = cVar;
            this.f6983b = i;
        }

        @Override // com.google.android.gms.common.internal.n
        public final void a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.n
        public final void a(int i, IBinder iBinder, Bundle bundle) {
            s.a(this.f6982a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f6982a.a(i, iBinder, bundle, this.f6983b);
            this.f6982a = null;
        }

        @Override // com.google.android.gms.common.internal.n
        public final void a(int i, IBinder iBinder, e0 e0Var) {
            s.a(this.f6982a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            s.a(e0Var);
            this.f6982a.a(e0Var);
            a(i, iBinder, e0Var.f7007b);
        }
    }

    /* loaded from: classes.dex */
    public final class j implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final int f6984a;

        public j(int i) {
            this.f6984a = i;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p oVar;
            c cVar = c.this;
            if (iBinder == null) {
                cVar.c(16);
                return;
            }
            synchronized (cVar.f6972g) {
                c cVar2 = c.this;
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    oVar = (queryLocalInterface == null || !(queryLocalInterface instanceof p)) ? new o(iBinder) : (p) queryLocalInterface;
                }
                cVar2.f6973h = oVar;
            }
            c.this.a(0, (Bundle) null, this.f6984a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (c.this.f6972g) {
                c.this.f6973h = null;
            }
            Handler handler = c.this.f6970e;
            handler.sendMessage(handler.obtainMessage(6, this.f6984a, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public final class k extends f {

        /* renamed from: g  reason: collision with root package name */
        private final IBinder f6986g;

        public k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f6986g = iBinder;
        }

        @Override // com.google.android.gms.common.internal.c.f
        protected final void a(com.google.android.gms.common.b bVar) {
            if (c.this.o != null) {
                c.this.o.a(bVar);
            }
            c.this.a(bVar);
        }

        @Override // com.google.android.gms.common.internal.c.f
        protected final boolean e() {
            try {
                String interfaceDescriptor = this.f6986g.getInterfaceDescriptor();
                if (!c.this.w().equals(interfaceDescriptor)) {
                    String w = c.this.w();
                    StringBuilder sb = new StringBuilder(String.valueOf(w).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(w);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface a2 = c.this.a(this.f6986g);
                if (a2 == null || (!c.this.a(2, 4, (int) a2) && !c.this.a(3, 4, (int) a2))) {
                    return false;
                }
                c.this.r = null;
                Bundle q = c.this.q();
                if (c.this.n == null) {
                    return true;
                }
                c.this.n.b(q);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public final class l extends f {
        public l(int i, Bundle bundle) {
            super(i, null);
        }

        @Override // com.google.android.gms.common.internal.c.f
        protected final void a(com.google.android.gms.common.b bVar) {
            if (c.this.n() && c.this.C()) {
                c.this.c(16);
                return;
            }
            c.this.i.a(bVar);
            c.this.a(bVar);
        }

        @Override // com.google.android.gms.common.internal.c.f
        protected final boolean e() {
            c.this.i.a(com.google.android.gms.common.b.f6940f);
            return true;
        }
    }

    static {
        new String[]{"service_esmobile", "service_googleme"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.c.a r13, com.google.android.gms.common.internal.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.j.a(r10)
            com.google.android.gms.common.f r4 = com.google.android.gms.common.f.a()
            com.google.android.gms.common.internal.s.a(r13)
            r6 = r13
            com.google.android.gms.common.internal.c$a r6 = (com.google.android.gms.common.internal.c.a) r6
            com.google.android.gms.common.internal.s.a(r14)
            r7 = r14
            com.google.android.gms.common.internal.c$b r7 = (com.google.android.gms.common.internal.c.b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context, Looper looper, com.google.android.gms.common.internal.j jVar, com.google.android.gms.common.f fVar, int i2, a aVar, b bVar, String str) {
        this.f6971f = new Object();
        this.f6972g = new Object();
        this.k = new ArrayList<>();
        this.m = 1;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = new AtomicInteger(0);
        s.a(context, "Context must not be null");
        this.f6967b = context;
        s.a(looper, "Looper must not be null");
        s.a(jVar, "Supervisor must not be null");
        this.f6968c = jVar;
        s.a(fVar, "API availability must not be null");
        this.f6969d = fVar;
        this.f6970e = new g(looper);
        this.p = i2;
        this.n = aVar;
        this.o = bVar;
        this.q = str;
    }

    private final String A() {
        String str = this.q;
        return str == null ? this.f6967b.getClass().getName() : str;
    }

    private final boolean B() {
        boolean z;
        synchronized (this.f6971f) {
            z = this.m == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C() {
        if (!this.s && !TextUtils.isEmpty(w()) && !TextUtils.isEmpty(t())) {
            try {
                Class.forName(w());
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(e0 e0Var) {
        this.t = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(int i2, int i3, T t) {
        synchronized (this.f6971f) {
            if (this.m != i2) {
                return false;
            }
            b(i3, t);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i2, T t) {
        s.a((i2 == 4) == (t != null));
        synchronized (this.f6971f) {
            this.m = i2;
            this.j = t;
            a(i2, (int) t);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (this.l != null && this.f6966a != null) {
                        String c2 = this.f6966a.c();
                        String a2 = this.f6966a.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(a2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c2);
                        sb.append(" on ");
                        sb.append(a2);
                        Log.e("GmsClient", sb.toString());
                        this.f6968c.a(this.f6966a.c(), this.f6966a.a(), this.f6966a.b(), this.l, A());
                        this.u.incrementAndGet();
                    }
                    this.l = new j(this.u.get());
                    this.f6966a = (this.m != 3 || t() == null) ? new k0(y(), x(), false, 129) : new k0(r().getPackageName(), t(), true, 129);
                    if (!this.f6968c.a(new j.a(this.f6966a.c(), this.f6966a.a(), this.f6966a.b()), this.l, A())) {
                        String c3 = this.f6966a.c();
                        String a3 = this.f6966a.a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c3).length() + 34 + String.valueOf(a3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c3);
                        sb2.append(" on ");
                        sb2.append(a3);
                        Log.e("GmsClient", sb2.toString());
                        a(16, (Bundle) null, this.u.get());
                    }
                } else if (i2 == 4) {
                    a((c<T>) t);
                }
            } else if (this.l != null) {
                this.f6968c.a(this.f6966a.c(), this.f6966a.a(), this.f6966a.b(), this.l, A());
                this.l = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i2) {
        int i3;
        if (B()) {
            i3 = 5;
            this.s = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.f6970e;
        handler.sendMessage(handler.obtainMessage(i3, this.u.get(), 16));
    }

    protected abstract T a(IBinder iBinder);

    protected void a(int i2) {
        System.currentTimeMillis();
    }

    protected final void a(int i2, Bundle bundle, int i3) {
        Handler handler = this.f6970e;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new l(i2, null)));
    }

    protected void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.f6970e;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new k(i2, iBinder, bundle)));
    }

    void a(int i2, T t) {
    }

    protected void a(T t) {
        System.currentTimeMillis();
    }

    protected void a(com.google.android.gms.common.b bVar) {
        bVar.q();
        System.currentTimeMillis();
    }

    public void a(InterfaceC0148c interfaceC0148c) {
        s.a(interfaceC0148c, "Connection progress callbacks cannot be null.");
        this.i = interfaceC0148c;
        b(2, null);
    }

    protected void a(InterfaceC0148c interfaceC0148c, int i2, PendingIntent pendingIntent) {
        s.a(interfaceC0148c, "Connection progress callbacks cannot be null.");
        this.i = interfaceC0148c;
        Handler handler = this.f6970e;
        handler.sendMessage(handler.obtainMessage(3, this.u.get(), i2, pendingIntent));
    }

    public void a(e eVar) {
        eVar.a();
    }

    public void a(m mVar, Set<Scope> set) {
        Bundle s = s();
        com.google.android.gms.common.internal.g gVar = new com.google.android.gms.common.internal.g(this.p);
        gVar.f7012e = this.f6967b.getPackageName();
        gVar.f7015h = s;
        if (set != null) {
            gVar.f7014g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (j()) {
            gVar.i = o() != null ? o() : new Account("<<default account>>", "com.google");
            if (mVar != null) {
                gVar.f7013f = mVar.asBinder();
            }
        } else if (z()) {
            gVar.i = o();
        }
        gVar.j = v;
        gVar.k = p();
        try {
            synchronized (this.f6972g) {
                if (this.f6973h != null) {
                    this.f6973h.a(new i(this, this.u.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            b(1);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            a(8, (IBinder) null, (Bundle) null, this.u.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            a(8, (IBinder) null, (Bundle) null, this.u.get());
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.f6971f) {
            z = this.m == 4;
        }
        return z;
    }

    public void b(int i2) {
        Handler handler = this.f6970e;
        handler.sendMessage(handler.obtainMessage(6, this.u.get(), i2));
    }

    public boolean c() {
        return true;
    }

    public int d() {
        return com.google.android.gms.common.f.f6957a;
    }

    public boolean e() {
        boolean z;
        synchronized (this.f6971f) {
            if (this.m != 2 && this.m != 3) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public final com.google.android.gms.common.d[] g() {
        e0 e0Var = this.t;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f7008c;
    }

    public String h() {
        k0 k0Var;
        if (!a() || (k0Var = this.f6966a) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return k0Var.a();
    }

    public void i() {
        this.u.incrementAndGet();
        synchronized (this.k) {
            int size = this.k.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.k.get(i2).a();
            }
            this.k.clear();
        }
        synchronized (this.f6972g) {
            this.f6973h = null;
        }
        b(1, null);
    }

    public boolean j() {
        return false;
    }

    public void l() {
        int a2 = this.f6969d.a(this.f6967b, d());
        if (a2 == 0) {
            a(new d());
            return;
        }
        b(1, null);
        a(new d(), a2, (PendingIntent) null);
    }

    protected final void m() {
        if (a()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    protected boolean n() {
        return false;
    }

    public Account o() {
        return null;
    }

    public com.google.android.gms.common.d[] p() {
        return v;
    }

    public Bundle q() {
        return null;
    }

    public final Context r() {
        return this.f6967b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle s() {
        return new Bundle();
    }

    protected String t() {
        return null;
    }

    protected Set<Scope> u() {
        return Collections.EMPTY_SET;
    }

    public final T v() {
        T t;
        synchronized (this.f6971f) {
            if (this.m == 5) {
                throw new DeadObjectException();
            }
            m();
            s.b(this.j != null, "Client is connected but service is null");
            t = this.j;
        }
        return t;
    }

    protected abstract String w();

    protected abstract String x();

    protected String y() {
        return "com.google.android.gms";
    }

    public boolean z() {
        return false;
    }
}
