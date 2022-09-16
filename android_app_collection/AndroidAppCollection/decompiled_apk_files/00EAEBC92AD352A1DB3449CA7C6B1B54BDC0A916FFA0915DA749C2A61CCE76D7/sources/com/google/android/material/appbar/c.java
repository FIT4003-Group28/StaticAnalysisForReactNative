package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private d f7877a;

    /* renamed from: b  reason: collision with root package name */
    private int f7878b;

    /* renamed from: c  reason: collision with root package name */
    private int f7879c;

    public c() {
        this.f7878b = 0;
        this.f7879c = 0;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7878b = 0;
        this.f7879c = 0;
    }

    public boolean a(int i) {
        d dVar = this.f7877a;
        if (dVar != null) {
            return dVar.b(i);
        }
        this.f7878b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, (CoordinatorLayout) v, i);
        if (this.f7877a == null) {
            this.f7877a = new d(v);
        }
        this.f7877a.c();
        this.f7877a.a();
        int i2 = this.f7878b;
        if (i2 != 0) {
            this.f7877a.b(i2);
            this.f7878b = 0;
        }
        int i3 = this.f7879c;
        if (i3 != 0) {
            this.f7877a.a(i3);
            this.f7879c = 0;
            return true;
        }
        return true;
    }

    public int b() {
        d dVar = this.f7877a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.c(v, i);
    }
}
