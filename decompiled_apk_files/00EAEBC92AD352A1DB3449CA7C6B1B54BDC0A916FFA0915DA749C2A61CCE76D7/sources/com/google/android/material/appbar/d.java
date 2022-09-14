package com.google.android.material.appbar;

import a.g.m.v;
import android.view.View;
/* loaded from: classes.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f7880a;

    /* renamed from: b  reason: collision with root package name */
    private int f7881b;

    /* renamed from: c  reason: collision with root package name */
    private int f7882c;

    /* renamed from: d  reason: collision with root package name */
    private int f7883d;

    /* renamed from: e  reason: collision with root package name */
    private int f7884e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7885f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7886g = true;

    public d(View view) {
        this.f7880a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        View view = this.f7880a;
        v.e(view, this.f7883d - (view.getTop() - this.f7881b));
        View view2 = this.f7880a;
        v.d(view2, this.f7884e - (view2.getLeft() - this.f7882c));
    }

    public boolean a(int i) {
        if (!this.f7886g || this.f7884e == i) {
            return false;
        }
        this.f7884e = i;
        a();
        return true;
    }

    public int b() {
        return this.f7883d;
    }

    public boolean b(int i) {
        if (!this.f7885f || this.f7883d == i) {
            return false;
        }
        this.f7883d = i;
        a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f7881b = this.f7880a.getTop();
        this.f7882c = this.f7880a.getLeft();
    }
}
