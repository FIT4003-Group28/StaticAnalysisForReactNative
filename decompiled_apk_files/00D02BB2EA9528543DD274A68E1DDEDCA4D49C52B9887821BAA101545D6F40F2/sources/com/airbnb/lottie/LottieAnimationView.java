package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final bjt<Throwable> a = new bin();
    public bjt<Throwable> b;
    public int c;
    public final bjr d;
    public Set<dkp> e;
    public bis f;
    private final bjt<bis> g;
    private final bjt<Throwable> h;
    private boolean i;
    private String j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private bkd o;
    private int p;
    private bjz<bis> q;

    public LottieAnimationView(Context context) {
        super(context);
        this.g = new bio(this);
        this.h = new bip(this);
        this.c = 0;
        this.d = new bjr();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = bkd.AUTOMATIC;
        this.e = new HashSet();
        this.p = 0;
        h(null);
    }

    private final void h(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bkc.a);
        boolean z = false;
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(8);
            boolean hasValue2 = obtainStyledAttributes.hasValue(4);
            boolean hasValue3 = obtainStyledAttributes.hasValue(14);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(8, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else if (hasValue2) {
                    String string2 = obtainStyledAttributes.getString(4);
                    if (string2 != null) {
                        setAnimation(string2);
                    }
                } else if (hasValue3 && (string = obtainStyledAttributes.getString(14)) != null) {
                    setAnimationFromUrl(string);
                }
                setFallbackResource(obtainStyledAttributes.getResourceId(3, 0));
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.m = true;
            this.n = true;
        }
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.d.s(-1);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setRepeatMode(obtainStyledAttributes.getInt(11, 1));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRepeatCount(obtainStyledAttributes.getInt(10, -1));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            setSpeed(obtainStyledAttributes.getFloat(13, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(5));
        setProgress(obtainStyledAttributes.getFloat(7, 0.0f));
        boolean z2 = obtainStyledAttributes.getBoolean(2, false);
        bjr bjrVar = this.d;
        if (bjrVar.m != z2) {
            bjrVar.m = z2;
            if (bjrVar.a != null) {
                bjrVar.a();
            }
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.d.z(new bly("**"), bjv.B, new bpv(new bke(obtainStyledAttributes.getColor(1, 0))));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.d.v(obtainStyledAttributes.getFloat(12, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            int i = obtainStyledAttributes.getInt(9, bkd.AUTOMATIC.ordinal());
            if (i >= bkd.values().length) {
                i = bkd.AUTOMATIC.ordinal();
            }
            setRenderMode(bkd.values()[i]);
        }
        if (getScaleType() != null) {
            this.d.f = getScaleType();
        }
        obtainStyledAttributes.recycle();
        bjr bjrVar2 = this.d;
        if (bps.h(getContext()) != 0.0f) {
            z = true;
        }
        bjrVar2.d = Boolean.valueOf(z).booleanValue();
        k();
        this.i = true;
    }

    private final void i(bjz<bis> bjzVar) {
        this.f = null;
        this.d.b();
        j();
        bjzVar.e(this.g);
        bjzVar.d(this.h);
        this.q = bjzVar;
    }

    private final void j() {
        bjz<bis> bjzVar = this.q;
        if (bjzVar != null) {
            bjzVar.g(this.g);
            this.q.f(this.h);
        }
    }

    private final void k() {
        bis bisVar;
        bis bisVar2;
        bkd bkdVar = bkd.AUTOMATIC;
        int ordinal = this.o.ordinal();
        int i = 2;
        if (ordinal == 0 ? !(((bisVar = this.f) == null || !bisVar.m || Build.VERSION.SDK_INT >= 28) && ((bisVar2 = this.f) == null || bisVar2.n <= 4)) : ordinal != 1) {
            i = 1;
        }
        if (i != getLayerType()) {
            setLayerType(i, null);
        }
    }

    public final void a() {
        if (!isShown()) {
            this.l = true;
            return;
        }
        this.d.c();
        k();
    }

    @Deprecated
    public final void b(boolean z) {
        this.d.s(true != z ? 0 : -1);
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        this.p++;
        super.buildDrawingCache(z);
        if (this.p == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(bkd.HARDWARE);
        }
        this.p--;
        bim.a();
    }

    public final boolean c() {
        return this.d.u();
    }

    public final <T> void d(bly blyVar, T t, bpx<T> bpxVar) {
        this.d.z(blyVar, t, new biq(bpxVar));
    }

    public final void e() {
        this.l = false;
        bjr bjrVar = this.d;
        bjrVar.e.clear();
        bjrVar.b.cancel();
        k();
    }

    public final void f() {
        this.n = false;
        this.m = false;
        this.l = false;
        bjr bjrVar = this.d;
        bjrVar.e.clear();
        bjrVar.b.l();
        k();
    }

    public final void g() {
        bjr bjrVar = this.d;
        blt A = bjrVar.A();
        if (A == null) {
            bpo.a("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return;
        }
        bjs bjsVar = A.d.get("image_0");
        Bitmap bitmap = bjsVar.e;
        bjsVar.e = null;
        bjrVar.invalidateSelf();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        bjr bjrVar = this.d;
        if (drawable2 == bjrVar) {
            super.invalidateDrawable(bjrVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.n || this.m) {
            a();
            this.n = false;
            this.m = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        if (c()) {
            e();
            this.m = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.a;
        this.j = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.j);
        }
        int i = savedState.b;
        this.k = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.c);
        if (savedState.d) {
            a();
        }
        this.d.h = savedState.e;
        setRepeatMode(savedState.f);
        setRepeatCount(savedState.g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.j;
        savedState.b = this.k;
        savedState.c = this.d.y();
        savedState.d = this.d.u();
        bjr bjrVar = this.d;
        savedState.e = bjrVar.h;
        savedState.f = bjrVar.b.getRepeatMode();
        savedState.g = this.d.t();
        return savedState;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        if (!this.i) {
            return;
        }
        if (!isShown()) {
            if (!c()) {
                return;
            }
            f();
            this.l = true;
        } else if (!this.l) {
        } else {
            if (isShown()) {
                this.d.d();
                k();
            }
            this.l = false;
        }
    }

    public void setAnimation(int i) {
        this.k = i;
        this.j = null;
        i(bja.d(getContext(), i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        i(bja.a(getContext(), str));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.d.p = z;
    }

    public void setComposition(bis bisVar) {
        float f;
        float f2;
        this.d.setCallback(this);
        this.f = bisVar;
        bjr bjrVar = this.d;
        boolean z = false;
        if (bjrVar.a != bisVar) {
            bjrVar.q = false;
            bjrVar.b();
            bjrVar.a = bisVar;
            bjrVar.a();
            bpp bppVar = bjrVar.b;
            bis bisVar2 = bppVar.h;
            bppVar.h = bisVar;
            if (bisVar2 == null) {
                f = (int) Math.max(bppVar.f, bisVar.j);
                f2 = Math.min(bppVar.g, bisVar.k);
            } else {
                f = (int) bisVar.j;
                f2 = bisVar.k;
            }
            bppVar.e(f, (int) f2);
            float f3 = bppVar.d;
            bppVar.d = 0.0f;
            bppVar.d((int) f3);
            bjrVar.r(bjrVar.b.getAnimatedFraction());
            bjrVar.v(bjrVar.c);
            bjrVar.x();
            Iterator it = new ArrayList(bjrVar.e).iterator();
            while (it.hasNext()) {
                ((bjq) it.next()).a();
                it.remove();
            }
            bjrVar.e.clear();
            bisVar.c(bjrVar.o);
            z = true;
        }
        k();
        if (getDrawable() != this.d || z) {
            setImageDrawable(null);
            setImageDrawable(this.d);
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (dkp dkpVar : this.e) {
                dkpVar.a();
            }
        }
    }

    public void setFailureListener(bjt<Throwable> bjtVar) {
        this.b = bjtVar;
    }

    public void setFallbackResource(int i) {
        this.c = i;
    }

    public void setFontAssetDelegate(bik bikVar) {
        bjr bjrVar = this.d;
        bjrVar.k = bikVar;
        bls blsVar = bjrVar.j;
        if (blsVar != null) {
            blsVar.e = bikVar;
        }
    }

    public void setFrame(int i) {
        this.d.q(i);
    }

    public void setImageAssetDelegate(bil bilVar) {
        bjr bjrVar = this.d;
        bjrVar.i = bilVar;
        blt bltVar = bjrVar.g;
        if (bltVar != null) {
            bltVar.c = bilVar;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.d.h = str;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        j();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        j();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        j();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.d.h(i);
    }

    public void setMaxProgress(float f) {
        this.d.j(f);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.d.n(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.d.o(f, f2);
    }

    public void setMinFrame(int i) {
        this.d.e(i);
    }

    public void setMinProgress(float f) {
        this.d.g(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        bjr bjrVar = this.d;
        bjrVar.o = z;
        bis bisVar = bjrVar.a;
        if (bisVar != null) {
            bisVar.c(z);
        }
    }

    public void setProgress(float f) {
        this.d.r(f);
    }

    public void setRenderMode(bkd bkdVar) {
        this.o = bkdVar;
        k();
    }

    public void setRepeatCount(int i) {
        this.d.s(i);
    }

    public void setRepeatMode(int i) {
        this.d.b.setRepeatMode(i);
    }

    public void setScale(float f) {
        this.d.v(f);
        if (getDrawable() == this.d) {
            setImageDrawable(null);
            setImageDrawable(this.d);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        bjr bjrVar = this.d;
        if (bjrVar != null) {
            bjrVar.f = scaleType;
        }
    }

    public void setSpeed(float f) {
        this.d.b.b = f;
    }

    public void setTextDelegate(bkf bkfVar) {
        this.d.l = bkfVar;
    }

    public void setAnimation(InputStream inputStream, String str) {
        i(bja.f(inputStream, str));
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.d.l(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.d.m(str);
    }

    public void setMinFrame(String str) {
        this.d.k(str);
    }

    public void setAnimation(String str) {
        this.j = str;
        this.k = 0;
        i(bja.b(getContext(), str));
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new bir();
        String a;
        int b;
        float c;
        boolean d;
        String e;
        int f;
        int g;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() != 1 ? false : true;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new bio(this);
        this.h = new bip(this);
        this.c = 0;
        this.d = new bjr();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = bkd.AUTOMATIC;
        this.e = new HashSet();
        this.p = 0;
        h(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new bio(this);
        this.h = new bip(this);
        this.c = 0;
        this.d = new bjr();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = bkd.AUTOMATIC;
        this.e = new HashSet();
        this.p = 0;
        h(attributeSet);
    }
}
