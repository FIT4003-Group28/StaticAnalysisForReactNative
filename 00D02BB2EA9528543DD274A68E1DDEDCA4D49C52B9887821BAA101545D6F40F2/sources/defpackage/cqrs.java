package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqrs  reason: default package */
/* loaded from: classes.dex */
public final class cqrs extends cqtd {
    final /* synthetic */ cqrt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqrs(Object[] objArr, cqrt cqrtVar) {
        super(objArr);
        this.a = cqrtVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return context.getDrawable(this.a.a);
    }
}
