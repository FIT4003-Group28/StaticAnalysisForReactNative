package com.google.android.apps.gmm.base.components.edittext;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: PG */
/* loaded from: classes.dex */
public class IncognitoAwareEditText extends xj {
    private final akfa a;

    public IncognitoAwareEditText(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView
    public void setImeOptions(int i) {
        super.setImeOptions(isv.a(this.a, i));
    }

    public IncognitoAwareEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = ((akfb) btsr.a(akfb.class)).rK();
        setImeOptions(getImeOptions());
    }

    public IncognitoAwareEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = ((akfb) btsr.a(akfb.class)).rK();
        setImeOptions(getImeOptions());
    }
}
