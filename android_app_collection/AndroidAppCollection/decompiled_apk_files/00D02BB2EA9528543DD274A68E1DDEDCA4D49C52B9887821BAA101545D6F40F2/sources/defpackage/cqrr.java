package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqrr  reason: default package */
/* loaded from: classes.dex */
public final class cqrr extends cqss {
    final /* synthetic */ cqrt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqrr(Object[] objArr, cqrt cqrtVar) {
        super(objArr);
        this.a = cqrtVar;
    }

    @Override // defpackage.cqss
    public final int b(Context context) {
        return akm.c(context, this.a.a);
    }

    @Override // defpackage.cqss
    public final ColorStateList c(Context context) {
        ColorStateList b = akm.b(context, this.a.a);
        return b == null ? context.getResources().getColorStateList(this.a.a) : b;
    }
}
