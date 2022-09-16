package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: acsa  reason: default package */
/* loaded from: classes2.dex */
final class acsa extends cqtd {
    final /* synthetic */ cqtv a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqss c;
    final /* synthetic */ cqtd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acsa(Object[] objArr, cqtv cqtvVar, cqtv cqtvVar2, cqss cqssVar, cqtd cqtdVar) {
        super(objArr);
        this.a = cqtvVar;
        this.b = cqtvVar2;
        this.c = cqssVar;
        this.d = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.a.e(context));
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(this.b.e(context), this.c.b(context), 30.0f, 20.0f);
        return new LayerDrawable(new Drawable[]{((gdh) this.d).b(context), gradientDrawable});
    }
}
