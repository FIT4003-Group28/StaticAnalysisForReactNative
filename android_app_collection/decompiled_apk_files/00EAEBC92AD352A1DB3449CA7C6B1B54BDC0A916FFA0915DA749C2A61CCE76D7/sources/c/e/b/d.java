package c.e.b;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.m;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.l;
import com.google.firebase.components.s;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class d {
    private static final Object j = new Object();
    private static final Executor k = new ExecutorC0106d();
    static final Map<String, d> l = new a.e.a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f4818a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4819b;

    /* renamed from: c  reason: collision with root package name */
    private final i f4820c;

    /* renamed from: d  reason: collision with root package name */
    private final l f4821d;

    /* renamed from: g  reason: collision with root package name */
    private final s<c.e.b.o.a> f4824g;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f4822e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f4823f = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private final List<b> f4825h = new CopyOnWriteArrayList();
    private final List<c.e.b.e> i = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* loaded from: classes.dex */
    public static class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<c> f4826a = new AtomicReference<>();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (!com.google.android.gms.common.util.l.a() || !(context.getApplicationContext() instanceof Application)) {
                return;
            }
            Application application = (Application) context.getApplicationContext();
            if (f4826a.get() != null) {
                return;
            }
            c cVar = new c();
            if (!f4826a.compareAndSet(null, cVar)) {
                return;
            }
            com.google.android.gms.common.api.internal.c.a(application);
            com.google.android.gms.common.api.internal.c.b().a(cVar);
        }

        @Override // com.google.android.gms.common.api.internal.c.a
        public void a(boolean z) {
            synchronized (d.j) {
                Iterator it = new ArrayList(d.l.values()).iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f4822e.get()) {
                        dVar.c(z);
                    }
                }
            }
        }
    }

    /* renamed from: c.e.b.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class ExecutorC0106d implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private static final Handler f4827a = new Handler(Looper.getMainLooper());

        private ExecutorC0106d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f4827a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(24)
    /* loaded from: classes.dex */
    public static class e extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<e> f4828b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        private final Context f4829a;

        public e(Context context) {
            this.f4829a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f4828b.get() == null) {
                e eVar = new e(context);
                if (!f4828b.compareAndSet(null, eVar)) {
                    return;
                }
                context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }

        public void a() {
            this.f4829a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (d.j) {
                for (d dVar : d.l.values()) {
                    dVar.l();
                }
            }
            a();
        }
    }

    protected d(Context context, String str, i iVar) {
        com.google.android.gms.common.internal.s.a(context);
        this.f4818a = context;
        com.google.android.gms.common.internal.s.b(str);
        this.f4819b = str;
        com.google.android.gms.common.internal.s.a(iVar);
        this.f4820c = iVar;
        List<com.google.firebase.components.h> a2 = com.google.firebase.components.f.a(context, ComponentDiscoveryService.class).a();
        String a3 = c.e.b.p.e.a();
        Executor executor = k;
        com.google.firebase.components.d[] dVarArr = new com.google.firebase.components.d[8];
        dVarArr[0] = com.google.firebase.components.d.a(context, Context.class, new Class[0]);
        dVarArr[1] = com.google.firebase.components.d.a(this, d.class, new Class[0]);
        dVarArr[2] = com.google.firebase.components.d.a(iVar, i.class, new Class[0]);
        dVarArr[3] = c.e.b.p.g.a("fire-android", "");
        dVarArr[4] = c.e.b.p.g.a("fire-core", "19.3.0");
        dVarArr[5] = a3 != null ? c.e.b.p.g.a("kotlin", a3) : null;
        dVarArr[6] = c.e.b.p.c.b();
        dVarArr[7] = c.e.b.m.b.a();
        this.f4821d = new l(executor, a2, dVarArr);
        this.f4824g = new s<>(c.e.b.c.a(this, context));
    }

    public static d a(Context context, i iVar) {
        return a(context, iVar, "[DEFAULT]");
    }

    public static d a(Context context, i iVar, String str) {
        d dVar;
        c.b(context);
        String b2 = b(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            boolean z = !l.containsKey(b2);
            com.google.android.gms.common.internal.s.b(z, "FirebaseApp name " + b2 + " already exists!");
            com.google.android.gms.common.internal.s.a(context, "Application context cannot be null.");
            dVar = new d(context, b2, iVar);
            l.put(b2, dVar);
        }
        dVar.l();
        return dVar;
    }

    public static d a(String str) {
        d dVar;
        List<String> j2;
        String str2;
        synchronized (j) {
            dVar = l.get(b(str));
            if (dVar == null) {
                if (j().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", j2);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ c.e.b.o.a a(d dVar, Context context) {
        return new c.e.b.o.a(context, dVar.e(), (c.e.b.l.c) dVar.f4821d.a(c.e.b.l.c.class));
    }

    public static List<d> a(Context context) {
        ArrayList arrayList;
        synchronized (j) {
            arrayList = new ArrayList(l.values());
        }
        return arrayList;
    }

    public static d b(Context context) {
        synchronized (j) {
            if (l.containsKey("[DEFAULT]")) {
                return k();
            }
            i a2 = i.a(context);
            if (a2 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return a(context, a2);
        }
    }

    private static String b(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b bVar : this.f4825h) {
            bVar.a(z);
        }
    }

    private void i() {
        com.google.android.gms.common.internal.s.b(!this.f4823f.get(), "FirebaseApp was deleted");
    }

    private static List<String> j() {
        ArrayList arrayList = new ArrayList();
        synchronized (j) {
            for (d dVar : l.values()) {
                arrayList.add(dVar.c());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d k() {
        d dVar;
        synchronized (j) {
            dVar = l.get("[DEFAULT]");
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + m.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!a.g.j.e.a(this.f4818a)) {
            e.b(this.f4818a);
        } else {
            this.f4821d.a(g());
        }
    }

    private void m() {
        for (c.e.b.e eVar : this.i) {
            eVar.a(this.f4819b, this.f4820c);
        }
    }

    public <T> T a(Class<T> cls) {
        i();
        return (T) this.f4821d.a(cls);
    }

    public void a() {
        if (!this.f4823f.compareAndSet(false, true)) {
            return;
        }
        synchronized (j) {
            l.remove(this.f4819b);
        }
        m();
    }

    public void a(boolean z) {
        boolean z2;
        i();
        if (this.f4822e.compareAndSet(!z, z)) {
            boolean a2 = com.google.android.gms.common.api.internal.c.b().a();
            if (z && a2) {
                z2 = true;
            } else if (z || !a2) {
                return;
            } else {
                z2 = false;
            }
            c(z2);
        }
    }

    public Context b() {
        i();
        return this.f4818a;
    }

    public void b(boolean z) {
        i();
        this.f4824g.get().a(z);
    }

    public String c() {
        i();
        return this.f4819b;
    }

    public i d() {
        i();
        return this.f4820c;
    }

    public String e() {
        return com.google.android.gms.common.util.c.b(c().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.b(d().b().getBytes(Charset.defaultCharset()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return this.f4819b.equals(((d) obj).c());
    }

    public boolean f() {
        i();
        return this.f4824g.get().a();
    }

    public boolean g() {
        return "[DEFAULT]".equals(c());
    }

    public int hashCode() {
        return this.f4819b.hashCode();
    }

    public String toString() {
        r.a a2 = r.a(this);
        a2.a("name", this.f4819b);
        a2.a("options", this.f4820c);
        return a2.toString();
    }
}
