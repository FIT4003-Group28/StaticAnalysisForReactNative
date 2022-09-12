package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: aax  reason: default package */
/* loaded from: classes.dex */
public abstract class aax {
    public final abs a;
    public int b = Integer.MIN_VALUE;
    final Rect c = new Rect();

    public aax(abs absVar) {
        this.a = absVar;
    }

    public static aax q(abs absVar, int i) {
        if (i != 0) {
            if (i == 1) {
                return s(absVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return r(absVar);
    }

    public static aax r(abs absVar) {
        return new aav(absVar);
    }

    public static aax s(abs absVar) {
        return new aaw(absVar);
    }

    public abstract int a();

    public abstract int b();

    public abstract void c(int i);

    public abstract int d();

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h(View view);

    public abstract int i(View view);

    public abstract int j(View view);

    public abstract int k();

    public abstract void l(View view, int i);

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public final int p() {
        if (this.b == Integer.MIN_VALUE) {
            return 0;
        }
        return k() - this.b;
    }
}
