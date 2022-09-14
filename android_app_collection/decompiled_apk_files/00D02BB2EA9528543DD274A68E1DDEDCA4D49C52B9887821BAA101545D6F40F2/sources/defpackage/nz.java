package defpackage;

import android.os.Build;
import android.view.View;
/* compiled from: PG */
/* renamed from: nz  reason: default package */
/* loaded from: classes.dex */
public abstract class nz<T> {
    private final int a;
    private final Class<T> b;
    private final int c;
    private final int d;

    public nz(int i, Class<T> cls) {
        this(i, cls, 0, 28);
    }

    public nz(int i, Class<T> cls, int i2, int i3) {
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean f(Boolean bool, Boolean bool2) {
        return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
    }

    private final boolean g() {
        return Build.VERSION.SDK_INT >= this.c;
    }

    public abstract void a(View view, T t);

    public abstract T b(View view);

    public boolean c(T t, T t2) {
        throw null;
    }

    public final void d(View view, T t) {
        if (!g()) {
            if (!c(e(view), t)) {
                return;
            }
            od.aC(view);
            view.setTag(this.a, t);
            od.ay(view, this.d);
            return;
        }
        a(view, t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final T e(View view) {
        if (!g()) {
            T t = (T) view.getTag(this.a);
            if (!this.b.isInstance(t)) {
                return null;
            }
            return t;
        }
        return b(view);
    }
}
