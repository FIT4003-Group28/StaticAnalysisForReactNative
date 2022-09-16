package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ActivityIndicatorFrameLayout extends FrameLayout {
    public final tpm a;
    public boolean b;
    private final ColorDrawable c;

    public ActivityIndicatorFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.b) {
            canvas.save();
            canvas.clipRect(this.a.getBounds());
            this.a.draw(canvas);
            canvas.restore();
            this.c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setState(getDrawableState());
        invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        tpm tpmVar = this.a;
        if (drawable == tpmVar) {
            invalidate(tpmVar.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.jumpToCurrentState();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.b;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        tpm tpmVar = this.a;
        tpmVar.setBounds(0, 0, i, tpmVar.a);
        this.c.setBounds(0, this.a.a, i, i2);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }

    public ActivityIndicatorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityIndicatorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, akkj.a, i, R.style.ActivityIndicatorLinearLayout);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int color = obtainStyledAttributes.getColor(0, 0);
        float f = obtainStyledAttributes.getFloat(2, 0.0f);
        int color2 = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        tpm tpmVar = new tpm(dimensionPixelSize, color, f);
        this.a = tpmVar;
        tpmVar.setCallback(this);
        tpmVar.setState(getDrawableState());
        this.c = new ColorDrawable(color2);
    }
}
