package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
/* compiled from: PG */
/* renamed from: irj  reason: default package */
/* loaded from: classes.dex */
final class irj extends cqtd {
    final /* synthetic */ cqss a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqtd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irj(Object[] objArr, cqss cqssVar, cqtv cqtvVar, cqtd cqtdVar) {
        super(objArr);
        this.a = cqssVar;
        this.b = cqtvVar;
        this.c = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        cqss cqssVar = this.a;
        cqtv cqtvVar = this.b;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        irm.h(context, shapeDrawable.getPaint(), cqssVar, cqtvVar);
        return new LayerDrawable(new Drawable[]{new irl(shapeDrawable, cqrp.d(4.0d).NR(context)), ((gdh) this.c).b(context)});
    }
}
