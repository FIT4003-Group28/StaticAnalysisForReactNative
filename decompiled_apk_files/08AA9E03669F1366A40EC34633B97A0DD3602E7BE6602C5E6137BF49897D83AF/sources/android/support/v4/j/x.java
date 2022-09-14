package android.support.v4.j;

import android.os.Build;
import android.view.WindowInsets;
/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final Object f557a;

    private x(Object obj) {
        this.f557a = obj;
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f557a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f557a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f557a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f557a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public boolean e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f557a).isConsumed();
        }
        return false;
    }

    public x a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new x(((WindowInsets) this.f557a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f557a == null ? xVar.f557a == null : this.f557a.equals(xVar.f557a);
    }

    public int hashCode() {
        if (this.f557a == null) {
            return 0;
        }
        return this.f557a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new x(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(x xVar) {
        if (xVar == null) {
            return null;
        }
        return xVar.f557a;
    }
}
