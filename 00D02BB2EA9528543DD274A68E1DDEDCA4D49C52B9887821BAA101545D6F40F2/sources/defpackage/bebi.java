package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bebi  reason: default package */
/* loaded from: classes3.dex */
public final class bebi extends cqtd {
    final /* synthetic */ cqtd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bebi(Object[] objArr, cqtd cqtdVar) {
        super(objArr);
        this.a = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        LayerDrawable layerDrawable = (LayerDrawable) cqtt.d(cqtt.n(cquy.a(), ibm.x(), ivd.a), this.a).a(context);
        int NR = ivd.b.NR(context);
        layerDrawable.setLayerInset(1, NR, NR, NR, NR);
        return layerDrawable;
    }
}
