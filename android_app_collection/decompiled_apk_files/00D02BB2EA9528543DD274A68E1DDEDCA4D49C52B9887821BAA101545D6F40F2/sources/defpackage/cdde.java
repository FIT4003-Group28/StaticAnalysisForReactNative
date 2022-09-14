package defpackage;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: cdde  reason: default package */
/* loaded from: classes4.dex */
final class cdde extends cqtd {
    public cdde(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{cddf.a.a(context), new ClipDrawable(cddf.b.a(context), 80, 2)});
        layerDrawable.setLevel(5000);
        return layerDrawable;
    }
}
