package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: irk  reason: default package */
/* loaded from: classes6.dex */
final class irk extends cqtd {
    final /* synthetic */ cqss a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqtv c;
    final /* synthetic */ cqtd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irk(Object[] objArr, cqss cqssVar, cqtv cqtvVar, cqtv cqtvVar2, cqtd cqtdVar) {
        super(objArr);
        this.a = cqssVar;
        this.b = cqtvVar;
        this.c = cqtvVar2;
        this.d = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        cqss cqssVar = this.a;
        cqtv cqtvVar = this.b;
        cqtv cqtvVar2 = this.c;
        cqtd cqtdVar = irm.a;
        float[] fArr = new float[8];
        Arrays.fill(fArr, cqtvVar.a(context));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        irm.h(context, shapeDrawable.getPaint(), cqssVar, cqtvVar2);
        return new LayerDrawable(new Drawable[]{shapeDrawable, this.d.a(context)});
    }
}
