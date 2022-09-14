package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: cquc  reason: default package */
/* loaded from: classes.dex */
final class cquc extends cqug {
    final /* synthetic */ cqss a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cquc(Object[] objArr, cqss cqssVar) {
        super(objArr);
        this.a = cqssVar;
    }

    @Override // defpackage.cqug
    public final void a(Context context, GradientDrawable gradientDrawable) {
        gradientDrawable.setColor(this.a.c(context));
    }
}
