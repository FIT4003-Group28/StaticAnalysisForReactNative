package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqtp  reason: default package */
/* loaded from: classes5.dex */
final class cqtp extends cqtd {
    final /* synthetic */ cqtd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqtp(Object[] objArr, cqtd cqtdVar) {
        super(objArr);
        this.a = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return new cqlv(this.a.a(context));
    }
}
