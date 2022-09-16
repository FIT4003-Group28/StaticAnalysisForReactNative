package b.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import b.a.a.a.a;
import b.a.a.a.a.b.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: Fabric.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    static volatile c f1251a;

    /* renamed from: b  reason: collision with root package name */
    static final l f1252b = new b();

    /* renamed from: c  reason: collision with root package name */
    final l f1253c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f1254d;
    private final Context e;
    private final Map<Class<? extends i>, i> f;
    private final ExecutorService g;
    private final Handler h;
    private final f<c> i;
    private final f<?> j;
    private final p k;
    private b.a.a.a.a l;
    private WeakReference<Activity> m;
    private AtomicBoolean n = new AtomicBoolean(false);

    public String c() {
        return "1.4.3.25";
    }

    public String d() {
        return "io.fabric.sdk.android:fabric";
    }

    /* compiled from: Fabric.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f1259a;

        /* renamed from: b  reason: collision with root package name */
        private i[] f1260b;

        /* renamed from: c  reason: collision with root package name */
        private b.a.a.a.a.c.k f1261c;

        /* renamed from: d  reason: collision with root package name */
        private Handler f1262d;
        private l e;
        private boolean f;
        private String g;
        private String h;
        private f<c> i;

        public a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f1259a = context;
        }

        public a a(i... iVarArr) {
            if (this.f1260b != null) {
                throw new IllegalStateException("Kits already set.");
            }
            this.f1260b = iVarArr;
            return this;
        }

        public c a() {
            Map b2;
            if (this.f1261c == null) {
                this.f1261c = b.a.a.a.a.c.k.a();
            }
            if (this.f1262d == null) {
                this.f1262d = new Handler(Looper.getMainLooper());
            }
            if (this.e == null) {
                if (this.f) {
                    this.e = new b(3);
                } else {
                    this.e = new b();
                }
            }
            if (this.h == null) {
                this.h = this.f1259a.getPackageName();
            }
            if (this.i == null) {
                this.i = f.f1266d;
            }
            if (this.f1260b != null) {
                b2 = c.b(Arrays.asList(this.f1260b));
            } else {
                b2 = new HashMap();
            }
            Map map = b2;
            Context applicationContext = this.f1259a.getApplicationContext();
            return new c(applicationContext, map, this.f1261c, this.f1262d, this.e, this.f, this.i, new p(applicationContext, this.h, this.g, map.values()), c.d(this.f1259a));
        }
    }

    static c a() {
        if (f1251a == null) {
            throw new IllegalStateException("Must Initialize Fabric before using singleton()");
        }
        return f1251a;
    }

    c(Context context, Map<Class<? extends i>, i> map, b.a.a.a.a.c.k kVar, Handler handler, l lVar, boolean z, f fVar, p pVar, Activity activity) {
        this.e = context;
        this.f = map;
        this.g = kVar;
        this.h = handler;
        this.f1253c = lVar;
        this.f1254d = z;
        this.i = fVar;
        this.j = a(map.size());
        this.k = pVar;
        a(activity);
    }

    public static c a(Context context, i... iVarArr) {
        if (f1251a == null) {
            synchronized (c.class) {
                if (f1251a == null) {
                    c(new a(context).a(iVarArr).a());
                }
            }
        }
        return f1251a;
    }

    private static void c(c cVar) {
        f1251a = cVar;
        cVar.j();
    }

    public c a(Activity activity) {
        this.m = new WeakReference<>(activity);
        return this;
    }

    public Activity b() {
        if (this.m != null) {
            return this.m.get();
        }
        return null;
    }

    private void j() {
        this.l = new b.a.a.a.a(this.e);
        this.l.a(new a.b() { // from class: b.a.a.a.c.1
            @Override // b.a.a.a.a.b
            public void onActivityCreated(Activity activity, Bundle bundle) {
                c.this.a(activity);
            }

            @Override // b.a.a.a.a.b
            public void onActivityStarted(Activity activity) {
                c.this.a(activity);
            }

            @Override // b.a.a.a.a.b
            public void onActivityResumed(Activity activity) {
                c.this.a(activity);
            }
        });
        a(this.e);
    }

    void a(Context context) {
        StringBuilder sb;
        Future<Map<String, k>> b2 = b(context);
        Collection<i> g = g();
        m mVar = new m(b2, g);
        ArrayList<i> arrayList = new ArrayList(g);
        Collections.sort(arrayList);
        mVar.injectParameters(context, this, f.f1266d, this.k);
        for (i iVar : arrayList) {
            iVar.injectParameters(context, this, this.j, this.k);
        }
        mVar.initialize();
        if (h().a("Fabric", 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append(d());
            sb.append(" [Version: ");
            sb.append(c());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (i iVar2 : arrayList) {
            iVar2.initializationTask.addDependency(mVar.initializationTask);
            a(this.f, iVar2);
            iVar2.initialize();
            if (sb != null) {
                sb.append(iVar2.getIdentifier());
                sb.append(" [Version: ");
                sb.append(iVar2.getVersion());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            h().a("Fabric", sb.toString());
        }
    }

    void a(Map<Class<? extends i>, i> map, i iVar) {
        Class<?>[] a2;
        b.a.a.a.a.c.d dVar = iVar.dependsOnAnnotation;
        if (dVar != null) {
            for (Class<?> cls : dVar.a()) {
                if (cls.isInterface()) {
                    for (i iVar2 : map.values()) {
                        if (cls.isAssignableFrom(iVar2.getClass())) {
                            iVar.initializationTask.addDependency(iVar2.initializationTask);
                        }
                    }
                } else if (map.get(cls) == null) {
                    throw new b.a.a.a.a.c.m("Referenced Kit was null, does the kit exist?");
                } else {
                    iVar.initializationTask.addDependency(map.get(cls).initializationTask);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Activity d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public b.a.a.a.a e() {
        return this.l;
    }

    public ExecutorService f() {
        return this.g;
    }

    public Collection<i> g() {
        return this.f.values();
    }

    public static <T extends i> T a(Class<T> cls) {
        return (T) a().f.get(cls);
    }

    public static l h() {
        if (f1251a == null) {
            return f1252b;
        }
        return f1251a.f1253c;
    }

    public static boolean i() {
        if (f1251a == null) {
            return false;
        }
        return f1251a.f1254d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Class<? extends i>, i> b(Collection<? extends i> collection) {
        HashMap hashMap = new HashMap(collection.size());
        a(hashMap, collection);
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(Map<Class<? extends i>, i> map, Collection<? extends i> collection) {
        for (i iVar : collection) {
            map.put(iVar.getClass(), iVar);
            if (iVar instanceof j) {
                a(map, ((j) iVar).getKits());
            }
        }
    }

    f<?> a(final int i) {
        return new f() { // from class: b.a.a.a.c.2

            /* renamed from: a  reason: collision with root package name */
            final CountDownLatch f1256a;

            {
                this.f1256a = new CountDownLatch(i);
            }

            @Override // b.a.a.a.f
            public void a(Object obj) {
                this.f1256a.countDown();
                if (this.f1256a.getCount() == 0) {
                    c.this.n.set(true);
                    c.this.i.a((f) c.this);
                }
            }

            @Override // b.a.a.a.f
            public void a(Exception exc) {
                c.this.i.a(exc);
            }
        };
    }

    Future<Map<String, k>> b(Context context) {
        return f().submit(new e(context.getPackageCodePath()));
    }
}
