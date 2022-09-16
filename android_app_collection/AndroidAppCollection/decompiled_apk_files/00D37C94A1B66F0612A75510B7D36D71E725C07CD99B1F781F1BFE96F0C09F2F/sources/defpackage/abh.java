package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abh  reason: default package */
/* loaded from: classes.dex */
public final class abh extends nd implements xy {
    float c;
    float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final abc j;
    int k;
    public RecyclerView m;
    VelocityTracker o;
    jz q;
    public Rect r;
    public long s;
    private float u;
    private float v;
    private List x;
    private List y;
    private abd z;
    final List a = new ArrayList();
    private final float[] t = new float[2];
    yo b = null;
    int i = -1;
    private int w = 0;
    final List l = new ArrayList();
    final Runnable n = new aax(this);
    View p = null;
    private final ya A = new aay(this);

    public abh(abc abcVar) {
        this.j = abcVar;
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

    private static boolean r(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final int s(int i) {
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

    private final int t(int i) {
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

    @Override // defpackage.xy
    public final void a(View view) {
        l(view);
        yo k = this.m.k(view);
        if (k == null) {
            return;
        }
        yo yoVar = this.b;
        if (yoVar == null || k != yoVar) {
            i(k, false);
            if (!this.a.remove(k.a)) {
                return;
            }
            this.j.f(this.m, k);
            return;
        }
        m(null, 0);
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        rect.setEmpty();
    }

    @Override // defpackage.nd
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
        abc abcVar = this.j;
        yo yoVar = this.b;
        List list = this.l;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            abf abfVar = (abf) list.get(i);
            float f4 = abfVar.d;
            float f5 = abfVar.f;
            if (f4 == f5) {
                abfVar.l = abfVar.h.a.getTranslationX();
            } else {
                abfVar.l = f4 + (abfVar.p * (f5 - f4));
            }
            float f6 = abfVar.e;
            float f7 = abfVar.g;
            if (f6 == f7) {
                abfVar.m = abfVar.h.a.getTranslationY();
            } else {
                abfVar.m = f6 + (abfVar.p * (f7 - f6));
            }
            int save = canvas.save();
            yo yoVar2 = abfVar.h;
            float f8 = abfVar.l;
            float f9 = abfVar.m;
            int i2 = abfVar.i;
            abcVar.o(recyclerView, yoVar2, f8, f9, false);
            canvas.restoreToCount(save);
        }
        if (yoVar != null) {
            int save2 = canvas.save();
            abcVar.o(recyclerView, yoVar, f, f2, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.nd
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            p(this.t);
        }
        yo yoVar = this.b;
        List list = this.l;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            abf abfVar = (abf) list.get(i);
            int save = canvas.save();
            yo yoVar2 = abfVar.h;
            float f = abfVar.l;
            float f2 = abfVar.m;
            int i2 = abfVar.i;
            canvas.restoreToCount(save);
        }
        if (yoVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            abf abfVar2 = (abf) list.get(size);
            if (!abfVar2.o) {
                z = true;
            } else if (!abfVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    @Override // defpackage.xy
    public final void e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View g(MotionEvent motionEvent) {
        abf abfVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        yo yoVar = this.b;
        if (yoVar != null) {
            View view2 = yoVar.a;
            if (r(view2, x, y, this.g + this.e, this.h + this.f)) {
                return view2;
            }
        }
        int size = this.l.size();
        do {
            size--;
            if (size >= 0) {
                abfVar = (abf) this.l.get(size);
                view = abfVar.h.a;
            } else {
                return this.m.n(x, y);
            }
        } while (!r(view, x, y, abfVar.l, abfVar.m));
        return view;
    }

    public final void h(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aF(this);
            this.m.Z(this.A);
            this.m.Y(this);
            int size = this.l.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                abf abfVar = (abf) this.l.get(0);
                abfVar.a();
                this.j.f(this.m, abfVar.h);
            }
            this.l.clear();
            this.p = null;
            q();
            abd abdVar = this.z;
            if (abdVar != null) {
                abdVar.a = false;
                this.z = null;
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
        ViewConfiguration.get(this.m.getContext()).getScaledTouchSlop();
        this.m.aC(this);
        this.m.v(this.A);
        this.m.u(this);
        this.z = new abd(this);
        this.q = new jz(this.m.getContext(), this.z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(yo yoVar, boolean z) {
        abf abfVar;
        int size = this.l.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            abfVar = (abf) this.l.get(size);
        } while (abfVar.h != yoVar);
        abfVar.n |= z;
        if (!abfVar.o) {
            abfVar.a();
        }
        this.l.remove(size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(yo yoVar) {
        List list;
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
            if (Math.abs(i4 - yoVar.a.getTop()) < yoVar.a.getHeight() * 0.5f && Math.abs(i3 - yoVar.a.getLeft()) < yoVar.a.getWidth() * 0.5f) {
                return;
            }
            List list2 = this.x;
            if (list2 == null) {
                this.x = new ArrayList();
                this.y = new ArrayList();
            } else {
                list2.clear();
                this.y.clear();
            }
            int round = Math.round(this.g + this.e);
            int round2 = Math.round(this.h + this.f);
            int width = yoVar.a.getWidth() + round;
            int height = yoVar.a.getHeight() + round2;
            int i5 = (round + width) / 2;
            int i6 = (round2 + height) / 2;
            xw xwVar = this.m.n;
            int aq = xwVar.aq();
            int i7 = 0;
            while (i7 < aq) {
                View az = xwVar.az(i7);
                if (az != yoVar.a && az.getBottom() >= round2 && az.getTop() <= height && az.getRight() >= round && az.getLeft() <= width) {
                    yo k = this.m.k(az);
                    i = round;
                    i2 = round2;
                    if (this.j.h(this.m, this.b, k)) {
                        int abs5 = Math.abs(i5 - ((az.getLeft() + az.getRight()) / 2));
                        int abs6 = Math.abs(i6 - ((az.getTop() + az.getBottom()) / 2));
                        int i8 = (abs5 * abs5) + (abs6 * abs6);
                        int size = this.x.size();
                        int i9 = 0;
                        int i10 = 0;
                        while (i10 < size) {
                            int i11 = size;
                            if (i8 <= ((Integer) this.y.get(i10)).intValue()) {
                                break;
                            }
                            i9++;
                            i10++;
                            size = i11;
                        }
                        this.x.add(i9, k);
                        this.y.add(i9, Integer.valueOf(i8));
                    }
                } else {
                    i = round;
                    i2 = round2;
                }
                i7++;
                round = i;
                round2 = i2;
            }
            List list3 = this.x;
            if (list3.size() == 0) {
                return;
            }
            int width2 = yoVar.a.getWidth() + i3;
            int height2 = yoVar.a.getHeight() + i4;
            int left2 = i3 - yoVar.a.getLeft();
            int top2 = i4 - yoVar.a.getTop();
            int size2 = list3.size();
            yo yoVar2 = null;
            int i12 = -1;
            int i13 = 0;
            while (i13 < size2) {
                yo yoVar3 = (yo) list3.get(i13);
                if (left2 <= 0 || (right = yoVar3.a.getRight() - width2) >= 0) {
                    list = list3;
                } else {
                    list = list3;
                    if (yoVar3.a.getRight() > yoVar.a.getRight() && (abs4 = Math.abs(right)) > i12) {
                        i12 = abs4;
                        yoVar2 = yoVar3;
                    }
                }
                if (left2 < 0 && (left = yoVar3.a.getLeft() - i3) > 0 && yoVar3.a.getLeft() < yoVar.a.getLeft() && (abs3 = Math.abs(left)) > i12) {
                    i12 = abs3;
                    yoVar2 = yoVar3;
                }
                if (top2 < 0 && (top = yoVar3.a.getTop() - i4) > 0 && yoVar3.a.getTop() < yoVar.a.getTop() && (abs2 = Math.abs(top)) > i12) {
                    i12 = abs2;
                    yoVar2 = yoVar3;
                }
                if (top2 > 0 && (bottom = yoVar3.a.getBottom() - height2) < 0 && yoVar3.a.getBottom() > yoVar.a.getBottom() && (abs = Math.abs(bottom)) > i12) {
                    i12 = abs;
                    yoVar2 = yoVar3;
                }
                i13++;
                list3 = list;
            }
            if (yoVar2 == null) {
                this.x.clear();
                this.y.clear();
                return;
            }
            int a = yoVar2.a();
            yoVar.a();
            if (!this.j.k(this.m, yoVar, yoVar2)) {
                return;
            }
            RecyclerView recyclerView = this.m;
            xw xwVar2 = recyclerView.n;
            if (xwVar2 instanceof abg) {
                ((abg) xwVar2).an(yoVar.a, yoVar2.a);
                return;
            }
            if (xwVar2.ad()) {
                if (xw.bx(yoVar2.a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.ab(a);
                }
                if (xw.by(yoVar2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.ab(a);
                }
            }
            if (!xwVar2.ae()) {
                return;
            }
            if (xw.bz(yoVar2.a) <= recyclerView.getPaddingTop()) {
                recyclerView.ab(a);
            }
            if (xw.bw(yoVar2.a) < recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                return;
            }
            recyclerView.ab(a);
        }
    }

    public final void k() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.o = VelocityTracker.obtain();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(View view) {
        if (view == this.p) {
            this.p = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
        if (r0 <= 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.yo r20, int r21) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abh.m(yo, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(MotionEvent motionEvent, int i, int i2) {
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
    public final void o(int i) {
        if (this.b == null && i == 2 && this.w != 2) {
            this.j.m();
        }
    }
}
