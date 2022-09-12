package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.setupcompat.internal.TemplateLayout;
/* compiled from: PG */
/* renamed from: dapn  reason: default package */
/* loaded from: classes5.dex */
public final class dapn implements daoz {
    public final TemplateLayout a;

    public dapn(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, dapf.a, i, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        if (text != null) {
            b(text);
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            c(colorStateList);
        }
        obtainStyledAttributes.recycle();
    }

    public final TextView a() {
        return (TextView) this.a.findViewById(R.id.suc_layout_title);
    }

    public final void b(CharSequence charSequence) {
        TextView a = a();
        if (a != null) {
            a.setText(charSequence);
        }
    }

    public final void c(ColorStateList colorStateList) {
        TextView a = a();
        if (a != null) {
            a.setTextColor(colorStateList);
        }
    }
}
