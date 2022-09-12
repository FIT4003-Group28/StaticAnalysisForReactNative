package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cxju  reason: default package */
/* loaded from: classes.dex */
public abstract class cxju<T> {
    private static final Object a = new Object();
    public static final /* synthetic */ int d = 0;
    @dzsi
    private static volatile cxjt e = null;
    private static volatile boolean f = false;
    private static final cxkg g;
    private static final AtomicInteger i;
    final cxjs b;
    final String c;
    private final T h;
    private volatile int j = -1;
    private volatile T k;
    private final boolean l;

    static {
        new AtomicReference();
        g = new cxkg(cxjk.a);
        i = new AtomicInteger();
    }

    public cxju(cxjs cxjsVar, String str, T t, boolean z) {
        String str2 = cxjsVar.a;
        if (str2 == null && cxjsVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && cxjsVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.b = cxjsVar;
        this.c = str;
        this.h = t;
        this.l = z;
    }

    @Deprecated
    public static void b(final Context context) {
        synchronized (a) {
            cxjt cxjtVar = e;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (cxjtVar == null || ((cxip) cxjtVar).a != context) {
                cxis.d();
                cxjw.d();
                cxiz.c();
                e = new cxip(context, dbud.a(new dbty(context) { // from class: cxjj
                    private final Context a;

                    {
                        this.a = context;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        Context context2 = this.a;
                        int i2 = cxju.d;
                        return cxjb.a(context2);
                    }
                }));
                d();
            }
        }
    }

    public static void c(Context context) {
        if (e == null) {
            synchronized (a) {
                if (e == null) {
                    b(context);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        i.incrementAndGet();
    }

    public static cxju<Long> g(cxjs cxjsVar, String str, long j, boolean z) {
        return new cxjl(cxjsVar, str, Long.valueOf(j), z);
    }

    public static cxju<Boolean> h(cxjs cxjsVar, String str, boolean z, boolean z2) {
        return new cxjn(cxjsVar, str, Boolean.valueOf(z), z2);
    }

    public static cxju<Double> i(cxjs cxjsVar, String str, double d2, boolean z) {
        return new cxjo(cxjsVar, str, Double.valueOf(d2), z);
    }

    public static cxju<String> j(cxjs cxjsVar, String str, String str2, boolean z) {
        return new cxjp(cxjsVar, str, str2, z);
    }

    public static <T> cxju<T> k(cxjs cxjsVar, String str, T t, cxjr<T> cxjrVar, boolean z) {
        return new cxjq(cxjsVar, str, t, z, cxjrVar);
    }

    private final String l(String str) {
        if (str.isEmpty()) {
            return this.c;
        }
        String valueOf = String.valueOf(this.c);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public abstract T a(Object obj);

    public final String e() {
        return l(this.b.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9 A[Catch: all -> 0x015b, TryCatch #0 {, blocks: (B:12:0x0030, B:14:0x0034, B:18:0x003b, B:20:0x0058, B:51:0x0128, B:53:0x0138, B:55:0x014e, B:56:0x0151, B:57:0x0155, B:39:0x00f9, B:41:0x00ff, B:45:0x0118, B:47:0x011e, B:44:0x0112, B:49:0x0124, B:23:0x0067, B:25:0x006d, B:27:0x0078, B:29:0x007e, B:34:0x00e8, B:36:0x00f2, B:30:0x00c7, B:32:0x00db, B:58:0x0159), top: B:65:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138 A[Catch: all -> 0x015b, TryCatch #0 {, blocks: (B:12:0x0030, B:14:0x0034, B:18:0x003b, B:20:0x0058, B:51:0x0128, B:53:0x0138, B:55:0x014e, B:56:0x0151, B:57:0x0155, B:39:0x00f9, B:41:0x00ff, B:45:0x0118, B:47:0x011e, B:44:0x0112, B:49:0x0124, B:23:0x0067, B:25:0x006d, B:27:0x0078, B:29:0x007e, B:34:0x00e8, B:36:0x00f2, B:30:0x00c7, B:32:0x00db, B:58:0x0159), top: B:65:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T f() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxju.f():java.lang.Object");
    }
}
