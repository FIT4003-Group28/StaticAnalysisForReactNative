package c.f.a;

import android.view.MotionEvent;
import android.view.View;
import c.f.a.b;
import java.util.Arrays;
/* loaded from: classes.dex */
public class b<T extends b> {
    private static int w = 11;
    private static MotionEvent.PointerProperties[] x;
    private static MotionEvent.PointerCoords[] y;

    /* renamed from: c  reason: collision with root package name */
    private int f4891c;

    /* renamed from: d  reason: collision with root package name */
    private View f4892d;

    /* renamed from: f  reason: collision with root package name */
    private float f4894f;

    /* renamed from: g  reason: collision with root package name */
    private float f4895g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4896h;
    private float[] j;
    private float k;
    private float l;
    private float m;
    private float n;
    private boolean o;
    private d q;
    private i<T> r;
    private c s;
    int t;
    boolean u;
    boolean v;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f4889a = new int[w];

    /* renamed from: b  reason: collision with root package name */
    private int f4890b = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f4893e = 0;
    private boolean i = true;
    private int p = 0;

    private static boolean a(float f2) {
        return !Float.isNaN(f2);
    }

    private MotionEvent d(MotionEvent motionEvent) {
        int actionIndex;
        if (!e(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = 2;
        int i2 = 5;
        if (actionMasked == 0 || actionMasked == 5) {
            actionIndex = motionEvent.getActionIndex();
            if (this.f4889a[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f4890b == 1) {
                    i2 = 0;
                }
                i = i2;
            }
        } else {
            i2 = 6;
            if (actionMasked == 1 || actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
                if (this.f4889a[motionEvent.getPointerId(actionIndex)] != -1) {
                    if (this.f4890b == 1) {
                        i2 = 1;
                    }
                    i = i2;
                }
            } else {
                i = actionMasked;
                actionIndex = -1;
            }
        }
        d(this.f4890b);
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        int pointerCount = motionEvent.getPointerCount();
        int i3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < pointerCount; i5++) {
            int pointerId = motionEvent.getPointerId(i5);
            if (this.f4889a[pointerId] != -1) {
                motionEvent.getPointerProperties(i5, x[i4]);
                x[i4].id = this.f4889a[pointerId];
                motionEvent.getPointerCoords(i5, y[i4]);
                if (i5 == actionIndex) {
                    i3 |= i4 << 8;
                }
                i4++;
            }
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i3, i4, x, y, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        motionEvent.setLocation(x2, y2);
        obtain.setLocation(x2, y2);
        return obtain;
    }

    private static void d(int i) {
        if (x == null) {
            int i2 = w;
            x = new MotionEvent.PointerProperties[i2];
            y = new MotionEvent.PointerCoords[i2];
        }
        while (i > 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = x;
            int i3 = i - 1;
            if (pointerPropertiesArr[i3] != null) {
                return;
            }
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
            y[i3] = new MotionEvent.PointerCoords();
            i--;
        }
    }

    private void e(int i) {
        int i2 = this.f4893e;
        if (i2 == i) {
            return;
        }
        this.f4893e = i;
        this.q.a(this, i, i2);
        b(i, i2);
    }

    private boolean e(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f4890b) {
            return true;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f4889a;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != -1 && iArr[i] != i) {
                return true;
            }
            i++;
        }
    }

    private int t() {
        int i = 0;
        while (i < this.f4890b) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f4889a;
                if (i2 >= iArr.length || iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == this.f4889a.length) {
                return i;
            }
            i++;
        }
        return i;
    }

    public T a(float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.j == null) {
            this.j = new float[6];
        }
        float[] fArr = this.j;
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        if (!a(f6) || !a(f2) || !a(f4)) {
            if (a(f6) && !a(f2) && !a(f4)) {
                throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
            }
            if (a(f7) && a(f5) && a(f3)) {
                throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
            }
            if (a(f7) && !a(f5) && !a(f3)) {
                throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
            }
            return this;
        }
        throw new IllegalArgumentException("Cannot have all of left, right and width defined");
    }

    public T a(c cVar) {
        this.s = cVar;
        return this;
    }

    public b a(i<T> iVar) {
        this.r = iVar;
        return this;
    }

    public T a(boolean z) {
        if (this.f4892d != null) {
            c();
        }
        this.i = z;
        return this;
    }

    public final void a() {
        int i = this.f4893e;
        if (i == 0 || i == 2) {
            e(4);
        }
    }

    public void a(int i) {
        this.f4891c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        i<T> iVar = this.r;
        if (iVar != null) {
            iVar.a(this, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MotionEvent motionEvent) {
        i<T> iVar = this.r;
        if (iVar != null) {
            iVar.a(this, motionEvent);
        }
    }

    public final void a(View view, d dVar) {
        if (this.f4892d == null && this.q == null) {
            Arrays.fill(this.f4889a, -1);
            this.f4890b = 0;
            this.f4893e = 0;
            this.f4892d = view;
            this.q = dVar;
            return;
        }
        throw new IllegalStateException("Already prepared or hasn't been reset");
    }

    public boolean a(View view, float f2, float f3) {
        float f4;
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.j;
        float f5 = 0.0f;
        if (fArr != null) {
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[2];
            float f9 = fArr[3];
            f4 = a(f6) ? 0.0f - f6 : 0.0f;
            if (a(f7)) {
                f5 = 0.0f - f9;
            }
            if (a(f8)) {
                width += f8;
            }
            if (a(f9)) {
                height += f9;
            }
            float[] fArr2 = this.j;
            float f10 = fArr2[4];
            float f11 = fArr2[5];
            if (a(f10)) {
                if (!a(f6)) {
                    f4 = width - f10;
                } else if (!a(f8)) {
                    width = f10 + f4;
                }
            }
            if (a(f11)) {
                if (!a(f5)) {
                    f5 = height - f11;
                } else if (!a(height)) {
                    height = f5 + f11;
                }
            }
        } else {
            f4 = 0.0f;
        }
        return f2 >= f4 && f2 <= width && f3 >= f5 && f3 <= height;
    }

    public boolean a(b bVar) {
        int i = 0;
        while (true) {
            int[] iArr = this.f4889a;
            if (i < iArr.length) {
                if (iArr[i] != -1 && bVar.f4889a[i] != -1) {
                    return true;
                }
                i++;
            } else {
                return false;
            }
        }
    }

    public T b(boolean z) {
        this.o = z;
        return this;
    }

    public final void b() {
        if (this.f4893e == 0) {
            e(2);
        }
    }

    public void b(int i) {
        int[] iArr = this.f4889a;
        if (iArr[i] == -1) {
            iArr[i] = t();
            this.f4890b++;
        }
    }

    protected void b(int i, int i2) {
    }

    public final void b(MotionEvent motionEvent) {
        int i;
        if (!this.i || (i = this.f4893e) == 3 || i == 1 || i == 5 || this.f4890b < 1) {
            return;
        }
        MotionEvent d2 = d(motionEvent);
        this.f4894f = d2.getX();
        this.f4895g = d2.getY();
        this.p = d2.getPointerCount();
        this.f4896h = a(this.f4892d, this.f4894f, this.f4895g);
        if (this.o && !this.f4896h) {
            int i2 = this.f4893e;
            if (i2 == 4) {
                c();
                return;
            } else if (i2 != 2) {
                return;
            } else {
                e();
                return;
            }
        }
        this.k = f.a(d2, true);
        this.l = f.b(d2, true);
        this.m = d2.getRawX() - d2.getX();
        this.n = d2.getRawY() - d2.getY();
        c(d2);
        if (d2 == motionEvent) {
            return;
        }
        d2.recycle();
    }

    public boolean b(b bVar) {
        c cVar;
        if (bVar == this || (cVar = this.s) == null) {
            return false;
        }
        return cVar.d(this, bVar);
    }

    public final void c() {
        int i = this.f4893e;
        if (i == 4 || i == 0 || i == 2) {
            p();
            e(3);
        }
    }

    public void c(int i) {
        int[] iArr = this.f4889a;
        if (iArr[i] != -1) {
            iArr[i] = -1;
            this.f4890b--;
        }
    }

    protected void c(MotionEvent motionEvent) {
        e(1);
    }

    public boolean c(b bVar) {
        if (bVar == this) {
            return true;
        }
        c cVar = this.s;
        if (cVar == null) {
            return false;
        }
        return cVar.a(this, bVar);
    }

    public final void d() {
        int i = this.f4893e;
        if (i == 2 || i == 4) {
            e(5);
        }
    }

    public boolean d(b bVar) {
        c cVar;
        if (bVar == this || (cVar = this.s) == null) {
            return false;
        }
        return cVar.c(this, bVar);
    }

    public final void e() {
        int i = this.f4893e;
        if (i == 4 || i == 0 || i == 2) {
            e(1);
        }
    }

    public boolean e(b bVar) {
        c cVar;
        if (bVar == this || (cVar = this.s) == null) {
            return false;
        }
        return cVar.b(this, bVar);
    }

    public float f() {
        return this.k;
    }

    public float g() {
        return this.l;
    }

    public float h() {
        return this.k - this.m;
    }

    public float i() {
        return this.l - this.n;
    }

    public int j() {
        return this.p;
    }

    public int k() {
        return this.f4893e;
    }

    public int l() {
        return this.f4891c;
    }

    public View m() {
        return this.f4892d;
    }

    public boolean n() {
        return this.i;
    }

    public boolean o() {
        return this.f4896h;
    }

    protected void p() {
    }

    protected void q() {
    }

    public final void r() {
        this.f4892d = null;
        this.q = null;
        Arrays.fill(this.f4889a, -1);
        this.f4890b = 0;
        q();
    }

    public boolean s() {
        int i;
        return (!this.i || (i = this.f4893e) == 1 || i == 3 || i == 5 || this.f4890b <= 0) ? false : true;
    }

    public String toString() {
        View view = this.f4892d;
        String simpleName = view == null ? null : view.getClass().getSimpleName();
        return getClass().getSimpleName() + "@[" + this.f4891c + "]:" + simpleName;
    }
}
