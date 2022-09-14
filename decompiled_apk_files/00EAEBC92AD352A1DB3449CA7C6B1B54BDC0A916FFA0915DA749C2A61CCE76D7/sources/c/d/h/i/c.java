package c.d.h.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import c.d.d.d.h;
import c.d.h.h.b;
import c.d.h.i.a;
/* loaded from: classes.dex */
public class c<DH extends c.d.h.h.b> extends ImageView {

    /* renamed from: g  reason: collision with root package name */
    private static boolean f3129g = false;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0080a f3130b;

    /* renamed from: c  reason: collision with root package name */
    private float f3131c;

    /* renamed from: d  reason: collision with root package name */
    private b<DH> f3132d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3133e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3134f;

    public c(Context context) {
        super(context);
        this.f3130b = new a.C0080a();
        this.f3131c = 0.0f;
        this.f3133e = false;
        this.f3134f = false;
        a(context);
    }

    private void a(Context context) {
        boolean c2;
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("DraweeView#init");
            }
            if (this.f3133e) {
                if (!c2) {
                    return;
                }
                return;
            }
            boolean z = true;
            this.f3133e = true;
            this.f3132d = b.a(null, context);
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList == null) {
                    if (!c.d.j.p.b.c()) {
                        return;
                    }
                    c.d.j.p.b.a();
                    return;
                }
                setColorFilter(imageTintList.getDefaultColor());
            }
            if (!f3129g || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.f3134f = z;
            if (!c.d.j.p.b.c()) {
                return;
            }
            c.d.j.p.b.a();
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }

    private void e() {
        Drawable drawable;
        if (!this.f3134f || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f3129g = z;
    }

    protected void a() {
        this.f3132d.f();
    }

    protected void b() {
        this.f3132d.g();
    }

    protected void c() {
        a();
    }

    protected void d() {
        b();
    }

    public float getAspectRatio() {
        return this.f3131c;
    }

    public c.d.h.h.a getController() {
        return this.f3132d.b();
    }

    public DH getHierarchy() {
        return this.f3132d.c();
    }

    public Drawable getTopLevelDrawable() {
        return this.f3132d.d();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
        c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
        d();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        e();
        c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        a.C0080a c0080a = this.f3130b;
        c0080a.f3121a = i;
        c0080a.f3122b = i2;
        a.a(c0080a, this.f3131c, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0080a c0080a2 = this.f3130b;
        super.onMeasure(c0080a2.f3121a, c0080a2.f3122b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        e();
        d();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3132d.a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        e();
    }

    public void setAspectRatio(float f2) {
        if (f2 == this.f3131c) {
            return;
        }
        this.f3131c = f2;
        requestLayout();
    }

    public void setController(c.d.h.h.a aVar) {
        this.f3132d.a(aVar);
        super.setImageDrawable(this.f3132d.d());
    }

    public void setHierarchy(DH dh) {
        this.f3132d.a((b<DH>) dh);
        super.setImageDrawable(this.f3132d.d());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        a(getContext());
        this.f3132d.a((c.d.h.h.a) null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        a(getContext());
        this.f3132d.a((c.d.h.h.a) null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        a(getContext());
        this.f3132d.a((c.d.h.h.a) null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        a(getContext());
        this.f3132d.a((c.d.h.h.a) null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f3134f = z;
    }

    @Override // android.view.View
    public String toString() {
        h.b a2 = h.a(this);
        b<DH> bVar = this.f3132d;
        a2.a("holder", bVar != null ? bVar.toString() : "<no holder set>");
        return a2.toString();
    }
}
