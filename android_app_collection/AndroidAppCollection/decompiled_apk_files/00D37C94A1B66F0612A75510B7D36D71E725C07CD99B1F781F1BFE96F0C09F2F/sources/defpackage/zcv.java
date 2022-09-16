package defpackage;

import android.view.VelocityTracker;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
/* compiled from: PG */
/* renamed from: zcv  reason: default package */
/* loaded from: classes4.dex */
public final class zcv extends amj {
    boolean a = false;
    int b = 0;
    final /* synthetic */ SwipeLayout c;

    public zcv(SwipeLayout swipeLayout) {
        this.c = swipeLayout;
    }

    @Override // defpackage.amj
    public final int a(View view) {
        return this.c.c.getWidth();
    }

    @Override // defpackage.amj
    public final void c(View view, int i) {
        this.a = true;
        this.b = view.getLeft();
        this.c.e().j();
    }

    @Override // defpackage.amj
    public final void e(View view, float f, float f2) {
        this.a = false;
        int left = this.c.c.getLeft();
        SwipeLayout swipeLayout = this.c;
        if (left < swipeLayout.a || f < 0.0f) {
            if (swipeLayout.c.getLeft() < 0 || f >= 0.0f) {
                int left2 = this.c.c.getLeft();
                SwipeLayout swipeLayout2 = this.c;
                if (left2 >= (-swipeLayout2.a) || f > 0.0f) {
                    swipeLayout2.g(f);
                    return;
                } else {
                    swipeLayout2.j(f);
                    return;
                }
            }
            this.c.g(f);
            return;
        }
        swipeLayout.i(f);
    }

    @Override // defpackage.amj
    public final boolean f(View view, int i) {
        return view == this.c.c;
    }

    @Override // defpackage.amj
    public final int g(View view, int i) {
        boolean s;
        VelocityTracker velocityTracker;
        int i2 = 0;
        if (view.getLeft() != 0 || (velocityTracker = this.c.d) == null || Math.abs(velocityTracker.getXVelocity()) >= this.c.b) {
            boolean q = this.c.q();
            boolean s2 = q ? this.c.s() : this.c.p();
            if (q) {
                s = this.c.p();
            } else {
                s = this.c.s();
            }
            int width = this.c.c.getWidth();
            int i3 = true != s ? 0 : width;
            if (s2) {
                i2 = -width;
            }
            return i > i3 ? i3 : i < i2 ? i2 : i;
        }
        return 0;
    }

    @Override // defpackage.amj
    public final void i(View view, int i, int i2, int i3) {
        int min;
        if (!this.a) {
            return;
        }
        this.b += i3;
        int a = this.c.a();
        int b = this.c.b();
        int i4 = this.b;
        int min2 = i4 > 0 ? Math.min(a, i4) : Math.max(-b, i4);
        int i5 = this.b;
        if (i5 > 0) {
            min = Math.max(0, i5 - a);
        } else {
            min = Math.min(0, i5 + b);
        }
        int i6 = min2 + ((int) (min * 0.3f));
        if (this.c.q()) {
            i6 = -i6;
        }
        this.c.l(i6);
        this.c.o();
    }
}
