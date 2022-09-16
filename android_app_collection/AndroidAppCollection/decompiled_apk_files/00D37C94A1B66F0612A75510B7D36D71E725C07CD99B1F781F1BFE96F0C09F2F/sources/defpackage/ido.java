package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: ido  reason: default package */
/* loaded from: classes3.dex */
public final class ido {
    public final int a;
    public final int d;
    public idn e;
    public ien f;
    public float g;
    public float h;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final Context p;
    public final Handler q;
    public final iee r;
    public final icw s;
    public final aadd t;
    public iet u;
    private final int v;
    public long i = -1;
    public int o = 0;
    public final int b = Math.max(199, ViewConfiguration.getTapTimeout());
    public final int c = ViewConfiguration.getDoubleTapTimeout();

    public ido(Context context, Handler handler, iee ieeVar, icw icwVar, aadd aaddVar) {
        this.p = context;
        this.q = handler;
        this.r = ieeVar;
        this.s = icwVar;
        this.t = aaddVar;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        this.v = point.x;
        this.d = point.y;
    }

    public final void a(boolean z) {
        if (this.j) {
            if (z && !this.m) {
                this.r.c(this.o);
                this.o = 0;
                this.j = false;
            }
            this.i = -1L;
            this.s.e();
        }
        ((iet) this.e).h(false);
        this.f.a(true);
        this.i = -1L;
        this.s.e();
    }

    public final void b(MotionEvent motionEvent) {
        this.s.f(motionEvent.getRawX(), motionEvent.getRawY());
    }

    public final void c(boolean z, boolean z2, icv icvVar) {
        if (!z) {
            if (this.g > (this.v * 3) / 10) {
                if (icvVar != null) {
                    icvVar.a(actj.LIGHTWEIGHT_PLAYER_TAP_SCREEN_RIGHT);
                }
                this.e.d();
                return;
            }
            if (icvVar != null) {
                icvVar.a(actj.LIGHTWEIGHT_PLAYER_TAP_SCREEN_LEFT);
            }
            this.e.e();
        } else if (z2) {
        } else {
            if (!this.j) {
                this.j = true;
                this.o = this.r.a();
                this.f.a(false);
                idq.a(this.u.k.b);
            } else {
                this.j = false;
                this.r.c(this.o);
                this.f.a(true);
                this.o = 0;
                idq.a(this.u.k.a);
            }
            if (icvVar == null) {
                return;
            }
            icvVar.a(actj.LIGHTWEIGHT_PLAYER_TAP_SCREEN_MIDDLE);
        }
    }
}
