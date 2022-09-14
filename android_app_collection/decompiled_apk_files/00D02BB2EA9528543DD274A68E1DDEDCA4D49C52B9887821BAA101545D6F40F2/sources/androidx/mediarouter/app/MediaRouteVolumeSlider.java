package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
class MediaRouteVolumeSlider extends xs {
    private final float a;
    private boolean b;
    private Drawable c;
    private int d;
    private int e;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xs, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.a * 255.0f);
        this.c.setColorFilter(this.d, PorterDuff.Mode.SRC_IN);
        this.c.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.e, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.d, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    public void setColor(int i) {
        setColor(i, i);
    }

    public void setHideThumb(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        super.setThumb(z ? null : this.c);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.c = drawable;
        if (this.b) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public void setColor(int i, int i2) {
        if (this.d != i) {
            if (Color.alpha(i) != 255) {
                String str = "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i);
            }
            this.d = i;
        }
        if (this.e != i2) {
            if (Color.alpha(i2) != 255) {
                String str2 = "Volume slider background color cannot be translucent: #" + Integer.toHexString(i2);
            }
            this.e = i2;
        }
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        this.a = context.getTheme().resolveAttribute(16842803, typedValue, true) ? typedValue.getFloat() : 0.5f;
    }
}
