package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
/* compiled from: PG */
/* renamed from: cqti  reason: default package */
/* loaded from: classes.dex */
final class cqti extends cqtd {
    final /* synthetic */ cquv a;
    final /* synthetic */ cqss b;
    final /* synthetic */ Paint.Style c;
    final /* synthetic */ cqtv d;
    final /* synthetic */ Integer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqti(Object[] objArr, cquv cquvVar, cqss cqssVar, Paint.Style style, cqtv cqtvVar, Integer num) {
        super(objArr);
        this.a = cquvVar;
        this.b = cqssVar;
        this.c = style;
        this.d = cqtvVar;
        this.e = num;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(this.a.a(context));
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.b.b(context));
        paint.setStyle(this.c);
        cqtv cqtvVar = this.d;
        if (cqtvVar != null) {
            paint.setStrokeWidth(cqtvVar.a(context));
        }
        Integer num = this.e;
        if (num != null) {
            paint.setAlpha(num.intValue());
        }
        return shapeDrawable;
    }
}
