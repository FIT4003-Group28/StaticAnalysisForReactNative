package com.facebook.react.flat;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: FlatShadowNode.java */
/* loaded from: classes.dex */
class q extends com.facebook.react.uimanager.g {

    /* renamed from: a  reason: collision with root package name */
    static final q[] f3409a = new q[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Rect f3410d = new Rect();
    private static final m e = new m(0);

    /* renamed from: b  reason: collision with root package name */
    float f3411b;
    private int k;
    private int l;
    private int m;
    private int n;
    private m o;
    private f p;
    private boolean r;
    private boolean s;
    private h[] f = h.f3398b;
    private c[] g = c.f3389a;
    private v[] h = v.f3425a;
    private q[] i = f3409a;
    private v j = v.f3426b;
    private boolean q = true;
    private Rect t = f3410d;

    /* renamed from: c  reason: collision with root package name */
    boolean f3412c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.r) {
            return;
        }
        this.r = true;
        int childCount = getChildCount();
        for (int i = 0; i != childCount; i++) {
            com.facebook.react.uimanager.x childAt = getChildAt(i);
            if (childAt instanceof q) {
                ((q) childAt).d();
            }
        }
    }

    @com.facebook.react.uimanager.a.a(a = "backgroundColor")
    public void setBackgroundColor(int i) {
        this.p = i == 0 ? null : new f(i);
        b();
    }

    @Override // com.facebook.react.uimanager.g
    public void setOverflow(String str) {
        super.setOverflow(str);
        this.f3412c = "hidden".equals(str);
        if (this.f3412c) {
            this.s = false;
            if (this.f3411b > 0.5f) {
                d();
            }
        } else {
            c();
        }
        b();
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public final int getScreenX() {
        return this.k;
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public final int getScreenY() {
        return this.l;
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public final int getScreenWidth() {
        if (e()) {
            return this.m - this.k;
        }
        return Math.round(this.j.c() - this.j.a());
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public final int getScreenHeight() {
        if (e()) {
            return this.n - this.l;
        }
        return Math.round(this.j.d() - this.j.b());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public void addChildAt(com.facebook.react.uimanager.x xVar, int i) {
        super.addChildAt(xVar, i);
        if (!this.r || !(xVar instanceof q)) {
            return;
        }
        ((q) xVar).d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        q qVar = this;
        while (true) {
            if (qVar.e()) {
                if (qVar.q) {
                    return;
                }
                qVar.q = true;
            }
            com.facebook.react.uimanager.x parent = qVar.getParent();
            if (parent == null) {
                return;
            }
            qVar = (q) parent;
        }
    }

    @Override // com.facebook.react.uimanager.x
    public void markUpdated() {
        super.markUpdated();
        this.q = true;
        b();
    }

    final void c() {
        boolean z;
        int c2 = (int) (this.j.c() - this.j.a());
        int d2 = (int) (this.j.d() - this.j.b());
        float f = c2;
        float f2 = d2;
        Rect rect = null;
        if (this.f3412c || d2 <= 0 || c2 <= 0) {
            z = false;
        } else {
            v[] vVarArr = this.h;
            float f3 = f;
            float f4 = f2;
            float f5 = BitmapDescriptorFactory.HUE_RED;
            z = false;
            float f6 = BitmapDescriptorFactory.HUE_RED;
            for (v vVar : vVarArr) {
                if (vVar.a() < f5) {
                    f5 = vVar.a();
                    z = true;
                }
                if (vVar.c() > f3) {
                    f3 = vVar.c();
                    z = true;
                }
                if (vVar.b() < f6) {
                    f6 = vVar.b();
                    z = true;
                }
                if (vVar.d() > f4) {
                    f4 = vVar.d();
                    z = true;
                }
            }
            if (z) {
                rect = new Rect((int) f5, (int) f6, (int) (f3 - f), (int) (f4 - f2));
            }
        }
        if (!z && this.j != v.f3426b) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                com.facebook.react.uimanager.x childAt = getChildAt(i);
                if (childAt instanceof q) {
                    q qVar = (q) childAt;
                    if (qVar.s) {
                        Rect rect2 = qVar.t;
                        if (rect == null) {
                            rect = new Rect();
                        }
                        rect.union(rect2);
                        z = true;
                    }
                }
            }
        }
        if (this.s != z) {
            this.s = z;
            if (rect == null) {
                rect = f3410d;
            }
            this.t = rect;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (!isVirtual() && this.o == null) {
            this.o = e;
            b();
            this.j = v.f3426b;
        }
    }

    final boolean e() {
        return this.o != null;
    }
}
