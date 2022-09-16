package c.f.a;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public class d {
    private static final PointF o = new PointF();
    private static final float[] p = new float[2];
    private static final Matrix q = new Matrix();
    private static final float[] r = new float[2];
    private static final Comparator<b> s = new a();

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f4897a;

    /* renamed from: b  reason: collision with root package name */
    private final e f4898b;

    /* renamed from: c  reason: collision with root package name */
    private final p f4899c;

    /* renamed from: d  reason: collision with root package name */
    private final b[] f4900d = new b[20];

    /* renamed from: e  reason: collision with root package name */
    private final b[] f4901e = new b[20];

    /* renamed from: f  reason: collision with root package name */
    private final b[] f4902f = new b[20];

    /* renamed from: g  reason: collision with root package name */
    private final b[] f4903g = new b[20];

    /* renamed from: h  reason: collision with root package name */
    private int f4904h = 0;
    private int i = 0;
    private boolean j = false;
    private int k = 0;
    private boolean l = false;
    private int m = 0;
    private float n = 0.0f;

    /* loaded from: classes.dex */
    static class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            if ((!bVar.u || !bVar2.u) && (!bVar.v || !bVar2.v)) {
                if (bVar.u) {
                    return -1;
                }
                if (bVar2.u) {
                    return 1;
                }
                if (bVar.v) {
                    return -1;
                }
                return bVar2.v ? 1 : 0;
            }
            return Integer.signum(bVar2.t - bVar.t);
        }
    }

    public d(ViewGroup viewGroup, e eVar, p pVar) {
        this.f4897a = viewGroup;
        this.f4898b = eVar;
        this.f4899c = pVar;
    }

    private void a() {
        for (int i = this.i - 1; i >= 0; i--) {
            this.f4901e[i].c();
        }
        int i2 = this.f4904h;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4902f[i3] = this.f4900d[i3];
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            this.f4902f[i4].c();
        }
    }

    private static void a(float f2, float f3, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f2 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f3 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = p;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = q;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f4 = fArr[0];
            scrollY = fArr[1];
            scrollX = f4;
        }
        pointF.set(scrollX, scrollY);
    }

    private void a(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.f4897a) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            a(viewGroup, motionEvent, fArr);
            PointF pointF = o;
            a(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
        }
    }

    private void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.i;
            if (i >= i2) {
                b[] bVarArr = this.f4901e;
                if (i2 >= bVarArr.length) {
                    throw new IllegalStateException("Too many recognizers");
                }
                this.i = i2 + 1;
                bVarArr[i2] = bVar;
                bVar.v = true;
                int i3 = this.m;
                this.m = i3 + 1;
                bVar.t = i3;
                return;
            } else if (this.f4901e[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    private void a(b bVar, MotionEvent motionEvent) {
        if (!c(bVar.m())) {
            bVar.c();
        } else if (!bVar.s()) {
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (bVar.v && actionMasked == 2) {
                return;
            }
            float[] fArr = r;
            a(bVar.m(), motionEvent, fArr);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            motionEvent.setLocation(fArr[0], fArr[1]);
            bVar.b(motionEvent);
            if (bVar.u) {
                bVar.a(motionEvent);
            }
            motionEvent.setLocation(x, y);
            if (actionMasked != 1 && actionMasked != 6) {
                return;
            }
            bVar.c(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
    }

    private void a(b bVar, View view) {
        int i = 0;
        while (true) {
            int i2 = this.f4904h;
            if (i >= i2) {
                b[] bVarArr = this.f4900d;
                if (i2 >= bVarArr.length) {
                    throw new IllegalStateException("Too many recognizers");
                }
                this.f4904h = i2 + 1;
                bVarArr[i2] = bVar;
                bVar.u = false;
                bVar.v = false;
                bVar.t = Integer.MAX_VALUE;
                bVar.a(view, this);
                return;
            } else if (this.f4900d[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    private static boolean a(float f2, float f3, View view) {
        return f2 >= 0.0f && f2 <= ((float) view.getWidth()) && f3 >= 0.0f && f3 < ((float) view.getHeight());
    }

    private static boolean a(int i) {
        return i == 3 || i == 1 || i == 5;
    }

    private boolean a(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.n;
    }

    private static boolean a(View view, float[] fArr) {
        return (!(view instanceof ViewGroup) || view.getBackground() != null) && a(fArr[0], fArr[1], view);
    }

    private boolean a(View view, float[] fArr, int i) {
        ArrayList<b> a2 = this.f4898b.a(view);
        if (a2 != null) {
            int size = a2.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = a2.get(i2);
                if (bVar.n() && bVar.a(view, fArr[0], fArr[1])) {
                    a(bVar, view);
                    bVar.b(i);
                    z = true;
                }
            }
            return z;
        }
        return false;
    }

    private boolean a(ViewGroup viewGroup, float[] fArr, int i) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View a2 = this.f4899c.a(viewGroup, childCount);
            if (a(a2)) {
                PointF pointF = o;
                a(fArr[0], fArr[1], viewGroup, a2, pointF);
                float f2 = fArr[0];
                float f3 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean b2 = (!b(a2) || a(fArr[0], fArr[1], a2)) ? b(a2, fArr, i) : false;
                fArr[0] = f2;
                fArr[1] = f3;
                if (b2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(b bVar, b bVar2) {
        return bVar == bVar2 || bVar.c(bVar2) || bVar2.c(bVar);
    }

    private void b() {
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            b[] bVarArr = this.f4901e;
            if (bVarArr[i2].v) {
                bVarArr[i] = bVarArr[i2];
                i++;
            }
        }
        this.i = i;
    }

    private boolean b(View view) {
        return !(view instanceof ViewGroup) || this.f4899c.a((ViewGroup) view);
    }

    private boolean b(View view, float[] fArr, int i) {
        l a2 = this.f4899c.a(view);
        if (a2 == l.NONE) {
            return false;
        }
        if (a2 == l.BOX_ONLY) {
            return a(view, fArr, i) || a(view, fArr);
        } else if (a2 == l.BOX_NONE) {
            if (!(view instanceof ViewGroup)) {
                return false;
            }
            return a((ViewGroup) view, fArr, i);
        } else if (a2 == l.AUTO) {
            return a(view, fArr, i) || (view instanceof ViewGroup ? a((ViewGroup) view, fArr, i) : false) || a(view, fArr);
        } else {
            throw new IllegalArgumentException("Unknown pointer event type: " + a2.toString());
        }
    }

    private boolean b(b bVar) {
        for (int i = 0; i < this.f4904h; i++) {
            b bVar2 = this.f4900d[i];
            if (!a(bVar2.k()) && c(bVar, bVar2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(b bVar, b bVar2) {
        if (bVar.a(bVar2) && !a(bVar, bVar2)) {
            if (bVar == bVar2) {
                return true;
            }
            if (!bVar.v && bVar.k() != 4) {
                return true;
            }
            return bVar.b(bVar2);
        }
        return false;
    }

    private void c() {
        boolean z = false;
        for (int i = this.f4904h - 1; i >= 0; i--) {
            b bVar = this.f4900d[i];
            if (a(bVar.k()) && !bVar.v) {
                this.f4900d[i] = null;
                bVar.r();
                bVar.u = false;
                bVar.v = false;
                bVar.t = Integer.MAX_VALUE;
                z = true;
            }
        }
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f4904h; i3++) {
                b[] bVarArr = this.f4900d;
                if (bVarArr[i3] != null) {
                    bVarArr[i2] = bVarArr[i3];
                    i2++;
                }
            }
            this.f4904h = i2;
        }
        this.l = false;
    }

    private void c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        r[0] = motionEvent.getX(actionIndex);
        r[1] = motionEvent.getY(actionIndex);
        b(this.f4897a, r, pointerId);
        a(this.f4897a, r, pointerId);
    }

    private void c(b bVar) {
        int k = bVar.k();
        bVar.v = false;
        bVar.u = true;
        int i = this.m;
        this.m = i + 1;
        bVar.t = i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4904h; i3++) {
            b bVar2 = this.f4900d[i3];
            if (b(bVar2, bVar)) {
                this.f4903g[i2] = bVar2;
                i2++;
            }
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            this.f4903g[i4].c();
        }
        for (int i5 = this.i - 1; i5 >= 0; i5--) {
            b bVar3 = this.f4901e[i5];
            if (b(bVar3, bVar)) {
                bVar3.c();
                bVar3.v = false;
            }
        }
        b();
        bVar.a(4, 2);
        if (k != 4) {
            bVar.a(5, 4);
            if (k == 5) {
                return;
            }
            bVar.a(0, 5);
        }
    }

    private boolean c(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f4897a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f4897a) {
            parent = parent.getParent();
        }
        return parent == this.f4897a;
    }

    private static boolean c(b bVar, b bVar2) {
        return bVar != bVar2 && (bVar.e(bVar2) || bVar2.d(bVar));
    }

    private void d() {
        if (this.j || this.k != 0) {
            this.l = true;
        } else {
            c();
        }
    }

    private void d(b bVar) {
        if (b(bVar)) {
            a(bVar);
            return;
        }
        c(bVar);
        bVar.v = false;
    }

    public void a(float f2) {
        this.n = f2;
    }

    public void a(MotionEvent motionEvent) {
        int i = this.f4904h;
        System.arraycopy(this.f4900d, 0, this.f4902f, 0, i);
        Arrays.sort(this.f4902f, 0, i, s);
        for (int i2 = 0; i2 < i; i2++) {
            a(this.f4902f[i2], motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar, int i, int i2) {
        this.k++;
        if (a(i)) {
            for (int i3 = 0; i3 < this.i; i3++) {
                b bVar2 = this.f4901e[i3];
                if (c(bVar2, bVar)) {
                    if (i == 5) {
                        bVar2.c();
                        bVar2.v = false;
                    } else {
                        d(bVar2);
                    }
                }
            }
            b();
        }
        if (i == 4) {
            d(bVar);
        } else if ((i2 != 4 && i2 != 5) || bVar.u) {
            bVar.a(i, i2);
        }
        this.k--;
        d();
    }

    public boolean b(MotionEvent motionEvent) {
        this.j = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            c(motionEvent);
        } else if (actionMasked == 3) {
            a();
        }
        a(motionEvent);
        this.j = false;
        if (this.l && this.k == 0) {
            c();
        }
        return true;
    }
}
