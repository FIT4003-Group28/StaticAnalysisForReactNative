package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* renamed from: cvvj  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cvvj {
    public static void a(LayerDrawable layerDrawable, int i, int i2) {
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(i2);
        if (findDrawableByLayerId != null) {
            layerDrawable.setDrawableByLayerId(i2, cwiz.b(findDrawableByLayerId, i));
        }
    }
}
