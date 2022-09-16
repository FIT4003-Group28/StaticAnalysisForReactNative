package defpackage;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acbo  reason: default package */
/* loaded from: classes.dex */
public final class acbo implements acbt, accf {
    public final accj a;
    public final accg b;
    public final int c;
    public final int d;
    public acbs e;
    private final Surface g;
    private final String h;
    private final acbq i;
    private final Handler j;
    private final long k;
    private long l;
    private long m;
    private boolean o;
    private final Runnable f = new acbn(this);
    private long n = Long.MIN_VALUE;
    private boolean p = true;

    public acbo(accg accgVar, accj accjVar, int i, int i2, acbq acbqVar, Handler handler) {
        boolean z = true;
        aqxo.p((i2 <= 0 || i < i2) ? false : z);
        accgVar.getClass();
        this.b = accgVar;
        accjVar.getClass();
        this.a = accjVar;
        acbqVar.getClass();
        this.i = acbqVar;
        handler.getClass();
        this.j = handler;
        this.c = i2;
        this.d = i;
        int i3 = i < i2 ? i2 : i;
        i = i3 <= i ? i3 : i;
        long nanos = TimeUnit.SECONDS.toNanos(1L) / i;
        this.l = nanos;
        this.m = (nanos * 10) / 100;
        accjVar.f(i);
        this.k = TimeUnit.SECONDS.toMillis(1L) / i2;
        String str = accjVar.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
        sb.append("FRC[");
        sb.append(str);
        sb.append("]");
        String sb2 = sb.toString();
        this.h = sb2;
        String.valueOf(sb2).length();
        Surface surface = accjVar.j;
        surface.getClass();
        this.g = surface;
        accgVar.d(surface);
        accgVar.c(this, handler);
    }

    private final void h() {
        this.o = false;
    }

    @Override // defpackage.acbt
    public final void a(int i) {
        accj accjVar = this.a;
        boolean isEmpty = accjVar.o.isEmpty();
        int intValue = isEmpty ? accjVar.c : ((Integer) accjVar.o.peekLast()).intValue();
        if (i == intValue) {
            return;
        }
        if (accjVar.q && i < intValue) {
            accjVar.o.add(Integer.valueOf(Math.max(0, i - (accjVar.s * 1000))));
        }
        accjVar.o.add(Integer.valueOf(i));
        if (!isEmpty) {
            return;
        }
        long j = accjVar.p;
        long j2 = accjVar.r + j;
        long j3 = 0;
        if (j > 0) {
            acbq acbqVar = accjVar.f;
            j3 = Math.max(j2 - System.currentTimeMillis(), 0L);
        }
        accjVar.g.postDelayed(accjVar.i, j3);
    }

    public final int b() {
        return this.a.c;
    }

    @Override // defpackage.acbt
    public final boolean c() {
        this.b.c(null, null);
        return this.a.c();
    }

    @Override // defpackage.acbt
    public final boolean d() {
        if (!this.a.d()) {
            return false;
        }
        this.o = true;
        this.n = Long.MIN_VALUE;
        this.j.postDelayed(this.f, this.k);
        return true;
    }

    @Override // defpackage.acbt
    public final boolean e() {
        h();
        return this.a.e();
    }

    @Override // defpackage.accf
    public final void f(accg accgVar) {
        long j;
        this.j.removeCallbacks(this.f);
        if (!this.o) {
            return;
        }
        if (accgVar != this.b) {
            Log.e("VideoCaptureFRC", "Unexpected video source");
        }
        long h = this.i.h();
        long j2 = this.n;
        if (j2 < 0) {
            this.n = h;
            j2 = h;
        }
        try {
            if (h >= j2 - this.m) {
                if (this.p) {
                    accgVar.a(this.g, j2);
                }
                do {
                    j = this.n + this.l;
                    this.n = j;
                } while (j <= h);
            }
        } catch (Exception e) {
            Log.e("VideoCaptureFRC", "Error copying frame to encoder", e);
            acbs acbsVar = this.e;
            if (acbsVar != null) {
                acbsVar.a(this, 7);
            }
        }
        this.j.postDelayed(this.f, this.k);
    }

    @Override // defpackage.acbt
    public final String g() {
        return this.h;
    }

    @Override // defpackage.acbt
    public final boolean j() {
        return this.o && this.a.j();
    }

    @Override // defpackage.acbt
    public final boolean k() {
        if (!this.a.k()) {
            return false;
        }
        this.p = true;
        return true;
    }

    @Override // defpackage.acbt
    public final boolean l(acbr acbrVar) {
        h();
        return this.a.l(acbrVar);
    }

    @Override // defpackage.acbt
    public final boolean m() {
        throw null;
    }
}
