package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: iap  reason: default package */
/* loaded from: classes3.dex */
public final class iap implements ya {
    public boolean b;
    public hzz e;
    private final int f;
    private final int g;
    private float h;
    private float i;
    private boolean j;
    private final int k;
    private final Handler m;
    private final iee n;
    private final iei o;
    private final icw p;
    private final aadd q;
    public long a = -1;
    public int c = 0;
    public int d = 6;
    private int l = 0;

    public iap(Context context, Handler handler, iee ieeVar, icw icwVar, iei ieiVar, aadd aaddVar) {
        this.m = handler;
        this.n = ieeVar;
        this.o = ieiVar;
        this.p = icwVar;
        this.q = aaddVar;
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
        Math.max(199, ViewConfiguration.getTapTimeout());
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        int i = point.y;
        this.g = i;
        this.k = (int) (i * 0.1f);
    }

    private final void e(boolean z) {
        if (this.b) {
            if (z && !this.j) {
                this.n.c(this.l);
                this.l = 0;
                this.b = false;
            }
            this.a = -1L;
            this.p.e();
        }
        idn a = a();
        if (a != null) {
            ((iet) a).h(this.b);
        }
        ien b = b();
        if (b != null) {
            b.a(true);
        }
        this.a = -1L;
        this.p.e();
    }

    private final boolean f(float f) {
        iei ieiVar = this.o;
        iet aF = ieiVar == null ? null : ieiVar.aF();
        if (aF == null) {
            return true;
        }
        return f >= ((float) aF.g()) && f <= ((float) (this.g - aF.f()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0135, code lost:
        if (r11.o.aF().r != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(final android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iap.h(android.view.MotionEvent):void");
    }

    public final idn a() {
        iei ieiVar = this.o;
        iet aF = ieiVar == null ? null : ieiVar.aF();
        if (aF == null) {
            return null;
        }
        return aF;
    }

    public final ien b() {
        iei ieiVar = this.o;
        iet aF = ieiVar == null ? null : ieiVar.aF();
        if (aF == null) {
            return null;
        }
        return aF.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (r7 >= 0.75f) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.MotionEvent r10, long r11) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iap.c(android.view.MotionEvent, long):void");
    }

    public final boolean d(int i) {
        return (i & this.d) != 0;
    }

    @Override // defpackage.ya
    public final void g(boolean z) {
    }

    @Override // defpackage.ya
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent != null) {
            h(motionEvent);
        }
        int i = this.c;
        return (i == 0 || i == 1) ? false : true;
    }

    @Override // defpackage.ya
    public final void n(MotionEvent motionEvent) {
        hzz hzzVar;
        iai iaiVar;
        int i;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 1 && (hzzVar = this.e) != null && (i = (iaiVar = hzzVar.a).x) != -1) {
                iaiVar.n.al(i);
            }
            h(motionEvent);
        }
    }
}
