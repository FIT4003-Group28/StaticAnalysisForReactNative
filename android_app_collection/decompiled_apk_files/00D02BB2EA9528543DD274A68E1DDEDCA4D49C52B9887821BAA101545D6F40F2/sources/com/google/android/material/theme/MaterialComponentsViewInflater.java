package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatTextView a(Context context, AttributeSet attributeSet) {
        return new dahz(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final xd b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final xe c(Context context, AttributeSet attributeSet) {
        return new czwp(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final xq d(Context context, AttributeSet attributeSet) {
        return new dacv(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final xb e(Context context, AttributeSet attributeSet) {
        return new dahj(context, attributeSet);
    }
}
