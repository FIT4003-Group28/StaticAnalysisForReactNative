package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: arxi  reason: default package */
/* loaded from: classes2.dex */
final class arxi extends cqtd {
    final /* synthetic */ Drawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arxi(Object[] objArr, Drawable drawable) {
        super(objArr);
        this.a = drawable;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return this.a.mutate().getConstantState().newDrawable();
    }
}
