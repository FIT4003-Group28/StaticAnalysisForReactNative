package com.google.android.apps.youtube.app.offline.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class UploadArrowView extends jqd {
    public UploadArrowView(Context context) {
        super(context);
        b(zhn.n(context, null, 0), null);
    }

    private final void b(Context context, AttributeSet attributeSet) {
        int i;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jqc.b);
        this.k = 2131233485;
        int i2 = obtainStyledAttributes.getInt(0, 0);
        if (i2 == 0) {
            i = 2131233228;
        } else if (i2 != 1) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Unsupported UploadArrowView completedStyle: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i = 2131233343;
        }
        this.l = i;
        this.m = 2131232322;
        obtainStyledAttributes.recycle();
        this.o = ColorStateList.valueOf(zhn.d(getContext(), R.attr.ytBrandIconInactive));
        TintableImageView tintableImageView = new TintableImageView(context);
        this.f = tintableImageView;
        tintableImageView.setScaleType(ImageView.ScaleType.CENTER);
        tintableImageView.a(this.o);
        a(this.k);
        final int d = zhn.d(getContext(), R.attr.ytCallToAction);
        Drawable a = akf.a(context, R.drawable.offline_progress_bar_v2);
        this.j = a;
        this.e = new ProgressBar(context, null, 16842872);
        this.e.setProgressDrawable(a);
        this.e.setRotation(-90.0f);
        this.e.setProgressTintList(ColorStateList.valueOf(d));
        this.e.setVisibility(8);
        ProgressBar progressBar = new ProgressBar(context);
        this.g = progressBar;
        progressBar.setIndeterminateDrawable(new tpj(-1.0f, resources.getDimensionPixelSize(R.dimen.offline_progress_bar_thickness), resources.getDimensionPixelSize(R.dimen.offline_progress_bar_inset_radius), new int[]{d}));
        progressBar.setVisibility(8);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.i = lottieAnimationView;
        lottieAnimationView.f(R.raw.ic_offline_arrow_lottie);
        lottieAnimationView.l(-1);
        lottieAnimationView.setRotationX(180.0f);
        lottieAnimationView.b(new bzu("**"), bxs.E, new cdl() { // from class: jqp
            @Override // defpackage.cdl
            public final Object a() {
                return new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_ATOP);
            }
        });
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.offline_arrow_lottie_size);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.offline_progress_bar_size);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17);
        addView(progressBar, layoutParams2);
        addView(this.e, layoutParams2);
        addView(lottieAnimationView, layoutParams);
        addView(tintableImageView, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void a(int i) {
        j();
        this.n = i;
        AnimationDrawable animationDrawable = this.h;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        TintableImageView tintableImageView = this.f;
        if (tintableImageView != null) {
            tintableImageView.setImageResource(i);
            tintableImageView.a(this.o);
        }
    }

    @Override // defpackage.jqd
    public final void i(int i) {
        ProgressBar progressBar = this.e;
        if (progressBar != null) {
            progressBar.setProgressDrawable(this.j);
            zag.o(progressBar, true);
            zag.o(this.g, false);
            progressBar.setMax(100);
            progressBar.setProgress(i);
        }
    }

    public UploadArrowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(zhn.n(context, attributeSet, 0), attributeSet);
    }

    public UploadArrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(zhn.n(context, attributeSet, 0), attributeSet);
    }

    public UploadArrowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(zhn.n(context, attributeSet, 0), attributeSet);
    }
}
