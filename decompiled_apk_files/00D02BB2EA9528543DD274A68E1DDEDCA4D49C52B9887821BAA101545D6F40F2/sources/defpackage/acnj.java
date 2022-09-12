package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acnj  reason: default package */
/* loaded from: classes2.dex */
public final class acnj extends View {
    public int a;
    public int b;
    private final int c;
    private final int d;
    private final Paint e;
    private final float f;
    private final float g;

    public acnj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.FILL);
        float f = getContext().getResources().getDisplayMetrics().density * 5.0f;
        this.f = f;
        this.g = f;
        this.c = getResources().getColor(R.color.qu_daynight_grey_500);
        this.d = getResources().getColor(R.color.qu_daynight_grey_300);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        if (this.a < 2) {
            return;
        }
        float measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        float max = Math.max(Math.min(this.g, (measuredWidth - (this.f * this.a)) / (i - 1)), 0.0f);
        float f = this.f;
        float f2 = (measuredWidth - ((f + max) * (this.a - 1))) / 2.0f;
        float f3 = f / 2.0f;
        int i2 = 0;
        while (i2 < this.a) {
            this.e.setColor(i2 == this.b ? this.c : this.d);
            canvas.drawCircle(f2, f3, this.f / 2.0f, this.e);
            f2 += this.f + max;
            i2++;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        viewPager.c().n(new acnh(this, viewPager));
        viewPager.h(new acni(this));
    }
}
