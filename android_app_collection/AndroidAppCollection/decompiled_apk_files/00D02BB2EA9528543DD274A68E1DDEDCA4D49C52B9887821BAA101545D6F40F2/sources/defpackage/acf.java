package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: acf  reason: default package */
/* loaded from: classes2.dex */
public final class acf {
    public int a = -1;
    private boolean f = false;
    private int g = 0;
    private int b = 0;
    private int c = 0;
    private int d = Integer.MIN_VALUE;
    private Interpolator e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(RecyclerView recyclerView) {
        int i = this.a;
        if (i >= 0) {
            this.a = -1;
            recyclerView.m(i);
            this.f = false;
        } else if (!this.f) {
            this.g = 0;
        } else {
            Interpolator interpolator = this.e;
            if (interpolator == null || this.d > 0) {
                int i2 = this.d;
                if (i2 > 0) {
                    recyclerView.G.b(this.b, this.c, i2, interpolator);
                    this.g++;
                    this.f = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = interpolator;
        this.f = true;
    }
}
