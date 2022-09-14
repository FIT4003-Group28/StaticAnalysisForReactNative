package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kya  reason: default package */
/* loaded from: classes7.dex */
public final class kya {
    public int a;
    public int b;
    public int c;
    public int d;
    private final View e;
    private final kxz f;
    private final int[] g;
    private final View.OnLayoutChangeListener h;
    private final View.OnAttachStateChangeListener i;

    public kya(View view, kxz kxzVar) {
        this.g = new int[2];
        this.h = new kxx(this);
        this.i = new kxy(this);
        this.e = view;
        this.f = kxzVar;
    }

    private final void d(int i, int i2, int i3, int i4) {
        if (i == this.a && i2 == this.b && i3 == this.c && i4 == this.d) {
            return;
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.f.a(i, i2, i3, i4);
    }

    public final void a() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e.addOnLayoutChangeListener(this.h);
        this.e.addOnAttachStateChangeListener(this.i);
        c(od.ae(this.e), od.ak(this.e));
    }

    public final void b() {
        this.e.removeOnAttachStateChangeListener(this.i);
        this.e.removeOnLayoutChangeListener(this.h);
    }

    public final void c(boolean z, boolean z2) {
        if (!z2) {
            return;
        }
        if (this.e.getVisibility() == 8) {
            d(0, 0, 0, 0);
        } else if (!z) {
            this.e.requestLayout();
        } else {
            this.e.getLocationOnScreen(this.g);
            int[] iArr = this.g;
            int i = iArr[0];
            d(i, iArr[1], this.e.getWidth() + i, this.g[1] + this.e.getHeight());
        }
    }

    public kya(View view, final Runnable runnable) {
        this.g = new int[2];
        this.h = new kxx(this);
        this.i = new kxy(this);
        dbsk.s(view);
        this.e = view;
        dbsk.s(runnable);
        this.f = new kxz(runnable) { // from class: kxw
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.kxz
            public final void a(int i, int i2, int i3, int i4) {
                this.a.run();
            }
        };
    }
}
