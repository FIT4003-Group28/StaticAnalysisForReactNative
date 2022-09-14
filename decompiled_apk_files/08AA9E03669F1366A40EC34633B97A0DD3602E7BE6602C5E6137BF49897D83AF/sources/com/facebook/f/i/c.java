package com.facebook.f.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.facebook.common.d.h;
import com.facebook.f.h.b;
import com.facebook.f.i.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: DraweeView.java */
/* loaded from: classes.dex */
public class c<DH extends com.facebook.f.h.b> extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private final a.C0056a f2483a;

    /* renamed from: b  reason: collision with root package name */
    private float f2484b;

    /* renamed from: c  reason: collision with root package name */
    private b<DH> f2485c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2486d;

    public c(Context context) {
        super(context);
        this.f2483a = new a.C0056a();
        this.f2484b = BitmapDescriptorFactory.HUE_RED;
        this.f2486d = false;
        a(context);
    }

    private void a(Context context) {
        ColorStateList imageTintList;
        if (this.f2486d) {
            return;
        }
        this.f2486d = true;
        this.f2485c = b.a(null, context);
        if (Build.VERSION.SDK_INT < 21 || (imageTintList = getImageTintList()) == null) {
            return;
        }
        setColorFilter(imageTintList.getDefaultColor());
    }

    public void setHierarchy(DH dh) {
        this.f2485c.a((b<DH>) dh);
        super.setImageDrawable(this.f2485c.f());
    }

    public DH getHierarchy() {
        return this.f2485c.e();
    }

    public Drawable getTopLevelDrawable() {
        return this.f2485c.f();
    }

    public void setController(com.facebook.f.h.a aVar) {
        this.f2485c.a(aVar);
        super.setImageDrawable(this.f2485c.f());
    }

    public com.facebook.f.h.a getController() {
        return this.f2485c.d();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        b();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        a();
    }

    protected void a() {
        c();
    }

    protected void b() {
        d();
    }

    protected void c() {
        this.f2485c.b();
    }

    protected void d() {
        this.f2485c.c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2485c.a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        a(getContext());
        this.f2485c.a((com.facebook.f.h.a) null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        a(getContext());
        this.f2485c.a((com.facebook.f.h.a) null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        a(getContext());
        this.f2485c.a((com.facebook.f.h.a) null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        a(getContext());
        this.f2485c.a((com.facebook.f.h.a) null);
        super.setImageURI(uri);
    }

    public void setAspectRatio(float f) {
        if (f == this.f2484b) {
            return;
        }
        this.f2484b = f;
        requestLayout();
    }

    public float getAspectRatio() {
        return this.f2484b;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        this.f2483a.f2477a = i;
        this.f2483a.f2478b = i2;
        a.a(this.f2483a, this.f2484b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        super.onMeasure(this.f2483a.f2477a, this.f2483a.f2478b);
    }

    @Override // android.view.View
    public String toString() {
        return h.a(this).a("holder", this.f2485c != null ? this.f2485c.toString() : "<no holder set>").toString();
    }
}
