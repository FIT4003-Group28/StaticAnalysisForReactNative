package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final v0 f6021a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f6022b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f6023c = new SparseBooleanArray();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f6024a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6025b;

        a(a0 a0Var, int i) {
            this.f6024a = a0Var;
            this.f6025b = i;
        }
    }

    public n(v0 v0Var, h0 h0Var) {
        this.f6021a = v0Var;
        this.f6022b = h0Var;
    }

    private a a(a0 a0Var, int i) {
        while (a0Var.j() != l.PARENT) {
            a0 parent = a0Var.getParent();
            if (parent == null) {
                return null;
            }
            i = i + (a0Var.j() == l.LEAF ? 1 : 0) + parent.d(a0Var);
            a0Var = parent;
        }
        return new a(a0Var, i);
    }

    private void a(a0 a0Var, int i, int i2) {
        if (a0Var.j() != l.NONE && a0Var.A() != null) {
            this.f6021a.a(a0Var.x().t(), a0Var.t(), i, i2, a0Var.b(), a0Var.c());
            return;
        }
        for (int i3 = 0; i3 < a0Var.a(); i3++) {
            a0 a2 = a0Var.a(i3);
            int t = a2.t();
            if (!this.f6023c.get(t)) {
                this.f6023c.put(t, true);
                a(a2, a2.q() + i, a2.h() + i2);
            }
        }
    }

    private void a(a0 a0Var, a0 a0Var2, int i) {
        c.d.k.a.a.a(a0Var2.j() != l.PARENT);
        int i2 = i;
        for (int i3 = 0; i3 < a0Var2.a(); i3++) {
            a0 a2 = a0Var2.a(i3);
            c.d.k.a.a.a(a2.A() == null);
            int z = a0Var.z();
            if (a2.j() == l.NONE) {
                d(a0Var, a2, i2);
            } else {
                b(a0Var, a2, i2);
            }
            i2 += a0Var.z() - z;
        }
    }

    private void a(a0 a0Var, c0 c0Var) {
        a0 parent = a0Var.getParent();
        if (parent == null) {
            a0Var.a(false);
            return;
        }
        int a2 = parent.a(a0Var);
        parent.b(a2);
        a(a0Var, false);
        a0Var.a(false);
        this.f6021a.a(a0Var.i(), a0Var.t(), a0Var.m(), c0Var);
        parent.a(a0Var, a2);
        c(parent, a0Var, a2);
        for (int i = 0; i < a0Var.a(); i++) {
            c(a0Var, a0Var.a(i), i);
        }
        c.d.k.a.a.a(this.f6023c.size() == 0);
        c(a0Var);
        for (int i2 = 0; i2 < a0Var.a(); i2++) {
            c(a0Var.a(i2));
        }
        this.f6023c.clear();
    }

    private void a(a0 a0Var, boolean z) {
        if (a0Var.j() != l.PARENT) {
            for (int a2 = a0Var.a() - 1; a2 >= 0; a2--) {
                a(a0Var.a(a2), z);
            }
        }
        a0 A = a0Var.A();
        if (A != null) {
            int e2 = A.e(a0Var);
            A.d(e2);
            this.f6021a.a(A.t(), new int[]{e2}, null, z ? new int[]{a0Var.t()} : null, z ? new int[]{e2} : null);
        }
    }

    private static boolean a(c0 c0Var) {
        if (c0Var == null) {
            return true;
        }
        if (c0Var.d("collapsable") && !c0Var.a("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator keySetIterator = c0Var.f5885a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            if (!c1.a(c0Var.f5885a, keySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void b(a0 a0Var, a0 a0Var2, int i) {
        a0Var.b(a0Var2, i);
        this.f6021a.a(a0Var.t(), null, new w0[]{new w0(a0Var2.t(), i)}, null, null);
        if (a0Var2.j() != l.PARENT) {
            a(a0Var, a0Var2, i + 1);
        }
    }

    private void c(a0 a0Var) {
        int t = a0Var.t();
        if (this.f6023c.get(t)) {
            return;
        }
        this.f6023c.put(t, true);
        int q = a0Var.q();
        int h2 = a0Var.h();
        for (a0 parent = a0Var.getParent(); parent != null && parent.j() != l.PARENT; parent = parent.getParent()) {
            if (!parent.y()) {
                q += Math.round(parent.u());
                h2 += Math.round(parent.p());
            }
        }
        a(a0Var, q, h2);
    }

    private void c(a0 a0Var, a0 a0Var2, int i) {
        int d2 = a0Var.d(a0Var.a(i));
        if (a0Var.j() != l.PARENT) {
            a a2 = a(a0Var, d2);
            if (a2 == null) {
                return;
            }
            a0 a0Var3 = a2.f6024a;
            d2 = a2.f6025b;
            a0Var = a0Var3;
        }
        if (a0Var2.j() != l.NONE) {
            b(a0Var, a0Var2, d2);
        } else {
            d(a0Var, a0Var2, d2);
        }
    }

    public static void d(a0 a0Var) {
        a0Var.v();
    }

    private void d(a0 a0Var, a0 a0Var2, int i) {
        a(a0Var, a0Var2, i);
    }

    public void a() {
        this.f6023c.clear();
    }

    public void a(a0 a0Var) {
        if (a0Var.B()) {
            a(a0Var, (c0) null);
        }
    }

    public void a(a0 a0Var, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            c(a0Var, this.f6022b.a(readableArray.getInt(i)), i);
        }
    }

    public void a(a0 a0Var, k0 k0Var, c0 c0Var) {
        a0Var.a(a0Var.m().equals(ReactViewManager.REACT_CLASS) && a(c0Var));
        if (a0Var.j() != l.NONE) {
            this.f6021a.a(k0Var, a0Var.t(), a0Var.m(), c0Var);
        }
    }

    public void a(a0 a0Var, String str, c0 c0Var) {
        if (a0Var.B() && !a(c0Var)) {
            a(a0Var, c0Var);
        } else if (a0Var.B()) {
        } else {
            this.f6021a.a(a0Var.t(), str, c0Var);
        }
    }

    public void a(a0 a0Var, int[] iArr, int[] iArr2, w0[] w0VarArr, int[] iArr3, int[] iArr4) {
        boolean z;
        for (int i : iArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr3.length) {
                    z = false;
                    break;
                } else if (iArr3[i2] == i) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            a(this.f6022b.a(i), z);
        }
        for (w0 w0Var : w0VarArr) {
            c(a0Var, this.f6022b.a(w0Var.f6134a), w0Var.f6135b);
        }
    }

    public void b(a0 a0Var) {
        c(a0Var);
    }
}
