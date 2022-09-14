package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
public class u extends SeekBar {

    /* renamed from: b  reason: collision with root package name */
    private final v f1381b;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.seekBarStyle);
    }

    public u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1381b = new v(this);
        this.f1381b.a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1381b.b();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1381b.c();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1381b.a(canvas);
    }
}
