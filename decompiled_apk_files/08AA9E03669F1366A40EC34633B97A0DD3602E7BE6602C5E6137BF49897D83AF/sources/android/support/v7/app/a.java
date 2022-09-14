package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract Drawable a();

        public abstract CharSequence b();

        public abstract View c();

        public abstract void d();

        public abstract CharSequence e();
    }

    /* compiled from: ActionBar.java */
    /* renamed from: android.support.v7.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0021a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f699a;

        public C0021a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f699a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.ActionBarLayout);
            this.f699a = obtainStyledAttributes.getInt(a.j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0021a(int i, int i2) {
            super(i, i2);
            this.f699a = 0;
            this.f699a = 8388627;
        }

        public C0021a(C0021a c0021a) {
            super((ViewGroup.MarginLayoutParams) c0021a);
            this.f699a = 0;
            this.f699a = c0021a.f699a;
        }

        public C0021a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f699a = 0;
        }
    }
}
