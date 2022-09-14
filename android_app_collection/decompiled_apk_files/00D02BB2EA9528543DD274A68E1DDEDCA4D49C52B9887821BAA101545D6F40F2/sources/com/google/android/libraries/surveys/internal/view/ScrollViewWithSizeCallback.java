package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ScrollViewWithSizeCallback extends ScrollView {
    private czrp a;

    public ScrollViewWithSizeCallback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        czrp czrpVar = this.a;
        if (czrpVar == null || i4 == i2) {
            return;
        }
        czrpVar.a(i2);
    }

    public void setOnHeightChangedListener(czrp czrpVar) {
        this.a = czrpVar;
    }
}
