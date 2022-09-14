package com.android.datetimepicker.date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextViewWithCircularIndicator extends TextView {
    Paint a;
    private final int b;

    public TextViewWithCircularIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        Resources resources = context.getResources();
        int color = resources.getColor(R.color.date_picker_blue);
        this.b = color;
        resources.getDimensionPixelOffset(R.dimen.month_select_circle_radius);
        context.getResources().getString(R.string.item_is_selected);
        this.a.setFakeBoldText(true);
        this.a.setAntiAlias(true);
        this.a.setColor(color);
        this.a.setTextAlign(Paint.Align.CENTER);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setAlpha(60);
    }

    @Override // android.view.View
    public final CharSequence getContentDescription() {
        return getText();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
