package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xs  reason: default package */
/* loaded from: classes.dex */
public class xs extends SeekBar {
    private final xt a;

    public xs(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        xt xtVar = this.a;
        Drawable drawable = xtVar.c;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(xtVar.b.getDrawableState())) {
            return;
        }
        xtVar.b.invalidateDrawable(drawable);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        xt xtVar = this.a;
        if (xtVar.c != null) {
            int max = xtVar.b.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = xtVar.c.getIntrinsicWidth();
                int intrinsicHeight = xtVar.c.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight >> 1;
                }
                xtVar.c.setBounds(-i2, -i, i2, i);
                float width = ((xtVar.b.getWidth() - xtVar.b.getPaddingLeft()) - xtVar.b.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(xtVar.b.getPaddingLeft(), xtVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    xtVar.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public xs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public xs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ael.d(this, getContext());
        xt xtVar = new xt(this);
        this.a = xtVar;
        xtVar.a(attributeSet, i);
    }
}
