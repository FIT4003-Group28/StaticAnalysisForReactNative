package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aljd  reason: default package */
/* loaded from: classes.dex */
public final class aljd {
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private final akse F;
    private final akse G;
    private final akse H;
    private final float I;
    private float J;
    private float K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private final boolean P;
    private float Q;
    private float R;
    private long S;
    private final VelocityTracker T;
    @dzsi
    private aljg U;
    private final aliy V;
    public final alip a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public final alit f;
    private final Context g;
    @dzsi
    private MotionEvent h;
    @dzsi
    private MotionEvent i;
    private final List<alip> j;
    private final List<alip> k;
    private final alip l;
    private final alip m;
    private final alip n;
    private final LinkedList<aliv> o;
    private long p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public aljd(Context context, aliy aliyVar) {
        ArrayList a = dchl.a();
        this.j = a;
        this.k = dchl.a();
        this.o = new LinkedList<>();
        this.F = new akse();
        this.G = new akse();
        this.H = new akse();
        this.e = true;
        this.S = 0L;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.g = context;
        this.I = viewConfiguration.getScaledEdgeSlop();
        this.V = aliyVar;
        float f = 160.0f;
        this.Q = 160.0f;
        this.R = 160.0f;
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            this.Q = displayMetrics.xdpi;
            f = displayMetrics.ydpi;
            this.R = f;
        }
        aljl aljlVar = new aljl(2, aliyVar, this.Q, f);
        this.m = aljlVar;
        a.add(aljlVar);
        aljl aljlVar2 = new aljl(3, aliyVar, this.Q, this.R);
        this.n = aljlVar2;
        a.add(aljlVar2);
        a.add(new aljm(aliyVar, this.Q, this.R, viewConfiguration.getScaledTouchSlop()));
        boolean z = !context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.P = z;
        if (z) {
            aljj aljjVar = new aljj(aliyVar, this.Q, this.R);
            this.a = aljjVar;
            a.add(aljjVar);
        } else {
            aljh aljhVar = new aljh(aliyVar, this.Q, this.R);
            this.a = aljhVar;
            a.add(aljhVar);
        }
        alji aljiVar = new alji(aliyVar, this.Q, this.R);
        this.l = aljiVar;
        a.add(aljiVar);
        alit alitVar = new alit(context, aliyVar, new Handler(Looper.getMainLooper()));
        this.f = alitVar;
        alitVar.x = true;
        alitVar.l = aliyVar;
        this.T = VelocityTracker.obtain();
    }

    public static float d(float f, float f2) {
        if (f2 == 0.0f) {
            return 1.0f;
        }
        return (float) (1.0d / (Math.exp(((Math.abs(f) / Math.abs(f2)) - 2.0f) * (-2.0f)) + 1.0d));
    }

    private final boolean f(MotionEvent motionEvent) {
        return motionEvent.getEventTime() <= this.S + 100;
    }

    private final EnumSet<aljb> g() {
        EnumSet<aljb> noneOf = EnumSet.noneOf(aljb.class);
        if (this.m.b || this.n.b) {
            noneOf.add(aljb.TILT);
        } else if (!this.P) {
            noneOf.add(aljb.PAN);
        }
        if (this.l.b) {
            noneOf.add(aljb.ZOOM);
        }
        if (this.a.b && !this.P) {
            noneOf.add(aljb.ROTATE);
        }
        return noneOf;
    }

    private final void h(MotionEvent motionEvent) {
        float f = this.I;
        float f2 = this.J;
        float f3 = this.K;
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        float x2 = motionEvent.getX(motionEvent.getPointerCount() - 1);
        float y2 = motionEvent.getY(motionEvent.getPointerCount() - 1);
        boolean z = x < f || y < f || x > f2 || y > f3;
        boolean z2 = x2 < f || y2 < f || x2 > f2 || y2 > f3;
        if (z && z2) {
            this.b = -1.0f;
            this.c = -1.0f;
            this.L = true;
        } else if (z) {
            this.b = motionEvent.getX(motionEvent.getPointerCount() - 1);
            this.c = motionEvent.getY(motionEvent.getPointerCount() - 1);
            this.L = true;
        } else if (!z2) {
            this.O = true;
            this.L = false;
        } else {
            this.b = motionEvent.getX(0);
            this.c = motionEvent.getY(0);
            this.L = true;
        }
    }

    private final boolean i() {
        return !this.k.isEmpty();
    }

    private static boolean j(alip alipVar) {
        return alipVar.b;
    }

    private final void k() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            alip alipVar = this.k.get(i);
            dbsk.p(alipVar.b, "Ending inactive gesture: %s", alipVar);
            alipVar.e(this);
        }
        this.k.clear();
    }

    private final void l(MotionEvent motionEvent) {
        this.i = MotionEvent.obtain(motionEvent);
        this.u = -1.0f;
        this.v = -1.0f;
        this.y = -1.0f;
        this.z = 0.0f;
        this.M = false;
        this.N = false;
        MotionEvent motionEvent2 = this.h;
        dbsk.s(motionEvent2);
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        float x2 = motionEvent2.getX(motionEvent2.getPointerCount() - 1);
        float y2 = motionEvent2.getY(motionEvent2.getPointerCount() - 1);
        float x3 = motionEvent.getX(0);
        float y3 = motionEvent.getY(0);
        float x4 = motionEvent.getX(motionEvent.getPointerCount() - 1);
        float y4 = motionEvent.getY(motionEvent.getPointerCount() - 1);
        float f = x2 - x;
        float f2 = x4 - x3;
        float f3 = y4 - y3;
        this.q = f;
        this.r = y2 - y;
        this.s = f2;
        this.t = f3;
        this.w = y;
        this.x = y3;
        this.b = (f2 * 0.5f) + x3;
        this.c = (f3 * 0.5f) + y3;
        this.d = (f * 0.5f) + x;
        motionEvent.getEventTime();
        motionEvent2.getEventTime();
        this.B = motionEvent.getPressure(0) + motionEvent.getPressure(motionEvent.getPointerCount() - 1);
        this.C = motionEvent2.getPressure(0) + motionEvent2.getPressure(motionEvent2.getPointerCount() - 1);
        this.F.r(this.q, this.r);
        this.G.r(x3 - x, y3 - y);
        this.H.r(x4 - x2, y4 - y2);
        this.D = this.F.a(this.H) - this.F.a(this.G);
        this.E = akse.b(akse.a, this.F, this.H) - akse.b(akse.a, this.F, this.G);
    }

    private final void m() {
        this.h = null;
        this.i = null;
        this.L = false;
        this.O = false;
        this.k.clear();
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            this.o.get(i).d();
        }
        this.o.clear();
        int size2 = this.j.size();
        for (int i2 = 0; i2 < size2; i2++) {
            alip alipVar = this.j.get(i2);
            if (alipVar.b) {
                alipVar.e(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (r0 != 262) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aljd.n(android.view.MotionEvent):void");
    }

    public final float a() {
        if (!j(this.l)) {
            return 1.0f;
        }
        MotionEvent motionEvent = this.i;
        dbsk.s(motionEvent);
        MotionEvent motionEvent2 = this.h;
        dbsk.s(motionEvent2);
        if (motionEvent.getPointerCount() != motionEvent2.getPointerCount()) {
            return 1.0f;
        }
        float f = this.y;
        if (f != -1.0f) {
            return f;
        }
        float f2 = this.u;
        if (f2 == -1.0f) {
            f2 = (float) Math.hypot(this.s, this.t);
            this.u = f2;
        }
        float f3 = this.v;
        if (f3 == -1.0f) {
            f3 = (float) Math.hypot(this.q, this.r);
            this.v = f3;
        }
        if (f2 == 0.0f || f3 == 0.0f) {
            return 1.0f;
        }
        float f4 = f2 / f3;
        this.y = f4;
        return f4;
    }

    public final float b() {
        if (!j(this.m)) {
            return 0.0f;
        }
        if (!this.M) {
            this.z = (this.x - this.w) * 0.25f;
            this.M = true;
        }
        return this.z;
    }

    public final float c() {
        float f = 0.0f;
        if (j(this.a)) {
            MotionEvent motionEvent = this.i;
            dbsk.s(motionEvent);
            MotionEvent motionEvent2 = this.h;
            dbsk.s(motionEvent2);
            if (motionEvent.getPointerCount() == motionEvent2.getPointerCount()) {
                if (!this.N) {
                    this.A = alip.h(aliv.a(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(motionEvent2.getPointerCount() - 1), motionEvent2.getY(motionEvent2.getPointerCount() - 1)), aliv.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(motionEvent.getPointerCount() - 1), motionEvent.getY(motionEvent.getPointerCount() - 1))) * 57.295776f;
                    this.N = true;
                }
                f = this.A;
            }
        }
        return this.e ? f : f * d(this.E, this.D);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
        if (r2 != 262) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a6, code lost:
        if (r2 != 6) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aljd.e(android.view.MotionEvent):void");
    }
}
