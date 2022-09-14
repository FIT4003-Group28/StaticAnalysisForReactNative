package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: ius  reason: default package */
/* loaded from: classes6.dex */
final class ius extends cqtd {
    final /* synthetic */ cqtd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ius(Object[] objArr, cqtd cqtdVar) {
        super(objArr);
        this.a = cqtdVar;
    }

    @Override // defpackage.cqsj, defpackage.cqur
    public final boolean NJ() {
        return true;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        Drawable a = this.a.a(context);
        return bvox.b(context) ? new cqlv(a) : a;
    }
}
