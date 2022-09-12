package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqth  reason: default package */
/* loaded from: classes5.dex */
final class cqth extends cqtd {
    final /* synthetic */ cqtd a;
    final /* synthetic */ cqtv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqth(Object[] objArr, cqtd cqtdVar, cqtv cqtvVar) {
        super(objArr);
        this.a = cqtdVar;
        this.b = cqtvVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        Drawable a = this.a.a(context);
        int e = this.b.e(context);
        return cqlw.a(a, cqlw.b(a.getIntrinsicHeight(), a.getIntrinsicWidth(), e), e);
    }
}
