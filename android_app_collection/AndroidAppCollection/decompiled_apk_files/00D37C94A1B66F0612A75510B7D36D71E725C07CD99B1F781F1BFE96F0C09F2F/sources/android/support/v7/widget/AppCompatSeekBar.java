package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {
    private final um a;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        um umVar = this.a;
        Drawable drawable = umVar.c;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(umVar.b.getDrawableState())) {
            return;
        }
        umVar.b.invalidateDrawable(drawable);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        um umVar = this.a;
        if (umVar.c != null) {
            int max = umVar.b.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = umVar.c.getIntrinsicWidth();
                int intrinsicHeight = umVar.c.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight >> 1;
                }
                umVar.c.setBounds(-i2, -i, i2, i);
                float width = ((umVar.b.getWidth() - umVar.b.getPaddingLeft()) - umVar.b.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(umVar.b.getPaddingLeft(), umVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    umVar.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zy.d(this, getContext());
        um umVar = new um(this);
        this.a = umVar;
        umVar.a(attributeSet, i);
    }
}
