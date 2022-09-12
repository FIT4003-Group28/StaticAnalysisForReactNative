package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xr  reason: default package */
/* loaded from: classes.dex */
public final class xr extends RatingBar {
    private final xp a;

    public xr(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.a.a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public xr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public xr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ael.d(this, getContext());
        xp xpVar = new xp(this);
        this.a = xpVar;
        xpVar.a(attributeSet, i);
    }
}
