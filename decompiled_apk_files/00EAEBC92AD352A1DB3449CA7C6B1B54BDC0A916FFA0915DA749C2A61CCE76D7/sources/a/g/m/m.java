package a.g.m;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f366a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f367b;

    /* renamed from: c  reason: collision with root package name */
    private final View f368c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f369d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f370e;

    public m(View view) {
        this.f368c = view;
    }

    private void a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f366a = viewParent;
        } else if (i != 1) {
        } else {
            this.f367b = viewParent;
        }
    }

    private boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent d2;
        int i6;
        int i7;
        int[] iArr3;
        if (!b() || (d2 = d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f368c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] d3 = d();
            d3[0] = 0;
            d3[1] = 0;
            iArr3 = d3;
        } else {
            iArr3 = iArr2;
        }
        y.a(d2, this.f368c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f368c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    private ViewParent d(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.f367b;
            }
            return null;
        }
        return this.f366a;
    }

    private int[] d() {
        if (this.f370e == null) {
            this.f370e = new int[2];
        }
        return this.f370e;
    }

    public void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void a(boolean z) {
        if (this.f369d) {
            v.P(this.f368c);
        }
        this.f369d = z;
    }

    public boolean a() {
        return a(0);
    }

    public boolean a(float f2, float f3) {
        ViewParent d2;
        if (!b() || (d2 = d(0)) == null) {
            return false;
        }
        return y.a(d2, this.f368c, f2, f3);
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent d2;
        if (!b() || (d2 = d(0)) == null) {
            return false;
        }
        return y.a(d2, this.f368c, f2, f3, z);
    }

    public boolean a(int i) {
        return d(i) != null;
    }

    public boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (!b()) {
            return false;
        }
        View view = this.f368c;
        for (ViewParent parent = this.f368c.getParent(); parent != null; parent = parent.getParent()) {
            if (y.b(parent, view, this.f368c, i, i2)) {
                a(i2, parent);
                y.a(parent, view, this.f368c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return b(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return b(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d2;
        int i4;
        int i5;
        if (!b() || (d2 = d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f368c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = d();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        y.a(d2, this.f368c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f368c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean b() {
        return this.f369d;
    }

    public boolean b(int i) {
        return a(i, 0);
    }

    public void c() {
        c(0);
    }

    public void c(int i) {
        ViewParent d2 = d(i);
        if (d2 != null) {
            y.a(d2, this.f368c, i);
            a(i, (ViewParent) null);
        }
    }
}
