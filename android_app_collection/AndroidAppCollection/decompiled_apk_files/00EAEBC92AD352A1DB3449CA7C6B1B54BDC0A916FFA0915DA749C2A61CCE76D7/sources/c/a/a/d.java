package c.a.a;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class d extends androidx.appcompat.widget.o {
    private static final String q = d.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private final i<e> f2205d;

    /* renamed from: e  reason: collision with root package name */
    private final i<Throwable> f2206e;

    /* renamed from: f  reason: collision with root package name */
    private final g f2207f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2208g;

    /* renamed from: h  reason: collision with root package name */
    private String f2209h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private q m;
    private Set<k> n;
    private n<e> o;
    private e p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements i<e> {
        a() {
        }

        @Override // c.a.a.i
        public void a(e eVar) {
            d.this.setComposition(eVar);
        }
    }

    /* loaded from: classes.dex */
    class b implements i<Throwable> {
        b(d dVar) {
        }

        @Override // c.a.a.i
        public /* bridge */ /* synthetic */ void a(Throwable th) {
            a2(th);
            throw null;
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(Throwable th) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2211a = new int[q.values().length];

        static {
            try {
                f2211a[q.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2211a[q.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2211a[q.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c.a.a.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0060d extends View.BaseSavedState {
        public static final Parcelable.Creator<C0060d> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        String f2212b;

        /* renamed from: c  reason: collision with root package name */
        int f2213c;

        /* renamed from: d  reason: collision with root package name */
        float f2214d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2215e;

        /* renamed from: f  reason: collision with root package name */
        String f2216f;

        /* renamed from: g  reason: collision with root package name */
        int f2217g;

        /* renamed from: h  reason: collision with root package name */
        int f2218h;

        /* renamed from: c.a.a.d$d$a */
        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<C0060d> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public C0060d mo86createFromParcel(Parcel parcel) {
                return new C0060d(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public C0060d[] mo87newArray(int i) {
                return new C0060d[i];
            }
        }

        private C0060d(Parcel parcel) {
            super(parcel);
            this.f2212b = parcel.readString();
            this.f2214d = parcel.readFloat();
            this.f2215e = parcel.readInt() != 1 ? false : true;
            this.f2216f = parcel.readString();
            this.f2217g = parcel.readInt();
            this.f2218h = parcel.readInt();
        }

        /* synthetic */ C0060d(Parcel parcel, a aVar) {
            this(parcel);
        }

        C0060d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2212b);
            parcel.writeFloat(this.f2214d);
            parcel.writeInt(this.f2215e ? 1 : 0);
            parcel.writeString(this.f2216f);
            parcel.writeInt(this.f2217g);
            parcel.writeInt(this.f2218h);
        }
    }

    public d(Context context) {
        super(context);
        this.f2205d = new a();
        this.f2206e = new b(this);
        this.f2207f = new g();
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = q.AUTOMATIC;
        this.n = new HashSet();
        a((AttributeSet) null);
    }

    private void a(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.LottieAnimationView);
        boolean z = false;
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(p.LottieAnimationView_lottie_rawRes);
            boolean hasValue2 = obtainStyledAttributes.hasValue(p.LottieAnimationView_lottie_fileName);
            boolean hasValue3 = obtainStyledAttributes.hasValue(p.LottieAnimationView_lottie_url);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(p.LottieAnimationView_lottie_rawRes, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(p.LottieAnimationView_lottie_fileName);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(p.LottieAnimationView_lottie_url)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(p.LottieAnimationView_lottie_autoPlay, false)) {
            this.k = true;
            this.l = true;
        }
        if (obtainStyledAttributes.getBoolean(p.LottieAnimationView_lottie_loop, false)) {
            this.f2207f.d(-1);
        }
        if (obtainStyledAttributes.hasValue(p.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(p.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(p.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(p.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(p.LottieAnimationView_lottie_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(p.LottieAnimationView_lottie_speed, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(p.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(p.LottieAnimationView_lottie_progress, 0.0f));
        a(obtainStyledAttributes.getBoolean(p.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (obtainStyledAttributes.hasValue(p.LottieAnimationView_lottie_colorFilter)) {
            a(new c.a.a.v.e("**"), l.B, new c.a.a.z.c(new r(obtainStyledAttributes.getColor(p.LottieAnimationView_lottie_colorFilter, 0))));
        }
        if (obtainStyledAttributes.hasValue(p.LottieAnimationView_lottie_scale)) {
            this.f2207f.d(obtainStyledAttributes.getFloat(p.LottieAnimationView_lottie_scale, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(p.LottieAnimationView_lottie_renderMode)) {
            int i = obtainStyledAttributes.getInt(p.LottieAnimationView_lottie_renderMode, q.AUTOMATIC.ordinal());
            if (i >= q.values().length) {
                i = q.AUTOMATIC.ordinal();
            }
            this.m = q.values()[i];
        }
        obtainStyledAttributes.recycle();
        g gVar = this.f2207f;
        if (c.a.a.y.h.a(getContext()) != 0.0f) {
            z = true;
        }
        gVar.a(Boolean.valueOf(z));
        k();
        this.f2208g = true;
    }

    private void i() {
        n<e> nVar = this.o;
        if (nVar != null) {
            nVar.d(this.f2205d);
            this.o.c(this.f2206e);
        }
    }

    private void j() {
        this.p = null;
        this.f2207f.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r3 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k() {
        /*
            r5 = this;
            int[] r0 = c.a.a.d.c.f2211a
            c.a.a.q r1 = r5.m
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L3d
            if (r0 == r1) goto L13
            r3 = 3
            if (r0 == r3) goto L15
        L13:
            r1 = 1
            goto L3d
        L15:
            c.a.a.e r0 = r5.p
            r3 = 0
            if (r0 == 0) goto L27
            boolean r0 = r0.m()
            if (r0 == 0) goto L27
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L27
            goto L3b
        L27:
            c.a.a.e r0 = r5.p
            if (r0 == 0) goto L33
            int r0 = r0.j()
            r4 = 4
            if (r0 <= r4) goto L33
            goto L3b
        L33:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L3a
            goto L3b
        L3a:
            r3 = 1
        L3b:
            if (r3 == 0) goto L13
        L3d:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L47
            r0 = 0
            r5.setLayerType(r1, r0)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.d.k():void");
    }

    private void setCompositionTask(n<e> nVar) {
        j();
        i();
        nVar.b(this.f2205d);
        nVar.a(this.f2206e);
        this.o = nVar;
    }

    public void a() {
        this.j = false;
        this.f2207f.a();
        k();
    }

    public void a(int i, int i2) {
        this.f2207f.a(i, i2);
    }

    public void a(Animator.AnimatorListener animatorListener) {
        this.f2207f.a(animatorListener);
    }

    public <T> void a(c.a.a.v.e eVar, T t, c.a.a.z.c<T> cVar) {
        this.f2207f.a(eVar, t, cVar);
    }

    public void a(c.a.a.x.k0.c cVar, String str) {
        setCompositionTask(f.a(cVar, str));
    }

    public void a(String str, String str2) {
        a(c.a.a.x.k0.c.a(h.l.a(h.l.a(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    public void a(boolean z) {
        this.f2207f.a(z);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        super.buildDrawingCache(z);
        if (getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(q.HARDWARE);
        }
    }

    public boolean d() {
        return this.f2207f.q();
    }

    public void e() {
        this.l = false;
        this.k = false;
        this.j = false;
        this.f2207f.r();
        k();
    }

    public void f() {
        if (!isShown()) {
            this.j = true;
            return;
        }
        this.f2207f.s();
        k();
    }

    public void g() {
        if (!isShown()) {
            this.j = true;
            return;
        }
        this.f2207f.t();
        k();
    }

    public e getComposition() {
        return this.p;
    }

    public long getDuration() {
        e eVar = this.p;
        if (eVar != null) {
            return eVar.c();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f2207f.f();
    }

    public String getImageAssetsFolder() {
        return this.f2207f.g();
    }

    public float getMaxFrame() {
        return this.f2207f.h();
    }

    public float getMinFrame() {
        return this.f2207f.i();
    }

    public o getPerformanceTracker() {
        return this.f2207f.j();
    }

    public float getProgress() {
        return this.f2207f.k();
    }

    public int getRepeatCount() {
        return this.f2207f.l();
    }

    public int getRepeatMode() {
        return this.f2207f.m();
    }

    public float getScale() {
        return this.f2207f.n();
    }

    public float getSpeed() {
        return this.f2207f.o();
    }

    public void h() {
        this.f2207f.u();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        g gVar = this.f2207f;
        if (drawable2 == gVar) {
            super.invalidateDrawable(gVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l || this.k) {
            f();
            this.l = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (d()) {
            a();
            this.k = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0060d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0060d c0060d = (C0060d) parcelable;
        super.onRestoreInstanceState(c0060d.getSuperState());
        this.f2209h = c0060d.f2212b;
        if (!TextUtils.isEmpty(this.f2209h)) {
            setAnimation(this.f2209h);
        }
        this.i = c0060d.f2213c;
        int i = this.i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(c0060d.f2214d);
        if (c0060d.f2215e) {
            f();
        }
        this.f2207f.b(c0060d.f2216f);
        setRepeatMode(c0060d.f2217g);
        setRepeatCount(c0060d.f2218h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0060d c0060d = new C0060d(super.onSaveInstanceState());
        c0060d.f2212b = this.f2209h;
        c0060d.f2213c = this.i;
        c0060d.f2214d = this.f2207f.k();
        c0060d.f2215e = this.f2207f.q();
        c0060d.f2216f = this.f2207f.g();
        c0060d.f2217g = this.f2207f.m();
        c0060d.f2218h = this.f2207f.l();
        return c0060d;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        boolean z;
        if (!this.f2208g) {
            return;
        }
        if (isShown()) {
            if (!this.j) {
                return;
            }
            g();
            z = false;
        } else if (!d()) {
            return;
        } else {
            e();
            z = true;
        }
        this.j = z;
    }

    public void setAnimation(int i) {
        this.i = i;
        this.f2209h = null;
        setCompositionTask(f.a(getContext(), i));
    }

    public void setAnimation(String str) {
        this.f2209h = str;
        this.i = 0;
        setCompositionTask(f.a(getContext(), str));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        a(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(f.c(getContext(), str));
    }

    public void setComposition(e eVar) {
        if (c.a.a.c.f2199a) {
            String str = q;
            Log.v(str, "Set Composition \n" + eVar);
        }
        this.f2207f.setCallback(this);
        this.p = eVar;
        boolean a2 = this.f2207f.a(eVar);
        k();
        if (getDrawable() != this.f2207f || a2) {
            setImageDrawable(null);
            setImageDrawable(this.f2207f);
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (k kVar : this.n) {
                kVar.a(eVar);
            }
        }
    }

    public void setFontAssetDelegate(c.a.a.a aVar) {
        this.f2207f.a(aVar);
    }

    public void setFrame(int i) {
        this.f2207f.a(i);
    }

    public void setImageAssetDelegate(c.a.a.b bVar) {
        this.f2207f.a(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f2207f.b(str);
    }

    @Override // androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        i();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        i();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageResource(int i) {
        i();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f2207f.b(i);
    }

    public void setMaxFrame(String str) {
        this.f2207f.c(str);
    }

    public void setMaxProgress(float f2) {
        this.f2207f.a(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.f2207f.d(str);
    }

    public void setMinFrame(int i) {
        this.f2207f.c(i);
    }

    public void setMinFrame(String str) {
        this.f2207f.e(str);
    }

    public void setMinProgress(float f2) {
        this.f2207f.b(f2);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f2207f.b(z);
    }

    public void setProgress(float f2) {
        this.f2207f.c(f2);
    }

    public void setRenderMode(q qVar) {
        this.m = qVar;
        k();
    }

    public void setRepeatCount(int i) {
        this.f2207f.d(i);
    }

    public void setRepeatMode(int i) {
        this.f2207f.e(i);
    }

    public void setScale(float f2) {
        this.f2207f.d(f2);
        if (getDrawable() == this.f2207f) {
            setImageDrawable(null);
            setImageDrawable(this.f2207f);
        }
    }

    public void setSpeed(float f2) {
        this.f2207f.e(f2);
    }

    public void setTextDelegate(s sVar) {
        this.f2207f.a(sVar);
    }
}
