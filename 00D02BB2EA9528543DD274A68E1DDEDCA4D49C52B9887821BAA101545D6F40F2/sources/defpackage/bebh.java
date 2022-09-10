package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: bebh  reason: default package */
/* loaded from: classes3.dex */
final class bebh extends cqtd {
    final /* synthetic */ cqtd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bebh(Object[] objArr, cqtd cqtdVar) {
        super(objArr);
        this.a = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        LayerDrawable layerDrawable = (LayerDrawable) cqtt.d(cqtt.o(cquy.a(), ibm.x(), ivd.a), cqrt.i(this.a, ibm.b())).a(context);
        int NR = ivd.b.NR(context);
        layerDrawable.setLayerInset(1, NR, NR, NR, NR);
        return layerDrawable;
    }
}
