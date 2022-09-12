package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anck  reason: default package */
/* loaded from: classes2.dex */
public final class anck extends cqtd {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anck(Object[] objArr, int i) {
        super(objArr);
        this.a = i;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return ancv.bq(this.a, context);
    }
}
