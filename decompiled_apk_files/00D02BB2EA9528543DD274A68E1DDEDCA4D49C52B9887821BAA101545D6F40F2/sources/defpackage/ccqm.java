package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ccqm  reason: default package */
/* loaded from: classes4.dex */
public final class ccqm extends LinearLayout {
    public static final cqkv a = new ccqn();
    public boolean b;
    private int c;

    public ccqm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sj.k);
        this.b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private final boolean b() {
        return getOrientation() == 1;
    }

    public final void a(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(true != z ? 80 : 1);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(true != z ? 4 : 8);
        }
        int childCount = getChildCount();
        for (int i = childCount - 2; i >= 0; i--) {
            bringChildToFront(getChildAt(i));
        }
        if (z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getChildAt(i2).getLayoutParams());
                layoutParams.width = -1;
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                getChildAt(i2).setLayoutParams(layoutParams);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        if (this.b) {
            if (size > this.c && b()) {
                a(false);
            }
            this.c = size;
        }
        if (b() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.b && !b()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (((Button) getChildAt(i4)).getLineCount() > 1) {
                    a(true);
                    break;
                }
            }
        }
        if (!z) {
            return;
        }
        super.onMeasure(i, i2);
    }
}
