package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aga  reason: default package */
/* loaded from: classes.dex */
public class aga extends abp implements abu {
    private afv A;
    float c;
    float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final afu j;
    int k;
    public RecyclerView m;
    VelocityTracker o;
    ni q;
    public Rect r;
    public long s;
    private float u;
    private float v;
    private int x;
    private List<acl> y;
    private List<Integer> z;
    final List<View> a = new ArrayList();
    private final float[] t = new float[2];
    acl b = null;
    int i = -1;
    private int w = 0;
    final List<afx> l = new ArrayList();
    final Runnable n = new afo(this);
    View p = null;
    private final abw B = new afp(this);

    public aga(afu afuVar) {
        this.j = afuVar;
    }

    private static boolean o(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final void p(float[] fArr) {
        if ((this.k & 12) != 0) {
            fArr[0] = (this.g + this.e) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.k & 3) != 0) {
            fArr[1] = (this.h + this.f) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private final void q() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    private final int r(int i) {
        if ((i & 12) != 0) {
            int i2 = 8;
            int i3 = this.e > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null && this.i >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.v);
                float xVelocity = this.o.getXVelocity(this.i);
                float yVelocity = this.o.getYVelocity(this.i);
                if (xVelocity <= 0.0f) {
                    i2 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2 && abs >= this.u && abs > Math.abs(yVelocity)) {
                    return i2;
                }
            }
            float width = this.m.getWidth() * 0.5f;
            if ((i & i3) != 0 && Math.abs(this.e) > width) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    private final int s(int i) {
        if ((i & 3) != 0) {
            int i2 = 2;
            int i3 = this.f > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null && this.i >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.v);
                float xVelocity = this.o.getXVelocity(this.i);
                float yVelocity = this.o.getYVelocity(this.i);
                if (yVelocity <= 0.0f) {
                    i2 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3 && abs >= this.u && abs > Math.abs(xVelocity)) {
                    return i2;
                }
            }
            float height = this.m.getHeight() * 0.5f;
            if ((i & i3) != 0 && Math.abs(this.f) > height) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    @Override // defpackage.abu
    public final void a(View view) {
        n(view);
        acl V = this.m.V(view);
        if (V == null) {
            return;
        }
        acl aclVar = this.b;
        if (aclVar == null || V != aclVar) {
            h(V, false);
            if (!this.a.remove(V.a)) {
                return;
            }
            this.j.j(this.m, V);
            return;
        }
        f(null, 0);
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        rect.setEmpty();
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.b != null) {
            p(this.t);
            float[] fArr = this.t;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        afu afuVar = this.j;
        acl aclVar = this.b;
        List<afx> list = this.l;
        int i = this.w;
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            afx afxVar = list.get(i2);
            float f4 = afxVar.d;
            float f5 = afxVar.f;
            if (f4 == f5) {
                afxVar.l = afxVar.h.a.getTranslationX();
            } else {
                afxVar.l = f4 + (afxVar.p * (f5 - f4));
            }
            float f6 = afxVar.e;
            float f7 = afxVar.g;
            if (f6 == f7) {
                afxVar.m = afxVar.h.a.getTranslationY();
            } else {
                afxVar.m = f6 + (afxVar.p * (f7 - f6));
            }
            int save = canvas.save();
            afuVar.k(canvas, recyclerView, afxVar.h, afxVar.l, afxVar.m, afxVar.i, false);
            canvas.restoreToCount(save);
            i2++;
        }
        if (aclVar != null) {
            int save2 = canvas.save();
            afuVar.k(canvas, recyclerView, aclVar, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.abu
    public final void d() {
    }

    public final void e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.h(this);
            this.m.E(this.B);
            List<abu> list = this.m.v;
            if (list != null) {
                list.remove(this);
            }
            int size = this.l.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                afx afxVar = this.l.get(0);
                afxVar.a();
                this.j.j(this.m, afxVar.h);
            }
            this.l.clear();
            this.p = null;
            q();
            afv afvVar = this.A;
            if (afvVar != null) {
                afvVar.a = false;
                this.A = null;
            }
            if (this.q != null) {
                this.q = null;
            }
        }
        this.m = recyclerView;
        if (recyclerView == null) {
            return;
        }
        Resources resources = recyclerView.getResources();
        this.u = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.v = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        this.x = ViewConfiguration.get(this.m.getContext()).getScaledTouchSlop();
        this.m.g(this);
        this.m.D(this.B);
        RecyclerView recyclerView3 = this.m;
        if (recyclerView3.v == null) {
            recyclerView3.v = new ArrayList();
        }
        recyclerView3.v.add(this);
        this.A = new afv(this);
        this.q = new ni(this.m.getContext(), this.A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
        if (r0 <= 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.acl r20, int r21) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aga.f(acl, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(acl aclVar) {
        List<acl> list;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        if (!this.m.isLayoutRequested() && this.w == 2) {
            int i3 = (int) (this.g + this.e);
            int i4 = (int) (this.h + this.f);
            if (Math.abs(i4 - aclVar.a.getTop()) < aclVar.a.getHeight() * 0.5f && Math.abs(i3 - aclVar.a.getLeft()) < aclVar.a.getWidth() * 0.5f) {
                return;
            }
            List<acl> list2 = this.y;
            if (list2 == null) {
                this.y = new ArrayList();
                this.z = new ArrayList();
            } else {
                list2.clear();
                this.z.clear();
            }
            int round = Math.round(this.g + this.e);
            int round2 = Math.round(this.h + this.f);
            int width = aclVar.a.getWidth() + round;
            int height = aclVar.a.getHeight() + round2;
            int i5 = (round + width) / 2;
            int i6 = (round2 + height) / 2;
            abs absVar = this.m.l;
            int aJ = absVar.aJ();
            int i7 = 0;
            while (i7 < aJ) {
                View aK = absVar.aK(i7);
                if (aK != aclVar.a && aK.getBottom() >= round2 && aK.getTop() <= height && aK.getRight() >= round && aK.getLeft() <= width) {
                    acl V = this.m.V(aK);
                    int abs5 = Math.abs(i5 - ((aK.getLeft() + aK.getRight()) / 2));
                    int abs6 = Math.abs(i6 - ((aK.getTop() + aK.getBottom()) / 2));
                    int i8 = (abs5 * abs5) + (abs6 * abs6);
                    int size = this.y.size();
                    i = round;
                    i2 = round2;
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < size) {
                        int i11 = size;
                        if (i8 <= this.z.get(i9).intValue()) {
                            break;
                        }
                        i10++;
                        i9++;
                        size = i11;
                    }
                    this.y.add(i10, V);
                    this.z.add(i10, Integer.valueOf(i8));
                } else {
                    i = round;
                    i2 = round2;
                }
                i7++;
                round = i;
                round2 = i2;
            }
            List<acl> list3 = this.y;
            if (list3.size() == 0) {
                return;
            }
            int width2 = aclVar.a.getWidth() + i3;
            int height2 = aclVar.a.getHeight() + i4;
            int left2 = i3 - aclVar.a.getLeft();
            int top2 = i4 - aclVar.a.getTop();
            int size2 = list3.size();
            acl aclVar2 = null;
            int i12 = -1;
            int i13 = 0;
            while (i13 < size2) {
                acl aclVar3 = list3.get(i13);
                if (left2 <= 0 || (right = aclVar3.a.getRight() - width2) >= 0) {
                    list = list3;
                } else {
                    list = list3;
                    if (aclVar3.a.getRight() > aclVar.a.getRight() && (abs4 = Math.abs(right)) > i12) {
                        i12 = abs4;
                        aclVar2 = aclVar3;
                    }
                }
                if (left2 < 0 && (left = aclVar3.a.getLeft() - i3) > 0 && aclVar3.a.getLeft() < aclVar.a.getLeft() && (abs3 = Math.abs(left)) > i12) {
                    i12 = abs3;
                    aclVar2 = aclVar3;
                }
                if (top2 < 0 && (top = aclVar3.a.getTop() - i4) > 0 && aclVar3.a.getTop() < aclVar.a.getTop() && (abs2 = Math.abs(top)) > i12) {
                    i12 = abs2;
                    aclVar2 = aclVar3;
                }
                if (top2 > 0 && (bottom = aclVar3.a.getBottom() - height2) < 0 && aclVar3.a.getBottom() > aclVar.a.getBottom() && (abs = Math.abs(bottom)) > i12) {
                    i12 = abs;
                    aclVar2 = aclVar3;
                }
                i13++;
                list3 = list;
            }
            if (aclVar2 == null) {
                this.y.clear();
                this.z.clear();
                return;
            }
            int f = aclVar2.f();
            aclVar.f();
            if (!this.j.n(aclVar, aclVar2)) {
                return;
            }
            RecyclerView recyclerView = this.m;
            abs absVar2 = recyclerView.l;
            if (absVar2 instanceof afz) {
                ((afz) absVar2).an(aclVar.a, aclVar2.a);
                return;
            }
            if (absVar2.D()) {
                if (abs.bB(aclVar2.a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.l(f);
                }
                if (abs.bC(aclVar2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.l(f);
                }
            }
            if (!absVar2.E()) {
                return;
            }
            if (abs.bD(aclVar2.a) <= recyclerView.getPaddingTop()) {
                recyclerView.l(f);
            }
            if (abs.bA(aclVar2.a) < recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                return;
            }
            recyclerView.l(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(acl aclVar, boolean z) {
        afx afxVar;
        int size = this.l.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            afxVar = this.l.get(size);
        } while (afxVar.h != aclVar);
        afxVar.n |= z;
        if (!afxVar.o) {
            afxVar.a();
        }
        this.l.remove(size);
    }

    public final void i() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.o = VelocityTracker.obtain();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i, MotionEvent motionEvent, int i2) {
        int o;
        View l;
        if (this.b != null || i != 2 || this.w == 2 || !this.j.g()) {
            return;
        }
        RecyclerView recyclerView = this.m;
        if (recyclerView.D == 1) {
            return;
        }
        abs absVar = recyclerView.l;
        int i3 = this.i;
        acl aclVar = null;
        if (i3 != -1) {
            int findPointerIndex = motionEvent.findPointerIndex(i3);
            float x = motionEvent.getX(findPointerIndex);
            float f = this.c;
            float y = motionEvent.getY(findPointerIndex);
            float f2 = this.d;
            float abs = Math.abs(x - f);
            float abs2 = Math.abs(y - f2);
            float f3 = this.x;
            if ((abs >= f3 || abs2 >= f3) && ((abs <= abs2 || !absVar.D()) && ((abs2 <= abs || !absVar.E()) && (l = l(motionEvent)) != null))) {
                aclVar = this.m.V(l);
            }
        }
        if (aclVar == null || (o = (this.j.o(this.m) >> 8) & 255) == 0) {
            return;
        }
        float x2 = motionEvent.getX(i2);
        float y2 = motionEvent.getY(i2);
        float f4 = x2 - this.c;
        float f5 = y2 - this.d;
        float abs3 = Math.abs(f4);
        float abs4 = Math.abs(f5);
        float f6 = this.x;
        if (abs3 < f6 && abs4 < f6) {
            return;
        }
        if (abs3 > abs4) {
            if (f4 < 0.0f && (o & 4) == 0) {
                return;
            }
            if (f4 > 0.0f && (o & 8) == 0) {
                return;
            }
        } else if (f5 < 0.0f && (o & 1) == 0) {
            return;
        } else {
            if (f5 > 0.0f && (o & 2) == 0) {
                return;
            }
        }
        this.f = 0.0f;
        this.e = 0.0f;
        this.i = motionEvent.getPointerId(0);
        f(aclVar, 1);
    }

    @Override // defpackage.abp
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            p(this.t);
        }
        acl aclVar = this.b;
        List<afx> list = this.l;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            afx afxVar = list.get(i);
            int save = canvas.save();
            acl aclVar2 = afxVar.h;
            float f = afxVar.l;
            float f2 = afxVar.m;
            int i2 = afxVar.i;
            canvas.restoreToCount(save);
        }
        if (aclVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            afx afxVar2 = list.get(size);
            if (!afxVar2.o) {
                z = true;
            } else if (!afxVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View l(MotionEvent motionEvent) {
        afx afxVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        acl aclVar = this.b;
        if (aclVar != null) {
            View view2 = aclVar.a;
            if (o(view2, x, y, this.g + this.e, this.h + this.f)) {
                return view2;
            }
        }
        int size = this.l.size();
        do {
            size--;
            if (size >= 0) {
                afxVar = this.l.get(size);
                view = afxVar.h.a;
            } else {
                RecyclerView recyclerView = this.m;
                int f = recyclerView.e.f();
                while (true) {
                    f--;
                    if (f < 0) {
                        return null;
                    }
                    View d = recyclerView.e.d(f);
                    float translationX = d.getTranslationX();
                    float translationY = d.getTranslationY();
                    if (x >= d.getLeft() + translationX && x <= d.getRight() + translationX && y >= d.getTop() + translationY && y <= d.getBottom() + translationY) {
                        return d;
                    }
                }
            }
        } while (!o(view, x, y, afxVar.l, afxVar.m));
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.c;
        this.e = f;
        this.f = y - this.d;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.e = f;
        }
        if ((i & 8) == 0) {
            this.e = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            this.f = Math.max(0.0f, this.f);
        }
        if ((i & 2) == 0) {
            this.f = Math.min(0.0f, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(View view) {
        if (view == this.p) {
            this.p = null;
        }
    }
}
