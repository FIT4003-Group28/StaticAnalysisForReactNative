package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: bage  reason: default package */
/* loaded from: classes3.dex */
final class bage extends cqtd {
    final /* synthetic */ cqtd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bage(Object[] objArr, cqtd cqtdVar) {
        super(objArr);
        this.a = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        LayerDrawable layerDrawable = (LayerDrawable) cqtt.d(cqtt.n(cquy.a(), ibm.j(), cqrp.d(1.0d)), this.a).a(context);
        int NR = cqrp.d(11.0d).NR(context);
        layerDrawable.setLayerInset(1, NR, NR, NR, NR);
        return layerDrawable;
    }
}
