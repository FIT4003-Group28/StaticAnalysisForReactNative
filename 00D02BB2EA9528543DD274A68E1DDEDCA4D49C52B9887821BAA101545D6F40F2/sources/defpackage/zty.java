package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zty  reason: default package */
/* loaded from: classes7.dex */
public final class zty extends zsy {
    protected final float l;
    private int m;

    public zty(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = this.f.getDimensionPixelSize(R.dimen.directions_transitdetail_intermediatestop_radius);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int color;
        float paddingTop = this.l + getPaddingTop();
        h(canvas, 0.0f, getHeight(), this.m);
        if (bvoa.a(this.m)) {
            color = getResources().getColor(R.color.qu_white_alpha_54);
        } else {
            color = getResources().getColor(R.color.light_line_station_color);
        }
        o(canvas, paddingTop, this.l, color);
    }

    public void setLineColor(@dzsi Integer num) {
        this.m = num == null ? 0 : num.intValue();
        invalidate();
    }
}
