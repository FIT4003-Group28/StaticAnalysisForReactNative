package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class RtlAwareViewPager extends zba {
    public final List j;
    public bpn k;

    public RtlAwareViewPager(Context context) {
        super(context);
        this.j = new CopyOnWriteArrayList();
        w();
    }

    private final void w() {
        this.g = new zac(this);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final int a() {
        return y(this.c);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (indexOfChild(view) != -1) {
            return;
        }
        super.addView(view, y(i));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void e(bpn bpnVar) {
        this.j.add(bpnVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void j(bpn bpnVar) {
        this.j.remove(bpnVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void l(int i) {
        super.l(y(i));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void m(int i, boolean z) {
        super.m(y(i), z);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void p(bpn bpnVar) {
        this.k = bpnVar;
    }

    public final int y(int i) {
        return getResources().getConfiguration().getLayoutDirection() == 1 ? (this.b.j() - i) - 1 : i;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (indexOfChild(view) != -1) {
            return;
        }
        super.addView(view, y(i), layoutParams);
    }

    public RtlAwareViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new CopyOnWriteArrayList();
        w();
    }
}
