package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.reactnativecommunity.webview.RNCWebViewManager;
/* loaded from: classes.dex */
class a extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private Integer f6195b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6196c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6197d;

    /* renamed from: e  reason: collision with root package name */
    private double f6198e;

    /* renamed from: f  reason: collision with root package name */
    private ProgressBar f6199f;

    public a(Context context) {
        super(context);
        this.f6196c = true;
        this.f6197d = true;
    }

    private void a(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.f6195b;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public void a() {
        ProgressBar progressBar;
        int i;
        ProgressBar progressBar2 = this.f6199f;
        if (progressBar2 != null) {
            progressBar2.setIndeterminate(this.f6196c);
            a(this.f6199f);
            this.f6199f.setProgress((int) (this.f6198e * 1000.0d));
            if (this.f6197d) {
                progressBar = this.f6199f;
                i = 0;
            } else {
                progressBar = this.f6199f;
                i = 4;
            }
            progressBar.setVisibility(i);
            return;
        }
        throw new JSApplicationIllegalArgumentException("setStyle() not called");
    }

    public void a(double d2) {
        this.f6198e = d2;
    }

    public void a(Integer num) {
        this.f6195b = num;
    }

    public void a(String str) {
        this.f6199f = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.f6199f.setMax(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        removeAllViews();
        addView(this.f6199f, new ViewGroup.LayoutParams(-1, -1));
    }

    public void a(boolean z) {
        this.f6197d = z;
    }

    public void b(boolean z) {
        this.f6196c = z;
    }
}
