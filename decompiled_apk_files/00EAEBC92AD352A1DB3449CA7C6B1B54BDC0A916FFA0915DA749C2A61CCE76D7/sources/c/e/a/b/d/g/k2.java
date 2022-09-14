package c.e.a.b.d.g;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class k2<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f4251f = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: g  reason: collision with root package name */
    private static volatile Context f4252g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile z2<y2<g2>> f4253h;
    private static final AtomicInteger i;

    /* renamed from: a  reason: collision with root package name */
    private final r2 f4254a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4255b;

    /* renamed from: c  reason: collision with root package name */
    private final T f4256c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f4257d;

    /* renamed from: e  reason: collision with root package name */
    private volatile T f4258e;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    private k2(r2 r2Var, String str, T t, boolean z) {
        this.f4257d = -1;
        if (r2Var.f4382a != null) {
            this.f4254a = r2Var;
            this.f4255b = str;
            this.f4256c = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ k2(r2 r2Var, String str, Object obj, boolean z, m2 m2Var) {
        this(r2Var, str, obj, z);
    }

    private final String a(String str) {
        if (str == null || !str.isEmpty()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(this.f4255b);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return this.f4255b;
    }

    @Deprecated
    public static void a(Context context) {
        synchronized (f4251f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f4252g != context) {
                w1.d();
                u2.a();
                f2.a();
                f4253h = c3.a(n2.f4314b);
                f4252g = context;
                i.incrementAndGet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k2<Double> b(r2 r2Var, String str, double d2, boolean z) {
        return new o2(r2Var, str, Double.valueOf(d2), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k2<Long> b(r2 r2Var, String str, long j, boolean z) {
        return new m2(r2Var, str, Long.valueOf(j), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k2<String> b(r2 r2Var, String str, String str2, boolean z) {
        return new s2(r2Var, str, str2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k2<Boolean> b(r2 r2Var, String str, boolean z, boolean z2) {
        return new q2(r2Var, str, Boolean.valueOf(z), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        i.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ y2 d() {
        new j2();
        return j2.a(f4252g);
    }

    abstract T a(Object obj);

    public final String a() {
        return a(this.f4254a.f4384c);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0023, B:17:0x0035, B:19:0x003b, B:21:0x0047, B:25:0x0060, B:27:0x006a, B:45:0x00bb, B:47:0x00c9, B:49:0x00df, B:50:0x00e2, B:51:0x00e6, B:38:0x009c, B:40:0x00b0, B:44:0x00b9, B:23:0x0058, B:28:0x006f, B:30:0x0078, B:32:0x008a, B:34:0x0095, B:33:0x008f, B:52:0x00eb, B:53:0x00f2, B:54:0x00f3), top: B:61:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9 A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0023, B:17:0x0035, B:19:0x003b, B:21:0x0047, B:25:0x0060, B:27:0x006a, B:45:0x00bb, B:47:0x00c9, B:49:0x00df, B:50:0x00e2, B:51:0x00e6, B:38:0x009c, B:40:0x00b0, B:44:0x00b9, B:23:0x0058, B:28:0x006f, B:30:0x0078, B:32:0x008a, B:34:0x0095, B:33:0x008f, B:52:0x00eb, B:53:0x00f2, B:54:0x00f3), top: B:61:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T b() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.k2.b():java.lang.Object");
    }
}
