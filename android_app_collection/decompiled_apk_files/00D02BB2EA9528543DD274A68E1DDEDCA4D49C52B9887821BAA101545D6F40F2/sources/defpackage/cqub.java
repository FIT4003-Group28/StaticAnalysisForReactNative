package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: cqub  reason: default package */
/* loaded from: classes5.dex */
final class cqub extends cqug {
    final /* synthetic */ cqtv a;
    final /* synthetic */ cqss b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqub(Object[] objArr, cqtv cqtvVar, cqss cqssVar) {
        super(objArr);
        this.a = cqtvVar;
        this.b = cqssVar;
    }

    @Override // defpackage.cqug
    public final void a(Context context, GradientDrawable gradientDrawable) {
        gradientDrawable.setStroke(this.a.e(context), this.b.c(context));
    }
}
