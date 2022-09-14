package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    public boolean a;
    private final Runnable b;
    private final Runnable c;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    private final void a() {
        removeCallbacks(this.b);
        removeCallbacks(this.c);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = false;
        this.b = new pw(this);
        this.c = new px(this);
    }
}
