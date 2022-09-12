package com.google.android.libraries.messaging.lighter.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.common.LoadingView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LoadingView extends LinearLayout {
    public long a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final Runnable e;
    private final Runnable f;

    public LoadingView(Context context) {
        this(context, null);
    }

    public final void a() {
        this.a = -1L;
        this.d = false;
        removeCallbacks(this.e);
        if (!this.c) {
            this.c = true;
            postDelayed(this.f, 500L);
        }
    }

    public final void b() {
        this.d = true;
        removeCallbacks(this.f);
        cstd.a();
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.a;
        long j2 = currentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            this.e.run();
        } else if (this.b) {
        } else {
            postDelayed(this.e, 500 - j2);
            this.b = true;
        }
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1L;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = new Runnable(this) { // from class: cuvz
            private final LoadingView a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LoadingView loadingView = this.a;
                loadingView.b = false;
                loadingView.a = -1L;
                loadingView.setVisibility(8);
            }
        };
        this.f = new Runnable(this) { // from class: cuwa
            private final LoadingView a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LoadingView loadingView = this.a;
                loadingView.c = false;
                if (!loadingView.d) {
                    cstd.a();
                    loadingView.a = System.currentTimeMillis();
                    loadingView.setVisibility(0);
                }
            }
        };
        inflate(context, R.layout.loading_view, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cuwc.a);
        String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        TextView textView = (TextView) findViewById(R.id.loading_text);
        if (string == null || string.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(string);
            textView.setVisibility(0);
        }
        od.F(this, getResources().getDimensionPixelSize(R.dimen.loading_view_elevation));
        setOutlineProvider(new cuwb(getResources().getDimension(R.dimen.loading_view_background_radius)));
        setClipToOutline(false);
    }
}
