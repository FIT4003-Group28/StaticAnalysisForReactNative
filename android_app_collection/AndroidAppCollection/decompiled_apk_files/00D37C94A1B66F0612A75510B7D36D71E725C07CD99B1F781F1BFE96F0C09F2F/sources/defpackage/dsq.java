package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: dsq  reason: default package */
/* loaded from: classes3.dex */
public abstract class dsq implements dsp {
    protected static volatile dtq a;
    protected MotionEvent b;
    protected double k;
    protected float l;
    protected float m;
    protected float n;
    protected float o;
    protected DisplayMetrics q;
    private double r;
    private double s;
    protected final LinkedList c = new LinkedList();
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected long j = 0;
    private boolean t = false;
    protected boolean p = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public dsq(Context context) {
        try {
            if (((Boolean) qdb.t.e()).booleanValue()) {
                dru.b();
            } else {
                ehi.i(a);
            }
            this.q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final void n() {
        this.h = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.i = 0L;
        this.j = 0L;
        if (this.c.size() > 0) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.c.clear();
        } else {
            MotionEvent motionEvent = this.b;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.b = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(14:5|6|7|(4:9|(1:11)(1:69)|12|(1:14)(1:68))(1:70)|15|16|(1:18)(1:(1:55)(1:56))|(1:21)|23|24|(3:41|42|(1:44)(4:45|(2:(1:49)(1:(1:52)(1:53))|50)|27|28))|26|27|28)|75|7|(0)(0)|15|16|(0)(0)|(1:21)|23|24|(0)|26|27|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        if (r10 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
        if (r2 == 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
        r0 = 1003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
        if (r2 == 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        r0 = 1009;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        r0 = 1001;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
        r3 = 2;
        r12.a(r0, -1, java.lang.System.currentTimeMillis() - r8, r13, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: Exception -> 0x0065, TRY_ENTER, TryCatch #3 {Exception -> 0x0065, blocks: (B:24:0x005c, B:32:0x0080, B:28:0x0069, B:29:0x0073), top: B:74:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String o(android.content.Context r22, java.lang.String r23, int r24, android.view.View r25, android.app.Activity r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsq.o(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    protected abstract long a(StackTraceElement[] stackTraceElementArr);

    protected abstract dtr b(MotionEvent motionEvent);

    @Override // defpackage.dsp
    public final String c(Context context, String str) {
        return d(context, str, null, null);
    }

    @Override // defpackage.dsp
    public final String d(Context context, String str, View view, Activity activity) {
        return o(context, str, 3, view, activity, null);
    }

    @Override // defpackage.dsp
    public final String e(Context context) {
        if (dts.f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return o(context, null, 1, null, null, null);
    }

    @Override // defpackage.dsp
    public final String f(Context context, byte[] bArr) {
        if (dts.f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return o(context, null, 1, null, null, bArr);
    }

    @Override // defpackage.dsp
    public final String g(Context context, View view, Activity activity) {
        return o(context, null, 2, view, activity, null);
    }

    @Override // defpackage.dsp
    public final synchronized void h(MotionEvent motionEvent) {
        Long l;
        if (this.t) {
            n();
            this.t = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 0.0d;
            this.r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.r;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.s;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.k += Math.sqrt((d2 * d2) + (d4 * d4));
            this.r = rawX;
            this.s = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.b = obtain;
                    this.c.add(obtain);
                    if (this.c.size() > 6) {
                        ((MotionEvent) this.c.remove()).recycle();
                    }
                    this.f++;
                    this.h = a(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.e += motionEvent.getHistorySize() + 1;
                    dtr b = b(motionEvent);
                    Long l2 = b.d;
                    if (l2 != null && b.g != null) {
                        this.i += l2.longValue() + b.g.longValue();
                    }
                    if (this.q != null && (l = b.e) != null && b.h != null) {
                        this.j += l.longValue() + b.h.longValue();
                    }
                } else if (action2 == 3) {
                    this.g++;
                }
            } catch (dti unused) {
            }
        } else {
            this.l = motionEvent.getX();
            this.m = motionEvent.getY();
            this.n = motionEvent.getRawX();
            this.o = motionEvent.getRawY();
            this.d++;
        }
        this.p = true;
    }

    @Override // defpackage.dsp
    public final synchronized void i(int i, int i2, int i3) {
        if (this.b != null) {
            if (((Boolean) qdb.i.e()).booleanValue()) {
                n();
            } else {
                this.b.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.q;
        if (displayMetrics != null) {
            this.b = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.q.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.b = null;
        }
        this.p = false;
    }

    protected abstract aopa j(Context context, View view, Activity activity);

    @Override // defpackage.dsp
    public void k(View view) {
    }

    protected abstract aopa l(Context context, dnq dnqVar);

    protected abstract aopa m(Context context, View view, Activity activity);
}
