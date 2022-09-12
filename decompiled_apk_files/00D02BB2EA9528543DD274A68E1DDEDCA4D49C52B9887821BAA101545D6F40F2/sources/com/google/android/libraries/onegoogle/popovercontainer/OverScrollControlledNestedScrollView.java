package com.google.android.libraries.onegoogle.popovercontainer;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class OverScrollControlledNestedScrollView extends NestedScrollView {
    public boolean a;

    public OverScrollControlledNestedScrollView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (this.a) {
            super.onOverScrolled(i, i2, z, z2);
        }
    }

    public OverScrollControlledNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverScrollControlledNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
