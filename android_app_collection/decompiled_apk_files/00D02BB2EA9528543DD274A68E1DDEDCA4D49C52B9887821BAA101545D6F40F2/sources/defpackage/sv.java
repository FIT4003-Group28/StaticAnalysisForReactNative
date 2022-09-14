package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sv  reason: default package */
/* loaded from: classes.dex */
public abstract class sv extends Drawable.ConstantState {
    int A;
    int B;
    int C;
    boolean D;
    ColorFilter E;
    boolean F;
    ColorStateList G;
    PorterDuff.Mode H;
    boolean I;
    boolean J;
    final sw c;
    Resources d;
    int e;
    int f;
    int g;
    SparseArray<Drawable.ConstantState> h;
    Drawable[] i;
    int j;
    boolean k;
    boolean l;
    Rect m;
    boolean n;
    boolean o;
    int p;
    int q;
    int r;
    int s;
    boolean t;
    int u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    public sv(sv svVar, sw swVar, Resources resources) {
        Resources resources2;
        this.e = 160;
        this.k = false;
        this.n = false;
        this.z = true;
        this.B = 0;
        this.C = 0;
        this.c = swVar;
        if (resources != null) {
            resources2 = resources;
        } else {
            resources2 = svVar != null ? svVar.d : null;
        }
        this.d = resources2;
        int i = sw.i(resources, svVar != null ? svVar.e : 0);
        this.e = i;
        if (svVar != null) {
            this.f = svVar.f;
            this.g = svVar.g;
            this.x = true;
            this.y = true;
            this.k = svVar.k;
            this.n = svVar.n;
            this.z = svVar.z;
            this.A = svVar.A;
            this.B = svVar.B;
            this.C = svVar.C;
            this.D = svVar.D;
            this.E = svVar.E;
            this.F = svVar.F;
            this.G = svVar.G;
            this.H = svVar.H;
            this.I = svVar.I;
            this.J = svVar.J;
            if (svVar.e == i) {
                if (svVar.l) {
                    this.m = new Rect(svVar.m);
                    this.l = true;
                }
                if (svVar.o) {
                    this.p = svVar.p;
                    this.q = svVar.q;
                    this.r = svVar.r;
                    this.s = svVar.s;
                    this.o = true;
                }
            }
            if (svVar.t) {
                this.u = svVar.u;
                this.t = true;
            }
            if (svVar.v) {
                this.w = svVar.w;
                this.v = true;
            }
            Drawable[] drawableArr = svVar.i;
            this.i = new Drawable[drawableArr.length];
            int i2 = svVar.j;
            this.j = i2;
            SparseArray<Drawable.ConstantState> sparseArray = svVar.h;
            if (sparseArray != null) {
                this.h = sparseArray.clone();
            } else {
                this.h = new SparseArray<>(i2);
            }
            int i3 = this.j;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.h.put(i4, constantState);
                    } else {
                        this.i[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.i = new Drawable[10];
        this.j = 0;
    }

    private final Drawable b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.setLayoutDirection(this.A);
        }
        Drawable mutate = drawable.mutate();
        mutate.setCallback(this.c);
        return mutate;
    }

    public void a() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.j;
        Drawable[] drawableArr = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = this.h.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int f(Drawable drawable) {
        int i = this.j;
        if (i >= this.i.length) {
            l(i, i + 10);
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.c);
        this.i[i] = drawable;
        this.j++;
        this.g = drawable.getChangingConfigurations() | this.g;
        g();
        this.m = null;
        this.l = false;
        this.o = false;
        this.x = false;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.t = false;
        this.v = false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f | this.g;
    }

    public final void h() {
        SparseArray<Drawable.ConstantState> sparseArray = this.h;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                this.i[this.h.keyAt(i)] = b(this.h.valueAt(i).newDrawable(this.d));
            }
            this.h = null;
        }
    }

    public final Drawable i(int i) {
        int indexOfKey;
        Drawable drawable = this.i[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray<Drawable.ConstantState> sparseArray = this.h;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable b = b(this.h.valueAt(indexOfKey).newDrawable(this.d));
        this.i[i] = b;
        this.h.removeAt(indexOfKey);
        if (this.h.size() == 0) {
            this.h = null;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(Resources resources) {
        if (resources != null) {
            this.d = resources;
            int i = sw.i(resources, this.e);
            int i2 = this.e;
            this.e = i;
            if (i2 == i) {
                return;
            }
            this.o = false;
            this.l = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k() {
        this.o = true;
        h();
        int i = this.j;
        Drawable[] drawableArr = this.i;
        this.q = -1;
        this.p = -1;
        this.s = 0;
        this.r = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.p) {
                this.p = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.q) {
                this.q = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.r) {
                this.r = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.s) {
                this.s = minimumHeight;
            }
        }
    }

    public void l(int i, int i2) {
        throw null;
    }

    public final synchronized boolean m() {
        if (this.x) {
            return this.y;
        }
        h();
        this.x = true;
        int i = this.j;
        Drawable[] drawableArr = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getConstantState() == null) {
                this.y = false;
                return false;
            }
        }
        this.y = true;
        return true;
    }
}
