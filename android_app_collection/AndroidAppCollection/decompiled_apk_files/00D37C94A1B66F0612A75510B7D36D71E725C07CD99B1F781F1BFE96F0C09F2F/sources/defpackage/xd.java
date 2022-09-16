package defpackage;

import android.graphics.Rect;
import android.view.View;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: xd  reason: default package */
/* loaded from: classes4.dex */
public abstract class xd {
    protected final xw a;
    public int b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    final Rect c = new Rect();

    public xd(xw xwVar) {
        this.a = xwVar;
    }

    public static xd p(xw xwVar) {
        return new xb(xwVar);
    }

    public static xd q(xw xwVar, int i) {
        if (i != 0) {
            return r(xwVar);
        }
        return p(xwVar);
    }

    public static xd r(xw xwVar) {
        return new xc(xwVar);
    }

    public abstract int a(View view);

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View view);

    public abstract int m(View view);

    public abstract void n(int i);

    public final int o() {
        if (this.b == Integer.MIN_VALUE) {
            return 0;
        }
        return k() - this.b;
    }
}
