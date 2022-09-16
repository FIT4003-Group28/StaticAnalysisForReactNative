package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final tx a(Context context, AttributeSet attributeSet) {
        return new alqc(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final tz c(Context context, AttributeSet attributeSet) {
        return new alju(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final uj d(Context context, AttributeSet attributeSet) {
        return new almh(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new alqr(context, attributeSet);
    }
}
