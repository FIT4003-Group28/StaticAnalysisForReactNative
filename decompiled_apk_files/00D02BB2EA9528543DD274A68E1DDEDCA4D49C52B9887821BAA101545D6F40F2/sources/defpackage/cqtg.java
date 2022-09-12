package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqtg  reason: default package */
/* loaded from: classes5.dex */
final class cqtg extends cqtd {
    final /* synthetic */ cqtd a;
    final /* synthetic */ cqtv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqtg(Object[] objArr, cqtd cqtdVar, cqtv cqtvVar) {
        super(objArr);
        this.a = cqtdVar;
        this.b = cqtvVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        Drawable a = this.a.a(context);
        int e = this.b.e(context);
        return cqlw.a(a, e, cqlw.b(a.getIntrinsicWidth(), a.getIntrinsicHeight(), e));
    }
}
