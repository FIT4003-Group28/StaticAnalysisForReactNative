package defpackage;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqtj  reason: default package */
/* loaded from: classes5.dex */
public final class cqtj extends cqtd {
    final /* synthetic */ cqtd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqtj(Object[] objArr, cqtd cqtdVar) {
        super(objArr);
        this.a = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return new ClipDrawable(this.a.a(context), 3, 1);
    }
}
