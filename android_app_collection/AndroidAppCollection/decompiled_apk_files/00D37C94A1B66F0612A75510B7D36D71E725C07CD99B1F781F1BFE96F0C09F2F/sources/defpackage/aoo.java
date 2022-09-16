package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* compiled from: PG */
/* renamed from: aoo  reason: default package */
/* loaded from: classes.dex */
final class aoo implements TransformationMethod {
    private final TransformationMethod a;

    public aoo(TransformationMethod transformationMethod) {
        this.a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        CharSequence transformation = this.a.getTransformation(charSequence, view);
        return (transformation == null || anp.b().a() != 1) ? transformation : anp.b().c(transformation);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        this.a.onFocusChanged(view, charSequence, z, i, rect);
    }
}
