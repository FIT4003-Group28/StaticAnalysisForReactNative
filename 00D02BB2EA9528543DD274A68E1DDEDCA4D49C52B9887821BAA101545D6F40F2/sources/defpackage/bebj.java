package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bebj  reason: default package */
/* loaded from: classes3.dex */
public final class bebj extends cqtd {
    final /* synthetic */ cqss a;
    final /* synthetic */ cqtd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bebj(Object[] objArr, cqss cqssVar, cqtd cqtdVar) {
        super(objArr);
        this.a = cqssVar;
        this.b = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        LayerDrawable layerDrawable = (LayerDrawable) cqtt.d(cqtt.n(cquy.a(), this.a, ivd.a), cqtt.u(cquy.a(), this.a), this.b).a(context);
        int NR = ivd.b.NR(context);
        layerDrawable.setLayerInset(2, NR, NR, NR, NR);
        return layerDrawable;
    }
}
