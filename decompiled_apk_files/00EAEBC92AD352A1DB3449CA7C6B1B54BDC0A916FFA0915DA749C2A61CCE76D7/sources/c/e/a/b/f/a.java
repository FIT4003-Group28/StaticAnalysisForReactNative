package c.e.a.b.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.n;
import com.google.android.gms.common.util.p;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class a {
    private static ScheduledExecutorService l;

    /* renamed from: a  reason: collision with root package name */
    private final Object f4589a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f4590b;

    /* renamed from: c  reason: collision with root package name */
    private WorkSource f4591c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4592d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4593e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4594f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f4595g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4596h;
    private final Map<String, Integer[]> i;
    private int j;
    private AtomicInteger k;

    /* renamed from: c.e.a.b.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0099a {
    }

    static {
        new b();
    }

    public a(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    private a(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private a(Context context, int i, String str, String str2, String str3, String str4) {
        this.f4589a = this;
        this.f4596h = true;
        this.i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.k = new AtomicInteger(0);
        s.a(context, "WakeLock: context must not be null");
        s.a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.f4592d = i;
        this.f4594f = null;
        this.f4595g = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f4593e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f4593e = str;
        }
        this.f4590b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (p.a(context)) {
            this.f4591c = p.a(context, n.b(str3) ? context.getPackageName() : str3);
            WorkSource workSource = this.f4591c;
            if (workSource != null && p.a(this.f4595g)) {
                WorkSource workSource2 = this.f4591c;
                if (workSource2 != null) {
                    workSource2.add(workSource);
                } else {
                    this.f4591c = workSource;
                }
                try {
                    this.f4590b.setWorkSource(this.f4591c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                    Log.wtf("WakeLock", e2.toString());
                }
            }
        }
        if (l == null) {
            l = com.google.android.gms.common.m.a.a().a();
        }
    }

    private final String a(String str) {
        return (!this.f4596h || TextUtils.isEmpty(str)) ? this.f4594f : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i) {
        if (this.f4590b.isHeld()) {
            try {
                this.f4590b.release();
            } catch (RuntimeException e2) {
                if (!e2.getClass().equals(RuntimeException.class)) {
                    throw e2;
                }
                Log.e("WakeLock", String.valueOf(this.f4593e).concat(" was already released!"), e2);
            }
            this.f4590b.isHeld();
        }
    }

    private final List<String> b() {
        return p.a(this.f4591c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r1 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r12.j == 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        com.google.android.gms.common.stats.d.a().a(r12.f4595g, com.google.android.gms.common.stats.c.a(r12.f4590b, r6), 8, r12.f4593e, r6, null, r12.f4592d, b());
        r12.j--;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.k
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L19
            java.lang.String r0 = r12.f4593e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = " release without a matched acquire!"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "WakeLock"
            android.util.Log.e(r1, r0)
        L19:
            r0 = 0
            java.lang.String r6 = r12.a(r0)
            java.lang.Object r0 = r12.f4589a
            monitor-enter(r0)
            boolean r1 = r12.f4596h     // Catch: java.lang.Throwable -> L7e
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L52
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.i     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L33
        L31:
            r1 = 0
            goto L50
        L33:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            if (r2 != r10) goto L42
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.i     // Catch: java.lang.Throwable -> L7e
            r1.remove(r6)     // Catch: java.lang.Throwable -> L7e
            r1 = 1
            goto L50
        L42:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7e
            r1[r11] = r2     // Catch: java.lang.Throwable -> L7e
            goto L31
        L50:
            if (r1 != 0) goto L5a
        L52:
            boolean r1 = r12.f4596h     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L79
            int r1 = r12.j     // Catch: java.lang.Throwable -> L7e
            if (r1 != r10) goto L79
        L5a:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.d.a()     // Catch: java.lang.Throwable -> L7e
            android.content.Context r2 = r12.f4595g     // Catch: java.lang.Throwable -> L7e
            android.os.PowerManager$WakeLock r3 = r12.f4590b     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = com.google.android.gms.common.stats.c.a(r3, r6)     // Catch: java.lang.Throwable -> L7e
            r4 = 8
            java.lang.String r5 = r12.f4593e     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            int r8 = r12.f4592d     // Catch: java.lang.Throwable -> L7e
            java.util.List r9 = r12.b()     // Catch: java.lang.Throwable -> L7e
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7e
            int r1 = r12.j     // Catch: java.lang.Throwable -> L7e
            int r1 = r1 - r10
            r12.j = r1     // Catch: java.lang.Throwable -> L7e
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            r12.a(r11)
            return
        L7e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.f.a.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r2 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r13.j == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        com.google.android.gms.common.stats.d.a().a(r13.f4595g, com.google.android.gms.common.stats.c.a(r13.f4590b, r6), 7, r13.f4593e, r6, null, r13.f4592d, b(), r14);
        r13.j++;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.k
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.a(r0)
            java.lang.Object r0 = r13.f4589a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L96
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r13.j     // Catch: java.lang.Throwable -> L96
            if (r1 <= 0) goto L29
        L1a:
            android.os.PowerManager$WakeLock r1 = r13.f4590b     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L29
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            r1.clear()     // Catch: java.lang.Throwable -> L96
            r13.j = r2     // Catch: java.lang.Throwable -> L96
        L29:
            boolean r1 = r13.f4596h     // Catch: java.lang.Throwable -> L96
            r12 = 1
            if (r1 == 0) goto L56
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L47
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r3[r2] = r4     // Catch: java.lang.Throwable -> L96
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> L96
            r2 = 1
            goto L54
        L47:
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L96
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L96
            r1[r2] = r3     // Catch: java.lang.Throwable -> L96
        L54:
            if (r2 != 0) goto L5e
        L56:
            boolean r1 = r13.f4596h     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
            int r1 = r13.j     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
        L5e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.d.a()     // Catch: java.lang.Throwable -> L96
            android.content.Context r2 = r13.f4595g     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r3 = r13.f4590b     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = com.google.android.gms.common.stats.c.a(r3, r6)     // Catch: java.lang.Throwable -> L96
            r4 = 7
            java.lang.String r5 = r13.f4593e     // Catch: java.lang.Throwable -> L96
            r7 = 0
            int r8 = r13.f4592d     // Catch: java.lang.Throwable -> L96
            java.util.List r9 = r13.b()     // Catch: java.lang.Throwable -> L96
            r10 = r14
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96
            int r1 = r13.j     // Catch: java.lang.Throwable -> L96
            int r1 = r1 + r12
            r13.j = r1     // Catch: java.lang.Throwable -> L96
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r0 = r13.f4590b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L95
            java.util.concurrent.ScheduledExecutorService r0 = c.e.a.b.f.a.l
            c.e.a.b.f.c r1 = new c.e.a.b.f.c
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L95:
            return
        L96:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.f.a.a(long):void");
    }

    public void a(boolean z) {
        this.f4590b.setReferenceCounted(z);
        this.f4596h = z;
    }
}
