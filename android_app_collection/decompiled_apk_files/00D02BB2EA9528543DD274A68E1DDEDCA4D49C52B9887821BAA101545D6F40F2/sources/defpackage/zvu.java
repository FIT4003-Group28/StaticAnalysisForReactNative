package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zvu  reason: default package */
/* loaded from: classes7.dex */
public final class zvu extends jgi {
    @dzsi
    private View a;
    @dzsi
    private View b;
    @dzsi
    private View c;

    public zvu(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jgi, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.a == null) {
            this.a = findViewById(R.id.taxi_trip_icon);
        }
        if (this.b == null) {
            this.b = findViewById(R.id.taxi_trip_no_icon);
        }
        if (this.c == null) {
            this.c = findViewById(R.id.taxi_trip_selection_tick);
        }
        View view = this.a;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.b;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.c;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
        int measuredHeight = getMeasuredHeight();
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < measuredHeight) {
            if (this.a == null) {
                this.a = findViewById(R.id.taxi_trip_icon);
            }
            if (this.b == null) {
                this.b = findViewById(R.id.taxi_trip_no_icon);
            }
            if (this.c == null) {
                this.c = findViewById(R.id.taxi_trip_selection_tick);
            }
            View view4 = this.a;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            View view5 = this.b;
            if (view5 != null) {
                view5.setVisibility(0);
            }
            View view6 = this.c;
            if (view6 != null) {
                view6.setVisibility(0);
            }
            super.onMeasure(i, i2);
        }
    }

    public zvu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public zvu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
