package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: cqtx  reason: default package */
/* loaded from: classes.dex */
final class cqtx extends cqug {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqtx(Object[] objArr, int i) {
        super(objArr);
        this.a = i;
    }

    @Override // defpackage.cqug
    public final void a(Context context, GradientDrawable gradientDrawable) {
        gradientDrawable.setShape(this.a);
    }
}
