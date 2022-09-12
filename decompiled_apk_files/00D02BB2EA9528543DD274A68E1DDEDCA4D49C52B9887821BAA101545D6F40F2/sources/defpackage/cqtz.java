package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: cqtz  reason: default package */
/* loaded from: classes5.dex */
final class cqtz extends cqug {
    final /* synthetic */ cqtv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqtz(Object[] objArr, cqtv cqtvVar) {
        super(objArr);
        this.a = cqtvVar;
    }

    @Override // defpackage.cqug
    public final void a(Context context, GradientDrawable gradientDrawable) {
        gradientDrawable.setGradientRadius(this.a.a(context));
    }
}
