package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqts  reason: default package */
/* loaded from: classes5.dex */
final class cqts extends cqtd {
    final /* synthetic */ cqtd a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqtv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqts(Object[] objArr, cqtd cqtdVar, cqtv cqtvVar, cqtv cqtvVar2) {
        super(objArr);
        this.a = cqtdVar;
        this.b = cqtvVar;
        this.c = cqtvVar2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return cqlw.a(this.a.a(context), this.b.e(context), this.c.e(context));
    }
}
