package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.n;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
/* compiled from: ProgressBarContainerView.java */
/* loaded from: classes.dex */
class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Integer f4010a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4011b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4012c;

    /* renamed from: d  reason: collision with root package name */
    private double f4013d;
    private ProgressBar e;

    public a(Context context) {
        super(context);
        this.f4011b = true;
        this.f4012c = true;
    }

    public void a(String str) {
        this.e = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.e.setMax(NetstatsParserPatterns.NEW_TS_TO_MILLIS);
        removeAllViews();
        addView(this.e, new ViewGroup.LayoutParams(-1, -1));
    }

    public void a(Integer num) {
        this.f4010a = num;
    }

    public void a(boolean z) {
        this.f4011b = z;
    }

    public void a(double d2) {
        this.f4013d = d2;
    }

    public void b(boolean z) {
        this.f4012c = z;
    }

    public void a() {
        if (this.e == null) {
            throw new n("setStyle() not called");
        }
        this.e.setIndeterminate(this.f4011b);
        a(this.e);
        this.e.setProgress((int) (this.f4013d * 1000.0d));
        if (this.f4012c) {
            this.e.setVisibility(0);
        } else {
            this.e.setVisibility(8);
        }
    }

    private void a(ProgressBar progressBar) {
        Drawable progressDrawable;
        if (progressBar.isIndeterminate()) {
            progressDrawable = progressBar.getIndeterminateDrawable();
        } else {
            progressDrawable = progressBar.getProgressDrawable();
        }
        if (progressDrawable == null) {
            return;
        }
        if (this.f4010a != null) {
            progressDrawable.setColorFilter(this.f4010a.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            progressDrawable.clearColorFilter();
        }
    }
}
