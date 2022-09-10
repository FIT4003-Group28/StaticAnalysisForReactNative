package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cos  reason: default package */
/* loaded from: classes5.dex */
public final class cos extends abp {
    protected final Paint a = new Paint();
    protected final int b;
    protected final Context c;

    public cos(Context context) {
        this.c = context;
        a();
        this.b = context.getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_divider_height);
    }

    private final TextView d(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TextView d = d(viewGroup.getChildAt(i));
                if (d != null) {
                    return d;
                }
            }
        }
        return null;
    }

    public final void a() {
        this.a.setColor(this.c.getResources().getColor(R.color.gearhead_sdk_list_divider));
    }

    @Override // defpackage.abp
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        int i;
        View childAt = recyclerView.getChildAt(0);
        if (childAt == null) {
            i = 0;
        } else {
            View d = d(childAt);
            if (d == null) {
                d = childAt;
            }
            i = 0;
            while (d != null && d != childAt) {
                i += d.getLeft();
                d = (View) d.getParent();
            }
        }
        float f = i;
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        canvas.drawRect(f, 0.0f, width, this.b, this.a);
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = recyclerView.getChildAt(i2);
            int bottom = childAt2.getBottom() - ((abt) childAt2.getLayoutParams()).bottomMargin;
            int i3 = bottom - this.b;
            if (i3 > 0) {
                canvas.drawRect(f, i3, width, bottom, this.a);
            }
        }
    }
}
