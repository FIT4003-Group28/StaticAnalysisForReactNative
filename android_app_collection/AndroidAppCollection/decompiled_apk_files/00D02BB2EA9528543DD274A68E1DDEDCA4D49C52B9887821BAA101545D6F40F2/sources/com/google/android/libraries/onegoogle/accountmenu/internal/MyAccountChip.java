package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MyAccountChip<T> extends Chip {
    public dtgh a;
    public cvze<T> b;
    private cwje h;

    public MyAccountChip(Context context) {
        super(context, null);
        this.a = dtgh.UNKNOWN_COMPONENT;
        a(null);
    }

    private final void a(AttributeSet attributeSet) {
        Resources resources = getResources();
        this.h = new cwje(dcdc.h(resources.getString(R.string.og_my_account_desc_long_length), resources.getString(R.string.og_my_account_desc_meduim_length), resources.getString(R.string.og_my_account_desc_short_length)));
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cwge.a, R.attr.ogAccountMenuStyle, 2132017728);
        try {
            setTextColor(cwja.a(context, obtainStyledAttributes, 3));
            setChipBackgroundColor(cwja.a(context, obtainStyledAttributes, 0));
            setRippleColor(cwja.a(context, obtainStyledAttributes, 1));
            setChipStrokeColor(cwja.a(context, obtainStyledAttributes, 2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setOverrideLoggingComponent(dtgh dtghVar) {
        this.a = dtghVar;
    }

    public void setTextForParentWidth(int i) {
        this.h.a(this, i);
    }

    public MyAccountChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = dtgh.UNKNOWN_COMPONENT;
        a(attributeSet);
    }

    public MyAccountChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = dtgh.UNKNOWN_COMPONENT;
        a(attributeSet);
    }
}
