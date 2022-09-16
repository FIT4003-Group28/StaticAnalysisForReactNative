package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
/* compiled from: PG */
/* renamed from: cqst  reason: default package */
/* loaded from: classes5.dex */
final class cqst extends cqss {
    final /* synthetic */ cqss a;
    final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqst(Object[] objArr, cqss cqssVar, float f) {
        super(objArr);
        this.a = cqssVar;
        this.b = f;
    }

    private final int d(Context context) {
        int b = this.a.b(context);
        return (b & 16777215) | (((int) (this.b * (b >>> 24))) << 24);
    }

    @Override // defpackage.cqss
    public final int b(Context context) {
        return d(context);
    }

    @Override // defpackage.cqss
    public final ColorStateList c(Context context) {
        return ColorStateList.valueOf(d(context));
    }
}
