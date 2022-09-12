package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AlertController$RecycleListView extends ListView {
    private final int a;
    private final int b;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public void setHasDecor(boolean z, boolean z2) {
        int i;
        int i2;
        if (z2) {
            if (z) {
                return;
            }
            z = false;
        }
        int paddingLeft = getPaddingLeft();
        if (z) {
            i = getPaddingTop();
        } else {
            i = this.a;
        }
        int paddingRight = getPaddingRight();
        if (z2) {
            i2 = getPaddingBottom();
        } else {
            i2 = this.b;
        }
        setPadding(paddingLeft, i, paddingRight, i2);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sj.s);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
