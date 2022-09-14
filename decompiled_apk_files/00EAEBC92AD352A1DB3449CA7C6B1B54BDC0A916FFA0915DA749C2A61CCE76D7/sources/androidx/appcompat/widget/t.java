package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
/* loaded from: classes.dex */
public class t extends RatingBar {

    /* renamed from: b  reason: collision with root package name */
    private final r f1380b;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.ratingBarStyle);
    }

    public t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1380b = new r(this);
        this.f1380b.a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a2 = this.f1380b.a();
        if (a2 != null) {
            setMeasuredDimension(View.resolveSizeAndState(a2.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
