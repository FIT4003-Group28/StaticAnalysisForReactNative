package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: nqt  reason: default package */
/* loaded from: classes7.dex */
final class nqt extends cqtd {
    final /* synthetic */ cqrp a;
    final /* synthetic */ int b;
    final /* synthetic */ cqrp c;
    final /* synthetic */ cqtd d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqt(Object[] objArr, cqrp cqrpVar, int i, cqrp cqrpVar2, cqtd cqtdVar, int i2) {
        super(objArr);
        this.a = cqrpVar;
        this.b = i;
        this.c = cqrpVar2;
        this.d = cqtdVar;
        this.e = i2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(this.a.e(context), this.b);
        gradientDrawable.setCornerRadius(Math.max(0.0f, this.c.a(context) - 2.5f));
        ArrayList arrayList = new ArrayList();
        cqtd cqtdVar = this.d;
        if (cqtdVar != null) {
            arrayList.add(cqtdVar.a(context));
        }
        int[] iArr = {this.e, 0, 0};
        float[] fArr = new float[8];
        Arrays.fill(fArr, this.c.a(context));
        arrayList.add(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16843623}, new int[]{16842908}}, iArr), null, new ShapeDrawable(new RoundRectShape(fArr, null, null))));
        arrayList.add(gradientDrawable);
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
    }
}
