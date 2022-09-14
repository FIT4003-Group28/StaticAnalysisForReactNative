package androidx.appcompat.app;

import a.a.o.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0040a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f893a;

        public C0040a(int i, int i2) {
            super(i, i2);
            this.f893a = 0;
            this.f893a = 8388627;
        }

        public C0040a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f893a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a.j.ActionBarLayout);
            this.f893a = obtainStyledAttributes.getInt(a.a.j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0040a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f893a = 0;
        }

        public C0040a(C0040a c0040a) {
            super((ViewGroup.MarginLayoutParams) c0040a);
            this.f893a = 0;
            this.f893a = c0040a.f893a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public a.a.o.b a(b.a aVar) {
        return null;
    }

    public void a(Configuration configuration) {
    }

    public abstract void a(Drawable drawable);

    public abstract void a(CharSequence charSequence);

    public abstract boolean a(int i, KeyEvent keyEvent);

    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    public abstract void b(CharSequence charSequence);

    public abstract void b(boolean z);

    public abstract void c(boolean z);

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public abstract int g();

    public abstract Context h();

    public boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
    }

    public boolean k() {
        return false;
    }
}
