package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsZoomSlider extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {
    public static final /* synthetic */ int h = 0;
    boolean a;
    boolean b;
    public float c;
    Handler d;
    final Runnable e;
    public gyq f;
    public gxd g;

    public ShortsZoomSlider(Context context) {
        super(context);
        this.a = false;
        this.b = false;
        this.c = -1.0f;
        this.e = new gyj(this);
        f();
    }

    private final void f() {
        this.d = new Handler();
        setProgressDrawable(getContext().getDrawable(R.drawable.zoom_slider_seek_bar));
        setThumb(getContext().getDrawable(R.drawable.zoom_slider_seek_bar_thumb));
        setMax(1000);
        setVisibility(4);
        setOnSeekBarChangeListener(this);
    }

    public final void a(float f) {
        if (this.b || this.c == f || f == getAlpha()) {
            return;
        }
        this.c = f;
        animate().cancel();
        if (f > 0.0f && getVisibility() != 0) {
            setAlpha(0.0f);
            setVisibility(0);
            gyq gyqVar = this.f;
            if (gyqVar != null) {
                gyqVar.a(actj.SHORTS_CREATION_ZOOM_ACCESSIBILITY_SLIDER).e();
            }
        }
        animate().alpha(f).setDuration(100L).withEndAction(new gyj(this, 1)).start();
    }

    public final void b() {
        animate().cancel();
        this.a = false;
        this.d.removeCallbacks(this.e);
        this.c = -1.0f;
        if (!this.b) {
            if (this.f != null && getVisibility() == 0 && getAlpha() != 0.0f) {
                this.f.a(actj.SHORTS_CREATION_ZOOM_ACCESSIBILITY_SLIDER).d();
            }
            setVisibility(4);
        }
    }

    public final void c(boolean z) {
        this.b = z;
        b();
        if (z) {
            if (this.f != null && gyq.e(this, true)) {
                this.f.a(actj.SHORTS_CREATION_ZOOM_ACCESSIBILITY_SLIDER).e();
            }
            setVisibility(0);
        }
    }

    public final void d(boolean z) {
        e(z, 2000);
    }

    public final void e(boolean z, int i) {
        this.a = z;
        if (this.b || getVisibility() != 0) {
            return;
        }
        a(true != this.a ? 1.0f : 0.3f);
        this.d.removeCallbacks(this.e);
        if (this.a) {
            return;
        }
        if (i <= 0) {
            this.d.post(this.e);
        } else {
            this.d.postDelayed(this.e, i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            gxd gxdVar = this.g;
            if (gxdVar != null) {
                gxdVar.a.aA.p(i / 1000.0f);
            }
            gyq gyqVar = this.f;
            if (gyqVar != null) {
                gyqVar.a(actj.SHORTS_CREATION_ZOOM_ACCESSIBILITY_SLIDER).f();
            }
            if (this.b || this.a) {
                return;
            }
            this.d.removeCallbacks(this.e);
            animate().cancel();
            setAlpha(1.0f);
            this.d.postDelayed(this.e, 2000L);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public ShortsZoomSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.b = false;
        this.c = -1.0f;
        this.e = new gyj(this);
        f();
    }

    public ShortsZoomSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        this.b = false;
        this.c = -1.0f;
        this.e = new gyj(this);
        f();
    }
}
