package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
/* compiled from: PG */
/* renamed from: cqtr  reason: default package */
/* loaded from: classes5.dex */
final class cqtr extends cqtd {
    final /* synthetic */ cqtd a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqtr(Object[] objArr, cqtd cqtdVar, int i) {
        super(objArr);
        this.a = cqtdVar;
        this.b = i;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        ScaleDrawable scaleDrawable = new ScaleDrawable(this.a.a(context), 17, 1.0f, 1.0f);
        scaleDrawable.setLevel(this.b);
        return new cqtq(scaleDrawable);
    }
}
