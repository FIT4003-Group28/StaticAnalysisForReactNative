package com.airbnb.lottie;

import android.animation.Animator;
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
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final bxp a = new bws();
    public bxp b;
    public int c;
    public final bxn d;
    public boolean e;
    public bwx f;
    private final bxp g;
    private final bxp h;
    private boolean i;
    private String j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final Set q;
    private int r;
    private bxw s;
    private int t;

    public LottieAnimationView(Context context) {
        super(context);
        this.g = new bwt(this, 1);
        this.h = new bwt(this);
        this.c = 0;
        this.d = new bxn();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.e = true;
        this.t = 1;
        this.q = new HashSet();
        this.r = 0;
        t(null, R.attr.lottieAnimationViewStyle);
    }

    private final void r() {
        bxw bxwVar = this.s;
        if (bxwVar != null) {
            bxwVar.g(this.g);
            this.s.f(this.h);
        }
    }

    private final void t(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bxx.a, i, 0);
        this.e = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                if (resourceId != 0) {
                    f(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    g(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(16)) != null) {
                h(string);
            }
            this.c = obtainStyledAttributes.getResourceId(4, 0);
            if (obtainStyledAttributes.getBoolean(0, false)) {
                this.n = true;
                this.p = true;
            }
            if (obtainStyledAttributes.getBoolean(8, false)) {
                this.d.p(-1);
            }
            if (obtainStyledAttributes.hasValue(13)) {
                m(obtainStyledAttributes.getInt(13, 1));
            }
            if (obtainStyledAttributes.hasValue(12)) {
                l(obtainStyledAttributes.getInt(12, -1));
            }
            if (obtainStyledAttributes.hasValue(15)) {
                n(obtainStyledAttributes.getFloat(15, 1.0f));
            }
            this.d.h = obtainStyledAttributes.getString(7);
            k(obtainStyledAttributes.getFloat(9, 0.0f));
            boolean z2 = obtainStyledAttributes.getBoolean(3, false);
            bxn bxnVar = this.d;
            if (bxnVar.j != z2) {
                bxnVar.j = z2;
                if (bxnVar.a != null) {
                    bxnVar.g();
                }
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.d.f(new bzu("**"), bxs.E, new cdj(new bxy(po.a(getContext(), obtainStyledAttributes.getResourceId(2, -1)).getDefaultColor())));
            }
            if (obtainStyledAttributes.hasValue(14)) {
                this.d.c = obtainStyledAttributes.getFloat(14, 1.0f);
            }
            if (obtainStyledAttributes.hasValue(11)) {
                int i2 = obtainStyledAttributes.getInt(11, 0);
                aek.c();
                if (i2 >= 3) {
                    i2 = 0;
                }
                p(aek.c()[i2]);
            }
            this.d.e = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
            bxn bxnVar2 = this.d;
            if (cdh.b(getContext()) != 0.0f) {
                z = true;
            }
            bxnVar2.d = Boolean.valueOf(z).booleanValue();
            s();
            this.i = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    public final void a(Animator.AnimatorListener animatorListener) {
        this.d.b.addListener(animatorListener);
    }

    public final void b(bzu bzuVar, Object obj, cdl cdlVar) {
        this.d.f(bzuVar, obj, new bww(cdlVar));
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        this.r++;
        super.buildDrawingCache(z);
        if (this.r == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            p(2);
        }
        this.r--;
        bwr.a();
    }

    public final void c() {
        this.n = false;
        this.m = false;
        this.l = false;
        bxn bxnVar = this.d;
        bxnVar.f.clear();
        bxnVar.b.cancel();
        s();
    }

    public final void d() {
        this.p = false;
        this.n = false;
        this.m = false;
        this.l = false;
        this.d.i();
        s();
    }

    public final void e() {
        if (!isShown()) {
            this.l = true;
            return;
        }
        this.d.j();
        s();
    }

    public final void f(int i) {
        bxw k;
        this.k = i;
        this.j = null;
        if (isInEditMode()) {
            k = new bxw(new bwu(this, i), true);
        } else if (this.e) {
            Context context = getContext();
            k = bxe.k(context, i, bxe.n(context, i));
        } else {
            k = bxe.k(getContext(), i, null);
        }
        j(k);
    }

    public final void g(String str) {
        bxw h;
        this.j = str;
        this.k = 0;
        if (isInEditMode()) {
            h = new bxw(new bwv(this, str), true);
        } else {
            h = this.e ? bxe.h(getContext(), str) : bxe.i(getContext(), str, null);
        }
        j(h);
    }

    public final void h(String str) {
        j(this.e ? bxe.l(getContext(), str) : bxe.m(getContext(), str, null));
    }

    public final void i(bwx bwxVar) {
        this.d.setCallback(this);
        this.f = bwxVar;
        this.o = true;
        boolean r = this.d.r(bwxVar);
        this.o = false;
        s();
        if (getDrawable() == this.d) {
            if (!r) {
                return;
            }
        } else if (!r) {
            boolean o = o();
            setImageDrawable(null);
            setImageDrawable(this.d);
            if (o) {
                this.d.k();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        for (bxr bxrVar : this.q) {
            bxrVar.a(bwxVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        bxn bxnVar = this.d;
        if (drawable2 == bxnVar) {
            super.invalidateDrawable(bxnVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j(bxw bxwVar) {
        this.f = null;
        this.d.h();
        r();
        bxwVar.e(this.g);
        bxwVar.d(this.h);
        this.s = bxwVar;
    }

    public final void k(float f) {
        this.d.o(f);
    }

    public final void l(int i) {
        this.d.p(i);
    }

    public final void m(int i) {
        this.d.b.setRepeatMode(i);
    }

    public final void n(float f) {
        this.d.b.b = f;
    }

    public final boolean o() {
        return this.d.q();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.p || this.n)) {
            e();
            this.p = false;
            this.n = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        if (o()) {
            c();
            this.n = true;
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
            g(this.j);
        }
        int i = savedState.b;
        this.k = i;
        if (i != 0) {
            f(i);
        }
        k(savedState.c);
        if (savedState.d) {
            e();
        }
        this.d.h = savedState.e;
        m(savedState.f);
        l(savedState.g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.j;
        savedState.b = this.k;
        savedState.c = this.d.c();
        boolean z = false;
        if (this.d.q() || (!lj.aj(this) && this.n)) {
            z = true;
        }
        savedState.d = z;
        bxn bxnVar = this.d;
        savedState.e = bxnVar.h;
        savedState.f = bxnVar.b.getRepeatMode();
        savedState.g = this.d.e();
        return savedState;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        if (!this.i) {
            return;
        }
        if (isShown()) {
            if (this.m) {
                if (isShown()) {
                    this.d.k();
                    s();
                }
            } else if (this.l) {
                e();
            }
            this.m = false;
            this.l = false;
        } else if (!o()) {
        } else {
            d();
            this.m = true;
        }
    }

    public final void p(int i) {
        this.t = i;
        s();
    }

    public final void q(bxr bxrVar) {
        bwx bwxVar = this.f;
        if (bwxVar != null) {
            bxrVar.a(bwxVar);
        }
        this.q.add(bxrVar);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        r();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        r();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        r();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        bxn bxnVar;
        if (!this.o && drawable == (bxnVar = this.d) && bxnVar.q()) {
            d();
        } else if (!this.o && (drawable instanceof bxn)) {
            bxn bxnVar2 = (bxn) drawable;
            if (bxnVar2.q()) {
                bxnVar2.i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private final void s() {
        bwx bwxVar;
        bwx bwxVar2;
        int i = this.t;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 2;
            if (i2 == 0 ? !(((bwxVar = this.f) == null || !bwxVar.k || Build.VERSION.SDK_INT >= 28) && (((bwxVar2 = this.f) == null || bwxVar2.l <= 4) && Build.VERSION.SDK_INT != 24 && Build.VERSION.SDK_INT != 25)) : i2 != 1) {
                i3 = 1;
            }
            if (i3 == getLayerType()) {
                return;
            }
            setLayerType(i3, null);
            return;
        }
        throw null;
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new asq(10);
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
        this.g = new bwt(this, 1);
        this.h = new bwt(this);
        this.c = 0;
        this.d = new bxn();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.e = true;
        this.t = 1;
        this.q = new HashSet();
        this.r = 0;
        t(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new bwt(this, 1);
        this.h = new bwt(this);
        this.c = 0;
        this.d = new bxn();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.e = true;
        this.t = 1;
        this.q = new HashSet();
        this.r = 0;
        t(attributeSet, i);
    }
}
