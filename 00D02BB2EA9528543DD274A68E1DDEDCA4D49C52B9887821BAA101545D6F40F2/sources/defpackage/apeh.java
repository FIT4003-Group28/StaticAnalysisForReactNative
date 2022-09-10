package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: apeh  reason: default package */
/* loaded from: classes2.dex */
final class apeh extends cqtd {
    final /* synthetic */ cqss a;
    final /* synthetic */ cqtd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apeh(Object[] objArr, cqss cqssVar, cqtd cqtdVar) {
        super(objArr);
        this.a = cqssVar;
        this.b = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        LayerDrawable layerDrawable = (LayerDrawable) cqtt.d(cqtt.n(cquy.a(), this.a, ivd.a), cqtt.u(cquy.a(), this.a), this.b).a(context);
        int NR = cqrp.d(8.0d).NR(context);
        layerDrawable.setLayerInset(2, NR, NR, NR, NR);
        return layerDrawable;
    }
}
