package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: aclo  reason: default package */
/* loaded from: classes2.dex */
final class aclo extends cqtd {
    final /* synthetic */ cqss a;
    final /* synthetic */ cqtv[] b;
    final /* synthetic */ cqtv c;
    final /* synthetic */ cqss d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aclo(Object[] objArr, cqss cqssVar, cqtv[] cqtvVarArr, cqtv cqtvVar, cqss cqssVar2) {
        super(objArr);
        this.a = cqssVar;
        this.b = cqtvVarArr;
        this.c = cqtvVar;
        this.d = cqssVar2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        int b = this.a.b(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{this.b[0].e(context), this.b[0].e(context), this.b[1].e(context), this.b[1].e(context), this.b[2].e(context), this.b[2].e(context), this.b[3].e(context), this.b[3].e(context)});
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(b);
        gradientDrawable.setStroke(this.c.e(context), this.d.b(context));
        return gradientDrawable;
    }
}
