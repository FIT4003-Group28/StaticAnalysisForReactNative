package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: itc  reason: default package */
/* loaded from: classes6.dex */
final class itc extends cqtd {
    final /* synthetic */ cqss a;
    final /* synthetic */ cqtd b;
    final /* synthetic */ cqtv c;
    final /* synthetic */ cqtv d;
    final /* synthetic */ cqtv e;
    final /* synthetic */ cqtv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itc(Object[] objArr, cqss cqssVar, cqtd cqtdVar, cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqtv cqtvVar4) {
        super(objArr);
        this.a = cqssVar;
        this.b = cqtdVar;
        this.c = cqtvVar;
        this.d = cqtvVar2;
        this.e = cqtvVar3;
        this.f = cqtvVar4;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.a.a(context), this.b.a(context)});
        layerDrawable.setLayerInset(1, this.c.e(context), this.d.e(context), this.e.e(context), this.f.e(context));
        return layerDrawable;
    }
}
