package com.google.android.material.transformation;

import a.g.m.v;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    private int f8237a;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f8238b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8239c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c.e.a.c.u.b f8240d;

        a(View view, int i, c.e.a.c.u.b bVar) {
            this.f8238b = view;
            this.f8239c = i;
            this.f8240d = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f8238b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f8237a == this.f8239c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                c.e.a.c.u.b bVar = this.f8240d;
                expandableBehavior.a((View) bVar, this.f8238b, bVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f8237a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8237a = 0;
    }

    private boolean a(boolean z) {
        if (!z) {
            return this.f8237a == 1;
        }
        int i = this.f8237a;
        return i == 0 || i == 2;
    }

    protected abstract boolean a(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        c.e.a.c.u.b e2;
        if (v.I(view) || (e2 = e(coordinatorLayout, view)) == null || !a(e2.a())) {
            return false;
        }
        this.f8237a = e2.a() ? 1 : 2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, this.f8237a, e2));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        c.e.a.c.u.b bVar = (c.e.a.c.u.b) view2;
        if (a(bVar.a())) {
            this.f8237a = bVar.a() ? 1 : 2;
            return a((View) bVar, view, bVar.a(), true);
        }
        return false;
    }

    protected c.e.a.c.u.b e(CoordinatorLayout coordinatorLayout, View view) {
        List<View> b2 = coordinatorLayout.b(view);
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            View view2 = b2.get(i);
            if (a(coordinatorLayout, (CoordinatorLayout) view, view2)) {
                return (c.e.a.c.u.b) view2;
            }
        }
        return null;
    }
}
