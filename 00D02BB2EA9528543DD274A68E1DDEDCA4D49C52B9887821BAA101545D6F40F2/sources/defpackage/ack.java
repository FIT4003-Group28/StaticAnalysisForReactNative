package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
/* compiled from: PG */
/* renamed from: ack  reason: default package */
/* loaded from: classes.dex */
public final class ack implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public final /* synthetic */ RecyclerView e;
    public Interpolator d = RecyclerView.Q;
    private boolean f = false;
    private boolean g = false;

    public ack(RecyclerView recyclerView) {
        this.e = recyclerView;
        this.c = new OverScroller(recyclerView.getContext(), RecyclerView.Q);
    }

    private final void d() {
        this.e.removeCallbacks(this);
        od.j(this.e, this);
    }

    public final void a() {
        if (this.f) {
            this.g = true;
        } else {
            d();
        }
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        int i4;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            int sqrt = (int) Math.sqrt(dcyn.a);
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            int width = abs > abs2 ? this.e.getWidth() : this.e.getHeight();
            float f = width;
            float f2 = width / 2;
            float sin = f2 + (((float) Math.sin((Math.min(1.0f, sqrt2 / f) - 0.5f) * 0.47123894f)) * f2);
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (abs <= abs2) {
                    abs = abs2;
                }
                i4 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            i3 = Math.min(i4, 2000);
        }
        int i5 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.Q;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(this.e.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        this.e.f(2);
        this.c.startScroll(0, 0, i, i2, i5);
        if (Build.VERSION.SDK_INT < 23) {
            this.c.computeScrollOffset();
        }
        a();
    }

    public final void c() {
        this.e.removeCallbacks(this);
        this.c.abortAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ack.run():void");
    }
}
