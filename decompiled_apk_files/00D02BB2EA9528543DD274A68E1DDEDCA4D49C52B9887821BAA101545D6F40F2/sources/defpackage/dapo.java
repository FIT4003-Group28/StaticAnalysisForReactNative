package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import com.google.android.setupcompat.internal.TemplateLayout;
/* compiled from: PG */
/* renamed from: dapo  reason: default package */
/* loaded from: classes5.dex */
public final class dapo implements daoz {
    public final TemplateLayout a;
    private final int b;
    private final ImageView.ScaleType c;

    public dapo(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        ImageView a;
        ImageView a2;
        this.a = templateLayout;
        Context context = templateLayout.getContext();
        ImageView a3 = a();
        if (a3 != null) {
            this.b = a3.getLayoutParams().height;
            this.c = a3.getScaleType();
        } else {
            this.b = 0;
            this.c = null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dapf.h, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0 && (a2 = a()) != null) {
            a2.setImageResource(resourceId);
            a2.setVisibility(resourceId != 0 ? 0 : 8);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        ImageView a4 = a();
        if (a4 != null) {
            ViewGroup.LayoutParams layoutParams = a4.getLayoutParams();
            layoutParams.height = !z ? this.b : a4.getMaxHeight();
            a4.setLayoutParams(layoutParams);
            a4.setScaleType(z ? ImageView.ScaleType.FIT_CENTER : this.c);
        }
        int color = obtainStyledAttributes.getColor(1, 0);
        if (color != 0 && (a = a()) != null) {
            a.setColorFilter(color);
        }
        obtainStyledAttributes.recycle();
    }

    public final ImageView a() {
        return (ImageView) this.a.findViewById(R.id.sud_layout_icon);
    }
}
