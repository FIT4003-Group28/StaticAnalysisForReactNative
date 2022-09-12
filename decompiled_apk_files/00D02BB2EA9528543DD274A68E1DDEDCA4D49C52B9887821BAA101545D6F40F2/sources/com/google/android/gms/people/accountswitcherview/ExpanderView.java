package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ExpanderView extends ImageButton {
    private static final int[] a = {16842920};
    private boolean b;
    private String c;
    private String d;

    public ExpanderView(Context context) {
        this(context, null);
    }

    private final void a(Context context) {
        Resources resources = context.getResources();
        this.c = resources.getString(R.string.show_account_list);
        this.d = resources.getString(R.string.hide_account_list);
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b) {
            mergeDrawableStates(onCreateDrawableState, a);
        }
        return onCreateDrawableState;
    }

    public ExpanderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public void setExpanded(boolean z) {
        this.b = z;
        setContentDescription(z ? this.d : this.c);
        refreshDrawableState();
    }

    public ExpanderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
