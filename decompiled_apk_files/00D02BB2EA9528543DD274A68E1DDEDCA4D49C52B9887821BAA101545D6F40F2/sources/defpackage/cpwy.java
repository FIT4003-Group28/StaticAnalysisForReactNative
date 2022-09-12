package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cpwy  reason: default package */
/* loaded from: classes5.dex */
public final class cpwy extends FrameLayout {
    private ImageView a;

    public cpwy(Context context) {
        super(context);
        a(context, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int i = -1;
        int i2 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, cpxb.a, 0, 0);
            int integer = obtainStyledAttributes.getInteger(1, 0);
            i = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            i2 = integer;
        }
        this.a = new ImageView(getContext());
        setIconType(i2);
        setIconSize(i);
        addView(this.a);
    }

    public void setIconSize(int i) {
        this.a.setLayoutParams(new FrameLayout.LayoutParams(i, i, 17));
    }

    public void setIconType(int i) {
        this.a.setImageResource(i != 1 ? R.drawable.ic_mic : 2131232059);
    }

    public cpwy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public cpwy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
