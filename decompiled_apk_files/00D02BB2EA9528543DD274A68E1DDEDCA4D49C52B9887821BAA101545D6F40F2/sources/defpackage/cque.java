package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: cque  reason: default package */
/* loaded from: classes.dex */
final class cque extends cqug {
    final /* synthetic */ cqtv a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqtv c;
    final /* synthetic */ cqtv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cque(Object[] objArr, cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqtv cqtvVar4) {
        super(objArr);
        this.a = cqtvVar;
        this.b = cqtvVar2;
        this.c = cqtvVar3;
        this.d = cqtvVar4;
    }

    @Override // defpackage.cqug
    public final void a(Context context, GradientDrawable gradientDrawable) {
        float a = this.a.a(context);
        float a2 = this.b.a(context);
        float a3 = this.c.a(context);
        float a4 = this.d.a(context);
        gradientDrawable.setCornerRadii(new float[]{a, a, a2, a2, a3, a3, a4, a4});
    }
}
