package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aac  reason: default package */
/* loaded from: classes.dex */
final class aac {
    aax a;
    int b;
    int c;
    boolean d;
    boolean e;

    public aac() {
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int d;
        if (this.d) {
            d = this.a.a();
        } else {
            d = this.a.d();
        }
        this.c = d;
    }

    public final void c(View view, int i) {
        int p = this.a.p();
        if (p >= 0) {
            d(view, i);
            return;
        }
        this.b = i;
        if (this.d) {
            int a = (this.a.a() - p) - this.a.g(view);
            this.c = this.a.a() - a;
            if (a <= 0) {
                return;
            }
            int e = this.a.e(view);
            int i2 = this.c;
            int d = this.a.d();
            int min = (i2 - e) - (d + Math.min(this.a.h(view) - d, 0));
            if (min >= 0) {
                return;
            }
            this.c += Math.min(a, -min);
            return;
        }
        int h = this.a.h(view);
        int d2 = h - this.a.d();
        this.c = h;
        if (d2 <= 0) {
            return;
        }
        int e2 = this.a.e(view);
        int a2 = (this.a.a() - Math.min(0, (this.a.a() - p) - this.a.g(view))) - (h + e2);
        if (a2 >= 0) {
            return;
        }
        this.c -= Math.min(d2, -a2);
    }

    public final void d(View view, int i) {
        if (this.d) {
            this.c = this.a.g(view) + this.a.p();
        } else {
            this.c = this.a.h(view);
        }
        this.b = i;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
