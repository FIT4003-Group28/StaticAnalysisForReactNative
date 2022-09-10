package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: apeg  reason: default package */
/* loaded from: classes2.dex */
final class apeg extends cqtd {
    final /* synthetic */ cqtd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apeg(Object[] objArr, cqtd cqtdVar) {
        super(objArr);
        this.a = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        LayerDrawable layerDrawable = (LayerDrawable) cqtt.d(cqtt.n(cquy.a(), ibm.x(), ivd.a), this.a).a(context);
        int NR = cqrp.d(8.0d).NR(context);
        layerDrawable.setLayerInset(1, NR, NR, NR, NR);
        return layerDrawable;
    }
}
