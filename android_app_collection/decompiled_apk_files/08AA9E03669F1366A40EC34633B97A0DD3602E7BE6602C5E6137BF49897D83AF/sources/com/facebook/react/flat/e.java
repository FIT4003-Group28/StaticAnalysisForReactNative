package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ClippingDrawCommandManager.java */
/* loaded from: classes.dex */
abstract class e extends i {
    private static final String f = "e";
    private final s g;
    private int j;
    private int k;
    private h[] h = h.f3398b;

    /* renamed from: a  reason: collision with root package name */
    protected float[] f3390a = af.f3380a;

    /* renamed from: b  reason: collision with root package name */
    protected float[] f3391b = af.f3380a;
    private v[] i = v.f3425a;

    /* renamed from: c  reason: collision with root package name */
    protected float[] f3392c = af.f3380a;

    /* renamed from: d  reason: collision with root package name */
    protected float[] f3393d = af.f3380a;
    private SparseIntArray l = af.f3381b;
    private final SparseArray<View> m = new SparseArray<>();
    protected final Rect e = new Rect();
    private final SparseArray<View> n = new SparseArray<>();
    private final ArrayList<View> o = new ArrayList<>();
    private final ArrayList<com.facebook.react.uimanager.q> p = new ArrayList<>();

    abstract int a();

    abstract int a(float f2, float f3);

    abstract int a(int i);

    abstract boolean a(int i, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(s sVar, h[] hVarArr) {
        this.g = sVar;
        a(hVarArr);
    }

    private void a(h[] hVarArr) {
        a(hVarArr, this.l, this.f3390a, this.f3391b, true);
        b();
    }

    public void a(h[] hVarArr, SparseIntArray sparseIntArray, float[] fArr, float[] fArr2, boolean z) {
        this.h = hVarArr;
        this.f3390a = fArr;
        this.f3391b = fArr2;
        this.l = sparseIntArray;
        if (this.e.bottom != this.e.top) {
            this.j = a();
            this.k = a(this.j);
            if (z) {
                return;
            }
            d();
        }
    }

    @Override // com.facebook.react.flat.i
    public v b(float f2, float f3) {
        int a2 = a(f2, f3);
        while (true) {
            int i = a2 - 1;
            if (a2 > 0) {
                v vVar = this.i[i];
                if (vVar.f3428d) {
                    if (a(i, f2, f3)) {
                        return null;
                    }
                    if (vVar.a(f2, f3)) {
                        return vVar;
                    }
                }
                a2 = i;
            } else {
                return null;
            }
        }
    }

    @Override // com.facebook.react.flat.i
    public v c(float f2, float f3) {
        int a2 = a(f2, f3);
        while (true) {
            int i = a2 - 1;
            if (a2 > 0) {
                v vVar = this.i[i];
                if (a(i, f2, f3)) {
                    return null;
                }
                if (vVar.a(f2, f3)) {
                    return vVar;
                }
                a2 = i;
            } else {
                return null;
            }
        }
    }

    private void a(int i, View view) {
        this.m.put(i, view);
    }

    private void b(int i) {
        this.m.remove(i);
    }

    private boolean c(int i) {
        return this.m.get(i) == null;
    }

    private static boolean a(View view) {
        Animation animation = view.getAnimation();
        return animation != null && !animation.hasEnded();
    }

    private boolean d(int i) {
        return this.j <= i && i < this.k;
    }

    @Override // com.facebook.react.flat.i
    public boolean b() {
        com.facebook.react.uimanager.r.a(this.g, this.e);
        if (this.g.getParent() == null || this.e.top == this.e.bottom) {
            return false;
        }
        int a2 = a();
        int a3 = a(a2);
        if (this.j <= a2 && a3 <= this.k) {
            c();
            return false;
        }
        this.j = a2;
        this.k = a3;
        d();
        c();
        return true;
    }

    private void c() {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            com.facebook.react.uimanager.q qVar = this.p.get(i);
            if (c(((View) qVar).getId())) {
                qVar.a_();
            }
        }
    }

    private void d() {
        int childCount = this.g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.g.getChildAt(i);
            if (d(this.l.get(childAt.getId())) || a(childAt)) {
                this.o.add(childAt);
            } else {
                this.n.append(i, childAt);
                a(childAt.getId(), childAt);
            }
        }
        int size = this.n.size();
        boolean z = size > 2;
        if (!z) {
            while (true) {
                int i2 = size - 1;
                if (size <= 0) {
                    break;
                }
                this.g.removeViewsInLayout(this.n.keyAt(i2), 1);
                size = i2;
            }
        } else {
            this.g.detachAllViewsFromParent();
            for (int i3 = 0; i3 < size; i3++) {
                this.g.a(this.n.valueAt(i3));
            }
        }
        this.n.clear();
        int i4 = this.j;
        int size2 = this.o.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            View view = this.o.get(i6);
            int i7 = this.l.get(view.getId());
            if (i4 <= i7) {
                while (i4 != i7) {
                    if (this.h[i4] instanceof m) {
                        m mVar = (m) this.h[i4];
                        this.g.a((View) com.facebook.j.a.a.a(this.m.get(mVar.f3404d)), i5);
                        b(mVar.f3404d);
                        i5++;
                    }
                    i4++;
                }
                i4++;
            }
            if (z) {
                this.g.b(view, i5);
            }
            i5++;
        }
        this.o.clear();
        while (i4 < this.k) {
            if (this.h[i4] instanceof m) {
                m mVar2 = (m) this.h[i4];
                this.g.a((View) com.facebook.j.a.a.a(this.m.get(mVar2.f3404d)), i5);
                b(mVar2.f3404d);
                i5++;
            }
            i4++;
        }
    }

    @Override // com.facebook.react.flat.i
    public void a(Rect rect) {
        rect.set(this.e);
    }

    @Override // com.facebook.react.flat.i
    public void a(Canvas canvas) {
        int i = this.j;
        int childCount = this.g.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int i3 = this.l.get(this.g.getChildAt(i2).getId());
            if (this.k < i3) {
                while (i < this.k) {
                    this.h[i].a(this.g, canvas);
                    i++;
                }
            } else if (i <= i3) {
                while (i < i3) {
                    this.h[i].a(this.g, canvas);
                    i++;
                }
                i++;
            }
            this.h[i3].a(this.g, canvas);
        }
        while (i < this.k) {
            int i4 = i + 1;
            h hVar = this.h[i];
            if (hVar instanceof m) {
                String str = f;
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected DrawView command at index ");
                sb.append(i4 - 1);
                sb.append(" with mStop=");
                sb.append(this.k);
                sb.append(". ");
                sb.append(Arrays.toString(this.h));
                com.facebook.common.e.a.c(str, sb.toString());
            } else {
                hVar.a(this.g, canvas);
            }
            i = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.react.flat.i
    public void b(Canvas canvas) {
        h[] hVarArr;
        for (h hVar : this.h) {
            if (hVar instanceof m) {
                if (c(((m) hVar).f3404d)) {
                    hVar.b(this.g, canvas);
                }
            } else {
                hVar.b(this.g, canvas);
            }
        }
    }
}
