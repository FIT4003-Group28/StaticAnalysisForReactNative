package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
/* compiled from: PG */
/* renamed from: bcgv  reason: default package */
/* loaded from: classes3.dex */
final class bcgv extends cqtd {
    final /* synthetic */ cqss a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqtd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcgv(Object[] objArr, cqss cqssVar, cqtv cqtvVar, cqtd cqtdVar) {
        super(objArr);
        this.a = cqssVar;
        this.b = cqtvVar;
        this.c = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setColor(this.a.b(context));
        shapeDrawable.getPaint().setStrokeWidth(this.b.e(context));
        return new LayerDrawable(new Drawable[]{((gdh) this.c).b(context), shapeDrawable});
    }
}
