package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
/* compiled from: PG */
/* renamed from: xaj  reason: default package */
/* loaded from: classes7.dex */
final class xaj extends cqtd {
    final /* synthetic */ cqui a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xaj(Object[] objArr, cqui cquiVar) {
        super(objArr);
        this.a = cquiVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return new RippleDrawable(ibm.e().c(context), this.a.a(context), cqui.c(cquh.a(0), cquh.g(xan.a), cquh.f(ibm.b())).a(context));
    }
}
