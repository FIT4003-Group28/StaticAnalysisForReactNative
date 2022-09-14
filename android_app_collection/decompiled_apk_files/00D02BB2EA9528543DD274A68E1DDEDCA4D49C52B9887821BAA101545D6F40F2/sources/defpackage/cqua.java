package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: cqua  reason: default package */
/* loaded from: classes5.dex */
final class cqua extends cqug {
    final /* synthetic */ GradientDrawable.Orientation a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqua(Object[] objArr, GradientDrawable.Orientation orientation) {
        super(objArr);
        this.a = orientation;
    }

    @Override // defpackage.cqug
    public final void a(Context context, GradientDrawable gradientDrawable) {
        gradientDrawable.setOrientation(this.a);
    }
}
