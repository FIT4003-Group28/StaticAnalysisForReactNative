package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: vbt  reason: default package */
/* loaded from: classes4.dex */
public abstract class vbt {
    private static final Object a = new Object();
    public static final /* synthetic */ int d = 0;
    private static volatile vbs e = null;
    private static volatile boolean f = false;
    private static final vcb g;
    private static final AtomicInteger h;
    final vbr b;
    final String c;
    private final Object i;
    private volatile int j = -1;
    private volatile Object k;
    private final boolean l;

    static {
        new AtomicReference();
        g = new vcb(vdf.b);
        h = new AtomicInteger();
    }

    public vbt(vbr vbrVar, String str, Object obj, boolean z) {
        if (vbrVar.b != null) {
            this.b = vbrVar;
            this.c = str;
            this.i = obj;
            this.l = z;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static vbt b(vbr vbrVar, String str, Object obj, vbq vbqVar, boolean z) {
        return new vbp(vbrVar, str, obj, z, vbqVar);
    }

    @Deprecated
    public static void e(Context context) {
        synchronized (a) {
            vbs vbsVar = e;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (vbsVar == null || vbsVar.a != context) {
                vaz.d();
                vbv.a();
                vbf.d();
                e = new vbs(context, aqxo.i(new nfd(context, 8)));
                f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f() {
        h.incrementAndGet();
    }

    public static void g(Context context) {
        if (e == null) {
            synchronized (a) {
                if (e == null) {
                    e(context);
                }
            }
        }
    }

    private final Object h(vbs vbsVar) {
        vbr vbrVar = this.b;
        if (!vbrVar.e) {
            ampg ampgVar = vbrVar.i;
            vbf a2 = vbf.a(vbsVar.a);
            vbr vbrVar2 = this.b;
            String b = a2.b(vbrVar2.e ? null : j(vbrVar2.c));
            if (b != null) {
                return a(b);
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:34|(1:36)(7:48|(1:50)(1:56)|51|(2:53|(1:55))|43|44|45)|37|38|39|40|(1:42)|43|44|45) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(defpackage.vbs r10) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbt.i(vbs):java.lang.Object");
    }

    private final String j(String str) {
        if (str.isEmpty()) {
            return this.c;
        }
        String valueOf = String.valueOf(this.c);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:8:0x001e, B:10:0x0022, B:14:0x0028, B:16:0x0033, B:27:0x004f, B:29:0x005d, B:31:0x0073, B:32:0x0076, B:33:0x007a, B:19:0x003a, B:26:0x004d, B:22:0x0041, B:24:0x0047, B:34:0x007e), top: B:41:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c() {
        /*
            r5 = this;
            boolean r0 = r5.l
            r1 = 1
            if (r0 != 0) goto L13
            vcb r0 = defpackage.vbt.g
            java.lang.String r2 = r5.c
            r2.getClass()
            boolean r0 = r0.a
            java.lang.String r0 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            defpackage.aqxo.z(r1, r0)
        L13:
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.vbt.h
            int r0 = r0.get()
            int r2 = r5.j
            if (r2 >= r0) goto L83
            monitor-enter(r5)
            int r2 = r5.j     // Catch: java.lang.Throwable -> L80
            if (r2 >= r0) goto L7e
            vbs r2 = defpackage.vbt.e     // Catch: java.lang.Throwable -> L80
            if (r2 == 0) goto L27
            goto L28
        L27:
            r1 = 0
        L28:
            java.lang.String r3 = "Must call PhenotypeFlag.init() first"
            defpackage.aqxo.z(r1, r3)     // Catch: java.lang.Throwable -> L80
            vbr r1 = r5.b     // Catch: java.lang.Throwable -> L80
            boolean r1 = r1.f     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L41
            java.lang.Object r1 = r5.h(r2)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L3a
            goto L4f
        L3a:
            java.lang.Object r1 = r5.i(r2)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L4f
            goto L4d
        L41:
            java.lang.Object r1 = r5.i(r2)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L4f
            java.lang.Object r1 = r5.h(r2)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L4f
        L4d:
            java.lang.Object r1 = r5.i     // Catch: java.lang.Throwable -> L80
        L4f:
            amqo r2 = r2.b     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L80
            ampq r2 = (defpackage.ampq) r2     // Catch: java.lang.Throwable -> L80
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L7a
            java.lang.Object r1 = r2.c()     // Catch: java.lang.Throwable -> L80
            vbg r1 = (defpackage.vbg) r1     // Catch: java.lang.Throwable -> L80
            vbr r2 = r5.b     // Catch: java.lang.Throwable -> L80
            android.net.Uri r3 = r2.b     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r2.a     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = r2.d     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r5.c     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = r1.a(r3, r2, r4)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L76
            java.lang.Object r1 = r5.i     // Catch: java.lang.Throwable -> L80
            goto L7a
        L76:
            java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.Throwable -> L80
        L7a:
            r5.k = r1     // Catch: java.lang.Throwable -> L80
            r5.j = r0     // Catch: java.lang.Throwable -> L80
        L7e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            goto L83
        L80:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            throw r0
        L83:
            java.lang.Object r0 = r5.k
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbt.c():java.lang.Object");
    }

    public final String d() {
        return j(this.b.d);
    }
}
