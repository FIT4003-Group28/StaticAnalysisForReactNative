package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: acln  reason: default package */
/* loaded from: classes.dex */
final class acln extends cqtd {
    final /* synthetic */ cqss a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqtv c;
    final /* synthetic */ cqss d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acln(Object[] objArr, cqss cqssVar, cqtv cqtvVar, cqtv cqtvVar2, cqss cqssVar2) {
        super(objArr);
        this.a = cqssVar;
        this.b = cqtvVar;
        this.c = cqtvVar2;
        this.d = cqssVar2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        int b = this.a.b(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.b.e(context));
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(b);
        gradientDrawable.setStroke(this.c.e(context), this.d.b(context));
        return gradientDrawable;
    }
}
