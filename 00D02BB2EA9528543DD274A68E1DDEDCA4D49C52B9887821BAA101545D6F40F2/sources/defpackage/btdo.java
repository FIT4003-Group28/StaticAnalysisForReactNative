package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
/* compiled from: PG */
/* renamed from: btdo  reason: default package */
/* loaded from: classes4.dex */
final class btdo extends cqtd {
    final /* synthetic */ cqss a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqtd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btdo(Object[] objArr, cqss cqssVar, cqtv cqtvVar, cqtd cqtdVar) {
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
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(cqssVar.b(context));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(cqsg.f(btdr.a, Float.valueOf(2.0f)).a(context));
        paint.setShadowLayer(cqtvVar.e(context), 0.0f, 0.0f, paint.getColor());
        return new LayerDrawable(new Drawable[]{new btdq(shapeDrawable, cqrp.d(4.0d).NR(context)), ((gdh) this.c).b(context)});
    }
}
