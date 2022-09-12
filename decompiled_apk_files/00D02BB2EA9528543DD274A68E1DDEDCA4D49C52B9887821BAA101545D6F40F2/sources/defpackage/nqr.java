package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
/* compiled from: PG */
/* renamed from: nqr  reason: default package */
/* loaded from: classes7.dex */
final class nqr extends cqtd {
    final /* synthetic */ cqss a;
    final /* synthetic */ cqtd b;
    final /* synthetic */ cqtd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqr(Object[] objArr, cqss cqssVar, cqtd cqtdVar, cqtd cqtdVar2) {
        super(objArr);
        this.a = cqssVar;
        this.b = cqtdVar;
        this.c = cqtdVar2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return new RippleDrawable(ColorStateList.valueOf(this.a.b(context)), this.b.a(context), this.c.a(context));
    }
}
