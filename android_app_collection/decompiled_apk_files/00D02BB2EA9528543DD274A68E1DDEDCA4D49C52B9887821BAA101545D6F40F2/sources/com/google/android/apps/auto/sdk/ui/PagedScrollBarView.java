package com.google.android.apps.auto.sdk.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PagedScrollBarView extends FrameLayout implements View.OnClickListener, View.OnLongClickListener {
    public final View a;
    public final View b;
    public final View c;
    public boolean d;
    private final ImageView e;
    private final ImageView f;
    private final ImageView g;
    private final Interpolator h;
    private final int i;
    private final int j;
    private cow k;

    public PagedScrollBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public static final void a(View view) {
        view.setVisibility(0);
        view.setFocusable(view.isEnabled());
        if (Build.VERSION.SDK_INT >= 26) {
            view.setDefaultFocusHighlightEnabled(false);
        }
    }

    private final void b(View view, boolean z) {
        view.setEnabled(z);
        if (this.d) {
            view.setFocusable(z);
        }
    }

    private final void c(View view) {
        cow cowVar = this.k;
        if (cowVar == null) {
            return;
        }
        cowVar.a(view.getId() == R.id.page_up_container ? 0 : 1);
    }

    private static final void d(ImageView imageView, boolean z) {
        imageView.setImageAlpha(true != z ? 50 : 255);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c(view);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        c(view);
        return true;
    }

    @Deprecated
    public void setAutoDayNightMode() {
        setDayNightStyle(0);
    }

    @Deprecated
    public void setDarkMode() {
        setDayNightStyle(3);
    }

    public void setDayNightStyle(int i) {
        int c;
        int c2;
        int i2;
        if (i == 0) {
            c = akm.c(getContext(), R.color.gearhead_sdk_tint);
            c2 = akm.c(getContext(), R.color.gearhead_sdk_scrollbar_thumb);
            i2 = R.drawable.gearhead_sdk_pagination_background;
        } else if (i == 1) {
            c = akm.c(getContext(), R.color.gearhead_sdk_tint_inverse);
            c2 = akm.c(getContext(), R.color.gearhead_sdk_scrollbar_thumb_inverse);
            i2 = R.drawable.gearhead_sdk_pagination_background_inverse;
        } else if (i == 2) {
            c = akm.c(getContext(), R.color.gearhead_sdk_tint_night);
            c2 = akm.c(getContext(), R.color.gearhead_sdk_scrollbar_thumb_night);
            i2 = R.drawable.gearhead_sdk_pagination_background_night;
        } else if (i == 3) {
            c = akm.c(getContext(), R.color.gearhead_sdk_tint_day);
            c2 = akm.c(getContext(), R.color.gearhead_sdk_scrollbar_thumb_day);
            i2 = R.drawable.gearhead_sdk_pagination_background_day;
        } else {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Unknown DayNightStyle: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.g.setBackgroundColor(c2);
        this.e.setColorFilter(c, PorterDuff.Mode.SRC_IN);
        this.e.setBackgroundResource(i2);
        this.f.setColorFilter(c, PorterDuff.Mode.SRC_IN);
        this.f.setBackgroundResource(i2);
    }

    public void setDownEnabled(boolean z) {
        b(this.b, z);
        d(this.f, z);
    }

    @Deprecated
    public void setLightMode() {
        setDayNightStyle(2);
    }

    public void setPaginationListener(cow cowVar) {
        this.k = cowVar;
    }

    public void setParameters(int i, int i2, int i3, boolean z) {
        int height = (this.c.getHeight() - this.c.getPaddingTop()) - this.c.getPaddingBottom();
        int max = Math.max(Math.min((i3 * height) / i, this.j), this.i);
        int i4 = height - max;
        if (this.b.isEnabled()) {
            i4 = (i4 * i2) / i;
        }
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        if (layoutParams.height != max) {
            layoutParams.height = max;
            this.g.requestLayout();
        }
        this.g.animate().y(i4).setDuration(true != z ? 0 : 200).setInterpolator(this.h).start();
    }

    public void setUpEnabled(boolean z) {
        b(this.a, z);
        d(this.e, z);
    }

    public PagedScrollBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PagedScrollBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h = new AccelerateDecelerateInterpolator();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.gearhead_sdk_paged_scrollbar_buttons, (ViewGroup) this, true);
        this.e = (ImageView) findViewById(R.id.page_up);
        View findViewById = findViewById(R.id.page_up_container);
        this.a = findViewById;
        findViewById.setOnClickListener(this);
        findViewById.setOnLongClickListener(this);
        this.f = (ImageView) findViewById(R.id.page_down);
        View findViewById2 = findViewById(R.id.page_down_container);
        this.b = findViewById2;
        findViewById2.setOnClickListener(this);
        findViewById2.setOnLongClickListener(this);
        this.g = (ImageView) findViewById(R.id.scrollbar_thumb);
        this.c = findViewById(R.id.filler);
        this.i = getResources().getDimensionPixelSize(R.dimen.min_thumb_height);
        this.j = getResources().getDimensionPixelSize(R.dimen.max_thumb_height);
        if (!context.getResources().getBoolean(R.bool.gearhead_sdk_true_for_touch)) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
        }
    }
}
